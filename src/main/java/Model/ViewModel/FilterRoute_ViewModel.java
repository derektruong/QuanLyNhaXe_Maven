package Model.ViewModel;

import java.util.Date;

public class FilterRoute_ViewModel {
    private Integer idFilter;
    private byte[] picture;
    private String typeName;
    private String startStation;
    private String destStation;
    private Date departTime;
    private int duration;




    public Integer getIdFilter() {
        return idFilter;
    }

    public void setIdFilter(Integer idFilter) {
        this.idFilter = idFilter;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }

    public String getDestStation() {
        return destStation;
    }

    public void setDestStation(String destStation) {
        this.destStation = destStation;
    }

    public Date getDepartTime() {
        return departTime;
    }

    public void setDepartTime(Date departTime) {
        this.departTime = departTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }



    public FilterRoute_ViewModel(Integer idFilter, byte[] picture, String typeName, String startStation, String destStation, Date departTime, int duration) {
        this.idFilter = idFilter;
        this.picture = picture;
        this.typeName = typeName;
        this.startStation = startStation;
        this.destStation = destStation;
        this.departTime = departTime;
        this.duration = duration;
    }
}
