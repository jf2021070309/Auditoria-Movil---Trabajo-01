package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
final class zzr extends zzy {
    private final /* synthetic */ boolean zzfa;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzr(zzo zzoVar, GoogleApiClient googleApiClient, boolean z) {
        super(googleApiClient, null);
        this.zzfa = z;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.games.internal.zzf zzfVar) throws RemoteException {
        zzfVar.zzc(this, this.zzfa);
    }
}
