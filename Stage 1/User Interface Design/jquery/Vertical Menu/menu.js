$(document).ready(function(){
    $("#each_ex").on("click",function(){
        $("div #list").find("li").children("a").css("background-color","red");
        $("ul li a").each(function(i,element){
            $("#msg_ex").append(element.text+"<br>");
        });
    });
});