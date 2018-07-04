package me.heng.mapper;

import me.heng.model.PageInfo;

import java.util.List;

/**
 * AUTHOR: wangdi
 * DATE: 04/07/2018
 * TIME: 8:21 PM
 */
public interface PageInfoMapper {

    public PageInfo selectTotalInfo(PageInfo pageInfo);

    public List<String> selectPageItemPrimaryClumnValues(PageInfo pageInfo);
}
