package com.amazon.aps.iva.la0;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.oe0.m;
import java.util.regex.Pattern;
/* compiled from: BandwidthMetrics.kt */
/* loaded from: classes4.dex */
public abstract class d {

    /* compiled from: BandwidthMetrics.kt */
    /* loaded from: classes4.dex */
    public static final class a extends d {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        @Override // com.amazon.aps.iva.la0.d
        public final boolean a(String str) {
            boolean z = str instanceof String;
            String str2 = this.a;
            if (z && (str2 instanceof String)) {
                return m.Z(str, str2);
            }
            if (str != str2) {
                if (str != null && str2 != null && str.length() == str2.length()) {
                    int length = str.length();
                    for (int i = 0; i < length; i++) {
                        if (x.K(str.charAt(i), str2.charAt(i), true)) {
                        }
                    }
                }
                return false;
            }
            return true;
        }
    }

    /* compiled from: BandwidthMetrics.kt */
    /* loaded from: classes4.dex */
    public static final class b extends d {
        public final Pattern a;

        public b(Pattern pattern) {
            this.a = pattern;
        }

        @Override // com.amazon.aps.iva.la0.d
        public final boolean a(String str) {
            if (str != null) {
                return this.a.matcher(str).find();
            }
            return false;
        }
    }

    public abstract boolean a(String str);
}
