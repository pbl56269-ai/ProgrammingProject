package roles;
public interface RoleInterface {
    public abstract boolean checkUsername(String enteredUsername);

    public abstract boolean checkPassword(String enteredPassword);
}
