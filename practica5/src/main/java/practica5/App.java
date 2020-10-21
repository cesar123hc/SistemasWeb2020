package practica5;


import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        port(2020);
        get("/" ,(req, res)->"hola desde spark");
        get("/hola" ,(req, res)->"hola desde hola spark");
        get("/adios" ,(req, res)->"hola desde adios spark");
    }
}
