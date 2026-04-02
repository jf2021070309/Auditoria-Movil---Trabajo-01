package com.umeng.analytics.pro;

import java.io.ByteArrayOutputStream;
/* compiled from: TByteArrayOutputStream.java */
/* loaded from: classes3.dex */
public class br extends ByteArrayOutputStream {
    public br(int i) {
        super(i);
    }

    public br() {
    }

    public byte[] a() {
        return this.buf;
    }

    public int b() {
        return this.count;
    }
}
