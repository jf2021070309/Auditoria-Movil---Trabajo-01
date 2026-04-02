package com.google.android.gms.cast;

import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes2.dex */
final class zzdk extends zzdp {
    final /* synthetic */ RemoteMediaPlayer zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdk(RemoteMediaPlayer remoteMediaPlayer, GoogleApiClient googleApiClient) {
        super(remoteMediaPlayer, googleApiClient);
        this.zza = remoteMediaPlayer;
    }

    @Override // com.google.android.gms.cast.zzdp
    public final void zza(com.google.android.gms.cast.internal.zzw zzwVar) {
        com.google.android.gms.cast.internal.zzaq zzaqVar;
        zzaqVar = this.zza.zzb;
        zzaqVar.zzB(zzb());
    }
}
