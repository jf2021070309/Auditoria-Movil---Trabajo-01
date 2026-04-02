package com.google.android.gms.cast.framework.media;

import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.MediaQueueItem;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzag extends zzbk {
    final /* synthetic */ MediaQueueItem[] zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ c zzc;
    final /* synthetic */ RemoteMediaClient zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzag(RemoteMediaClient remoteMediaClient, MediaQueueItem[] mediaQueueItemArr, int i, c cVar) {
        super(remoteMediaClient, false);
        this.zzd = remoteMediaClient;
        this.zza = mediaQueueItemArr;
        this.zzb = i;
        this.zzc = cVar;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbk
    public final void zza() throws com.google.android.gms.cast.internal.zzao {
        com.google.android.gms.cast.internal.zzaq zzaqVar;
        c cVar = this.zzc;
        zzaqVar = this.zzd.zzd;
        zzaqVar.zzw(zzb(), this.zza, this.zzb, 0, -1, -1L, cVar);
    }
}
