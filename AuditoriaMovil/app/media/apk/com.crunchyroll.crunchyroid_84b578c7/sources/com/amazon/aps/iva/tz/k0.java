package com.amazon.aps.iva.tz;

import com.ellation.crunchyroll.model.Panel;
import java.util.Date;
import java.util.concurrent.TimeUnit;
/* compiled from: BrowseAllUiByNewestMapper.kt */
/* loaded from: classes2.dex */
public final class k0 {
    public static com.amazon.aps.iva.a00.c a(Panel panel) {
        com.amazon.aps.iva.yb0.j.f(panel, "<this>");
        Date lastUpdated = panel.getLastUpdated();
        if (lastUpdated == null) {
            return com.amazon.aps.iva.a00.c.EARLIER;
        }
        long days = TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - lastUpdated.getTime());
        if (days < 1) {
            return com.amazon.aps.iva.a00.c.PAST_DAY;
        }
        if (days < 7) {
            return com.amazon.aps.iva.a00.c.PAST_WEEK;
        }
        return com.amazon.aps.iva.a00.c.EARLIER;
    }
}
