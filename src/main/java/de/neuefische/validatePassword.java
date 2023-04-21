package de.neuefische;

public class validatePassword {
    public static boolean validatePassword(String password)
    {
        var regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?!.*passwort)(?!.*123456).{8,}$";

        return password.matches(regex);
    }
}
