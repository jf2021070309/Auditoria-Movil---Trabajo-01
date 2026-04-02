package com.amazon.aps.iva.v1;

import java.text.BreakIterator;
import java.util.Locale;
/* compiled from: AccessibilityIterators.android.kt */
/* loaded from: classes.dex */
public final class h extends b {
    public static h d;
    public BreakIterator c;

    public h(Locale locale) {
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        com.amazon.aps.iva.yb0.j.e(wordInstance, "getWordInstance(locale)");
        this.c = wordInstance;
    }

    @Override // com.amazon.aps.iva.v1.g
    public final int[] a(int i) {
        boolean z;
        if (d().length() <= 0 || i >= d().length()) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (!g(i)) {
            if (g(i) && (i == 0 || !g(i - 1))) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                break;
            }
            BreakIterator breakIterator = this.c;
            if (breakIterator != null) {
                i = breakIterator.following(i);
                if (i == -1) {
                    return null;
                }
            } else {
                com.amazon.aps.iva.yb0.j.m("impl");
                throw null;
            }
        }
        BreakIterator breakIterator2 = this.c;
        if (breakIterator2 != null) {
            int following = breakIterator2.following(i);
            if (following == -1 || !f(following)) {
                return null;
            }
            return c(i, following);
        }
        com.amazon.aps.iva.yb0.j.m("impl");
        throw null;
    }

    @Override // com.amazon.aps.iva.v1.g
    public final int[] b(int i) {
        boolean z;
        int length = d().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && !g(i - 1) && !f(i)) {
            BreakIterator breakIterator = this.c;
            if (breakIterator != null) {
                i = breakIterator.preceding(i);
                if (i == -1) {
                    return null;
                }
            } else {
                com.amazon.aps.iva.yb0.j.m("impl");
                throw null;
            }
        }
        BreakIterator breakIterator2 = this.c;
        if (breakIterator2 != null) {
            int preceding = breakIterator2.preceding(i);
            if (preceding != -1) {
                if (g(preceding) && (preceding == 0 || !g(preceding - 1))) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return c(preceding, i);
                }
            }
            return null;
        }
        com.amazon.aps.iva.yb0.j.m("impl");
        throw null;
    }

    public final void e(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "text");
        this.a = str;
        BreakIterator breakIterator = this.c;
        if (breakIterator != null) {
            breakIterator.setText(str);
        } else {
            com.amazon.aps.iva.yb0.j.m("impl");
            throw null;
        }
    }

    public final boolean f(int i) {
        if (i > 0 && g(i - 1) && (i == d().length() || !g(i))) {
            return true;
        }
        return false;
    }

    public final boolean g(int i) {
        if (i >= 0 && i < d().length()) {
            return Character.isLetterOrDigit(d().codePointAt(i));
        }
        return false;
    }
}
