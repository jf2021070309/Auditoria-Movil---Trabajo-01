package com.google.android.gms.internal.ads;

import java.util.Map;
/* loaded from: classes.dex */
public final class zzfnp extends zzfne {
    public final /* synthetic */ zzfns zza;
    private final Object zzb;
    private int zzc;

    public zzfnp(zzfns zzfnsVar, int i2) {
        this.zza = zzfnsVar;
        this.zzb = zzfns.zzs(zzfnsVar, i2);
        this.zzc = i2;
    }

    private final void zza() {
        int zzy;
        int i2 = this.zzc;
        if (i2 == -1 || i2 >= this.zza.size() || !zzflt.zza(this.zzb, zzfns.zzs(this.zza, this.zzc))) {
            zzy = this.zza.zzy(this.zzb);
            this.zzc = zzy;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfne, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfne, java.util.Map.Entry
    public final Object getValue() {
        Map zzg = this.zza.zzg();
        if (zzg != null) {
            return zzg.get(this.zzb);
        }
        zza();
        int i2 = this.zzc;
        if (i2 == -1) {
            return null;
        }
        return zzfns.zzt(this.zza, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzfne, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map zzg = this.zza.zzg();
        if (zzg != null) {
            return zzg.put(this.zzb, obj);
        }
        zza();
        int i2 = this.zzc;
        if (i2 == -1) {
            this.zza.put(this.zzb, obj);
            return null;
        }
        Object zzt = zzfns.zzt(this.zza, i2);
        zzfns.zzu(this.zza, this.zzc, obj);
        return zzt;
    }
}
