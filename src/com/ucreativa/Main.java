package com.ucreativa;

import com.ucreativa.contact.Company;
import com.ucreativa.contact.Contact;
import com.ucreativa.contact.Person;
import com.ucreativa.products.Product;
import com.ucreativa.projects.Project;
import com.ucreativa.sales.Category;
import com.ucreativa.sales.Invoice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static Category category;
    private static Company company;
    private static Person person;
    private static Project project;
    private static Product product;
    private static Invoice invoice;

    public static void main(String [] args){
        //Carga de datos
        Main.loadData();

        //Métodos toString()
        Main.printToStrings();

        //Valores de instancias
        Main.printInstancesValues();

        //Métodos implementados de la interfaz
        Main.printInterfaceMethods();

        //Ejemplo polimorfismo
        Main.showPolymorphismSample();

        //Cambio de datos
        Main.changeTestData();
    }

    public static void loadData(){
        Map<Project, Product> projectsByItem = new HashMap<>();
        List<Product> products = new ArrayList<Product>();
        company = new Company(1, "Hotel Presidente", "Av. Central, Catedral", "promesahotelera@promesa.com",
                "San José", "11801", "San José", "Costa Rica", 87754017,
                87754017, "Promesa SA", "http://www.hotel-presidente.com", null,
                "", 0, null, null, null);

        person = new Person(1, "Juan", "Av. Central, Catedral", "juan123@promesa.com",
                "San José", "11801", "San José", "Costa Rica", 88888888,
                88888888, null, "http://www.hotel-presidente.com", null,
                "", 0,  company, "Supervisor", null, null, null);

        project = new Project(1, "Atraccón extrangera", "Azul", "", null, "En progreso",
                "public", "01/01/2021", "30/12/2021", true, true,
                "ATE", false, person, null);

        product = new Product(1, "Queso", "Palmito", 200000, 26000, 226000,
                1, 1, 123, 2, 100,
                person, 3000,390);

        category = new Category(1, "Lácteos");

        products.add(product);
        projectsByItem.put(project, product);

        product = new Product(2, "Leche", "0% grasa", 50000, 6500, 56500,
                2, 2, 1234, 2, 100,
                person, 800,100);

        products.add(product);
        projectsByItem.put(project, product);

         invoice = new Invoice(person, "1", "01/03/2021", "01/04/2021", null, products,
                "Se habían acabado los lácteos", null, category, "Pagar pronto", null,
                projectsByItem, true);
    }

    public static void printToStrings(){
        System.out.println("============================ to string methods  =========================================");
        System.out.println(company.toString());
        System.out.println(person.toString());
        System.out.println(project.toString());
        System.out.println(product.toString());
        System.out.println(category.toString());
        System.out.println(invoice.toString());
        System.out.println("============================ End to string methods  ===================================\n");
    }

    public static void printInstancesValues(){
        System.out.println("============================ Instances Values ===========================================");
        System.out.println("Compañía asociada a una persona: " + person.getCompany().getName());
        System.out.println("Persona asociada a un proyecto: " + project.getContact().getName());
        System.out.println("Proveedor del productor: " + product.getProvider().getName());
        System.out.println("Categoría de la factura: " + invoice.getCategory().getName());
        System.out.println("Productos en la factura:");
        for (int i = 0; i <  invoice.getProducts().size(); i++) {
            System.out.println("\t*" + invoice.getProducts().get(i).getName());
        }
        System.out.println("============================ End InstancesValues ======================================\n");
    }

    public static void printInterfaceMethods(){
        System.out.println("============================ Interface methods ==========================================");
        person.LogIn();
        person.LogOut();
        person.ResetPassword();
        System.out.println("============================ End Interface methods =====================================\n");
    }

    public static void showPolymorphismSample(){
        System.out.println("============================ Polymorphism Sample ========================================");
        Contact contactPerson =  new Person(1, "Juana", "Av. Central, Catedral", "juan123@promesa.com",
                "San José", "11801", "San José", "Costa Rica", 88888888,
                88888888, null, "http://www.hotel-presidente.com", null,
                "", 0,  null, "Supervisor", null, null, null);

        Contact contactCompany = new Company(1, "Hotel Presidente 2", "Av. Central, Catedral", "promesahotelera@promesa.com",
                "San José", "11801", "San José", "Costa Rica", 87754017,
                87754017, "Promesa SA", "http://www.hotel-presidente.com", null,
                "", 0, null, null, null);

        contactPerson.identifyContactType();
        contactCompany.identifyContactType();
        System.out.println("============================ End Polymorphism Sample ==================================\n");
    }

    public static void changeTestData(){
        System.out.println("============================ Test data sample ===========================================");
        System.out.println("City before updating the value " + person.getCity());
        person.setCity("Heredia");
        System.out.println("City after the update " + person.getCity());
        System.out.println("============================ End  Test data sample ====================================\n");
    }
}
