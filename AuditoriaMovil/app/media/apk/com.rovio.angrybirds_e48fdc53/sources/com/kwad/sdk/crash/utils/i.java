package com.kwad.sdk.crash.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
/* loaded from: classes.dex */
public final class i {
    private static SimpleDateFormat aCe = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static String ak(long j) {
        return j <= 0 ? "unknown" : aCe.format(new Date(j));
    }
}
