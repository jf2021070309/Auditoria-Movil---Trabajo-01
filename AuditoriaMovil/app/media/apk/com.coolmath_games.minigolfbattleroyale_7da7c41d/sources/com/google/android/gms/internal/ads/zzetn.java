package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzetn implements zzery<zzeto> {
    final zzfsn zza;
    final String zzb;
    final zzcft zzc;

    public zzetn(zzcft zzcftVar, zzfsn zzfsnVar, String str, byte[] bArr) {
        this.zzc = zzcftVar;
        this.zza = zzfsnVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<zzeto> zza() {
        new zzchl();
        final zzfsm zza = zzfsd.zza(null);
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzee)).booleanValue()) {
            zza = zzfsd.zza(null);
        }
        final zzfsm zza2 = zzfsd.zza(null);
        return zzfsd.zzn(zza, zza2).zza(new Callable(zza, zza2) { // from class: com.google.android.gms.internal.ads.zzetm
            private final zzfsm zza;
            private final zzfsm zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zza;
                this.zzb = zza2;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzeto((String) this.zza.get(), (String) this.zzb.get());
            }
        }, zzchg.zza);
    }
}
