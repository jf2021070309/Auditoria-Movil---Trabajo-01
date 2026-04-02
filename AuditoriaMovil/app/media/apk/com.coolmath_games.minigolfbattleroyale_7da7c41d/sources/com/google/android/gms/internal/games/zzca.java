package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
final class zzca extends zzcg {
    private final /* synthetic */ int zzfu;
    private final /* synthetic */ LeaderboardScoreBuffer zzfv;
    private final /* synthetic */ int zzfw;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzca(zzbu zzbuVar, GoogleApiClient googleApiClient, LeaderboardScoreBuffer leaderboardScoreBuffer, int i, int i2) {
        super(googleApiClient, null);
        this.zzfv = leaderboardScoreBuffer;
        this.zzfu = i;
        this.zzfw = i2;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.games.internal.zzf zzfVar) throws RemoteException {
        zzfVar.zza(this, this.zzfv, this.zzfu, this.zzfw);
    }
}
