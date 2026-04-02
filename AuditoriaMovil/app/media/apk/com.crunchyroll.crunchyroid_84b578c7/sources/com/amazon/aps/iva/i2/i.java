package com.amazon.aps.iva.i2;
/* compiled from: EditingBuffer.kt */
/* loaded from: classes.dex */
public final class i {
    public final r a;
    public int b;
    public int c;
    public int d;
    public int e;

    public i(com.amazon.aps.iva.c2.b bVar, long j) {
        com.amazon.aps.iva.yb0.j.f(bVar, "text");
        this.a = new r(bVar.b);
        this.b = com.amazon.aps.iva.c2.z.e(j);
        this.c = com.amazon.aps.iva.c2.z.d(j);
        this.d = -1;
        this.e = -1;
        int e = com.amazon.aps.iva.c2.z.e(j);
        int d = com.amazon.aps.iva.c2.z.d(j);
        if (e >= 0 && e <= bVar.length()) {
            if (d >= 0 && d <= bVar.length()) {
                if (e <= d) {
                    return;
                }
                throw new IllegalArgumentException(com.amazon.aps.iva.j0.j0.e("Do not set reversed range: ", e, " > ", d));
            }
            StringBuilder d2 = com.amazon.aps.iva.e4.e.d("end (", d, ") offset is outside of text region ");
            d2.append(bVar.length());
            throw new IndexOutOfBoundsException(d2.toString());
        }
        StringBuilder d3 = com.amazon.aps.iva.e4.e.d("start (", e, ") offset is outside of text region ");
        d3.append(bVar.length());
        throw new IndexOutOfBoundsException(d3.toString());
    }

    public final void a(int i, int i2) {
        boolean z;
        long f = com.amazon.aps.iva.ab.x.f(i, i2);
        this.a.b(i, i2, "");
        long S = com.amazon.aps.iva.e.z.S(com.amazon.aps.iva.ab.x.f(this.b, this.c), f);
        i(com.amazon.aps.iva.c2.z.e(S));
        h(com.amazon.aps.iva.c2.z.d(S));
        int i3 = this.d;
        if (i3 != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long S2 = com.amazon.aps.iva.e.z.S(com.amazon.aps.iva.ab.x.f(i3, this.e), f);
            if (com.amazon.aps.iva.c2.z.b(S2)) {
                this.d = -1;
                this.e = -1;
                return;
            }
            this.d = com.amazon.aps.iva.c2.z.e(S2);
            this.e = com.amazon.aps.iva.c2.z.d(S2);
        }
    }

    public final char b(int i) {
        r rVar = this.a;
        com.amazon.aps.iva.x.d dVar = rVar.b;
        if (dVar == null) {
            return rVar.a.charAt(i);
        }
        int i2 = rVar.c;
        if (i < i2) {
            return rVar.a.charAt(i);
        }
        int i3 = dVar.b;
        int i4 = dVar.d;
        int i5 = dVar.c;
        int i6 = i3 - (i4 - i5);
        if (i < i6 + i2) {
            int i7 = i - i2;
            if (i7 < i5) {
                return ((char[]) dVar.e)[i7];
            }
            return ((char[]) dVar.e)[(i7 - i5) + i4];
        }
        return rVar.a.charAt(i - ((i6 - rVar.d) + i2));
    }

    public final com.amazon.aps.iva.c2.z c() {
        boolean z;
        int i = this.d;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new com.amazon.aps.iva.c2.z(com.amazon.aps.iva.ab.x.f(i, this.e));
        }
        return null;
    }

    public final int d() {
        return this.a.a();
    }

    public final void e(int i, int i2, String str) {
        com.amazon.aps.iva.yb0.j.f(str, "text");
        r rVar = this.a;
        if (i >= 0 && i <= rVar.a()) {
            if (i2 >= 0 && i2 <= rVar.a()) {
                if (i <= i2) {
                    rVar.b(i, i2, str);
                    i(str.length() + i);
                    h(str.length() + i);
                    this.d = -1;
                    this.e = -1;
                    return;
                }
                throw new IllegalArgumentException(com.amazon.aps.iva.j0.j0.e("Do not set reversed range: ", i, " > ", i2));
            }
            StringBuilder d = com.amazon.aps.iva.e4.e.d("end (", i2, ") offset is outside of text region ");
            d.append(rVar.a());
            throw new IndexOutOfBoundsException(d.toString());
        }
        StringBuilder d2 = com.amazon.aps.iva.e4.e.d("start (", i, ") offset is outside of text region ");
        d2.append(rVar.a());
        throw new IndexOutOfBoundsException(d2.toString());
    }

    public final void f(int i, int i2) {
        r rVar = this.a;
        if (i >= 0 && i <= rVar.a()) {
            if (i2 >= 0 && i2 <= rVar.a()) {
                if (i < i2) {
                    this.d = i;
                    this.e = i2;
                    return;
                }
                throw new IllegalArgumentException(com.amazon.aps.iva.j0.j0.e("Do not set reversed or empty range: ", i, " > ", i2));
            }
            StringBuilder d = com.amazon.aps.iva.e4.e.d("end (", i2, ") offset is outside of text region ");
            d.append(rVar.a());
            throw new IndexOutOfBoundsException(d.toString());
        }
        StringBuilder d2 = com.amazon.aps.iva.e4.e.d("start (", i, ") offset is outside of text region ");
        d2.append(rVar.a());
        throw new IndexOutOfBoundsException(d2.toString());
    }

    public final void g(int i, int i2) {
        r rVar = this.a;
        if (i >= 0 && i <= rVar.a()) {
            if (i2 >= 0 && i2 <= rVar.a()) {
                if (i <= i2) {
                    i(i);
                    h(i2);
                    return;
                }
                throw new IllegalArgumentException(com.amazon.aps.iva.j0.j0.e("Do not set reversed range: ", i, " > ", i2));
            }
            StringBuilder d = com.amazon.aps.iva.e4.e.d("end (", i2, ") offset is outside of text region ");
            d.append(rVar.a());
            throw new IndexOutOfBoundsException(d.toString());
        }
        StringBuilder d2 = com.amazon.aps.iva.e4.e.d("start (", i, ") offset is outside of text region ");
        d2.append(rVar.a());
        throw new IndexOutOfBoundsException(d2.toString());
    }

    public final void h(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.c = i;
            return;
        }
        throw new IllegalArgumentException(com.amazon.aps.iva.q.c0.a("Cannot set selectionEnd to a negative value: ", i).toString());
    }

    public final void i(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.b = i;
            return;
        }
        throw new IllegalArgumentException(com.amazon.aps.iva.q.c0.a("Cannot set selectionStart to a negative value: ", i).toString());
    }

    public final String toString() {
        return this.a.toString();
    }
}
