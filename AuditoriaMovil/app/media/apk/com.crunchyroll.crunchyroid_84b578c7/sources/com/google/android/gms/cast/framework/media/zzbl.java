package com.google.android.gms.cast.framework.media;

import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.common.api.Status;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
final class zzbl implements RemoteMediaClient.MediaChannelResult {
    private final Status zza;
    private final c zzb;
    private final MediaError zzc;

    public zzbl(Status status, c cVar, MediaError mediaError) {
        this.zza = status;
        this.zzb = cVar;
        this.zzc = mediaError;
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.MediaChannelResult
    public final c getCustomData() {
        return this.zzb;
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.MediaChannelResult
    public final MediaError getMediaError() {
        return this.zzc;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }
}
