package com.sunyur.api.channel.common.base;

import java.util.Collection;
import java.util.Map;

/**
 * 
 * @Description:ModelResult工具类
 * @author houzi
 * @date May 21, 2019 3:45:08 PM
 */
public class ModelResultUtil {

    /** *
     * @Description: 获取内容
     * @author jiaming.liu
     * @version 0.0.1
     * @date 2018/11/28
     */
    public static final <T> T getContent(ModelResult<T> modelResult){
        if(modelResult != null && modelResult.isSuccess()){
            return modelResult.getContent();
        }
        return null;
    }

    /** *
     * @Description: 生成成功时的通用实体对象
     * @author jiaming.liu
     * @version 0.0.1
     * @date 2018/11/27
     * @param model 实体对象
     * @return 最终通用实体对象
     */
    public static final <T> ModelResult<T> success(T model){
        ModelResult<T> modelResult = new ModelResult<T>();
        modelResult.setContent(model);
        return modelResult;
    }

    /** *
     * @Description: 生成错误时的通用实体对象
     * @author jiaming.liu
     * @version 0.0.1
     * @date 2018/11/27
     * @param code 错误码
     * @param message 错误信息
     * @return 最终通用实体对象
     */
    public static final <T> ModelResult<T> error(String code, String message){
        ModelResult<T> modelResult = new ModelResult<T>();
        modelResult.setErrorMessage(code, message);
        return modelResult;
    }

    /**
     * @Description: 判断rpc服务是否成功</br>
     * 支持对类型为ModelResult<T>， 的对象进行非空、不包含错误信息、boolean型结果、非空集合、非空实体的判断
     * @author ludabing
     * @version 1.0
     * @date 2018年11月15日 下午3:26:33
     * @param modelResult
     * @return
     */
    public static <T> boolean isSuccess(ModelResult<T> modelResult) {
        if (modelResult != null && modelResult.isSuccess() && modelResult.getContent() != null) {
            if (modelResult.getContent() instanceof Boolean) {
                return (Boolean) modelResult.getContent();
            } else if (modelResult.getContent() instanceof Collection<?>) {
                return !((Collection<?>) modelResult.getContent()).isEmpty();
            } else if (modelResult.getContent() instanceof Map<?, ?>) {
                return !((Map<?, ?>) modelResult.getContent()).isEmpty();
            } else if (modelResult.getContent() instanceof Object[]) {
                return ((Object[]) modelResult.getContent()).length == 0 ? false : true;
            }

            return true;
        }

        return false;
    }

}
