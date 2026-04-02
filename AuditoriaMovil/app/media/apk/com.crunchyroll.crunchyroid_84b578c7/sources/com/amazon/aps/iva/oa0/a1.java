package com.amazon.aps.iva.oa0;

import java.util.HashMap;
/* compiled from: SingularMap.java */
/* loaded from: classes4.dex */
public abstract class a1 extends HashMap<String, String> {
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: d */
    public final String put(String str, String str2) {
        if (f1.i(str2)) {
            return null;
        }
        return (String) super.put(str, str2);
    }
}
