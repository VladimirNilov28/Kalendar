/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalendar;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Kalendar {
    private static String [] color = {"Белого/Белой","Белого/Белой", "Синего/Синей","Синего/Синей", "Зеленого/Зеленой","Зеленого/Зеленой",
                                    "Красного/Красной","Красного/Красной", "Желтого/Желтой","Желтого/Желтой"};
                                    
    private static String [] animalsName = {"обезьяны", "петуха", "собаки", "свиньи", "крысы", "быка",
                                            "тигра", "кролика", "дракона", "змеи", "лошади", "овцы"};
 
    private static String getChainNameOfYear(int yearNumber) {
        return color[yearNumber % color.length] + " " + animalsName[yearNumber % animalsName.length];
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Китайский календарь");
        System.out.print("Введите год: ");
        int year = scanner.nextInt();
        System.out.println(getChainNameOfYear(year));
    }
}
