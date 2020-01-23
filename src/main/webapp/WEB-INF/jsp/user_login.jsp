<%@ include file="header.jsp" %>

<div classs="container">

 <div id="loginbox" style="margin-top: 50px;" class="mainbox col-md-4 col-md-offset-4 col-sm-8 col-sm-offset-2">

  <div class="panel panel-info">
  
   <div class="panel-heading">
     <div class="panel-title">Sign in</div>
   </div>  
   
   <div class="panel-body" style="padding-top: 30px">
      
      <form:form modelAttribute="user" method="post" class="form-horizontal">
        
        <div class="input-group" style="margin-botton: 25px"><span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>         
          <form:input path="username" type="text" class="from-control" placeholder="Username or email"/>
        </div>  
        <form:errors path="username" cssClass="text-danger"/>
        <div class="input-group" style="margin-botton: 25px"><span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>  
           <form:input path="password" type="password" class="from-control" placeholder="Enter Password"/>
        </div>
         
        <div style="margin-top: 10px" class="form-group" align='center'>  
            <div class="col-sm-12 controls">
              <form:button type='success' class="btn btn-success">Login</form:button> 
            </div>      
         </div>
      
      </form:form>
   </div>
   
</div>

</div>
 
</div>
</body>
</html>