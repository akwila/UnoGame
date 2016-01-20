$(function () {
    var socket = null;

    $("#connectBtn").on("click", function () {
        document.getElementById("mess").style.display = "block";
        socket = new WebSocket("ws://localhost:8080/UnoGame/game/"
                + $("#room").val());
        socket.onopen = function () {
            $("#uppercase-msg").text("connected");
        };
        socket.onmessage = function (evt) {
            var msg = JSON.parse(evt.data);
            var $li = $("<li>");
            $li.text("[" + msg.name + "] " + msg.message + ":" + msg.destination);
            $("#chats").prepend($li);
            if(msg.destination === "deck"){
                if(msg.message === "need 1 card"){
                    specialMessage("give 1 card", msg.name);
                }
                if(msg.message === "need 7 card"){
                    specialMessage("give 1 card", msg.name);
                    specialMessage("give 1 card", msg.name);
                    specialMessage("give 1 card", msg.name);
                    specialMessage("give 1 card", msg.name);
                    specialMessage("give 1 card", msg.name);
                    specialMessage("give 1 card", msg.name);
                    specialMessage("give 1 card", msg.name);
                }
            }
        };
    });

    $("#msgBtn").on("click", function () {
        var msg = {
            name: "deck",
            room: $("#room").val(),
            message: $("#msg").val(),
            destination : $("#dest").val()
        };
        socket.send(JSON.stringify(msg));
    });
    
    var specialMessage = function (message, dest) {
        var msg = {
            name: "deck",
            room: $("#room").val(),
            message: message,
            destination : dest
        };
        socket.send(JSON.stringify(msg));
    };
});

