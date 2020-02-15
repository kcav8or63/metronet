<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<style>
    h1 {
        font: 25px bold arial, sans-serif;
    }

    form {
        font: italic bold 12px/30px Georgia, serif;
    }
</style>
<head>
    <meta charset="UTF-8">
    <title>Team Introduction</title>
</head>
<body>
<center>
    <h1>
        Introduce yourself!
    </h1>
    <form method="post" action="EnterData">
        <br>
        <c:if test="${empty name && empty funFact}">
            <table border="0">
                <tr>
                    <td>Name:</td>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <td>Fun fact about yourself:</td>
                    <td><input type="text" name="funFact"></td>
                </tr>
            </table>
            <br><br>
            <input type="submit" value="Submit">
            <input type="reset" value="Reset">
        </c:if>
        <c:if test="${not empty name }">
            Welcome <c:out value="${name}"/>!
            <br>
            <input type="submit" value="Introduce New Team Member">
        </c:if>
        <c:if test="${not empty error}">
            <br><br>
            <c:out value="${error}"/>
        </c:if>
    </form>
</center>


</body>
</html>
