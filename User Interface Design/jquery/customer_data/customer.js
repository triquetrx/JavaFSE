$(document).ready(function(){
    $(".add-row").on('click',function(){
        $("table tbody").append("<tr><td><input type='checkbox' name='record'></td><td>"+$("input").val()+"</td></tr>")
    });
    $(".delete-row").on('click',function(){
        ($("input:checked").parent().parent().remove());
    });
});