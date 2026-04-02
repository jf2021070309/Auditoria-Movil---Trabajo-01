package com.amazon.aps.iva.jf0;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
/* compiled from: RequestFactory.java */
/* loaded from: classes4.dex */
public final class z {
    public final Method a;
    public final HttpUrl b;
    public final String c;
    public final String d;
    public final Headers e;
    public final MediaType f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final w<?>[] j;
    public final boolean k;

    /* compiled from: RequestFactory.java */
    /* loaded from: classes4.dex */
    public static final class a {
        public static final Pattern x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
        public static final Pattern y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
        public final b0 a;
        public final Method b;
        public final Annotation[] c;
        public final Annotation[][] d;
        public final Type[] e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public boolean j;
        public boolean k;
        public boolean l;
        public boolean m;
        public String n;
        public boolean o;
        public boolean p;
        public boolean q;
        public String r;
        public Headers s;
        public MediaType t;
        public LinkedHashSet u;
        public w<?>[] v;
        public boolean w;

        public a(b0 b0Var, Method method) {
            this.a = b0Var;
            this.b = method;
            this.c = method.getAnnotations();
            this.e = method.getGenericParameterTypes();
            this.d = method.getParameterAnnotations();
        }

        public static Class<?> a(Class<?> cls) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            if (Short.TYPE == cls) {
                return Short.class;
            }
            return cls;
        }

        public final void b(String str, String str2, boolean z) {
            String str3 = this.n;
            Method method = this.b;
            if (str3 == null) {
                this.n = str;
                this.o = z;
                if (str2.isEmpty()) {
                    return;
                }
                int indexOf = str2.indexOf(63);
                Pattern pattern = x;
                if (indexOf != -1 && indexOf < str2.length() - 1) {
                    String substring = str2.substring(indexOf + 1);
                    if (pattern.matcher(substring).find()) {
                        throw f0.i(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                    }
                }
                this.r = str2;
                Matcher matcher = pattern.matcher(str2);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                while (matcher.find()) {
                    linkedHashSet.add(matcher.group(1));
                }
                this.u = linkedHashSet;
                return;
            }
            throw f0.i(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        public final void c(int i, Type type) {
            if (!f0.g(type)) {
                return;
            }
            throw f0.j(this.b, i, "Parameter type must not include a type variable or wildcard: %s", type);
        }
    }

    public z(a aVar) {
        this.a = aVar.b;
        this.b = aVar.a.c;
        this.c = aVar.n;
        this.d = aVar.r;
        this.e = aVar.s;
        this.f = aVar.t;
        this.g = aVar.o;
        this.h = aVar.p;
        this.i = aVar.q;
        this.j = aVar.v;
        this.k = aVar.w;
    }
}
