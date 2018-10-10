package practice01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ex {

	public static void main(String[] args) {

		// ������
		gugudan();
		
		// ���̾Ƹ��
		diamond();
		
		// ���� ���� �����.
		try {
			sungjeok_file();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
		
	}
	
	// ������ ���
	public static void gugudan() {
		
		// �������� ǥ���ϱ� ���� ������ ���� 2�� ����
		int iter1, iter2;
		
		// 1. �������� ���η� ǥ��
		// 1�� ���� 2~9�ܱ��� ǥ���ϱ� ���� for�� 
		for (iter1 = 2; iter1 < 10; iter1++) {
			// 2�� ���� ��� 1~9���� ǥ���ϱ� ���� for��
			for (iter2 = 1; iter2 < 10; iter2++) {
				// X * X = X �� console�� ǥ�� �ϱ� ���� print. 
				System.out.printf("%2d X %2d = %2d\t", iter1, iter2, iter1*iter2);				
			}
			// �ٹٲ��� �ϱ� ���� println.
			System.out.println("");
		}
		
		// ����� �Ʒ��� ����.
		// 2*1=2 2*2=4 .... 2*9=18
		// 3��
		// ...
		// 9��
		
		System.out.println("");
		System.out.println("");		
		
		// 2. �������� ���η� ǥ��		
		// 1�� ���� ��Ҹ� �������� ǥ���ϱ� ���� for��.
		for (iter1 = 1; iter1 < 10; iter1++) {
			// 2�� ���� ǥ���ϱ� ���� for��.
			for (iter2 = 2; iter2 < 10; iter2++) {
				System.out.printf("%2d X %2d = %2d\t", iter2, iter1, iter2*iter1);
			}
			System.out.println("");
		}
		
		// ����� �Ʒ��� ����.
		// 2*1=2  3*1=3 .... 9*1=9
		// 2*2=4  ...	...	 ...
		// ...	  ...	...	 ...
		// 2*9=18 ...	...	 ...
		
		System.out.println("");
		System.out.println("");
		
		// 3. ������ ���� ǥ�� while
		// ���� ���� �ʱ�ȭ.
		iter1 = 2;
		
		// 1ó 2~9���� while���� �ݺ�
		while(iter1 < 10) {	
			// ����� ���� �ʱ�ȭ.
			iter2 = 1;
			
			//2�� 1~9 ���� while���� �ݺ�.
			while (iter2 < 10) {
				// X*X=X�� ǥ��
				System.out.printf("%2d X %2d = %2d\t", iter1, iter2, iter1*iter2);
				
				// ���� ��Ҹ� ���� ����
				iter2++;
			}
			// ���� ����
			iter1++;
			
			//�ٹٲ�
			System.out.println("");
		}
		
		System.out.println("");
		System.out.println("");
		
		
		// 4. ������ ����ǥ�� do while
		// ���� ���� �ʱ�ȭ.
		iter1 = 2;
		// 1�� do while �� ����.
		do {
			// ����� ���� �ʱ�ȭ.
			iter2 = 1;
			
			// 2�� do while �� ����.
			do {
				// ������ ǥ��.
				System.out.printf("%2d X %2d = %2d\t", iter1, iter2, iter1*iter2);
				
				// ���� ��Ҹ� ���� ����.
				iter2++;
			} while (iter2 < 10);
			// ����� ���� Ȯ��(9���� ǥ�� �Ͽ��°�?)
			
			// ���� ����.
			iter1++;
			
			// �ٹٲ�
			System.out.println("");

		}while(iter1 < 10);
		// ���� �� Ȯ��(9�ܱ��� ǥ���Ͽ��°�?)
		
		System.out.println("");
		System.out.println("");		
	}
	
	// ���̾Ƹ�� ���
	public static void diamond() {
		
		// ���̾Ƹ�� ����� ���� ���� ����.
		int iter3, iter4, iter5, iter6;
		
		// *ǥ�÷� ���̾� ��� ��� �����.
		//     *
		//    ***
		//   *****
		//  *******
		// *********
		//  *******
		//   *****
		//    ***
		//     *
		
		// ����� ǥ���ϱ� ���ؼ� � ����� ��������� ���� ��� �ʿ�.
		// �� ������ *�� �������� ���� ���� �Ͽ� ���ʿ� * �� �߰��� ������ �κ��� ����.
		// ��� ������ ���� ������ �������� ��, �Ʒ��� ����.
		
		// 1�� �ٹٲ��� ���� for�� - 5��° �ٱ��� ǥ��
		for (iter3 = 0; iter3 < 5; iter3++) {
			// 2�� ������ ������ ǥ���ϱ� ���� for�� - ������ ������ 4 ~ 0 ���� ����. 
			for (iter4 = 4 - iter3; iter4 > 0; iter4--) {
				System.out.printf(" ");
			}
			// 2�� * ����� ǥ���ϱ� ���� for�� - ���� *�� ������ 1 ~ 5 �� ����.
			for (iter5 = iter3; iter5 >= 0; iter5--) {
				System.out.printf("*");
			}
			// 2�� * ����� ǥ���ϱ� ���� for��. - ���� *�� ������ 0 ~ 4 �� ����.
			for (iter6 = 0; iter6 < iter3; iter6++) {
				System.out.printf("*");
			}
			// �ٹٲ�.
			System.out.println("");
		}
		
		// 1�� �ٹٲ��� ���� for��. - 6 ~ 9��° �ٱ��� ǥ��
		for(iter3 = 1; iter3 < 5; iter3++) {
			// 2�� ������ ������ ǥ���ϱ� ���� for��. ������ ������ 1 ~ 4���� ����
			for (iter4 = 0; iter4 < iter3; iter4++) {
				System.out.printf(" ");
			}
			// 2�� * ����� ǥ���ϱ� ���� for��. - ���� *�� ������ 4 ~ 1�� ����.
			for (iter5 = 5; iter5 > iter3; iter5--) {
				System.out.printf("*");
			}
			// 2�� * ����� ǥ���ϱ� ���� for��. - ���� *�� ������ 3 ~ 0 ���� ����.
			for (iter6 = 4; iter6 > iter3; iter6--) {
				System.out.printf("*");
			}
			// �ٹٲ�.
			System.out.println("");
		}
		System.out.println("");
		System.out.println("");
		
		
		// ���̾Ƹ�� ǥ�ø� while�� ����.
		
		// ���κ� ǥ�ø� ���� ��ǥ�� ������ �ʱ�ȭ.
		iter3 = 0;
		
		// �ٹٲ��� ���� while �� - �� �κ� ǥ��.
		while (iter3 < 5) {
			
			// ���� ǥ�ø� ���� �ʱ�ȭ.
			iter4 = 4 - iter3;
			
			// ���� ǥ��
			while (iter4 > 0) {
				System.out.printf(" ");
				iter4--;
			}
			
			// ���� * ǥ�ø� ���� �ʱ�ȭ 
			iter5 = iter3; 
			
			while (iter5 >= 0) {
				System.out.printf("*");
				iter5--;
			}
			
			// ���� * ǥ�ø� ���� �ʱ�ȭ.
			iter6 = 0;
			
			while(iter6 < iter3) {
				System.out.printf("*");
				iter6++;
			}
			
			// �ٹٲ�.
			System.out.println();
			
			// �����ٷ� �̵�.
			iter3++;
		}
		
		//�Ʒ��κ� ǥ�ø� ���� ���� �ʱ�ȭ.
		iter3 = 1;
		
		// �ٹٲ��� ���� while�� - �Ʒ� �κ� ǥ��.
		while (iter3 < 5) {

			// ���� ǥ�ø� ���� �ʱ�ȭ.
			iter4 = 0;
			
			while (iter4 < iter3) {
				System.out.printf(" ");
				iter4++;
			}
			
			// ���� * ǥ�ø� ���� �ʱ�ȭ
			iter5 = 5; 
			
			while (iter5 > iter3) {
				System.out.printf("*");
				iter5--;
			}
			
			// ���� * ǥ�ø� ���� �ʱ�ȭ
			iter6 = 4;
			
			while(iter6 > iter3) {
				System.out.printf("*");
				iter6--;
			}
			System.out.println();
			iter3++;
		}
		System.out.println("");
		System.out.println("");
		

		// ���̾Ƹ�� ǥ�ø� do while�� ����.

		// ���κ� ǥ�ø� ���� ��ǥ�� ������ �ʱ�ȭ.
		iter3 = 0;
		
		// ���κ� �ٹٲ��� ���� do while�� ����
		do {
			// ���� ǥ�ø� ���� ���� �ʱ�ȭ
			iter4 = 4 - iter3;
			
			// ����ǥ�� do while�� ����
			do {
				//������ �ٿ��� ������ ǥ������ �ʰ� �ϱ� ���� ���ǹ�.
				if (iter3 < 4)
					System.out.printf(" ");
				// ���� ǥ�ÿ� ���� ����.
				iter4--;
			}while (iter4 > 0);
			// ���� ǥ�ø� ���� do while �� ���� ����.
			
			// �� �� * ǥ�ø� ���� ���� �ʱ�ȭ
			iter5 = iter3; 
			
			// �� �� * ǥ�ø� ���� do while �� ����.
			do {
				System.out.printf("*");
				
				// * ǥ�ÿ� ���� �� ����
				iter5--;
			} while (iter5 >= 0);
			// ���� * ǥ�� ���� ����. 
			
			// ���� * ǥ�ø� ���� ���� �ʱ�ȭ
			iter6 = 0;
			
			// ���� * ǥ�ø� ���� do while �� ����
			do {
				// ù ��° ���� ǥ�ÿ��� *�� ������ �ʵ��� �ϱ� ���� ���ǹ�.
				// do whilw�� �ѹ��� ������ ����Ǳ� ������ ���ǹ��� �ʿ�.
				if (iter3 != 0) {
					System.out.printf("*");
				}
				// �� �� * ǥ�ÿ� ���� �� ����.
				iter6++;
			} while(iter6 < iter3);
			// �� �� * ǥ�� ���� ����.
			
			// �ٹٲ�.
			System.out.println();
			
			// ���� ������ ���� ������ ����.
			iter3++;
		}while (iter3 < 5);
		// �� �� ���̾Ƹ�� ǥ�� ���� ����.
		
		// �Ʒ��� ���̾Ƹ�� ǥ��
		// �ٹٲ޿� ���� �ʱ�ȭ.
		iter3 = 1;
		
		// �ٹٲ��� ���� do while �� ����.
		do {
			// �� �� ����ǥ�ÿ� ���� �ʱ�ȭ.
			iter4 = 0;
			
			// ���� ǥ�� do while�� ����.
			do {
				System.out.printf(" ");
				// �� �� ����ǥ�ÿ� ���� �� ����
				iter4++;
			} while (iter4 < iter3);
			// ���� ǥ�� do while�� ��������.
			
			// �� �� * ǥ�ÿ� ���� �ʱ�ȭ 
			iter5 = 5; 
			
			// �� �� * ǥ�� do while�� ����
			do {
				System.out.printf("*");
				// �� �� * ǥ�ÿ� ���� �� ����
				iter5--;
			} while (iter5 > iter3);
			// �� �� * ǥ�� do while�� ���� ����.
			
			// �� �� * ǥ�ÿ� ���� �ʱ�ȭ.
			iter6 = 4;
			
			// �� �� * ǥ�� do while �� ����
			do {
				// ������ �ٿ��� *�� �ߺ� ǥ������ �ʱ� ���� ���ǹ�.
				if( iter3 != 4) {
					System.out.printf("*");
				}
				// �� �� * ǥ�ÿ� ���� �� ����.
				iter6--;
			} while(iter6 > iter3);
			// �� �� * ǥ�� do while�� ���� ����.
			
			// �ٹٲ�.
			System.out.println();
			
			// ������ ǥ�ø� ���� �� ����.
			iter3++;
		} while (iter3 < 5);
		// �� �ٲ� do while�� ���� ����.
		
		System.out.println("");
		System.out.println("");
		
	}
	
	// ���� ���� �Է� ���� �� console�� ǥ���ϱ� ���� �Լ�.
	public static void sungjeok_print(String in) {
		
		// �Լ� ȣ�� �� ������ parameter�� ������ ������ ��ȯ.
		int iTo = Integer.parseInt(in);
		
		System.out.println("");
		System.out.println("if�� ��� ");		
		System.out.println("");
		
		// �Էµ� ������ ���� ������ ����ϴ� if ���ǹ�.
		
		// ������ 91�� �̻��� ��� ��� 
		if ( iTo > 90) {
			System.out.println("������ A�Դϴ�.");
		}
		// ������ 81�� �̻��� ��� ���
		else if (iTo > 80) {
			System.out.println("������ B�Դϴ�");
		}
		// ������ 71�� �̻��� ��� ���
		else if (iTo > 70) {
			System.out.println("������ C�Դϴ�");
		}
		// ������ 61�� �̻��� ��� ���
		else if (iTo > 60) {
			System.out.println("������ D�Դϴ�.");
		}
		// ������ 60�� ������ ��� ���.
		else {
			System.out.println("������ F�Դϴ�.");
		}
		
		System.out.println("");
		System.out.println("switch case�� ��� ");		
		System.out.println("");
		
		// �Էµ� ������ ���� ���� ����ϴ� switch ��.
		switch(iTo) {
		case 100 : case 99 : case 98 : case 97 : case 96 : case 95 : case 94 : case 93 : case 92 : case 91 : 
			System.out.println("������ A�Դϴ�.");
			break;
		case 90 : case 89 : case 88 : case 87 : case 86 : case 85 : case 84 : case 83 : case 82 : case 81 : 
			System.out.println("������ B�Դϴ�.");
			break;
		case 80 : case 79 : case 78 : case 77 : case 76 : case 75 : case 74 : case 73 : case 72 : case 71 : 
			System.out.println("������ C�Դϴ�.");
			break;
		case 70 : case 69 : case 68 : case 67 : case 66 : case 65 : case 64 : case 63 : case 62 : case 61 : 
			System.out.println("������ D�Դϴ�.");
			break;
		default :
			System.out.println("������ F�Դϴ�.");
			break;
		}
	}
	
	// ������ 5�� �Է� �޾� ���Ͽ� ���� �ϰ� �װ��� �ٽ� �ҷ��ͼ� ȭ�鿡 ������ ǥ���ϴ� �Լ�.
	public static void sungjeok_file() throws IOException {
		
		// ���� �Է��� �ȳ��� ���� ���.		
		System.out.println("���� 5�� �Է�");
		
		// �ý��ۿ� �Է��� �ϱ� ���� ���� ����.
		Scanner input = new Scanner(System.in);
		
		// �Է� ���� Ƚ��
		int iter = 1;
		// ���Ͽ��� ���� �ҷ��ö� ������ ��ȯ�� ���� ���� ����.
		int iScore; 
		// ���Ͽ� �����ϱ� ���� ���ڿ� ����
		String sIn;
		// ���Ͽ��� ���� �ҷ� ������ ���� ���ڿ� ����.
		String sOut;
		
		// ���� ���� ���� ���� �� ���� �̸� ����.
		File file = new File("test1.txt");
		
		// ���Ͽ� �����ϱ� ���� ��ü ����.
        FileWriter writer = null;		

        // ���Ͽ� �����ϱ� ���� ��ü�� ���� ��ġ ���� ���� ������ ����.
        writer = new FileWriter(file, false);
        
        // ������ �Է� �ޱ� ���� �ݺ���.
		while (iter < 6) {
			// ���� �Է��� ���° ���� �˷��ֱ� ���� ��¹�.
			System.out.printf("�����Է� %d : ", iter);
			// �Էµ� �����͸� ���ڿ��� ������.
			sIn = input.nextLine();
			// �Է� ���� �����Ϳ� �ٹٲ� ���ڸ� �߰��Ͽ� ���ۿ� ����. 
			writer.write(sIn +"\r\n");
			// ���۸� ���� ���Ͽ� ����.
	        writer.flush();
	        
	        // ù��° ���� �Է½� ���� ���.
	        if (iter == 1) {
	        	sungjeok_print(sIn);
	        }
	        
	        // ���� ������ �ްų� while���� ���������� ���� ���� �� ����.
	        iter++;	        
		}
		
		System.out.println("���ϴݱ�");
		writer.close();
		
		// ���Ͽ��� ���� �о���� ���� ��ü ����.
		BufferedReader bReader = null;
		
		System.out.println("\n ���� ���� ���� ");
		// ���� ��ü�� �����б� ��ü���� �����Ѱ��� �ٽ� ���ۿ��� �о�ü� �ֵ��� �Ҵ�.
        bReader = new BufferedReader(new FileReader(file));
        
        // ���Ͽ��� ���̻� �о�� �� ���� ������ �ݺ�.
        while((sOut = bReader.readLine()) != null) {
        	// ���ۿ��� �о�� ���ڿ��� console�� ���.
            System.out.printf("%s : ", sOut);
            
            // ������ ���ڷ� ��ȯ.
            iScore = Integer.parseInt(sOut);
            
            // ������ �´� ���ǹ��� ����.
            if ( iScore > 90) {
    			System.out.println("������ A�Դϴ�.");
    		}
    		else if (iScore > 80) {
    			System.out.println("������ B�Դϴ�");
    		}
    		else if (iScore > 70) {
    			System.out.println("������ C�Դϴ�");
    		}
    		else if (iScore > 60) {
    			System.out.println("������ D�Դϴ�.");
    		}
    		else {
    			System.out.println("������ F�Դϴ�.");
    		}
        }
        
        // ������ �� �о������ bufferedreader, filereader�� ����.        
        bReader.close();   
	}

}

