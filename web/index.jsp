<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>ЕгорТранслейт</title>
    <link rel="stylesheet" href="/bootstrap/css/bootstrap.css">
</head>
<body>
<div class="container">
<p><h1>ЕгорТранслейт</h1></p>
<script src="/bootstrap/js/bootstrap.js"></script>

    <form method="get" action="/trans/late">
        <legend>Егор Транслейт Системс</legend>
        <label>Введите слово</label>
        <input class="input-large" type="text" name="word" placeholder="русское слово...">
        <span class="help-block">Например, егор</span>
        <label class="checkbox">
            <input type="checkbox"> Похуй
        </label>
        <button type="submit" class="btn">Перевод</button>
    </form>
<br>
${wird}
</div>
</body>
</html>