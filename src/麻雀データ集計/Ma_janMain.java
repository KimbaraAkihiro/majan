package 麻雀データ集計;

public class Ma_janMain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Kiroku tateisi = new Kiroku("立石");
		Kiroku yajima = new Kiroku("矢島");
		Kiroku amemiya = new Kiroku("雨宮");
		Kiroku kimbara = new Kiroku("金原");
		Kiroku nei = new Kiroku("根井");
		Kiroku sigeno = new Kiroku("滋野");
		Kiroku mori = new Kiroku("森");
		Kiroku sueoka = new Kiroku("末岡");
		Kiroku shoji = new Kiroku("庄司");


		//1月1日
		//①
		tateisi.kekka(+72,1);
		kimbara.kekka(+15,2);
		amemiya.kekka(-21,3);
		yajima.kekka(-66, 4);
		//②
		tateisi.kekka(-22, 3);
		kimbara.kekka(+76, 1);
		amemiya.kekka(-58, 4);
		yajima.kekka(+4, 2);

		//1月20日
		//①
		nei.kekka(+3, 2);
		kimbara.kekka(-20, 3);
		amemiya.kekka(-45, 4);
		tateisi.kekka(+62, 1);
		//②
		nei.kekka(-61, 4);
		kimbara.kekka(-30, 3);
		amemiya.kekka(+17, 2);
		tateisi.kekka(+74, 1);

		//2月10日
		//①
		tateisi.kekka(-26, 3);
		sigeno.kekka(+54, 1);
		yajima.kekka(+16, 2);
		mori.kekka(-44, 4);
		//②
		tateisi.kekka(+75, 1);
		sigeno.kekka(-34, 3);
		yajima.kekka(-58, 4);
		mori.kekka(+17, 2);

		//2月16日
		//①
		tateisi.kekka(-44, 4);
		yajima.kekka(-21, 3);
		kimbara.kekka(8, 2);
		sigeno.kekka(57, 1);
		//②
		tateisi.kekka(-50, 4);
		yajima.kekka(9, 2);
		kimbara.kekka(64, 1);
		amemiya.kekka(-23, 3);
		//③
		tateisi.kekka(-47, 4);
		yajima.kekka(5, 2);
		sigeno.kekka(57, 1);
		amemiya.kekka(-15, 3);

		//2月23日
		//①
		yajima.kekka(53, 1);
		tateisi.kekka(-50, 4);
		sueoka.kekka(10, 2);
		kimbara.kekka(-13, 3);

		//②
		yajima.kekka(61, 1);
		tateisi.kekka(8, 2);
		sueoka.kekka(-22 ,3);
		kimbara.kekka(-47,4);

		//2月29日
		//①
		yajima.kekka(-23, 3);
		kimbara.kekka(9, 2);
		shoji.kekka(-47,4);
		tateisi.kekka(61, 1);
		//②
		yajima.kekka(-45, 4);
		kimbara.kekka(9, 2);
		shoji.kekka(57, 1);
		sueoka.kekka(-21, 3);
		//③
		yajima.kekka(57, 1);
		shoji.kekka(-47, 4);
		tateisi.kekka(13, 2);
		sueoka.kekka(-23, 3);
		//④
		yajima.kekka(9, 2);
		kimbara.kekka(65, 1);
		shoji.kekka(-60,4);
		sueoka.kekka(-14, 3);







		//表示
		tateisi.hyouji();
		yajima.hyouji();
		kimbara.hyouji();
		amemiya.hyouji();
		nei.hyouji();
		mori.hyouji();
		sigeno.hyouji();
		sueoka.hyouji();
		shoji.hyouji();









	}

}
