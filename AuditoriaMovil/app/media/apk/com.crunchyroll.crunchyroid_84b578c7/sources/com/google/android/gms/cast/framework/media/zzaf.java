package com.google.android.gms.cast.framework.media;

import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.MediaQueueItem;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzaf extends zzbk {
    final /* synthetic */ MediaQueueItem[] zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ c zze;
    final /* synthetic */ RemoteMediaClient zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaf(RemoteMediaClient remoteMediaClient, MediaQueueItem[] mediaQueueItemArr, int i, int i2, long j, c cVar) {
        super(remoteMediaClient, false);
        this.zzf = remoteMediaClient;
        this.zza = mediaQueueItemArr;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j;
        this.zze = cVar;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbk
    public final void zza() {
        com.google.android.gms.cast.internal.zzaq zzaqVar;
        zzaqVar = this.zzf.zzd;
        zzaqVar.zzx(zzb(), this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }
}
