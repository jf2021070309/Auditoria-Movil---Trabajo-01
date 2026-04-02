package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfki {
    final /* synthetic */ zzfkk zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfki(zzfkk zzfkkVar, byte[] bArr, zzfkj zzfkjVar) {
        this.zza = zzfkkVar;
        this.zzb = bArr;
    }

    public final synchronized void zza() {
        try {
            zzfkk zzfkkVar = this.zza;
            if (zzfkkVar.zza) {
                zzfkkVar.zzb.zzg(this.zzb);
                this.zza.zzb.zzh(this.zzc);
                this.zza.zzb.zzi(this.zzd);
                this.zza.zzb.zzf(null);
                this.zza.zzb.zze();
            }
        } catch (RemoteException e) {
            Log.d("GASS", "Clearcut log failed", e);
        }
    }

    public final zzfki zzb(int i) {
        this.zzc = i;
        return this;
    }

    public final zzfki zzc(int i) {
        this.zzd = i;
        return this;
    }
}
