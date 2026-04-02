package com.google.android.gms.cast;

import com.amazon.aps.iva.if0.c;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes2.dex */
final class zzct extends zzdp {
    final /* synthetic */ MediaQueueItem[] zza;
    final /* synthetic */ c zzb;
    final /* synthetic */ RemoteMediaPlayer zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzct(RemoteMediaPlayer remoteMediaPlayer, GoogleApiClient googleApiClient, MediaQueueItem[] mediaQueueItemArr, c cVar) {
        super(remoteMediaPlayer, googleApiClient);
        this.zzc = remoteMediaPlayer;
        this.zza = mediaQueueItemArr;
        this.zzb = cVar;
    }

    @Override // com.google.android.gms.cast.zzdp
    public final void zza(com.google.android.gms.cast.internal.zzw zzwVar) throws com.google.android.gms.cast.internal.zzao {
        com.google.android.gms.cast.internal.zzaq zzaqVar;
        c cVar = this.zzb;
        MediaQueueItem[] mediaQueueItemArr = this.zza;
        zzaqVar = this.zzc.zzb;
        zzaqVar.zzA(zzb(), 0, -1L, mediaQueueItemArr, 0, null, null, cVar);
    }
}
