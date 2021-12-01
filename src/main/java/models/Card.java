package models;

import enums.caseta.CardType;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Saydali Murodullayev, Wed 3:49 PM. 12/1/2021
 */
@Getter
@Setter
public class Card {
    private String id;
    private String userId;
    private String cardNumber; //16 talik raqami
    private int expiryDate; // amal qilish muddati
    private int pinCode;
    private CardType cardType;


}
