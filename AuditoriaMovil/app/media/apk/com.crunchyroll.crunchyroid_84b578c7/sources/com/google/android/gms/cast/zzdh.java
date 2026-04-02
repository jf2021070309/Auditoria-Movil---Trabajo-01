package com.google.android.gms.cast;

import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.MediaSeekOptions;
import com.google.android.gms.common.api.GoogleApiClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzdh extends zzdp {
    final /* synthetic */ long zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ c zzc;
    final /* synthetic */ RemoteMediaPlayer zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdh(RemoteMediaPlayer remoteMediaPlayer, GoogleApiClient googleApiClient, long j, int i, c cVar) {
        super(remoteMediaPlayer, googleApiClient);
        this.zzd = remoteMediaPlayer;
        this.zza = j;
        this.zzb = i;
        this.zzc = cVar;
    }

    @Override // com.google.android.gms.cast.zzdp
    public final void zza(com.google.android.gms.cast.internal.zzw zzwVar) throws com.google.android.gms.cast.internal.zzao {
        com.google.android.gms.cast.internal.zzaq zzaqVar;
        zzaqVar = this.zzd.zzb;
        com.google.android.gms.cast.internal.zzas zzb = zzb();
        MediaSeekOptions.Builder builder = new MediaSeekOptions.Builder();
        builder.setPosition(this.zza);
        builder.setResumeState(this.zzb);
        builder.setCustomData(this.zzc);
        zzaqVar.zzC(zzb, builder.build());
    }
}
