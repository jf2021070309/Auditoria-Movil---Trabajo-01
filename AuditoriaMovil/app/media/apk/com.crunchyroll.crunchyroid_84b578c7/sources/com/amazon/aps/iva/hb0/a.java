package com.amazon.aps.iva.hb0;

import java.util.Iterator;
import java.util.Map;
/* compiled from: TextMapExtractAdapter.java */
/* loaded from: classes4.dex */
public final class a implements Iterable {
    public final Map<String, String> b;

    public a(Map<String, String> map) {
        this.b = map;
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<String, String>> iterator() {
        return this.b.entrySet().iterator();
    }
}
