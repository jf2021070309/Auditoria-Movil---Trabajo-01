package com.amazon.aps.iva.i4;

import android.annotation.SuppressLint;
import java.util.Collections;
import java.util.Set;
/* compiled from: EmojiExclusions.java */
/* loaded from: classes.dex */
public final class f {
    @SuppressLint({"BanUncheckedReflection"})
    public static Set<int[]> a() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", new Class[0]).invoke(null, new Object[0]);
            if (invoke == null) {
                return Collections.emptySet();
            }
            Set<int[]> set = (Set) invoke;
            for (int[] iArr : set) {
                if (!(iArr instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.emptySet();
        }
    }
}
