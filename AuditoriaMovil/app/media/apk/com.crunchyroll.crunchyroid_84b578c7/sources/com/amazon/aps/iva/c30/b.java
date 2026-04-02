package com.amazon.aps.iva.c30;

import com.amazon.aps.iva.kb0.h;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
/* compiled from: CrPlusDurationModel.kt */
/* loaded from: classes2.dex */
public final class b {

    /* compiled from: CrPlusDurationModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.amazon.aps.iva.ss.a.values().length];
            try {
                iArr[com.amazon.aps.iva.ss.a.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.amazon.aps.iva.ss.a.MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.amazon.aps.iva.ss.a.YEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final int a(com.amazon.aps.iva.ss.b bVar) {
        j.f(bVar, "<this>");
        int i = a.a[bVar.c.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return R.plurals.upsell_tier_price_subtitle_period_years;
                }
                throw new h();
            }
            return R.plurals.upsell_tier_price_subtitle_period_months;
        }
        return R.plurals.upsell_tier_price_subtitle_period_days;
    }
}
