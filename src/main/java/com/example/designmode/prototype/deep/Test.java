package com.example.designmode.prototype.deep;

public class Test {
    public static void main(String[] args) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();

        try {
            QiTianDaSheng clone = (QiTianDaSheng) qiTianDaSheng.clone();
            System.out.println(qiTianDaSheng == clone);
            System.out.println(qiTianDaSheng.jinGuBang == clone.jinGuBang);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
