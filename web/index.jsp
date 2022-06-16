<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 26640
  Date: 2022/6/14
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
 <c:if test="${person2==null}">
    <c:redirect url="/getAll2"></c:redirect>
  </c:if>

  <form action="/getAll2" method="name">
    部门名称:
    <select id="name" name="name">
      <option value="-1">全部</option>
      <c:forEach var="d" items="${depts}">
        <option value="${d.id}"> ${d.deptname}</option>
      </c:forEach>
    </select>
    <input type="submit" value="查询">
  </form>


  <body>
  <table>
    <tr>
      <td>编号</td>
      <td>姓名</td>
      <td>地址</td>
      <td>年龄</td>
      <td>部门编号</td>
    </tr>
    <c:forEach var="p" items="${person2}">
      <tr>
        <td>${p.id}</td>
        <td>${p.name}</td>
        <td>${p.address}</td>
        <td>${p.age}</td>
        <td>${p.dept_id}</td>
      </tr>
    </c:forEach>
  </table>
  </body>
</html>
