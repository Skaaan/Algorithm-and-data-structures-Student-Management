 /*
 * This Java source file was generated by the Gradle 'init' task.
 */

 /*
  * Laboreinheit: Algorithmen und Datenstrukturen – Aufgabenblatt 1
  * @author Skander Ayari
  * @Matricule number : 579140
  *  created at 31.05.2021
  */

package Myapp;

 public class App {
     public static void main(String[] args) {

         // Output of CommandList
         System.out.println("""
                 Console-Application: Exercise-3 <Skander> <Ayari> <Matrikelnummer>
                   1. Push student to stack.
                   2. Pop student from stack.
                   3. Peek student.
                   4. Is stack empty.
                   5. Clear stack.
                   6. Print all students from stack.
                   7. Returns size of stack.
                   0. Exit.
                 Please enter a number for an option:
                 """);
         Commands.main();
     }
 }