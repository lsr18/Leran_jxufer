package project2;

public class CustomerList {

	private int totol;//�Ѵ��ڿͻ��ĸ���
	private Customer[] customers;
	public CustomerList(int totolcustomer) {
		//�������󳤶�
		this.customers=new Customer[totolcustomer];
		this.totol=0;
	}
	/**
	 * �����û���Ϣ
	 */
	public boolean addCostomer( Customer customer) {
		if(totol>=customers.length) {
			return false;
		}
		else {
			customers[totol]=customer;
			totol=totol+1;
		}
		return true;
	}
	/**
	 * �޸�ָ���������û���Ϣ
	 */
	public boolean replacecustomer(int idex,Customer customer) {
		if(idex-1<0||idex-1>=totol) {
			return false;
		}
		this.customers[idex-1]=customer;
		return true;
	}
	/**
	 * ɾ��ָ��������Ϣ
	 */
	public boolean deletecustomer(int idex) {
		if(idex-1<0||idex-1>=totol) {
			return false;
		}
		for(int i=idex-1;i<totol-1;i++) {
			customers[i]=customers[i+1];
		}
		
		totol--;
		return true;
	}
	public Customer[] getAllCustomers() {
		Customer[] A=new Customer[totol];
		for(int i=0;i<totol;i++) {
			A[i]=this.customers[i];
		}
		return A;
	}
	public Customer getCustomer(int idex ) {
		if(idex<0||idex>=totol) {
			return null;
		}
		return this.customers[idex-1];
	}
	public int gettotol() {
		return totol;
	}
}
