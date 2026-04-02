package e.c.a.m.t;

import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class j implements h {

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, List<i>> f5796b;

    /* renamed from: c  reason: collision with root package name */
    public volatile Map<String, String> f5797c;

    /* loaded from: classes.dex */
    public static final class a {
        public static final String a;

        /* renamed from: b  reason: collision with root package name */
        public static final Map<String, List<i>> f5798b;

        /* renamed from: c  reason: collision with root package name */
        public Map<String, List<i>> f5799c = f5798b;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb = new StringBuilder(property.length());
                for (int i2 = 0; i2 < length; i2++) {
                    char charAt = property.charAt(i2);
                    if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                        sb.append(charAt);
                    } else {
                        sb.append('?');
                    }
                }
                property = sb.toString();
            }
            a = property;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(property)));
            }
            f5798b = Collections.unmodifiableMap(hashMap);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements i {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        @Override // e.c.a.m.t.i
        public String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.a.equals(((b) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            StringBuilder y = e.a.d.a.a.y("StringHeaderFactory{value='");
            y.append(this.a);
            y.append(CoreConstants.SINGLE_QUOTE_CHAR);
            y.append('}');
            return y.toString();
        }
    }

    public j(Map<String, List<i>> map) {
        this.f5796b = Collections.unmodifiableMap(map);
    }

    @Override // e.c.a.m.t.h
    public Map<String, String> a() {
        if (this.f5797c == null) {
            synchronized (this) {
                if (this.f5797c == null) {
                    this.f5797c = Collections.unmodifiableMap(b());
                }
            }
        }
        return this.f5797c;
    }

    public final Map<String, String> b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<i>> entry : this.f5796b.entrySet()) {
            List<i> value = entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = value.size();
            for (int i2 = 0; i2 < size; i2++) {
                String a2 = value.get(i2).a();
                if (!TextUtils.isEmpty(a2)) {
                    sb.append(a2);
                    if (i2 != value.size() - 1) {
                        sb.append(CoreConstants.COMMA_CHAR);
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

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f5796b.equals(((j) obj).f5796b);
        }
        return false;
    }

    public int hashCode() {
        return this.f5796b.hashCode();
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("LazyHeaders{headers=");
        y.append(this.f5796b);
        y.append('}');
        return y.toString();
    }
}
