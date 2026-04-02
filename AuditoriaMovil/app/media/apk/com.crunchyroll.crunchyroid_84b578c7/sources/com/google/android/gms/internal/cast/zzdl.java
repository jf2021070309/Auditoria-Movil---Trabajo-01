package com.google.android.gms.internal.cast;

import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
public class zzdl extends BaseImplementation.ApiMethodImpl {
    final /* synthetic */ zzdn zzc;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzdl(com.google.android.gms.internal.cast.zzdn r1, com.google.android.gms.common.api.GoogleApiClient r2) {
        /*
            r0 = this;
            r0.zzc = r1
            com.google.android.gms.common.api.Api r1 = com.google.android.gms.internal.cast.zzdn.zzd(r1)
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.zzdl.<init>(com.google.android.gms.internal.cast.zzdn, com.google.android.gms.common.api.GoogleApiClient):void");
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Result createFailedResult(Status status) {
        return new zzdm(status);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    @KeepForSdk
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((zzdl) ((Result) obj));
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    /* renamed from: zza */
    public void doExecute(zzdq zzdqVar) throws RemoteException {
        throw null;
    }
}
