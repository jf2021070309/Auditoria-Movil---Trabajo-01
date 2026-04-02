package com.umeng.analytics.pro;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: UMEnvelope.java */
/* loaded from: classes3.dex */
public class bh implements bp<bh, e>, Serializable, Cloneable {
    private static final int A = 2;
    private static final int B = 3;
    public static final Map<e, cb> k;
    private static final long l = 420342210744516016L;
    private static final ct m = new ct("UMEnvelope");
    private static final cj n = new cj("version", (byte) 11, 1);
    private static final cj o = new cj("address", (byte) 11, 2);
    private static final cj p = new cj(InAppPurchaseMetaData.KEY_SIGNATURE, (byte) 11, 3);
    private static final cj q = new cj("serial_num", (byte) 8, 4);
    private static final cj r = new cj("ts_secs", (byte) 8, 5);
    private static final cj s = new cj("length", (byte) 8, 6);
    private static final cj t = new cj("entity", (byte) 11, 7);
    private static final cj u = new cj("guid", (byte) 11, 8);
    private static final cj v = new cj("checksum", (byte) 11, 9);
    private static final cj w = new cj("codex", (byte) 8, 10);
    private static final Map<Class<? extends cw>, cx> x;
    private static final int y = 0;
    private static final int z = 1;
    private byte C;
    private e[] D;
    public String a;
    public String b;
    public String c;
    public int d;
    public int e;
    public int f;
    public ByteBuffer g;
    public String h;
    public String i;
    public int j;

    static {
        HashMap hashMap = new HashMap();
        x = hashMap;
        hashMap.put(cy.class, new b());
        hashMap.put(cz.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.VERSION, (e) new cb("version", (byte) 1, new cc((byte) 11)));
        enumMap.put((EnumMap) e.ADDRESS, (e) new cb("address", (byte) 1, new cc((byte) 11)));
        enumMap.put((EnumMap) e.SIGNATURE, (e) new cb(InAppPurchaseMetaData.KEY_SIGNATURE, (byte) 1, new cc((byte) 11)));
        enumMap.put((EnumMap) e.SERIAL_NUM, (e) new cb("serial_num", (byte) 1, new cc((byte) 8)));
        enumMap.put((EnumMap) e.TS_SECS, (e) new cb("ts_secs", (byte) 1, new cc((byte) 8)));
        enumMap.put((EnumMap) e.LENGTH, (e) new cb("length", (byte) 1, new cc((byte) 8)));
        enumMap.put((EnumMap) e.ENTITY, (e) new cb("entity", (byte) 1, new cc((byte) 11, true)));
        enumMap.put((EnumMap) e.GUID, (e) new cb("guid", (byte) 1, new cc((byte) 11)));
        enumMap.put((EnumMap) e.CHECKSUM, (e) new cb("checksum", (byte) 1, new cc((byte) 11)));
        enumMap.put((EnumMap) e.CODEX, (e) new cb("codex", (byte) 2, new cc((byte) 8)));
        Map<e, cb> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        k = unmodifiableMap;
        cb.a(bh.class, unmodifiableMap);
    }

    /* compiled from: UMEnvelope.java */
    /* loaded from: classes3.dex */
    public enum e implements bw {
        VERSION(1, "version"),
        ADDRESS(2, "address"),
        SIGNATURE(3, InAppPurchaseMetaData.KEY_SIGNATURE),
        SERIAL_NUM(4, "serial_num"),
        TS_SECS(5, "ts_secs"),
        LENGTH(6, "length"),
        ENTITY(7, "entity"),
        GUID(8, "guid"),
        CHECKSUM(9, "checksum"),
        CODEX(10, "codex");
        
        private static final Map<String, e> k = new HashMap();
        private final short l;
        private final String m;

        static {
            Iterator it = EnumSet.allOf(e.class).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                k.put(eVar.b(), eVar);
            }
        }

        public static e a(int i) {
            switch (i) {
                case 1:
                    return VERSION;
                case 2:
                    return ADDRESS;
                case 3:
                    return SIGNATURE;
                case 4:
                    return SERIAL_NUM;
                case 5:
                    return TS_SECS;
                case 6:
                    return LENGTH;
                case 7:
                    return ENTITY;
                case 8:
                    return GUID;
                case 9:
                    return CHECKSUM;
                case 10:
                    return CODEX;
                default:
                    return null;
            }
        }

        public static e b(int i) {
            e a = a(i);
            if (a == null) {
                throw new IllegalArgumentException("Field " + i + " doesn't exist!");
            }
            return a;
        }

        public static e a(String str) {
            return k.get(str);
        }

        e(short s, String str) {
            this.l = s;
            this.m = str;
        }

