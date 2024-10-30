package task1;

import java.util.Scanner;

public class LoginForm implements LoginView {
    private LoginPresenter presenter;
    private Scanner scanner;

    public LoginForm() {
        this.presenter = new LoginPresenter(this);
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void showLoginSuccess() {
        System.out.println("Login successful!");
    }

    @Override
    public void showLoginError(String message) {
        System.out.println(message);
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    public void login() {
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        presenter.validateCredentials(username, password);
    }

    public static void main(String[] args) {
        LoginForm form = new LoginForm();
        form.login();
    }
}

