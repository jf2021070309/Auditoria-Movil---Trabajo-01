package com.amazon.aps.iva.h2;

import com.segment.analytics.Options;
/* compiled from: FontSynthesis.kt */
/* loaded from: classes.dex */
public final class u {
    public final int a;

    public static String a(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "None";
        }
        if (i == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return Options.ALL_INTEGRATIONS_KEY;
        }
        if (i == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            return "Weight";
        }
        if (i == 3) {
            z4 = true;
        }
        if (z4) {
            return "Style";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        if (this.a != ((u) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
