package com.amazon.aps.iva.e4;

import com.amazon.aps.iva.e4.p;
import com.amazon.aps.iva.e4.x;
import java.io.IOException;
import java.util.Map;
/* compiled from: ExtensionSchemaLite.java */
/* loaded from: classes.dex */
public final class r extends q<x.d> {

    /* compiled from: ExtensionSchemaLite.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[u1.values().length];
            a = iArr;
            try {
                iArr[u1.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[u1.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[u1.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[u1.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[u1.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[u1.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[u1.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[u1.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[u1.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[u1.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[u1.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[u1.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[u1.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[u1.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[u1.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[u1.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[u1.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[u1.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // com.amazon.aps.iva.e4.q
    public final void a(Map.Entry entry) {
        ((x.d) entry.getKey()).getClass();
    }

    @Override // com.amazon.aps.iva.e4.q
    public final x.e b(p pVar, q0 q0Var, int i) {
        pVar.getClass();
        return pVar.a.get(new p.a(q0Var, i));
    }

    @Override // com.amazon.aps.iva.e4.q
    public final t<x.d> c(Object obj) {
        return ((x.c) obj).extensions;
    }

    @Override // com.amazon.aps.iva.e4.q
    public final t<x.d> d(Object obj) {
        x.c cVar = (x.c) obj;
        t<x.d> tVar = cVar.extensions;
        if (tVar.b) {
            cVar.extensions = tVar.clone();
        }
        return cVar.extensions;
    }

    @Override // com.amazon.aps.iva.e4.q
    public final boolean e(q0 q0Var) {
        return q0Var instanceof x.c;
    }

    @Override // com.amazon.aps.iva.e4.q
    public final void f(Object obj) {
        t<x.d> tVar = ((x.c) obj).extensions;
        if (!tVar.b) {
            tVar.a.i();
            tVar.b = true;
        }
    }

    @Override // com.amazon.aps.iva.e4.q
    public final Object g(Object obj) throws IOException {
        x.e eVar = (x.e) obj;
        throw null;
    }

    @Override // com.amazon.aps.iva.e4.q
    public final void h(Object obj) throws IOException {
        x.e eVar = (x.e) obj;
        throw null;
    }

    @Override // com.amazon.aps.iva.e4.q
    public final void i(Object obj) throws IOException {
        x.e eVar = (x.e) obj;
        throw null;
    }

    @Override // com.amazon.aps.iva.e4.q
    public final void j(Map.Entry entry) throws IOException {
        ((x.d) entry.getKey()).getClass();
        int[] iArr = a.a;
        throw null;
    }
}
