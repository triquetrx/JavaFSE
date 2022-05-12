//WRITE YOUR jQUERY CODE HERE
$(document).ready(function(){
    $("#btn-id").on("click",function(){
        $.getJSON("https://reqres.in/api/users?page=2",function(result){
            $.each(result.data,function(values){
                $("#data-id").append("<ul><li>"+values.id+"--"+values.email+"</li></ul>")
            });
        });
    });
});