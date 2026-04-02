package com.amazon.aps.iva.x5;

import com.amazon.aps.iva.q5.a0;
/* compiled from: CacheWriter.java */
/* loaded from: classes.dex */
public final class i {
    public final c a;
    public final com.amazon.aps.iva.x5.a b;
    public final com.amazon.aps.iva.w5.i c;
    public final String d;
    public final byte[] e;
    public final a f;
    public long g;
    public long h;
    public long i;
    public volatile boolean j;

    /* compiled from: CacheWriter.java */
    /* loaded from: classes.dex */
    public interface a {
        void b(long j, long j2, long j3);
    }

    public i(c cVar, com.amazon.aps.iva.w5.i iVar, byte[] bArr, a aVar) {
        this.a = cVar;
        this.b = cVar.a;
        this.c = iVar;
        this.e = bArr == null ? new byte[131072] : bArr;
        this.f = aVar;
        this.d = ((a0) cVar.e).b(iVar);
        this.g = iVar.f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b3, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0154 A[Catch: IOException -> 0x0171, TryCatch #1 {IOException -> 0x0171, blocks: (B:69:0x014d, B:72:0x0154, B:78:0x0169, B:77:0x0163, B:84:0x0179, B:86:0x017d, B:88:0x0187, B:90:0x0191, B:94:0x01a3, B:93:0x019c, B:95:0x01ac, B:96:0x01ae, B:97:0x01b3, B:99:0x01b6, B:102:0x01bf, B:108:0x01d3, B:107:0x01cd), top: B:121:0x014d }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0179 A[Catch: IOException -> 0x0171, TryCatch #1 {IOException -> 0x0171, blocks: (B:69:0x014d, B:72:0x0154, B:78:0x0169, B:77:0x0163, B:84:0x0179, B:86:0x017d, B:88:0x0187, B:90:0x0191, B:94:0x01a3, B:93:0x019c, B:95:0x01ac, B:96:0x01ae, B:97:0x01b3, B:99:0x01b6, B:102:0x01bf, B:108:0x01d3, B:107:0x01cd), top: B:121:0x014d }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b6 A[Catch: IOException -> 0x0171, TryCatch #1 {IOException -> 0x0171, blocks: (B:69:0x014d, B:72:0x0154, B:78:0x0169, B:77:0x0163, B:84:0x0179, B:86:0x017d, B:88:0x0187, B:90:0x0191, B:94:0x01a3, B:93:0x019c, B:95:0x01ac, B:96:0x01ae, B:97:0x01b3, B:99:0x01b6, B:102:0x01bf, B:108:0x01d3, B:107:0x01cd), top: B:121:0x014d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.x5.i.a():void");
    }
}
