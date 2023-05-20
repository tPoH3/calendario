import java.util.Scanner;

//instrução1
//instrução2
//instrução3
//instrução4
//instrução5
//...

class calendario {
	
	static int ano, judeu, conta, islamico,calendario;
	
	public static void menu(){
			Scanner teclado = new Scanner(System.in);
			System.out.printf("Digite o ano que vc deseja converter: \n");
			ano = teclado.nextInt();
			
			if(ano<= 0)
					{
						
						System.out.print("O ano que vc digitou e invalido!!!\n");
						menu();
					}
			
					System.out.printf("Selecione o tipo de calendario que vc deseja converter: 1 - judeu | 2 - islamico\n");
					calendario = teclado.nextInt();			
					
				switch(calendario)
				{
						case 1:
						conta = ano + 3760;
						System.out.printf("O ano no calendario judeu e: \n"+conta);
						break;
						
						case 2:
						conta = ano - 579;
						System.out.printf("O ano no calendario islamico e: \n"+conta);
						break;
						

						
						default:
						System.out.printf("Insira uma opcao valida");
				}
				System.exit(0);
	}
	
	public static void main(String args[]){
	
			menu();
		
    
		
	}

}
