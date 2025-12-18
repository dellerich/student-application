package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.Adult;
import edu.javacourse.studentorder.domain.StudentOrder;

public class SaveStudentOrder {

    public static void main(String[] args) {
        StudentOrder s /*ссылка*/ = buildsStudentOrder(10);
//        System.out.println(saveStudentOrder(so));
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder is running: ");

        return answer;
    }

    public static StudentOrder buildsStudentOrder(long id){
        StudentOrder so /*cсылка*/= new StudentOrder();
        so.setStudentOrderId(id);
        StudentOrder so1 /*cсылка*/= so;
        printStudentOrder(so1);

        return so;
    }

    static void printStudentOrder(StudentOrder stor /*cсылка при входе в метод используется, а дальше нет. Поэтому Garbage Collector его уничтожает*/
    ){
        System.out.println(stor.getStudentOrderId());
    }
}
