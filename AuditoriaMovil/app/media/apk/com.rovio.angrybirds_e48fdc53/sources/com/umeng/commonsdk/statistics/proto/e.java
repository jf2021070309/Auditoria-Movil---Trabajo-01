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
/* compiled from: ImprintValue.java */
/* loaded from: classes3.dex */
public class e implements bp<e, EnumC0329e>, Serializable, Cloneable {
    public static final Map<EnumC0329e, cb> d;
    private static final long e = 7501688097813630241L;
    private static final ct f = new ct("ImprintValue");
    private static final cj g = new cj("value", (byte) 11, 1);
    private static final cj h = new cj("ts", (byte) 10, 2);
    private static final cj i = new cj("guid", (byte) 11, 3);
    private static final Map<Class<? extends cw>, cx> j;
    private static final int k = 0;
    public String a;
    public long b;
    public String c;
    private byte l;
    private EnumC0329e[] m;

    static {
        HashMap hashMap = new HashMap();
        j = hashMap;
        hashMap.put(cy.class, new b());
        hashMap.put(cz.class, new d());
        EnumMap enumMap = new EnumMap(EnumC0329e.class);
        enumMap.put((EnumMap) EnumC0329e.VALUE, (EnumC0329e) new cb("value", (byte) 2, new cc((byte) 11)));
        enumMap.put((EnumMap) EnumC0329e.TS, (EnumC0329e) new cb("ts", (byte) 2, new cc((byte) 10)));
        enumMap.put((EnumMap) EnumC0329e.GUID, (EnumC0329e) new cb("guid", (byte) 2, new cc((byte) 11)));
        Map<EnumC0329e, cb> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        d = unmodifiableMap;
        cb.a(e.class, unmodifiableMap);
    }

    /* compiled from: ImprintValue.java */
    /* renamed from: com.umeng.commonsdk.statistics.proto.e$e  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public enum EnumC0329e implements bw {
        VALUE(1, "value"),
        TS(2, "ts"),
        GUID(3, "guid");
        
        private static final Map<String, EnumC0329e> d = new HashMap();
        private final short e;
        private final String f;

        static {
            Iterator it = EnumSet.allOf(EnumC0329e.class).iterator();
            while (it.hasNext()) {
                EnumC0329e enumC0329e = (EnumC0329e) it.next();
                d.put(enumC0329e.b(), enumC0329e);
            }
        }

        public static EnumC0329e a(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return GUID;
                    }
                    return null;
                }
                return TS;
            }
            return VALUE;
        }

        public static EnumC0329e b(int i) {
            EnumC0329e a = a(i);
            if (a == null) {
                throw new IllegalArgumentException("Field " + i + " doesn't exist!");
            }
            return a;
        }

        public static EnumC0329e a(String str) {
            return d.get(str);
        }

        EnumC0329e(short s, String str) {
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

    public e() {
        this.l = (byte) 0;
        this.m = new EnumC0329e[]{EnumC0329e.VALUE, EnumC0329e.TS, EnumC0329e.GUID};
    }

    public e(long j2, String str) {
        this();
        this.b = j2;
        b(true);
        this.c = str;
    }

    public e(e eVar) {
        this.l = (byte) 0;
        this.m = new EnumC0329e[]{EnumC0329e.VALUE, EnumC0329e.TS, EnumC0329e.GUID};
        this.l = eVar.l;
        if (eVar.d()) {
            this.a = eVar.a;
        }
        this.b = eVar.b;
        if (eVar.j()) {
            this.c = eVar.c;
        }
    }

    @Override // com.umeng.analytics.pro.bp
    /* renamed from: a */
    public e deepCopy() {
        return new e(this);
    }

    @Override // com.umeng.analytics.pro.bp
    public void clear() {
        this.a = null;
        b(false);
        this.b = 0L;
        this.c = null;
    }

    public String b() {
        return this.a;
    }

