
public class arrayDemo {
	
	// finding the minimum and maximum value
	public void minmax(int suriya[],int length) {
		int min=suriya[0];
		int max=suriya[0];
		for(int i=0;i<length;i++) {
			if(min>suriya[i]) {
				min=suriya[i];
			}
			if(max<suriya[i]) {
				max=suriya[i];
			}
		}
		System.out.println("the minimum value in the array is: "+min);
		System.out.println("the minimum value in the array is: "+max);
	}
	//reversing the array
	public void reversearray(int suriya[],int length) {
		int count=length-1;
		int temp;
		for(int i=0;i<count;i++) {
			temp=suriya[i];
			suriya[i]=suriya[count];
			suriya[count]=temp;
			count--;
		}
		System.out.print("the reversed array is ");
		
	    for(int i=0;i<length;i++) {
			System.out.print(" "+suriya[i]);
		}
		
		
	}
	
	//sorting a array
	public void sortarray(int[] suriya,int length) {
		
		int temp;
		for(int j=0;j<length-1;j++) {
			boolean isSwapped=false;
		for(int i=0;i<length-1-j;i++) {
			if(suriya[i]>suriya[i+1]){
				temp=suriya[i];
				suriya[i]=suriya[i+1];
				suriya[i+1]=temp;
				isSwapped=true;
			}
		}
		}
		System.out.print("the sorted array is");
		for(int i=0;i<length;i++) {
			System.out.print(" "+suriya[i]);
		}
	}
	public void ktimes(int[] suriya,int length,int k1,int k2) {
		System.out.println("the "+k1+"nd smallest element is : "+suriya[k1-1]);
		System.out.println("the "+k2+"nd largest element is : "+suriya[length-k2]);
}
	
	public void occur(int[] suriya,int length,int oc) {
		int count=0;
		for(int i=0;i<length-1;i++) {
			if(suriya[i]==oc) {
				count++;
			}
		}
		System.out.println("the element "+oc+" ocurred in the array for "+count+" times");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayDemo al=new arrayDemo();
		int[] suriya= {3,102,4,1,101,5,56,101,23,75,11};
		al.minmax(suriya,suriya.length);
		al.reversearray(suriya,suriya.length);
		System.out.println("");
		al.sortarray(suriya,suriya.length);
		System.out.println("");
		al.ktimes(suriya,suriya.length,2,3);
		al.occur(suriya,suriya.length,101);
		}
}
