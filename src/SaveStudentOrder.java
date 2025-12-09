public class SaveStudentOrder {

    public static void main(String[] args) {
        StudentOrder so;
        so = new StudentOrder();
        so.hFirstName = "Алексей";
        so.hLastName = "Петров";
        so.wFirstName = "Галина";
        so.wLastName = "Петров";

        System.out.println(saveStudentOrder(so));
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder is running: " + studentOrder.hLastName);

        return answer;
    }

}
