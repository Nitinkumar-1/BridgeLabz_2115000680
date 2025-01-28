import java.util.HashSet;
import java.util.Set;
public class level3Q7 {
    public static void main(String[] args) {
        int[] otpArray = new int[10];
        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateOTP();
        }
        boolean isUnique = areOTPsUnique(otpArray);
        System.out.println("Generated OTPs:");
        for (int otp : otpArray) {
            System.out.println(otp);
        }
        System.out.println("Are all OTPs unique? " + isUnique);
    }
    public static int generateOTP() {
        return 100000 + (int) (Math.random() * 900000);
    }
    public static boolean areOTPsUnique(int[] otpArray) {
        Set<Integer> otpSet = new HashSet<>();
        for (int otp : otpArray) {
            otpSet.add(otp);
        }
        return otpSet.size() == otpArray.length;
    }
}\
