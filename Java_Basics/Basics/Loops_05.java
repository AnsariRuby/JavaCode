package Basics;

public class Loops_05 {
    static void main(String[] args) {
        // Loops in programming allow a set of instructions to run multiple times based on a condition.
        // In Java, there are three types of Loops, which are explained below:

        // for Loop : The for loop is used when we know the number of iterations (we know how many times we want to repeat a task).
        // The for statement includes the initialization, condition, and increment/decrement in one line.


        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        String[] names = {"Rubina", "Soohan", "Raza", "Rehana"};

        for (String name : names) {
            System.out.println("Name : " + name);
        }

        // While Loop : A while loop is used when we want to check the condition before executing the loop body.

        /*int i = 0;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }*/

        // do-while Loop : The do-while loop ensures that the code block executes at least once before checking the condition.

        /*int i = 10;
        do {
            System.out.print(i + " ");
            i++;
        }while (i <= 10);*/


        /*
        * for loop - When you want exact iterations
        * while loop - When you need condition check first.
        * do-while loop - When you need to run at least once
        * for-each loop - When you process all collection items
         * */


        // Continue Statement : The continue statement pushes the next repetition of the loop to take place,
        // skipping any code between itself and the conditional expression that controls the loop.

        for (int i = 1; i <= 10; i++) {
            if (i == 4 || i == 7) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // Break Statement : In Java, the break statement is used to terminate the execution of the nearest looping statement or switch statement.
        // The break statement is widely used with the switch statement, for loop, while loop, and do-while loop.

        // When a break statement is executed inside a loop, the loop is terminated, and the control reaches the statement that follows the loop.

        int n = 10;
        for (int i = 1; i <= n; i++) {
            if (i == 4) {
                break;
            }
            System.out.print(i + " ");
        }

        for (int i = 0; i < 3; i++) {
            One : {
                Two : {
                    Three : {
                        System.out.println("i = " + i);
                        if (i == 0) {
                            break One;
                        }
                        if (i == 1) {
                            break Two;
                        }
                        if (i == 2) {
                            break Three;
                        }
                    }
                    System.out.println("after label 3");
                }
                System.out.println("after label 2");
            }
            System.out.println("after label 1");
        }
    }
}
