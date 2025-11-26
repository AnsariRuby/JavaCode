package Basics;

public class If_Else_04 {
    public static void main(String[] args) {
        //  We often want certain blocks of code to execute only when specific conditions are met.

        // The if statement is the simplest decision-making statement.
        // It executes a block of code only if a given condition is true.

        /*{
            int i = 10;

            if (i < 15) {
                System.out.println("Condition is True");
            }
        }*/

        //  The if-else statement allows you to execute one block if the condition is true and another block if it is false.

        /*{
            int i = 10;

            if (i < 15) {
                System.out.println("i is smaller than 15");
            }else {
                System.out.println("i is greater than 15");
            }
        }*/

        // A nested-if is an if statement inside another if statement. It is useful when a second condition depends on the first.

        /*{
            int i = 10;

            if (i < 15) {
                System.out.println("i is smaller than 15");

                // nested if statement
                if (i == 10) {
                    System.out.println("i is exactly 10");
                }
            }
        }*/

        // The if-else-if ladder allows multiple independent conditions to be checked in order.
        // As soon as one condition is true, its block executes, and the rest are skipped.

       /* int i = 20;

        if (i == 10) {
            System.out.println("i is 10");
        }else if (i == 15) {
            System.out.println("i is 15");
        } else if (i == 20) {
            System.out.println("i is 20");
        }else {
            System.out.println("i is not present");
        }*/

        // Switch : The switch statement is a multiway branch statement.
        // It provides an easy way to dispatch execution to different parts of code based on the value of the expression.

        int num = 20;

        switch (num) {
            case 5:
                System.out.println("It is 5");
                break;
            case 10:
                System.out.println("It is 10");
                break;
            case 15:
                System.out.println("It is 15");
                break;
            case 20:
                System.out.println("It is 20");
                break;
            default:
                System.out.println("Not present");

        }

//          The ternary operator in Java is a conditional operator that provides a shorthand way to write simple if-else statements

        int a = 10, b = 20;

        int max = a > b ? a : b;
        System.out.println(max);


    }
}
