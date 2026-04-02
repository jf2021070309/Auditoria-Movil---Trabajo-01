package com.google.android.gms.cast.framework.media;

import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.MediaQueueItem;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
final class zzai extends zzbk {
    final /* synthetic */ MediaQueueItem[] zza;
    final /* synthetic */ c zzb;
    final /* synthetic */ RemoteMediaClient zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzai(RemoteMediaClient remoteMediaClient, MediaQueueItem[] mediaQueueItemArr, c cVar) {
        super(remoteMediaClient, false);
        this.zzc = remoteMediaClient;
        this.zza = mediaQueueItemArr;
        this.zzb = cVar;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbk
    public final void zza() throws com.google.android.gms.cast.internal.zzao {
        com.google.android.gms.cast.internal.zzaq zzaqVar;
        c cVar = this.zzb;
        MediaQueueItem[] mediaQueueItemArr = this.zza;
        zzaqVar = this.zzc.zzd;
        zzaqVar.zzA(zzb(), 0, -1L, mediaQueueItemArr, 0, null, null, cVar);
    }
}
