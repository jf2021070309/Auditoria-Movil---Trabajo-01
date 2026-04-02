package com.google.android.gms.cast;

import com.amazon.aps.iva.if0.c;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes2.dex */
final class zzcw extends zzdp {
    final /* synthetic */ c zza;
    final /* synthetic */ RemoteMediaPlayer zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcw(RemoteMediaPlayer remoteMediaPlayer, GoogleApiClient googleApiClient, c cVar) {
        super(remoteMediaPlayer, googleApiClient);
        this.zzb = remoteMediaPlayer;
        this.zza = cVar;
    }

    @Override // com.google.android.gms.cast.zzdp
    public final void zza(com.google.android.gms.cast.internal.zzw zzwVar) throws com.google.android.gms.cast.internal.zzao {
        com.google.android.gms.cast.internal.zzaq zzaqVar;
        zzaqVar = this.zzb.zzb;
        zzaqVar.zzA(zzb(), 0, -1L, null, -1, null, null, this.zza);
    }
}
