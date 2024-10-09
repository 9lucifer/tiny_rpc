package com.lucifer.tiny_rpc.serializer;

import java.io.IOException;

public interface serialzer {
    /**
     * 序列化
     * @param object
     * @return
     * @param <T>
     * @throws IOException
     */
    <T>byte[]serialze(T object)throws IOException;

    /**
     * 反序列化
     * @param bytes
     * @param vtype
     * @return
     * @param <T>
     * @throws IOException
     */
    <T> T deserialize(byte[]bytes,Class<T>vtype)throws IOException;
}
