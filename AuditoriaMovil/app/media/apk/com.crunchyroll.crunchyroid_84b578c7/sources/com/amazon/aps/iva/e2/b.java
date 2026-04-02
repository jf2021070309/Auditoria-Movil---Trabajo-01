package com.amazon.aps.iva.e2;

import com.amazon.aps.iva.b6.x;
import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.d2.g;
import com.amazon.aps.iva.yb0.j;
import java.text.BreakIterator;
import java.util.Locale;
/* compiled from: WordIterator.kt */
/* loaded from: classes.dex */
public final class b {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final BreakIterator d;

    /* compiled from: WordIterator.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static boolean a(int i) {
            int type = Character.getType(i);
            if (type != 23 && type != 20 && type != 22 && type != 30 && type != 29 && type != 24 && type != 21) {
                return false;
            }
            return true;
        }
    }

    public b(CharSequence charSequence, int i, Locale locale) {
        boolean z;
        this.a = charSequence;
        boolean z2 = true;
        if (charSequence.length() >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if ((i < 0 || i > charSequence.length()) ? false : z2) {
                BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
                j.e(wordInstance, "getWordInstance(locale)");
                this.d = wordInstance;
                this.b = Math.max(0, -50);
                this.c = Math.min(charSequence.length(), i + 50);
                wordInstance.setText(new g(charSequence, i));
                return;
            }
            throw new IllegalArgumentException("input end index is outside the CharSequence".toString());
        }
        throw new IllegalArgumentException("input start index is outside the CharSequence".toString());
    }

    public final void a(int i) {
        boolean z = false;
        int i2 = this.b;
        int i3 = this.c;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(b2.b(x.a("Invalid offset: ", i, ". Valid range is [", i2, " , "), i3, ']').toString());
    }

    public final boolean b(int i) {
        boolean z;
        int i2 = this.b + 1;
        if (i <= this.c && i2 <= i) {
            z = true;
        } else {
            z = false;
        }
        if (z && Character.isLetterOrDigit(Character.codePointBefore(this.a, i))) {
            return true;
        }
        return false;
    }

    public final boolean c(int i) {
        boolean z = true;
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            z = false;
        }
        if (!z) {
            return false;
        }
        return a.a(Character.codePointBefore(this.a, i));
    }

    public final boolean d(int i) {
        boolean z;
        if (i < this.c && this.b <= i) {
            z = true;
        } else {
            z = false;
        }
        if (z && Character.isLetterOrDigit(Character.codePointAt(this.a, i))) {
            return true;
        }
        return false;
    }

    public final boolean e(int i) {
        boolean z;
        if (i < this.c && this.b <= i) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return a.a(Character.codePointAt(this.a, i));
    }
}
