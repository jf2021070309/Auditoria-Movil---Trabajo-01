package com.amazon.aps.iva.v1;

import java.text.BreakIterator;
import java.util.Locale;
/* compiled from: AccessibilityIterators.android.kt */
/* loaded from: classes.dex */
public final class c extends b {
    public static c d;
    public BreakIterator c;

    public c(Locale locale) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance(locale);
        com.amazon.aps.iva.yb0.j.e(characterInstance, "getCharacterInstance(locale)");
        this.c = characterInstance;
    }

    @Override // com.amazon.aps.iva.v1.g
    public final int[] a(int i) {
        int length = d().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        do {
            BreakIterator breakIterator = this.c;
            if (breakIterator != null) {
                if (!breakIterator.isBoundary(i)) {
                    BreakIterator breakIterator2 = this.c;
                    if (breakIterator2 != null) {
                        i = breakIterator2.following(i);
                    } else {
                        com.amazon.aps.iva.yb0.j.m("impl");
                        throw null;
                    }
                } else {
                    BreakIterator breakIterator3 = this.c;
                    if (breakIterator3 != null) {
                        int following = breakIterator3.following(i);
                        if (following == -1) {
                            return null;
                        }
                        return c(i, following);
                    }
                    com.amazon.aps.iva.yb0.j.m("impl");
                    throw null;
                }
            } else {
                com.amazon.aps.iva.yb0.j.m("impl");
                throw null;
            }
        } while (i != -1);
        return null;
    }

    @Override // com.amazon.aps.iva.v1.g
    public final int[] b(int i) {
        int length = d().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        do {
            BreakIterator breakIterator = this.c;
            if (breakIterator != null) {
                if (!breakIterator.isBoundary(i)) {
                    BreakIterator breakIterator2 = this.c;
                    if (breakIterator2 != null) {
                        i = breakIterator2.preceding(i);
                    } else {
                        com.amazon.aps.iva.yb0.j.m("impl");
                        throw null;
                    }
                } else {
                    BreakIterator breakIterator3 = this.c;
                    if (breakIterator3 != null) {
                        int preceding = breakIterator3.preceding(i);
                        if (preceding == -1) {
                            return null;
                        }
                        return c(preceding, i);
                    }
                    com.amazon.aps.iva.yb0.j.m("impl");
                    throw null;
                }
            } else {
                com.amazon.aps.iva.yb0.j.m("impl");
                throw null;
            }
        } while (i != -1);
        return null;
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
}
