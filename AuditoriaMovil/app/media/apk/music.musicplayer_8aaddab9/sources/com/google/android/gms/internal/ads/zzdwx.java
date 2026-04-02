package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
/* loaded from: classes.dex */
public final class zzdwx implements zzdwh {
    private final long zza;
    private final String zzb;
    private final zzdwm zzc;
    private final zzezq zzd;

    public zzdwx(long j2, Context context, zzdwm zzdwmVar, zzcoj zzcojVar, String str) {
        this.zza = j2;
        this.zzb = str;
        this.zzc = zzdwmVar;
        zzezs zzt = zzcojVar.zzt();
        zzt.zzc(context);
        zzt.zzb(str);
        this.zzd = zzt.zza().zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzdwh
    public final void zza(zzbdg zzbdgVar) {
        try {
            this.zzd.zzc(zzbdgVar, new zzdwv(this));
        } catch (RemoteException e2) {
            zzcgt.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdwh
    public final void zzb() {
        try {
            this.zzd.zze(new zzdww(this));
            this.zzd.zzb(ObjectWrapper.wrap(null));
        } catch (RemoteException e2) {
            zzcgt.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdwh
    public final void zzc() {
    }
}
