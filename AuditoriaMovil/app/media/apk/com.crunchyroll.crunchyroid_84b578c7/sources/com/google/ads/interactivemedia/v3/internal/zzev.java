package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzev extends zzgh {
    protected final ContentProgressProvider zza;

    public zzev(ContentProgressProvider contentProgressProvider, long j) {
        super(200L);
        this.zza = contentProgressProvider;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzgh
    public final VideoProgressUpdate zza() {
        VideoProgressUpdate contentProgress = this.zza.getContentProgress();
        if (contentProgress == null) {
            return VideoProgressUpdate.VIDEO_TIME_NOT_READY;
        }
        return contentProgress;
    }
}
