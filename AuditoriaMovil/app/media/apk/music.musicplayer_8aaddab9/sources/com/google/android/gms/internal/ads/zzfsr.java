package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfqw;
import e.a.d.a.a;
import java.util.Objects;
/* loaded from: classes.dex */
public final class zzfsr extends zzfqw.zzj<Void> implements Runnable {
    private final Runnable zza;

    public zzfsr(Runnable runnable) {
        Objects.requireNonNull(runnable);
        this.zza = runnable;
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

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final String zzc() {
        String valueOf = String.valueOf(this.zza);
        return a.s(new StringBuilder(valueOf.length() + 7), "task=[", valueOf, "]");
    }
}
