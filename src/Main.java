import java.util.Scanner;

// TODO 21 [주석]: DASOM 동아리의 부원을 등록하고 활동을 관리하는 시스템입니다.
public class Main {
    //  TODO 22 [상수]: 정적 문자열 상수 CLUB_NAME
    private static final String CLUB_NAME = "DASOM";

    public static void main(String[] args) {
        // TODO 23 [객체 생성]: 매니저와 스캐너 생성
        ClubManager<Member> manager = new ClubManager<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== " + CLUB_NAME + " 백엔드 과제 시스템 ===");

        // TODO 24 [배열]: 메뉴 문자열 배열
        String[] menu = {"1. 부원 등록", "2. 특별 활동", "3. 종료"};

        // TODO 25 [반복문]: 시스템 메인 루프
        while (true) {
            System.out.println("\n--- 메뉴 ---");
            for (String m : menu) {
                System.out.println(m);
            }
            System.out.print("선택: ");
            String choice = scanner.nextLine();

            // TODO 26 [예외 처리]: 로직을 try-catch로 감싸 예외 발생 시 메시지 출력
            try {
                if (choice.equals("1")) {
                    System.out.print("이름: "); String studentName = scanner.nextLine();
                    System.out.print("학번: "); String studentNumber = scanner.nextLine();

                    // TODO 27 [인스턴스화]: Admin 객체를 생성하여 Member 변수에 할당(다형성)
                    Member newMember = new Admin(studentName, studentNumber);

                    // TODO 28 [등록]: manager에 등록
                    manager.addMember(newMember);
                }
                else if (choice.equals("2")) {
                    for (Member m : manager.getMembers()) {
                        m.performRole();
                        if (m instanceof Admin) {
                            Admin admin = (Admin) m;
                            admin.manageServer();
                        }
                    }
                }
                else if (choice.equals("3")) {
                    System.out.println("종료합니다.");
                    break;
                }
            } catch (DuplicateException e) {
                // 중복 발생 시 에러 메시지 출력
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}