package com.google.android.gms.cast.framework.media;

import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.common.api.Status;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzbg implements RemoteMediaClient.MediaChannelResult {
    final /* synthetic */ Status zza;

    public zzbg(zzbh zzbhVar, Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.MediaChannelResult
    public final c getCustomData() {
        return null;
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.MediaChannelResult
    public final MediaError getMediaError() {
        return null;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }
}
