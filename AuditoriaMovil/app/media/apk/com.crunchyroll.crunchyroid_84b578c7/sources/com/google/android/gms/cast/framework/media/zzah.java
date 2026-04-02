package com.google.android.gms.cast.framework.media;

import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.MediaQueueItem;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzah extends zzbk {
    final /* synthetic */ MediaQueueItem zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ c zzd;
    final /* synthetic */ RemoteMediaClient zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzah(RemoteMediaClient remoteMediaClient, MediaQueueItem mediaQueueItem, int i, long j, c cVar) {
        super(remoteMediaClient, false);
        this.zze = remoteMediaClient;
        this.zza = mediaQueueItem;
        this.zzb = i;
        this.zzc = j;
        this.zzd = cVar;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbk
    public final void zza() throws com.google.android.gms.cast.internal.zzao {
        com.google.android.gms.cast.internal.zzaq zzaqVar;
        MediaQueueItem mediaQueueItem = this.zza;
        zzaqVar = this.zze.zzd;
        zzaqVar.zzw(zzb(), new MediaQueueItem[]{mediaQueueItem}, this.zzb, 0, 0, this.zzc, this.zzd);
    }
}
