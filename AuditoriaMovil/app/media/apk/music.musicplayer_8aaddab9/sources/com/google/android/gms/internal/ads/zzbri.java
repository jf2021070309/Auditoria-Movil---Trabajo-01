package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;
import e.a.d.a.a;
/* loaded from: classes.dex */
public final class zzbri implements BaseGmsClient.BaseConnectionCallbacks {
    public final /* synthetic */ zzchl zza;
    public final /* synthetic */ zzbrk zzb;

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
        } catch (DeadObjectException e2) {
            this.zza.zzd(e2);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i2) {
        this.zza.zzd(new RuntimeException(a.R(34, "onConnectionSuspended: ", i2)));
    }
}
