package com.google.android.gms.cast;

import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.RemoteMediaPlayer;
import com.google.android.gms.common.api.Status;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes2.dex */
final class zzdq implements RemoteMediaPlayer.MediaChannelResult {
    private final Status zza;
    private final c zzb;

    public zzdq(Status status, c cVar) {
        this.zza = status;
        this.zzb = cVar;
    }

    @Override // com.google.android.gms.cast.RemoteMediaPlayer.MediaChannelResult
    public final c getCustomData() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }
}
