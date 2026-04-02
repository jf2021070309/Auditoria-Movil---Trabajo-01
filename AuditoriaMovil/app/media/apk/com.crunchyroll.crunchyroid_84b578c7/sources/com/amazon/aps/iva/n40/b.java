package com.amazon.aps.iva.n40;

import android.content.Context;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.google.firebase.crashlytics.internal.common.IdManager;
import java.math.RoundingMode;
import java.text.DecimalFormat;
/* compiled from: DownloadSizeFormatter.kt */
/* loaded from: classes2.dex */
public final class b implements a {
    public final Context a;
    public final DecimalFormat b;

    public b(Context context, DecimalFormat decimalFormat) {
        this.a = context;
        this.b = decimalFormat;
    }

    @Override // com.amazon.aps.iva.n40.a
    public final String a(long j) {
        double d = j;
        double d2 = d / 1099511627776L;
        double d3 = d / 1073741824;
        double d4 = d / 1048576;
        int i = (d2 > 1.0d ? 1 : (d2 == 1.0d ? 0 : -1));
        Context context = this.a;
        if (i >= 0) {
            DecimalFormat decimalFormat = new DecimalFormat(IdManager.DEFAULT_VERSION_NAME);
            decimalFormat.setRoundingMode(RoundingMode.UP);
            String format = decimalFormat.format(d2);
            j.e(format, "df.format(this)");
            String string = context.getString(R.string.synced_content_size_terabytes, format);
            j.e(string, "getString(R.string.synce…aBytes.toCompactNumber())");
            return string;
        } else if (d3 >= 1.0d) {
            DecimalFormat decimalFormat2 = new DecimalFormat(IdManager.DEFAULT_VERSION_NAME);
            decimalFormat2.setRoundingMode(RoundingMode.UP);
            String format2 = decimalFormat2.format(d3);
            j.e(format2, "df.format(this)");
            String string2 = context.getString(R.string.synced_content_size_gigabytes, format2);
            j.e(string2, "getString(R.string.synce…aBytes.toCompactNumber())");
            return string2;
        } else {
            String string3 = context.getString(R.string.synced_content_size_megabytes, String.valueOf((int) d4));
            j.e(string3, "getString(R.string.synce…Bytes.toInt().toString())");
            return string3;
        }
    }

    @Override // com.amazon.aps.iva.n40.a
    public final String b(int i, int i2) {
        String quantityString = this.a.getResources().getQuantityString(i, i2, this.b.format(Integer.valueOf(i2)).toString());
        j.e(quantityString, "context.resources.getQua…unt).toString()\n        )");
        return quantityString;
    }
}
