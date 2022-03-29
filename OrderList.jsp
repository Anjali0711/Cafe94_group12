<%@ page import="java.sql.*" %>  

<%
if(session.getAttribute("login")!=null) //check login session user not access or back to index.jsp page
{
	response.sendRedirect("welcome.jsp");
}
%>

<%
try
{
	Class.forName("com.mysql.jdbc.Driver"); //load driver
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbuser","root",""); //create connection
	

		String dbcustomerid;
		
		String customer_id;
		
		customer_id=session.getParameter("id"); //txt_email
		
		
		PreparedStatement pstmt=null; //create statement
		
		pstmt=con.prepareStatement("select * from orderslist where customer_id=?"); //sql select query 
		pstmt.setString(1,email);
		pstmt.setString(2,password);
		
		ResultSet rs=pstmt.executeQuery(); //execute query and store in resultset object rs.
		
		if(rs.next())
		{
			dbcustomerid=rs.getString("id");
			
		}
		else
		{
			request.setAttribute("errorMsg","invalid email or password"); //invalid error message for email or password wrong
		}
		
		con.close(); //close connection	
	}
	

catch(Exception e)
{
	out.println(e);
}
%>

