import java.util.Iterator;

public class stringsDemo {

	public static void main(String[] args) {
		String message = "Bugün hava çok güzel.";
		System.out.println(message);

		/*		
 		System.out.println("Eleman sayısı = " + message.length()); // string'in uzunluğunu verir
		System.out.println("5. eleman: " + message.charAt(4)); // 5. elaman demek, 4.index demektir
		System.out.println(message.concat(" Yaşasın!")); // 2 stirng concat metodu ile birleşir
		System.out.println(message.startsWith("A")); // A ile mi başlıyor sorusuna y/n döner
		System.out.println(message.endsWith(".")); // . ile mi bitiyor sorusuna y/n döner
		char[] karakterler = new char[5];
		message.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(message.indexOf('a')); // a harfinin hangi basamakta olduğunu gösterir. bir kez bulur
		System.out.println(message.indexOf("av")); // av stringinin hangi basamakta olduğunu gösterir. bir kez bulur
		System.out.println(message.lastIndexOf("a")); // a harfinin sondan hangi basamk olduğunu gösterir. bir kez bulur
		*/
		
		String newMessage = message.replace(' ', '-');
		System.out.println( newMessage);
		System.out.println(message.substring(2));	//2. indeksten itibaren yazar
		System.out.println(message.substring(2,5));	//2. indeksten başlar, 5'te biter. 5 dahil değil
		
		for (String kelime: message.split(" ")) {	// boşluğa göre kelimeleri ayırır
			System.out.println(kelime);
		}
		
		System.out.println(message.toLowerCase());	//tüm karakterleri küçük yapar
		System.out.println(message.toUpperCase());	//tüm karakterleri büyük yapar
		System.out.println(message.trim());	//baştaki ve sondaki boşlukları götürür
	}

}
