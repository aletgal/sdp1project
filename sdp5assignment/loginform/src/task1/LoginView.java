package task1;

public interface LoginView {
    void showLoginSuccess();
    void showLoginError(String message);
    String getUsername();
    String getPassword();
}
