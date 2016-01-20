<%-- 
    Document   : gamelist
    Created on : Jan 18, 2016, 1:13:03 PM
    Author     : tobenothing
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="lib/jquery-2.2.0.js"></script>
        <script src="Player.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <ul>
            <c:forEach var = "ga" items="${unoGames.games}" >
                <li id="${ga.gameName}" class="gameList" onclick="connGame(${ga.gameName})">
                    <div >
                        <span>${ga.gameName}</span><br/>
                        Join Player: ${ga.playerList.size()}<br/>
                        Max Number:${ga.maxPlayer}<br/>
                        Game Description:${ga.gameDescription}<br/>
                    </div>

                </li>

            </c:forEach>
        </ul>
    </body>
</html>
