package Com.bdd.Demo.Web.StepDefinition;

import Com.bdd.Demo.Web.Step.Step;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

public class StepDefinition {

    Step stepDemo = new Step();

    @Given("^el usuario ingresa a la web Demoblaze$")
    public void el_usuario_ingresa_a_la_web_Demoblaze() throws Throwable {
        stepDemo.IniciarWeb();
    }

    @When("^registro un nuevo usuario$")
    public void registro_un_nuevo_usuario() throws Throwable {
        stepDemo.RegistrarUsuario();
    }

    @When("^inicio sesión con el usuario nuevo$")
    public void inicio_sesión_con_el_usuario_nuevo() throws Throwable {
        stepDemo.IniciarSesion();
    }

    @When("^agrego una laptop al carrito de compras$")
    public void agrego_una_laptop_al_carrito_de_compras() throws Throwable {
        stepDemo.AgregarCarrito();
    }

    @When("^reviso el carrito de compras para ver la laptop agregada$")
    public void reviso_el_carrito_de_compras_para_ver_la_laptop_agregada() throws Throwable {
        stepDemo.VerCarrito();
    }

    @Then("^cierro la sesión del usuario creado$")
    public void cierro_la_sesión_del_usuario_creado() throws Throwable {
        stepDemo.CerrarSesion();
    }
}
