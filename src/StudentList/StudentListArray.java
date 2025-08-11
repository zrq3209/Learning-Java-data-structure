package StudentList;

import java.util.Scanner;

public class StudentListArray {
    private String[] students; // 存储学生名字的数组
    private  int size; // 当前已有学生数量

    public  StudentListArray(int capacity){
        students = new String[capacity];
        size = 0;
    }

    // 添加学生（尾部插入）
    public void addstudents(String name){
        if (size>=students.length){
            System.out.println("名单已满，不能添加");
            return;
        }
        students[size++] = name;
    }

    // 在指定位置插入学生
    public void insertStudent(int index, String name){
        if (size >= students.length){
            System.out.println("名单已满，不能加入！");
            return;
        }
        if (index < 0 ||  index > size){
            System.out.println("插入位置不合法");
            return;
        }

        //从后往前移动数据
        for (int i =  size; i > index; i--){
            students[i] = students[i-1];
        }
        students[index] = name;
        size++;
    }
    public void deleteStudent(int index){
        if (index < 0 || index >= size){
            System.out.println("删除位置不合法");
            return;
        }
        for(int i = index; i< size-1; i++){
            students[i] = students[i+1];
        }
        students[size-1] = null;
        size--;
    }

    // 查找学生

    public int findStudent(String name){
        for (int i = 0; i < size; i++){
            if (students[i].equals(name)){
                return i;
            }
        }
        return -1;
    }

    // 打印所有学生
    public void printStudents(){
        System.out.println("学生名单");
        for(int i = 0; i < size; i++){
            System.out.println(students[i]+" ");
        }
        System.out.println();
    }

}
