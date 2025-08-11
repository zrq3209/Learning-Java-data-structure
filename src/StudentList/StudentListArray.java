package StudentList;

import java.util.Scanner;

public class StudentListArray {
    private String[] students; // �洢ѧ�����ֵ�����
    private  int size; // ��ǰ����ѧ������

    public  StudentListArray(int capacity){
        students = new String[capacity];
        size = 0;
    }

    // ���ѧ����β�����룩
    public void addstudents(String name){
        if (size>=students.length){
            System.out.println("�����������������");
            return;
        }
        students[size++] = name;
    }

    // ��ָ��λ�ò���ѧ��
    public void insertStudent(int index, String name){
        if (size >= students.length){
            System.out.println("�������������ܼ��룡");
            return;
        }
        if (index < 0 ||  index > size){
            System.out.println("����λ�ò��Ϸ�");
            return;
        }

        //�Ӻ���ǰ�ƶ�����
        for (int i =  size; i > index; i--){
            students[i] = students[i-1];
        }
        students[index] = name;
        size++;
    }
    public void deleteStudent(int index){
        if (index < 0 || index >= size){
            System.out.println("ɾ��λ�ò��Ϸ�");
            return;
        }
        for(int i = index; i< size-1; i++){
            students[i] = students[i+1];
        }
        students[size-1] = null;
        size--;
    }

    // ����ѧ��

    public int findStudent(String name){
        for (int i = 0; i < size; i++){
            if (students[i].equals(name)){
                return i;
            }
        }
        return -1;
    }

    // ��ӡ����ѧ��
    public void printStudents(){
        System.out.println("ѧ������");
        for(int i = 0; i < size; i++){
            System.out.println(students[i]+" ");
        }
        System.out.println();
    }

}
