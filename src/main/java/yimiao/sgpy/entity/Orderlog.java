package yimiao.sgpy.entity;

import java.util.Date;

/**
 * 预订日志信息
 * @TableName orderlog
 */
public class Orderlog {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 代预订订单id
     */
    private String orderid;

    /**
     * 代预订订单状态
     */
    private String orderstatus;

    /**
     * 订单开始时间，不带日期
     */
    private Date starttime;

    /**
     * 订单结束时间，不带日期
     */
    private Date endtime;

    /**
     * 订单开始日期，不带时间
     */
    private Date startdate;

    /**
     * 订单结束日期，不带时间
     */
    private Date enddate;

    /**
     * 订单时长
     */
    private Integer duration;

    /**
     * 门店名称
     */
    private String storename;

    /**
     * 房间名称
     */
    private String roomname;

    /**
     * 开始时间，带日期
     */
    private Date fullstarttime;

    /**
     * 结束时间，带日期
     */
    private Date fullendtime;

    /**
     * 官方订单返回给用户的订单号码
     */
    private String orderno;

    /**
     * 订单支付时间
     */
    private Date paytime;

    /**
     * 订单支付金额
     */
    private Double paidamount;

    /**
     * 官方订单id
     */
    private String xcxorderid;

    /**
     * 官方订单状态
     */
    private String xcxorderstauts;

    /**
     * 门店电话
     */
    private String storephone;

    /**
     * 用户的微信openid
     */
    private String openid;

    /**
     * 订单原价
     */
    private Double originalamount;

    /**
     * 用户纬度
     */
    private String latitude;

    /**
     * 用户经度
     */
    private String longitude;

    /**
     * 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 代预订订单id
     */
    public String getOrderid() {
        return orderid;
    }

    /**
     * 代预订订单id
     */
    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    /**
     * 代预订订单状态
     */
    public String getOrderstatus() {
        return orderstatus;
    }

