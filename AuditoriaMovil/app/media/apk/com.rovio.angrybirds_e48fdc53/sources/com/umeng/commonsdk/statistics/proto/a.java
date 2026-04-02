package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.bm;
import com.umeng.analytics.pro.bp;
import com.umeng.analytics.pro.bv;
import com.umeng.analytics.pro.bw;
import com.umeng.analytics.pro.cb;
import com.umeng.analytics.pro.cc;
import com.umeng.analytics.pro.ci;
import com.umeng.analytics.pro.cj;
import com.umeng.analytics.pro.co;
import com.umeng.analytics.pro.cp;
import com.umeng.analytics.pro.cr;
import com.umeng.analytics.pro.ct;
import com.umeng.analytics.pro.cu;
import com.umeng.analytics.pro.cw;
import com.umeng.analytics.pro.cx;
import com.umeng.analytics.pro.cy;
import com.umeng.analytics.pro.cz;
import com.umeng.analytics.pro.da;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: IdJournal.java */
/* loaded from: classes3.dex */
public class a implements bp<a, e>, Serializable, Cloneable {
    public static final Map<e, cb> e;
    private static final long f = 9132678615281394583L;
    private static final ct g = new ct("IdJournal");
    private static final cj h = new cj("domain", (byte) 11, 1);
    private static final cj i = new cj("old_id", (byte) 11, 2);
    private static final cj j = new cj("new_id", (byte) 11, 3);
    private static final cj k = new cj("ts", (byte) 10, 4);
    private static final Map<Class<? extends cw>, cx> l;
    private static final int m = 0;
    public String a;
    public String b;
    public String c;
    public long d;
    private byte n;
    private e[] o;

    static {
        HashMap hashMap = new HashMap();
        l = hashMap;
        hashMap.put(cy.class, new b());
        hashMap.put(cz.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.DOMAIN, (e) new cb("domain", (byte) 1, new cc((byte) 11)));
        enumMap.put((EnumMap) e.OLD_ID, (e) new cb("old_id", (byte) 2, new cc((byte) 11)));
        enumMap.put((EnumMap) e.NEW_ID, (e) new cb("new_id", (byte) 1, new cc((byte) 11)));
        enumMap.put((EnumMap) e.TS, (e) new cb("ts", (byte) 1, new cc((byte) 10)));
        Map<e, cb> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        e = unmodifiableMap;
        cb.a(a.class, unmodifiableMap);
    }

    /* compiled from: IdJournal.java */
    /* loaded from: classes3.dex */
    public enum e implements bw {
        DOMAIN(1, "domain"),
        OLD_ID(2, "old_id"),
        NEW_ID(3, "new_id"),
        TS(4, "ts");
        
        private static final Map<String, e> e = new HashMap();
        private final short f;
        private final String g;

        static {
            Iterator it = EnumSet.allOf(e.class).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                e.put(eVar.b(), eVar);
            }
        }

