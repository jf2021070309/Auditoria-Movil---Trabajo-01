package com.fyber.inneractive.sdk.a.a.a;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
/* loaded from: classes.dex */
public enum b {
    REWARDED_VIDEO(UnitDisplayType.REWARDED, true),
    INTERSTITIAL_VIDEO(UnitDisplayType.INTERSTITIAL, true),
    RECTANGLE_DISPLAY(UnitDisplayType.MRECT, false),
    REWARDED_DISPLAY(UnitDisplayType.REWARDED, true),
    BANNER_DISPLAY(UnitDisplayType.BANNER, false),
    INTERSTITIAL_DISPLAY(UnitDisplayType.INTERSTITIAL, false),
    NONE(UnitDisplayType.DEFAULT, false);
    
    public UnitDisplayType h;
    public boolean i;

    b(UnitDisplayType unitDisplayType, boolean z) {
        this.h = unitDisplayType;
        this.i = z;
    }

    /* renamed from: com.fyber.inneractive.sdk.a.a.a.b$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[UnitDisplayType.values().length];
            a = iArr;
            try {
                iArr[UnitDisplayType.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[UnitDisplayType.MRECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[UnitDisplayType.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[UnitDisplayType.INTERSTITIAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static b a(String str, String str2) {
        int i = AnonymousClass1.a[UnitDisplayType.fromValue(str).ordinal()];
        if (i == 1) {
            return str2.contains("video") ? REWARDED_VIDEO : REWARDED_DISPLAY;
        } else if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    return null;
                }
                return str2.contains("video") ? INTERSTITIAL_VIDEO : INTERSTITIAL_DISPLAY;
            }
            return BANNER_DISPLAY;
        } else {
            return RECTANGLE_DISPLAY;
        }
    }
}
