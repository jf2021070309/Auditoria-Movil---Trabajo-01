package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class zzepl implements zzery<zzepm> {
    private final zzfsn zza;
    private final zzdyc zzb;

    public zzepl(zzfsn zzfsnVar, zzdyc zzdycVar) {
        this.zza = zzfsnVar;
        this.zzb = zzdycVar;
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<zzepm> zza() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzepk
            private final zzepl zza;

            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzb();
            }
        });
    }

    public final /* synthetic */ zzepm zzb() throws Exception {
        return new zzepm(this.zzb.zzg(), this.zzb.zzd(), com.google.android.gms.ads.internal.zzt.zzm().zzk());
    }
}
