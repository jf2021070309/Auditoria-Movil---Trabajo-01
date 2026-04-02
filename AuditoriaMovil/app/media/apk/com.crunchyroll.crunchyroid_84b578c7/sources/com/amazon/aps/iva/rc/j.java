package com.amazon.aps.iva.rc;

import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: LazyHeaders.java */
/* loaded from: classes.dex */
public final class j implements h {
    public final Map<String, List<i>> b;
    public volatile Map<String, String> c;

    /* compiled from: LazyHeaders.java */
    /* loaded from: classes.dex */
    public static final class a {
        public static final Map<String, List<i>> b;
        public final Map<String, List<i>> a = b;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb = new StringBuilder(property.length());
                for (int i = 0; i < length; i++) {
                    char charAt = property.charAt(i);
                    if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                        sb.append(charAt);
                    } else {
                        sb.append('?');
                    }
                }
                property = sb.toString();
            }
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                hashMap.put(HttpHeaders.USER_AGENT, Collections.singletonList(new b(property)));
            }
            b = Collections.unmodifiableMap(hashMap);
        }
    }

    /* compiled from: LazyHeaders.java */
    /* loaded from: classes.dex */
    public static final class b implements i {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        @Override // com.amazon.aps.iva.rc.i
        public final String a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.a.equals(((b) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return defpackage.b.c(new StringBuilder("StringHeaderFactory{value='"), this.a, "'}");
        }
    }

    public j(Map<String, List<i>> map) {
        this.b = Collections.unmodifiableMap(map);
    }

    @Override // com.amazon.aps.iva.rc.h
    public final Map<String, String> a() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = Collections.unmodifiableMap(b());
                }
            }
        }
        return this.c;
    }

    public final HashMap b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<i>> entry : this.b.entrySet()) {
            List<i> value = entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = value.size();
            for (int i = 0; i < size; i++) {
                String a2 = value.get(i).a();
                if (!TextUtils.isEmpty(a2)) {
                    sb.append(a2);
                    if (i != value.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                hashMap.put(entry.getKey(), sb2);
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.b.equals(((j) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.b + '}';
    }
}
