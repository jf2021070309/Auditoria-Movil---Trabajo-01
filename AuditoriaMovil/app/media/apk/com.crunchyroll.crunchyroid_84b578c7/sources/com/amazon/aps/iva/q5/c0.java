package com.amazon.aps.iva.q5;

import java.util.HashSet;
/* compiled from: MediaLibraryInfo.java */
/* loaded from: classes.dex */
public final class c0 {
    public static final HashSet<String> a = new HashSet<>();
    public static String b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (c0.class) {
            if (a.add(str)) {
                b += ", " + str;
            }
        }
    }
}
