package com.sunyur.api.channel.common.base;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 
 * @Description:查询参数基类，含分页参数等
 * @author houzi
 * @date May 21, 2019 3:46:50 PM
 */
public class BaseParam implements Serializable {

    private static final long  serialVersionUID     = -6608380835822261826L;
    /**
     * 最大页面尺寸
     */
    private static final int   MAX_PAGE_SIZE        = 500;
    /**
     * 缺省页面尺寸
     */
    private static final int   DEFAULT_RESULT_COUNT = 10;
    /**
     * 缺省页号
     */
    private static final int   DEFAULT_PAGE_NUM     = 1;
    /**
     * 排序趋势 ASC-升序势
     */
    public static final String ORDER_BY_TREND_ASC   = "ASC";
    /**
     * 排序趋势 DESC-降序
     */
    public static final String ORDER_BY_TREND_DESC  = "DESC";

    /**
     * 页号
     */
    private int                page                 = DEFAULT_PAGE_NUM;
    /**
     * 页面尺寸
     */
    private int                pageSize             = DEFAULT_RESULT_COUNT;

    /**
     * @Description:获取起始记录数
     * @author ludabing
     * @version 1.0
     * @date 2018年11月15日 下午3:24:22
     * @return
     */
    public int getStartNum() {

        this.adjustPage();

        int start = (page - 1) * pageSize;
        return start;
    }

    /**
     * @Description:获取结束记录数
     * @author ludabing
     * @version 1.0
     * @date 2018年11月15日 下午3:24:31
     * @return
     */
    public int getEndNum() {
        int end = getStartNum() + pageSize - 1;
        return end;
    }

    /**
     * @Description:获取页号
     * @author ludabing
     * @version 1.0
     * @date 2018年11月15日 下午3:24:39
     * @return
     */
    public int getPage() {
        return page;
    }

    /**
     * @Description:设置页号
     * @author ludabing
     * @version 1.0
     * @date 2018年11月15日 下午3:24:54
     * @param page
     */
    public void setPage(int page) {
        this.page = page >= DEFAULT_PAGE_NUM ? page : DEFAULT_PAGE_NUM;
    }

    /**
     * @Description:获取页面尺寸
     * @author ludabing
     * @version 1.0
     * @date 2018年11月15日 下午3:25:01
     * @return
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * @Description:设置页面尺寸
     * @author ludabing
     * @version 1.0
     * @date 2018年11月15日 下午3:25:10
     * @param pageSize
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize <= 0 ? DEFAULT_RESULT_COUNT : pageSize > MAX_PAGE_SIZE ? MAX_PAGE_SIZE : pageSize;
    }

    /**
     * @Description:获取最大页面尺寸
     * @author ludabing
     * @version 1.0
     * @date 2018年11月15日 下午3:25:10
     * @return
     */
    public int maxResultCount() {
        return MAX_PAGE_SIZE;
    }

    /**
     * @Description:校正页面尺寸和页号
     * @author ludabing
     * @version 1.0
     * @date 2018年11月15日 下午3:25:10
     */
    private void adjustPage() {
        // 校正页面尺寸
        if (pageSize <= 0 || pageSize > MAX_PAGE_SIZE) {
            pageSize = DEFAULT_RESULT_COUNT;
        }
        // 校正页号
        if (page <= 0) {
            page = 1;
        }
    }

    /**
     * @Description:输出属性和值
     * @author ludabing
     * @version 1.0
     * @date 2018年11月15日 下午3:25:10
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
