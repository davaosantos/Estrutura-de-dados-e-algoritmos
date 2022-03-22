/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenacaoInsertionSort;

/**
 *
 * @author david.aosantos1
 */
public class Exmp_03InsertSort {

    public static void main(String[] args) {
        Person[] persons = new Person[]{
            new Person("Lourenço", "Wilson", 23),
            new Person("Avelar", "João", 25),
            new Person("Antonia", "Maria", 26),
            new Person("Duarte", "Felipe", 27)};
        System.out.println("Objeto desordenado:\n");
        for (Person p : persons) {
            System.out.println(p);
        }
        insertionSort(persons);
        System.out.println("\nApós a ordenação:\n");
        for (Person p : persons) {
            System.out.println(p);
        }
    }

public static void insertionSort(Person[] persons) {
        int in, out;
        for (out = 1; out < persons.length; out++) {
            Person temp = persons[out];
            in = out;
            while (in > 0 && persons[in - 1].getFirst().compareTo(temp.getFirst()) > 0) {
                persons[in] = persons[in - 1];
                --in;
            }
            persons[in] = temp;
        }
    }
}

class Person {

    private String lastName;
    private String firstName;
    private int age;
    
    public Person(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public String toString() {
        return  " Sobrenome: " + lastName + " Nome: " + firstName + " Idade: " + age;
    }

    public String getLast() {
        return lastName;
    }
    
    public String getFirst(){
        return firstName;
    }
}
