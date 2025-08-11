package StudentList;

public class StudentMain {
    public static void main(String[] args) {
        System.out.println("===== 顺序存储结构（数组）实现 =====");
        StudentListArray arrList = new StudentListArray(10);
        arrList.addstudents("小明");
        arrList.addstudents("小红");
        arrList.addstudents("小刚");
        arrList.printStudents();

        arrList.insertStudent(1, "小华");
        arrList.printStudents();

        arrList.deleteStudent(2);
        arrList.printStudents();


        System.out.println("小红的位置：" + arrList.findStudent("小红"));

    }
}
