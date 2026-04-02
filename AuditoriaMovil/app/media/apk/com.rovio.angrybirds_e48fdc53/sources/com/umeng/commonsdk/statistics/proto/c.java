package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.bp;
import com.umeng.analytics.pro.bv;
import com.umeng.analytics.pro.bw;
import com.umeng.analytics.pro.cb;
import com.umeng.analytics.pro.cc;
import com.umeng.analytics.pro.cd;
import com.umeng.analytics.pro.ce;
import com.umeng.analytics.pro.cg;
import com.umeng.analytics.pro.ci;
import com.umeng.analytics.pro.cj;
import com.umeng.analytics.pro.ck;
import com.umeng.analytics.pro.cl;
import com.umeng.analytics.pro.co;
import com.umeng.analytics.pro.cp;
import com.umeng.analytics.pro.cr;
import com.umeng.analytics.pro.ct;
import com.umeng.analytics.pro.cu;
import com.umeng.analytics.pro.cv;
import com.umeng.analytics.pro.cw;
import com.umeng.analytics.pro.cx;
import com.umeng.analytics.pro.cy;
import com.umeng.analytics.pro.cz;
import com.umeng.analytics.pro.da;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: IdTracking.java */
/* loaded from: classes3.dex */
public class c implements bp<c, e>, Serializable, Cloneable {
    public static final Map<e, cb> d;
    private static final long e = -5764118265293965743L;
    private static final ct f = new ct("IdTracking");
    private static final cj g = new cj("snapshots", cv.k, 1);
    private static final cj h = new cj("journals", cv.m, 2);
    private static final cj i = new cj("checksum", (byte) 11, 3);
    private static final Map<Class<? extends cw>, cx> j;
    public Map<String, com.umeng.commonsdk.statistics.proto.b> a;
    public List<com.umeng.commonsdk.statistics.proto.a> b;
    public String c;
    private e[] k;

    static {
        HashMap hashMap = new HashMap();
        j = hashMap;
        hashMap.put(cy.class, new b());
        hashMap.put(cz.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.SNAPSHOTS, (e) new cb("snapshots", (byte) 1, new ce(cv.k, new cc((byte) 11), new cg((byte) 12, com.umeng.commonsdk.statistics.proto.b.class))));
        enumMap.put((EnumMap) e.JOURNALS, (e) new cb("journals", (byte) 2, new cd(cv.m, new cg((byte) 12, com.umeng.commonsdk.statistics.proto.a.class))));
        enumMap.put((EnumMap) e.CHECKSUM, (e) new cb("checksum", (byte) 2, new cc((byte) 11)));
        Map<e, cb> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        d = unmodifiableMap;
        cb.a(c.class, unmodifiableMap);
    }

    /* compiled from: IdTracking.java */
    /* loaded from: classes3.dex */
    public enum e implements bw {
        SNAPSHOTS(1, "snapshots"),
        JOURNALS(2, "journals"),
        CHECKSUM(3, "checksum");
        
        private static final Map<String, e> d = new HashMap();
        private final short e;
        private final String f;

        static {
            Iterator it = EnumSet.allOf(e.class).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                d.put(eVar.b(), eVar);
            }
        }

