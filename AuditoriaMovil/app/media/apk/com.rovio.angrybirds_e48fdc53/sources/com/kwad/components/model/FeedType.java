package com.kwad.components.model;

import com.kwad.sdk.core.response.b.a;
import com.kwad.sdk.core.response.b.d;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes.dex */
public enum FeedType {
    FEED_TYPE_UNKNOWN(0),
    FEED_TYPE_TEXT_IMMERSE(1),
    FEED_TYPE_TEXT_LEFT(2),
    FEED_TYPE_TEXT_RIGHT(3),
    FEED_TYPE_TEXT_ABOVE(4),
    FEED_TYPE_TEXT_BELOW(5),
    FEED_TYPE_TEXT_ABOVE_GROUP(6),
    FEED_TYPE_TEXT_NEW(7),
    FEED_TYPE_CONTENT_11(11),
    FEED_TYPE_CONTENT_12(12),
    FEED_TYPE_CONTENT_13(13);
    
    private int type;

    FeedType(int i) {
        this.type = i;
    }

    public static boolean checkTypeValid(AdTemplate adTemplate) {
        int aW = a.aW(d.ck(adTemplate));
        int i = adTemplate.type;
        FeedType feedType = FEED_TYPE_TEXT_ABOVE_GROUP;
        if (i > feedType.type) {
            return true;
        }
        FeedType fromInt = fromInt(adTemplate.type);
        if (aW != 1) {
            if (aW == 2) {
                return (fromInt == FEED_TYPE_UNKNOWN || fromInt == feedType) ? false : true;
            } else if (aW == 3) {
                return fromInt != FEED_TYPE_UNKNOWN;
            } else if (aW != 8) {
                return false;
            }
        }
        return fromInt == FEED_TYPE_TEXT_ABOVE || fromInt == FEED_TYPE_TEXT_BELOW || fromInt == FEED_TYPE_TEXT_IMMERSE;
    }

    public static FeedType fromInt(int i) {
        FeedType[] values;
        for (FeedType feedType : values()) {
            if (feedType.type == i) {
                return feedType;
            }
        }
        return isH5Type(i) ? FEED_TYPE_TEXT_NEW : FEED_TYPE_UNKNOWN;
    }

    private static boolean isH5Type(int i) {
        return i == 7 || i == 8 || i == 14 || i == 15 || i == 16 || i == 17 || i == 18 || i == 19 || i >= 2000;
    }

    public final int getType() {
        return this.type;
    }
}
