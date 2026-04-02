package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzayh implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzayj zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzayh(zzayj zzayjVar) {
        this.zza = zzayjVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Object obj;
        Object obj2;
        zzaym zzaymVar;
        zzaym zzaymVar2;
        obj = this.zza.zzb;
        synchronized (obj) {
            try {
                zzaymVar = this.zza.zzc;
                if (zzaymVar != null) {
                    zzayj zzayjVar = this.zza;
                    zzaymVar2 = zzayjVar.zzc;
                    zzayjVar.zze = zzaymVar2.zzq();
                }
            } catch (DeadObjectException e) {
                com.google.android.gms.ads.internal.util.zze.zzg("Unable to obtain a cache service instance.", e);
                zzayj.zzj(this.zza);
            }
            obj2 = this.zza.zzb;
            obj2.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        Object obj;
        Object obj2;
        obj = this.zza.zzb;
        synchronized (obj) {
            this.zza.zze = null;
            obj2 = this.zza.zzb;
            obj2.notifyAll();
        }
    }
}
