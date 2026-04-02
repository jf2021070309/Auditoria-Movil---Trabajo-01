package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
final class zzcy extends zzde {
    private final /* synthetic */ boolean zzfa;
    private final /* synthetic */ String zzgc;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcy(zzcw zzcwVar, GoogleApiClient googleApiClient, String str, boolean z) {
        super(googleApiClient);
        this.zzgc = str;
        this.zzfa = z;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.games.internal.zzf zzfVar) throws RemoteException {
        zzfVar.zza(this, this.zzgc, this.zzfa);
    }
}
