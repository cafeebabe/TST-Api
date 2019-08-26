$('.findEmployee').click(function() {
    var usercode = $('.usercode').val();
    $.ajax({
        type : 'POST',
        dataType : 'json',
        url : '/findEmployees',
        data : {
            usercode : usercode
        },
        success : function(data) {
            console.log(data);

            if (data.reason == "成功的返回")
            {
                var table = $('.tableView');
                table.empty();
                table.append('<table><tr> <td>员工编号</td><td>用户名</td><td>部门</td></tr>');
                table.append('<tr>');
                table.append('<td>' + data.usercode + '</td>');
                table.append('<td>' + data.username + '</td>');
                table.append('<td>' + data.department + '</td>');
                table.append('</tr>');
                table.append('</table>');
            } else {
                var table = $('.tableView');
                table.empty();
                alert(data.reason);
            }

        },
        error : function(error) {
            console.log(error)

        }
    });
});