package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class zzepd implements zzery<zzepe> {
    private final zzfsn zza;
    private final zzfar zzb;

    public zzepd(zzfsn zzfsnVar, zzfar zzfarVar) {
        this.zza = zzfsnVar;
        this.zzb = zzfarVar;
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<zzepe> zza() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzepc
            private final zzepd zza;

            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzb();
            }
        });
    }

    public final /* synthetic */ zzepe zzb() throws Exception {
        return new zzepe("requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zze.zzd(this.zzb)));
    }
}
