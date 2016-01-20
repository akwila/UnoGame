<%-- 
    Document   : Player
    Created on : Jan 19, 2016, 5:24:43 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="lib/jquery-2.2.0.js"></script>
	<script src="Player.js"></script>
    </head>
    <body>
        Name: 
        <input type="text" id="name" size="30" readonly="readonly" value="${player.playerId}"><br>

        Game Room: 
        <input type="text" id="room" size="30">
        <button type="button" id="connectBtn">Connect</button>
        <br><br>

        Target: 
        <input type="text" id="dest" size="30">
        <br>
        
        Text: 
        <input type="text" id="msg" size="30">
        <button type="button" id="msgBtn">Send</button>

        <br>
        <ul id="chats">
        </ul>
    </body>
</html>
