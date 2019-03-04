<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Shop online</title>
    </head>
    <body>
        <h1>Welcome</h1>
        <h2>Please put item's names and prices to calculate total price.</h2>
        <div>
            <p> Discounts: </p>
            <li> -10% for adidas's products</li>
            <li> -20% for shopping list above 500 pln</li>
            <br>
        </div>

        <form action="buy" method="post">
            <input name="item1" placeholder="Product 1">
            <input name="price1" placeholder="Price ">
            <br>
            <input name="item2" placeholder="Product 2">
            <input name="price2" placeholder="Price ">
            <br>
            <input name="item3" placeholder="Product 3">
            <input name="price3" placeholder="Price ">
            <br>
            <input type="submit" value="Calculate">
        </form>

    </body>
</html>
