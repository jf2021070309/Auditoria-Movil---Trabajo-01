package com.fyber.inneractive.sdk.d.a;
/* loaded from: classes.dex */
public final class c {
    a a;
    Object b;

    /* loaded from: classes.dex */
    public enum a {
        BITRATE_NOT_IN_RANGE(1),
        UNSUPPORTED_MIME_TYPE(2),
        UNSUPPORTED_DELIVERY(3),
        UNSECURED_VIDEO_URL(4),
        VERTICAL_VIDEO_EXPECTED(5),
        FILTERED_BY_APP_OR_UNIT(6),
        NO_CONTENT(7);
        
        int h;

        a(int i2) {
            this.h = i2;
        }
    }

    public c(a aVar) {
        this(aVar, null);
    }

    public c(a aVar, Object obj) {
        this.a = aVar;
        this.b = obj;
    }

    public final String toString() {
        return "Media File inc error::  type = " + this.a + " expected value = " + this.b;
    }
}
