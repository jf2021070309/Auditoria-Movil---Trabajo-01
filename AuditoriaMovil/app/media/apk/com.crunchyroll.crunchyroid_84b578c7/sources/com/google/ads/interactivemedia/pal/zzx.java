package com.google.ads.interactivemedia.pal;

import com.google.android.gms.internal.pal.zzjb;
import com.google.android.gms.internal.pal.zzjc;
import java.util.Random;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes2.dex */
public final class zzx {
    static final boolean zza;
    private final zzs zzb;
    private final boolean zzc;

    static {
        boolean z;
        if (new Random().nextInt(100) <= 0) {
            z = true;
        } else {
            z = false;
        }
        zza = z;
    }

    public zzx(zzs zzsVar, boolean z) {
        this.zzb = zzsVar;
        this.zzc = z;
    }

    public final void zza(int i) {
        if (!this.zzc) {
            return;
        }
        this.zzb.zza("pal_native", zzt.ERROR_EVENT.zza(), zzjc.zzd(zzu.ERROR_CODE.zza(), String.valueOf(i)));
    }

    public final void zzb(zzw zzwVar) {
        if (!this.zzc) {
            return;
        }
        zzjb zzjbVar = new zzjb();
        zzjbVar.zza(zzu.NONCE_LOADER_INIT_TIME.zza(), String.valueOf(zzwVar.zzc().zzd()));
        zzjbVar.zza(zzu.NONCE_REQUESTED_TIME.zza(), String.valueOf(zzwVar.zzd().zzd()));
        zzjbVar.zza(zzu.NONCE_LOADED_TIME.zza(), String.valueOf(zzwVar.zzb().zzd()));
        zzjbVar.zza(zzu.SERVICE_START_TIME.zza(), String.valueOf(zzwVar.zzf().zzd()));
        zzjbVar.zza(zzu.SERVICE_END_TIME.zza(), String.valueOf(zzwVar.zze().zzd()));
        zzjbVar.zza(zzu.NONCE_LENGTH.zza(), String.valueOf(zzwVar.zza()));
        this.zzb.zza("pal_native", zzt.NONCE_LOADED.zza(), zzjbVar.zzc());
    }
}
