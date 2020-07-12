package code;

/**
 * @author: Kahen
 * @time: 2020/7/11 16:29
 */
public class BuildProductArrays {
    public int[] multiply(int[] A) {
        int[] B=new int[A.length];

        for (int i = 0; i < B.length; i++) {

                    B[i]=getMultiplyNum(A,i);

        }
        return B;
    }
    public int getMultiplyNum(int[] arrays,int count){
        int sum=1;
        for (int i = 0; i<arrays.length; i++) {
            if (i!=count){
                sum=sum*arrays[i];
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int[] A=new int[]{1,2,3,4,5};

        System.out.println(new BuildProductArrays().multiply(A));

    }
}
