package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdko implements zzdcq, com.google.android.gms.ads.internal.overlay.zzo {
    IObjectWrapper zza;
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
        zzcmlVar.zze("onSdkImpression", new ArrayMap());
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbs(int i) {
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
        zzbzm zzbzmVar2;
        zzbzl zzbzlVar;
        if ((this.zzf == zzazj.REWARD_BASED_VIDEO_AD || this.zzf == zzazj.INTERSTITIAL || this.zzf == zzazj.APP_OPEN) && this.zzd.zzP && this.zzc != null && com.google.android.gms.ads.internal.zzt.zzr().zza(this.zzb)) {
            zzcgz zzcgzVar = this.zze;
            int i = zzcgzVar.zzb;
            int i2 = zzcgzVar.zzc;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append(".");
            sb.append(i2);
            String sb2 = sb.toString();
            String zza = this.zzd.zzR.zza();
            if (this.zzd.zzR.zzb() == 1) {
                zzbzlVar = zzbzl.VIDEO;
                zzbzmVar2 = zzbzm.DEFINED_BY_JAVASCRIPT;
            } else {
                if (this.zzd.zzU == 2) {
                    zzbzmVar = zzbzm.UNSPECIFIED;
                } else {
                    zzbzmVar = zzbzm.BEGIN_TO_RENDER;
                }
                zzbzmVar2 = zzbzmVar;
                zzbzlVar = zzbzl.HTML_DISPLAY;
            }
            IObjectWrapper zzd = com.google.android.gms.ads.internal.zzt.zzr().zzd(sb2, this.zzc.zzG(), "", "javascript", zza, zzbzmVar2, zzbzlVar, this.zzd.zzai);
            this.zza = zzd;
            if (zzd != null) {
                com.google.android.gms.ads.internal.zzt.zzr().zzh(this.zza, (View) this.zzc);
                this.zzc.zzak(this.zza);
                com.google.android.gms.ads.internal.zzt.zzr().zzf(this.zza);
                this.zzc.zze("onSdkLoaded", new ArrayMap());
            }
        }
    }
}