    /**
     * 代预订订单状态
     */
    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus;
    }

    /**
     * 订单开始时间，不带日期
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * 订单开始时间，不带日期
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * 订单结束时间，不带日期
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * 订单结束时间，不带日期
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * 订单开始日期，不带时间
     */
    public Date getStartdate() {
        return startdate;
    }

    /**
     * 订单开始日期，不带时间
     */
    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    /**
     * 订单结束日期，不带时间
     */
    public Date getEnddate() {
        return enddate;
    }

    /**
     * 订单结束日期，不带时间
     */
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    /**
     * 订单时长
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * 订单时长
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * 门店名称
     */
    public String getStorename() {
        return storename;
    }

    /**
     * 门店名称
     */
    public void setStorename(String storename) {
        this.storename = storename;
    }

    /**
     * 房间名称
     */
    public String getRoomname() {
        return roomname;
    }

    /**
     * 房间名称
     */
    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    /**
     * 开始时间，带日期
     */
    public Date getFullstarttime() {
        return fullstarttime;
    }

    /**
     * 开始时间，带日期
     */
    public void setFullstarttime(Date fullstarttime) {
        this.fullstarttime = fullstarttime;
    }

    /**
     * 结束时间，带日期
     */
    public Date getFullendtime() {
        return fullendtime;
    }

    /**
     * 结束时间，带日期
     */
    public void setFullendtime(Date fullendtime) {
        this.fullendtime = fullendtime;
    }

    /**
     * 官方订单返回给用户的订单号码
     */
    public String getOrderno() {
        return orderno;
    }

    /**
     * 官方订单返回给用户的订单号码
     */
    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    /**
     * 订单支付时间
     */
    public Date getPaytime() {
        return paytime;
    }

    /**
     * 订单支付时间
     */
    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    /**
     * 订单支付金额
     */
    public Double getPaidamount() {
        return paidamount;
    }

    /**
     * 订单支付金额
     */
    public void setPaidamount(Double paidamount) {
        this.paidamount = paidamount;
    }

    /**
     * 官方订单id
     */
    public String getXcxorderid() {
        return xcxorderid;
    }

    /**
     * 官方订单id
     */
    public void setXcxorderid(String xcxorderid) {
        this.xcxorderid = xcxorderid;
    }

    /**
     * 官方订单状态
     */
    public String getXcxorderstauts() {
        return xcxorderstauts;
    }

    /**
     * 官方订单状态
     */
    public void setXcxorderstauts(String xcxorderstauts) {
        this.xcxorderstauts = xcxorderstauts;
    }

    /**
     * 门店电话
     */
    public String getStorephone() {
        return storephone;
    }

    /**
     * 门店电话
     */
    public void setStorephone(String storephone) {
        this.storephone = storephone;
    }

    /**
     * 用户的微信openid
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * 用户的微信openid
     */
    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * 订单原价
     */
    public Double getOriginalamount() {
        return originalamount;
    }

    /**
     * 订单原价
     */
    public void setOriginalamount(Double originalamount) {
        this.originalamount = originalamount;
    }

    /**
     * 用户纬度
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * 用户纬度
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * 用户经度
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * 用户经度
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Orderlog other = (Orderlog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getOrderstatus() == null ? other.getOrderstatus() == null : this.getOrderstatus().equals(other.getOrderstatus()))
            && (this.getStarttime() == null ? other.getStarttime() == null : this.getStarttime().equals(other.getStarttime()))
            && (this.getEndtime() == null ? other.getEndtime() == null : this.getEndtime().equals(other.getEndtime()))
            && (this.getStartdate() == null ? other.getStartdate() == null : this.getStartdate().equals(other.getStartdate()))
            && (this.getEnddate() == null ? other.getEnddate() == null : this.getEnddate().equals(other.getEnddate()))
            && (this.getDuration() == null ? other.getDuration() == null : this.getDuration().equals(other.getDuration()))
            && (this.getStorename() == null ? other.getStorename() == null : this.getStorename().equals(other.getStorename()))
            && (this.getRoomname() == null ? other.getRoomname() == null : this.getRoomname().equals(other.getRoomname()))
            && (this.getFullstarttime() == null ? other.getFullstarttime() == null : this.getFullstarttime().equals(other.getFullstarttime()))
            && (this.getFullendtime() == null ? other.getFullendtime() == null : this.getFullendtime().equals(other.getFullendtime()))
            && (this.getOrderno() == null ? other.getOrderno() == null : this.getOrderno().equals(other.getOrderno()))
            && (this.getPaytime() == null ? other.getPaytime() == null : this.getPaytime().equals(other.getPaytime()))
            && (this.getPaidamount() == null ? other.getPaidamount() == null : this.getPaidamount().equals(other.getPaidamount()))
            && (this.getXcxorderid() == null ? other.getXcxorderid() == null : this.getXcxorderid().equals(other.getXcxorderid()))
            && (this.getXcxorderstauts() == null ? other.getXcxorderstauts() == null : this.getXcxorderstauts().equals(other.getXcxorderstauts()))
            && (this.getStorephone() == null ? other.getStorephone() == null : this.getStorephone().equals(other.getStorephone()))
            && (this.getOpenid() == null ? other.getOpenid() == null : this.getOpenid().equals(other.getOpenid()))
            && (this.getOriginalamount() == null ? other.getOriginalamount() == null : this.getOriginalamount().equals(other.getOriginalamount()))
            && (this.getLatitude() == null ? other.getLatitude() == null : this.getLatitude().equals(other.getLatitude()))
            && (this.getLongitude() == null ? other.getLongitude() == null : this.getLongitude().equals(other.getLongitude()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getOrderstatus() == null) ? 0 : getOrderstatus().hashCode());
        result = prime * result + ((getStarttime() == null) ? 0 : getStarttime().hashCode());
        result = prime * result + ((getEndtime() == null) ? 0 : getEndtime().hashCode());
        result = prime * result + ((getStartdate() == null) ? 0 : getStartdate().hashCode());
        result = prime * result + ((getEnddate() == null) ? 0 : getEnddate().hashCode());
        result = prime * result + ((getDuration() == null) ? 0 : getDuration().hashCode());
        result = prime * result + ((getStorename() == null) ? 0 : getStorename().hashCode());
        result = prime * result + ((getRoomname() == null) ? 0 : getRoomname().hashCode());
        result = prime * result + ((getFullstarttime() == null) ? 0 : getFullstarttime().hashCode());
        result = prime * result + ((getFullendtime() == null) ? 0 : getFullendtime().hashCode());
        result = prime * result + ((getOrderno() == null) ? 0 : getOrderno().hashCode());
        result = prime * result + ((getPaytime() == null) ? 0 : getPaytime().hashCode());
        result = prime * result + ((getPaidamount() == null) ? 0 : getPaidamount().hashCode());
        result = prime * result + ((getXcxorderid() == null) ? 0 : getXcxorderid().hashCode());
        result = prime * result + ((getXcxorderstauts() == null) ? 0 : getXcxorderstauts().hashCode());
        result = prime * result + ((getStorephone() == null) ? 0 : getStorephone().hashCode());
        result = prime * result + ((getOpenid() == null) ? 0 : getOpenid().hashCode());
        result = prime * result + ((getOriginalamount() == null) ? 0 : getOriginalamount().hashCode());
        result = prime * result + ((getLatitude() == null) ? 0 : getLatitude().hashCode());
        result = prime * result + ((getLongitude() == null) ? 0 : getLongitude().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderid=").append(orderid);
        sb.append(", orderstatus=").append(orderstatus);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", startdate=").append(startdate);
        sb.append(", enddate=").append(enddate);
        sb.append(", duration=").append(duration);
        sb.append(", storename=").append(storename);
        sb.append(", roomname=").append(roomname);
        sb.append(", fullstarttime=").append(fullstarttime);
        sb.append(", fullendtime=").append(fullendtime);
        sb.append(", orderno=").append(orderno);
        sb.append(", paytime=").append(paytime);
        sb.append(", paidamount=").append(paidamount);
        sb.append(", xcxorderid=").append(xcxorderid);
        sb.append(", xcxorderstauts=").append(xcxorderstauts);
        sb.append(", storephone=").append(storephone);
        sb.append(", openid=").append(openid);
        sb.append(", originalamount=").append(originalamount);
        sb.append(", latitude=").append(latitude);
        sb.append(", longitude=").append(longitude);
        sb.append("]");
        return sb.toString();
    }
}