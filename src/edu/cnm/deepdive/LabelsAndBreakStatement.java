package edu.cnm.deepdive;

public class LabelsAndBreakStatement {

  public static void main(String[] args) {

    //labels are not considered being good practice but sometimes they can come in handy.
    //Labels can be added inside a code block within the curly braces, all looping statements, conditional
    //statements, expressions, assignments, return statements, try blocks and throw statements.

    myLabel:
    {
      int[] myArray = {1, 2, 3};//myArray label is only available within this block so we cannot
      //use it anywhere else. So not good practice.
    }

    String[] animals = {"Dog", "Cat", "Lizard", "Bird", "Snake"};

    for (String animal : animals) {
      System.out.println(animal);
    }

    MY_LOOP: for (String animal : animals) {
      if (animal.equals("Cat")) {
        break MY_LOOP;//break label is optional
      }
      System.out.println();
      System.out.println(animal);
    }

    animal: for (String animal : animals) {
      if (animal.equals("Cat")) {//pretty confusing that our local variable is called animal and our
        //label as well. Not good practice but legal.
            break animal;
      }
      System.out.println();
      System.out.println(animal);
      System.out.println();
    }

    for (String animal : animals) {
      if (animal.equals("Lizard")) {
        break;//works just as well without a label.
      }
      System.out.println(animal);
    }

    System.out.println();

    int index = 0;
    while (index < animals.length) {
      String animal = animals[index];

      if (animal.equals("Lizard")) {
        break;
      }

      System.out.println(animal);
      index++;

    }

  }

}
