/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Spuda
 */
public class evidencijaModel {
    int turistId;
    String turistIme;
    String turistPrezime;
    String oibTurist;
    String mailTurist;
    String mobTurist;

    public evidencijaModel(int turistId,String turistIme, String turistPrezime, String oibTurist, String mailTurist, String mobTurist) {
        this.turistId = turistId;
        this.turistIme = turistIme;
        this.turistPrezime = turistPrezime;
        this.oibTurist = oibTurist;
        this.mailTurist = mailTurist;
        this.mobTurist = mobTurist;
        
    }
    public int getTuristId() {
        return turistId;
    }

    public void setTuristId(int turistId) {
        this.turistId = turistId;
    }

    public String getTuristIme() {
        return turistIme;
    }

    public void setTuristIme(String turistIme) {
        this.turistIme = turistIme;
    }

    public String getTuristPrezime() {
        return turistPrezime;
    }

    public void setTuristPrezime(String turistPrezime) {
        this.turistPrezime = turistPrezime;
    }

    public String getOibTurist() {
        return oibTurist;
    }

    public void setOibTurist(String oibTurist) {
        this.oibTurist = oibTurist;
    }

    public String getMailTurist() {
        return mailTurist;
    }

    public void setMailTurist(String mailTurist) {
        this.mailTurist = mailTurist;
    }

    public String getMobTurist() {
        return mobTurist;
    }

    public void setMobTurist(String mobTurist) {
        this.mobTurist = mobTurist;
    }
    
}
