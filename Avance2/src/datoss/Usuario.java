package datoss;

import java.util.Scanner;

public class Usuario {

    Scanner teclado = new Scanner(System.in);
    String usu = "Administrador";
    String pass = "1234";

    public String usuario() {
        System.out.println("Ingrese el nombre de usuario");
        String usuario = teclado.nextLine();

        if (usu.equals(usuario)) {
            System.out.println("Usuario ingresado correctamente");
            System.out.println("Ingrese la contrasenaa por favor");
            String contrasena = teclado.nextLine();

            if (pass.equals(contrasena)) {
                System.out.println("Contrasena ingresada correctamente");
                System.out.println("Sesion iniciada");
            } else {
                System.out.println("ContraseÃ±a ingresada incorrecta, ingrese datos nuevamente.");
                usuario();
            }

        } else {
            System.out.println("Usuario ingresado incorrecto, intente nuevamente.");
            usuario();
        }
        return usu;

    }

}
