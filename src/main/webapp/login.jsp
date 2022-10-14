<!DOCTYPE html>
<html>
<head>
    <title>TODO supply a title</title>
    <meta charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
<div align="center">
    <h1>User Register Form</h1>
<form action="<%=request.getContextPath()%>/users.jsp" method="post">
    <table>
        <tr>
            <th>UserName:</th>
            <th><input tupe="text" name="username"/></th>
        </tr>
        <tr>
            <th>Password:</th>
            <th><input tupe="password" name="password"/></th>
        </tr>
        <tr>
            <th></th>
        </tr>
    </table>
    <input type="submit" value="Submit"/>
</form>
</div>
</body>
</html>
