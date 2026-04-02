package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzdx extends zzec {
    private final /* synthetic */ SnapshotMetadataChange zzgo;
    private final /* synthetic */ String zzgp;
    private final /* synthetic */ String zzgq;
    private final /* synthetic */ SnapshotContents zzgr;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdx(zzdq zzdqVar, GoogleApiClient googleApiClient, String str, String str2, SnapshotMetadataChange snapshotMetadataChange, SnapshotContents snapshotContents) {
        super(googleApiClient, null);
        this.zzgp = str;
        this.zzgq = str2;
        this.zzgo = snapshotMetadataChange;
        this.zzgr = snapshotContents;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.games.internal.zzf zzfVar) throws RemoteException {
        zzfVar.zza(this, this.zzgp, this.zzgq, this.zzgo, this.zzgr);
    }
}
