package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbri implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzchl zza;
    final /* synthetic */ zzbrk zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbri(zzbrk zzbrkVar, zzchl zzchlVar) {
        this.zzb = zzbrkVar;
        this.zza = zzchlVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzbqx zzbqxVar;
        try {
            zzchl zzchlVar = this.zza;
            zzbqxVar = this.zzb.zza;
            zzchlVar.zzc(zzbqxVar.zzp());
        } catch (DeadObjectException e) {
            this.zza.zzd(e);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        zzchl zzchlVar = this.zza;
        StringBuilder sb = new StringBuilder(34);
        sb.append("onConnectionSuspended: ");
        sb.append(i);
        zzchlVar.zzd(new RuntimeException(sb.toString()));
    }
}
