package com.google.android.gms.internal.ads;

import java.util.Set;
/* loaded from: classes.dex */
public final class zzddi extends zzdgm<com.google.android.gms.ads.internal.overlay.zzo> implements com.google.android.gms.ads.internal.overlay.zzo {
    public zzddi(Set<zzdih<com.google.android.gms.ads.internal.overlay.zzo>> set) {
        super(set);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbp() {
        zzk(zzddh.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbq() {
        zzk(zzddf.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbr() {
        zzk(zzddg.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbs(final int i2) {
        zzk(new zzdgl(i2) { // from class: com.google.android.gms.internal.ads.zzddc
            private final int zza;

            {
                this.zza = i2;
            }

            @Override // com.google.android.gms.internal.ads.zzdgl
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.overlay.zzo) obj).zzbs(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzd() {
        zzk(zzddd.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zze() {
        zzk(zzdde.zza);
    }
}
