package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.games.Players;
/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
final class zzdd extends zzde {
    private final /* synthetic */ boolean zzfa;
    private final /* synthetic */ int zzgd;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdd(zzcw zzcwVar, GoogleApiClient googleApiClient, int i, boolean z) {
        super(googleApiClient);
        this.zzgd = i;
        this.zzfa = z;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.games.internal.zzf zzfVar) throws RemoteException {
        zzfVar.zza((BaseImplementation.ResultHolder<Players.LoadPlayersResult>) this, "played_with", this.zzgd, false, this.zzfa);
    }
}
