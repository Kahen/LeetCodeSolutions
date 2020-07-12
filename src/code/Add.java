package code;

/**
 * @author: Kahen
 * @time: 2020/7/12 16:28
 */
public class Add {
    public int Add(int a, int b) {
        int result = 0;
        int carry = 0;
        do {
            result = a ^ b;
            carry = (a & b) << 1;
            a = result;
            b = carry;
        } while (carry != 0);
        return result;
    }

    public static void main(String[] args) {
        Add add = new Add();
        System.out.println(add.Add(1, 2));
    }
}
