package com.fyber.inneractive.sdk.h;

import androidx.room.RoomDatabase;
import com.ironsource.mediationsdk.logger.IronSourceError;
/* loaded from: classes.dex */
public enum m {
    EVENT_READY_ON_CLIENT(41),
    VAST_EVENT_PLAYED_FOR_2_SECONDS(42),
    VAST_EVENT_COMPANION_CLICKED(43),
    VAST_MEDIA_LOAD_RETRY_ATTEMPTED(44),
    VAST_COMPANION_DISPLAYED(71),
    VAST_EVENT_COMPANION_FILTERED(72),
    NUMBER_OF_COMPANIONS(73),
    VAST_COMPANION_LOAD_ATTEMPT(74),
    MRAID_VIDEO_DETECTED(61),
    MRAID_CUSTOM_CLOSE_DETECTED(391),
    INTERSTITIAL_VIEW_TIME(392),
    FAIL_SAFE_ACTIVATED(393),
    EXTERNAL_BROWSER_OPENED(IronSourceError.ERROR_BN_INIT_FAILED_AFTER_LOAD),
    IA_PUBLISHER_REQUESTED_SHOW(804),
    IA_AD_FAILURE_DATA(850),
    FYBER_SUCCESS_CLICK(990),
    METRIC_MEASUREMENTS_EVENT(60),
    IA_AMAZON_ID(669),
    CAUGHT_EXCEPTION(998),
    IA_UNCAUGHT_EXCEPTION(RoomDatabase.MAX_BIND_PARAMETER_CNT),
    FIRST_OPENED(10);
    
    int v;

    m(int i) {
        this.v = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a() {
        return am.EVENT_TABLE.c;
    }
}
