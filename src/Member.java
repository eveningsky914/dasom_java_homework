// TODO 5 [추상 클래스 & 클래스]: RoleAction을 구현(implements)하는 Member 추상 클래스를 선언하세요.
public abstract class Member implements RoleAction {

    // TODO 6 [접근 제한자, 자료형, 변수, 변수 이름 규칙]: 자식 클래스에서 접근 가능하도록 protected로 이름과 학번 변수를 문자열(String)로 선언하세요. 카멜 케이스를 지켜주세요.
    protected String studentName;
    protected String studentNumber;
    // TODO 7 [생성자]: 이름과 학번을 매개변수로 받아 초기화하는 생성자를 작성하세요.
    public Member(String studentName, String studentNumber) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
    }

    // TODO 8 [메서드]: 학번을 반환하는 getStudentId() 메서드를 작성하세요.
    public String getStudentId() {
        return studentNumber;
    }
    // TODO 9 [메서드]: 직책의 이름을 문자열로 반환하는 getRoleName() 추상 메서드를 선언하세요.
    public abstract String getRoleName();

}