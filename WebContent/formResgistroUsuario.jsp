<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
    <html lang="en">
    
            <head>
    
                    <meta charset="UTF-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <meta http-equiv="X-UA-Compatible" content="ie=edge">
                    <title>Blog</title>
                    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
                     crossorigin="anonymous">
                    <link rel="stylesheet" href="proyecto_posts.css">
                    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">
                  	
                    <script>
                        
    
    
    
    
                    </script>
                  </head>
    <body style="background:rgb(24, 22, 22)">
        
    
    
        <div class="container">
                <h1 style="text-align:center;font-family:Impact, Haettenschweiler, 'Arial Narrow Bold', sans-serif;color:rgb(207, 202, 157);font-size:4em;">Formulario de registro:</h1>
                <form action="GuardarUsuario" method="post" style="margin:20px;">
                        <div class="form-row">
                           
                            <div class="col-9" style="margin:auto;color:rgb(238, 84, 84);">
                            <div class="form-group">
                                
                              <div class="col4"></div>
                              
                             
                                Nombre
                                <label for="exampleInputEmail1"></label>
                                <input type="text" class="form-control" name="nombre" placeholder="Escribe aqui.." style="background:rgb(240, 236, 236);" required autofocus>
                                Apellido
                                <label for="exampleInputEmail1"></label>
                                <input type="text" class="form-control" name="apellido" placeholder="Escribe aqui.." style="background:rgb(240, 236, 236);" required>
                              </div>  
                            </div>
                            <div class="col-5" style="margin:auto;color:rgb(238, 84, 84);">
                                    <div class="form-group">
                                            Usuario
                                            <label for="exampleInputPassword1"></label>
                                            <input type="text" class="form-control" name="nombre_usuario" placeholder="Escribe aqui.." style="background:rgb(240, 236, 236);" required>
                                            Contraseña
                                            <label for="exampleInputPassword1"></label>
                                            <input type="password" class="form-control" name="contrasena" placeholder="Escribe aqui.." style="background:rgb(240, 236, 236);" required>
                                        </div>
                    
                    
                        </div>
                       </div>
        
                           <div class="form-row">
        
                            <div class="col-6">
                            <div class="form-group">
                                    <label for="exampleInputPassword1" style="color:rgb(238, 84, 84);">Email</label>
                                    <input type="text" class="form-control" name="email" placeholder="Escribe aqui.." style="background:rgb(240, 236, 236);" required>
                                </div>
                                </div>
                             <!--    <div class="col-6">
                                <div class="form-group">
                                    <label for="exampleInputPassword1" style="color:rgb(238, 84, 84);">Telefono</label>
                                    <input type="text" class="form-control" name="telefono" pattern="6*[0-9]{8}" placeholder="Escribe aqui.." style="background:rgb(240, 236, 236);" required>
                                </div>
                                </div> -->
                            </div>
        
                            <div class="form-row">
                                <!-- <div class="col-3">
                                <div class="form-group text-center" style="background:rgb(240, 236, 236);" required>
                                        <label for="exampleInputPassword1" style="color:rgb(238, 84, 84);">Sexo</label>
                                        <br>
                                        <input type="radio" name="gender" value="Male">Hombre
                                        <br>
                                        <input type="radio" name="gender" value="Female">Mujer
                                        <br>
                                        <input type="radio" name="gender" value="Other">Otro
                                        <br>
                                    </div>
                                </div> -->
        
                               <div class="col-3" style="margin:auto;color:rgb(238, 84, 84);">
                       <div class="form-group">Fecha de nacimiento
                             <label for="fecha_nac"></label>
                                <input type="date" name="fecha_nac" class="form-control" min="2001/01/28" placeholder="Escribe aqui.." required>
                        </div>
                        </div>
                             <div class="col-3" style="margin:auto;color:rgb(238, 84, 84);">
                       <div class="form-group">Fecha de registro
                             <label for="fecha_reg"></label>
                                <input type="date" class="form-control" min="2001/01/28" placeholder="Escribe aqui.." required name="fecha_reg">
                        </div>
                        </div>
                                <!--<div class="col-3" style="margin:auto;color:rgb(238, 84, 84);">
                                    Provincia
                                    <select id="provincia" class="custom-select" required>
                                            <option selected>Selecciona provincia</option>
                                            <option value="bizkaia">Bizkaia</option>
                                            <option value="gipuzkoa">Gipuzkoa</option>
                                            <option value="araba">Araba</option>
                                          </select>
                                        </div>
                                    <div class="col-3" style="margin:auto;color:rgb(238, 84, 84);">Poblacion
                                     <select id="poblacion" class="custom-select" required>
                                                <option selected>Selecciona poblacion</option>
                                                <option class="bizkaia" value="Gernika-Lumo">Gernika-Lumo</option>
                                                <option class="bizkaia" value="Amorebieta">Amorebieta</option>
                                                <option class="gipuzkoa" value="San-Sebastian">San-Sebastian</option>
                                                <option class="gipuzkoa" value="Irun">Irun</option>
                                                <option class="araba" value="Vitoria">Vitoria</option>
                                                <option class="araba" value="Labastida">Labastida</option>
                                    </select>
                                </div>-->
                            </div>
                            
                           
                            <div class="col-12 text-center">
        			
                            <div class="form-group form-check">
                                <input type="checkbox" class="form-check-input">
                                <label class="form-check-label" for="exampleCheck1" onclick="" style="color:rgb(207, 202, 157);">Aceptas las condiciones</label>
                            </div>
                        
                                <button type="submit" id="guardar" class="btn btn-primary" style="margin-bottom:20px;">Registrarse</button>
                            </div>
                            </form>
    
        </div>
    
            <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
            <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
            <script src="nirejs.js"></script>
    </body>
    </html>