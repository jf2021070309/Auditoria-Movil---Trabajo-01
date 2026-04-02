package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final /* synthetic */ class zzdrl implements com.google.android.gms.ads.internal.overlay.zzv {
    private final zzdcj zza;

    private zzdrl(zzdcj zzdcjVar) {
        this.zza = zzdcjVar;
    }

    public static com.google.android.gms.ads.internal.overlay.zzv zza(zzdcj zzdcjVar) {
        return new zzdrl(zzdcjVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzv
    public final void zzg() {
        this.zza.zzb();
    }
}
