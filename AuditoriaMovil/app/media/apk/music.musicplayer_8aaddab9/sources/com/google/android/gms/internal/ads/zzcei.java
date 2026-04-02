package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class zzcei implements zzawd {
    private final Context zza;
    private final Object zzb;
    private final String zzc;
    private boolean zzd;

    public zzcei(Context context, String str) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = str;
        this.zzd = false;
        this.zzb = new Object();
    }

    public final void zza(boolean z) {
        if (com.google.android.gms.ads.internal.zzt.zzA().zzb(this.zza)) {
            synchronized (this.zzb) {
                if (this.zzd == z) {
                    return;
                }
                this.zzd = z;
                if (TextUtils.isEmpty(this.zzc)) {
                    return;
                }
                if (this.zzd) {
                    com.google.android.gms.ads.internal.zzt.zzA().zzf(this.zza, this.zzc);
                } else {
                    com.google.android.gms.ads.internal.zzt.zzA().zzg(this.zza, this.zzc);
                }
            }
        }
    }

    public final String zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzawd
    public final void zzc(zzawc zzawcVar) {
        zza(zzawcVar.zzj);
    }
}
