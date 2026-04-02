package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfez {
    private final Executor zza;
    private final zzcgy zzb;

    public zzfez(Executor executor, zzcgy zzcgyVar) {
        this.zza = executor;
        this.zzb = zzcgyVar;
    }

    public final void zza(final String str) {
        this.zza.execute(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.zzfey
            private final zzfez zza;
            private final String zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb(this.zzb);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(String str) {
        this.zzb.zza(str);
    }
}
