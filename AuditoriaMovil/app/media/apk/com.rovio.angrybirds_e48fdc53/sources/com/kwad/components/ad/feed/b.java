package com.kwad.components.ad.feed;

import android.content.Context;
import com.kwad.components.ad.feed.b.g;
import com.kwad.components.ad.feed.b.h;
import com.kwad.components.ad.feed.b.i;
import com.kwad.components.ad.feed.b.j;
import com.kwad.components.ad.feed.b.k;
import com.kwad.components.ad.feed.b.l;
import com.kwad.components.model.FeedType;
/* loaded from: classes.dex */
public final class b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.kwad.components.ad.feed.b$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] dF;

        static {
            int[] iArr = new int[FeedType.values().length];
            dF = iArr;
            try {
                iArr[FeedType.FEED_TYPE_TEXT_IMMERSE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                dF[FeedType.FEED_TYPE_TEXT_ABOVE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                dF[FeedType.FEED_TYPE_TEXT_BELOW.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                dF[FeedType.FEED_TYPE_TEXT_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                dF[FeedType.FEED_TYPE_TEXT_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                dF[FeedType.FEED_TYPE_TEXT_ABOVE_GROUP.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                dF[FeedType.FEED_TYPE_UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    private static com.kwad.components.core.widget.b a(Context context, FeedType feedType) {
        switch (AnonymousClass1.dF[feedType.ordinal()]) {
            case 1:
                return new j(context);
            case 2:
                return new com.kwad.components.ad.feed.b.f(context);
            case 3:
                return new h(context);
            case 4:
                return new k(context);
            case 5:
                return new l(context);
            case 6:
            case 7:
                com.kwad.sdk.core.e.c.e("KSFeedFactory", "getSingleImageView type is unknown:" + feedType);
                return null;
            default:
                return null;
        }
    }

    public static com.kwad.components.core.widget.b a(Context context, FeedType feedType, int i) {
        if (feedType == FeedType.FEED_TYPE_TEXT_NEW) {
            return (i == 1 || i == 8) ? new g(context) : new com.kwad.components.ad.feed.b.f(context);
        }
        if (i != 1) {
            if (i == 2) {
                return a(context, feedType);
            }
            if (i == 3) {
                return b(context, feedType);
            }
            if (i != 8) {
                com.kwad.sdk.core.e.c.e("KSFeedFactory", "getNewFeedView materialType is unknown");
                return null;
            }
        }
        return c(context, feedType);
    }

    private static com.kwad.components.core.widget.b b(Context context, FeedType feedType) {
        switch (AnonymousClass1.dF[feedType.ordinal()]) {
            case 1:
                return new j(context);
            case 2:
                return new com.kwad.components.ad.feed.b.f(context);
            case 3:
                return new h(context);
            case 4:
                return new k(context);
            case 5:
                return new l(context);
            case 6:
                return new h(context);
            case 7:
                com.kwad.sdk.core.e.c.e("KSFeedFactory", "getVideoView type is unknown" + feedType);
                return null;
            default:
                return null;
        }
    }

    private static com.kwad.components.core.widget.b c(Context context, FeedType feedType) {
        int i = AnonymousClass1.dF[feedType.ordinal()];
        if (i != 2) {
            if (i != 3) {
                com.kwad.sdk.core.e.c.e("KSFeedFactory", "getVideoView type is unknown:" + feedType);
                return null;
            }
            return new i(context);
        }
        return new g(context);
    }
}
