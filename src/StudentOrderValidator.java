public class StudentOrderValidator {

    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll(){
        //читаем студенческую заявку и пытаемся её проверить

        while(true) {
                StudentOrder so = readStudentOrder();
                System.out.println("Start");
                if(so == null) {
                    break;
                }
                System.out.println("Finish");
                AnswerCityRegister cityAnswer = checkCityRegister(so);
                if(!cityAnswer.success){
                    continue;
                }
                AnswerWedding wedAnswer = checkWedding(so);
                AnswerChildren childAnswer = checkChildren(so);
                AnswerStudent studentAnswer = checkStudent(so);

                sendMail(so);
        }
        System.out.println("Finish2");
    }


    static StudentOrder readStudentOrder(){
        StudentOrder so = new StudentOrder();
        return null;
    }

    static AnswerCityRegister checkCityRegister(StudentOrder so){
        System.out.println("checkCityRegister is running");
        AnswerCityRegister ans = new AnswerCityRegister();
        ans.success = false;
        return ans;
    }

    static AnswerWedding checkWedding(StudentOrder so){
        System.out.println("checkMarrige is running");
        AnswerWedding ans = new AnswerWedding();
        return ans;
    }

    static AnswerChildren checkChildren(StudentOrder so){
        System.out.println("checkChildren is running");
        AnswerChildren ans = new AnswerChildren();
        return ans;
    }

    static AnswerStudent checkStudent(StudentOrder so){
        System.out.println("Студенты проверяются");
        return new AnswerStudent();
    }

    static void sendMail(StudentOrder so){
        System.out.println("Почта отправлена");
    }
}
