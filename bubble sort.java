public class Main {
	public static void main(String[] args) {
	int[] arr={1,2,5,3,6,33,9,95,84,65};
	Main.SelectionSort(arr);
	for(int t:arr){
	System.out.print(t+" ");	
		}	
	}
public static void SelectionSort(int[] arr){
for(int i=0;i<arr.length-1;i++){
for(int j=0;j<arr.length-i-1;j++){
	if(arr[j+1]<arr[j]){
	Main.swap(arr,j+1,j);				
				}
			}
			}
			}	
static void swap(int[] arr,int index,int i){
int temp=arr[index];
arr[index]=arr[i];
arr[i]=temp;	
		}				
			
}