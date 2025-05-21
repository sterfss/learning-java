public interface Security {
    boolean verifyPassword(String password);
    void successMessage();
    void failureMessage();
}

