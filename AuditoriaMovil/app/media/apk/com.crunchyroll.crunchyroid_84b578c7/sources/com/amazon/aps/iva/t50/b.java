package com.amazon.aps.iva.t50;

import android.content.Context;
import com.amazon.aps.iva.t50.c;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import java.util.Date;
/* compiled from: DateFormatter.kt */
/* loaded from: classes2.dex */
public final class b implements a {
    public final Context a;
    public final c b;

    public b(Context context) {
        c.b bVar = c.b.a;
        this.a = context;
        this.b = bVar;
    }

    @Override // com.amazon.aps.iva.t50.a
    public final String a(Date date) {
        j.f(date, "date");
        long a = (this.b.a() - date.getTime()) / 1000;
        long j = 60;
        long j2 = a / j;
        long j3 = j2 / j;
        long j4 = j3 / 24;
        long j5 = j4 / 30;
        int i = (j5 > 24L ? 1 : (j5 == 24L ? 0 : -1));
        Context context = this.a;
        if (i >= 0) {
            String string = context.getResources().getString(R.string.over_one_year_ago);
            j.e(string, "context.resources.getStr…string.over_one_year_ago)");
            return string;
        } else if (j5 >= 12) {
            String string2 = context.getResources().getString(R.string.about_one_year_ago);
            j.e(string2, "context.resources.getStr…tring.about_one_year_ago)");
            return string2;
        } else if (j4 >= 30) {
            String quantityString = context.getResources().getQuantityString(R.plurals.about_month_ago, (int) j5, Long.valueOf(j5));
            j.e(quantityString, "context.resources.getQua… deltaMonth\n            )");
            return quantityString;
        } else if (j3 >= 24) {
            String quantityString2 = context.getResources().getQuantityString(R.plurals.days_ago, (int) j4, Long.valueOf(j4));
            j.e(quantityString2, "context.resources.getQua…  deltaDays\n            )");
            return quantityString2;
        } else if (j2 >= 60) {
            String quantityString3 = context.getResources().getQuantityString(R.plurals.hours_ago, (int) j3, Long.valueOf(j3));
            j.e(quantityString3, "context.resources.getQua… deltaHours\n            )");
            return quantityString3;
        } else if (a >= 60) {
            String quantityString4 = context.getResources().getQuantityString(R.plurals.mins_ago, (int) j2, Long.valueOf(j2));
            j.e(quantityString4, "context.resources.getQua…  deltaMins\n            )");
            return quantityString4;
        } else {
            String string3 = context.getString(R.string.just_now);
            j.e(string3, "context.getString(R.string.just_now)");
            return string3;
        }
    }
}
