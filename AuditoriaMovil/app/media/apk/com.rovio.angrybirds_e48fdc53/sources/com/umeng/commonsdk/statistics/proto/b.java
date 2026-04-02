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
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: IdSnapshot.java */
/* loaded from: classes3.dex */
public class b implements bp<b, e>, Serializable, Cloneable {
    public static final Map<e, cb> d;
    private static final long e = -6496538196005191531L;
    private static final ct f = new ct("IdSnapshot");
    private static final cj g = new cj("identity", (byte) 11, 1);
    private static final cj h = new cj("ts", (byte) 10, 2);
    private static final cj i = new cj("version", (byte) 8, 3);
    private static final Map<Class<? extends cw>, cx> j;
    private static final int k = 0;
    private static final int l = 1;
    public String a;
    public long b;
    public int c;
    private byte m;

    static {
        HashMap hashMap = new HashMap();
        j = hashMap;
        hashMap.put(cy.class, new C0326b());
        hashMap.put(cz.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.IDENTITY, (e) new cb("identity", (byte) 1, new cc((byte) 11)));
        enumMap.put((EnumMap) e.TS, (e) new cb("ts", (byte) 1, new cc((byte) 10)));
        enumMap.put((EnumMap) e.VERSION, (e) new cb("version", (byte) 1, new cc((byte) 8)));
        Map<e, cb> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        d = unmodifiableMap;
        cb.a(b.class, unmodifiableMap);
    }

    /* compiled from: IdSnapshot.java */
    /* loaded from: classes3.dex */
    public enum e implements bw {
        IDENTITY(1, "identity"),
        TS(2, "ts"),
        VERSION(3, "version");
        
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
                        return VERSION;
                    }
                    return null;
                }
                return TS;
            }
            return IDENTITY;
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

    public b() {
        this.m = (byte) 0;
    }

    public b(String str, long j2, int i2) {
        this();
        this.a = str;
        this.b = j2;
        b(true);
        this.c = i2;
        c(true);
    }

    public b(b bVar) {
        this.m = (byte) 0;
        this.m = bVar.m;
        if (bVar.d()) {
            this.a = bVar.a;
        }
        this.b = bVar.b;
        this.c = bVar.c;
    }

    @Override // com.umeng.analytics.pro.bp
    /* renamed from: a */
    public b deepCopy() {
        return new b(this);
    }

    @Override // com.umeng.analytics.pro.bp
    public void clear() {
        this.a = null;
        b(false);
        this.b = 0L;
        c(false);
        this.c = 0;
    }

    public String b() {
        return this.a;
    }

    public b a(String str) {
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

    public long e() {
        return this.b;
    }

    public b a(long j2) {
        this.b = j2;
        b(true);
        return this;
    }

    public void f() {
        this.m = bm.b(this.m, 0);
    }

    public boolean g() {
        return bm.a(this.m, 0);
    }

    public void b(boolean z) {
        this.m = bm.a(this.m, 0, z);
    }

    public int h() {
        return this.c;
    }

    public b a(int i2) {
        this.c = i2;
        c(true);
        return this;
    }

    public void i() {
        this.m = bm.b(this.m, 1);
    }

    public boolean j() {
        return bm.a(this.m, 1);
    }

    public void c(boolean z) {
        this.m = bm.a(this.m, 1, z);
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
        StringBuilder sb = new StringBuilder("IdSnapshot(");
        sb.append("identity:");
        String str = this.a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("ts:");
        sb.append(this.b);
        sb.append(", ");
        sb.append("version:");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }

    public void k() throws bv {
        if (this.a == null) {
            throw new cp("Required field 'identity' was not present! Struct: " + toString());
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
            this.m = (byte) 0;
            read(new ci(new da(objectInputStream)));
        } catch (bv e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* compiled from: IdSnapshot.java */
    /* renamed from: com.umeng.commonsdk.statistics.proto.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static class C0326b implements cx {
        private C0326b() {
        }

        @Override // com.umeng.analytics.pro.cx
        /* renamed from: a */
        public a b() {
            return new a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: IdSnapshot.java */
    /* loaded from: classes3.dex */
    public static class a extends cy<b> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.cw
        /* renamed from: a */
        public void b(co coVar, b bVar) throws bv {
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
                            if (l.b == 8) {
                                bVar.c = coVar.w();
                                bVar.c(true);
                            } else {
                                cr.a(coVar, l.b);
                            }
                        } else {
                            cr.a(coVar, l.b);
                        }
                    } else if (l.b == 10) {
                        bVar.b = coVar.x();
                        bVar.b(true);
                    } else {
                        cr.a(coVar, l.b);
                    }
                } else if (l.b == 11) {
                    bVar.a = coVar.z();
                    bVar.a(true);
                } else {
                    cr.a(coVar, l.b);
                }
                coVar.m();
            }
            coVar.k();
            if (!bVar.g()) {
                throw new cp("Required field 'ts' was not found in serialized data! Struct: " + toString());
            } else if (!bVar.j()) {
                throw new cp("Required field 'version' was not found in serialized data! Struct: " + toString());
            } else {
                bVar.k();
            }
        }

        @Override // com.umeng.analytics.pro.cw
        /* renamed from: b */
        public void a(co coVar, b bVar) throws bv {
            bVar.k();
            coVar.a(b.f);
            if (bVar.a != null) {
                coVar.a(b.g);
                coVar.a(bVar.a);
                coVar.c();
            }
            coVar.a(b.h);
            coVar.a(bVar.b);
            coVar.c();
            coVar.a(b.i);
            coVar.a(bVar.c);
            coVar.c();
            coVar.d();
            coVar.b();
        }
    }

    /* compiled from: IdSnapshot.java */
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
    /* compiled from: IdSnapshot.java */
    /* loaded from: classes3.dex */
    public static class c extends cz<b> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.cw
        public void a(co coVar, b bVar) throws bv {
            cu cuVar = (cu) coVar;
            cuVar.a(bVar.a);
            cuVar.a(bVar.b);
            cuVar.a(bVar.c);
        }

        @Override // com.umeng.analytics.pro.cw
        public void b(co coVar, b bVar) throws bv {
            cu cuVar = (cu) coVar;
            bVar.a = cuVar.z();
            bVar.a(true);
            bVar.b = cuVar.x();
            bVar.b(true);
            bVar.c = cuVar.w();
            bVar.c(true);
        }
    }
}
