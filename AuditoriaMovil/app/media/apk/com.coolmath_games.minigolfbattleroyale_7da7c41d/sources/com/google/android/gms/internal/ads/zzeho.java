package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzeho implements zzfrz {
    final /* synthetic */ long zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzezz zzc;
    final /* synthetic */ zzfac zzd;
    final /* synthetic */ zzehp zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeho(zzehp zzehpVar, long j, String str, zzezz zzezzVar, zzfac zzfacVar) {
        this.zze = zzehpVar;
        this.zza = j;
        this.zzb = str;
        this.zzc = zzezzVar;
        this.zzd = zzfacVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
        Clock clock;
        int i;
        boolean z;
        zzbcz zzbczVar;
        zzeeh zzeehVar;
        zzehq zzehqVar;
        clock = this.zze.zza;
        long elapsedRealtime = clock.elapsedRealtime() - this.zza;
        if (th instanceof TimeoutException) {
            i = 2;
        } else if (th instanceof zzehe) {
            i = 3;
        } else if (th instanceof CancellationException) {
            i = 4;
        } else if (th instanceof zzfaw) {
            i = 5;
        } else {
            i = ((th instanceof zzdym) && zzfbm.zza(th).zza == 3) ? 1 : 6;
        }
        zzehp.zzf(this.zze, this.zzb, i, elapsedRealtime, this.zzc.zzac);
        z = this.zze.zzd;
        if (z) {
            zzehqVar = this.zze.zzb;
            zzehqVar.zza(this.zzd, this.zzc, i, th instanceof zzeeg ? (zzeeg) th : null, elapsedRealtime);
        }
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfX)).booleanValue()) {
            zzbcz zza = zzfbm.zza(th);
            int i2 = zza.zza;
            if ((i2 == 3 || i2 == 0) && (zzbczVar = zza.zzd) != null && !zzbczVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
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
