<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List, com.example.Transaction" %>
<!DOCTYPE html>
<html>
<head>
    <title>Home</title>
</head>
<body>
    <h1>Transaction Details</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Date</th>
            <th>Amount</th>
            <th>Customer ID</th>
            <th>Payment Method</th>
        </tr>
        <%
            List<Transaction> transactions = (List<Transaction>) request.getAttribute("transactions");
            if (transactions != null) {
                for (Transaction transaction : transactions) {
        %>
                    <tr>
                        <td><%= transaction.getTransactionId() %></td>
                        <td><%= transaction.getTransactionDate() %></td>
                        <td><%= transaction.getAmount() %></td>
                        <td><%= transaction.getCustomerId() %></td>
                        <td><%= transaction.getPaymentMethod() %></td>
                    </tr>
        <%
                }
            }
        %>
    </table>
    <div>
        <%
            int currentPage = (int) request.getAttribute("currentPage");
            int totalPages = (int) request.getAttribute("totalPages");

            if (currentPage > 1) {
        %>
                <a href="home?page=<%= currentPage - 1 %>">Previous</a>
        <%
            }
            if (currentPage < totalPages) {
        %>
                <a href="home?page=<%= currentPage + 1 %>">Next</a>
        <%
            }
        %>
    </div>
</body>
</html>