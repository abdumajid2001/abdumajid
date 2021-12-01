package models;

import enums.caseta.Status;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static uz.jl.utils.BaseUtil.generateUniqueID;

/**
 * @author Saydali Murodullayev, Wed 3:43 PM. 12/1/2021
 */
@Setter
@Getter

public class Bankomat {
    private String id;
    private String bankId;
    private Status status;

    public Bankomat(String bankId) {
        this.id=generateUniqueID();
        this.status=Status.ACTIVE;
        this.bankId=bankId;
    }
}

