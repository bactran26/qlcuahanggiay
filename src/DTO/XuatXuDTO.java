/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author cuong
 */
public class XuatXuDTO {
     private String strMaxuatxu;
    private String strTennuoc;
    public XuatXuDTO(){
    }
    public XuatXuDTO(String strMaxuatxu,String strTennuoc){
        this.strMaxuatxu=strMaxuatxu;
        this.strTennuoc=strTennuoc;
    }

    public String getStrMaxuatxu() {
        return strMaxuatxu;
    }

    public void setStrMaxuatxu(String strMaxuatxu) {
        this.strMaxuatxu = strMaxuatxu;
    }

    public String getStrTennuoc() {
        return strTennuoc;
    }

    public void setStrTennuoc(String strTennuoc) {
        this.strTennuoc = strTennuoc;
    }
}
