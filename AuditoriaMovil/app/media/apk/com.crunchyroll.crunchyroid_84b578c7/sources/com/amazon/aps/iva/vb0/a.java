package com.amazon.aps.iva.vb0;

import com.amazon.aps.iva.yb0.j;
import java.io.ByteArrayOutputStream;
/* compiled from: FileReadWrite.kt */
/* loaded from: classes4.dex */
public final class a extends ByteArrayOutputStream {
    public a() {
        super(8193);
    }

    public final byte[] a() {
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        j.e(bArr, "buf");
        return bArr;
    }
}
