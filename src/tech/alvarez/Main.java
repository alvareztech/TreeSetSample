package tech.alvarez;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Contacto c1 = new Contacto("Daniel", 77665544, "daniel@ejemplo.com");
        Contacto c2 = new Contacto("Ximena", 66448822, "ximena@ejemplo.com");
        Contacto c3 = new Contacto("Juan", 88552277, "juan@ejemplo.com");
        Contacto c4 = new Contacto("Katherine", 77110022, "katy@ejemplo.com");
        Contacto c5 = new Contacto("Pedro", 66111100, "pedro@ejemplo.com");
        Contacto c6 = new Contacto("Katherine", 77110022, "katy@ejemplo.com");

        TreeSet<Contacto> contactos = new TreeSet<Contacto>();
        contactos.add(c1);
        contactos.add(c2);
        contactos.add(c3);
        contactos.add(c4);
        contactos.add(c5);
        contactos.add(c6);

        mostrar(contactos);

        contactos.remove(c4);
        mostrar(contactos);
    }

    private static void mostrar(TreeSet<Contacto> contactos) {
        System.out.println("CONTACTOS");
        Iterator<Contacto> iterador = contactos.iterator();
        while (iterador.hasNext()) {
            Contacto c = iterador.next();
            System.out.println(" " + c.getNombre() + "\t" + c.getTelefono() + "\t" + c.getCorreo());
        }
    }
}
