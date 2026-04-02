package com.amazon.aps.iva.d2;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
/* compiled from: TextLayout.kt */
/* loaded from: classes.dex */
public final class l0 {
    public static final i0 a = new i0();
    public static final long b;

    static {
        long j = 0;
        b = (j & 4294967295L) | (j << 32);
    }

    public static final TextDirectionHeuristic a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                                com.amazon.aps.iva.yb0.j.e(textDirectionHeuristic, "FIRSTSTRONG_LTR");
                                return textDirectionHeuristic;
                            }
                            TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.LOCALE;
                            com.amazon.aps.iva.yb0.j.e(textDirectionHeuristic2, "LOCALE");
                            return textDirectionHeuristic2;
                        }
                        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.ANYRTL_LTR;
                        com.amazon.aps.iva.yb0.j.e(textDirectionHeuristic3, "ANYRTL_LTR");
                        return textDirectionHeuristic3;
                    }
                    TextDirectionHeuristic textDirectionHeuristic4 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    com.amazon.aps.iva.yb0.j.e(textDirectionHeuristic4, "FIRSTSTRONG_RTL");
                    return textDirectionHeuristic4;
                }
                TextDirectionHeuristic textDirectionHeuristic5 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                com.amazon.aps.iva.yb0.j.e(textDirectionHeuristic5, "FIRSTSTRONG_LTR");
                return textDirectionHeuristic5;
            }
            TextDirectionHeuristic textDirectionHeuristic6 = TextDirectionHeuristics.RTL;
            com.amazon.aps.iva.yb0.j.e(textDirectionHeuristic6, "RTL");
            return textDirectionHeuristic6;
        }
        TextDirectionHeuristic textDirectionHeuristic7 = TextDirectionHeuristics.LTR;
        com.amazon.aps.iva.yb0.j.e(textDirectionHeuristic7, "LTR");
        return textDirectionHeuristic7;
    }
}
