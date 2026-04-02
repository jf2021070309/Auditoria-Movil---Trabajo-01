package com.kwad.components.ad.fullscreen.b;

import com.kwad.sdk.core.e.c;
import java.text.SimpleDateFormat;
import java.util.Date;
/* loaded from: classes.dex */
public class b extends com.kwad.sdk.core.response.a.a {
    private static SimpleDateFormat gc = new SimpleDateFormat("yyyy-MM-dd");
    public long gd;
    public int ge;

    public b() {
        this.gd = -1L;
        this.ge = -1;
    }

    public b(long j, int i) {
        this.gd = -1L;
        this.ge = -1;
        this.gd = j;
        this.ge = 1;
    }

    public final boolean e(long j) {
        if (this.gd > 0 && j > 0) {
            try {
                return gc.format(new Date(this.gd)).equals(gc.format(new Date(j)));
            } catch (Exception e) {
                c.printStackTraceOnly(e);
            }
        }
        return false;
    }

    public final boolean v(int i) {
        int i2 = this.ge;
        return i2 > 0 && i2 >= i;
    }
}
