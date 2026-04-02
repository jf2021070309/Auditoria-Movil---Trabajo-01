package com.google.android.gms.internal.measurement;
/* loaded from: classes2.dex */
public final class zzei extends zzjt<zzej, zzei> implements zzld {
    private zzei() {
        super(zzej.zzd());
    }

    public /* synthetic */ zzei(zzef zzefVar) {
        super(zzej.zzd());
    }

    public final int zza() {
        return ((zzej) this.zza).zza();
    }

    public final zzei zzb(String str) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzej.zzi((zzej) this.zza, str);
        return this;
    }

    public final zzei zzc(int i2, zzel zzelVar) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzej.zzj((zzej) this.zza, i2, zzelVar);
        return this;
    }

    public final zzel zzd(int i2) {
        return ((zzej) this.zza).zze(i2);
    }

    public final String zze() {
        return ((zzej) this.zza).zzg();
    }
}
