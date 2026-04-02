package com.fyber.inneractive.sdk.j;
/* loaded from: classes.dex */
public enum a {
    RETURNED_ADTYPE_HTML(4),
    RETURNED_ADTYPE_MRAID(6),
    RETURNED_ADTYPE_VAST(8),
    RETURNED_ADTYPE_HTML5_VIDEO(9),
    RETURNED_ADTYPE_NATIVE(10),
    RETURNED_ADTYPE_PMN(11),
    RETURNED_ADTYPE_MOBILE_ADS(15);
    
    private int h;

    a(int i2) {
        this.h = i2;
    }

    public static a a(int i2) {
        a[] values;
        for (a aVar : values()) {
            if (aVar.h == i2) {
                return aVar;
            }
        }
        return null;
    }
}
