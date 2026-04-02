package com.google.android.gms.internal.pal;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzen implements Callable {
    private final zzdu zza;
    private final zzr zzb;

    public zzen(zzdu zzduVar, zzr zzrVar) {
        this.zza = zzduVar;
        this.zzb = zzrVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (this.zza.zzl() != null) {
            this.zza.zzl().get();
        }
        zzaf zzc = this.zza.zzc();
        if (zzc != null) {
            try {
                synchronized (this.zzb) {
                    zzr zzrVar = this.zzb;
                    byte[] zzas = zzc.zzas();
                    zzrVar.zzam(zzas, 0, zzas.length, zzacm.zza());
                }
                return null;
            } catch (zzadi | NullPointerException unused) {
                return null;
            }
        }
        return null;
    }
}
