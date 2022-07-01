package com.company;

import javax.sql.rowset.JdbcRowSet;
import java.util.Scanner;

class Employee1{
    int id,salary;
    String name;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
public class Employee_Id_Name {
    public static Employee1 getEmployeeById(Employee1 []emp,int eid){
        for(int i=0;i<emp.length;i++)
        {
            if(eid==emp[i].getId())
            {
                return emp[i];
            }
        }
        return  null;
    }

    public static Employee1 getEmployeeByName(Employee1 []emp,String nam){
        for(int i=0;i<emp.length;i++)
        {
            if(nam.equals(emp[i].getName()))
            {
                return emp[i];
            }
        }
        return  null;
    }

    public static Employee1 updateSalaryById(Employee1 []emp,int eid,int sal){
        for(int i=0;i<emp.length;i++)
        {
            if(eid==emp[i].getId())
            {   emp[i].setSalary(sal);
                return emp[i];
            }
        }
        return  null;
    }

    public static void main(String[] args) {
        int i, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employee");
        n = sc.nextInt();
        Employee1 []emp = new Employee1[n];

        try {
            for (i = 0; i < n; i++) {
                emp[i] = new Employee1();
                System.out.println("Enter the id");
                int x = sc.nextInt();
                emp[i].setId(x);
                sc.nextLine();
                System.out.println("Enter the name");
                String y = sc.nextLine();
                emp[i].setName(y);
                System.out.println("Enter the salary");
                int z = sc.nextInt();
                emp[i].setSalary(z);

            }
        }
        catch(Exception c){
            System.out.println("Invalid Information");
        }
        System.out.println("\nId\tName\tSalary");
        for (i=0;i<n;i++){
            System.out.println(emp[i].getId()+"\t"+emp[i].getName()+"\t"+emp[i].getSalary());
        }


        try {
            System.out.println("Enter the id for the information");
            int eid = sc.nextInt();
            Employee1 d = Employee_Id_Name.getEmployeeById(emp, eid);
            assert d != null;
            System.out.println(d.getId() + "\t" + d.getName() + "\t" + d.getSalary());


            sc.nextLine();
            System.out.println("Enter the name for the information");
            String nam = sc.nextLine();
            Employee1 e = Employee_Id_Name.getEmployeeByName(emp, nam);
            assert e != null;
            System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSalary());
        }
        catch (Exception C){
            System.out.println("Invalid Information");
        }

        System.out.println("Enter the id for salary update");
        int eid = sc.nextInt();
        System.out.println("Enter the updated salary");
        int sal =sc.nextInt();
        Employee1 d = Employee_Id_Name.updateSalaryById(emp, eid,sal);
        assert d != null;
        System.out.println(d.getId() + "\t" + d.getName() + "\t" + d.getSalary());



    }
}
