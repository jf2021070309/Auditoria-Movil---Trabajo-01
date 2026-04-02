package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzcd extends zzci {
    private final /* synthetic */ String zzfr;
    private final /* synthetic */ long zzfx;
    private final /* synthetic */ String zzfy;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcd(zzbu zzbuVar, GoogleApiClient googleApiClient, String str, long j, String str2) {
        super(googleApiClient);
        this.zzfr = str;
        this.zzfx = j;
        this.zzfy = str2;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.games.internal.zzf zzfVar) throws RemoteException {
        zzfVar.zza(this, this.zzfr, this.zzfx, this.zzfy);
    }
}
