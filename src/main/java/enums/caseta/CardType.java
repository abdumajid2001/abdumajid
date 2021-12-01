package enums.caseta;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Saydali Murodullayev, Wed 5:31 PM. 12/1/2021
 */
@Getter
@AllArgsConstructor
public enum CardType {
    HUMO(9860),
    UZCARD(8600),
    viza(5555),
    MasterCard(4444);
    private final int code;
}
