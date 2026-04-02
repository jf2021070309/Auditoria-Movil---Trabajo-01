package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzcb extends zzcg {
    private final /* synthetic */ boolean zzfa;
    private final /* synthetic */ String zzfr;
    private final /* synthetic */ int zzfs;
    private final /* synthetic */ int zzft;
    private final /* synthetic */ int zzfu;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcb(zzbu zzbuVar, GoogleApiClient googleApiClient, String str, int i, int i2, int i3, boolean z) {
        super(googleApiClient, null);
        this.zzfr = str;
        this.zzfs = i;
        this.zzft = i2;
        this.zzfu = i3;
        this.zzfa = z;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.games.internal.zzf zzfVar) throws RemoteException {
        zzfVar.zzb(this, this.zzfr, this.zzfs, this.zzft, this.zzfu, this.zzfa);
    }
}
