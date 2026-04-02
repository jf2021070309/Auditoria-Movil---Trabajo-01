package com.google.android.gms.cast;

import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.RemoteMediaPlayer;
import com.google.android.gms.common.api.Status;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes2.dex */
final class zzdo implements RemoteMediaPlayer.MediaChannelResult {
    final /* synthetic */ Status zza;

    public zzdo(zzdp zzdpVar, Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.cast.RemoteMediaPlayer.MediaChannelResult
    public final c getCustomData() {
        return null;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }
}
