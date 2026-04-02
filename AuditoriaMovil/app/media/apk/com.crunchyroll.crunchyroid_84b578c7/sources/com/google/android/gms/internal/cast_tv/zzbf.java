package com.google.android.gms.internal.cast_tv;

import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaQueueData;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.SessionState;
import com.google.android.gms.cast.tv.media.StoreSessionRequestData;
import com.google.android.gms.cast.tv.media.StoreSessionResponseData;
import com.google.android.gms.common.internal.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzbf extends zzt {
    final /* synthetic */ StoreSessionRequestData zza;
    final /* synthetic */ zzbp zzb;

    public zzbf(zzbp zzbpVar, StoreSessionRequestData storeSessionRequestData) {
        this.zzb = zzbpVar;
        this.zza = storeSessionRequestData;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzu
    public final zzbt zze() {
        MediaStatus zzU;
        boolean zzY;
        zzU = this.zzb.zzU();
        zzY = zzbp.zzY(zzU);
        if (!zzY) {
            return new zzbt(null, new MediaError.Builder().setType(MediaError.ERROR_TYPE_INVALID_PLAYER_STATE).setRequestId(this.zza.getRequestId()).setDetailedErrorCode(Integer.valueOf((int) MediaError.DetailedErrorCode.GENERIC)).setReason(MediaError.ERROR_REASON_APP_ERROR).build());
        }
        Preconditions.checkNotNull(zzU);
        MediaInfo mediaInfo = zzU.getMediaInfo();
        Preconditions.checkNotNull(mediaInfo);
        MediaLoadRequestData.Builder builder = new MediaLoadRequestData.Builder();
        builder.setMediaInfo(mediaInfo);
        builder.setPlaybackRate(zzU.getPlaybackRate());
        builder.setCurrentTime(zzU.getStreamPosition());
        builder.setActiveTrackIds(zzU.getActiveTrackIds());
        MediaQueueData queueData = zzU.getQueueData();
        if (queueData != null) {
            MediaQueueData.Builder builder2 = new MediaQueueData.Builder(queueData);
            Integer indexById = zzU.getIndexById(zzU.getCurrentItemId());
            if (indexById != null) {
                builder2.setStartIndex(indexById.intValue());
                builder2.setStartTime(zzU.getStreamPosition());
            } else {
                builder2.setStartIndex(0);
                builder2.setStartTime(-1L);
            }
            builder.setQueueData(builder2.build());
        }
        builder.setCustomData(mediaInfo.getCustomData());
        StoreSessionResponseData.Builder builder3 = new StoreSessionResponseData.Builder();
        builder3.setSessionState(new SessionState.Builder().setLoadRequestData(builder.build()).setCustomData(null).build());
        return new zzbt(builder3.build(), null);
    }
}
