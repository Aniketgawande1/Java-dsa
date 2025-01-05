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
//arrays is call by referrence work

//linear search
public static int linearSearch(int numbers[],int key){
    for(int i = 0 ; i <numbers.length;i++){
        if (numbers [i] == key){
            return i;
        }
    }
    return -1;

}

public static int binarySearch(int numbers[], int key){
    int start = 0, end = numbers.length-1;

    while(start <= end ){
        int mid = (start +end ) / 2;
        if(numbers[mid] == key ){
            return mid;

        }
        if (numbers[mid]<key) {
            start = mid +1;

        }else {
            end = mid-1; 
        }
    }
    return -1;
}
// Rerverse an array 

public static void reverse(int numbers[]){
    int first = 0, last = numbers.length-1;
}

// pairs  in an array

public static void ptintpairs(int num[]){
    for (int i = 0; i<num.length; i++){
        int current = num[i];//2,4,,6,8,10
        for (int j=i+1; j<num.length; j++){
            System.out.print("(" +current +","+ num[j] + ")");
            
        }
        System.out.println();
    }
}

public static void main(String[] args) {
    int num[] = {2, 4, 6 , 8, 10};
    ptintpairs(num);

        int numbers[] ={ 2,4,6,8,10,12,14,16};
        int key = 12;
        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("NOT FOUND");
            
        } else{
            System.out.println("Key is at index "+ index);
        }
        System.out.println("index for key is :" + binarySearch(numbers, key));

        //creating an array

    //      int numbers[] = {1 ,2, 6 , 3 , 5};
    //      System.out.println("largest value is :"+ getLargest(numbers));
    //     int marks [] ={97, 98 ,99};
    //     int nonChangable = 5;
    //     update(marks, nonChangable);

    //     //print our marks
    //     for(int i = 0; i<marks.length;i++){
    //         System.out.print(marks[i]+" ");
    //     }
    //     System.out.println();
     }
    
}
