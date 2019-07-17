package com.example.demo.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_demo_generator")
public class Generator {
    /**
     * 4个字节  范围(-2147483648~2147483647)
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 1个字节  范围(-128~127)
     */
    @Column(name = "tinyint_value")
    private Byte tinyintValue;

    /**
     * 2个字节  范围(-32768~32767)
     */
    @Column(name = "smallint_value")
    private Short smallintValue;

    /**
     * 8个字节  范围(+-9.22*10的18次方)
     */
    @Column(name = "bigint_value")
    private Long bigintValue;

    /**
     * 对DECIMAL(M,D) ，如果M>D，为M+2否则为D+2  范围：依赖于M和D的值
     */
    @Column(name = "decimal_value")
    private BigDecimal decimalValue;

    @Column(name = "varchar_value")
    private String varcharValue;

    @Column(name = "double_value")
    private Double doubleValue;

    /**
     * YYYY-MM-DD
     */
    @Column(name = "date_value")
    private Date dateValue;

    /**
     * HH:MM:SS
     */
    @Column(name = "time_value")
    private Date timeValue;

    /**
     * YYYY-MM-DD HH:MM:SS
     */
    @Column(name = "datetime_value")
    private Date datetimeValue;

    /**
     * YYYY
     */
    @Column(name = "year_value")
    private Date yearValue;

    /**
     * YYYYMMDD HHMMSS 时间戳
     */
    @Column(name = "timestamp_value")
    private Date timestampValue;

    /**
     * 二进制形式的长文本数据 0-65 535字节
     */
    @Column(name = "blob_value")
    private byte[] blobValue;

    /**
     * 获取4个字节  范围(-2147483648~2147483647)
     *
     * @return id - 4个字节  范围(-2147483648~2147483647)
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置4个字节  范围(-2147483648~2147483647)
     *
     * @param id 4个字节  范围(-2147483648~2147483647)
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取1个字节  范围(-128~127)
     *
     * @return tinyint_value - 1个字节  范围(-128~127)
     */
    public Byte getTinyintValue() {
        return tinyintValue;
    }

    /**
     * 设置1个字节  范围(-128~127)
     *
     * @param tinyintValue 1个字节  范围(-128~127)
     */
    public void setTinyintValue(Byte tinyintValue) {
        this.tinyintValue = tinyintValue;
    }

    /**
     * 获取2个字节  范围(-32768~32767)
     *
     * @return smallint_value - 2个字节  范围(-32768~32767)
     */
    public Short getSmallintValue() {
        return smallintValue;
    }

    /**
     * 设置2个字节  范围(-32768~32767)
     *
     * @param smallintValue 2个字节  范围(-32768~32767)
     */
    public void setSmallintValue(Short smallintValue) {
        this.smallintValue = smallintValue;
    }

    /**
     * 获取8个字节  范围(+-9.22*10的18次方)
     *
     * @return bigint_value - 8个字节  范围(+-9.22*10的18次方)
     */
    public Long getBigintValue() {
        return bigintValue;
    }

    /**
     * 设置8个字节  范围(+-9.22*10的18次方)
     *
     * @param bigintValue 8个字节  范围(+-9.22*10的18次方)
     */
    public void setBigintValue(Long bigintValue) {
        this.bigintValue = bigintValue;
    }

    /**
     * 获取对DECIMAL(M,D) ，如果M>D，为M+2否则为D+2  范围：依赖于M和D的值
     *
     * @return decimal_value - 对DECIMAL(M,D) ，如果M>D，为M+2否则为D+2  范围：依赖于M和D的值
     */
    public BigDecimal getDecimalValue() {
        return decimalValue;
    }

    /**
     * 设置对DECIMAL(M,D) ，如果M>D，为M+2否则为D+2  范围：依赖于M和D的值
     *
     * @param decimalValue 对DECIMAL(M,D) ，如果M>D，为M+2否则为D+2  范围：依赖于M和D的值
     */
    public void setDecimalValue(BigDecimal decimalValue) {
        this.decimalValue = decimalValue;
    }

    /**
     * @return varchar_value
     */
    public String getVarcharValue() {
        return varcharValue;
    }

    /**
     * @param varcharValue
     */
    public void setVarcharValue(String varcharValue) {
        this.varcharValue = varcharValue;
    }

    /**
     * @return double_value
     */
    public Double getDoubleValue() {
        return doubleValue;
    }

    /**
     * @param doubleValue
     */
    public void setDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
    }

    /**
     * 获取YYYY-MM-DD
     *
     * @return date_value - YYYY-MM-DD
     */
    public Date getDateValue() {
        return dateValue;
    }

    /**
     * 设置YYYY-MM-DD
     *
     * @param dateValue YYYY-MM-DD
     */
    public void setDateValue(Date dateValue) {
        this.dateValue = dateValue;
    }

    /**
     * 获取HH:MM:SS
     *
     * @return time_value - HH:MM:SS
     */
    public Date getTimeValue() {
        return timeValue;
    }

    /**
     * 设置HH:MM:SS
     *
     * @param timeValue HH:MM:SS
     */
    public void setTimeValue(Date timeValue) {
        this.timeValue = timeValue;
    }

    /**
     * 获取YYYY-MM-DD HH:MM:SS
     *
     * @return datetime_value - YYYY-MM-DD HH:MM:SS
     */
    public Date getDatetimeValue() {
        return datetimeValue;
    }

    /**
     * 设置YYYY-MM-DD HH:MM:SS
     *
     * @param datetimeValue YYYY-MM-DD HH:MM:SS
     */
    public void setDatetimeValue(Date datetimeValue) {
        this.datetimeValue = datetimeValue;
    }

    /**
     * 获取YYYY
     *
     * @return year_value - YYYY
     */
    public Date getYearValue() {
        return yearValue;
    }

    /**
     * 设置YYYY
     *
     * @param yearValue YYYY
     */
    public void setYearValue(Date yearValue) {
        this.yearValue = yearValue;
    }

    /**
     * 获取YYYYMMDD HHMMSS 时间戳
     *
     * @return timestamp_value - YYYYMMDD HHMMSS 时间戳
     */
    public Date getTimestampValue() {
        return timestampValue;
    }

    /**
     * 设置YYYYMMDD HHMMSS 时间戳
     *
     * @param timestampValue YYYYMMDD HHMMSS 时间戳
     */
    public void setTimestampValue(Date timestampValue) {
        this.timestampValue = timestampValue;
    }

    /**
     * 获取二进制形式的长文本数据 0-65 535字节
     *
     * @return blob_value - 二进制形式的长文本数据 0-65 535字节
     */
    public byte[] getBlobValue() {
        return blobValue;
    }

    /**
     * 设置二进制形式的长文本数据 0-65 535字节
     *
     * @param blobValue 二进制形式的长文本数据 0-65 535字节
     */
    public void setBlobValue(byte[] blobValue) {
        this.blobValue = blobValue;
    }

    public static Generator defaultInstance() {
        Generator instance = new Generator();
        return instance;
    }
}