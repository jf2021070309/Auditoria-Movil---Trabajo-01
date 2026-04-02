package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class zzep implements Runnable {
    private final zzen zza;
    private final int zzb;
    private final Throwable zzc;
    private final byte[] zzd;
    private final String zze;
    private final Map<String, List<String>> zzf;

    public /* synthetic */ zzep(String str, zzen zzenVar, int i2, Throwable th, byte[] bArr, Map map, zzeo zzeoVar) {
        Preconditions.checkNotNull(zzenVar);
        this.zza = zzenVar;
        this.zzb = i2;
        this.zzc = th;
        this.zzd = bArr;
        this.zze = str;
        this.zzf = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza(this.zze, this.zzb, this.zzc, this.zzd, this.zzf);
    }
}
