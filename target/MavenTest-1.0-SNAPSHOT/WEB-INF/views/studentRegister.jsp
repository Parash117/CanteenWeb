<%-- 
    Document   : staffRegister
    Created on : May 9, 2020, 1:45:09 AM
    Author     : Parash Gurung
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>SB Admin 2 - Register</title>

  <!-- Custom fonts for this template-->
  <link href="${pageContext.request.contextPath}/Resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="${pageContext.request.contextPath}/Resources/css/sb-admin-2.min.css" rel="stylesheet">

</head>

<body class="bg-gradient-primary">

  <div class="container">

    <div class="card o-hidden border-0 shadow-lg my-5">
      <div class="card-body p-0">
        <!-- Nested Row within Card Body -->
        <div class="row">
          <div class="col-lg-5 d-none d-lg-block bg-register-image"></div>
          <div class="col-lg-7">
            <div class="p-5">
              <div class="text-center">
                <h1 class="h4 text-gray-900 mb-4">Create an Account for Student!</h1>
              </div>
                <form class="user" name="staffForm" onsubmit="return validateForm()" action="registerStaff" method="post" >
                <div class="form-group row">
                  <div class="col-sm-6 mb-3 mb-sm-0">
                    <input type="text" class="form-control form-control-user" name="fname" id="exampleFirstName" placeholder="First Name">
                  </div>
                  <div class="col-sm-6">
                      <input type="text" class="form-control form-control-user" name="lname" id="exampleLastName" placeholder="Last Name">
                  </div>
                </div>
                    <div class="form-group">
                    <input type="text" class="form-control form-control-user" name="address" id="exampleInputEmail" placeholder="Address">
                </div>
                <div class="form-group">
                    <input type="email" class="form-control form-control-user" name="email" id="exampleInputEmail" placeholder="Email Address">
                </div>
                    
                <div class="form-group row">
                     <div class="col-sm-6 mb-3 mb-sm-0">
                         <h3>Date of Birth :</h3>
                     </div>
                    <div class="col-sm-6">
                        <input type="date" class="form-control form-control-user" name="dob" id="exampleInputEmail" >
                    </div>
                </div>
                    
                    <div class="form-group row">
                     <div class="col-sm-6 mb-3 mb-sm-0">
                         <h3>Date of Enroll :</h3>
                     </div>
                    <div class="col-sm-6">
                        <input type="date" class="form-control form-control-user" name="enrolldate" id="exampleInputEmail" >
                    </div>
                </div>
                    
                    <div class="form-groupv row">
                        <div class="col-sm-6 mb-3 mb-sm-0">
                        <input type="number" maxlength="10" class="form-control form-control-user" name="phoneno" id="exampleInputEmail" placeholder="Phone No.">
                        </div>
                        <div class="col-sm-6">
                            <Select name="course" class="form-control">
                                <option value="1"> BSc. CSIT</option>
                            </Select>
                        </div>
                    </div>
                <div class="form-group row">
                  <div class="col-sm-6 mb-3 mb-sm-0">
                      <input type="number" name="pin" class="form-control form-control-user" id="exampleInputPassword" placeholder="PIN">
                  </div>
                  <div class="col-sm-6">
                      <input type="text" name="uniqueKey" class="form-control form-control-user" id="exampleRepeatPassword" placeholder="Unique Key">
                  </div>
                </div>
                    <input type="submit" name="staffreg" value="REGISTER" class="btn btn-primary btn-user btn-block">
                  
                </a>
                <hr>
                
              </form>
              <hr>
              
            </div>
          </div>
        </div>
      </div>
    </div>

  </div>
    <script>
        function validateForm(){
            var fname = document.forms["staffForm"]["fname"].value;
            var lname = document.forms["staffForm"]["lname"].value;
            var address = document.forms["staffForm"]["address"].value;
            var phoneno = document.forms["staffForm"]["phone"].value;
            var pass = document.forms["staffForm"]["password"].value;
            var cpass = document.forms["staffForm"]["cpassword"].value;
            
            if (fname == "") {
              alert("Name must be filled out");
              return false;
            }
        }
    </script>
  <!-- Bootstrap core JavaScript-->
  <script src="${pageContext.request.contextPath}/Resources/vendor/jquery/jquery.min.js"></script>
  <script src="${pageContext.request.contextPath}/Resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
  <script src="${pageContext.request.contextPath}/Resources/vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Custom scripts for all pages-->
  <script src="${pageContext.request.contextPath}/Resources/js/sb-admin-2.min.js"></script>

</body>

</html>

