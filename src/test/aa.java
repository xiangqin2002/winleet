package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class aa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> A = new ArrayList<Integer>();
	    A.add(1);
	    A.add(2);
	    A.add(3);
	    A.add(4);

	    List<Integer> B = new ArrayList<Integer>();
	    B.add(2);
	    B.add(4);
	    B.add(5);
	    B.add(6);

	    Collection C = new ArrayList<Integer>(A);
	    C.retainAll(B);
	    System.out.println("A �� B ������" + C);

	    B.removeAll(C);
	    System.out.println("A ���� B ����Բ�����" + B);
	    
	    System.out.println(A);
	    A.removeAll(C);
	    System.out.println("B ���� A ����Բ�����" + A);
	    System.out.println(A);
	}

}
