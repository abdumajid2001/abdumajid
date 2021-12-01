package models;

import enums.caseta.Status;
import lombok.Getter;
import lombok.Setter;

import static uz.jl.utils.BaseUtil.generateUniqueID;

/**
 * @author Saydali Murodullayev, Wed 3:43 PM. 12/1/2021
 */
@Setter
@Getter
public class Bank {
    private String id;
    private final String name = "Group2Bank";

    private Status status;

    public Bank() {
        this.id=generateUniqueID();
        this.status=Status.ACTIVE;
    }
}
