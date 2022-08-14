import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SQRService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqrs.csv")
    void testSquaresInBorders(int expected, int border1, int border2) {
        SQRService service = new SQRService();

        int actual = service.sqrsInBorders(border1, border2);

        assertEquals(expected, actual);
    }
}
