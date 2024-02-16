public class LoginProcess {
    private static final String VALID_USERNAME = "Neoteric";
    private static final String VALID_PASSWORD = "TechJunkies";

    public boolean login(String username, String password) {
        return username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD);
    }

}
