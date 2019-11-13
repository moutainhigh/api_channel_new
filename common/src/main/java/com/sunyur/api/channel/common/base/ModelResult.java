package com.sunyur.api.channel.common.base;

/**
 * 
 * @Description:操作结果
 * @author houzi
 * @date May 21, 2019 3:45:20 PM   
 * @param <T>
 */
public class ModelResult<T> extends ResultSet {

    private static final long serialVersionUID = 8973890607687883933L;

    private T                 content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public ModelResult(T content,String errorMsg) {
        super(errorMsg);
        this.content = content;
    }
    public ModelResult(T content){
      this.content =content;
    }

    public ModelResult() {
    }

}
