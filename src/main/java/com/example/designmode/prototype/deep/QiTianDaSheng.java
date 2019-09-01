package com.example.designmode.prototype.deep;

import java.io.*;
import java.util.Date;

public class QiTianDaSheng extends Monkey implements Cloneable, Serializable {

    public JinGuBang jinGuBang;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public QiTianDaSheng(){
        this.birthday = new Date();
        this.jinGuBang = new JinGuBang();
    }

    public Object deepclone(){
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            QiTianDaSheng copy = (QiTianDaSheng) ois.readObject();
            copy.birthday = new Date();

            return copy;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
