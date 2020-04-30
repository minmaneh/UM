public class Append{
	public static void main(String[]args){

	int[] a1 = {10, 20, 30, 40, 50, 60};
	int[] a2 = {91, 92, 93, 94, 95, 96};
	int[] newList1=append(a1,a2);
    
    for(int i=0;i<newList1.length;i++){
        System.out.println(newList1[i]);
    }

	}
	
	public static int[] append(int[] list1, int[] list2) {
    int[] newList = new int[list1.length + list2.length];
    int index = 0;
    
    for (int i = 0; i < list1.length; i++) {
        newList[index] = list1[i];
        index++;
    }
    
    for (int i = 0; i < list2.length; i++) {
        newList[index] = list2[i];
        index++;
    }
    
    return newList;
}
}