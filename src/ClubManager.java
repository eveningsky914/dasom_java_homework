import java.util.ArrayList;
import java.util.List;

// TODO 15 [제네릭]: Member 또는 그 자식들만 들어올 수 있게 타입 파라미터 <T>를 설정하세요.
public class ClubManager<T extends Member> {

    // TODO 16 [리스트]: T 타입의 객체들을 저장할 members 리스트(ArrayList)를 private으로 선언하고 초기화하세요.
    private List<T> members = new ArrayList<>();

    public void addMember(T member) throws DuplicateException {
        // TODO 17 [NULL, 조건문]: 넘어온 member가 null이라면 아무 작업도 하지 않고 메서드를 종료(return)하세요.
        if (member == null) return;

        // TODO 18 [반복문, 연산자]: for-each문으로 members 리스트를 순회하며 중복 학번을 찾으세요.
        // 문자열이 동등한지(equals) 비교하고, 같다면 DuplicateException을 발생(throw)시키세요.
        for (T m : members) {
            if (m.getStudentId().equals(member.getStudentId())) {
                // 결과 화면의 에러 메시지 형식 준수
                throw new DuplicateException("[에러] 이미 등록된 학번(" + member.getStudentId() + ")입니다.");
            }
        }

        // TODO 19 [리스트]: 위 검사를 통과했다면 리스트에 member를 추가하고 "등록되었습니다"를 출력하세요.
        members.add(member);
        System.out.println(member.studentName + "님이 등록되었습니다.");
    }

    // TODO 20 [메서드]: members 리스트를 반환하는 getMembers() 메서드를 작성하세요.
    public List<T> getMembers() {
        return members;
    }
}