package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzfnp extends zzfne {
    final /* synthetic */ zzfns zza;
    private final Object zzb;
    private int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfnp(zzfns zzfnsVar, int i) {
        this.zza = zzfnsVar;
        this.zzb = zzfns.zzs(zzfnsVar, i);
        this.zzc = i;
    }

    private final void zza() {
        int zzy;
        int i = this.zzc;
        if (i == -1 || i >= this.zza.size() || !zzflt.zza(this.zzb, zzfns.zzs(this.zza, this.zzc))) {
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
        int i = this.zzc;
        if (i == -1) {
            return null;
        }
        return zzfns.zzt(this.zza, i);
    }

    @Override // com.google.android.gms.internal.ads.zzfne, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map zzg = this.zza.zzg();
        if (zzg != null) {
            return zzg.put(this.zzb, obj);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            this.zza.put(this.zzb, obj);
            return null;
        }
        Object zzt = zzfns.zzt(this.zza, i);
        zzfns.zzu(this.zza, this.zzc, obj);
        return zzt;
    }
}
