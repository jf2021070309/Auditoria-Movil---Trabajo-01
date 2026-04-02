package com.google.android.gms.internal.pal;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzfd extends zzfg {
    private final View zzi;

    public zzfd(zzdu zzduVar, String str, String str2, zzr zzrVar, int i, int i2, View view) {
        super(zzduVar, "xcWDoPM3ZfO4P10VSUmZKRTMvsXPXnglJL31bwAJBgJGdSUy2IQG17s4MILOncV2", "9rXsTdb/WXYONX554dN5CJ2eqpcy9gFPMPi8uAjaHTA=", zzrVar, i, 57);
        this.zzi = view;
    }

    @Override // com.google.android.gms.internal.pal.zzfg
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzi != null) {
            Boolean bool = (Boolean) zzfv.zzc().zzb(zzgk.zzcD);
            Boolean bool2 = (Boolean) zzfv.zzc().zzb(zzgk.zziC);
            zzdy zzdyVar = new zzdy((String) this.zzf.invoke(null, this.zzi, this.zzb.zzb().getResources().getDisplayMetrics(), bool, bool2));
            zzad zza = zzae.zza();
            zza.zzb(zzdyVar.zza.longValue());
            zza.zzd(zzdyVar.zzb.longValue());
            zza.zze(zzdyVar.zzc.longValue());
            if (bool2.booleanValue()) {
                zza.zzc(zzdyVar.zze.longValue());
            }
            if (bool.booleanValue()) {
                zza.zza(zzdyVar.zzd.longValue());
            }
            this.zze.zzZ((zzae) zza.zzan());
        }
    }
}
