package me.heng.model;

import java.util.Map;

/**
 * AUTHOR: wangdi
 * DATE: 04/07/2018
 * TIME: 8:18 PM
 */
public class PageInfo {

    /**
     * pageSize 每页显示多少行,默认10行
     */
    private Integer pageSize = 10;

    /**
     * 选取要想显示的页面,从1开始
     */
    private Integer currentPage = 1;

    /**
     * 按照每页显示的条数pageSize,总共有多少页
     */
    private Integer totalPage;
    /**
     *
     * 按照当前查询条件,是总共有多少条记录
     */
    private Integer totalItems;

    /**
     * 表名
     */
    private String tableName;

    /**
     * 表内进行排序的字段
     */
    private String orderClumn;

    /**
     * 表内能唯一标识记录的字段,一般配置为表的唯一id
     */
    private String primaryClumn;

    /**
     *  查询条件
     *  遍历的对象是Map.Entry时，index代表对应的key，item代表对应的value
     */
    private Map<String, Object> columnCondition;

    /**
     * 排序方式
     */
    private   OrderType orderType = OrderType.asc;

    public  enum OrderType {
        asc,desc
    }


    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getOrderClumn() {
        return orderClumn;
    }

    public void setOrderClumn(String orderClumn) {
        this.orderClumn = orderClumn;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    /**
     * select 查询语句时候的limit offset偏移.
     */
    private  Integer beginIndex;

    public Integer getBeginIndex() {
        this.beginIndex=(currentPage-1)*pageSize;
        return this.beginIndex;
    }

    public String getPrimaryClumn() {
        return primaryClumn;
    }

    public void setPrimaryClumn(String primaryClumn) {
        this.primaryClumn = primaryClumn;
    }

    public Map<String, Object> getColumnCondition() {
        return columnCondition;
    }

    public void setColumnCondition(Map<String, Object> columnCondition) {
        this.columnCondition = columnCondition;
    }
}
