package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ExecutorService;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzawx {
    final /* synthetic */ zzawy zza;
    private final byte[] zzb;
    private int zzc;

    public /* synthetic */ zzawx(zzawy zzawyVar, byte[] bArr, zzaww zzawwVar) {
        this.zza = zzawyVar;
        this.zzb = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzd() {
        try {
            zzawy zzawyVar = this.zza;
            if (zzawyVar.zzb) {
                zzawyVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(0);
                this.zza.zza.zzg(this.zzc);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e) {
            zzbzo.zzf("Clearcut log failed", e);
        }
    }

    public final zzawx zza(int i) {
        this.zzc = i;
        return this;
    }

    public final synchronized void zzc() {
        ExecutorService executorService;
        executorService = this.zza.zzc;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzawv
            @Override // java.lang.Runnable
            public final void run() {
                zzawx.this.zzd();
            }
        });
    }
}
