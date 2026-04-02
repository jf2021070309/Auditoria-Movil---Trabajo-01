package com.amazon.aps.iva.od0;

import java.nio.ByteBuffer;
/* compiled from: Internal.java */
/* loaded from: classes4.dex */
public final class i {
    public static final byte[] a;

    /* compiled from: Internal.java */
    /* loaded from: classes4.dex */
    public interface a {
        int getNumber();
    }

    /* compiled from: Internal.java */
    /* loaded from: classes4.dex */
    public interface b<T extends a> {
        T findValueByNumber(int i);
    }

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        ByteBuffer.wrap(bArr);
    }
}
