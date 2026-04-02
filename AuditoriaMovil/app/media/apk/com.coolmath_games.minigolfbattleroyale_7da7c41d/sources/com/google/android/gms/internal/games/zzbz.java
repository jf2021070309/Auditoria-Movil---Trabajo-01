package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
final class zzbz extends zzce {
    private final /* synthetic */ String zzfr;
    private final /* synthetic */ int zzfs;
    private final /* synthetic */ int zzft;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbz(zzbu zzbuVar, GoogleApiClient googleApiClient, String str, int i, int i2) {
        super(googleApiClient, null);
        this.zzfr = str;
        this.zzfs = i;
        this.zzft = i2;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.games.internal.zzf zzfVar) throws RemoteException {
        zzfVar.zza(this, (String) null, this.zzfr, this.zzfs, this.zzft);
    }
}
