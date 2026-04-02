package com.amazon.aps.iva.vc;

import com.amazon.aps.iva.nc.w;
/* compiled from: BytesResource.java */
/* loaded from: classes.dex */
public final class b implements w<byte[]> {
    public final byte[] b;

    public b(byte[] bArr) {
        i.l(bArr);
        this.b = bArr;
    }

    @Override // com.amazon.aps.iva.nc.w
    public final int a() {
        return this.b.length;
    }

    @Override // com.amazon.aps.iva.nc.w
    public final Class<byte[]> d() {
        return byte[].class;
    }

    @Override // com.amazon.aps.iva.nc.w
    public final byte[] get() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.nc.w
    public final void b() {
    }
}
