package db.userDao.bankdao;

import models.Bank;

public class BankDao {
    public static Bank bankSession;
    public static void init(){
        bankSession=new Bank();
    }
}
