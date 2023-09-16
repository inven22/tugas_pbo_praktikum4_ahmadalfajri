/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipin;

/**
 *
 * @author ahmad al fajri
 */
public class Item {

    private String name;

    private Item() {
    this("Ipin"); // Memanggil konstruktor parameterized dengan nilai default
}

    public Item(String name) {
    this.name = name;
    System.out.println(this.name);
}
}
