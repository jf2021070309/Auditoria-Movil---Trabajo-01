package com.amazon.aps.iva.bb0;

import java.util.regex.Pattern;
/* compiled from: RegexCache.java */
/* loaded from: classes4.dex */
public final class b {
    public final a<String, Pattern> a = new a<>();

    /* compiled from: RegexCache.java */
    /* loaded from: classes4.dex */
    public static class a<K, V> {
        public final int b = 100;
        public final com.amazon.aps.iva.bb0.a a = new com.amazon.aps.iva.bb0.a(this, 134);
    }

    public final Pattern a(String str) {
        Object obj;
        a<String, Pattern> aVar = this.a;
        synchronized (aVar) {
            obj = aVar.a.get(str);
        }
        Pattern pattern = (Pattern) obj;
        if (pattern == null) {
            pattern = Pattern.compile(str);
            a<String, Pattern> aVar2 = this.a;
            synchronized (aVar2) {
                aVar2.a.put(str, pattern);
            }
        }
        return pattern;
    }
}
