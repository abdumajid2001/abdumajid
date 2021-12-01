package Services.admin;

import com.google.gson.Gson;
import db.userDao.bankdao.BankDao;
import interfaces.AdminMethodInterfaces;
import models.Bankomat;

import java.io.*;

import static uz.jl.utils.Print.println;

public class AdminService implements AdminMethodInterfaces {
    @Override
    public void createBankomat() {
        try {
            File file=new File("src/main/resources/bankamat.txt");
            if(!file.exists()){
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(FileWriter fileWriter=new FileWriter("src/main/resources/bankamat.txt",true);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);) {
            String jsonData=new Gson().toJson(new Bankomat(BankDao.bankSession.getId()));
            bufferedWriter.append(jsonData).append("\n");
            println("Successfuly");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void block() {

    }

    @Override
    public void unblock() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void updateBlock() {

    }

    @Override
    public void unblockUpdate() {

    }

    @Override
    public void changeUpdate() {

    }

    @Override
    public void createBankcard() {

    }

    @Override
    public void blockBankcard() {

    }

    @Override
    public void unblockBankcard() {

    }
}
