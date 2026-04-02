package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public interface zzgkm extends Closeable {
    int zza(ByteBuffer byteBuffer) throws IOException;

    long zzb() throws IOException;

    long zzc() throws IOException;

    void zzd(long j2) throws IOException;

    ByteBuffer zze(long j2, long j3) throws IOException;
}
