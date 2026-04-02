package com.ironsource.mediationsdk.utils;

import java.util.Date;
/* loaded from: classes2.dex */
public final class f {
    private long a = new Date().getTime();

    public static long a(f fVar) {
        if (fVar == null) {
            return 0L;
        }
        return new Date().getTime() - fVar.a;
    }
}
