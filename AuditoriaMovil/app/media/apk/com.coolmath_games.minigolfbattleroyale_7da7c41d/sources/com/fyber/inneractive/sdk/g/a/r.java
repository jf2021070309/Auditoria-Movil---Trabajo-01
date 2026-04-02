package com.fyber.inneractive.sdk.g.a;

import com.vungle.warren.analytics.AnalyticsEvent;
import com.vungle.warren.ui.JavascriptBridge;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public enum r {
    EVENT_FINAL_RETURN("finalReturn"),
    EVENT_IMPRESSION("impression"),
    EVENT_START("start"),
    EVENT_FIRSTQ("firstQuartile"),
    EVENT_MID("midpoint"),
    EVENT_THIRDQ("thirdQuartile"),
    EVENT_COMPLETE("complete"),
    EVENT_MUTE(AnalyticsEvent.Ad.mute),
    EVENT_UNMUTE(AnalyticsEvent.Ad.unmute),
    EVENT_PAUSE("pause"),
    EVENT_RESUME("resume"),
    EVENT_FULLSCREEN("fullscreen"),
    EVENT_EXIT_FULLSCREEN("exitFullscreen"),
    EVENT_CREATIVE_VIEW("creativeView"),
    EVENT_CLICK("click"),
    EVENT_ERROR("error"),
    EVENT_REWIND("rewind"),
    EVENT_CLOSE(JavascriptBridge.MraidHandler.CLOSE_ACTION),
    EVENT_EXPAND("expand"),
    EVENT_COLLAPSE("collapse"),
    EVENT_CLOSE_LINEAR("closeLinear"),
    UNKNOWN("UnkownEvent");
    
    private static final Map<String, r> x = new HashMap();
    public final String w;

    static {
        r[] values;
        for (r rVar : values()) {
            x.put(rVar.w, rVar);
        }
    }

    r(String str) {
        this.w = str;
    }

    public static r a(String str) {
        return x.containsKey(str) ? x.get(str) : UNKNOWN;
    }
}
