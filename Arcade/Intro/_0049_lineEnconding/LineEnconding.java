package _0049_lineEnconding;

public class LineEnconding {

	public String lineEncoding(String s) {
		Integer count=1;
		String novaString= "";
		for(int i=1; i < s.length(); i++) {
			if(s.charAt(i)!= s.charAt(i-1)) {
				count++;
			}
			else {
				if(count==1) {
					novaString = novaString +s.charAt(i);
				} 
				else{
					novaString = count.toString() + s.charAt(i);
					count=1;
				}	
			}
		}
		
		return novaString;
	}
	
	/*
	 1. Percorrer cada letra. cont = 1. novaString= ''
	 2. Se a letra atual for igual a letra anterior.
	 	comparando indexAtual == index-1. onde o index inicial é =1.
	 		então cont++;
	 	se não 
	 		se cont for igual a 1.
	 			novaString recebe letraatual
	 		se não
	 			novaString recebe count + letraatual
	 	cont=1	
	 
	 */
}
