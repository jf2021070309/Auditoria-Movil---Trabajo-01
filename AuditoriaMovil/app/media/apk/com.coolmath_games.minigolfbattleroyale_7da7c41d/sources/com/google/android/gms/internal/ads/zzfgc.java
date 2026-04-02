package com.google.android.gms.internal.ads;

import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzfgc {
    public abstract void zza();

    public abstract void zzb(View view);

    public abstract void zzc();

    public abstract void zzd(View view, zzfgi zzfgiVar, String str);

    public static zzfgc zze(zzfgd zzfgdVar, zzfge zzfgeVar) {
        if (zzfga.zzb()) {
            return new zzfgg(zzfgdVar, zzfgeVar);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }
}
