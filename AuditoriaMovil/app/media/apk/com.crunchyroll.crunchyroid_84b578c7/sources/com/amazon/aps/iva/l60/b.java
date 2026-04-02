package com.amazon.aps.iva.l60;

import android.content.Context;
import com.amazon.aps.iva.oe0.q;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import java.math.RoundingMode;
import java.text.DecimalFormat;
/* compiled from: CompactNumberFormatter.kt */
/* loaded from: classes2.dex */
public final class b implements a {
    public final Context a;

    public b(Context context) {
        j.f(context, "context");
        this.a = context;
    }

    public static String c(double d) {
        DecimalFormat decimalFormat = new DecimalFormat("###.#");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        String format = decimalFormat.format(d);
        if (d < 100.0d) {
            j.e(format, "formattedNumber");
            if (!j.a(q.I0(format, ".", format), "0")) {
                return format;
            }
        }
        return String.valueOf((int) d);
    }

    @Override // com.amazon.aps.iva.l60.a
    public final String a(int i) {
        return b(i);
    }

    @Override // com.amazon.aps.iva.l60.a
    public final String b(long j) {
        double d = j;
        double d2 = d / 1000000.0f;
        double d3 = d / 1000.0f;
        int i = (d2 > 1.0d ? 1 : (d2 == 1.0d ? 0 : -1));
        Context context = this.a;
        if (i >= 0) {
            String string = context.getString(R.string.millions, c(d2));
            j.e(string, "getString(R.string.milli…llions.toCompactNumber())");
            return string;
        } else if (d3 >= 1.0d) {
            String string2 = context.getString(R.string.thousands, c(d3));
            j.e(string2, "getString(R.string.thous…usands.toCompactNumber())");
            return string2;
        } else {
            return String.valueOf(j);
        }
    }
}
