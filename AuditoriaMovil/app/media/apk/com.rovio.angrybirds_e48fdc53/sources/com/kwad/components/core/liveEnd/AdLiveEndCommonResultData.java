package com.kwad.components.core.liveEnd;

import com.facebook.appevents.AppEventsConstants;
import com.kwad.sdk.core.network.BaseResultData;
/* loaded from: classes.dex */
public class AdLiveEndCommonResultData extends BaseResultData {
    private static final long serialVersionUID = 1126369604146892297L;
    public int likeUserCount;
    public long liveDuration;
    public long totalWatchingDuration;
    public int watchingUserCount;
    public String displayWatchingUserCount = AppEventsConstants.EVENT_PARAM_VALUE_NO;
    public String displayLikeUserCount = AppEventsConstants.EVENT_PARAM_VALUE_NO;
}
