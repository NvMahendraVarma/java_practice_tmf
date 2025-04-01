<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Transaction List</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h1>Transaction List</h1>
    
    <!-- Table to display transactions -->
    <table>
        <thead>
            <tr>
                <th>Transaction ID</th>
                <th>Amount</th>
                <th>Transaction Date</th>
            </tr>
        </thead>
        <tbody>
            <!-- Iterate over the transactions list and display each transaction -->
            <c:forEach var="txn" items="${transactions}">
                <tr>
                    <td>${txn.txnId}</td>
                    <td>${txn.amount}</td>
                    <td>${txn.txnDate}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

</body>
</html>
