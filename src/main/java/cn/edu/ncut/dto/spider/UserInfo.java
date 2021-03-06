package cn.edu.ncut.dto.spider;

import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

@Table(name = "tb_userinfo")
public class UserInfo {
    private Integer id;

    private String userno;

    private String name;

    private String signature;

    private String location;

    private Date time;

    private String introduction;

    private Integer reading;

    private Integer hasread;

    private Integer wantread;

    private Integer followees;

    private Integer followers;

    private String pic;


    @Transient
    private String statisticName;

    /**
     * 查询结果数量
     */
    @Transient
    private Integer statisticValue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserno() {
        return userno;
    }

    public void setUserno(String userno) {
        this.userno = userno == null ? null : userno.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public Integer getReading()
    {
        return reading;
    }

    public void setReading(Integer reading)
    {
        this.reading = reading;
    }

    public Integer getHasread()
    {
        return hasread;
    }

    public void setHasread(Integer hasread)
    {
        this.hasread = hasread;
    }

    public Integer getWantread()
    {
        return wantread;
    }

    public void setWantread(Integer wantread)
    {
        this.wantread = wantread;
    }

    public Integer getFollowees()
    {
        return followees;
    }

    public void setFollowees(Integer followees)
    {
        this.followees = followees;
    }

    public Integer getFollowers()
    {
        return followers;
    }

    public void setFollowers(Integer followers)
    {
        this.followers = followers;
    }

    public String getPic()
    {
        return pic;
    }

    public void setPic(String pic)
    {
        this.pic = pic;
    }

    public String getStatisticName() {
        return statisticName;
    }

    public void setStatisticName(String statisticName) {
        this.statisticName = statisticName;
    }

    public Integer getStatisticValue() {
        return statisticValue;
    }

    public void setStatisticValue(Integer statisticValue) {
        this.statisticValue = statisticValue;
    }
}