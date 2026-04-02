package com.amazon.aps.iva.jc0;

import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.yb0.l;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: AnnotationConstructorCaller.kt */
/* loaded from: classes4.dex */
public final class c {

    /* compiled from: AnnotationConstructorCaller.kt */
    /* loaded from: classes4.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<Integer> {
        public final /* synthetic */ Map<String, Object> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map<String, ? extends Object> map) {
            super(0);
            this.h = map;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Integer invoke() {
            int hashCode;
            Iterator<T> it = this.h.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    hashCode = Arrays.hashCode((boolean[]) value);
                } else if (value instanceof char[]) {
                    hashCode = Arrays.hashCode((char[]) value);
                } else if (value instanceof byte[]) {
                    hashCode = Arrays.hashCode((byte[]) value);
                } else if (value instanceof short[]) {
                    hashCode = Arrays.hashCode((short[]) value);
                } else if (value instanceof int[]) {
                    hashCode = Arrays.hashCode((int[]) value);
                } else if (value instanceof float[]) {
                    hashCode = Arrays.hashCode((float[]) value);
                } else if (value instanceof long[]) {
                    hashCode = Arrays.hashCode((long[]) value);
                } else if (value instanceof double[]) {
                    hashCode = Arrays.hashCode((double[]) value);
                } else if (value instanceof Object[]) {
                    hashCode = Arrays.hashCode((Object[]) value);
                } else {
                    hashCode = value.hashCode();
                }
                i += hashCode ^ (str.hashCode() * 127);
            }
            return Integer.valueOf(i);
        }
    }

    /* compiled from: AnnotationConstructorCaller.kt */
    /* loaded from: classes4.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a<String> {
        public final /* synthetic */ Class<T> h;
        public final /* synthetic */ Map<String, Object> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Class<T> cls, Map<String, ? extends Object> map) {
            super(0);
            this.h = cls;
            this.i = map;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append('@');
            sb.append(this.h.getCanonicalName());
            x.A0(this.i.entrySet(), sb, ", ", "(", ")", d.h, 48);
            String sb2 = sb.toString();
            com.amazon.aps.iva.yb0.j.e(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
    }

    public static final <T> T a(Class<T> cls, Map<String, ? extends Object> map, List<Method> list) {
        com.amazon.aps.iva.yb0.j.f(cls, "annotationClass");
        com.amazon.aps.iva.yb0.j.f(list, "methods");
        m b2 = com.amazon.aps.iva.kb0.f.b(new a(map));
        T t = (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new com.amazon.aps.iva.jc0.b(cls, map, com.amazon.aps.iva.kb0.f.b(new b(cls, map)), b2, list));
        com.amazon.aps.iva.yb0.j.d(t, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return t;
    }
}
