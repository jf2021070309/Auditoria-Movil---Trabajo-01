package com.facebook.ads.internal.q.a;

import java.util.Set;
/* loaded from: classes2.dex */
public class t {
    public static String a(Set<String> set, String str) {
        StringBuilder sb = new StringBuilder();
        for (String str2 : set) {
            sb.append(str2);
            sb.append(str);
        }
        return sb.length() > 0 ? sb.substring(0, sb.length() - 1) : "";
    }
}
