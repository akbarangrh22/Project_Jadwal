package com.example.project_jadwal;

public class User {
    private String id, nama, password, waktusholat, subuh, dzuhur, ashar, maghrib, isya;

    public User() {

    }
    public User(String nama, String password, String waktusholat, String subuh,String dzuhur, String ashar,String maghrib, String isya) {
        this.nama = nama;
        this.password = password;
        this.waktusholat = waktusholat;
        this.subuh = subuh;
        this.dzuhur = dzuhur;
        this.ashar = ashar;
        this.maghrib = maghrib;
        this.isya = isya;
    }

    public String getId() {
        return id;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    public String getNama(){return nama;}
    public void setNama() {
        this.nama = nama;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword() {
        this.password = password;
    }
    public String getWaktusholat() {
        return waktusholat;
    }
    public void setWaktusholat() {
        this.waktusholat = waktusholat;
    }
    public String getSubuh() {
        return subuh;
    }
    public void setSubuh() {
        this.subuh = subuh;
    }
    public String getDzuhur() {
        return dzuhur;
    }
    public void setDzuhur() {
        this.dzuhur = dzuhur;
    }
    public String getAshar() {
        return ashar;
    }
    public void setAshar() {
        this.ashar = ashar;
    }
    public String getMaghrib() {
        return maghrib;
    }
    public void setMaghrib() {
        this.maghrib = maghrib;
    }
    public String getIsya() {
        return isya;
    }
    public void setIsya() {
        this.isya = isya; }
}
