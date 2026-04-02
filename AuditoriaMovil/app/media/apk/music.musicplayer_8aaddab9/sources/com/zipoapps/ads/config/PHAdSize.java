package com.zipoapps.ads.config;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.ads.AdSize;
import h.e;
import h.o.c.f;
import h.o.c.j;
/* loaded from: classes2.dex */
public final class PHAdSize {
    private final int height;
    private final SizeType sizeType;
    private final int width;
    public static final Companion Companion = new Companion(null);
    public static final PHAdSize BANNER = new PHAdSize(SizeType.BANNER, 0, 0, 6, null);
    public static final PHAdSize FULL_BANNER = new PHAdSize(SizeType.FULL_BANNER, 0, 0, 6, null);
    public static final PHAdSize LARGE_BANNER = new PHAdSize(SizeType.LARGE_BANNER, 0, 0, 6, null);
    public static final PHAdSize LEADERBOARD = new PHAdSize(SizeType.LEADERBOARD, 0, 0, 6, null);
    public static final PHAdSize MEDIUM_RECTANGLE = new PHAdSize(SizeType.MEDIUM_RECTANGLE, 0, 0, 6, null);
    public static final PHAdSize WIDE_SKYSCRAPER = new PHAdSize(SizeType.WIDE_SKYSCRAPER, 0, 0, 6, null);
    public static final PHAdSize FLUID = new PHAdSize(SizeType.FLUID, 0, 0, 6, null);

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public static PHAdSize adaptiveBanner$default(Companion companion, Activity activity, int i2, int i3, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                j.e(activity, "activity");
                DisplayMetrics displayMetrics = new DisplayMetrics();
                activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                float f2 = displayMetrics.widthPixels / displayMetrics.density;
                if (Float.isNaN(f2)) {
                    throw new IllegalArgumentException("Cannot round NaN value.");
                }
                i2 = Math.round(f2);
            }
            if ((i4 & 4) != 0) {
                i3 = 0;
            }
            return companion.adaptiveBanner(activity, i2, i3);
        }

        public static /* synthetic */ PHAdSize adaptiveBanner$default(Companion companion, Activity activity, int i2, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                i2 = 0;
            }
            return companion.adaptiveBanner(activity, i2);
        }

        public final PHAdSize adaptiveAnchoredBanner(int i2) {
            return new PHAdSize(SizeType.ADAPTIVE_ANCHORED, i2, 0, 4, null);
        }

        public final PHAdSize adaptiveAnchoredBanner(Activity activity) {
            j.e(activity, "activity");
            SizeType sizeType = SizeType.ADAPTIVE_ANCHORED;
            j.e(activity, "activity");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            float f2 = displayMetrics.widthPixels / displayMetrics.density;
            if (Float.isNaN(f2)) {
                throw new IllegalArgumentException("Cannot round NaN value.");
            }
            return new PHAdSize(sizeType, Math.round(f2), 0, 4, null);
        }

        public final PHAdSize adaptiveBanner(Activity activity) {
            j.e(activity, "activity");
            return adaptiveBanner$default(this, activity, 0, 2, null);
        }

        public final PHAdSize adaptiveBanner(Activity activity, int i2) {
            j.e(activity, "activity");
            SizeType sizeType = SizeType.ADAPTIVE;
            j.e(activity, "activity");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            float f2 = displayMetrics.widthPixels / displayMetrics.density;
            if (Float.isNaN(f2)) {
                throw new IllegalArgumentException("Cannot round NaN value.");
            }
            return new PHAdSize(sizeType, Math.round(f2), i2);
        }

        public final PHAdSize adaptiveBanner(Activity activity, int i2, int i3) {
            j.e(activity, "activity");
            return new PHAdSize(SizeType.ADAPTIVE, i2, i3);
        }
    }

    /* loaded from: classes2.dex */
    public enum SizeType {
        BANNER,
        FULL_BANNER,
        LARGE_BANNER,
        LEADERBOARD,
        MEDIUM_RECTANGLE,
        WIDE_SKYSCRAPER,
        FLUID,
        ADAPTIVE,
        ADAPTIVE_ANCHORED
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            SizeType.values();
            int[] iArr = new int[9];
            iArr[SizeType.BANNER.ordinal()] = 1;
            iArr[SizeType.FULL_BANNER.ordinal()] = 2;
            iArr[SizeType.LARGE_BANNER.ordinal()] = 3;
            iArr[SizeType.LEADERBOARD.ordinal()] = 4;
            iArr[SizeType.MEDIUM_RECTANGLE.ordinal()] = 5;
            iArr[SizeType.WIDE_SKYSCRAPER.ordinal()] = 6;
            iArr[SizeType.FLUID.ordinal()] = 7;
            iArr[SizeType.ADAPTIVE.ordinal()] = 8;
            iArr[SizeType.ADAPTIVE_ANCHORED.ordinal()] = 9;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PHAdSize(SizeType sizeType, int i2, int i3) {
        j.e(sizeType, "sizeType");
        this.sizeType = sizeType;
        this.width = i2;
        this.height = i3;
    }

    public /* synthetic */ PHAdSize(SizeType sizeType, int i2, int i3, int i4, f fVar) {
        this(sizeType, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }

    public static final PHAdSize adaptiveAnchoredBanner(int i2) {
        return Companion.adaptiveAnchoredBanner(i2);
    }

    public static final PHAdSize adaptiveAnchoredBanner(Activity activity) {
        return Companion.adaptiveAnchoredBanner(activity);
    }

    public static final PHAdSize adaptiveBanner(Activity activity) {
        return Companion.adaptiveBanner(activity);
    }

    public static final PHAdSize adaptiveBanner(Activity activity, int i2) {
        return Companion.adaptiveBanner(activity, i2);
    }

    public static final PHAdSize adaptiveBanner(Activity activity, int i2, int i3) {
        return Companion.adaptiveBanner(activity, i2, i3);
    }

    public final AdSize asAdSize(Context context) {
        j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        switch (this.sizeType.ordinal()) {
            case 0:
                AdSize adSize = AdSize.BANNER;
                j.d(adSize, "BANNER");
                return adSize;
            case 1:
                AdSize adSize2 = AdSize.FULL_BANNER;
                j.d(adSize2, "FULL_BANNER");
                return adSize2;
            case 2:
                AdSize adSize3 = AdSize.LARGE_BANNER;
                j.d(adSize3, "LARGE_BANNER");
                return adSize3;
            case 3:
                AdSize adSize4 = AdSize.LEADERBOARD;
                j.d(adSize4, "LEADERBOARD");
                return adSize4;
            case 4:
                AdSize adSize5 = AdSize.MEDIUM_RECTANGLE;
                j.d(adSize5, "MEDIUM_RECTANGLE");
                return adSize5;
            case 5:
                AdSize adSize6 = AdSize.WIDE_SKYSCRAPER;
                j.d(adSize6, "WIDE_SKYSCRAPER");
                return adSize6;
            case 6:
                AdSize adSize7 = AdSize.FLUID;
                j.d(adSize7, "FLUID");
                return adSize7;
            case 7:
                int i2 = this.height;
                AdSize inlineAdaptiveBannerAdSize = i2 > 0 ? AdSize.getInlineAdaptiveBannerAdSize(this.width, i2) : AdSize.getCurrentOrientationInlineAdaptiveBannerAdSize(context, this.width);
                j.d(inlineAdaptiveBannerAdSize, "{\n                if (he…          }\n            }");
                return inlineAdaptiveBannerAdSize;
            case 8:
                AdSize currentOrientationAnchoredAdaptiveBannerAdSize = AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(context, this.width);
                j.d(currentOrientationAnchoredAdaptiveBannerAdSize, "{\n                AdSize…ext, width)\n            }");
                return currentOrientationAnchoredAdaptiveBannerAdSize;
            default:
                throw new e();
        }
    }

    public final int getHeight() {
        return this.height;
    }

    public final SizeType getSizeType() {
        return this.sizeType;
    }

    public final int getWidth() {
        return this.width;
    }
}
