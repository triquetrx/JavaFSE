$(document).ready(function(){
    $("#btn-id").on("click",function(){
        $.ajax("employee.json",{
            error: function(data,status,xhr){
                $("#err-id").append("Error Message: Not found")
            }
        })

    });
});