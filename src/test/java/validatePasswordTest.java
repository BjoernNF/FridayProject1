import de.neuefische.validatePassword;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class validatePasswordTest {
    @Test
    public void validatePasswordTest()
    {
        // GIVEN
        var goodPass = "NeueFischeSecretPass123";
        var badPass = "Fisch";

        // WHEN
        var ResultGood = validatePassword.validatePassword(goodPass);
        var ResultBad = validatePassword.validatePassword(badPass);

        // THEN
        Assertions.assertTrue(ResultGood);
        Assertions.assertFalse(ResultBad);
    }
}
