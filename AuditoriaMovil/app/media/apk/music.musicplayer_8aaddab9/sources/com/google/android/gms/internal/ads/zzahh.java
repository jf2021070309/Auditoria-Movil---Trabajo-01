package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzahh {
    private final zzalc zza = new zzalc();

    public final zzahh zza(int i2) {
        this.zza.zza(i2);
        return this;
    }

    public final zzahh zzb(int i2, boolean z) {
        zzalc zzalcVar = this.zza;
        if (z) {
            zzalcVar.zza(i2);
        }
        return this;
    }

    public final zzahh zzc(int... iArr) {
        zzalc zzalcVar = this.zza;
        for (int i2 : iArr) {
            zzalcVar.zza(i2);
        }
        return this;
    }

    public final zzahh zzd(zzahi zzahiVar) {
        zzale zzaleVar;
        zzalc zzalcVar = this.zza;
        zzaleVar = zzahiVar.zzc;
        for (int i2 = 0; i2 < zzaleVar.zza(); i2++) {
            zzalcVar.zza(zzaleVar.zzb(i2));
        }
        return this;
    }

    public final zzahi zze() {
        return new zzahi(this.zza.zzb(), null);
    }
}
