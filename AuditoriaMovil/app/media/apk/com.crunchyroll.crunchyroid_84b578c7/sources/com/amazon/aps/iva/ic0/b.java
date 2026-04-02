package com.amazon.aps.iva.ic0;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: caches.kt */
/* loaded from: classes4.dex */
public final class b {
    public static final com.amazon.aps.iva.ic0.c a = com.amazon.aps.iva.ic0.a.a(d.h);
    public static final com.amazon.aps.iva.ic0.c b = com.amazon.aps.iva.ic0.a.a(e.h);

    /* compiled from: caches.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Class<?>, com.amazon.aps.iva.fc0.p> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.fc0.p invoke(Class<?> cls) {
            Class<?> cls2 = cls;
            com.amazon.aps.iva.yb0.j.f(cls2, "it");
            n a = b.a(cls2);
            com.amazon.aps.iva.lb0.z zVar = com.amazon.aps.iva.lb0.z.b;
            return com.amazon.aps.iva.gc0.e.a(a, zVar, false, zVar);
        }
    }

    /* compiled from: caches.kt */
    /* renamed from: com.amazon.aps.iva.ic0.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0357b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Class<?>, ConcurrentHashMap<com.amazon.aps.iva.kb0.j<? extends List<? extends com.amazon.aps.iva.fc0.r>, ? extends Boolean>, com.amazon.aps.iva.fc0.p>> {
        public static final C0357b h = new C0357b();

        public C0357b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final ConcurrentHashMap<com.amazon.aps.iva.kb0.j<? extends List<? extends com.amazon.aps.iva.fc0.r>, ? extends Boolean>, com.amazon.aps.iva.fc0.p> invoke(Class<?> cls) {
            com.amazon.aps.iva.yb0.j.f(cls, "it");
            return new ConcurrentHashMap<>();
        }
    }

    /* compiled from: caches.kt */
    /* loaded from: classes4.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Class<?>, com.amazon.aps.iva.fc0.p> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.fc0.p invoke(Class<?> cls) {
            Class<?> cls2 = cls;
            com.amazon.aps.iva.yb0.j.f(cls2, "it");
            n a = b.a(cls2);
            com.amazon.aps.iva.lb0.z zVar = com.amazon.aps.iva.lb0.z.b;
            return com.amazon.aps.iva.gc0.e.a(a, zVar, true, zVar);
        }
    }

    /* compiled from: caches.kt */
    /* loaded from: classes4.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Class<?>, n<? extends Object>> {
        public static final d h = new d();

        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final n<? extends Object> invoke(Class<?> cls) {
            Class<?> cls2 = cls;
            com.amazon.aps.iva.yb0.j.f(cls2, "it");
            return new n<>(cls2);
        }
    }

    /* compiled from: caches.kt */
    /* loaded from: classes4.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Class<?>, b0> {
        public static final e h = new e();

        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final b0 invoke(Class<?> cls) {
            Class<?> cls2 = cls;
            com.amazon.aps.iva.yb0.j.f(cls2, "it");
            return new b0(cls2);
        }
    }

    static {
        com.amazon.aps.iva.ic0.a.a(a.h);
        com.amazon.aps.iva.ic0.a.a(c.h);
        com.amazon.aps.iva.ic0.a.a(C0357b.h);
    }

    public static final <T> n<T> a(Class<T> cls) {
        Object putIfAbsent;
        com.amazon.aps.iva.yb0.j.f(cls, "jClass");
        com.amazon.aps.iva.ic0.c cVar = a;
        cVar.getClass();
        ConcurrentHashMap<Class<?>, V> concurrentHashMap = cVar.b;
        Object obj = concurrentHashMap.get(cls);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(cls, (obj = cVar.a.invoke(cls)))) != null) {
            obj = putIfAbsent;
        }
        com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (n) obj;
    }
}
