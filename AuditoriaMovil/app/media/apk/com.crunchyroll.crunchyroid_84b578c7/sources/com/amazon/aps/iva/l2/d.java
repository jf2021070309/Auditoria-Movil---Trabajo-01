package com.amazon.aps.iva.l2;

import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import com.amazon.aps.iva.f1.x;
import com.amazon.aps.iva.o2.m;
import com.amazon.aps.iva.o2.n;
import com.amazon.aps.iva.ob0.f;
import com.amazon.aps.iva.yb0.j;
/* compiled from: SpannableExtensions.android.kt */
/* loaded from: classes.dex */
public final class d {
    public static final float a(long j, float f, com.amazon.aps.iva.o2.c cVar) {
        long b = m.b(j);
        if (n.a(b, 4294967296L)) {
            return cVar.l0(j);
        }
        if (n.a(b, 8589934592L)) {
            return m.c(j) * f;
        }
        return Float.NaN;
    }

    public static final void b(Spannable spannable, long j, int i, int i2) {
        boolean z;
        if (j != x.g) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            e(spannable, new BackgroundColorSpan(i.G(j)), i, i2);
        }
    }

    public static final void c(Spannable spannable, long j, int i, int i2) {
        boolean z;
        if (j != x.g) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            e(spannable, new ForegroundColorSpan(i.G(j)), i, i2);
        }
    }

    public static final void d(Spannable spannable, long j, com.amazon.aps.iva.o2.c cVar, int i, int i2) {
        j.f(cVar, "density");
        long b = m.b(j);
        if (n.a(b, 4294967296L)) {
            e(spannable, new AbsoluteSizeSpan(f.a(cVar.l0(j)), false), i, i2);
        } else if (n.a(b, 8589934592L)) {
            e(spannable, new RelativeSizeSpan(m.c(j)), i, i2);
        }
    }

    public static final void e(Spannable spannable, Object obj, int i, int i2) {
        j.f(spannable, "<this>");
        j.f(obj, "span");
        spannable.setSpan(obj, i, i2, 33);
    }
}
