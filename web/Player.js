$(function () {
    var socket = null;

    $("#connectBtn").on("click", function () {
        socket = new WebSocket("ws://localhost:8080/UnoGame/player/"
                + $("#room").val());
        socket.onopen = function () {
            $("#uppercase-msg").text("connected");
        };
        socket.onmessage = function (evt) {
            var msg = JSON.parse(evt.data);
            var $li = $("<li>");
            
            if(msg.destination === $("#name").val()){
                if(msg.message === "give 1 card"){
                    $li.text("[" + msg.name + "] " + msg.message + ":" + msg.destination + " -> " + msg.cardId + ":" + msg.cardPicture);
                    $("#chats").prepend($li);
                }
            } else if(msg.destination === "all"){
                if(msg.message === "game start"){
                    $li.text("[" + msg.name + "] " + msg.message + ":" + msg.destination);
                    $("#chats").prepend($li);
                    specialMessage("need 7 card", "deck");
                } else {
                    $li.text("[" + msg.name + "] " + msg.message + ":" + msg.destination);
                    $("#chats").prepend($li);
                }
            } else {
                $li.text("[" + msg.name + "] " + msg.message + ":" + msg.destination);
                $("#chats").prepend($li);
            }
        };
    });

    $("#msgBtn").on("click", function () {
        var msg = {
            name: $("#name").val(),
            room: $("#room").val(),
            message: $("#msg").val(),
            destination : $("#dest").val()
        };
        socket.send(JSON.stringify(msg));
    });
    
    var specialMessage = function (message, dest) {
        var msg = {
            name: $("#name").val(),
            room: $("#room").val(),
            message: message,
            destination : dest
        };
        socket.send(JSON.stringify(msg));
    };
});

