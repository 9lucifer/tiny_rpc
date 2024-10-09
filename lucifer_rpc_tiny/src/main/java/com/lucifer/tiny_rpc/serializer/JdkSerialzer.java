package com.lucifer.tiny_rpc.serializer;

import java.io.*;

public class JdkSerialzer implements serialzer{

    @Override
    public <T> byte[] serialze(T object) throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(object);
        objectOutputStream.close();
        return outputStream.toByteArray();
    }

    @Override
    public <T> T deserialize(byte[] bytes, Class<T> vtype) throws IOException {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        try{
            return (T)objectInputStream.readObject();
        }catch(ClassNotFoundException e){
            throw new RuntimeException(e);
        }finally {
            objectInputStream.close();
        }

    }
}
