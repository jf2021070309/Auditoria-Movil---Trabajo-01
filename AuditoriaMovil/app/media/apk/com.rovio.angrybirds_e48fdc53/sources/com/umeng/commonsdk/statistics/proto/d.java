package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.bm;
import com.umeng.analytics.pro.bp;
import com.umeng.analytics.pro.bv;
import com.umeng.analytics.pro.bw;
import com.umeng.analytics.pro.cb;
import com.umeng.analytics.pro.cc;
import com.umeng.analytics.pro.ce;
import com.umeng.analytics.pro.cg;
import com.umeng.analytics.pro.ci;
import com.umeng.analytics.pro.cj;
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
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: Imprint.java */
/* loaded from: classes3.dex */
public class d implements bp<d, e>, Serializable, Cloneable {
    public static final Map<e, cb> d;
    private static final long e = 2846460275012375038L;
    private static final ct f = new ct("Imprint");
    private static final cj g = new cj("property", cv.k, 1);
    private static final cj h = new cj("version", (byte) 8, 2);
    private static final cj i = new cj("checksum", (byte) 11, 3);
    private static final Map<Class<? extends cw>, cx> j;
    private static final int k = 0;
    public Map<String, com.umeng.commonsdk.statistics.proto.e> a;
    public int b;
    public String c;
    private byte l;

    static {
        HashMap hashMap = new HashMap();
        j = hashMap;
        hashMap.put(cy.class, new b());
        hashMap.put(cz.class, new C0328d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.PROPERTY, (e) new cb("property", (byte) 1, new ce(cv.k, new cc((byte) 11), new cg((byte) 12, com.umeng.commonsdk.statistics.proto.e.class))));
        enumMap.put((EnumMap) e.VERSION, (e) new cb("version", (byte) 1, new cc((byte) 8)));
        enumMap.put((EnumMap) e.CHECKSUM, (e) new cb("checksum", (byte) 1, new cc((byte) 11)));
        Map<e, cb> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        d = unmodifiableMap;
        cb.a(d.class, unmodifiableMap);
    }

    /* compiled from: Imprint.java */
    /* loaded from: classes3.dex */
    public enum e implements bw {
        PROPERTY(1, "property"),
        VERSION(2, "version"),
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
                return VERSION;
            }
            return PROPERTY;
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

    public d() {
        this.l = (byte) 0;
    }

    public d(Map<String, com.umeng.commonsdk.statistics.proto.e> map, int i2, String str) {
        this();
        this.a = map;
        this.b = i2;
        b(true);
        this.c = str;
    }

