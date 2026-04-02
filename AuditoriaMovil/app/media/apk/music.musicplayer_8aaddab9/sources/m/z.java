package m;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class z {
    public final Method a;

    /* renamed from: b  reason: collision with root package name */
    public final j.s f9921b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9922c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final String f9923d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public final j.r f9924e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public final j.u f9925f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f9926g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f9927h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f9928i;

    /* renamed from: j  reason: collision with root package name */
    public final w<?>[] f9929j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f9930k;

    /* loaded from: classes.dex */
    public static final class a {
        public static final Pattern a = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: b  reason: collision with root package name */
        public static final Pattern f9931b = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: c  reason: collision with root package name */
        public final c0 f9932c;

        /* renamed from: d  reason: collision with root package name */
        public final Method f9933d;

        /* renamed from: e  reason: collision with root package name */
        public final Annotation[] f9934e;

        /* renamed from: f  reason: collision with root package name */
        public final Annotation[][] f9935f;

        /* renamed from: g  reason: collision with root package name */
        public final Type[] f9936g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f9937h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f9938i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f9939j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f9940k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f9941l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f9942m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f9943n;
        public boolean o;
        @Nullable
        public String p;
        public boolean q;
        public boolean r;
        public boolean s;
        @Nullable
        public String t;
        @Nullable
        public j.r u;
        @Nullable
        public j.u v;
        @Nullable
        public Set<String> w;
        @Nullable
        public w<?>[] x;
        public boolean y;

        public a(c0 c0Var, Method method) {
            this.f9932c = c0Var;
            this.f9933d = method;
            this.f9934e = method.getAnnotations();
            this.f9936g = method.getGenericParameterTypes();
            this.f9935f = method.getParameterAnnotations();
        }

        public static Class<?> a(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        public final void b(String str, String str2, boolean z) {
            String str3 = this.p;
            if (str3 != null) {
                throw g0.j(this.f9933d, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.p = str;
            this.q = z;
            if (str2.isEmpty()) {
                return;
            }
            int indexOf = str2.indexOf(63);
            if (indexOf != -1 && indexOf < str2.length() - 1) {
                String substring = str2.substring(indexOf + 1);
                if (a.matcher(substring).find()) {
                    throw g0.j(this.f9933d, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                }
            }
            this.t = str2;
            Matcher matcher = a.matcher(str2);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            this.w = linkedHashSet;
        }

        public final void c(int i2, Type type) {
            if (g0.h(type)) {
                throw g0.l(this.f9933d, i2, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public z(a aVar) {
        this.a = aVar.f9933d;
        this.f9921b = aVar.f9932c.f9847c;
        this.f9922c = aVar.p;
        this.f9923d = aVar.t;
        this.f9924e = aVar.u;
        this.f9925f = aVar.v;
        this.f9926g = aVar.q;
        this.f9927h = aVar.r;
        this.f9928i = aVar.s;
        this.f9929j = aVar.x;
        this.f9930k = aVar.y;
    }
}
