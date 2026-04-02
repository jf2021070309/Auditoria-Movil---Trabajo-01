package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcww implements zzdcq, zzdbw {
    private final Context zza;
    private final zzcml zzb;
    private final zzezz zzc;
    private final zzcgz zzd;
    private IObjectWrapper zze;
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
                int i = zzcgzVar.zzb;
                int i2 = zzcgzVar.zzc;
                StringBuilder sb = new StringBuilder(23);
                sb.append(i);
                sb.append(".");
                sb.append(i2);
                String sb2 = sb.toString();
                String zza = this.zzc.zzR.zza();
                if (this.zzc.zzR.zzb() == 1) {
                    zzbzlVar = zzbzl.VIDEO;
                    zzbzmVar = zzbzm.DEFINED_BY_JAVASCRIPT;
                } else {
                    zzbzlVar = zzbzl.HTML_DISPLAY;
                    if (this.zzc.zzf == 1) {
                        zzbzmVar = zzbzm.ONE_PIXEL;
                    } else {
                        zzbzmVar = zzbzm.BEGIN_TO_RENDER;
                    }
                }
                IObjectWrapper zzd = com.google.android.gms.ads.internal.zzt.zzr().zzd(sb2, this.zzb.zzG(), "", "javascript", zza, zzbzmVar, zzbzlVar, this.zzc.zzai);
                this.zze = zzd;
                zzcml zzcmlVar = this.zzb;
                if (zzd != null) {
                    com.google.android.gms.ads.internal.zzt.zzr().zzh(this.zze, (View) zzcmlVar);
                    this.zzb.zzak(this.zze);
                    com.google.android.gms.ads.internal.zzt.zzr().zzf(this.zze);
                    this.zzf = true;
                    this.zzb.zze("onSdkLoaded", new ArrayMap());
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
        zzcmlVar.zze("onSdkImpression", new ArrayMap());
    }
}
