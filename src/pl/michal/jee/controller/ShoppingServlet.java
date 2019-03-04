package pl.michal.jee.controller;

import pl.michal.jee.model.Item;
import pl.michal.jee.service.PaymentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/buy")
public class ShoppingServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Item> items = createItemFromRequest(request);
        PaymentService.applyDiscount(items);
        double originalPrice = PaymentService.totalPrice(items);
        double discountPrice = PaymentService.totalPriceAfterDiscount(items);

        request.setAttribute("items", items);
        request.setAttribute("originalPrice", originalPrice);
        request.setAttribute("discountPrice", discountPrice);

        request.getRequestDispatcher("result.jsp").forward(request, response);

    }

    private List<Item> createItemFromRequest(HttpServletRequest request) {
        List<Item> items = new ArrayList<>();
        String item1 = request.getParameter("item1");
        double price1 = Double.valueOf(request.getParameter("price1"));
        String item2 = request.getParameter("item2");
        double price2 = Double.valueOf(request.getParameter("price2"));
        String item3 = request.getParameter("item3");
        double price3 = Double.valueOf(request.getParameter("price3"));

        items.add(new Item(item1, price1));
        items.add(new Item(item2, price2));
        items.add(new Item(item3, price3));


        return items;
    }

}
