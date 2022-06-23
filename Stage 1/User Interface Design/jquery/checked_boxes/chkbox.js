//WRITE YOUR jQUERY CODE HERE

$(document).ready(function(){
    $("input").on('click',function(){
        var i = $("input:checked").length;
        if(i===1){
            $("#result").text(i+" box is checked");
        }
        else{
            $("#result").text(i+" boxes are checked");
        }
    })
})