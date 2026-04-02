package com.facebook.ads;

import com.facebook.ads.internal.n.j;
/* loaded from: classes2.dex */
public enum VideoAutoplayBehavior {
    DEFAULT,
    ON,
    OFF;

    public static VideoAutoplayBehavior fromInternalAutoplayBehavior(j jVar) {
        if (jVar == null) {
            return DEFAULT;
        }
        switch (jVar) {
            case DEFAULT:
                return DEFAULT;
            case ON:
                return ON;
            case OFF:
                return OFF;
            default:
                return DEFAULT;
        }
    }
}
