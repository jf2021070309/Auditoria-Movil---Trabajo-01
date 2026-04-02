package com.amazon.aps.iva.oe0;

import java.util.NoSuchElementException;
/* compiled from: _Strings.kt */
/* loaded from: classes4.dex */
public class r extends q {
    public static final char P0(CharSequence charSequence) {
        boolean z;
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return charSequence.charAt(q.n0(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static final String Q0(int i, String str) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(str, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            String substring = str.substring(0, i);
            com.amazon.aps.iva.yb0.j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException(com.amazon.aps.iva.c80.a.d("Requested character count ", i, " is less than zero.").toString());
    }
}
