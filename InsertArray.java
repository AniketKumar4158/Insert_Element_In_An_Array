import java.util.Scanner;

public class InsertArray{

    private static void printArray(int [] arr, int limit){
        for (int i=0;i<limit;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    private static void printArrayTillLast(int [] arr, int limit){
        for (int i=0;i<=limit;i++){
            System.out.print(arr[i]+" ");
        }
          System.out.println();
    }

    private static int[] getArrayfromUser(int[] ar , int length){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter "+ length +" number of array");
        for(int i=0;i<length;i++){
            ar[i] = sc.nextInt();
        }
    return ar;
    }

    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        int[] arr= new int[20];
        System.out.println("Enter limit:");
        int limit= sc.nextInt();
        getArrayfromUser(arr,limit);
        System.out.println("Your Enter Array:");
        printArray(arr,limit);
        System.out.println("Do you want to do some inserting in array");
        System.out.println("Press 'Y' for yes or 'N' for no");
        char ch = sc.next().charAt(0);
        if((ch=='n') || (ch=='N')){
            System.out.println("Thank You Please Visit again!!");
            System.exit(0);
        }else{
            System.out.println("Press: ");
            System.out.println("1 for Traversal Array");
            System.out.println("2 for InsertValueAtBeginning");
            System.out.println("3 for InsertValueAtEnd");
            System.out.println("4 for insertvalueAtAnyPosition");
            System.out.println("5 for InsertValueInSortedArray");


            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch(choice){
                case 1: traversal(arr,limit);
                    break;

                case 2: insertArrayAtBeginning(arr,limit);
                    break;

                case 3: insertValueAtEnd(arr,limit);
                    break;
                case 4: insertvalueAtAnyPosition(arr,limit);
                    break;

                case 5: sortedArrayInsert(arr,limit);
                    break;

                default: System.out.println("Your are choice wrong number");
                    break;
            }

        }
    }
    private static void traversal(int [] arr,int limit){
        System.out.println("Your Traversal Array is:");
        printArray(arr,limit);
    }


    private static void insertArrayAtBeginning(int[] arr,int len){
        if(arr.length<=len){
            System.out.println("Sorry! I can't insert any more value in this array Because Given 'Array is full'");
            System.exit(0);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value you want to insert Here!!");
        int value=sc.nextInt();
        for(int i=len;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=value;
        printArrayTillLast(arr,len);

    }

     private static void insertValueAtEnd(int[] arr,int len){
        if(arr.length<=len){
            System.out.println("Sorry! I can't insert any more value in this array Because Given 'Array is full'");
            System.exit(0);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value you want to insert Here!!");
        int value=sc.nextInt();
        arr[len]=value;
        printArrayTillLast(arr,len);
        
    }
     private static void insertvalueAtAnyPosition(int[] arr,int len){
        if(arr.length<=len){
            System.out.println("Sorry! I can't insert any more value in this array Because Given 'Array is full'");
            System.exit(0);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value you want to insert Here!!");
        int value=sc.nextInt();
        System.out.println("Enter Position");
        int pos=sc.nextInt();
        for(int i=len;i>pos;i--){
            arr[i] =arr[i-1];
        }
        arr[pos]=value;
        printArrayTillLast(arr,len);

        
    }
    private static void sortedArrayInsert(int[] arr,int len){
        if(arr.length<=len){
            System.out.println("Sorry! I can't insert any more value in this array Because Given 'Array is full'");
            System.exit(0);
        }
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<+len;i++){
            for(int j=i+1;j<+len;j++){
                int temp =0;
                if(arr[i] >arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] =temp;
                }
            }
        }
            System.out.println("Yours Sorted Array are :");
            printArray(arr,len);
            System.out.println("Enter Valaue you Want to insert");
            int value= sc.nextInt();
            for(int i=0;i<len;i++){
                if(value< arr[i]){
                    for(int j= len-1;j>=i;j--){
                        arr[j+1] = arr[j];
                    }
                    arr[i]= value;
                    break;
                }
            }
            printArrayTillLast(arr,len);
               
    } 

}