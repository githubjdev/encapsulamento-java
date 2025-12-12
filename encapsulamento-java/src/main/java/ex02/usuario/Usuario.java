package ex02.usuario;

public class Usuario {
	private String login;
	private String senha;

	public Usuario(String login, String senha) {
		setLogin(login);
		setSenha(senha);
	}

	public String getLogin() {
		return login;
	}

	private void setLogin(String login) {
		if (login == null || login.isBlank()) {
			throw new IllegalArgumentException("Login inválido");
		}
		this.login = login;
	}

	private void setSenha(String senha) {
		if (senha.length() < 6) {
			throw new IllegalArgumentException("Senha fraca");
		}
		this.senha = senha;
	}
}