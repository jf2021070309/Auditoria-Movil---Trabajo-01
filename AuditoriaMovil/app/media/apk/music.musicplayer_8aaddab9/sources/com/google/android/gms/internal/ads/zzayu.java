package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
/* loaded from: classes.dex */
public final class zzayu extends PushbackInputStream {
    public final /* synthetic */ zzayv zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzayu(zzayv zzayvVar, InputStream inputStream, int i2) {
        super(inputStream, 1);
        this.zza = zzayvVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        zzayx.zzf(this.zza.zzc);
        super.close();
    }
}
