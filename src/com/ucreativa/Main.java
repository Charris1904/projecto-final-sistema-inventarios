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
        Main.loadData();

        System.out.println(company.toString());
        System.out.println(person.toString());
        System.out.println(project.toString());
        System.out.println(product.toString());
        System.out.println(category.toString());
        System.out.println(invoice.toString());
    }

    public static void loadData(){
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

        List<Product> products = new ArrayList<Product>();
        products.add(product);

        Map<Project, Product> projectsByItem = new HashMap<>();
        projectsByItem.put(project, product);

         invoice = new Invoice(person, "1", "01/03/2021", "01/04/2021", null, products,
                "Se había acabado el queso", null, category, "Pagar pronto", null,
                projectsByItem, true);
    }
}
