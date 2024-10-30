package task1;

public class LoginPresenter {
    private LoginView view;

    public LoginPresenter(LoginView view) {
        this.view = view;
    }

    public void validateCredentials(String username, String password) {
        if (username.equals("admin") && password.equals("1234")) {
            view.showLoginSuccess();
        } else {
            view.showLoginError("Invalid credentials. Try again.");
        }
    }
}
