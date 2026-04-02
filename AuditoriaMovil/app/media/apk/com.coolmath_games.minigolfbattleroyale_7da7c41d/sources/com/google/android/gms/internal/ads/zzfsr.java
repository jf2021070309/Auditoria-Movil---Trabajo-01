package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfqw;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzfsr extends zzfqw.zzj<Void> implements Runnable {
    private final Runnable zza;

    public zzfsr(Runnable runnable) {
        if (runnable == null) {
            throw null;
        }
        this.zza = runnable;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfqw
    public final String zzc() {
        String valueOf = String.valueOf(this.zza);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
        sb.append("task=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Throwable th) {
            zzq(th);
            zzfmk.zza(th);
            throw new RuntimeException(th);
        }
    }
}
