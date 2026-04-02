package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
final class zzan extends zzao {
    private final /* synthetic */ String zzfh;
    private final /* synthetic */ int zzfi;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzan(zzai zzaiVar, GoogleApiClient googleApiClient, String str, int i) {
        super(googleApiClient, null);
        this.zzfh = str;
        this.zzfi = i;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.games.internal.zzf zzfVar) throws RemoteException {
        zzfVar.zzb(this.zzfh, this.zzfi);
    }
}
