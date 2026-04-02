package com.amazon.aps.iva.od0;

import com.amazon.aps.iva.od0.a;
import com.amazon.aps.iva.od0.g;
import com.amazon.aps.iva.od0.i;
import com.amazon.aps.iva.od0.k;
import com.amazon.aps.iva.od0.p;
import com.amazon.aps.iva.od0.u;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: GeneratedMessageLite.java */
/* loaded from: classes4.dex */
public abstract class h extends com.amazon.aps.iva.od0.a implements Serializable {

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[z.values().length];
            a = iArr;
            try {
                iArr[z.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[z.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes4.dex */
    public static abstract class b<MessageType extends h, BuilderType extends b> extends a.AbstractC0569a<BuilderType> {
        public com.amazon.aps.iva.od0.c b = com.amazon.aps.iva.od0.c.b;

        @Override // 
        /* renamed from: c */
        public BuilderType clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        public abstract BuilderType d(MessageType messagetype);
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes4.dex */
    public static abstract class c<MessageType extends d<MessageType>, BuilderType extends c<MessageType, BuilderType>> extends b<MessageType, BuilderType> implements q {
        public g<e> c = g.d;
        public boolean d;

        public final void e(MessageType messagetype) {
            t tVar;
            if (!this.d) {
                this.c = this.c.clone();
                this.d = true;
            }
            g<e> gVar = this.c;
            g<e> gVar2 = messagetype.b;
            gVar.getClass();
            int i = 0;
            while (true) {
                int size = gVar2.a.c.size();
                tVar = gVar2.a;
                if (i >= size) {
                    break;
                }
                gVar.h(tVar.c.get(i));
                i++;
            }
            for (Map.Entry<Object, Object> entry : tVar.d()) {
                gVar.h(entry);
            }
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes4.dex */
    public static final class e implements g.b<e> {
        public final int c;
        public final y d;
        public final boolean e;
        public final i.b<?> b = null;
        public final boolean f = false;

        public e(int i, y yVar, boolean z) {
            this.c = i;
            this.d = yVar;
            this.e = z;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.c - ((e) obj).c;
        }

        @Override // com.amazon.aps.iva.od0.g.b
        public final b e(p.a aVar, p pVar) {
            return ((b) aVar).d((h) pVar);
        }

        @Override // com.amazon.aps.iva.od0.g.b
        public final z getLiteJavaType() {
            return this.d.getJavaType();
        }

        @Override // com.amazon.aps.iva.od0.g.b
        public final y getLiteType() {
            return this.d;
        }

        @Override // com.amazon.aps.iva.od0.g.b
        public final int getNumber() {
            return this.c;
        }

        @Override // com.amazon.aps.iva.od0.g.b
        public final boolean isPacked() {
            return this.f;
        }

        @Override // com.amazon.aps.iva.od0.g.b
        public final boolean isRepeated() {
            return this.e;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes4.dex */
    public static class f<ContainingType extends p, Type> {
        public final ContainingType a;
        public final Type b;
        public final p c;
        public final e d;
        public final Method e;

        /* JADX WARN: Multi-variable type inference failed */
        public f(d dVar, Object obj, h hVar, e eVar, Class cls) {
            if (dVar != null) {
                if (eVar.d == y.MESSAGE && hVar == null) {
                    throw new IllegalArgumentException("Null messageDefaultInstance");
                }
                this.a = dVar;
                this.b = obj;
                this.c = hVar;
                this.d = eVar;
                if (i.a.class.isAssignableFrom(cls)) {
                    try {
                        this.e = cls.getMethod("valueOf", Integer.TYPE);
                        return;
                    } catch (NoSuchMethodException e) {
                        String name = cls.getName();
                        throw new RuntimeException(com.amazon.aps.iva.n4.a.a(new StringBuilder(name.length() + 45 + 7), "Generated message class \"", name, "\" missing method \"valueOf\"."), e);
                    }
                }
                this.e = null;
                return;
            }
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }

        public final Object a(Object obj) {
            if (this.d.getLiteJavaType() == z.ENUM) {
                try {
                    return this.e.invoke(null, (Integer) obj);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
                } catch (InvocationTargetException e2) {
                    Throwable cause = e2.getCause();
                    if (!(cause instanceof RuntimeException)) {
                        if (cause instanceof Error) {
                            throw ((Error) cause);
                        }
                        throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
                    }
                    throw ((RuntimeException) cause);
                }
            }
            return obj;
        }

        public final Object b(Object obj) {
            if (this.d.getLiteJavaType() == z.ENUM) {
                return Integer.valueOf(((i.a) obj).getNumber());
            }
            return obj;
        }
    }

    public h() {
    }

    public static f b(d dVar, h hVar, int i, y yVar, Class cls) {
        return new f(dVar, Collections.emptyList(), hVar, new e(i, yVar, true), cls);
    }

    public static f c(d dVar, Serializable serializable, h hVar, int i, y yVar, Class cls) {
        return new f(dVar, serializable, hVar, new e(i, yVar, false), cls);
    }

    public h(int i) {
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes4.dex */
    public static abstract class d<MessageType extends d<MessageType>> extends h implements q {
        public final g<e> b;

        /* compiled from: GeneratedMessageLite.java */
        /* loaded from: classes4.dex */
        public class a {
            public final Iterator<Map.Entry<e, Object>> a;
            public Map.Entry<e, Object> b;
            public final boolean c;

            public a(d dVar) {
                Iterator<Map.Entry<e, Object>> it;
                g<e> gVar = dVar.b;
                boolean z = gVar.c;
                t tVar = gVar.a;
                if (z) {
                    it = new k.b<>(((u.d) tVar.entrySet()).iterator());
                } else {
                    it = ((u.d) tVar.entrySet()).iterator();
                }
                this.a = it;
                if (it.hasNext()) {
                    this.b = it.next();
                }
                this.c = false;
            }

            public final void a(int i, com.amazon.aps.iva.od0.e eVar) throws IOException {
                while (true) {
                    Map.Entry<e, Object> entry = this.b;
                    if (entry != null && entry.getKey().c < i) {
                        e key = this.b.getKey();
                        int i2 = 0;
                        if (this.c && key.getLiteJavaType() == z.MESSAGE && !key.e) {
                            eVar.x(1, 3);
                            eVar.x(2, 0);
                            eVar.v(key.c);
                            eVar.o(3, (p) this.b.getValue());
                            eVar.x(1, 4);
                        } else {
                            Object value = this.b.getValue();
                            g gVar = g.d;
                            y liteType = key.getLiteType();
                            int number = key.getNumber();
                            if (key.isRepeated()) {
                                List<Object> list = (List) value;
                                if (key.isPacked()) {
                                    eVar.x(number, 2);
                                    for (Object obj : list) {
                                        i2 += g.c(liteType, obj);
                                    }
                                    eVar.v(i2);
                                    for (Object obj2 : list) {
                                        g.m(eVar, liteType, obj2);
                                    }
                                } else {
                                    for (Object obj3 : list) {
                                        g.l(eVar, liteType, number, obj3);
                                    }
                                }
                            } else if (value instanceof k) {
                                g.l(eVar, liteType, number, ((k) value).a());
                            } else {
                                g.l(eVar, liteType, number, value);
                            }
                        }
                        Iterator<Map.Entry<e, Object>> it = this.a;
                        if (it.hasNext()) {
                            this.b = it.next();
                        } else {
                            this.b = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        public d() {
            this.b = new g<>();
        }

        public final boolean d() {
            int i = 0;
            while (true) {
                t tVar = this.b.a;
                if (i < tVar.c.size()) {
                    if (!g.f(tVar.c.get(i))) {
                        return false;
                    }
                    i++;
                } else {
                    for (Map.Entry<Object, Object> entry : tVar.d()) {
                        if (!g.f(entry)) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }

        public final int e() {
            t tVar;
            int i = 0;
            int i2 = 0;
            while (true) {
                tVar = this.b.a;
                if (i >= tVar.c.size()) {
                    break;
                }
                u<K, V>.b bVar = tVar.c.get(i);
                i2 += g.d((g.b) bVar.getKey(), bVar.getValue());
                i++;
            }
            for (Map.Entry<Object, Object> entry : tVar.d()) {
                i2 += g.d((g.b) entry.getKey(), entry.getValue());
            }
            return i2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [Type, java.util.ArrayList] */
        public final <Type> Type f(f<MessageType, Type> fVar) {
            k(fVar);
            g<e> gVar = this.b;
            e eVar = fVar.d;
            Type type = (Type) gVar.e(eVar);
            if (type == null) {
                return fVar.b;
            }
            if (eVar.e) {
                if (eVar.getLiteJavaType() == z.ENUM) {
                    ?? r1 = (Type) new ArrayList();
                    for (Object obj : (List) type) {
                        r1.add(fVar.a(obj));
                    }
                    return r1;
                }
                return type;
            }
            return (Type) fVar.a(type);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> boolean g(f<MessageType, Type> fVar) {
            k(fVar);
            g<e> gVar = this.b;
            gVar.getClass();
            e eVar = fVar.d;
            if (!eVar.e) {
                if (gVar.a.get(eVar) != null) {
                    return true;
                }
                return false;
            }
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }

        public final void h() {
            this.b.g();
        }

        public final d<MessageType>.a i() {
            return new a(this);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean j(com.amazon.aps.iva.od0.d r9, com.amazon.aps.iva.od0.e r10, com.amazon.aps.iva.od0.f r11, int r12) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 321
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.od0.h.d.j(com.amazon.aps.iva.od0.d, com.amazon.aps.iva.od0.e, com.amazon.aps.iva.od0.f, int):boolean");
        }

        public final void k(f<MessageType, ?> fVar) {
            if (fVar.a == getDefaultInstanceForType()) {
                return;
            }
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }

        public d(c<MessageType, ?> cVar) {
            cVar.c.g();
            cVar.d = false;
            this.b = cVar.c;
        }
    }
}
