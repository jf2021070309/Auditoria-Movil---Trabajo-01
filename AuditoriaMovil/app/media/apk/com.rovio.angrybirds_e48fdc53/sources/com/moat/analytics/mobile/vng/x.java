package com.moat.analytics.mobile.vng;

import com.moat.analytics.mobile.vng.w;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class x<T> implements InvocationHandler {
    private static final Object[] a = new Object[0];
    private final a<T> b;
    private final Class<T> c;
    private final LinkedList<x<T>.b> d;
    private boolean e;
    private T f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface a<T> {
        com.moat.analytics.mobile.vng.a.b.a<T> a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class b {
        final /* synthetic */ x a;
        private final WeakReference[] b;
        private final LinkedList<Object> c;
        private final Method d;

        private b(x xVar, Method method, Object... objArr) {
            int i = 0;
            this.a = xVar;
            this.c = new LinkedList<>();
            objArr = objArr == null ? x.a : objArr;
            WeakReference[] weakReferenceArr = new WeakReference[objArr.length];
            int length = objArr.length;
            int i2 = 0;
            while (i < length) {
                Object obj = objArr[i];
                if ((obj instanceof Map) || (obj instanceof Integer) || (obj instanceof Double)) {
                    this.c.add(obj);
                }
                weakReferenceArr[i2] = new WeakReference(obj);
                i++;
                i2++;
            }
            this.b = weakReferenceArr;
            this.d = method;
        }
    }

    x(a<T> aVar, Class<T> cls) {
        com.moat.analytics.mobile.vng.a.a.a.a(aVar);
        com.moat.analytics.mobile.vng.a.a.a.a(cls);
        this.b = aVar;
        this.c = cls;
        this.d = new LinkedList<>();
        w.a().a(new w.b() { // from class: com.moat.analytics.mobile.vng.x.1
            @Override // com.moat.analytics.mobile.vng.w.b
            public void b() {
                x.this.c();
            }

            @Override // com.moat.analytics.mobile.vng.w.b
            public void c() {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T a(a<T> aVar, Class<T> cls) {
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new x(aVar, cls));
    }

    private Object a(Method method) {
        try {
            if (Boolean.TYPE.equals(method.getReturnType())) {
                return true;
            }
        } catch (Exception e) {
            m.a(e);
        }
        return null;
    }

    private Object a(Method method, Object[] objArr) {
        Class<?> declaringClass = method.getDeclaringClass();
        w a2 = w.a();
        if (Object.class.equals(declaringClass)) {
            String name = method.getName();
            if ("getClass".equals(name)) {
                return this.c;
            }
            if ("toString".equals(name)) {
                Object invoke = method.invoke(this, objArr);
                return (invoke + "").replace(x.class.getName(), this.c.getName());
            }
            return method.invoke(this, objArr);
        } else if (this.e && this.f == null) {
            this.d.clear();
            return a(method);
        } else {
            if (a2.a == w.d.ON) {
                c();
                if (this.f != null) {
                    return method.invoke(this.f, objArr);
                }
            }
            if (a2.a == w.d.OFF && (!this.e || this.f != null)) {
                b(method, objArr);
            }
            return a(method);
        }
    }

    private void b() {
        if (this.e) {
            return;
        }
        try {
            this.f = this.b.a().c(null);
        } catch (Exception e) {
            p.a("OnOffTrackerProxy", this, "Could not create instance", e);
            m.a(e);
        }
        this.e = true;
    }

    private void b(Method method, Object[] objArr) {
        if (this.d.size() >= 15) {
            this.d.remove(5);
        }
        this.d.add(new b(method, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        b();
        if (this.f == null) {
            return;
        }
        Iterator<x<T>.b> it = this.d.iterator();
        while (it.hasNext()) {
            x<T>.b next = it.next();
            try {
                Object[] objArr = new Object[((b) next).b.length];
                WeakReference[] weakReferenceArr = ((b) next).b;
                int length = weakReferenceArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    objArr[i2] = weakReferenceArr[i].get();
                    i++;
                    i2++;
                }
                ((b) next).d.invoke(this.f, objArr);
            } catch (Exception e) {
                m.a(e);
            }
        }
        this.d.clear();
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            return a(method, objArr);
        } catch (Exception e) {
            m.a(e);
            return a(method);
        }
    }
}
