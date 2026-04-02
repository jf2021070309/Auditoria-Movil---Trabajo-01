package com.google.android.gms.cast;

import com.amazon.aps.iva.if0.c;
import com.google.android.gms.common.api.GoogleApiClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzcs extends zzdp {
    final /* synthetic */ MediaQueueItem zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ c zzd;
    final /* synthetic */ RemoteMediaPlayer zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcs(RemoteMediaPlayer remoteMediaPlayer, GoogleApiClient googleApiClient, MediaQueueItem mediaQueueItem, int i, long j, c cVar) {
        super(remoteMediaPlayer, googleApiClient);
        this.zze = remoteMediaPlayer;
        this.zza = mediaQueueItem;
        this.zzb = i;
        this.zzc = j;
        this.zzd = cVar;
    }

    @Override // com.google.android.gms.cast.zzdp
    public final void zza(com.google.android.gms.cast.internal.zzw zzwVar) throws com.google.android.gms.cast.internal.zzao {
        com.google.android.gms.cast.internal.zzaq zzaqVar;
        MediaQueueItem mediaQueueItem = this.zza;
        zzaqVar = this.zze.zzb;
        zzaqVar.zzw(zzb(), new MediaQueueItem[]{mediaQueueItem}, this.zzb, 0, 0, this.zzc, this.zzd);
    }
}
