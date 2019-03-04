<%@ page import="pl.michal.jee.model.Item" %>
<%@ page import="java.util.List" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Result</title>
    </head>
    <body>
        <h1> Shop</h1>
        <h2>Shop list: </h2>

        <ol>
            <%
                List<Item> cart = (List<Item>) request.getAttribute("items");
                for (Item item : cart) {
            %>
            <li>
                <%=
                String.format("%s, Original price: %.2f, Discount price: %.2f",
                        item.getProduct(), item.getOriginalPrice(), item.getDiscountPrice())
                %>
            </li>
            <%
                }
            %>
        </ol>
        <h2>Sum: <%= request.getAttribute("originalPrice") %>
        </h2>
        <h2>Suma after discounts: <%= request.getAttribute("discountPrice") %>
        </h2>
        <h2></h2>
    </body>
</html>
