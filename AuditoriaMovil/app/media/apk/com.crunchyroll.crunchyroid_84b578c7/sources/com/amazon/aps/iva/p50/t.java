package com.amazon.aps.iva.p50;

import android.content.res.Resources;
import com.crunchyroll.crunchyroid.R;
/* compiled from: UserRatingHeaderTextFormatter.kt */
/* loaded from: classes2.dex */
public final class t implements s {
    public final Resources a;

    public t(Resources resources) {
        this.a = resources;
    }

    @Override // com.amazon.aps.iva.p50.s
    public final String a(int i) {
        Resources resources = this.a;
        if (i == 0) {
            String string = resources.getString(R.string.show_rating_dialog_v2_need_rating);
            com.amazon.aps.iva.yb0.j.e(string, "{\n        resources.getS…log_v2_need_rating)\n    }");
            return string;
        }
        String quantityString = resources.getQuantityString(R.plurals.show_rating_dialog_v2_already_rated, i, Integer.valueOf(i));
        com.amazon.aps.iva.yb0.j.e(quantityString, "{\n        resources.getQ…g, rating\n        )\n    }");
        return quantityString;
    }
}
