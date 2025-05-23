package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter; // 매개변수와 멤버 변수의 이름이 다른 경우에는 this 생략 가능
        // 가장 가까운 범위인 매개변수에서 nameField를 찾았지만 없었기 때문에 다음으로 가까운 범위인 멤버 변수 확인
    }
}
