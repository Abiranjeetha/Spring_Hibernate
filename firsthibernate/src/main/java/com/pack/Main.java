package com.pack;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.pack.model.Customer;
import com.pack.service.CustomerServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("#########Banking Application#########");
		System.out.println("1.Add Customer");
		System.out.println("2.Update Customer");
		System.out.println("3.Delete Customer");
		System.out.println("4.Fetch Customer");
		System.out.println("5.Exit");
		int ch=0,age,num;
		float salary;
		String name,address;
		do
		{
			System.out.println("Enter your choice");
			ch=Integer.parseInt(s.nextLine());
			switch(ch)
			{
			case 1:
				System.out.println("Enter name");
				name=s.nextLine();
				System.out.println("Enter address");
				address=s.nextLine();
				System.out.println("Enter age");
				age=Integer.parseInt(s.nextLine());
				System.out.println("Enter salary");
				salary=Float.parseFloat(s.nextLine());
				Random r=new Random();
				num=r.nextInt(900000)+100000;
				Customer c=new Customer(num,name,address,age,salary);
				new CustomerServiceImpl().insertCustomer(c);
				System.out.println("Customer added successfully");
				break;
			case 2:
				System.out.println("Enter Id");
				num=Integer.parseInt(s.nextLine());
				System.out.println("Enter address");
				address=s.nextLine();
				System.out.println("Enter age");
				age=Integer.parseInt(s.nextLine());
				System.out.println("Enter salary");
				salary=Float.parseFloat(s.nextLine());
				Customer c1=new Customer(num,address,age,salary);
				int i=new CustomerServiceImpl().updateCustomer(c1);
				if(i==1)
				{
					System.out.println("Customer updated successfully");
				}
				break;
			case 3:
				System.out.println("Enter id");
				num=Integer.parseInt(s.nextLine());
				new CustomerServiceImpl().deleteCustomer(num);
				System.out.println("Customer deleted successfully");
				break;
			case 4:
				System.out.println("Enter id");
				num=Integer.parseInt(s.nextLine());
				/*Customer c2=(Customer)new CustomerServiceImpl().fetchCustomer(num);
				System.out.format("%-15s %-20s %-20s %-5s %-10s\n","Customer Id","Name","Address","Age","Salary");
				System.out.format("%-15s %-20s %-20s %-5s %-10s\n", c2.getCustid(),c2.getName(),c2.getAddress(),c2.getAge(),c2.getSalary());*/
				List<Customer>l=new CustomerServiceImpl().fetchCustomer();
				System.out.format("%-15s %-20s %-20s %-5s %-10s\n","Customer Id","Name","Address","Age","Salary");
				for(Customer c2:l)
				{
					System.out.format("%-15s %-20s %-20s %-5s %-10s\n", c2.getCustid(),c2.getName(),c2.getAddress(),c2.getAge(),c2.getSalary());
				}
				/*System.out.println("Customer fetched successfully");
				System.out.println("ID="+c2.getCustid());
				System.out.println("Name="+c2.getName());
				System.out.println("Address="+c2.getAddress());
				System.out.println("Age="+c2.getAge());
				System.out.println("Salary="+c2.getSalary());*/
				break;
			case 5:
				System.exit(0);
			}
		}
		while(ch<6);
	}
}
