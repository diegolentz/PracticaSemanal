<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Loguear</title>
  </head>
  <body>
    <form class="col-9 mt-3">
        <div class="row mx-2 col-12">
          <label for="inputEmail3" class="col-2 col-form-label">Usuario</label>
          <div class="col-6 mx-2">
            <input type="email" class="form-control" id="inputEmail3">
          </div>
        </div class="col-9">
        <div class="row mb-1 mt-1 mx-2 col-12" >
          <label for="inputPassword3" class="col-sm-2 col-form-label">Clave</label>
          <div class="col-6 mx-2">
            <input type="password" class="form-control" id="inputPassword3">
          </div>
        </div>
        <fieldset class="row mx-1">
         <legend class="col-form-label col-sm-2 pt-0">Eres nuevo?</legend>
          <div class="col-sm-10">
            <div class="form-check mx-1">
              <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios1" value="option1" checked>
               <label class="form-check-label" for="gridRadios1">
                  validar credenciales
               </label>
            </div>
               <div class="form-check mx-1">
              <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios2" value="option2">
                <label class="form-check-label" for="gridRadios2">
                Create una cuenta crack!
                </label>
            </div>
   
    </div>
        <button type="submit" class="btn btn-primary col-2 me-1">Enviar</button>
      </form>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
  </body>
</html>