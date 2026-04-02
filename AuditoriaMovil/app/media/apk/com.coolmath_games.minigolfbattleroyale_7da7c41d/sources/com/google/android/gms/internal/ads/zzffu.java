package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzffu {
    private final Executor zza;
    private final zzcgy zzb;

    public zzffu(Executor executor, zzcgy zzcgyVar) {
        this.zza = executor;
        this.zzb = zzcgyVar;
    }

    public final void zza(List<String> list) {
        for (String str : list) {
            zzb(str);
        }
    }

    public final void zzb(final String str) {
        this.zza.execute(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.zzfft
            private final zzffu zza;
            private final String zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc(this.zzb);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(String str) {
        this.zzb.zza(str);
    }
}
