
	
	
	import java.util.Scanner;

	public class Selection {
		
		    public static int[] selectionSort(int[] arr){  
		        for (int i = 0; i < arr.length - 1; i++)  
		        {  
		            int index = i;  
		            for (int j = i + 1; j < arr.length; j++){  
		                if (arr[j] < arr[index]){  
		                    index = j;//searching for lowest index  
		                }  
		            }  
		            int smallerNumber = arr[index];   
		            arr[index] = arr[i];  
		            arr[i] = smallerNumber;  
		        }
		        return arr;
		    }  
		       
		    public static void main(String a[]){  
		    	System.out.println("enter the size of array");
				Scanner scan=new Scanner(System.in);
				int n=scan.nextInt();
				
				int arr[]=new int[n];
				System.out.println("enter elements");
				
				for(int i=0;i<n;i++)
				{
					arr[i]=scan.nextInt();
				} 
		        System.out.println("Before Selection Sort");  
		        for(int i:arr){  
		            System.out.print(i+" ");  
		        }  
		        System.out.println();  
		          
		        selectionSort(arr);//sorting array using selection sort  
		         
		        System.out.println("After Selection Sort");  
		        for(int i:arr){  
		            System.out.print(i+" ");  
		        }  
		    }  
		}  



