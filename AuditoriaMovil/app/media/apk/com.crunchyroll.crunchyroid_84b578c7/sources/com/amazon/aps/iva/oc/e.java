package com.amazon.aps.iva.oc;
/* compiled from: ByteArrayAdapter.java */
/* loaded from: classes.dex */
public final class e implements a<byte[]> {
    @Override // com.amazon.aps.iva.oc.a
    public final int a() {
        return 1;
    }

    @Override // com.amazon.aps.iva.oc.a
    public final int b(byte[] bArr) {
        return bArr.length;
    }

    @Override // com.amazon.aps.iva.oc.a
    public final String getTag() {
        return "ByteArrayPool";
    }

    @Override // com.amazon.aps.iva.oc.a
    public final byte[] newArray(int i) {
        return new byte[i];
    }
}
