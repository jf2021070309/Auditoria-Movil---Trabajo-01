package com.kwad.components.core.k;

import com.kwad.sdk.core.e.c;
import java.text.SimpleDateFormat;
import java.util.Date;
/* loaded from: classes.dex */
public class a extends com.kwad.sdk.core.response.a.a implements com.kwad.sdk.core.b {
    private static SimpleDateFormat Lj = new SimpleDateFormat("yyyy-MM-dd");
    public int Lk;
    public long Ll;

    public final boolean h(int i, int i2) {
        c.d("AdForceActiveInfo", "checkAndAddCount forceActiveIntervalHour: " + i + ", forceActiveThreshold: " + i2);
        if (this.Ll <= 0) {
            og();
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String format = Lj.format(new Date(this.Ll));
        String format2 = Lj.format(new Date(currentTimeMillis));
        c.d("AdForceActiveInfo", "checkAndAddCount lastDate: " + format + ", currentDate: " + format2);
        if (!format.equals(format2)) {
            this.Lk = 0;
            og();
            return true;
        }
        long j = this.Ll + (i * 60 * 60 * 1000);
        c.d("AdForceActiveInfo", "checkAndAddCount minTimestamp: " + j + ", currentActiveCount: " + this.Lk);
        if (j >= currentTimeMillis || this.Lk > i2) {
            return false;
        }
        og();
        return true;
    }

    public final void og() {
        this.Ll = System.currentTimeMillis();
        this.Lk++;
        c.d("AdForceActiveInfo", "doAddCount, lastForceActiveTimestamp: " + this.Ll + ", currentActiveCount " + this.Lk);
    }
}
