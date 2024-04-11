#language:es
  Característica: agregar productos a carrito de compra exitosamente
    yo como usuario quiero ingresar a la pagina demoblaze
    para agregar productos al carrito de forma exitosa

@inscripcion
Escenario: Registro exitoso
Dado que darwin quiere abrir la pagina
  Entonces se registra con usuario javy y clave 123456 exitosamente

@inicioDeSesionExitoso
    Escenario: Inicio de sesion exitoso
      Dado que darwin quiere iniciar sesion en la pagina de demoblaze
      Cuando ingresa un usuario darwin17 y una clave 1234567 existentes
      Entonces el sistema debe habilitar el boton de Welcome darwin17

  @inicioDeSesioConUsuarioInexistente
  Escenario: Inicio De Sesio Con Usuario Inexistente
    Dado que darwin quiere iniciar sesion con usuario inexistente
    Entonces ingresa usuario camilo25 y clave 1234

    @agregarProductoEnCategoriaTelefonos
    Escenario: Agregar Producto En Categoria Telefonos
      Dado que darwin quiere iniciar sesion en la pagina de demoblaze
      Cuando ingresa un usuario darwin17 y una clave 1234567 existentes
      Y esta en la pagina principal agrega un producto de la categoria telefonos

      @agregarProductoEnCategoriaPortatiles
      Escenario: Agregar Producto En Categoria Portatiles
        Dado que darwin quiere iniciar sesion en la pagina de demoblaze
        Cuando ingresa un usuario darwin17 y una clave 1234567 existentes
        Y esta en la pagina principal agrega un producto de la categoria portatiles

    @agregarProductoEnCategoriaMonitores
    Escenario: Agregar Producto En Categoria Monitores
      Dado que darwin quiere iniciar sesion en la pagina de demoblaze
      Cuando ingresa un usuario darwin17 y una clave 1234567 existentes
      Y esta en la pagina principal agrega un producto de la categoria monitores



