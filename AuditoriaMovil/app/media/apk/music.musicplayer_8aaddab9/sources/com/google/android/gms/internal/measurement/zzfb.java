package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class zzfb extends zzjt<zzfc, zzfb> implements zzld {
    private zzfb() {
        super(zzfc.zzf());
    }

    public /* synthetic */ zzfb(zzey zzeyVar) {
        super(zzfc.zzf());
    }

    public final int zza() {
        return ((zzfc) this.zza).zzb();
    }

    public final zzfa zzb(int i2) {
        return ((zzfc) this.zza).zzd(i2);
    }

    public final zzfb zzc() {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzfc.zzn((zzfc) this.zza);
        return this;
    }

    public final zzfb zzd(int i2, zzez zzezVar) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzfc.zzm((zzfc) this.zza, i2, zzezVar.zzaA());
        return this;
    }

    public final List<zzeh> zze() {
        return Collections.unmodifiableList(((zzfc) this.zza).zzi());
    }
}
