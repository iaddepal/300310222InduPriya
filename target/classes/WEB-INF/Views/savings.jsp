<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Savings Investment Record</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

    <style>
        h1 {
            text-align:center;
            background-color: cyan;

        }

        .btn {

            width: 100%;
        }


    </style>
</head>
<body>
<h1>The following are the savings records...</h1>
<script>
    document.getElementById("mes").innerHTML = "";
</script>


<div class="container">

    <form method="GET">
        <div class="form-group">
            <label for="custno">Customer Number :</label>
            <input type="text" name="custno" class="form-control" id="custno" value="${desc}">
        </div>
        <div class="form-group">
            <label for="custname">Customer Name :</label>
            <input type="text" name="custname" class="form-control" id="custname" value="${desc}">
        </div>

        <div class="form-group">
            <label for="cdep">Customer Deposit :</label>
            <input type="text" name="cdep" class="form-control" id="cdep" value="${desc}">
        </div>

        <div class="form-group">
            <label for="nyears">Number Of Years :</label>
            <input type="text" name="nyears" class="form-control" id="nyears" value="${id}">
        </div>

        <div class="form-group">
            <label for="savtype">Savings Type:</label>
            <input type="text" name="savtype" class="form-control" id="savtype" value="${desc}">
        </div>



        <a class="btn btn-success" href="add-todo">Add</a>



    </form>

    <h1 id="mes">${errorMessage}</h1>
    <div class="container2">
        <h2>Savings</h2>

        <table class="table table-striped">
            <thead>
            <tr>
                <th>Customer number</th>
                <th>Customer Name</th>
                <th>Customer Deposit</th>
                <th>Number Of years</th>
                <th>Savings Type</th>
            </tr>
            </thead>
            <tbody>

            <c:forEach items="${todos}" var="todo">



                <tr>


                    <td>${todo.custno}</td>
                    <td>${todo.custname}</td>
                    <td>${todo.cdep}</td>
                    <td>${todo.nyears}</td>
                    <td>${todo.savtype}</td>

                    <td>    <a type="button" class="btn btn-primary"
                               href="update-todo?id=${todo.custno}" >Edit</a> </td>



                    <td>    <a type="button" class="btn btn-primary"
                               href="delete-todo?id=${todo.custno}" >Delete</a> </td>



                    <td>    <a type="button" class="btn btn-primary" onmouseout="myFunction()"
                               href="see-todo?id=${todo.custno}" >Projected Investment</a> </td>


                </tr>


            </c:forEach>
            </tbody>
        </table>
    </div>

</div>

<script>

    function myFunction() {

        document.getElementById("mes").innerHTML = "";
    }

</script>

</body>
</html>