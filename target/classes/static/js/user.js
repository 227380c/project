/* <![CDATA[ */
             
	//alert("test");
	var pageable = [[${pageable}]];
	var userpage = [[${userpage}]];
	var totalNumber = Number(userpage.totalElements);
    var pageSize = Number(pageable.pageSize);
    var pageCount = Number(userpage.totalPages);
	alert("总数据条数："+totalNumber+"-每页条数："+pageSize+"-总页数："+pageCount);
    var html = '<li><a href=\"'+'/listPage?pageNum=1\">首页</a></li>';
    var link_Url0 = "";
    for(var i = 1;i <= pageCount;i++){
      var link_Url = '<li><a href=\"'+'/listPage?pageNum='+i+'\">'+i+'</a></li>';
      //var link_Url = "<li><a href=\'"+"/listPage?pageNum="+i+"\'>"+i+"</a></li>";
      html += link_Url;
      link_Url0 += '<option value='+i+'>'+i+'</option>';
    }
    
    if(pageCount>=3){
  	  var link_Url2 = '<li><a>跳到第<select onchange="toAnyPage()">'+link_Url0+'</select>页</a></li>';
  	  html += link_Url2;
    }      
    var link_Url3 = '<li><a>总页数:'+pageCount+'</a></li>'+'<li><a>总数据量:'+totalNumber+'</a></li>';
    html += link_Url3;
    alert(html);
    $("#link").html(html);
    
    /* 跳到第几页 */
    function toAnyPage() {
    	var pageNum=$("select").val();
		$.get("/listPage?pageNum=" + pageNum,function(data){
			if("success" == data.result){
				alert("删除成功");
				window.location.reload();
			}else{
				alert("删除失败");
			}
		});
    }
    
 /* ]]> */