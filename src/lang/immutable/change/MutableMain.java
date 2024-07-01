package lang.immutable.change;

import lang.immutable.change.MutableObj;

public class MutableMain {
    public static void main(String[] args) {
        MutableObj obj = new MutableObj(10);
        obj.add(20);

        // 계산 이후의 기존 값은 사라짐
        System.out.println("obj.getValue() = " + obj.getValue());
    }
}
