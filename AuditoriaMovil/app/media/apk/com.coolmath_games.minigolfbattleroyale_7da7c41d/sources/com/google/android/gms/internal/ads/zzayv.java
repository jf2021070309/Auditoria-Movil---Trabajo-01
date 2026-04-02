package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.io.IOException;
import java.util.concurrent.Future;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzayv implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzayn zza;
    final /* synthetic */ zzchl zzb;
    final /* synthetic */ zzayx zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzayv(zzayx zzayxVar, zzayn zzaynVar, zzchl zzchlVar) {
        this.zzc = zzayxVar;
        this.zza = zzaynVar;
        this.zzb = zzchlVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Object obj;
        boolean z;
        final zzaym zzaymVar;
        obj = this.zzc.zzd;
        synchronized (obj) {
            z = this.zzc.zzb;
            if (z) {
                return;
            }
            zzayx.zzc(this.zzc, true);
            zzaymVar = this.zzc.zza;
            if (zzaymVar == null) {
                return;
            }
            zzfsn zzfsnVar = zzchg.zza;
            final zzayn zzaynVar = this.zza;
            final zzchl zzchlVar = this.zzb;
            final zzfsm<?> zza = zzfsnVar.zza(new Runnable(this, zzaymVar, zzaynVar, zzchlVar) { // from class: com.google.android.gms.internal.ads.zzays
                private final zzayv zza;
                private final zzaym zzb;
                private final zzayn zzc;
                private final zzchl zzd;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = zzaymVar;
                    this.zzc = zzaynVar;
                    this.zzd = zzchlVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzayk zze;
                    zzayv zzayvVar = this.zza;
                    zzaym zzaymVar2 = this.zzb;
                    zzayn zzaynVar2 = this.zzc;
                    zzchl zzchlVar2 = this.zzd;
                    try {
                        zzayp zzq = zzaymVar2.zzq();
                        if (zzaymVar2.zzp()) {
                            zze = zzq.zzf(zzaynVar2);
                        } else {
                            zze = zzq.zze(zzaynVar2);
                        }
                        if (!zze.zza()) {
                            zzchlVar2.zzd(new RuntimeException("No entry contents."));
                            zzayx.zzf(zzayvVar.zzc);
                            return;
                        }
                        zzayu zzayuVar = new zzayu(zzayvVar, zze.zzb(), 1);
                        int read = zzayuVar.read();
                        if (read == -1) {
                            throw new IOException("Unable to read from cache.");
                        }
                        zzayuVar.unread(read);
                        zzchlVar2.zzc(zzayz.zza(zzayuVar, zze.zzd(), zze.zzg(), zze.zzf(), zze.zze()));
                    } catch (RemoteException | IOException e) {
                        com.google.android.gms.ads.internal.util.zze.zzg("Unable to obtain a cache service instance.", e);
                        zzchlVar2.zzd(e);
                        zzayx.zzf(zzayvVar.zzc);
                    }
                }
            });
            final zzchl zzchlVar2 = this.zzb;
            zzchlVar2.zze(new Runnable(zzchlVar2, zza) { // from class: com.google.android.gms.internal.ads.zzayt
                private final zzchl zza;
                private final Future zzb;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zzchlVar2;
                    this.zzb = zza;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzchl zzchlVar3 = this.zza;
                    Future future = this.zzb;
                    int i = zzayv.zzd;
                    if (zzchlVar3.isCancelled()) {
                        future.cancel(true);
                    }
                }
            }, zzchg.zzf);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