        @Override // com.umeng.analytics.pro.bw
        public short a() {
            return this.l;
        }

        @Override // com.umeng.analytics.pro.bw
        public String b() {
            return this.m;
        }
    }

    public bh() {
        this.C = (byte) 0;
        this.D = new e[]{e.CODEX};
    }

    public bh(String str, String str2, String str3, int i, int i2, int i3, ByteBuffer byteBuffer, String str4, String str5) {
        this();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        d(true);
        this.e = i2;
        e(true);
        this.f = i3;
        f(true);
        this.g = byteBuffer;
        this.h = str4;
        this.i = str5;
    }

    public bh(bh bhVar) {
        this.C = (byte) 0;
        this.D = new e[]{e.CODEX};
        this.C = bhVar.C;
        if (bhVar.d()) {
            this.a = bhVar.a;
        }
        if (bhVar.g()) {
            this.b = bhVar.b;
        }
        if (bhVar.j()) {
            this.c = bhVar.c;
        }
        this.d = bhVar.d;
        this.e = bhVar.e;
        this.f = bhVar.f;
        if (bhVar.w()) {
            this.g = bq.d(bhVar.g);
        }
        if (bhVar.z()) {
            this.h = bhVar.h;
        }
        if (bhVar.C()) {
            this.i = bhVar.i;
        }
        this.j = bhVar.j;
    }

    @Override // com.umeng.analytics.pro.bp
    /* renamed from: a */
    public bh deepCopy() {
        return new bh(this);
    }

    @Override // com.umeng.analytics.pro.bp
    public void clear() {
        this.a = null;
        this.b = null;
        this.c = null;
        d(false);
        this.d = 0;
        e(false);
        this.e = 0;
        f(false);
        this.f = 0;
        this.g = null;
        this.h = null;
        this.i = null;
        j(false);
        this.j = 0;
    }

    public String b() {
        return this.a;
    }

    public bh a(String str) {
        this.a = str;
        return this;
    }

    public void c() {
        this.a = null;
    }

    public boolean d() {
        return this.a != null;
    }

    public void a(boolean z2) {
        if (!z2) {
            this.a = null;
        }
    }

    public String e() {
        return this.b;
    }

    public bh b(String str) {
        this.b = str;
        return this;
    }

    public void f() {
        this.b = null;
    }

    public boolean g() {
        return this.b != null;
    }

    public void b(boolean z2) {
        if (!z2) {
            this.b = null;
        }
    }

    public String h() {
        return this.c;
    }

    public bh c(String str) {
        this.c = str;
        return this;
    }

    public void i() {
        this.c = null;
    }

    public boolean j() {
        return this.c != null;
    }

    public void c(boolean z2) {
        if (!z2) {
            this.c = null;
        }
    }

    public int k() {
        return this.d;
    }

    public bh a(int i) {
        this.d = i;
        d(true);
        return this;
    }

    public void l() {
        this.C = bm.b(this.C, 0);
    }

    public boolean m() {
        return bm.a(this.C, 0);
    }

    public void d(boolean z2) {
        this.C = bm.a(this.C, 0, z2);
    }

    public int n() {
        return this.e;
    }

    public bh b(int i) {
        this.e = i;
        e(true);
        return this;
    }

    public void o() {
        this.C = bm.b(this.C, 1);
    }

    public boolean p() {
        return bm.a(this.C, 1);
    }

    public void e(boolean z2) {
        this.C = bm.a(this.C, 1, z2);
    }

    public int q() {
        return this.f;
    }

    public bh c(int i) {
        this.f = i;
        f(true);
        return this;
    }

    public void r() {
        this.C = bm.b(this.C, 2);
    }

    public boolean s() {
        return bm.a(this.C, 2);
    }

    public void f(boolean z2) {
        this.C = bm.a(this.C, 2, z2);
    }

    public byte[] t() {
        a(bq.c(this.g));
        ByteBuffer byteBuffer = this.g;
        if (byteBuffer == null) {
            return null;
        }
        return byteBuffer.array();
    }

    public ByteBuffer u() {
        return this.g;
    }

    public bh a(byte[] bArr) {
        a(bArr == null ? null : ByteBuffer.wrap(bArr));
        return this;
    }

    public bh a(ByteBuffer byteBuffer) {
        this.g = byteBuffer;
        return this;
    }

    public void v() {
        this.g = null;
    }

    public boolean w() {
        return this.g != null;
    }

    public void g(boolean z2) {
        if (!z2) {
            this.g = null;
        }
    }

    public String x() {
        return this.h;
    }

    public bh d(String str) {
        this.h = str;
        return this;
    }

    public void y() {
        this.h = null;
    }

    public boolean z() {
        return this.h != null;
    }

    public void h(boolean z2) {
        if (!z2) {
            this.h = null;
        }
    }

    public String A() {
        return this.i;
    }

    public bh e(String str) {
        this.i = str;
        return this;
    }

    public void B() {
        this.i = null;
    }

    public boolean C() {
        return this.i != null;
    }

    public void i(boolean z2) {
        if (!z2) {
            this.i = null;
        }
    }

    public int D() {
        return this.j;
    }

    public bh d(int i) {
        this.j = i;
        j(true);
        return this;
    }

    public void E() {
        this.C = bm.b(this.C, 3);
    }

    public boolean F() {
        return bm.a(this.C, 3);
    }

    public void j(boolean z2) {
        this.C = bm.a(this.C, 3, z2);
    }

    @Override // com.umeng.analytics.pro.bp
    /* renamed from: e */
    public e fieldForId(int i) {
        return e.a(i);
    }

    @Override // com.umeng.analytics.pro.bp
    public void read(co coVar) throws bv {
        x.get(coVar.D()).b().b(coVar, this);
    }

    @Override // com.umeng.analytics.pro.bp
    public void write(co coVar) throws bv {
        x.get(coVar.D()).b().a(coVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UMEnvelope(");
        sb.append("version:");
        String str = this.a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("address:");
        String str2 = this.b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("signature:");
        String str3 = this.c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("serial_num:");
        sb.append(this.d);
        sb.append(", ");
        sb.append("ts_secs:");
        sb.append(this.e);
        sb.append(", ");
        sb.append("length:");
        sb.append(this.f);
        sb.append(", ");
        sb.append("entity:");
        ByteBuffer byteBuffer = this.g;
        if (byteBuffer == null) {
            sb.append("null");
        } else {
            bq.a(byteBuffer, sb);
        }
        sb.append(", ");
        sb.append("guid:");
        String str4 = this.h;
        if (str4 == null) {
            sb.append("null");
        } else {
            sb.append(str4);
        }
        sb.append(", ");
        sb.append("checksum:");
        String str5 = this.i;
        if (str5 == null) {
            sb.append("null");
        } else {
            sb.append(str5);
        }
        if (F()) {
            sb.append(", ");
            sb.append("codex:");
            sb.append(this.j);
        }
        sb.append(")");
        return sb.toString();
    }

    public void G() throws bv {
        if (this.a == null) {
            throw new cp("Required field 'version' was not present! Struct: " + toString());
        } else if (this.b == null) {
            throw new cp("Required field 'address' was not present! Struct: " + toString());
        } else if (this.c == null) {
            throw new cp("Required field 'signature' was not present! Struct: " + toString());
        } else if (this.g == null) {
            throw new cp("Required field 'entity' was not present! Struct: " + toString());
        } else if (this.h == null) {
            throw new cp("Required field 'guid' was not present! Struct: " + toString());
        } else if (this.i == null) {
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
            this.C = (byte) 0;
            read(new ci(new da(objectInputStream)));
        } catch (bv e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* compiled from: UMEnvelope.java */
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
    /* compiled from: UMEnvelope.java */
    /* loaded from: classes3.dex */
    public static class a extends cy<bh> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.cw
        /* renamed from: a */
        public void b(co coVar, bh bhVar) throws bv {
            coVar.j();
            while (true) {
                cj l = coVar.l();
                if (l.b != 0) {
                    switch (l.c) {
                        case 1:
                            if (l.b == 11) {
                                bhVar.a = coVar.z();
                                bhVar.a(true);
                                break;
                            } else {
                                cr.a(coVar, l.b);
                                break;
                            }
                        case 2:
                            if (l.b == 11) {
                                bhVar.b = coVar.z();
                                bhVar.b(true);
                                break;
                            } else {
                                cr.a(coVar, l.b);
                                break;
                            }
                        case 3:
                            if (l.b == 11) {
                                bhVar.c = coVar.z();
                                bhVar.c(true);
                                break;
                            } else {
                                cr.a(coVar, l.b);
                                break;
                            }
                        case 4:
                            if (l.b == 8) {
                                bhVar.d = coVar.w();
                                bhVar.d(true);
                                break;
                            } else {
                                cr.a(coVar, l.b);
                                break;
                            }
                        case 5:
                            if (l.b == 8) {
                                bhVar.e = coVar.w();
                                bhVar.e(true);
                                break;
                            } else {
                                cr.a(coVar, l.b);
                                break;
                            }
                        case 6:
                            if (l.b == 8) {
                                bhVar.f = coVar.w();
                                bhVar.f(true);
                                break;
                            } else {
                                cr.a(coVar, l.b);
                                break;
                            }
                        case 7:
                            if (l.b == 11) {
                                bhVar.g = coVar.A();
                                bhVar.g(true);
                                break;
                            } else {
                                cr.a(coVar, l.b);
                                break;
                            }
                        case 8:
                            if (l.b == 11) {
                                bhVar.h = coVar.z();
                                bhVar.h(true);
                                break;
                            } else {
                                cr.a(coVar, l.b);
                                break;
                            }
                        case 9:
                            if (l.b == 11) {
                                bhVar.i = coVar.z();
                                bhVar.i(true);
                                break;
                            } else {
                                cr.a(coVar, l.b);
                                break;
                            }
                        case 10:
                            if (l.b == 8) {
                                bhVar.j = coVar.w();
                                bhVar.j(true);
                                break;
                            } else {
                                cr.a(coVar, l.b);
                                break;
                            }
                        default:
                            cr.a(coVar, l.b);
                            break;
                    }
                    coVar.m();
                } else {
                    coVar.k();
                    if (!bhVar.m()) {
                        throw new cp("Required field 'serial_num' was not found in serialized data! Struct: " + toString());
                    } else if (!bhVar.p()) {
                        throw new cp("Required field 'ts_secs' was not found in serialized data! Struct: " + toString());
                    } else if (!bhVar.s()) {
                        throw new cp("Required field 'length' was not found in serialized data! Struct: " + toString());
                    } else {
                        bhVar.G();
                        return;
                    }
                }
            }
        }

        @Override // com.umeng.analytics.pro.cw
        /* renamed from: b */
        public void a(co coVar, bh bhVar) throws bv {
            bhVar.G();
            coVar.a(bh.m);
            if (bhVar.a != null) {
                coVar.a(bh.n);
                coVar.a(bhVar.a);
                coVar.c();
            }
            if (bhVar.b != null) {
                coVar.a(bh.o);
                coVar.a(bhVar.b);
                coVar.c();
            }
            if (bhVar.c != null) {
                coVar.a(bh.p);
                coVar.a(bhVar.c);
                coVar.c();
            }
            coVar.a(bh.q);
            coVar.a(bhVar.d);
            coVar.c();
            coVar.a(bh.r);
            coVar.a(bhVar.e);
            coVar.c();
            coVar.a(bh.s);
            coVar.a(bhVar.f);
            coVar.c();
            if (bhVar.g != null) {
                coVar.a(bh.t);
                coVar.a(bhVar.g);
                coVar.c();
            }
            if (bhVar.h != null) {
                coVar.a(bh.u);
                coVar.a(bhVar.h);
                coVar.c();
            }
            if (bhVar.i != null) {
                coVar.a(bh.v);
                coVar.a(bhVar.i);
                coVar.c();
            }
            if (bhVar.F()) {
                coVar.a(bh.w);
                coVar.a(bhVar.j);
                coVar.c();
            }
            coVar.d();
            coVar.b();
        }
    }

    /* compiled from: UMEnvelope.java */
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
    /* compiled from: UMEnvelope.java */
    /* loaded from: classes3.dex */
    public static class c extends cz<bh> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.cw
        public void a(co coVar, bh bhVar) throws bv {
            cu cuVar = (cu) coVar;
            cuVar.a(bhVar.a);
            cuVar.a(bhVar.b);
            cuVar.a(bhVar.c);
            cuVar.a(bhVar.d);
            cuVar.a(bhVar.e);
            cuVar.a(bhVar.f);
            cuVar.a(bhVar.g);
            cuVar.a(bhVar.h);
            cuVar.a(bhVar.i);
            BitSet bitSet = new BitSet();
            if (bhVar.F()) {
                bitSet.set(0);
            }
            cuVar.a(bitSet, 1);
            if (bhVar.F()) {
                cuVar.a(bhVar.j);
            }
        }

        @Override // com.umeng.analytics.pro.cw
        public void b(co coVar, bh bhVar) throws bv {
            cu cuVar = (cu) coVar;
            bhVar.a = cuVar.z();
            bhVar.a(true);
            bhVar.b = cuVar.z();
            bhVar.b(true);
            bhVar.c = cuVar.z();
            bhVar.c(true);
            bhVar.d = cuVar.w();
            bhVar.d(true);
            bhVar.e = cuVar.w();
            bhVar.e(true);
            bhVar.f = cuVar.w();
            bhVar.f(true);
            bhVar.g = cuVar.A();
            bhVar.g(true);
            bhVar.h = cuVar.z();
            bhVar.h(true);
            bhVar.i = cuVar.z();
            bhVar.i(true);
            if (cuVar.b(1).get(0)) {
                bhVar.j = cuVar.w();
                bhVar.j(true);
            }
        }
    }
}
