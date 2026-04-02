package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzux {
    public final int zza;
    public final long zzb;

    private zzux(int i, long j) {
        this.zza = i;
        this.zzb = j;
    }

    public static zzux zza(zznv zznvVar, zzamf zzamfVar) throws IOException {
        ((zznp) zznvVar).zzh(zzamfVar.zzi(), 0, 8, false);
        zzamfVar.zzh(0);
        return new zzux(zzamfVar.zzv(), zzamfVar.zzu());
    }
}
