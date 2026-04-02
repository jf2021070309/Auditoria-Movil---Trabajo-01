package com.umeng.analytics.pro;
/* compiled from: TMessage.java */
/* loaded from: classes3.dex */
public final class cm {
    public final String a;
    public final byte b;
    public final int c;

    public cm() {
        this("", (byte) 0, 0);
    }

    public cm(String str, byte b, int i) {
        this.a = str;
        this.b = b;
        this.c = i;
    }

    public String toString() {
        return "<TMessage name:'" + this.a + "' type: " + ((int) this.b) + " seqid:" + this.c + ">";
    }

    public boolean equals(Object obj) {
        if (obj instanceof cm) {
            return a((cm) obj);
        }
        return false;
    }

    public boolean a(cm cmVar) {
        return this.a.equals(cmVar.a) && this.b == cmVar.b && this.c == cmVar.c;
    }
}
