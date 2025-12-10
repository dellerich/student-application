package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.StudentOrder;

public class SaveStudentOrder {

    public static void main(String[] args) {
        StudentOrder so =new StudentOrder();
        so.hFirstName = "Алексей";
        so.hLastName = "Петров";
        so.wFirstName = "Галина";
        so.wLastName = "Петров";

        StudentOrder so1 =new StudentOrder();
        so1.hFirstName = "Дмитрий";
        so1.hLastName = "Маликов";
        so1.wFirstName = "Анна";
        so1.wLastName = "Кочеврягина";

        System.out.println(saveStudentOrder(so));
        System.out.println(saveStudentOrder(so1));
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder is running: " + studentOrder.hLastName);

        return answer;
    }

}
