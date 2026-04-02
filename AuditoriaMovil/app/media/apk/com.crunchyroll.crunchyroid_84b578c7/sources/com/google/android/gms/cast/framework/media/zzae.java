package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.TextTrackStyle;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
final class zzae extends zzbk {
    final /* synthetic */ TextTrackStyle zza;
    final /* synthetic */ RemoteMediaClient zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzae(RemoteMediaClient remoteMediaClient, TextTrackStyle textTrackStyle) {
        super(remoteMediaClient, false);
        this.zzb = remoteMediaClient;
        this.zza = textTrackStyle;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbk
    public final void zza() throws com.google.android.gms.cast.internal.zzao {
        com.google.android.gms.cast.internal.zzaq zzaqVar;
        zzaqVar = this.zzb.zzd;
        zzaqVar.zzH(zzb(), this.zza);
    }
}
