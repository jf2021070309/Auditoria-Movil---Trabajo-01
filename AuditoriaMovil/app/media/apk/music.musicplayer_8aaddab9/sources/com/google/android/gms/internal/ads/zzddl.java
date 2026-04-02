package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class zzddl extends zzdgm<zzddn> implements zzdbw, zzddb {
    private final zzezz zzb;
    private final AtomicBoolean zzc;

    public zzddl(Set<zzdih<zzddn>> set, zzezz zzezzVar) {
        super(set);
        this.zzc = new AtomicBoolean();
        this.zzb = zzezzVar;
    }

    private final void zzb() {
        zzbdn zzbdnVar;
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfA)).booleanValue() && this.zzc.compareAndSet(false, true) && (zzbdnVar = this.zzb.zzab) != null && zzbdnVar.zza == 3) {
            zzk(new zzdgl(this) { // from class: com.google.android.gms.internal.ads.zzddk
                private final zzddl zza;

                {
                    this.zza = this;
                }

                @Override // com.google.android.gms.internal.ads.zzdgl
                public final void zza(Object obj) {
                    this.zza.zza((zzddn) obj);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zzR() {
        if (this.zzb.zzb == 1) {
            zzb();
        }
    }

    public final /* synthetic */ void zza(zzddn zzddnVar) throws Exception {
        zzddnVar.zzo(this.zzb.zzab);
    }

    @Override // com.google.android.gms.internal.ads.zzdbw
    public final void zzg() {
        int i2 = this.zzb.zzb;
        if (i2 == 2 || i2 == 5 || i2 == 4 || i2 == 6 || i2 == 7) {
            zzb();
        }
    }
}
