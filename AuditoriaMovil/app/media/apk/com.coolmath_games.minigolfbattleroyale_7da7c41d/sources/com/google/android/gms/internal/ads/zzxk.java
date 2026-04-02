package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzxk extends ThreadLocal<ByteBuffer> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzxk(zzxl zzxlVar) {
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ ByteBuffer initialValue() {
        return ByteBuffer.allocate(32);
    }
}
