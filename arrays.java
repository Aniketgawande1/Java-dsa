import java.util.*;
public class arrays {
    //list of elements od the same type palced in acontiguous memory laocation
    //aray store countinous process 
    //each string is  a 1 byte
    
    /*int marlks[] = new int [59];
    int number []= {1,2,3};
    int moreNumber[] = {4 , 5 , 6 };
    String fruits[] = { "apple"," mango" ,"banana"};*/

 public static void update(int marks[], int nonChangable){
    nonChangable = 10 ;
    for(int i = 0 ; i< marks.length; i++){
        marks[i] = marks[i]+1;
    }
 }
 public static int getLargest(int numbers[]){
    int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;

    for(int  i = 0; i<numbers.length; i++){
        if(largest <numbers[i]){
            largest = numbers[i];
        }
        if (smallest > numbers[i]) {
            smallest = numbers[i];
            
        }
    }
    System.out.println("smallest value is :" + smallest);
      return largest;
}
    public static void main(String[] args) {
        //creating an array

         int numbers[] = {1 ,2, 6 , 3 , 5};
         System.out.println("largest value is :"+ getLargest(numbers));
        int marks [] ={97, 98 ,99};
        int nonChangable = 5;
        update(marks, nonChangable);

        //print our marks
        for(int i = 0; i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
    
}
