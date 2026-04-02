package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.internal.zzub;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzvu extends zzub.zzi implements Runnable {
    private final Runnable zza;

    public zzvu(Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Error | RuntimeException e) {
            zzd(e);
            throw e;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzub
    public final String zza() {
        return e.e("task=[", this.zza.toString(), "]");
    }
}
