package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import c.f.a;
import com.google.android.gms.dynamic.IObjectWrapper;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class zzcww implements zzdcq, zzdbw {
    private final Context zza;
    private final zzcml zzb;
    private final zzezz zzc;
    private final zzcgz zzd;
    @GuardedBy("this")
    private IObjectWrapper zze;
    @GuardedBy("this")
    private boolean zzf;

    public zzcww(Context context, zzcml zzcmlVar, zzezz zzezzVar, zzcgz zzcgzVar) {
        this.zza = context;
        this.zzb = zzcmlVar;
        this.zzc = zzezzVar;
        this.zzd = zzcgzVar;
    }

    private final synchronized void zza() {
        zzbzl zzbzlVar;
        zzbzm zzbzmVar;
        if (this.zzc.zzP) {
            if (this.zzb == null) {
                return;
            }
            if (com.google.android.gms.ads.internal.zzt.zzr().zza(this.zza)) {
                zzcgz zzcgzVar = this.zzd;
                int i2 = zzcgzVar.zzb;
                int i3 = zzcgzVar.zzc;
                StringBuilder sb = new StringBuilder(23);
                sb.append(i2);
                sb.append(".");
                sb.append(i3);
                String sb2 = sb.toString();
                String zza = this.zzc.zzR.zza();
                if (this.zzc.zzR.zzb() == 1) {
                    zzbzlVar = zzbzl.VIDEO;
                    zzbzmVar = zzbzm.DEFINED_BY_JAVASCRIPT;
                } else {
                    zzbzlVar = zzbzl.HTML_DISPLAY;
                    zzbzmVar = this.zzc.zzf == 1 ? zzbzm.ONE_PIXEL : zzbzm.BEGIN_TO_RENDER;
                }
                IObjectWrapper zzd = com.google.android.gms.ads.internal.zzt.zzr().zzd(sb2, this.zzb.zzG(), "", "javascript", zza, zzbzmVar, zzbzlVar, this.zzc.zzai);
                this.zze = zzd;
                zzcml zzcmlVar = this.zzb;
                if (zzd != null) {
                    com.google.android.gms.ads.internal.zzt.zzr().zzh(this.zze, (View) zzcmlVar);
                    this.zzb.zzak(this.zze);
                    com.google.android.gms.ads.internal.zzt.zzr().zzf(this.zze);
                    this.zzf = true;
                    this.zzb.zze("onSdkLoaded", new a());
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcq
    public final synchronized void zzf() {
        if (this.zzf) {
            return;
        }
        zza();
    }

    @Override // com.google.android.gms.internal.ads.zzdbw
    public final synchronized void zzg() {
        zzcml zzcmlVar;
        if (!this.zzf) {
            zza();
        }
        if (!this.zzc.zzP || this.zze == null || (zzcmlVar = this.zzb) == null) {
            return;
        }
        zzcmlVar.zze("onSdkImpression", new a());
    }
}
