/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author cuong
 */
public class MauSacDTO {
     private String strMamau;
    private String strTenmau;
    public MauSacDTO(){    
    }
    public MauSacDTO(String strMamau,String strTenmau){
        this.strMamau=strMamau;
        this.strTenmau=strTenmau;
    }

    public String getStrMamau() {
        return strMamau;
    }

    public void setStrMamau(String strMamau) {
        this.strMamau = strMamau;
    }

    public String getStrTenmau() {
        return strTenmau;
    }

    public void setStrTenmau(String strTenmau) {
        this.strTenmau = strTenmau;
    }
}
