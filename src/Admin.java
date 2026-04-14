// TODO 10 [상속, 객체지향 이해하기]: Member를 상속(extends)받는 Admin 클래스를 선언하세요.
public class Admin extends Member {

    // TODO 11 [생성자]: 부모 클래스(Member)의 생성자를 호출하여 초기화하는 생성자를 작성하세요.
    public Admin(String studentName, String studentNumber) {
        super(studentName, studentNumber);
    }


    // TODO 12 [메서드 오버라이딩]: getRoleName()을 오버라이딩하여 "운영진"을 반환하도록 하세요.
    @Override
    public String getRoleName() {
        return "운영진";
    }

    // TODO 13 [메서드 오버라이딩]: performRole()을 오버라이딩하여 이름 + "님이 행사를 기획합니다."를 출력하세요.
    @Override
    public void performRole() {
        System.out.println(studentName + "님이 행사를 기획합니다.");
    }
    // TODO 14 [실전 사용 코드]: 운영진만의 특별한 기능으로 manageServer() 메서드를 만들고 이름 + "님이 서버를 관리합니다."를 출력하게 하세요.
    public void manageServer() {
        System.out.println(studentName + "님이 서버를 관리합니다.");
    }


}