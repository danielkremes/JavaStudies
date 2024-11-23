package student.interfaces;

/**
 * Class responsible for providing authentication functionality.
 * It uses the {@link AllowAccess} interface to validate user credentials.
 */
public class FunctionAllowAccess {

    public boolean authenticate(AllowAccess access) {
        return access.allowAccess();
    }
}
