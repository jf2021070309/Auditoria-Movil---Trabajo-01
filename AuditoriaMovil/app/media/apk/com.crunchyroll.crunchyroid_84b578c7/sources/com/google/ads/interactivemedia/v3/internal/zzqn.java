package com.google.ads.interactivemedia.v3.internal;

import android.os.RemoteException;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzqn {
    final /* synthetic */ zzqo zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    public /* synthetic */ zzqn(zzqo zzqoVar, byte[] bArr, zzqm zzqmVar) {
        this.zza = zzqoVar;
        this.zzb = bArr;
    }

    public final zzqn zza(int i) {
        this.zzd = i;
        return this;
    }

    public final zzqn zzb(int i) {
        this.zzc = i;
        return this;
    }

    public final synchronized void zzc() {
        try {
            zzqo zzqoVar = this.zza;
            if (zzqoVar.zzb) {
                zzqoVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(this.zzc);
                this.zza.zza.zzg(this.zzd);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException unused) {
        }
    }
}
