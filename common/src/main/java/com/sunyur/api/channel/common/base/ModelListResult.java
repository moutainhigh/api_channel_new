package com.sunyur.api.channel.common.base;

import java.util.List;

/**
 * 
 * @Description:分页查询结果
 * @author houzi
 * @date May 21, 2019 3:45:45 PM   
 * @param <T>
 */
public class ModelListResult<T> extends ModelResult<List<T>> {

    private static final long serialVersionUID = 3105819004255899554L;
    /**
     * 记录总条数
     */
    private Integer           count            = 0;

    /**
     * 页面尺寸
     */
    private int               pageSize         = 10;

    /**
     * 总页数
     */
    private int               totalPage        = 1;

    /**
     * 页号
     */
    private int               page             = 1;

    /**
     * 设置分页信息
     */
    public void initPagedInfo(BaseParam baseParam) {
        this.pageSize = baseParam.getPageSize();
        this.totalPage = (count + pageSize - 1) / pageSize;

        this.page = baseParam.getPage();
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

}
