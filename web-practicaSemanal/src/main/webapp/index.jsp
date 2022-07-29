<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ejercicio-semanal-24062022</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">


  </head>
<body style="line-height: 2;">
  <header class="conteiner-fluid bg-info d-flex justify-content-center">
    <p class="text-light mt-3 p-3 fs-3">Contactenos (011) 3895 5422</p>
  </header>
  <main>
    <section style="background-color:aliceblue;" >
      <div class="container-fluid">
        <div class="row w-100 px-4 ">
          <div class="col-6">  
              <h1> Bienvenido, consulte lista de articulos </h1>    
          </div>
          <form action="<%=request.getContextPath()%>/controllers/Menu" method="GET">
	          <div class="col-2 m">
	            <div class="dropdown mt-2.7 p-3 fs-5">
	                <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-expanded="true">
	                  Menu
	                </button>
	                  <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
	                    <li><a class="dropdown-item" href="/web-practicaSemanal/listado.jsp" >Mostrar articulos</a></li>
	                    <li><a class="dropdown-item" href="/web-practicaSemanal/loguear.jsp">Loguear</a></li>
	                  </ul>
	            </div>
	          </div>
          </form>    
        </div>  
      </div>
    </section>
    <section>
      <div id="carouselExampleControls" class="carousel slide" data-bs-interval="3000">
        <div class="carousel-inner">
          <div class="carousel-item active" data-bs-interval="1000">
            <img src="./img.webp" class="d-block w-100" alt="slide1">
          </div>
          <div class="carousel-item" data-bs-interval="1000">
            <img src="./img.webp" class="d-block w-100" alt="slide2">
          </div>
          <div class="carousel-item" data-bs-interval="1000">
            <img src="./img.webp" class="d-block w-100" alt="slide3">
          </div>
        </div>
        <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
          <span class="carousel-control-prev-icon" aria-hidden="true"></span>
          <span class="visually-hidden">Previous</span>
        </button>
        <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
          <span class="carousel-control-next-icon" aria-hidden="true"></span>
          <span class="visually-hidden">Next</span>
        </button>
      </div>
    </section>
    <section style="background-color:bisque;" >
      <div class="container-fluid">  
            <div class="row w-100 px-0">
            <small class="nav-footer-copyright">Copyright ©&nbsp;1999-2022</small>
          </div>
          <div>
           <small class="nav-footer-copyright">Educacion IT</small>
          </div>
          <div>  
           <span>¡Descargá gratis la app!</span>
          </div>
        </div>
    </section>
  </main>

  
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
  </body>
</html>