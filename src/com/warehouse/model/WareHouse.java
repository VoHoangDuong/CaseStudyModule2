package com.warehouse.model;

public class WareHouse {
    private String maSP;
    private String name;
    private int quantity;
    private double unitPrice;
    private String MFG;
    private String EXP;
    private String origin;
    private long soNgayConLai;

    public WareHouse(String maSP, String name, int quantity, double unitPrice, String MFG, String EXP, String origin, long soNgayConLai){
        this.maSP = maSP;
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.MFG = MFG;
        this.EXP = EXP;
        this.origin = origin;
        this.soNgayConLai = soNgayConLai;
    }

    public WareHouse(String maSP, String name, int quantity, double unitPrice, String MFG, String EXP, String origin){
        this.maSP = maSP;
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.MFG = MFG;
        this.EXP = EXP;
        this.origin = origin;
    }

    public WareHouse(){

    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getMFG() {
        return MFG;
    }

    public void setMFG(String MFG) {
        this.MFG = MFG;
    }

    public String getEXP() {
        return EXP;
    }

    public void setEXP(String EXP) {
        this.EXP = EXP;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public long getSoNgayConLai(){
        return soNgayConLai;
    }

    public void setSoNgayConLai(long soNgayConLai){
        this.soNgayConLai = soNgayConLai;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof WareHouse){
            WareHouse wareHouse1 = (WareHouse) o;
            if (wareHouse1.getName().equals(this.name)){
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }

    public String toStringAll(){
        return "Thông tin: | " + "Mã: " + String.format("%-8s|",maSP) + " Tên : " + String.format("%-16s|",name) + " Số lượng: " + String.format("%-6s|",quantity) + " Đơn giá: " + String.format("%-12s|",unitPrice) + " Nguồn gốc: " + String.format("%-12s|",origin) + " Ngày sản xuất: " + String.format("%-11s|",MFG) + " Hạn sử dụng: " + String.format("%-11s|",EXP);
    }

    public String toStringEXP(){
        return "Thông tin: | " + "Mã: " + String.format("%-8s|",maSP) + " Tên: " + String.format("%-14s|",name) + " Ngày sản xuất: " + String.format("%-11s|",MFG) + " Hạn sử dụng: " + String.format("%-11s|",EXP) + " Còn lại: " + String.format("%-5s",soNgayConLai) + " ngày " + " |";
    }

    @Override
    public String toString() {
        return "Thông tin: | " + "Mã: " + String.format("%-8s|",maSP) + " Tên : " + String.format("%-16s|",name) + " Số lượng: " + String.format("%-6s|",quantity) + " Đơn giá: " + String.format("%-12s|",unitPrice) + " Nguồn gốc: " + String.format("%-12s|",origin);
    }

    public String toStringCSV(){
        return maSP+","+name+","+quantity+","+unitPrice+","+MFG+","+EXP+","+origin+","+soNgayConLai+"\n";
    }
}
