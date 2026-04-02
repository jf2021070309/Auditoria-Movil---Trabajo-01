package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final /* synthetic */ class zzdrc implements com.google.android.gms.ads.internal.overlay.zzv {
    private final zzdcj zza;

    private zzdrc(zzdcj zzdcjVar) {
        this.zza = zzdcjVar;
    }

    public static com.google.android.gms.ads.internal.overlay.zzv zza(zzdcj zzdcjVar) {
        return new zzdrc(zzdcjVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzv
    public final void zzg() {
        this.zza.zzb();
    }
}
