package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzayw implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzchl zza;
    final /* synthetic */ zzayx zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzayw(zzayx zzayxVar, zzchl zzchlVar) {
        this.zzb = zzayxVar;
        this.zza = zzchlVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Object obj;
        obj = this.zzb.zzd;
        synchronized (obj) {
            this.zza.zzd(new RuntimeException("Connection failed."));
        }
    }
}
