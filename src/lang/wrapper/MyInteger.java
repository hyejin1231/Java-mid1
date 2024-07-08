package lang.wrapper;

/**
 * 직접 래퍼 클래스 만들기
 * 래퍼 클래스 : 기본형 변수를 감싼 클래스
 */
public class MyInteger {
    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    // 캡슐화
    public int compareTo(int target) {
        if (this.value > target) {
            return 1;
        } else if (this.value < target) {
            return -1;
        }else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
