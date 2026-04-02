package com.google.android.gms.internal.measurement;
/* loaded from: classes2.dex */
public final class zzge extends zzjt<zzgf, zzge> implements zzld {
    private zzge() {
        super(zzgf.zze());
    }

    public /* synthetic */ zzge(zzff zzffVar) {
        super(zzgf.zze());
    }

    public final zzge zza(Iterable<? extends Long> iterable) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzgf.zzh((zzgf) this.zza, iterable);
        return this;
    }

    public final zzge zzb(int i2) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzgf.zzg((zzgf) this.zza, i2);
        return this;
    }
}
