package com.umeng.analytics.pro;

import com.umeng.analytics.pro.bw;
import com.umeng.analytics.pro.bz;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: TUnion.java */
/* loaded from: classes3.dex */
public abstract class bz<T extends bz<?, ?>, F extends bw> implements bp<T, F> {
    private static final Map<Class<? extends cw>, cx> c;
    protected Object a;
    protected F b;

    protected abstract F a(short s);

    protected abstract Object a(co coVar, cj cjVar) throws bv;

    protected abstract Object a(co coVar, short s) throws bv;

    protected abstract void a(co coVar) throws bv;

    protected abstract void b(F f, Object obj) throws ClassCastException;

    protected abstract void b(co coVar) throws bv;

    protected abstract cj c(F f);

    protected abstract ct d();

    protected bz() {
        this.b = null;
        this.a = null;
    }

    static {
        HashMap hashMap = new HashMap();
        c = hashMap;
        hashMap.put(cy.class, new b());
        hashMap.put(cz.class, new d());
    }

    protected bz(F f, Object obj) {
        a((bz<T, F>) f, obj);
    }

    protected bz(bz<T, F> bzVar) {
        if (!bzVar.getClass().equals(getClass())) {
            throw new ClassCastException();
        }
        this.b = bzVar.b;
        this.a = a(bzVar.a);
    }

    private static Object a(Object obj) {
        if (obj instanceof bp) {
            return ((bp) obj).deepCopy();
        }
        if (obj instanceof ByteBuffer) {
            return bq.d((ByteBuffer) obj);
        }
        if (obj instanceof List) {
            return a((List) obj);
        }
        if (obj instanceof Set) {
            return a((Set) obj);
        }
        if (obj instanceof Map) {
            return a((Map<Object, Object>) obj);
        }
        return obj;
    }

    private static Map a(Map<Object, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            hashMap.put(a(entry.getKey()), a(entry.getValue()));
        }
        return hashMap;
    }

    private static Set a(Set set) {
        HashSet hashSet = new HashSet();
        for (Object obj : set) {
            hashSet.add(a(obj));
        }
        return hashSet;
    }

    private static List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            arrayList.add(a(obj));
        }
        return arrayList;
    }

    public F a() {
        return this.b;
    }

    public Object b() {
        return this.a;
    }

    public Object a(F f) {
        if (f != this.b) {
            throw new IllegalArgumentException("Cannot get the value of field " + f + " because union's set field is " + this.b);
        }
        return b();
    }

    public Object a(int i) {
        return a((bz<T, F>) a((short) i));
    }

    public boolean c() {
        return this.b != null;
    }

    public boolean b(F f) {
        return this.b == f;
    }

    public boolean b(int i) {
        return b((bz<T, F>) a((short) i));
    }

    @Override // com.umeng.analytics.pro.bp
    public void read(co coVar) throws bv {
        c.get(coVar.D()).b().b(coVar, this);
    }

    public void a(F f, Object obj) {
        b(f, obj);
        this.b = f;
        this.a = obj;
    }

    public void a(int i, Object obj) {
        a((bz<T, F>) a((short) i), obj);
    }

    @Override // com.umeng.analytics.pro.bp
    public void write(co coVar) throws bv {
        c.get(coVar.D()).b().a(coVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(getClass().getSimpleName());
        sb.append(" ");
        if (a() != null) {
            Object b2 = b();
            sb.append(c(a()).a);
            sb.append(":");
            if (b2 instanceof ByteBuffer) {
                bq.a((ByteBuffer) b2, sb);
            } else {
                sb.append(b2.toString());
            }
        }
        sb.append(">");
        return sb.toString();
    }

    @Override // com.umeng.analytics.pro.bp
    public final void clear() {
        this.b = null;
        this.a = null;
    }

    /* compiled from: TUnion.java */
    /* loaded from: classes3.dex */
    private static class b implements cx {
        private b() {
        }

        @Override // com.umeng.analytics.pro.cx
        /* renamed from: a */
        public a b() {
            return new a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TUnion.java */
    /* loaded from: classes3.dex */
    public static class a extends cy<bz> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.cw
        /* renamed from: a */
        public void b(co coVar, bz bzVar) throws bv {
            bzVar.b = null;
            bzVar.a = null;
            coVar.j();
            cj l = coVar.l();
            bzVar.a = bzVar.a(coVar, l);
            if (bzVar.a != null) {
                bzVar.b = (F) bzVar.a(l.c);
            }
            coVar.m();
            coVar.l();
            coVar.k();
        }

        @Override // com.umeng.analytics.pro.cw
        /* renamed from: b */
        public void a(co coVar, bz bzVar) throws bv {
            if (bzVar.a() == null || bzVar.b() == null) {
                throw new cp("Cannot write a TUnion with no set value!");
            }
            coVar.a(bzVar.d());
            coVar.a(bzVar.c(bzVar.b));
            bzVar.a(coVar);
            coVar.c();
            coVar.d();
            coVar.b();
        }
    }

    /* compiled from: TUnion.java */
    /* loaded from: classes3.dex */
    private static class d implements cx {
        private d() {
        }

        @Override // com.umeng.analytics.pro.cx
        /* renamed from: a */
        public c b() {
            return new c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TUnion.java */
    /* loaded from: classes3.dex */
    public static class c extends cz<bz> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.cw
        /* renamed from: a */
        public void b(co coVar, bz bzVar) throws bv {
            bzVar.b = null;
            bzVar.a = null;
            short v = coVar.v();
            bzVar.a = bzVar.a(coVar, v);
            if (bzVar.a != null) {
                bzVar.b = (F) bzVar.a(v);
            }
        }

        @Override // com.umeng.analytics.pro.cw
        /* renamed from: b */
        public void a(co coVar, bz bzVar) throws bv {
            if (bzVar.a() == null || bzVar.b() == null) {
                throw new cp("Cannot write a TUnion with no set value!");
            }
            coVar.a(bzVar.b.a());
            bzVar.b(coVar);
        }
    }
}
