package com.amazon.aps.iva.v4;

import com.amazon.aps.iva.v4.o;
import com.amazon.aps.iva.v4.w;
import java.io.IOException;
import java.util.Map;
/* compiled from: ExtensionSchemaLite.java */
/* loaded from: classes.dex */
public final class q extends p<w.d> {

    /* compiled from: ExtensionSchemaLite.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[r1.values().length];
            a = iArr;
            try {
                iArr[r1.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[r1.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[r1.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[r1.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[r1.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[r1.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[r1.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[r1.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[r1.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[r1.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[r1.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[r1.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[r1.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[r1.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[r1.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[r1.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[r1.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[r1.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // com.amazon.aps.iva.v4.p
    public final void a(Map.Entry entry) {
        ((w.d) entry.getKey()).getClass();
    }

    @Override // com.amazon.aps.iva.v4.p
    public final w.e b(o oVar, p0 p0Var, int i) {
        oVar.getClass();
        return oVar.a.get(new o.a(p0Var, i));
    }

    @Override // com.amazon.aps.iva.v4.p
    public final s<w.d> c(Object obj) {
        return ((w.c) obj).extensions;
    }

    @Override // com.amazon.aps.iva.v4.p
    public final s<w.d> d(Object obj) {
        w.c cVar = (w.c) obj;
        s<w.d> sVar = cVar.extensions;
        if (sVar.b) {
            cVar.extensions = sVar.clone();
        }
        return cVar.extensions;
    }

    @Override // com.amazon.aps.iva.v4.p
    public final boolean e(p0 p0Var) {
        return p0Var instanceof w.c;
    }

    @Override // com.amazon.aps.iva.v4.p
    public final void f(Object obj) {
        s<w.d> sVar = ((w.c) obj).extensions;
        if (!sVar.b) {
            sVar.a.i();
            sVar.b = true;
        }
    }

    @Override // com.amazon.aps.iva.v4.p
    public final Object g(Object obj) throws IOException {
        w.e eVar = (w.e) obj;
        throw null;
    }

    @Override // com.amazon.aps.iva.v4.p
    public final void h(Object obj) throws IOException {
        w.e eVar = (w.e) obj;
        throw null;
    }

    @Override // com.amazon.aps.iva.v4.p
    public final void i(Object obj) throws IOException {
        w.e eVar = (w.e) obj;
        throw null;
    }

    @Override // com.amazon.aps.iva.v4.p
    public final void j(Map.Entry entry) throws IOException {
        ((w.d) entry.getKey()).getClass();
        int[] iArr = a.a;
        throw null;
    }
}
