package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdwx implements zzdwh {
    private final long zza;
    private final String zzb;
    private final zzdwm zzc;
    private final zzezq zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdwx(long j, Context context, zzdwm zzdwmVar, zzcoj zzcojVar, String str) {
        this.zza = j;
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
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdwh
    public final void zzb() {
        try {
            this.zzd.zze(new zzdww(this));
            this.zzd.zzb(ObjectWrapper.wrap(null));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdwh
    public final void zzc() {
    }
}
