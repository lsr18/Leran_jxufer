package project2;

import java.util.Scanner;
/**
 * ¬���� �� 20 18079140860 ��
 * ��ѧ�� �� 19 18794656654 ��
 */
public class CustomerView {
	private  CustomerList cust=new CustomerList(10);
	public CustomerView() {
	}
	
		public void entermenu() {
			boolean A=true;
			while(A) {
			System.out.println(" *******��ӭ�����ͻ�ϵͳ********");
			System.out.println("        1.���ӿͻ�");
			System.out.println("        2.�޸Ŀͻ�");
			System.out.println("        3.ɾ���ͻ�");
			System.out.println("        4.��ʾ���пͻ�");
			System.out.println("        5.�˳�");
			System.out.print("��ѡ��(1--5)");	
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
				System.out.println("�Ƿ�ȷ���˳�(Y/N)");
				if(CMUtility.readConfirmSelection()=='Y') {
					System.out.println("ллʹ�ø����");
					A=false;
				}
				
			}
			}
		}

		/**
		 * ���ӿͻ��Ĳ���
		 */
		public  void addCustomerMenu() {
			Scanner input=new Scanner(System.in);
			if(cust.gettotol()>=10) {
				System.out.println("�ͻ��б�Ҳ��,�޷�����");
			}
			else {
				
				System.out.println("�������������û�����Ϣ");
				String name=input.next();
				char gender=input.next().charAt(0);
				int age=input.nextInt();
				String phone=input.next();
				String email=input.next();
				Customer A=new Customer(name,gender,age,phone,email);
				if(cust.addCostomer(A)) {
					System.out.println("���ӳɹ�");
				}
		
			}
		}
		/**
		 * �޸Ŀͻ��Ĳ���
		 */
		public void replaceCustomerMenu() {
			Scanner input=new Scanner(System.in);
			System.out.println("���������޸Ŀͻ������");
			int idex=input.nextInt();
			System.out.println("���������޸Ŀͻ�����Ϣ");
			String name=input.next();
			char gender=input.next().charAt(0);
			int age=input.nextInt();
			String phone=input.next();
			String email=input.next();
			Customer A=new Customer(name,gender,age,phone,email);
			
			if(cust.replacecustomer(idex, A)) {
				System.out.println("�޸ĳɹ�");
			}
			
			
		}
		/**
		 * ɾ���ͻ���Ϣ
		 */
		public void deleteCustomerMenu() {
			Scanner input=new Scanner(System.in);
			System.out.println("��������ɾ���ͻ������");
			int idex=input.nextInt();
			System.out.println("���Ƿ�ȷ��ɾ���ÿͻ�(Y/N)");
			if(cust.deletecustomer(idex)&&CMUtility.readConfirmSelection()=='Y') {
				System.out.println("ɾ���ɹ�");
			}
			else System.out.println("ȡ��ɾ��");
		}  
		/**
		 * ��ʾ���пͻ��Ĳ���
		 */
		public  void showAll() {
			System.out.println("*********�ͻ��б�********");
			
			if(cust.gettotol()==0)
				System.out.println("*********�ͻ��б�Ϊ��");
			
			else {
				
				    System.out.println("����\t�Ա�\t����\t�绰\t\t����");
					
					Customer[] B=new Customer[cust.gettotol()];
					int totol=cust.gettotol();
					B=cust.getAllCustomers();
					for(int i=0;i<B.length;i++) {
						
				    System.out.println(B[i].getName()+"\t"+B[i].getGender()+"\t"+B[i].getAge()+"\t"+B[i].getPhone()+"\t"+B[i].getEmail());
					}
				}
			System.out.println("*******�ͻ��б���ʾ���*******");
			}
		
	
		
		
		
		
		
		
		
		
}
