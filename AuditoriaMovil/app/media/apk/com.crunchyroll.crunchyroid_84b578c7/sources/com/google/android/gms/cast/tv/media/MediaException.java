package com.google.android.gms.cast.tv.media;

import com.google.android.gms.cast.MediaError;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes2.dex */
public class MediaException extends Exception {
    private final MediaError zza;

    public MediaException(MediaError mediaError) {
        this.zza = mediaError;
    }

    public MediaError getMediaError() {
        return this.zza;
    }
}
