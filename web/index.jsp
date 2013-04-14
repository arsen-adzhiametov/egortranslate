<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>Page</title>
    <link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
</head>
<body>
<p>Hello Bootstrap!</p>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
<script src="/bootstrap/js/bootstrap.min.js"></script>
Enter word
<form method="get" action="/trans/late">
    <input type="text" name="word">
    <button type="submit">Return wird!</button>
</form>
<br>
${wird}
</body>
</html>