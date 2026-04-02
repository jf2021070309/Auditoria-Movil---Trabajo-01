package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
/* loaded from: classes.dex */
public final class zzbrj implements BaseGmsClient.BaseOnConnectionFailedListener {
    public final /* synthetic */ zzchl zza;

    public zzbrj(zzbrk zzbrkVar, zzchl zzchlVar) {
        this.zza = zzchlVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.zza.zzd(new RuntimeException("Connection failed."));
    }
}
