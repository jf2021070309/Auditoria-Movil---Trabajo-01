package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzayi implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzayj zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzayi(zzayj zzayjVar) {
        this.zza = zzayjVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Object obj;
        zzaym zzaymVar;
        Object obj2;
        obj = this.zza.zzb;
        synchronized (obj) {
            this.zza.zze = null;
            zzaymVar = this.zza.zzc;
            if (zzaymVar != null) {
                zzayj.zzc(this.zza, null);
            }
            obj2 = this.zza.zzb;
            obj2.notifyAll();
        }
    }
}
