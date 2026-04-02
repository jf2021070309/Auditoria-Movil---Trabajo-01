package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfit {
    private final Context zza;
    private final Looper zzb;

    public zzfit(Context context, Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(String str) {
        zzfjh zza = zzfjj.zza();
        zza.zza(this.zza.getPackageName());
        zza.zzc(2);
        zzfje zza2 = zzfjf.zza();
        zza2.zza(str);
        zza2.zzb(2);
        zza.zzb(zza2);
        new zzfiu(this.zza, this.zzb, zza.zzah()).zza();
    }
}
