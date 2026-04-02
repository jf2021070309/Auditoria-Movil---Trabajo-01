package com.amazon.aps.iva.bb0;

import com.amazon.aps.iva.bb0.b;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: RegexCache.java */
/* loaded from: classes4.dex */
public final class a extends LinkedHashMap<Object, Object> {
    public final /* synthetic */ b.a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b.a aVar, int i) {
        super(i, 0.75f, true);
        this.b = aVar;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<Object, Object> entry) {
        if (size() > this.b.b) {
            return true;
        }
        return false;
    }
}
