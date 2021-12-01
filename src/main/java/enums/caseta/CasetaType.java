package enums.caseta;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Saydali Murodullayev, Wed 4:55 PM. 12/1/2021
 */
@Getter
@AllArgsConstructor
public enum CasetaType {
    UNMING(10000),
    YIGIRMAMING(20000),
    ELLIKMING(50000),
    YUZMING(100000);

    private final int amount;
}
