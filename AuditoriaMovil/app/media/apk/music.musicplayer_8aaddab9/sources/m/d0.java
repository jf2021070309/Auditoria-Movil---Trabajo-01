package m;

import j.d;
import j.r;
import j.v;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;
import javax.annotation.Nullable;
import m.a;
import m.g0;
import m.m;
import m.w;
import m.z;
/* loaded from: classes.dex */
public abstract class d0<T> {
    public static <T> d0<T> b(c0 c0Var, Method method) {
        Annotation[] annotationArr;
        Type genericReturnType;
        boolean z;
        Type[] genericParameterTypes;
        int i2;
        int i3;
        w<?> wVar;
        int i4;
        int i5;
        int i6;
        int i7;
        w<?> wVar2;
        w<?> gVar;
        w<?> vVar;
        w<?> cVar;
        w<?> bVar;
        z.a aVar = new z.a(c0Var, method);
        for (Annotation annotation : aVar.f9934e) {
            if (annotation instanceof m.i0.b) {
                aVar.b("DELETE", ((m.i0.b) annotation).value(), false);
            } else if (annotation instanceof m.i0.f) {
                aVar.b("GET", ((m.i0.f) annotation).value(), false);
            } else if (annotation instanceof m.i0.g) {
                aVar.b("HEAD", ((m.i0.g) annotation).value(), false);
            } else if (annotation instanceof m.i0.n) {
                aVar.b("PATCH", ((m.i0.n) annotation).value(), true);
            } else if (annotation instanceof m.i0.o) {
                aVar.b("POST", ((m.i0.o) annotation).value(), true);
            } else if (annotation instanceof m.i0.p) {
                aVar.b("PUT", ((m.i0.p) annotation).value(), true);
            } else if (annotation instanceof m.i0.m) {
                aVar.b("OPTIONS", ((m.i0.m) annotation).value(), false);
            } else if (annotation instanceof m.i0.h) {
                m.i0.h hVar = (m.i0.h) annotation;
                aVar.b(hVar.method(), hVar.path(), hVar.hasBody());
            } else if (annotation instanceof m.i0.k) {
                String[] value = ((m.i0.k) annotation).value();
                if (value.length == 0) {
                    throw g0.j(aVar.f9933d, "@Headers annotation is empty.", new Object[0]);
                }
                r.a aVar2 = new r.a();
                for (String str : value) {
                    int indexOf = str.indexOf(58);
                    if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                        throw g0.j(aVar.f9933d, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                    }
                    String substring = str.substring(0, indexOf);
                    String trim = str.substring(indexOf + 1).trim();
                    if ("Content-Type".equalsIgnoreCase(substring)) {
                        try {
                            aVar.v = j.u.b(trim);
                        } catch (IllegalArgumentException e2) {
                            throw g0.k(aVar.f9933d, e2, "Malformed content type: %s", trim);
                        }
                    } else {
                        aVar2.a(substring, trim);
                    }
                }
                aVar.u = new j.r(aVar2);
            } else if (annotation instanceof m.i0.l) {
                if (aVar.r) {
                    throw g0.j(aVar.f9933d, "Only one encoding annotation is allowed.", new Object[0]);
                }
                aVar.s = true;
            } else if (!(annotation instanceof m.i0.e)) {
                continue;
            } else if (aVar.s) {
                throw g0.j(aVar.f9933d, "Only one encoding annotation is allowed.", new Object[0]);
            } else {
                aVar.r = true;
            }
        }
        if (aVar.p != null) {
            if (!aVar.q) {
                if (aVar.s) {
                    throw g0.j(aVar.f9933d, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (aVar.r) {
                    throw g0.j(aVar.f9933d, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = aVar.f9935f.length;
            aVar.x = new w[length];
            int i8 = length - 1;
            int i9 = 0;
            while (i9 < length) {
                w<?>[] wVarArr = aVar.x;
                Type type = aVar.f9936g[i9];
                Annotation[] annotationArr2 = aVar.f9935f[i9];
                boolean z2 = i9 == i8;
                if (annotationArr2 != null) {
                    int length2 = annotationArr2.length;
                    wVar = null;
                    int i10 = 0;
                    while (i10 < length2) {
                        Annotation annotation2 = annotationArr2[i10];
                        int i11 = length;
                        if (annotation2 instanceof m.i0.y) {
                            aVar.c(i9, type);
                            if (aVar.o) {
                                throw g0.l(aVar.f9933d, i9, "Multiple @Url method annotations found.", new Object[0]);
                            }
                            if (aVar.f9940k) {
                                throw g0.l(aVar.f9933d, i9, "@Path parameters may not be used with @Url.", new Object[0]);
                            }
                            if (aVar.f9941l) {
                                throw g0.l(aVar.f9933d, i9, "A @Url parameter must not come after a @Query.", new Object[0]);
                            }
                            if (aVar.f9942m) {
                                throw g0.l(aVar.f9933d, i9, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                            }
                            if (aVar.f9943n) {
                                throw g0.l(aVar.f9933d, i9, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                            }
                            if (aVar.t != null) {
                                throw g0.l(aVar.f9933d, i9, "@Url cannot be used with @%s URL", aVar.p);
                            }
                            aVar.o = true;
                            if (type != j.s.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                throw g0.l(aVar.f9933d, i9, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                            }
                            wVar2 = new w.n(aVar.f9933d, i9);
                            i4 = i8;
                            i5 = i10;
                            i7 = length2;
                        } else {
                            i4 = i8;
                            if (annotation2 instanceof m.i0.s) {
                                aVar.c(i9, type);
                                if (aVar.f9941l) {
                                    throw g0.l(aVar.f9933d, i9, "A @Path parameter must not come after a @Query.", new Object[0]);
                                }
                                if (aVar.f9942m) {
                                    throw g0.l(aVar.f9933d, i9, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (aVar.f9943n) {
                                    throw g0.l(aVar.f9933d, i9, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (aVar.o) {
                                    throw g0.l(aVar.f9933d, i9, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (aVar.t == null) {
                                    throw g0.l(aVar.f9933d, i9, "@Path can only be used with relative url on @%s", aVar.p);
                                }
                                aVar.f9940k = true;
                                m.i0.s sVar = (m.i0.s) annotation2;
                                String value2 = sVar.value();
                                if (!z.a.f9931b.matcher(value2).matches()) {
                                    throw g0.l(aVar.f9933d, i9, "@Path parameter name must match %s. Found: %s", z.a.a.pattern(), value2);
                                }
                                if (!aVar.w.contains(value2)) {
                                    throw g0.l(aVar.f9933d, i9, "URL \"%s\" does not contain \"{%s}\".", aVar.t, value2);
                                }
                                aVar.f9932c.e(type, annotationArr2);
                                i5 = i10;
                                i6 = length2;
                                gVar = new w.i<>(aVar.f9933d, i9, value2, a.d.a, sVar.encoded());
                            } else {
                                i5 = i10;
                                i6 = length2;
                                if (annotation2 instanceof m.i0.t) {
                                    aVar.c(i9, type);
                                    m.i0.t tVar = (m.i0.t) annotation2;
                                    String value3 = tVar.value();
                                    boolean encoded = tVar.encoded();
                                    Class<?> f2 = g0.f(type);
                                    aVar.f9941l = true;
                                    if (Iterable.class.isAssignableFrom(f2)) {
                                        if (!(type instanceof ParameterizedType)) {
                                            throw g0.l(aVar.f9933d, i9, e.a.d.a.a.d(f2, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                        }
                                        aVar.f9932c.e(g0.e(0, (ParameterizedType) type), annotationArr2);
                                        gVar = new u<>(new w.j(value3, a.d.a, encoded));
                                    } else if (f2.isArray()) {
                                        aVar.f9932c.e(z.a.a(f2.getComponentType()), annotationArr2);
                                        gVar = new v(new w.j(value3, a.d.a, encoded));
                                    } else {
                                        aVar.f9932c.e(type, annotationArr2);
                                        bVar = new w.j<>(value3, a.d.a, encoded);
                                        i7 = i6;
                                        wVar2 = bVar;
                                    }
                                } else if (annotation2 instanceof m.i0.v) {
                                    aVar.c(i9, type);
                                    boolean encoded2 = ((m.i0.v) annotation2).encoded();
                                    Class<?> f3 = g0.f(type);
                                    aVar.f9942m = true;
                                    if (Iterable.class.isAssignableFrom(f3)) {
                                        if (!(type instanceof ParameterizedType)) {
                                            throw g0.l(aVar.f9933d, i9, e.a.d.a.a.d(f3, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                        }
                                        aVar.f9932c.e(g0.e(0, (ParameterizedType) type), annotationArr2);
                                        gVar = new u<>(new w.l(a.d.a, encoded2));
                                    } else if (f3.isArray()) {
                                        aVar.f9932c.e(z.a.a(f3.getComponentType()), annotationArr2);
                                        gVar = new v(new w.l(a.d.a, encoded2));
                                    } else {
                                        aVar.f9932c.e(type, annotationArr2);
                                        cVar = new w.l<>(a.d.a, encoded2);
                                        i7 = i6;
                                        wVar2 = cVar;
                                    }
                                } else {
                                    if (annotation2 instanceof m.i0.u) {
                                        aVar.c(i9, type);
                                        Class<?> f4 = g0.f(type);
                                        aVar.f9943n = true;
                                        if (!Map.class.isAssignableFrom(f4)) {
                                            throw g0.l(aVar.f9933d, i9, "@QueryMap parameter type must be Map.", new Object[0]);
                                        }
                                        Type g2 = g0.g(type, f4, Map.class);
                                        if (!(g2 instanceof ParameterizedType)) {
                                            throw g0.l(aVar.f9933d, i9, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                        }
                                        ParameterizedType parameterizedType = (ParameterizedType) g2;
                                        Type e3 = g0.e(0, parameterizedType);
                                        if (String.class != e3) {
                                            throw g0.l(aVar.f9933d, i9, e.a.d.a.a.n("@QueryMap keys must be of type String: ", e3), new Object[0]);
                                        }
                                        aVar.f9932c.e(g0.e(1, parameterizedType), annotationArr2);
                                        cVar = new w.k<>(aVar.f9933d, i9, a.d.a, ((m.i0.u) annotation2).encoded());
                                    } else if (annotation2 instanceof m.i0.i) {
                                        aVar.c(i9, type);
                                        String value4 = ((m.i0.i) annotation2).value();
                                        Class<?> f5 = g0.f(type);
                                        if (Iterable.class.isAssignableFrom(f5)) {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw g0.l(aVar.f9933d, i9, e.a.d.a.a.d(f5, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                            }
                                            aVar.f9932c.e(g0.e(0, (ParameterizedType) type), annotationArr2);
                                            gVar = new u<>(new w.d(value4, a.d.a));
                                        } else if (f5.isArray()) {
                                            aVar.f9932c.e(z.a.a(f5.getComponentType()), annotationArr2);
                                            gVar = new v(new w.d(value4, a.d.a));
                                        } else {
                                            aVar.f9932c.e(type, annotationArr2);
                                            cVar = new w.d<>(value4, a.d.a);
                                        }
                                    } else if (annotation2 instanceof m.i0.j) {
                                        if (type == j.r.class) {
                                            gVar = new w.f(aVar.f9933d, i9);
                                        } else {
                                            aVar.c(i9, type);
                                            Class<?> f6 = g0.f(type);
                                            if (!Map.class.isAssignableFrom(f6)) {
                                                throw g0.l(aVar.f9933d, i9, "@HeaderMap parameter type must be Map.", new Object[0]);
                                            }
                                            Type g3 = g0.g(type, f6, Map.class);
                                            if (!(g3 instanceof ParameterizedType)) {
                                                throw g0.l(aVar.f9933d, i9, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                            }
                                            ParameterizedType parameterizedType2 = (ParameterizedType) g3;
                                            Type e4 = g0.e(0, parameterizedType2);
                                            if (String.class != e4) {
                                                throw g0.l(aVar.f9933d, i9, e.a.d.a.a.n("@HeaderMap keys must be of type String: ", e4), new Object[0]);
                                            }
                                            aVar.f9932c.e(g0.e(1, parameterizedType2), annotationArr2);
                                            vVar = new w.e<>(aVar.f9933d, i9, a.d.a);
                                            i7 = i6;
                                            wVar2 = vVar;
                                        }
                                    } else if (annotation2 instanceof m.i0.c) {
                                        aVar.c(i9, type);
                                        if (!aVar.r) {
                                            throw g0.l(aVar.f9933d, i9, "@Field parameters can only be used with form encoding.", new Object[0]);
                                        }
                                        m.i0.c cVar2 = (m.i0.c) annotation2;
                                        String value5 = cVar2.value();
                                        boolean encoded3 = cVar2.encoded();
                                        aVar.f9937h = true;
                                        Class<?> f7 = g0.f(type);
                                        if (Iterable.class.isAssignableFrom(f7)) {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw g0.l(aVar.f9933d, i9, e.a.d.a.a.d(f7, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                            }
                                            aVar.f9932c.e(g0.e(0, (ParameterizedType) type), annotationArr2);
                                            gVar = new u<>(new w.b(value5, a.d.a, encoded3));
                                        } else if (f7.isArray()) {
                                            aVar.f9932c.e(z.a.a(f7.getComponentType()), annotationArr2);
                                            gVar = new v(new w.b(value5, a.d.a, encoded3));
                                        } else {
                                            aVar.f9932c.e(type, annotationArr2);
                                            bVar = new w.b<>(value5, a.d.a, encoded3);
                                            i7 = i6;
                                            wVar2 = bVar;
                                        }
                                    } else if (annotation2 instanceof m.i0.d) {
                                        aVar.c(i9, type);
                                        if (!aVar.r) {
                                            throw g0.l(aVar.f9933d, i9, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                        }
                                        Class<?> f8 = g0.f(type);
                                        if (!Map.class.isAssignableFrom(f8)) {
                                            throw g0.l(aVar.f9933d, i9, "@FieldMap parameter type must be Map.", new Object[0]);
                                        }
                                        Type g4 = g0.g(type, f8, Map.class);
                                        if (!(g4 instanceof ParameterizedType)) {
                                            throw g0.l(aVar.f9933d, i9, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                        }
                                        ParameterizedType parameterizedType3 = (ParameterizedType) g4;
                                        Type e5 = g0.e(0, parameterizedType3);
                                        if (String.class != e5) {
                                            throw g0.l(aVar.f9933d, i9, e.a.d.a.a.n("@FieldMap keys must be of type String: ", e5), new Object[0]);
                                        }
                                        aVar.f9932c.e(g0.e(1, parameterizedType3), annotationArr2);
                                        a.d dVar = a.d.a;
                                        aVar.f9937h = true;
                                        cVar = new w.c<>(aVar.f9933d, i9, dVar, ((m.i0.d) annotation2).encoded());
                                    } else if (annotation2 instanceof m.i0.q) {
                                        aVar.c(i9, type);
                                        if (!aVar.s) {
                                            throw g0.l(aVar.f9933d, i9, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                        }
                                        m.i0.q qVar = (m.i0.q) annotation2;
                                        aVar.f9938i = true;
                                        String value6 = qVar.value();
                                        Class<?> f9 = g0.f(type);
                                        if (value6.isEmpty()) {
                                            if (Iterable.class.isAssignableFrom(f9)) {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw g0.l(aVar.f9933d, i9, e.a.d.a.a.d(f9, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                                }
                                                if (!v.b.class.isAssignableFrom(g0.f(g0.e(0, (ParameterizedType) type)))) {
                                                    throw g0.l(aVar.f9933d, i9, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                }
                                                vVar = new u<>(w.m.a);
                                            } else if (f9.isArray()) {
                                                if (!v.b.class.isAssignableFrom(f9.getComponentType())) {
                                                    throw g0.l(aVar.f9933d, i9, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                }
                                                vVar = new v(w.m.a);
                                            } else if (!v.b.class.isAssignableFrom(f9)) {
                                                throw g0.l(aVar.f9933d, i9, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                            } else {
                                                gVar = w.m.a;
                                            }
                                            i7 = i6;
                                            wVar2 = vVar;
                                        } else {
                                            i7 = i6;
                                            j.r f10 = j.r.f("Content-Disposition", e.a.d.a.a.l("form-data; name=\"", value6, "\""), "Content-Transfer-Encoding", qVar.encoding());
                                            if (Iterable.class.isAssignableFrom(f9)) {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw g0.l(aVar.f9933d, i9, e.a.d.a.a.d(f9, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                                }
                                                Type e6 = g0.e(0, (ParameterizedType) type);
                                                if (v.b.class.isAssignableFrom(g0.f(e6))) {
                                                    throw g0.l(aVar.f9933d, i9, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                }
                                                wVar2 = new u<>(new w.g(aVar.f9933d, i9, f10, aVar.f9932c.c(e6, annotationArr2, aVar.f9934e)));
                                            } else if (f9.isArray()) {
                                                Class<?> a = z.a.a(f9.getComponentType());
                                                if (v.b.class.isAssignableFrom(a)) {
                                                    throw g0.l(aVar.f9933d, i9, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                }
                                                wVar2 = new v(new w.g(aVar.f9933d, i9, f10, aVar.f9932c.c(a, annotationArr2, aVar.f9934e)));
                                            } else if (v.b.class.isAssignableFrom(f9)) {
                                                throw g0.l(aVar.f9933d, i9, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                            } else {
                                                gVar = new w.g<>(aVar.f9933d, i9, f10, aVar.f9932c.c(type, annotationArr2, aVar.f9934e));
                                                wVar2 = gVar;
                                            }
                                        }
                                    } else {
                                        i7 = i6;
                                        if (annotation2 instanceof m.i0.r) {
                                            aVar.c(i9, type);
                                            if (!aVar.s) {
                                                throw g0.l(aVar.f9933d, i9, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                            }
                                            aVar.f9938i = true;
                                            Class<?> f11 = g0.f(type);
                                            if (!Map.class.isAssignableFrom(f11)) {
                                                throw g0.l(aVar.f9933d, i9, "@PartMap parameter type must be Map.", new Object[0]);
                                            }
                                            Type g5 = g0.g(type, f11, Map.class);
                                            if (!(g5 instanceof ParameterizedType)) {
                                                throw g0.l(aVar.f9933d, i9, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                            }
                                            ParameterizedType parameterizedType4 = (ParameterizedType) g5;
                                            Type e7 = g0.e(0, parameterizedType4);
                                            if (String.class != e7) {
                                                throw g0.l(aVar.f9933d, i9, e.a.d.a.a.n("@PartMap keys must be of type String: ", e7), new Object[0]);
                                            }
                                            Type e8 = g0.e(1, parameterizedType4);
                                            if (v.b.class.isAssignableFrom(g0.f(e8))) {
                                                throw g0.l(aVar.f9933d, i9, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                            }
                                            wVar2 = new w.h<>(aVar.f9933d, i9, aVar.f9932c.c(e8, annotationArr2, aVar.f9934e), ((m.i0.r) annotation2).encoding());
                                        } else if (annotation2 instanceof m.i0.a) {
                                            aVar.c(i9, type);
                                            if (aVar.r || aVar.s) {
                                                throw g0.l(aVar.f9933d, i9, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                            }
                                            if (aVar.f9939j) {
                                                throw g0.l(aVar.f9933d, i9, "Multiple @Body method annotations found.", new Object[0]);
                                            }
                                            try {
                                                j<T, j.c0> c2 = aVar.f9932c.c(type, annotationArr2, aVar.f9934e);
                                                aVar.f9939j = true;
                                                wVar2 = new w.a<>(aVar.f9933d, i9, c2);
                                            } catch (RuntimeException e9) {
                                                throw g0.m(aVar.f9933d, e9, i9, "Unable to create @Body converter for %s", type);
                                            }
                                        } else if (annotation2 instanceof m.i0.x) {
                                            aVar.c(i9, type);
                                            Class<?> f12 = g0.f(type);
                                            for (int i12 = i9 - 1; i12 >= 0; i12--) {
                                                w<?> wVar3 = aVar.x[i12];
                                                if ((wVar3 instanceof w.o) && ((w.o) wVar3).a.equals(f12)) {
                                                    Method method2 = aVar.f9933d;
                                                    StringBuilder y = e.a.d.a.a.y("@Tag type ");
                                                    y.append(f12.getName());
                                                    y.append(" is duplicate of parameter #");
                                                    y.append(i12 + 1);
                                                    y.append(" and would always overwrite its value.");
                                                    throw g0.l(method2, i9, y.toString(), new Object[0]);
                                                }
                                            }
                                            wVar2 = new w.o<>(f12);
                                        } else {
                                            wVar2 = null;
                                        }
                                    }
                                    i7 = i6;
                                    wVar2 = cVar;
                                }
                            }
                            i7 = i6;
                            wVar2 = gVar;
                        }
                        if (wVar2 != null) {
                            if (wVar != null) {
                                throw g0.l(aVar.f9933d, i9, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                            }
                            wVar = wVar2;
                        }
                        i10 = i5 + 1;
                        length = i11;
                        i8 = i4;
                        length2 = i7;
                    }
                    i2 = length;
                    i3 = i8;
                } else {
                    i2 = length;
                    i3 = i8;
                    wVar = null;
                }
                if (wVar == null) {
                    if (z2) {
                        try {
                            if (g0.f(type) == h.m.d.class) {
                                aVar.y = true;
                                wVar = null;
                            }
                        } catch (NoClassDefFoundError unused) {
                        }
                    }
                    throw g0.l(aVar.f9933d, i9, "No Retrofit annotation found.", new Object[0]);
                }
                wVarArr[i9] = wVar;
                i9++;
                length = i2;
                i8 = i3;
            }
            if (aVar.t != null || aVar.o) {
                boolean z3 = aVar.r;
                if (z3 || aVar.s || aVar.q || !aVar.f9939j) {
                    if (!z3 || aVar.f9937h) {
                        if (!aVar.s || aVar.f9938i) {
                            z zVar = new z(aVar);
                            Type genericReturnType2 = method.getGenericReturnType();
                            if (g0.h(genericReturnType2)) {
                                throw g0.j(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                            }
                            if (genericReturnType2 != Void.TYPE) {
                                boolean z4 = zVar.f9930k;
                                Annotation[] annotations = method.getAnnotations();
                                if (z4) {
                                    Type type2 = ((ParameterizedType) method.getGenericParameterTypes()[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                                    if (type2 instanceof WildcardType) {
                                        type2 = ((WildcardType) type2).getLowerBounds()[0];
                                    }
                                    if (g0.f(type2) == a0.class && (type2 instanceof ParameterizedType)) {
                                        type2 = g0.e(0, (ParameterizedType) type2);
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    genericReturnType = new g0.b(null, b.class, type2);
                                    if (!g0.i(annotations, e0.class)) {
                                        Annotation[] annotationArr3 = new Annotation[annotations.length + 1];
                                        annotationArr3[0] = f0.a;
                                        System.arraycopy(annotations, 0, annotationArr3, 1, annotations.length);
                                        annotations = annotationArr3;
                                    }
                                } else {
                                    genericReturnType = method.getGenericReturnType();
                                    z = false;
                                }
                                try {
                                    c<?, ?> a2 = c0Var.a(genericReturnType, annotations);
                                    Type a3 = a2.a();
                                    if (a3 == j.d0.class) {
                                        StringBuilder y2 = e.a.d.a.a.y("'");
                                        y2.append(g0.f(a3).getName());
                                        y2.append("' is not a valid response body type. Did you mean ResponseBody?");
                                        throw g0.j(method, y2.toString(), new Object[0]);
                                    } else if (a3 != a0.class) {
                                        if (!zVar.f9922c.equals("HEAD") || Void.class.equals(a3)) {
                                            try {
                                                j<j.f0, T> d2 = c0Var.d(a3, method.getAnnotations());
                                                d.a aVar3 = c0Var.f9846b;
                                                return !z4 ? new m.a(zVar, aVar3, d2, a2) : z ? new m.c(zVar, aVar3, d2, a2) : new m.b(zVar, aVar3, d2, a2, false);
                                            } catch (RuntimeException e10) {
                                                throw g0.k(method, e10, "Unable to create converter for %s", a3);
                                            }
                                        }
                                        throw g0.j(method, "HEAD method must use Void as response type.", new Object[0]);
                                    } else {
                                        throw g0.j(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                                    }
                                } catch (RuntimeException e11) {
                                    throw g0.k(method, e11, "Unable to create call adapter for %s", genericReturnType);
                                }
                            }
                            throw g0.j(method, "Service methods cannot return void.", new Object[0]);
                        }
                        throw g0.j(aVar.f9933d, "Multipart method must contain at least one @Part.", new Object[0]);
                    }
                    throw g0.j(aVar.f9933d, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                throw g0.j(aVar.f9933d, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            throw g0.j(aVar.f9933d, "Missing either @%s URL or @Url parameter.", aVar.p);
        }
        throw g0.j(aVar.f9933d, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
    }

    @Nullable
    public abstract T a(Object[] objArr);
}
