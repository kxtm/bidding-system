package cn.sx.ebj.bidding.core.utils;

import java.io.Serializable;
import java.util.List;

/**
 * 分页对象
 *
 * @name: Pager
 * @author: chunjie
 * @date: 2022-11-12 19:43
 **/

public class Page<T> implements Serializable {
    //每页大小
    private int size = 10;
    //记录总数
    private int totalRecord;
    //当前页码
    private int index;
    //总页数
    private int totalPage;

    //记录集合
    private List<T> records;


    public Page() {
    }

    public Page(int size, int index) {
        this.size = size;
        this.index = index;
    }

    public static <T> Page init() {

        return new Page(10, 1);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(int totalRecord) {
        this.totalRecord = totalRecord;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getTotalPage() {
        return totalPage = ((totalRecord + size - 1) / size);
    }

    protected void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getRecords() {
        return records;
    }

    public void setRecords(List<T> records) {
        this.records = records;
    }
}
