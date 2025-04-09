/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;


public class LoaiDTO {
     private String strMaloai;
    private String strTenloai;
    public LoaiDTO(){
    }
    public LoaiDTO(String strMaloai,String strTenloai){
        this.strMaloai=strMaloai;
        this.strTenloai=strTenloai;
    }

    public String getStrMaloai() {
        return strMaloai;
    }

    public void setStrMaloai(String strMaloai) {
        this.strMaloai = strMaloai;
    }

    public String getStrTenloai() {
        return strTenloai;
    }

    public void setStrTenloai(String strTenloai) {
        this.strTenloai = strTenloai;
    }
    
}
