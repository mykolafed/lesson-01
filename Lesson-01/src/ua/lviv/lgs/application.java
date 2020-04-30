package ua.lviv.lgs;

public class application {

	public static void main(String[] args) {
	
		//Приклада 2 : Який буде результат виведення на екран
		//(інкремент\декремент)
		
//		int a = 0;
//		int b = a++;
//		int c = a++;
//		System.out.println("Приклад 2 = " + a + "" + b + "" + c + "");
		
		//Приклад 3: Операції з присвоєнням 
		
	//	int f = 1;
	//	int g = 2;
		//int h = 3;
	//	
	//	f+=5; 	// f = f + 5 => f = 1+5 =6
	//	g*=4;	// g = g * 4 => g =2*4 = 8
	//	h+=f*g;	// h = h + f*g => 3 + 6*8 =51
		//h%=6;	// h = h % 6 => h = 51%6 = 3(3 - це остача)
	//	
	//	System.out.println("f = " + f);
	//	System.out.println("g = " + g);
	//	System.out.println("h = " + h);
		
		
	// Приклад 4 : тернарний оператор
		
		//int a = 2;
	//	int r = a > 0? -3 : 2;
		//System.out.println("r ="+r);
		
	// Приклад 5: Логічні оператори 
		
//		boolean j = true; 
//		boolean k = false;
//		boolean l = j | k; //1+0=1=>true
//		boolean m = j & k; //1*0=0=>false
//		boolean n = (!j & k) | (j & !k); //(0*0)+(1*1)=0+1=1=>true
//		boolean o = !j; //0=>false
//		
//		System.out.println("j = " + j);
//		System.out.println("k = " + k);
//		System.out.println("l = " + l);
//		System.out.println("m = " + m);
//		System.out.println("n = " + n);
//		System.out.println("o = " + o);
		
		//Приклад 6 : Операції рівності 
//		int t = 5;
//		int u = 5;
//		String result = (t<u) ? "Yes": "No";
//		String result2 = (t==u) ? "Yes": "No";
//		String result3 = (t>=u) ? "Yes": "No";
//		
//		System.out.println("result = " + result);
//		System.out.println("result2 = " + result2);
//		System.out.println("result3 = " + result3);
		
		
		//Приклад 7: Конструкція if-else
		
//		int a1 = 3;
//		int b1 = 9;
//		
		
//		if(a1 > b1) {
//			System.out.println("a1 > b1");
//		}else {
//			System.out.println("a1 < b1");
//		}
		
		// Приклад 8: Конструкція if-else-if
		
//		if(a1 * a1 == b1) {
//			System.out.println("1");
//		}else if (a1 * a1 < b1) {
//			System.out.println("2");
//		}else {
//			System.out.println("3");
//		}
		
		// Конструкція switch
//		int k1 = 4;
//		
//		switch(k1) {
//		case 1 : case 3 : case 4: 
//			System.out.println("1, 3, 4"); break;
//			
//		case 2: System.out.println("2");
//		
//		default :System.out.println("default");
//		}
		
		//Цикл for
//			
//		for (int i = 0; i < 10; i++) {
//			System.out.println("i = " + i);
//		}
		
		// Цикл while 
//		int i = 0;
//		while (i <10) {
//			System.out.println("j = " + i);
//			i++;
//	}
//		int i = 0;
//		do {
//			System.out.println("do i = " + i);
//			i++;
//		} while (i == 1);
		//while (i == 10); один з варіантів 
		
		
		//Приклад 9: Масиви 
		
//		int array1 [] = new int [10];
//		double [] array2 = new double [10];
//		double array3 [] = {1.1, 2.2, 3.3, 4.4, 5.5};
//		
//		for (int i = 0; i < array1.length; i++) {
//			array1[i] = i;
//			array2[i] = i*i;
//		}
//		
//		for (int i = 0; i < array1.length; i++) {
//			System.out.print(array1[i] + " =>  ");
//			System.out.println(array2[i]);
//		}
//		for(int i = 0; i < array3.length; i++) {
//			System.out.println(array3[i]);
//		}
		
	// Приклад 11:обгортки примітивів  Wrappers primitives
		
		//Byte a1 = 2;
		//Short a2 = 2;
		//Integer a = 2;
		//Long a4 = 2l; 
		// При записі цього типу даних(потрібно додавати літеру lЧерез автоприведення до певних типів )
		
		//int a5 = a1;
		//a3 = a5;
		
		//Double b = 2.2;
		//Float b1 = 3.3F;
		
		System.out.println();
		
	}
}