        public static e a(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return TS;
                        }
                        return null;
                    }
                    return NEW_ID;
                }
                return OLD_ID;
            }
            return DOMAIN;
        }

        public static e b(int i) {
            e a = a(i);
            if (a == null) {
                throw new IllegalArgumentException("Field " + i + " doesn't exist!");
            }
            return a;
        }

        public static e a(String str) {
            return e.get(str);
        }

        e(short s, String str) {
            this.f = s;
            this.g = str;
        }

        @Override // com.umeng.analytics.pro.bw
        public short a() {
            return this.f;
        }

        @Override // com.umeng.analytics.pro.bw
        public String b() {
            return this.g;
        }
    }

    public a() {
        this.n = (byte) 0;
        this.o = new e[]{e.OLD_ID};
    }

    public a(String str, String str2, long j2) {
        this();
        this.a = str;
        this.c = str2;
        this.d = j2;
        d(true);
    }

    public a(a aVar) {
        this.n = (byte) 0;
        this.o = new e[]{e.OLD_ID};
        this.n = aVar.n;
        if (aVar.d()) {
            this.a = aVar.a;
        }
        if (aVar.g()) {
            this.b = aVar.b;
        }
        if (aVar.j()) {
            this.c = aVar.c;
        }
        this.d = aVar.d;
    }

    @Override // com.umeng.analytics.pro.bp
    /* renamed from: a */
    public a deepCopy() {
        return new a(this);
    }

    @Override // com.umeng.analytics.pro.bp
    public void clear() {
        this.a = null;
        this.b = null;
        this.c = null;
        d(false);
        this.d = 0L;
    }

    public String b() {
        return this.a;
    }

    public a a(String str) {
        this.a = str;
        return this;
    }

    public void c() {
        this.a = null;
    }

    public boolean d() {
        return this.a != null;
    }

    public void a(boolean z) {
        if (!z) {
            this.a = null;
        }
    }

    public String e() {
        return this.b;
    }

    public a b(String str) {
        this.b = str;
        return this;
    }

    public void f() {
        this.b = null;
    }

    public boolean g() {
        return this.b != null;
    }

    public void b(boolean z) {
        if (!z) {
            this.b = null;
        }
    }

    public String h() {
        return this.c;
    }

    public a c(String str) {
        this.c = str;
        return this;
    }

    public void i() {
        this.c = null;
    }

    public boolean j() {
        return this.c != null;
    }

    public void c(boolean z) {
        if (!z) {
            this.c = null;
        }
    }

    public long k() {
        return this.d;
    }

    public a a(long j2) {
        this.d = j2;
        d(true);
        return this;
    }

    public void l() {
        this.n = bm.b(this.n, 0);
    }

    public boolean m() {
        return bm.a(this.n, 0);
    }

    public void d(boolean z) {
        this.n = bm.a(this.n, 0, z);
    }

    @Override // com.umeng.analytics.pro.bp
    /* renamed from: a */
    public e fieldForId(int i2) {
        return e.a(i2);
    }

    @Override // com.umeng.analytics.pro.bp
    public void read(co coVar) throws bv {
        l.get(coVar.D()).b().b(coVar, this);
    }

    @Override // com.umeng.analytics.pro.bp
    public void write(co coVar) throws bv {
        l.get(coVar.D()).b().a(coVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdJournal(");
        sb.append("domain:");
        String str = this.a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        if (g()) {
            sb.append(", ");
            sb.append("old_id:");
            String str2 = this.b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        sb.append(", ");
        sb.append("new_id:");
        String str3 = this.c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("ts:");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }

    public void n() throws bv {
        if (this.a == null) {
            throw new cp("Required field 'domain' was not present! Struct: " + toString());
        } else if (this.c == null) {
            throw new cp("Required field 'new_id' was not present! Struct: " + toString());
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
            this.n = (byte) 0;
            read(new ci(new da(objectInputStream)));
        } catch (bv e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* compiled from: IdJournal.java */
    /* loaded from: classes3.dex */
    private static class b implements cx {
        private b() {
        }

        @Override // com.umeng.analytics.pro.cx
        /* renamed from: a */
        public C0325a b() {
            return new C0325a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: IdJournal.java */
    /* renamed from: com.umeng.commonsdk.statistics.proto.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0325a extends cy<a> {
        private C0325a() {
        }

        @Override // com.umeng.analytics.pro.cw
        /* renamed from: a */
        public void b(co coVar, a aVar) throws bv {
            coVar.j();
            while (true) {
                cj l = coVar.l();
                if (l.b == 0) {
                    break;
                }
                short s = l.c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s == 4) {
                                if (l.b == 10) {
                                    aVar.d = coVar.x();
                                    aVar.d(true);
                                } else {
                                    cr.a(coVar, l.b);
                                }
                            } else {
                                cr.a(coVar, l.b);
                            }
                        } else if (l.b == 11) {
                            aVar.c = coVar.z();
                            aVar.c(true);
                        } else {
                            cr.a(coVar, l.b);
                        }
                    } else if (l.b == 11) {
                        aVar.b = coVar.z();
                        aVar.b(true);
                    } else {
                        cr.a(coVar, l.b);
                    }
                } else if (l.b == 11) {
                    aVar.a = coVar.z();
                    aVar.a(true);
                } else {
                    cr.a(coVar, l.b);
                }
                coVar.m();
            }
            coVar.k();
            if (!aVar.m()) {
                throw new cp("Required field 'ts' was not found in serialized data! Struct: " + toString());
            }
            aVar.n();
        }

        @Override // com.umeng.analytics.pro.cw
        /* renamed from: b */
        public void a(co coVar, a aVar) throws bv {
            aVar.n();
            coVar.a(a.g);
            if (aVar.a != null) {
                coVar.a(a.h);
                coVar.a(aVar.a);
                coVar.c();
            }
            if (aVar.b != null && aVar.g()) {
                coVar.a(a.i);
                coVar.a(aVar.b);
                coVar.c();
            }
            if (aVar.c != null) {
                coVar.a(a.j);
                coVar.a(aVar.c);
                coVar.c();
            }
            coVar.a(a.k);
            coVar.a(aVar.d);
            coVar.c();
            coVar.d();
            coVar.b();
        }
    }

    /* compiled from: IdJournal.java */
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
    /* compiled from: IdJournal.java */
    /* loaded from: classes3.dex */
    public static class c extends cz<a> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.cw
        public void a(co coVar, a aVar) throws bv {
            cu cuVar = (cu) coVar;
            cuVar.a(aVar.a);
            cuVar.a(aVar.c);
            cuVar.a(aVar.d);
            BitSet bitSet = new BitSet();
            if (aVar.g()) {
                bitSet.set(0);
            }
            cuVar.a(bitSet, 1);
            if (aVar.g()) {
                cuVar.a(aVar.b);
            }
        }

        @Override // com.umeng.analytics.pro.cw
        public void b(co coVar, a aVar) throws bv {
            cu cuVar = (cu) coVar;
            aVar.a = cuVar.z();
            aVar.a(true);
            aVar.c = cuVar.z();
            aVar.c(true);
            aVar.d = cuVar.x();
            aVar.d(true);
            if (cuVar.b(1).get(0)) {
                aVar.b = cuVar.z();
                aVar.b(true);
            }
        }
    }
}
