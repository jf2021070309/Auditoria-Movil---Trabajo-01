package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import c.f.a;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
/* loaded from: classes.dex */
public final class zzdko implements zzdcq, com.google.android.gms.ads.internal.overlay.zzo {
    @VisibleForTesting
    public IObjectWrapper zza;
    private final Context zzb;
    private final zzcml zzc;
    private final zzezz zzd;
    private final zzcgz zze;
    private final zzazj zzf;

    public zzdko(Context context, zzcml zzcmlVar, zzezz zzezzVar, zzcgz zzcgzVar, zzazj zzazjVar) {
        this.zzb = context;
        this.zzc = zzcmlVar;
        this.zzd = zzezzVar;
        this.zze = zzcgzVar;
        this.zzf = zzazjVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbp() {
        zzcml zzcmlVar;
        if (this.zza == null || (zzcmlVar = this.zzc) == null) {
            return;
        }
        zzcmlVar.zze("onSdkImpression", new a());
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbs(int i2) {
        this.zza = null;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzd() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcq
    public final void zzf() {
        zzbzm zzbzmVar;
        zzbzl zzbzlVar;
        zzazj zzazjVar = this.zzf;
        if ((zzazjVar == zzazj.REWARD_BASED_VIDEO_AD || zzazjVar == zzazj.INTERSTITIAL || zzazjVar == zzazj.APP_OPEN) && this.zzd.zzP && this.zzc != null && com.google.android.gms.ads.internal.zzt.zzr().zza(this.zzb)) {
            zzcgz zzcgzVar = this.zze;
            int i2 = zzcgzVar.zzb;
            int i3 = zzcgzVar.zzc;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i2);
            sb.append(".");
            sb.append(i3);
            String sb2 = sb.toString();
            String zza = this.zzd.zzR.zza();
            if (this.zzd.zzR.zzb() == 1) {
                zzbzlVar = zzbzl.VIDEO;
                zzbzmVar = zzbzm.DEFINED_BY_JAVASCRIPT;
            } else {
                zzbzmVar = this.zzd.zzU == 2 ? zzbzm.UNSPECIFIED : zzbzm.BEGIN_TO_RENDER;
                zzbzlVar = zzbzl.HTML_DISPLAY;
            }
            IObjectWrapper zzd = com.google.android.gms.ads.internal.zzt.zzr().zzd(sb2, this.zzc.zzG(), "", "javascript", zza, zzbzmVar, zzbzlVar, this.zzd.zzai);
            this.zza = zzd;
            if (zzd != null) {
                com.google.android.gms.ads.internal.zzt.zzr().zzh(this.zza, (View) this.zzc);
                this.zzc.zzak(this.zza);
                com.google.android.gms.ads.internal.zzt.zzr().zzf(this.zza);
                this.zzc.zze("onSdkLoaded", new a());
            }
        }
    }
}
