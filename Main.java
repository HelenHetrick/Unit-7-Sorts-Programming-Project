import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

class Main{
  public static void main (String str[]) throws IOException {
    int[] elements = {21, 17, 60, 20, 56, 12};
    //Selection Sort

    System.out.println();

    System.out.println("Printing the original array");
      for(int x: elements)
        {
              System.out.print(x+ " ");
        }
System.out.println();

        System.out.print("\nPrinting Each Pass Through the Selection Sort");

    for (int j = 0; j < elements.length -1; j++)
    {
      int minIndex = j;
      for (int k = j + 1; k < elements.length; k++)
      {
        if (elements[k] < elements[minIndex])
        {
          minIndex = k;
        }
      }
      int temp = elements[j];
      elements[j] = elements[minIndex];
      elements[minIndex] = temp;

                //Printing each run
          System.out.println();
                  for(int y: elements)
        {
              System.out.print(y+ " ");
        }

    }
    
    System.out.println();
    for (int num : elements)
    {
      System.out.print(+num+ " ");
    }

//Insertion Sort

    
int[] elements2 = {21, 17, 60, 20, 56, 12};
    System.out.println();
    System.out.println();

    System.out.println("\nPrinting the original array");
      for(int xz: elements2)
        {
              System.out.print(xz+ " ");
        }
    System.out.println();

        System.out.print("\nPrinting Each Pass Through the Insertion Sort");
    
    for (int j = 1; j < elements2.length; j++)
    {
      int temp = elements2[j];
      int possibleIndex = j;
      while (possibleIndex > 0 && temp < elements2[possibleIndex - 1])
      {
        elements2[possibleIndex] = elements2[possibleIndex - 1];
        possibleIndex--;
        
      }
      elements2[possibleIndex] = temp;
      //Printing each run
          System.out.println();
                  for(int y: elements2)
        {
              System.out.print(y+ " ");
        }

    }
System.out.println();
    for (int num : elements2)
    {
      System.out.print(num+" ");
    }


//Doing the Sorting thing but with an array of strings

    //Creating String Arrays
    String[] str1 = {"orange", "kiwi", "apple", "banana", "pineapple"};
    String[] str2 = {"lettuce", "corn", "pea", "carrot", "kale"};


    // Using first array in selection sort
//printing original
    System.out.println();
    System.out.println();

    System.out.println("\nFirst String Array - Printing the original array");
      for(String x: str1)
        {
              System.out.print(x+ " ");
        }
        System.out.println();

        System.out.print("\nPrinting Each Pass Through the Selection Sort");

//implementing sort
  
for (int j = 0; j < str1.length -1; j++)
    {
      int minIndex = j;
      for (int k = j + 1; k < str1.length; k++)
      {
        if ((str1[k]).compareTo(str1[minIndex])<0)
        {
          minIndex = k;
        }
        
      }
      String temp = str1[j];
      str1[j] = str1[minIndex];
      str1[minIndex] = temp;

                //Printing each run
          System.out.println();
                  for(String y: str1)
        {
              System.out.print(y+ " ");
        }

    }   



    //Insertion with String array
    System.out.println();
    System.out.println();

                      System.out.println("\nSecond String Array - Printing the original array");
      for(String q: str2)
        {
              System.out.print(q+ " ");
        }
    System.out.println();

        System.out.print("\nPrinting Each Pass Through the Insertion Sort");
    
    for (int j = 1; j < str2.length; j++)
    {
      String temp = str2[j];
      int possibleIndex = j;
      while (possibleIndex > 0 && temp.compareTo(str2[possibleIndex - 1])<0)
      {
        str2[possibleIndex] = str2[possibleIndex - 1];
        possibleIndex--;
        
      }
      str2[possibleIndex] = temp;
      //Printing each run
          System.out.println();
                  for(String qy: str2)
        {
              System.out.print(qy+ " ");
        }

    }




    //Doing everything with array lists
ArrayList<Integer> numbers1=new ArrayList<Integer>();
numbers1.add(21);
numbers1.add(17);
numbers1.add(60);
numbers1.add(20);
numbers1.add(56);
numbers1.add(12);

    //Selection Sort
    System.out.println();
    System.out.println();

    System.out.println("First Integer ArrayList - Printing the original");
      for(int p: numbers1)
        {
              System.out.print(p+ " ");
        }
    System.out.println();

        System.out.print("\nPrinting Each Pass Through the Selection Sort");

    for (int j = 0; j < numbers1.size() -1; j++)
    {
      int minIndex = j;
      for (int k = j + 1; k < numbers1.size(); k++)
      {
        if (numbers1.get(k) < numbers1.get(minIndex))
        {
          minIndex = k;
        }
      }
      int temp = numbers1.get(j);
      numbers1.set(j, numbers1.get(minIndex));
     // elements[j] = elements[minIndex];
      numbers1.set(minIndex, temp);
     // elements[minIndex] = temp;

                //Printing each run
          System.out.println();
                  for(int o: numbers1)
        {
              System.out.print(o+ " ");
        }

    }


// ArrayList of integers but using the Insertion Sort

ArrayList<Integer> numbers2=new ArrayList<Integer>();
numbers2.add(21);
numbers2.add(17);
numbers2.add(60);
numbers2.add(20);
numbers2.add(56);
numbers2.add(12);

    System.out.println();
    System.out.println();

    System.out.println("\nSecond Integer ArrayList - Printing the original array");
      for(int oz: numbers2)
        {
              System.out.print(oz+ " ");
        }
    System.out.println();

        System.out.print("\nPrinting Each Pass Through the Insertion Sort");
    
    for (int j = 1; j < numbers2.size(); j++)
    {
      int temp = numbers2.get(j);
      int possibleIndex = j;
      while (possibleIndex > 0 && temp < numbers2.get(possibleIndex - 1))
      {
        numbers2.set(possibleIndex, numbers2.get(possibleIndex-1));
        //elements2[possibleIndex] = elements2[possibleIndex - 1];
        possibleIndex--;
        
      }
      numbers2.set(possibleIndex, temp);
     // elements2[possibleIndex] = temp;
      //Printing each run
          System.out.println();
                  for(int op: numbers2)
        {
              System.out.print(op+ " ");
        }

    }


//Slection and Insrtion with String Array Lists

//Selection
ArrayList<String> string1=new ArrayList<String>();
string1.add("orange");
string1.add("kiwi");
string1.add("apple");
string1.add("banana");
string1.add("pineapple");

    // Using first array in selection sort
//printing original
    System.out.println();
    System.out.println();

    System.out.println("\nFirst String ArrayList - Printing the original array");
      for(String n: string1)
        {
              System.out.print(n+ " ");
        }
        System.out.println();

        System.out.print("\nPrinting Each Pass Through the Selection Sort");

//implementing sort
  
for (int j = 0; j < string1.size() -1; j++)
    {
      int minIndex = j;
      for (int k = j + 1; k < string1.size(); k++)
      {
        if ((string1.get(k)).compareTo(string1.get(minIndex))<0)
        {
          minIndex = k;
        }
        
      }
      String temp = string1.get(j);
      //String temp = str1[j];
      string1.set(j, string1.get(minIndex));
     // str1[j] = str1[minIndex];
      string1.set(minIndex, temp);
     // str1[minIndex] = temp;

                //Printing each run
          System.out.println();
                  for(String ny: string1)
        {
              System.out.print(ny+ " ");
        }

    }   


//Insertion
ArrayList<String> string2=new ArrayList<String>();
string2.add("lettuce");
string2.add("corn");
string2.add("pea");
string2.add("carrot");
string2.add("kale");


    System.out.println();
    System.out.println();

                      System.out.println("\nSecond String ArrayList - Printing the original array");
      for(String qg: string2)
        {
              System.out.print(qg+ " ");
        }
    System.out.println();

        System.out.print("\nPrinting Each Pass Through the Insertion Sort");
    
    for (int j = 1; j < string2.size(); j++)
    {
      String temp = string2.get(j);
      int possibleIndex = j;
      while (possibleIndex > 0 && temp.compareTo(string2.get(possibleIndex - 1))<0)
      {
        string2.set(possibleIndex, string2.get(possibleIndex-1));
       // str2[possibleIndex] = str2[possibleIndex - 1];
        possibleIndex--;
        
      }
      string2.set(possibleIndex, temp);
      //str2[possibleIndex] = temp;
      //Printing each run
          System.out.println();
                  for(String ly: string2)
        {
              System.out.print(ly+ " ");
        }

    }



    
  }
}


