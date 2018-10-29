<%--
  Created by IntelliJ IDEA.
  User: wode
  Date: 2018/10/27
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="statics/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
  var json={};
  json.mid="3";
  json.mname="呵呵";
  $(function () {
     $("button").click(function () {
        $.ajax({
           url:"test/seluser",
            data:JSON.stringify(json),
            contentType:"application/json",
            type:"post"
        });
     });
  });
</script>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
<button>点你娘的</button>
  </body>
</html>
