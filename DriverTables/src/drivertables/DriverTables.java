/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drivertables;

/**
 *
 * @author fansari
 */
public class DriverTables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TableBSTBased<City, String> table = new TableBSTBased<City, String>();
        City c = new City("Narragansett", "USA", 12000);
        table.tableInsert(c);
        System.out.println(table.tableLength());
        System.out.println(table.tableDelete("Narragansett"));
        System.out.println(table.tableLength());
        c = new City("OC, NC", "USA", 769);
        table.tableInsert(c);
        System.out.println(table.tableRetrieve("Narragansett"));
        displayCity(c);

    }

    public static void displayCity(City c) {
        System.out.println(c.getKey());
    }

}
