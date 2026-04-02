package com.ss.android.downloadlib.addownload.ge;
/* loaded from: classes3.dex */
public class rb {
    private int dr;
    private int ge;
    private String o;

    public rb(int i) {
        this(i, 0, null);
    }

    public rb(int i, int i2) {
        this(i, i2, null);
    }

    public rb(int i, String str) {
        this(i, 0, str);
    }

    public rb(int i, int i2, String str) {
        this.dr = i;
        this.ge = i2;
        this.o = str;
    }

    public int getType() {
        return this.dr;
    }

    public int dr() {
        return this.ge;
    }

    public String ge() {
        return this.o;
    }
}
