package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.snapshot.Snapshots;
/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
abstract class zzec extends Games.zzb<Snapshots.OpenSnapshotResult> {
    private zzec(GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public /* synthetic */ Result createFailedResult(Status status) {
        return new zzef(this, status);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzec(GoogleApiClient googleApiClient, zzdt zzdtVar) {
        this(googleApiClient);
    }
}
