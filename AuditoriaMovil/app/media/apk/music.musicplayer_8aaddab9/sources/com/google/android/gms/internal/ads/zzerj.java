package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class zzerj implements zzery<zzerk> {
    private final zzcfa zza;
    private final zzfsn zzb;
    private final Context zzc;

    public zzerj(zzcfa zzcfaVar, zzfsn zzfsnVar, Context context) {
        this.zza = zzcfaVar;
        this.zzb = zzfsnVar;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<zzerk> zza() {
        return this.zzb.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzeri
            private final zzerj zza;

            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzb();
            }
        });
    }

    public final /* synthetic */ zzerk zzb() throws Exception {
        if (this.zza.zzb(this.zzc)) {
            String zzj = this.zza.zzj(this.zzc);
            String str = zzj == null ? "" : zzj;
            String zzk = this.zza.zzk(this.zzc);
            String str2 = zzk == null ? "" : zzk;
            String zzl = this.zza.zzl(this.zzc);
            String str3 = zzl == null ? "" : zzl;
            String zzm = this.zza.zzm(this.zzc);
            return new zzerk(str, str2, str3, zzm == null ? "" : zzm, "TIME_OUT".equals(str2) ? (Long) zzbet.zzc().zzc(zzbjl.zzaa) : null);
        }
        return new zzerk(null, null, null, null, null);
    }
}