        public static e a(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return CHECKSUM;
                    }
                    return null;
                }
                return JOURNALS;
            }
            return SNAPSHOTS;
        }

        public static e b(int i) {
            e a = a(i);
            if (a == null) {
                throw new IllegalArgumentException("Field " + i + " doesn't exist!");
            }
            return a;
        }

        public static e a(String str) {
            return d.get(str);
        }

        e(short s, String str) {
            this.e = s;
            this.f = str;
        }

        @Override // com.umeng.analytics.pro.bw
        public short a() {
            return this.e;
        }

        @Override // com.umeng.analytics.pro.bw
        public String b() {
            return this.f;
        }
    }

    public c() {
        this.k = new e[]{e.JOURNALS, e.CHECKSUM};
    }

    public c(Map<String, com.umeng.commonsdk.statistics.proto.b> map) {
        this();
        this.a = map;
    }

    public c(c cVar) {
        this.k = new e[]{e.JOURNALS, e.CHECKSUM};
        if (cVar.e()) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.b> entry : cVar.a.entrySet()) {
                hashMap.put(entry.getKey(), new com.umeng.commonsdk.statistics.proto.b(entry.getValue()));
            }
            this.a = hashMap;
        }
        if (cVar.j()) {
            ArrayList arrayList = new ArrayList();
            for (com.umeng.commonsdk.statistics.proto.a aVar : cVar.b) {
                arrayList.add(new com.umeng.commonsdk.statistics.proto.a(aVar));
            }
            this.b = arrayList;
        }
        if (cVar.m()) {
            this.c = cVar.c;
        }
    }

    @Override // com.umeng.analytics.pro.bp
    /* renamed from: a */
    public c deepCopy() {
        return new c(this);
    }

    @Override // com.umeng.analytics.pro.bp
    public void clear() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public int b() {
        Map<String, com.umeng.commonsdk.statistics.proto.b> map = this.a;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public void a(String str, com.umeng.commonsdk.statistics.proto.b bVar) {
        if (this.a == null) {
            this.a = new HashMap();
        }
        this.a.put(str, bVar);
    }

    public Map<String, com.umeng.commonsdk.statistics.proto.b> c() {
        return this.a;
    }

    public c a(Map<String, com.umeng.commonsdk.statistics.proto.b> map) {
        this.a = map;
        return this;
    }

    public void d() {
        this.a = null;
    }

    public boolean e() {
        return this.a != null;
    }

    public void a(boolean z) {
        if (!z) {
            this.a = null;
        }
    }

    public int f() {
        List<com.umeng.commonsdk.statistics.proto.a> list = this.b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public Iterator<com.umeng.commonsdk.statistics.proto.a> g() {
        List<com.umeng.commonsdk.statistics.proto.a> list = this.b;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public void a(com.umeng.commonsdk.statistics.proto.a aVar) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(aVar);
    }

    public List<com.umeng.commonsdk.statistics.proto.a> h() {
        return this.b;
    }

    public c a(List<com.umeng.commonsdk.statistics.proto.a> list) {
        this.b = list;
        return this;
    }

    public void i() {
        this.b = null;
    }

    public boolean j() {
        return this.b != null;
    }

    public void b(boolean z) {
        if (!z) {
            this.b = null;
        }
    }

    public String k() {
        return this.c;
    }

    public c a(String str) {
        this.c = str;
        return this;
    }

    public void l() {
        this.c = null;
    }

    public boolean m() {
        return this.c != null;
    }

    public void c(boolean z) {
        if (!z) {
            this.c = null;
        }
    }

    @Override // com.umeng.analytics.pro.bp
    /* renamed from: a */
    public e fieldForId(int i2) {
        return e.a(i2);
    }

    @Override // com.umeng.analytics.pro.bp
    public void read(co coVar) throws bv {
        j.get(coVar.D()).b().b(coVar, this);
    }

    @Override // com.umeng.analytics.pro.bp
    public void write(co coVar) throws bv {
        j.get(coVar.D()).b().a(coVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdTracking(");
        sb.append("snapshots:");
        Map<String, com.umeng.commonsdk.statistics.proto.b> map = this.a;
        if (map == null) {
            sb.append("null");
        } else {
            sb.append(map);
        }
        if (j()) {
            sb.append(", ");
            sb.append("journals:");
            List<com.umeng.commonsdk.statistics.proto.a> list = this.b;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("checksum:");
            String str = this.c;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public void n() throws bv {
        if (this.a == null) {
            throw new cp("Required field 'snapshots' was not present! Struct: " + toString());
        }
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new ci(new da(objectOutputStream)));
        } catch (bv e2) {
            throw new IOException(e2.getMessage());
        }
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            read(new ci(new da(objectInputStream)));
        } catch (bv e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* compiled from: IdTracking.java */
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
    /* compiled from: IdTracking.java */
    /* loaded from: classes3.dex */
    public static class a extends cy<c> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.cw
        /* renamed from: a */
        public void b(co coVar, c cVar) throws bv {
            coVar.j();
            while (true) {
                cj l = coVar.l();
                if (l.b != 0) {
                    short s = l.c;
                    int i = 0;
                    if (s != 1) {
                        if (s != 2) {
                            if (s == 3) {
                                if (l.b == 11) {
                                    cVar.c = coVar.z();
                                    cVar.c(true);
                                } else {
                                    cr.a(coVar, l.b);
                                }
                            } else {
                                cr.a(coVar, l.b);
                            }
                        } else if (l.b == 15) {
                            ck p = coVar.p();
                            cVar.b = new ArrayList(p.b);
                            while (i < p.b) {
                                com.umeng.commonsdk.statistics.proto.a aVar = new com.umeng.commonsdk.statistics.proto.a();
                                aVar.read(coVar);
                                cVar.b.add(aVar);
                                i++;
                            }
                            coVar.q();
                            cVar.b(true);
                        } else {
                            cr.a(coVar, l.b);
                        }
                    } else if (l.b == 13) {
                        cl n = coVar.n();
                        cVar.a = new HashMap(n.c * 2);
                        while (i < n.c) {
                            String z = coVar.z();
                            com.umeng.commonsdk.statistics.proto.b bVar = new com.umeng.commonsdk.statistics.proto.b();
                            bVar.read(coVar);
                            cVar.a.put(z, bVar);
                            i++;
                        }
                        coVar.o();
                        cVar.a(true);
                    } else {
                        cr.a(coVar, l.b);
                    }
                    coVar.m();
                } else {
                    coVar.k();
                    cVar.n();
                    return;
                }
            }
        }

        @Override // com.umeng.analytics.pro.cw
        /* renamed from: b */
        public void a(co coVar, c cVar) throws bv {
            cVar.n();
            coVar.a(c.f);
            if (cVar.a != null) {
                coVar.a(c.g);
                coVar.a(new cl((byte) 11, (byte) 12, cVar.a.size()));
                for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.b> entry : cVar.a.entrySet()) {
                    coVar.a(entry.getKey());
                    entry.getValue().write(coVar);
                }
                coVar.e();
                coVar.c();
            }
            if (cVar.b != null && cVar.j()) {
                coVar.a(c.h);
                coVar.a(new ck((byte) 12, cVar.b.size()));
                for (com.umeng.commonsdk.statistics.proto.a aVar : cVar.b) {
                    aVar.write(coVar);
                }
                coVar.f();
                coVar.c();
            }
            if (cVar.c != null && cVar.m()) {
                coVar.a(c.i);
                coVar.a(cVar.c);
                coVar.c();
            }
            coVar.d();
            coVar.b();
        }
    }

    /* compiled from: IdTracking.java */
    /* loaded from: classes3.dex */
    private static class d implements cx {
        private d() {
        }

        @Override // com.umeng.analytics.pro.cx
        /* renamed from: a */
        public C0327c b() {
            return new C0327c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: IdTracking.java */
    /* renamed from: com.umeng.commonsdk.statistics.proto.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0327c extends cz<c> {
        private C0327c() {
        }

        @Override // com.umeng.analytics.pro.cw
        public void a(co coVar, c cVar) throws bv {
            cu cuVar = (cu) coVar;
            cuVar.a(cVar.a.size());
            for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.b> entry : cVar.a.entrySet()) {
                cuVar.a(entry.getKey());
                entry.getValue().write(cuVar);
            }
            BitSet bitSet = new BitSet();
            if (cVar.j()) {
                bitSet.set(0);
            }
            if (cVar.m()) {
                bitSet.set(1);
            }
            cuVar.a(bitSet, 2);
            if (cVar.j()) {
                cuVar.a(cVar.b.size());
                for (com.umeng.commonsdk.statistics.proto.a aVar : cVar.b) {
                    aVar.write(cuVar);
                }
            }
            if (cVar.m()) {
                cuVar.a(cVar.c);
            }
        }

        @Override // com.umeng.analytics.pro.cw
        public void b(co coVar, c cVar) throws bv {
            cu cuVar = (cu) coVar;
            cl clVar = new cl((byte) 11, (byte) 12, cuVar.w());
            cVar.a = new HashMap(clVar.c * 2);
            for (int i = 0; i < clVar.c; i++) {
                String z = cuVar.z();
                com.umeng.commonsdk.statistics.proto.b bVar = new com.umeng.commonsdk.statistics.proto.b();
                bVar.read(cuVar);
                cVar.a.put(z, bVar);
            }
            cVar.a(true);
            BitSet b = cuVar.b(2);
            if (b.get(0)) {
                ck ckVar = new ck((byte) 12, cuVar.w());
                cVar.b = new ArrayList(ckVar.b);
                for (int i2 = 0; i2 < ckVar.b; i2++) {
                    com.umeng.commonsdk.statistics.proto.a aVar = new com.umeng.commonsdk.statistics.proto.a();
                    aVar.read(cuVar);
                    cVar.b.add(aVar);
                }
                cVar.b(true);
            }
            if (b.get(1)) {
                cVar.c = cuVar.z();
                cVar.c(true);
            }
        }
    }
}
