package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public final class zzeho implements zzfrz {
    public final /* synthetic */ long zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzezz zzc;
    public final /* synthetic */ zzfac zzd;
    public final /* synthetic */ zzehp zze;

    public zzeho(zzehp zzehpVar, long j2, String str, zzezz zzezzVar, zzfac zzfacVar) {
        this.zze = zzehpVar;
        this.zza = j2;
        this.zzb = str;
        this.zzc = zzezzVar;
        this.zzd = zzfacVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
        Clock clock;
        boolean z;
        zzbcz zzbczVar;
        zzeeh zzeehVar;
        zzehq zzehqVar;
        clock = this.zze.zza;
        long elapsedRealtime = clock.elapsedRealtime() - this.zza;
        int i2 = th instanceof TimeoutException ? 2 : th instanceof zzehe ? 3 : th instanceof CancellationException ? 4 : th instanceof zzfaw ? 5 : ((th instanceof zzdym) && zzfbm.zza(th).zza == 3) ? 1 : 6;
        zzehp.zzf(this.zze, this.zzb, i2, elapsedRealtime, this.zzc.zzac);
        z = this.zze.zzd;
        if (z) {
            zzehqVar = this.zze.zzb;
            zzehqVar.zza(this.zzd, this.zzc, i2, th instanceof zzeeg ? (zzeeg) th : null, elapsedRealtime);
        }
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfX)).booleanValue()) {
            zzbcz zza = zzfbm.zza(th);
            int i3 = zza.zza;
            if ((i3 == 3 || i3 == 0) && (zzbczVar = zza.zzd) != null && !zzbczVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                zza = zzfbm.zza(new zzeeg(13, zza.zzd));
            }
            zzeehVar = this.zze.zze;
            zzeehVar.zzc(this.zzc, elapsedRealtime, zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zzb(Object obj) {
        Clock clock;
        boolean z;
        zzeeh zzeehVar;
        zzehq zzehqVar;
        clock = this.zze.zza;
        long elapsedRealtime = clock.elapsedRealtime() - this.zza;
        zzehp.zzf(this.zze, this.zzb, 0, elapsedRealtime, this.zzc.zzac);
        z = this.zze.zzd;
        if (z) {
            zzehqVar = this.zze.zzb;
            zzehqVar.zza(this.zzd, this.zzc, 0, null, elapsedRealtime);
        }
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfX)).booleanValue()) {
            zzeehVar = this.zze.zze;
            zzeehVar.zzc(this.zzc, elapsedRealtime, null);
        }
    }
}
