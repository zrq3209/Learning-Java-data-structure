package StudentList;

public class StudentMain {
    public static void main(String[] args) {
        System.out.println("===== ˳��洢�ṹ�����飩ʵ�� =====");
        StudentListArray arrList = new StudentListArray(10);
        arrList.addstudents("С��");
        arrList.addstudents("С��");
        arrList.addstudents("С��");
        arrList.printStudents();

        arrList.insertStudent(1, "С��");
        arrList.printStudents();

        arrList.deleteStudent(2);
        arrList.printStudents();


        System.out.println("С���λ�ã�" + arrList.findStudent("С��"));

    }
}
