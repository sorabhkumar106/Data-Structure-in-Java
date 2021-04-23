public class Main {
	public static void main(String[] args) {
	int[] arr={1,2,3,5,6,3,6,3,3,9,95,84,65};
	Main.SelectionSort(arr);
	for(int t:arr){
	System.out.print(t+" ");	
		}	
	}
public static void SelectionSort(int[] arr){
for(int i=0;i<arr.length-1;i++){
	int index=i;
for(int j=i+1;j<arr.length-1;j++){
	if(arr[j]<arr[index]){
	index=j;				
				}	
if(index !=i){
int temp=arr[index];
arr[index]=arr[i];
arr[i]=temp;	
		}				
}			
}	
}
}