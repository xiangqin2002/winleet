package test;

public class aaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "kdla8405118*)(^%* Y TILKH89015jf   khka";
        str = str.replaceAll("[^a-zA-Z ]+", "");
        String [] arr = str.split("\\s+");
        System.out.println(str);
        System.out.print(arr.length);
	}

}
