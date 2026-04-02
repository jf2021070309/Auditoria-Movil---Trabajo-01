package com.google.android.gms.internal.ads;

import java.io.PrintWriter;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-base@@20.5.0 */
/* loaded from: classes2.dex */
final class zzgea extends zzgdx {
    private final zzgdz zza = new zzgdz();

    @Override // com.google.android.gms.internal.ads.zzgdx
    public final void zza(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        this.zza.zza(th, true).add(th2);
    }

    @Override // com.google.android.gms.internal.ads.zzgdx
    public final void zzb(Throwable th) {
        th.printStackTrace();
        List<Throwable> zza = this.zza.zza(th, false);
        if (zza == null) {
            return;
        }
        synchronized (zza) {
            for (Throwable th2 : zza) {
                System.err.print("Suppressed: ");
                th2.printStackTrace();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdx
    public final void zzc(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
        List<Throwable> zza = this.zza.zza(th, false);
        if (zza == null) {
            return;
        }
        synchronized (zza) {
            for (Throwable th2 : zza) {
                printWriter.print("Suppressed: ");
                th2.printStackTrace(printWriter);
            }
        }
    }
}
