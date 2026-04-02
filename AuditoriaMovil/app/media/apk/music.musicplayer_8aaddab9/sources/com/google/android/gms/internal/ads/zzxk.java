package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class zzxk extends ThreadLocal<ByteBuffer> {
    public zzxk(zzxl zzxlVar) {
    }

    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ ByteBuffer initialValue() {
        return ByteBuffer.allocate(32);
    }
}
