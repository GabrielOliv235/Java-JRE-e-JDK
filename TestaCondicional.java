public class TestaCondicional {
	
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 10;
		int quantidadePessoas = 1;
		
		if(idade >= 18) {
			System.out.println("voce tem 18 ou mais");
			System.out.println("pode entrar");
		} else {
			if(quantidadePessoas >= 2) { 
				System.out.println("voce pode entrar pois esta acompanhado");								
			}else {
			System.out.println("infelizmente voce não pode entrar");
			}
		}
				
	}
}


