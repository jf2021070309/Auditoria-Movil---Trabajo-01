package com.google.firebase.platforminfo;

import com.amazon.aps.iva.kb0.d;
/* loaded from: classes4.dex */
public final class KotlinDetector {
    private KotlinDetector() {
    }

    public static String detectVersion() {
        try {
            return d.f.toString();
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}
