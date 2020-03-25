package 麻雀データ集計;

public class Kiroku {
	String name;
	int siaisu = 0;
	float point = 0;
	float icchaku = 0;
	float nichaku = 0;
	float sanchaku = 0;
	float yonchaku = 0;
	double maxpoint = -1000;
	double lowestpoint =1000;

	Kiroku(String n){
		this.name = n;
	}


   void kekka(double p, int juni) {
	   siaisu++;
	   this.point += p;
	   if(p > maxpoint) {
		   maxpoint = p;
	   }
	   if(p < lowestpoint) {
		   lowestpoint = p;
	   }
	   switch(juni) {
	   case 1:
		   icchaku += 1;
		   break;
	   case 2:
		   nichaku += 1;
		   break;
	   case 3:
		   sanchaku += 1;
		   break;
	   case 4:
		   yonchaku += 1;
		   break;
	   }
   }
	void hyouji() {
		System.out.println("【" + this.name + "】" + "　　計" + siaisu + "半荘" + "\n");
		System.out.println("獲得点数　" + point + "点" + "\n");
		System.out.println("1着　" + icchaku + "回　" + icchaku / siaisu * 100.0 + "％");
		System.out.println("2着　" + nichaku + "回　" + nichaku / siaisu * 100 + "％");
		System.out.println("3着　" + sanchaku + "回　" + sanchaku / siaisu * 100 + "％");
		System.out.println("4着　" + yonchaku + "回　" + yonchaku / siaisu * 100 + "％");
		System.out.println();
		System.out.println("平均得点　" + point / siaisu +"点");
		System.out.println("平均着順　" + (icchaku + nichaku * 2 + sanchaku * 3 + yonchaku *4) / siaisu + "着");
		System.out.println();
		System.out.println("最高得点　" + maxpoint + "点");
		System.out.println("最低得点　"+ lowestpoint + "点");
		System.out.println("\n" + "\n");


	}



}

