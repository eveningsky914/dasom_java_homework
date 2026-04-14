// TODO 1 [예외 던지기]: Exception을 상속받는 사용자 정의 예외 클래스를 만드세요.
public class DuplicateException extends Exception {
    // TODO 2 [생성자]: 문자열(message)을 매개변수로 받아 부모 생성자(super)로 전달하는 생성자를 작성하세요. 뭘까.
    public DuplicateException() {}

    public DuplicateException(String message) {
        super(message);
    }

}