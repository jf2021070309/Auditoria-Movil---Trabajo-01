package com.amazon.aps.iva.c8;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import com.amazon.aps.iva.s5.a;
/* compiled from: SubtitleViewUtils.java */
/* loaded from: classes.dex */
public final class w {
    public static void a(a.C0695a c0695a) {
        Object[] spans;
        boolean z;
        c0695a.k = -3.4028235E38f;
        c0695a.j = Integer.MIN_VALUE;
        CharSequence charSequence = c0695a.a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                c0695a.a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = c0695a.a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if (!(obj instanceof AbsoluteSizeSpan) && !(obj instanceof RelativeSizeSpan)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static float b(float f, int i, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f2 = i2;
        } else {
            f2 = i3;
        }
        return f * f2;
    }
}
