<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Page</title>
</head>
<body>
Enter word
<form method="get" action="/trans/late" enctype="multipart/form-data; charset=UTF-8">
    <input type="text" name="word">
    <button type="submit">Return wird!</button>
</form>
<br>
${wird}
</body>
</html>