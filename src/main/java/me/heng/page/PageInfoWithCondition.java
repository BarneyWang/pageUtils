package me.heng.page;

import me.heng.model.PageInfo;

import java.io.Serializable;

/**
 * AUTHOR: wangdi
 * DATE: 04/07/2018
 * TIME: 8:17 PM
 */
public class PageInfoWithCondition implements Serializable {

    /**
     * 查询条件
     */
    private String condition;

    /**
     * 分页信息,入参时currentPage,pageSize必须要传递,否则默认currentPage为1,pagSize为10
     */
    private PageInfo pageInfo;

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }
}
