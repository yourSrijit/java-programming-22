package com.company;

import java.util.Scanner;


public class s_6_Class_Employee
{
    public static void main(String[] args) {
        int n;
        int y,z;
        String x;

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of employee");
        n=sc.nextInt();
//        int a[]= new int[n];
        Employee emp[]= new Employee[n];
        for(int i=0;i<n;i++)
        {
            emp[i] = new Employee();
            System.out.println("Enter the records of Employees "+(i+1));
            System.out.println("Enter the name ");
            sc.nextLine();
            x= sc.nextLine();
            emp[i].setName(x);
            System.out.println("Enter the Id ");
            y =sc.nextInt();
            emp[i].setId(y);
            System.out.println("Enter the Salary");
            z =sc.nextInt();
            emp[i].setSalary(z);
        }
        System.out.println("Name\tId\tSalary");
        for(int i= 0;i<n;i++){
            System.out.println(emp[i].getName()+"\t"+ emp[i].getId()+"\t"+emp[i].getSalary());

        }
    }
}
