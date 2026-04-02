package com.google.android.gms.cast.tv.media;

import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes2.dex */
public class MediaLoadCommandCallback {
    public Task<MediaLoadRequestData> onLoad(String str, MediaLoadRequestData mediaLoadRequestData) {
        return Tasks.forException(new MediaException(new MediaError.Builder().setDetailedErrorCode(Integer.valueOf((int) MediaError.DetailedErrorCode.LOAD_FAILED)).setReason(MediaError.ERROR_REASON_NOT_SUPPORTED).build()));
    }

    @ShowFirstParty
    @KeepForSdk
    public Task<MediaLoadRequestData> onResumeSession(String str, MediaResumeSessionRequestData mediaResumeSessionRequestData) {
        return Tasks.forException(new MediaException(new MediaError.Builder().setDetailedErrorCode(Integer.valueOf((int) MediaError.DetailedErrorCode.LOAD_FAILED)).setReason(MediaError.ERROR_REASON_NOT_SUPPORTED).build()));
    }
}
