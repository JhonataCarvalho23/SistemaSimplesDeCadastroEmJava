import java.util.Scanner;

public class Usuarios {
	
	Scanner sc = new Scanner(System.in);
	
	private String nome;
	private String nomeDeUsuario;
	private String senha;
	
	public String getNome(){
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getNomeDeUsuario() {
		return nomeDeUsuario;
	}
	public void setNomeDeUsuario(String nomeDeUsuario) {
		this.nomeDeUsuario = nomeDeUsuario;
	}
	
	
	public void setSenha(String senha){
		this.senha = senha;
	}
	
	public void mostrarOpcoes(){
		int opcao;
		System.out.println("=========================\n"
				+ "   Sistema de Cadastro\n"
				+ "=========================\n"
				+ "O que você deseja fazer? \n"
				+ "1- Criar Usuario \n"
				+ "2- Ver perfil \n"
				+ "3- Fazer login \n"
				+ "4- Sair \n"
				+ "Digite o número da opção desejada: ");
		opcao = sc.nextInt();
		sc.nextLine();
	}
	
	public void criarUsuario(){
		
		// nome
		System.out.println("\nDigite o seu nome: ");
		this.nome = sc.nextLine();
		
		// nome de usuario
		System.out.println("Digite um nome de usuário: ");
		this.nomeDeUsuario = sc.nextLine();
		
		// Senha 
		System.out.println("Digite uma senha forte com no minimo 5 caracteres: ");
		String senha = sc.nextLine();
		if (senha.length() > 2){
			System.out.println("Deu bom");
		} 
		System.out.println(senha);
		
	}
	
	public static void main(String[] args){
		Usuarios user1 = new Usuarios();
		
		user1.mostrarOpcoes();
		user1.criarUsuario();
	}
}