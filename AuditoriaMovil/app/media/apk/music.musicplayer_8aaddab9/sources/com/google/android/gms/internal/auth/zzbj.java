package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.AuthProxy;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
/* loaded from: classes.dex */
public abstract class zzbj extends BaseImplementation.ApiMethodImpl<ProxyApi.SpatulaHeaderResult, zzbe> {
    public zzbj(GoogleApiClient googleApiClient) {
        super(AuthProxy.API, googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ Result createFailedResult(Status status) {
        return new zzbv(status);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(zzbe zzbeVar) throws RemoteException {
        zzbe zzbeVar2 = zzbeVar;
        zza(zzbeVar2.getContext(), (zzbh) zzbeVar2.getService());
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    @KeepForSdk
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((zzbj) ((Result) obj));
    }

    public abstract void zza(Context context, zzbh zzbhVar) throws RemoteException;
}
