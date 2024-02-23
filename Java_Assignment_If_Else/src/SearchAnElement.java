import java.util.Scanner;

public class SearchAnElement {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));
        System.out.print("Please enter a number : ");
        int x = input.nextInt();
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int ans = Find_Element(arr,x);

        System.out.println(ans);

    }

    public static int Find_Element(int[] arr,int num)
    {
        int i=0;
        while(i < arr.length)
        {
            if(arr[i] == num)
                return i;
            i++;
        }
        return -1;

    }
}