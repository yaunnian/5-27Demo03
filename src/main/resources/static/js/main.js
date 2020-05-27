$(function () {
    var hobby=new Array("读书","音乐","舞蹈","锤人","打游戏","学习","敲代码");
    var hobbyname=new Array();
    var amount=new Array();
    $.ajax({
        type:"post",
        dataType:"json",
        url:"/data",
        success:function (data) {
            for (var i=0;i<data.length;i++){
                amount[i]=parseFloat(data[i].sum);
                hobbyname[i]=hobby[i];
            };

            var opntions1={
                chart:{
                    type:'column'
                },
                title:{
                    text:'用户爱好表'
                },
                xAxis: {
                    title: {
                        text: '用户爱好'
                    },
                    categories: hobbyname
                },
                yAxis:{
                    title:{
                        text:'用户数量'
                    }
                },
                series:[
                    {
                        name:"数量",
                        data:amount
                    }
                ]
            };
            var opntions2={
                chart:{
                    type:'pie'
                },
                title:{
                    text:'用户爱好'
                },
                series:[{
                    name:"数据占比",
                    data: [
                        [hobbyname[0],amount[0]],
                        [hobbyname[1],amount[1]],
                        [hobbyname[2],amount[2]],
                        [hobbyname[3],amount[3]],
                        [hobbyname[4],amount[4]],
                        [hobbyname[5],amount[5]],
                        [hobbyname[6],amount[6]]
                    ]
                }]
            };
            var opntions3={
                chart:{
                    type:'spline'
                },
                title:{
                    text:'用户爱好'
                },
                xAxis:{
                    title: {
                        text: '用户爱好'
                    },
                    categories: hobbyname
                },
                yAxis:{
                  title:{
                      text:'数量'
                  }
                },
                series:[{
                    name:"数量",
                    data:
                        amount
                }]
            };
            $("#d1").highcharts(opntions1);
            $("#d2").highcharts(opntions2);
            $("#d3").highcharts(opntions3);
        }
    });

})