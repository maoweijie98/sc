package com.jg.utils;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class JsonData {
    /** 一共多少条记录 */
    private Integer total;
    
    /** 列表数据 */
    private List<?> rows;
    
    /** 异常码 */
    private String errorCode;
    
    /** 是否操作成功标识 */
    private boolean success = true;
    
    /** 提示信息 */
    private String msg;
    
    /** 错误的详细信息 */
    private String errorTrace;
    
    /** 扩展数据 */
    private Object data;
    
    /**
     * 重写toString
     * 
     * @return String
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
    
    /**
     * 获取data中的值
     *
     * @param key key
     * @return value
     */
    @SuppressWarnings("unchecked")
    public Object getDataValue(String key) {
        if (data instanceof Map) {
            Map<String, Object> map = (Map<String, Object>)data;
            return map.get(key);
        }
        return null;
    }
    
    /**
     * 数据总条数
     * 
     * @return
     */
    public Integer getTotal() {
        return total;
    }
    
    /**
     * 数据总条数
     * 
     * @return
     */
    public void setTotal(Integer total) {
        this.total = total;
    }
    
    /**
     * 每页显示条数
     * 
     * @return
     */
    public List<?> getRows() {
        return rows;
    }
    
    /**
     * 每页显示条数
     * 
     * @return
     */
    public void setRows(List<?> rows) {
        this.rows = rows;
    }
    
    /**
     * 操作是否成功
     * 
     * @param success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }
    
    public boolean getSuccess() {
        return success;
    }
    
    /**
     * 提示信息
     * 
     * @param msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    /**
     * 提示信息
     * 
     */
    public String getMsg() {
        return msg;
    }
    
    /**
     * 错误详细信息
     * 
     * @return
     */
    public String getErrorTrace() {
        return errorTrace;
    }
    
    /**
     * 错误详细信息
     * 
     * @return
     */
    public void setErrorTrace(String errorTrace) {
        this.errorTrace = errorTrace;
    }
    
    public Object getData() {
        return data;
    }
    
    public void setData(Object data) {
        this.data = data;
    }
    
    /**
     * 设置一个异常对象，将异常信息转换成字符串提供给errorTrace
     * 
     * @param e
     */
    public void setException(Exception e) {
        this.errorTrace = Exceptions.getStackTraceAsString(e);
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
