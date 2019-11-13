package com.sunyur.api.channel.service.protocol;
import com.sunyur.api.channel.model.protocol.ProtocolApiModel;

/**
 * @Description: 操作协议
 * @Author xujianhong
 * @Date 2019/09/23   16:40
 * @Version 1.0
 */
public interface SunyurProtocolService {
    /**
     * @Description 获取api 协议数据
     * @Author xujianhong
     * @Date 2019/8/20 15:07
     * @param protocolSerialNumber
     * @return   ProtocolApiModel
     **/
    ProtocolApiModel getProtocolInfoFromApi(String protocolSerialNumber);
}
