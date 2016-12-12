package controllers;

import java.util.List;

import models.Cliente;
import play.mvc.*;
import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

       public Result index() {
    	   List<Cliente> computadoras=Cliente.listadoClientes();
    	   
        return ok(index.render(Cliente.listadoClientes()));
    }

}