    public d(d dVar) {
        this.l = (byte) 0;
        this.l = dVar.l;
        if (dVar.e()) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.e> entry : dVar.a.entrySet()) {
                hashMap.put(entry.getKey(), new com.umeng.commonsdk.statistics.proto.e(entry.getValue()));
            }
            this.a = hashMap;
        }
        this.b = dVar.b;
        if (dVar.k()) {
            this.c = dVar.c;
        }
    }

    @Override // com.umeng.analytics.pro.bp
    /* renamed from: a */
    public d deepCopy() {
        return new d(this);
    }

    @Override // com.umeng.analytics.pro.bp
    public void clear() {
        this.a = null;
        b(false);
        this.b = 0;
        this.c = null;
    }

    public int b() {
        Map<String, com.umeng.commonsdk.statistics.proto.e> map = this.a;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public void a(String str, com.umeng.commonsdk.statistics.proto.e eVar) {
        if (this.a == null) {
            this.a = new HashMap();
        }
        this.a.put(str, eVar);
    }

    public Map<String, com.umeng.commonsdk.statistics.proto.e> c() {
        return this.a;
    }

    public d a(Map<String, com.umeng.commonsdk.statistics.proto.e> map) {
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
        return this.b;
    }

    public d a(int i2) {
        this.b = i2;
        b(true);
        return this;
    }

    public void g() {
        this.l = bm.b(this.l, 0);
    }

    public boolean h() {
        return bm.a(this.l, 0);
    }

    public void b(boolean z) {
        this.l = bm.a(this.l, 0, z);
    }

    public String i() {
        return this.c;
    }

    public d a(String str) {
        this.c = str;
        return this;
    }

    public void j() {
        this.c = null;
    }

    public boolean k() {
        return this.c != null;
    }

    public void c(boolean z) {
        if (!z) {
            this.c = null;
        }
    }

    @Override // com.umeng.analytics.pro.bp
    /* renamed from: b */
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
        StringBuilder sb = new StringBuilder("Imprint(");
        sb.append("property:");
        Map<String, com.umeng.commonsdk.statistics.proto.e> map = this.a;
        if (map == null) {
            sb.append("null");
        } else {
            sb.append(map);
        }
        sb.append(", ");
        sb.append("version:");
        sb.append(this.b);
        sb.append(", ");
        sb.append("checksum:");
        String str = this.c;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(")");
        return sb.toString();
    }

    public void l() throws bv {
        if (this.a == null) {
            throw new cp("Required field 'property' was not present! Struct: " + toString());
        } else if (this.c == null) {
            throw new cp("Required field 'checksum' was not present! Struct: " + toString());
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
            this.l = (byte) 0;
            read(new ci(new da(objectInputStream)));
        } catch (bv e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* compiled from: Imprint.java */
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
    /* compiled from: Imprint.java */
    /* loaded from: classes3.dex */
    public static class a extends cy<d> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.cw
        /* renamed from: a */
        public void b(co coVar, d dVar) throws bv {
            coVar.j();
            while (true) {
                cj l = coVar.l();
                if (l.b == 0) {
                    break;
                }
                short s = l.c;
                if (s != 1) {
                    if (s != 2) {
                        if (s == 3) {
                            if (l.b == 11) {
                                dVar.c = coVar.z();
                                dVar.c(true);
                            } else {
                                cr.a(coVar, l.b);
                            }
                        } else {
                            cr.a(coVar, l.b);
                        }
                    } else if (l.b == 8) {
                        dVar.b = coVar.w();
                        dVar.b(true);
                    } else {
                        cr.a(coVar, l.b);
                    }
                } else if (l.b == 13) {
                    cl n = coVar.n();
                    dVar.a = new HashMap(n.c * 2);
                    for (int i = 0; i < n.c; i++) {
                        String z = coVar.z();
                        com.umeng.commonsdk.statistics.proto.e eVar = new com.umeng.commonsdk.statistics.proto.e();
                        eVar.read(coVar);
                        dVar.a.put(z, eVar);
                    }
                    coVar.o();
                    dVar.a(true);
                } else {
                    cr.a(coVar, l.b);
                }
                coVar.m();
            }
            coVar.k();
            if (!dVar.h()) {
                throw new cp("Required field 'version' was not found in serialized data! Struct: " + toString());
            }
            dVar.l();
        }

        @Override // com.umeng.analytics.pro.cw
        /* renamed from: b */
        public void a(co coVar, d dVar) throws bv {
            dVar.l();
            coVar.a(d.f);
            if (dVar.a != null) {
                coVar.a(d.g);
                coVar.a(new cl((byte) 11, (byte) 12, dVar.a.size()));
                for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.e> entry : dVar.a.entrySet()) {
                    coVar.a(entry.getKey());
                    entry.getValue().write(coVar);
                }
                coVar.e();
                coVar.c();
            }
            coVar.a(d.h);
            coVar.a(dVar.b);
            coVar.c();
            if (dVar.c != null) {
                coVar.a(d.i);
                coVar.a(dVar.c);
                coVar.c();
            }
            coVar.d();
            coVar.b();
        }
    }

    /* compiled from: Imprint.java */
    /* renamed from: com.umeng.commonsdk.statistics.proto.d$d  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static class C0328d implements cx {
        private C0328d() {
        }

        @Override // com.umeng.analytics.pro.cx
        /* renamed from: a */
        public c b() {
            return new c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Imprint.java */
    /* loaded from: classes3.dex */
    public static class c extends cz<d> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.cw
        public void a(co coVar, d dVar) throws bv {
            cu cuVar = (cu) coVar;
            cuVar.a(dVar.a.size());
            for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.e> entry : dVar.a.entrySet()) {
                cuVar.a(entry.getKey());
                entry.getValue().write(cuVar);
            }
            cuVar.a(dVar.b);
            cuVar.a(dVar.c);
        }

        @Override // com.umeng.analytics.pro.cw
        public void b(co coVar, d dVar) throws bv {
            cu cuVar = (cu) coVar;
            cl clVar = new cl((byte) 11, (byte) 12, cuVar.w());
            dVar.a = new HashMap(clVar.c * 2);
            for (int i = 0; i < clVar.c; i++) {
                String z = cuVar.z();
                com.umeng.commonsdk.statistics.proto.e eVar = new com.umeng.commonsdk.statistics.proto.e();
                eVar.read(cuVar);
                dVar.a.put(z, eVar);
            }
            dVar.a(true);
            dVar.b = cuVar.w();
            dVar.b(true);
            dVar.c = cuVar.z();
            dVar.c(true);
        }
    }
}
