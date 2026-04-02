package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzctk implements zzbpr<Object> {
    final /* synthetic */ zzctl zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzctk(zzctl zzctlVar) {
        this.zza = zzctlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zza(Object obj, Map<String, String> map) {
        Executor executor;
        if (zzctl.zzg(this.zza, map)) {
            executor = this.zza.zzc;
            executor.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzctj
                private final zzctk zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzctq zzctqVar;
                    zzctqVar = this.zza.zza.zzd;
                    zzctqVar.zzi();
                }
            });
        }
    }
}
