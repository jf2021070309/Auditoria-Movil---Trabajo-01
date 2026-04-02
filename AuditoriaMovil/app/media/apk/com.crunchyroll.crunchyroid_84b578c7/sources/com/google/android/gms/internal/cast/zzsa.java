package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.zzrg;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
final class zzsa extends zzrg.zzi implements Runnable {
    private final Runnable zzb;

    public zzsa(Runnable runnable) {
        runnable.getClass();
        this.zzb = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.run();
        } catch (Error | RuntimeException e) {
            zzl(e);
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.cast.zzrg
    public final String zze() {
        return e.e("task=[", this.zzb.toString(), "]");
    }
}
