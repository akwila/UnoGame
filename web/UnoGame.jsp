<%-- 
    Document   : UnoGame
    Created on : Jan 19, 2016, 3:13:06 PM
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
        <script src="UnoGame.js"></script>
    </head>
    <body>
        <h3>Uno Game</h3>  
        <table>
            <tr>
                <td>Game Room Name :</td>
                <td><input type="text" name="room" id="room" readonly="readonly" value="${game.gameId}"></td>
            </tr>
            <tr>
                <td>Max Player :</td>
                <td><input type="text" name="maxPlayer" id="maxPlayer" readonly="readonly" value="${game.maxPlayer}"></td>
            </tr>
            <tr>
                <td>Round Limit :</td>
                <td><input type="text" name="roundLimit" id="roundLimit" readonly="readonly" value="${game.roundLimit}"></td>
            </tr>
        </table>
        <button type="button" id="connectBtn">Connect to Server</button>

        <br><br>
        <div id="mess" style="display:none;">
            Target: 
            <input type="text" id="dest" size="30">
            <br>

            Text: 
            <input type="text" id="msg" size="30">
            <button type="button" id="msgBtn">Send</button>

            <br>
            <ul id="chats">
            </ul>
        </div>
    </body>
</html>
