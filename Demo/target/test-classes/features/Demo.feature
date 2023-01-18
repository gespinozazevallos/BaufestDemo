Feature: Ingresar a la web DemoBlaze y dar de alta a un usuario, iniciar sesión y cerrar sesión, también agregar una laptop al carrito de compras y validar
  si el carrito tiene el producto agregado

  Como usuario de la web Demoblaze
  Quiero dar de alta a un usuario
  Para iniciar sesión y agregar una laptop al carrito de compras


  @Test1
  Scenario: Ingresar a la web Demoblaze
    Given el usuario ingresa a la web Demoblaze
    When registro un nuevo usuario
    And inicio sesión con el usuario nuevo
    And agrego una laptop al carrito de compras
    And reviso el carrito de compras para ver la laptop agregada
    Then cierro la sesión del usuario creado
