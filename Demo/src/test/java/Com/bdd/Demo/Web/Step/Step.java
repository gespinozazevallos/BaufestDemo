package Com.bdd.Demo.Web.Step;

import Com.bdd.Demo.Web.Page.Page;

import java.io.IOException;

public class Step {

    Page pageDemo = new Page();

    public void IniciarWeb() throws Exception {
        pageDemo.IniciarWeb();
    }

    public void RegistrarUsuario() throws InterruptedException{
        pageDemo.RegistrarUsuario();
    }

    public void IniciarSesion() throws InterruptedException{
        pageDemo.IniciarSesion();
    }

    public void AgregarCarrito() throws InterruptedException, IOException{
        pageDemo.AgregarCarrito();
    }

    public void VerCarrito() throws Exception {
        pageDemo.VerCarrito();
    }

    public void CerrarSesion(){
        pageDemo.CerrarSesion();
    }

}