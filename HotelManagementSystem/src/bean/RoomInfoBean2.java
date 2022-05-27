/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author RG
 */
public class RoomInfoBean2 {
     private String room_no,id;
    private String beds, category;
    private boolean  tv,phone_service, wifi, gizer;

    public String getRoom_no() {
        return room_no;
    }

    public void setRoom_no(String room_no) {
        this.room_no = room_no;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBeds() {
        return beds;
    }

    public void setBeds(String beds) {
        this.beds = beds;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public boolean isPhone_service() {
        return phone_service;
    }

    public void setPhone_service(boolean phone_service) {
        this.phone_service = phone_service;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isGizer() {
        return gizer;
    }

    public void setGizer(boolean gizer) {
        this.gizer = gizer;
    }
    
    
}
