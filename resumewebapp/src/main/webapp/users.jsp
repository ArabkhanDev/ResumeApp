<%-- 
    Document   : user
    Created on : Dec 23, 2022, 3:31:32 PM
    Author     : SMART
--%>

<%@page import="com.mycompany.Main.Context"%>
<%@page import="com.mycompany.dao.inter.UserDaoInter"%>
<%@page import="com.company.entity.User"%>
<%@ page import="java.util.List" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head> <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <body>
        <% UserDaoInter userDao = Context.instanceUserDao();

        String name = request.getParameter("name");
        String surname = request.getParameter("surname");

        String nationalityStr = request.getParameter("nid");
        Integer nationalityId = null;
        if(nationalityStr!=null){
             nationalityId = Integer.parseInt(nationalityStr);
        }
        List<User> list = userDao.getAll(name, surname, nationalityId);
        %>

    <div>
        <form action="users.jsp" method="POST"> <input type="hidden" name="id" value=""/>
        <label for="name">34name:</label>
        <input type="text" name="name" value=""/> <br/>
        <label for="surname">surname:</label>
        <input type="text" name="name" value=""/>
        <input type="submit" name="sreearch" value="Search"/>
        </form>
    </div>
        <div>
             <table>
                 <thead>
                 <tr>
                     <th>name</th>
                     <th>surname</th>
                     <th>nationality</th>
                 </tr>>
                 </thead>>
                 <tbody>
                    <% for(User u: list){ %>
                    <tr>
                        <td><%=u.getName()%></td>
                        <td><%=u.getSurname()%></td>
                        <td><%=u.getNationality().getName()==null?"N/A":u.getNationality().getName()%></td>
                    </tr>>
                    <%}%>

                 </tbody>>
             </table>>
        </div>
</body>
</html>