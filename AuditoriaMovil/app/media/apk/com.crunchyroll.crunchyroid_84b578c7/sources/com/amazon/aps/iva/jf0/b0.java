package com.amazon.aps.iva.jf0;

import com.amazon.aps.iva.jf0.c;
import com.amazon.aps.iva.jf0.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
/* compiled from: Retrofit.java */
/* loaded from: classes4.dex */
public final class b0 {
    public final Call.Factory b;
    public final HttpUrl c;
    public final List<f.a> d;
    public final List<c.a> e;
    public final Executor f;
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final boolean g = false;

    /* compiled from: Retrofit.java */
    /* loaded from: classes4.dex */
    public class a implements InvocationHandler {
        public final x b = x.c;
        public final Object[] c = new Object[0];
        public final /* synthetic */ Class d;

        public a(Class cls) {
            this.d = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            boolean z;
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.c;
            }
            x xVar = this.b;
            if (xVar.a && method.isDefault()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return xVar.b(method, this.d, obj, objArr);
            }
            return b0.this.c(method).a(objArr);
        }
    }

    /* compiled from: Retrofit.java */
    /* loaded from: classes4.dex */
    public static final class b {
        public final x a;
        public Call.Factory b;
        public HttpUrl c;
        public final ArrayList d;
        public final ArrayList e;

        public b() {
            x xVar = x.c;
            this.d = new ArrayList();
            this.e = new ArrayList();
            this.a = xVar;
        }

        public final void a(com.amazon.aps.iva.kf0.a aVar) {
            this.d.add(aVar);
        }

        public final void b(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            HttpUrl httpUrl = HttpUrl.get(str);
            Objects.requireNonNull(httpUrl, "baseUrl == null");
            List<String> pathSegments = httpUrl.pathSegments();
            if ("".equals(pathSegments.get(pathSegments.size() - 1))) {
                this.c = httpUrl;
                return;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + httpUrl);
        }

        public final b0 c() {
            List singletonList;
            List emptyList;
            if (this.c != null) {
                Call.Factory factory = this.b;
                if (factory == null) {
                    factory = new OkHttpClient();
                }
                Call.Factory factory2 = factory;
                x xVar = this.a;
                Executor a = xVar.a();
                ArrayList arrayList = new ArrayList(this.e);
                h hVar = new h(a);
                boolean z = xVar.a;
                if (z) {
                    singletonList = Arrays.asList(e.a, hVar);
                } else {
                    singletonList = Collections.singletonList(hVar);
                }
                arrayList.addAll(singletonList);
                ArrayList arrayList2 = this.d;
                ArrayList arrayList3 = new ArrayList(arrayList2.size() + 1 + (z ? 1 : 0));
                arrayList3.add(new com.amazon.aps.iva.jf0.a());
                arrayList3.addAll(arrayList2);
                if (z) {
                    emptyList = Collections.singletonList(t.a);
                } else {
                    emptyList = Collections.emptyList();
                }
                arrayList3.addAll(emptyList);
                return new b0(factory2, this.c, Collections.unmodifiableList(arrayList3), Collections.unmodifiableList(arrayList), a);
            }
            throw new IllegalStateException("Base URL required.");
        }

        public final void d(OkHttpClient okHttpClient) {
            Objects.requireNonNull(okHttpClient, "client == null");
            this.b = okHttpClient;
        }
    }

    public b0(Call.Factory factory, HttpUrl httpUrl, List list, List list2, Executor executor) {
        this.b = factory;
        this.c = httpUrl;
        this.d = list;
        this.e = list2;
        this.f = executor;
    }

    public final c<?, ?> a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List<c.a> list = this.e;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = indexOf; i < size; i++) {
            c<?, ?> a2 = list.get(i).a(type, annotationArr);
            if (a2 != null) {
                return a2;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(list.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> T b(Class<T> cls) {
        Method[] declaredMethods;
        boolean z;
        if (cls.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class<T> cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                    sb.append(cls2.getName());
                    if (cls2 != cls) {
                        sb.append(" which is an interface of ");
                        sb.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            if (this.g) {
                x xVar = x.c;
                for (Method method : cls.getDeclaredMethods()) {
                    if (xVar.a && method.isDefault()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z && !Modifier.isStatic(method.getModifiers())) {
                        c(method);
                    }
                }
            }
            return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    public final c0<?> c(Method method) {
        c0<?> c0Var;
        c0<?> c0Var2 = (c0) this.a.get(method);
        if (c0Var2 != null) {
            return c0Var2;
        }
        synchronized (this.a) {
            c0Var = (c0) this.a.get(method);
            if (c0Var == null) {
                c0Var = c0.b(this, method);
                this.a.put(method, c0Var);
            }
        }
        return c0Var;
    }

    public final <T> f<T, RequestBody> d(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List<f.a> list = this.d;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = indexOf; i < size; i++) {
            f<T, RequestBody> a2 = list.get(i).a(type);
            if (a2 != null) {
                return a2;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(list.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> f<ResponseBody, T> e(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List<f.a> list = this.d;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = indexOf; i < size; i++) {
            f<ResponseBody, T> fVar = (f<ResponseBody, T>) list.get(i).b(type, annotationArr, this);
            if (fVar != null) {
                return fVar;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(list.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final void f(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List<f.a> list = this.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).getClass();
        }
    }
}
