package pack;

import pack.a.User; // 여러 번 사용하는 클래스를 import함

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User(); // 어쩔 수 없이 둘 중 하나는 다 적어야 함
    }
}
