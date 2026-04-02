package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* loaded from: classes.dex */
public final class zzazd {
    public final /* synthetic */ zzazf zza;
    private final byte[] zzb;
    private int zzc;

    public /* synthetic */ zzazd(zzazf zzazfVar, byte[] bArr, zzaze zzazeVar) {
        this.zza = zzazfVar;
        this.zzb = bArr;
    }

    public final synchronized void zza() {
        try {
            zzazf zzazfVar = this.zza;
            if (zzazfVar.zzb) {
                zzazfVar.zza.zzh(this.zzb);
                this.zza.zza.zzi(0);
                this.zza.zza.zzj(this.zzc);
                this.zza.zza.zzg(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e2) {
            zzcgt.zze("Clearcut log failed", e2);
        }
    }

    public final zzazd zzb(int i2) {
        this.zzc = i2;
        return this;
    }
}
