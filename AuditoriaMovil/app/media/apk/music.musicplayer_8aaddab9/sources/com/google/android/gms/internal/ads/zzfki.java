package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* loaded from: classes.dex */
public final class zzfki {
    public final /* synthetic */ zzfkk zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

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
        } catch (RemoteException unused) {
        }
    }

    public final zzfki zzb(int i2) {
        this.zzc = i2;
        return this;
    }

    public final zzfki zzc(int i2) {
        this.zzd = i2;
        return this;
    }
}
