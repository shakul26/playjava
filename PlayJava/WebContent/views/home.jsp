<%@ page isELIgnored="false"  %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  
<%@ include file = "designconfig.jsp" %>
<%@ include file = "header.jsp" %>
</head>


<body ng-app="">
  
<div class="container-fluid text-center">    
  <div class="row content">
  
    <%@ include file = "leftnav.jsp" %>
    
    
    <div class="col-sm-8 text-left"> 
      <h1>Author Module</h1>
      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
      <hr>
      <h3>Test</h3>
      <p>Lorem ipsum...</p>
    </div>

	<%@ include file = "rightnav.jsp" %>

  </div>
</div>

<%@ include file = "footer.jsp" %>

</body>
</html>
