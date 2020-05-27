window.onload=function () {
    var hobby=new Array("读书","音乐","舞蹈","锤人","打游戏","学习","敲代码");
    $.ajax({
        typt:"post",
        url:"queryPerson",
        dataType:"json",
        success:function (data) {
            $(".table_node").empty()
            $.each(data,function (index,n) {
                var aid=data[index].id;
                var rowTr=document.createElement('tr')
                rowTr.className="tr_node"
                var child=
                    "<td>"+parseInt(data[index].id) +"</td>"
                    + "<td>"+data[index].name + "</td>"
                    + "<td>"+data[index].sex + "</td>"
                    + "<td>"+hobby[parseInt(data[index].hobby)] + "</td>"
                    + "<td>"+data[index].createtime + "</td>"
                    + "<td>"+data[index].none + "</td>"
                    +'<td colspan="2" align="center">'+"<a href=delete?aid=" +data[index].id+">"+"删除"+'</a>'+'</td>'
                rowTr.innerHTML=child
                $(".table_node").append(rowTr)
            });
        }
    });

}
