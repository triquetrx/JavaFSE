//WRITE YOUR jQUERY CODE HERE

$(document).ready(function(){
    $("button").on('click',function(){
        $("div[name$='Intelligence']").css("background-color","yellow");
    })
});