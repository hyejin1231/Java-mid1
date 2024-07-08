package lang.wrapper;

/**
 * 5. 래퍼 클래스
 */
public class MyIntegerNullMain0 {
    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};

        System.out.println(findValue(intArr, -1)); // -1
        System.out.println(findValue(intArr, 0)); // 0
        System.out.println(findValue(intArr, 1)); // 1
        System.out.println(findValue(intArr, 100)); // 배열에 없는 값이면 -1 를 반환한다.. 값이 좀 애매함.. 명확하지 않음
    }

    private static int findValue(int[] intArr, int target) {
        for (int value : intArr) {
            if (value == target) {
                return value;
            }
        }

        return -1;
    }
}
