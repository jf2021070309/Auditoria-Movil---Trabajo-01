package com.amazon.aps.iva.eb0;

import java.util.regex.Pattern;
/* compiled from: MultiFileModeFileNameProvider.java */
/* loaded from: classes4.dex */
public final class i implements j {
    public static final Pattern b = Pattern.compile("^[\\p{L}\\p{N}]+$");
    public final String a;

    public i(String str) {
        this.a = str.concat("_");
    }

    public final String a(Object obj) {
        String obj2 = obj.toString();
        if (b.matcher(obj2).matches()) {
            return this.a + obj;
        }
        throw new IllegalArgumentException(com.amazon.aps.iva.oa.a.a("Invalid key: ", obj2));
    }
}