    public e a(String str) {
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

    public e a(long j2) {
        this.b = j2;
        b(true);
        return this;
    }

    public void f() {
        this.l = bm.b(this.l, 0);
    }

    public boolean g() {
        return bm.a(this.l, 0);
    }

    public void b(boolean z) {
        this.l = bm.a(this.l, 0, z);
    }

    public String h() {
        return this.c;
    }

    public e b(String str) {
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

    @Override // com.umeng.analytics.pro.bp
    /* renamed from: a */
    public EnumC0329e fieldForId(int i2) {
        return EnumC0329e.a(i2);
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
        boolean z;
        StringBuilder sb = new StringBuilder("ImprintValue(");
        if (!d()) {
            z = true;
        } else {
            sb.append("value:");
            String str = this.a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("ts:");
        sb.append(this.b);
        sb.append(", ");
        sb.append("guid:");
        String str2 = this.c;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(")");
        return sb.toString();
    }

    public void k() throws bv {
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

    /* compiled from: ImprintValue.java */
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
    /* compiled from: ImprintValue.java */
    /* loaded from: classes3.dex */
    public static class a extends cy<e> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.cw
        /* renamed from: a */
        public void b(co coVar, e eVar) throws bv {
            coVar.j();
            while (true) {
                cj l = coVar.l();
                if (l.b != 0) {
                    short s = l.c;
                    if (s != 1) {
                        if (s != 2) {
                            if (s == 3) {
                                if (l.b == 11) {
                                    eVar.c = coVar.z();
                                    eVar.c(true);
                                } else {
                                    cr.a(coVar, l.b);
                                }
                            } else {
                                cr.a(coVar, l.b);
                            }
                        } else if (l.b == 10) {
                            eVar.b = coVar.x();
                            eVar.b(true);
                        } else {
                            cr.a(coVar, l.b);
                        }
                    } else if (l.b == 11) {
                        eVar.a = coVar.z();
                        eVar.a(true);
                    } else {
                        cr.a(coVar, l.b);
                    }
                    coVar.m();
                } else {
                    coVar.k();
                    eVar.k();
                    return;
                }
            }
        }

        @Override // com.umeng.analytics.pro.cw
        /* renamed from: b */
        public void a(co coVar, e eVar) throws bv {
            eVar.k();
            coVar.a(e.f);
            if (eVar.a != null && eVar.d()) {
                coVar.a(e.g);
                coVar.a(eVar.a);
                coVar.c();
            }
            if (eVar.g()) {
                coVar.a(e.h);
                coVar.a(eVar.b);
                coVar.c();
            }
            if (eVar.c != null && eVar.j()) {
                coVar.a(e.i);
                coVar.a(eVar.c);
                coVar.c();
            }
            coVar.d();
            coVar.b();
        }
    }

    /* compiled from: ImprintValue.java */
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
    /* compiled from: ImprintValue.java */
    /* loaded from: classes3.dex */
    public static class c extends cz<e> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.cw
        public void a(co coVar, e eVar) throws bv {
            cu cuVar = (cu) coVar;
            BitSet bitSet = new BitSet();
            if (eVar.d()) {
                bitSet.set(0);
            }
            if (eVar.g()) {
                bitSet.set(1);
            }
            if (eVar.j()) {
                bitSet.set(2);
            }
            cuVar.a(bitSet, 3);
            if (eVar.d()) {
                cuVar.a(eVar.a);
            }
            if (eVar.g()) {
                cuVar.a(eVar.b);
            }
            if (eVar.j()) {
                cuVar.a(eVar.c);
            }
        }

        @Override // com.umeng.analytics.pro.cw
        public void b(co coVar, e eVar) throws bv {
            cu cuVar = (cu) coVar;
            BitSet b = cuVar.b(3);
            if (b.get(0)) {
                eVar.a = cuVar.z();
                eVar.a(true);
            }
            if (b.get(1)) {
                eVar.b = cuVar.x();
                eVar.b(true);
            }
            if (b.get(2)) {
                eVar.c = cuVar.z();
                eVar.c(true);
            }
        }
    }
}
