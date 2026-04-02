package com.umeng.analytics.pro;
/* compiled from: TField.java */
/* loaded from: classes3.dex */
public class cj {
    public final String a;
    public final byte b;
    public final short c;

    public cj() {
        this("", (byte) 0, (short) 0);
    }

    public cj(String str, byte b, short s) {
        this.a = str;
        this.b = b;
        this.c = s;
    }

    public String toString() {
        return "<TField name:'" + this.a + "' type:" + ((int) this.b) + " field-id:" + ((int) this.c) + ">";
    }

    public boolean a(cj cjVar) {
        return this.b == cjVar.b && this.c == cjVar.c;
    }
}
