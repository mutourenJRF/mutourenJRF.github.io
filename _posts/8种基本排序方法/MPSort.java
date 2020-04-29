/**
 * 冒泡排序
 */
public class MPSort {

    public static void main(String[] args){
        int[] arr=new int[]{1,3,5,2,4,8,6,7};
        sort(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }

    public static void sort(int[] arr){
        int tmp=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
    }

}
