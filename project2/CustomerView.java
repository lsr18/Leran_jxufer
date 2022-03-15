package project2;

import java.util.Scanner;
/**
 * 卢寿荣 男 20 18079140860 无
 * 江学成 男 19 18794656654 无
 */
public class CustomerView {
	private  CustomerList cust=new CustomerList(10);
	public CustomerView() {
	}
	
		public void entermenu() {
			boolean A=true;
			while(A) {
			System.out.println(" *******欢迎来到客户系统********");
			System.out.println("        1.增加客户");
			System.out.println("        2.修改客户");
			System.out.println("        3.删除客户");
			System.out.println("        4.显示所有客户");
			System.out.println("        5.退出");
			System.out.print("请选择(1--5)");	
			switch(CMUtility.readMenuSelection()) {
			case '1':
			    addCustomerMenu();
			    break;
			case '2':
				replaceCustomerMenu();
				break;
			case '3':
				deleteCustomerMenu();
				break;
			case '4':
				showAll();
				break;
			case '5':
				System.out.println("是否确定退出(Y/N)");
				if(CMUtility.readConfirmSelection()=='Y') {
					System.out.println("谢谢使用该软件");
					A=false;
				}
				
			}
			}
		}

		/**
		 * 增加客户的操作
		 */
		public  void addCustomerMenu() {
			Scanner input=new Scanner(System.in);
			if(cust.gettotol()>=10) {
				System.out.println("客户列表也满,无法增加");
			}
			else {
				
				System.out.println("输入你想输入用户的信息");
				String name=input.next();
				char gender=input.next().charAt(0);
				int age=input.nextInt();
				String phone=input.next();
				String email=input.next();
				Customer A=new Customer(name,gender,age,phone,email);
				if(cust.addCostomer(A)) {
					System.out.println("增加成功");
				}
		
			}
		}
		/**
		 * 修改客户的操作
		 */
		public void replaceCustomerMenu() {
			Scanner input=new Scanner(System.in);
			System.out.println("输入你想修改客户的序号");
			int idex=input.nextInt();
			System.out.println("输入你想修改客户的信息");
			String name=input.next();
			char gender=input.next().charAt(0);
			int age=input.nextInt();
			String phone=input.next();
			String email=input.next();
			Customer A=new Customer(name,gender,age,phone,email);
			
			if(cust.replacecustomer(idex, A)) {
				System.out.println("修改成功");
			}
			
			
		}
		/**
		 * 删除客户信息
		 */
		public void deleteCustomerMenu() {
			Scanner input=new Scanner(System.in);
			System.out.println("输入你想删除客户的序号");
			int idex=input.nextInt();
			System.out.println("您是否确定删除该客户(Y/N)");
			if(cust.deletecustomer(idex)&&CMUtility.readConfirmSelection()=='Y') {
				System.out.println("删除成功");
			}
			else System.out.println("取消删除");
		}  
		/**
		 * 显示所有客户的操作
		 */
		public  void showAll() {
			System.out.println("*********客户列表********");
			
			if(cust.gettotol()==0)
				System.out.println("*********客户列表为空");
			
			else {
				
				    System.out.println("姓名\t性别\t年龄\t电话\t\t邮箱");
					
					Customer[] B=new Customer[cust.gettotol()];
					int totol=cust.gettotol();
					B=cust.getAllCustomers();
					for(int i=0;i<B.length;i++) {
						
				    System.out.println(B[i].getName()+"\t"+B[i].getGender()+"\t"+B[i].getAge()+"\t"+B[i].getPhone()+"\t"+B[i].getEmail());
					}
				}
			System.out.println("*******客户列表显示完成*******");
			}
		
	
		
		
		
		
		
		
		
		
}
