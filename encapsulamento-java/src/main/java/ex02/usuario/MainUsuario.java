package ex02.usuario;

public class MainUsuario {
	public static void main(String[] args) {
		Usuario user = new Usuario("admin", "123456");
		System.out.println(user.getLogin());
	}
}