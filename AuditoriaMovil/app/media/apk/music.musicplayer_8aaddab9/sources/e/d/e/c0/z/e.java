package e.d.e.c0.z;

import ch.qos.logback.core.CoreConstants;
import e.d.e.c0.s;
import e.d.e.t;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes2.dex */
public final class e extends e.d.e.e0.a {
    public static final Object q;
    public Object[] r;
    public int s;
    public String[] t;
    public int[] u;

    /* loaded from: classes2.dex */
    public class a extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i2, int i3) throws IOException {
            throw new AssertionError();
        }
    }

    static {
        new a();
        q = new Object();
    }

    private String B() {
        StringBuilder y = e.a.d.a.a.y(" at path ");
        y.append(v());
        return y.toString();
    }

    @Override // e.d.e.e0.a
    public boolean H() throws IOException {
        n0(e.d.e.e0.b.BOOLEAN);
        boolean b2 = ((t) p0()).b();
        int i2 = this.s;
        if (i2 > 0) {
            int[] iArr = this.u;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return b2;
    }

    @Override // e.d.e.e0.a
    public double I() throws IOException {
        e.d.e.e0.b g0 = g0();
        e.d.e.e0.b bVar = e.d.e.e0.b.NUMBER;
        if (g0 != bVar && g0 != e.d.e.e0.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + g0 + B());
        }
        t tVar = (t) o0();
        double doubleValue = tVar.a instanceof Number ? tVar.c().doubleValue() : Double.parseDouble(tVar.d());
        if (!this.f7899c && (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + doubleValue);
        }
        p0();
        int i2 = this.s;
        if (i2 > 0) {
            int[] iArr = this.u;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return doubleValue;
    }

    @Override // e.d.e.e0.a
    public int K() throws IOException {
        e.d.e.e0.b g0 = g0();
        e.d.e.e0.b bVar = e.d.e.e0.b.NUMBER;
        if (g0 != bVar && g0 != e.d.e.e0.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + g0 + B());
        }
        t tVar = (t) o0();
        int intValue = tVar.a instanceof Number ? tVar.c().intValue() : Integer.parseInt(tVar.d());
        p0();
        int i2 = this.s;
        if (i2 > 0) {
            int[] iArr = this.u;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return intValue;
    }

    @Override // e.d.e.e0.a
    public long M() throws IOException {
        e.d.e.e0.b g0 = g0();
        e.d.e.e0.b bVar = e.d.e.e0.b.NUMBER;
        if (g0 != bVar && g0 != e.d.e.e0.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + g0 + B());
        }
        t tVar = (t) o0();
        long longValue = tVar.a instanceof Number ? tVar.c().longValue() : Long.parseLong(tVar.d());
        p0();
        int i2 = this.s;
        if (i2 > 0) {
            int[] iArr = this.u;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return longValue;
    }

    @Override // e.d.e.e0.a
    public String Q() throws IOException {
        n0(e.d.e.e0.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) o0()).next();
        String str = (String) entry.getKey();
        this.t[this.s - 1] = str;
        q0(entry.getValue());
        return str;
    }

    @Override // e.d.e.e0.a
    public void a() throws IOException {
        n0(e.d.e.e0.b.BEGIN_ARRAY);
        q0(((e.d.e.l) o0()).iterator());
        this.u[this.s - 1] = 0;
    }

    @Override // e.d.e.e0.a
    public void a0() throws IOException {
        n0(e.d.e.e0.b.NULL);
        p0();
        int i2 = this.s;
        if (i2 > 0) {
            int[] iArr = this.u;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // e.d.e.e0.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.r = new Object[]{q};
        this.s = 1;
    }

    @Override // e.d.e.e0.a
    public String e0() throws IOException {
        e.d.e.e0.b g0 = g0();
        e.d.e.e0.b bVar = e.d.e.e0.b.STRING;
        if (g0 == bVar || g0 == e.d.e.e0.b.NUMBER) {
            String d2 = ((t) p0()).d();
            int i2 = this.s;
            if (i2 > 0) {
                int[] iArr = this.u;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return d2;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + g0 + B());
    }

    @Override // e.d.e.e0.a
    public void f() throws IOException {
        n0(e.d.e.e0.b.BEGIN_OBJECT);
        q0(new s.b.a((s.b) ((e.d.e.r) o0()).a.entrySet()));
    }

    @Override // e.d.e.e0.a
    public e.d.e.e0.b g0() throws IOException {
        if (this.s == 0) {
            return e.d.e.e0.b.END_DOCUMENT;
        }
        Object o0 = o0();
        if (o0 instanceof Iterator) {
            boolean z = this.r[this.s - 2] instanceof e.d.e.r;
            Iterator it = (Iterator) o0;
            if (!it.hasNext()) {
                return z ? e.d.e.e0.b.END_OBJECT : e.d.e.e0.b.END_ARRAY;
            } else if (z) {
                return e.d.e.e0.b.NAME;
            } else {
                q0(it.next());
                return g0();
            }
        } else if (o0 instanceof e.d.e.r) {
            return e.d.e.e0.b.BEGIN_OBJECT;
        } else {
            if (o0 instanceof e.d.e.l) {
                return e.d.e.e0.b.BEGIN_ARRAY;
            }
            if (!(o0 instanceof t)) {
                if (o0 instanceof e.d.e.q) {
                    return e.d.e.e0.b.NULL;
                }
                if (o0 == q) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
            Object obj = ((t) o0).a;
            if (obj instanceof String) {
                return e.d.e.e0.b.STRING;
            }
            if (obj instanceof Boolean) {
                return e.d.e.e0.b.BOOLEAN;
            }
            if (obj instanceof Number) {
                return e.d.e.e0.b.NUMBER;
            }
            throw new AssertionError();
        }
    }

    @Override // e.d.e.e0.a
    public void l0() throws IOException {
        if (g0() == e.d.e.e0.b.NAME) {
            Q();
            this.t[this.s - 2] = "null";
        } else {
            p0();
            int i2 = this.s;
            if (i2 > 0) {
                this.t[i2 - 1] = "null";
            }
        }
        int i3 = this.s;
        if (i3 > 0) {
            int[] iArr = this.u;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
        }
    }

    @Override // e.d.e.e0.a
    public void m() throws IOException {
        n0(e.d.e.e0.b.END_ARRAY);
        p0();
        p0();
        int i2 = this.s;
        if (i2 > 0) {
            int[] iArr = this.u;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public final void n0(e.d.e.e0.b bVar) throws IOException {
        if (g0() == bVar) {
            return;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + g0() + B());
    }

    public final Object o0() {
        return this.r[this.s - 1];
    }

    public final Object p0() {
        Object[] objArr = this.r;
        int i2 = this.s - 1;
        this.s = i2;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    public final void q0(Object obj) {
        int i2 = this.s;
        Object[] objArr = this.r;
        if (i2 == objArr.length) {
            int i3 = i2 * 2;
            this.r = Arrays.copyOf(objArr, i3);
            this.u = Arrays.copyOf(this.u, i3);
            this.t = (String[]) Arrays.copyOf(this.t, i3);
        }
        Object[] objArr2 = this.r;
        int i4 = this.s;
        this.s = i4 + 1;
        objArr2[i4] = obj;
    }

    @Override // e.d.e.e0.a
    public void r() throws IOException {
        n0(e.d.e.e0.b.END_OBJECT);
        p0();
        p0();
        int i2 = this.s;
        if (i2 > 0) {
            int[] iArr = this.u;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // e.d.e.e0.a
    public String toString() {
        return e.class.getSimpleName();
    }

    @Override // e.d.e.e0.a
    public String v() {
        StringBuilder sb = new StringBuilder();
        sb.append(CoreConstants.DOLLAR);
        int i2 = 0;
        while (i2 < this.s) {
            Object[] objArr = this.r;
            if (objArr[i2] instanceof e.d.e.l) {
                i2++;
                if (objArr[i2] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.u[i2]);
                    sb.append(']');
                }
            } else if (objArr[i2] instanceof e.d.e.r) {
                i2++;
                if (objArr[i2] instanceof Iterator) {
                    sb.append(CoreConstants.DOT);
                    String[] strArr = this.t;
                    if (strArr[i2] != null) {
                        sb.append(strArr[i2]);
                    }
                }
            }
            i2++;
        }
        return sb.toString();
    }

    @Override // e.d.e.e0.a
    public boolean y() throws IOException {
        e.d.e.e0.b g0 = g0();
        return (g0 == e.d.e.e0.b.END_OBJECT || g0 == e.d.e.e0.b.END_ARRAY) ? false : true;
    }
}
