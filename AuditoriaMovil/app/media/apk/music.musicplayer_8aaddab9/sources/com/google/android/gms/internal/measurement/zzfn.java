package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class zzfn extends zzjt<zzfo, zzfn> implements zzld {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private zzfn() {
        /*
            r1 = this;
            com.google.android.gms.internal.measurement.zzfo r0 = com.google.android.gms.internal.measurement.zzfo.zzf()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzfn.<init>():void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ zzfn(com.google.android.gms.internal.measurement.zzff r1) {
        /*
            r0 = this;
            com.google.android.gms.internal.measurement.zzfo r1 = com.google.android.gms.internal.measurement.zzfo.zzf()
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzfn.<init>(com.google.android.gms.internal.measurement.zzff):void");
    }

    public final int zza() {
        return ((zzfo) this.zza).zzb();
    }

    public final long zzb() {
        return ((zzfo) this.zza).zzc();
    }

    public final long zzc() {
        return ((zzfo) this.zza).zzd();
    }

    public final zzfn zzd(Iterable<? extends zzfs> iterable) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzfo.zzm((zzfo) this.zza, iterable);
        return this;
    }

    public final zzfn zze(zzfr zzfrVar) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzfo.zzk((zzfo) this.zza, zzfrVar.zzaA());
        return this;
    }

    public final zzfn zzf(zzfs zzfsVar) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzfo.zzk((zzfo) this.zza, zzfsVar);
        return this;
    }

    public final zzfn zzg() {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        ((zzfo) this.zza).zzf = zzjx.zzbA();
        return this;
    }

    public final zzfn zzh(int i2) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzfo.zzo((zzfo) this.zza, i2);
        return this;
    }

    public final zzfn zzi(String str) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzfo.zzp((zzfo) this.zza, str);
        return this;
    }

    public final zzfn zzj(int i2, zzfr zzfrVar) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzfo.zzj((zzfo) this.zza, i2, zzfrVar.zzaA());
        return this;
    }

    public final zzfn zzk(int i2, zzfs zzfsVar) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzfo.zzj((zzfo) this.zza, i2, zzfsVar);
        return this;
    }

    public final zzfn zzl(long j2) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzfo.zzr((zzfo) this.zza, j2);
        return this;
    }

    public final zzfn zzm(long j2) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzfo.zzq((zzfo) this.zza, j2);
        return this;
    }

    public final zzfs zzn(int i2) {
        return ((zzfo) this.zza).zzg(i2);
    }

    public final String zzo() {
        return ((zzfo) this.zza).zzh();
    }

    public final List<zzfs> zzp() {
        return Collections.unmodifiableList(((zzfo) this.zza).zzi());
    }

    public final boolean zzq() {
        return ((zzfo) this.zza).zzu();
    }
}
