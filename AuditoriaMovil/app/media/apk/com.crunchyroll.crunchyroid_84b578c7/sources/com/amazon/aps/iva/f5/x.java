package com.amazon.aps.iva.f5;

import com.amazon.aps.iva.f5.e;
import com.amazon.aps.iva.f5.f;
/* compiled from: StaggeredGrid.java */
/* loaded from: classes.dex */
public abstract class x extends e {
    public final com.amazon.aps.iva.x.c<a> j = new com.amazon.aps.iva.x.c<>();
    public int k = -1;
    public Object l;
    public int m;

    /* compiled from: StaggeredGrid.java */
    /* loaded from: classes.dex */
    public static class a extends e.a {
        public int b;
        public int c;

        public a(int i, int i2) {
            super(i);
            this.b = i2;
            this.c = 0;
        }
    }

    @Override // com.amazon.aps.iva.f5.e
    public final boolean a(int i, boolean z) {
        Object[] objArr = this.a;
        if (((f.b) this.b).c() == 0) {
            return false;
        }
        if (!z && b(i)) {
            return false;
        }
        try {
            if (n(i, z)) {
                objArr[0] = null;
                this.l = null;
                return true;
            }
            return p(i, z);
        } finally {
            objArr[0] = null;
            this.l = null;
        }
    }

    @Override // com.amazon.aps.iva.f5.e
    public final com.amazon.aps.iva.x.d[] i(int i, int i2) {
        for (int i3 = 0; i3 < this.e; i3++) {
            com.amazon.aps.iva.x.d dVar = this.h[i3];
            dVar.c = dVar.b;
        }
        if (i >= 0) {
            while (i <= i2) {
                com.amazon.aps.iva.x.d dVar2 = this.h[j(i).a];
                int i4 = dVar2.c;
                int i5 = dVar2.b;
                int i6 = dVar2.d;
                if (((i4 - i5) & i6) > 0) {
                    if (i5 != i4) {
                        int i7 = i6 & (i4 - 1);
                        if (((int[]) dVar2.e)[i7] == i - 1) {
                            if (i5 != i4) {
                                dVar2.c = i7;
                                dVar2.a(i);
                                i++;
                            } else {
                                throw new ArrayIndexOutOfBoundsException();
                            }
                        }
                    } else {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                }
                dVar2.a(i);
                dVar2.a(i);
                i++;
            }
        }
        return this.h;
    }

    @Override // com.amazon.aps.iva.f5.e
    public final void k(int i) {
        super.k(i);
        com.amazon.aps.iva.x.c<a> cVar = this.j;
        cVar.b((q() - i) + 1);
        if (cVar.d() == 0) {
            this.k = -1;
        }
    }

    @Override // com.amazon.aps.iva.f5.e
    public final boolean l(int i, boolean z) {
        Object[] objArr = this.a;
        if (((f.b) this.b).c() == 0) {
            return false;
        }
        if (!z && c(i)) {
            return false;
        }
        try {
            if (s(i, z)) {
                objArr[0] = null;
                this.l = null;
                return true;
            }
            return u(i, z);
        } finally {
            objArr[0] = null;
            this.l = null;
        }
    }

    public final boolean n(int i, boolean z) {
        int i2;
        int i3;
        int i4;
        com.amazon.aps.iva.x.c<a> cVar = this.j;
        if (cVar.d() == 0) {
            return false;
        }
        int c = ((f.b) this.b).c();
        int i5 = this.g;
        if (i5 >= 0) {
            i2 = i5 + 1;
            i3 = ((f.b) this.b).d(i5);
        } else {
            int i6 = this.i;
            if (i6 != -1) {
                i2 = i6;
            } else {
                i2 = 0;
            }
            if (i2 <= q() + 1 && i2 >= this.k) {
                if (i2 > q()) {
                    return false;
                }
                i3 = Integer.MAX_VALUE;
            } else {
                cVar.c(cVar.d());
                return false;
            }
        }
        int q = q();
        int i7 = i2;
        while (i7 < c && i7 <= q) {
            a j = j(i7);
            if (i3 != Integer.MAX_VALUE) {
                i3 += j.b;
            }
            int i8 = j.a;
            Object[] objArr = this.a;
            int b = ((f.b) this.b).b(i7, true, objArr, false);
            if (b != j.c) {
                j.c = b;
                cVar.b(q - i7);
                i4 = i7;
            } else {
                i4 = q;
            }
            this.g = i7;
            if (this.f < 0) {
                this.f = i7;
            }
            ((f.b) this.b).a(objArr[0], i7, b, i8, i3);
            if (!z && b(i)) {
                return true;
            }
            if (i3 == Integer.MAX_VALUE) {
                i3 = ((f.b) this.b).d(i7);
            }
            if (i8 == this.e - 1 && z) {
                return true;
            }
            i7++;
            q = i4;
        }
        return false;
    }

    public final int o(int i, int i2, int i3) {
        int d;
        boolean z;
        int i4 = this.g;
        if (i4 >= 0 && (i4 != q() || this.g != i - 1)) {
            throw new IllegalStateException();
        }
        int i5 = this.g;
        com.amazon.aps.iva.x.c<a> cVar = this.j;
        if (i5 < 0) {
            if (cVar.d() > 0 && i == q() + 1) {
                int q = q();
                while (true) {
                    if (q >= this.k) {
                        if (j(q).a == i2) {
                            z = true;
                            break;
                        }
                        q--;
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    q = q();
                }
                if (this.c) {
                    d = (-j(q).c) - this.d;
                } else {
                    d = j(q).c + this.d;
                }
                for (int i6 = q + 1; i6 <= q(); i6++) {
                    d -= j(i6).b;
                }
            } else {
                d = 0;
            }
        } else {
            d = i3 - ((f.b) this.b).d(i5);
        }
        a aVar = new a(i2, d);
        a[] aVarArr = cVar.a;
        int i7 = cVar.c;
        aVarArr[i7] = aVar;
        int i8 = cVar.d & (i7 + 1);
        cVar.c = i8;
        if (i8 == cVar.b) {
            cVar.a();
        }
        Object obj = this.l;
        if (obj != null) {
            aVar.c = this.m;
            this.l = null;
        } else {
            Object[] objArr = this.a;
            aVar.c = ((f.b) this.b).b(i, true, objArr, false);
            obj = objArr[0];
        }
        Object obj2 = obj;
        if (cVar.d() == 1) {
            this.g = i;
            this.f = i;
            this.k = i;
        } else {
            int i9 = this.g;
            if (i9 < 0) {
                this.g = i;
                this.f = i;
            } else {
                this.g = i9 + 1;
            }
        }
        ((f.b) this.b).a(obj2, i, aVar.c, i2, i3);
        return aVar.c;
    }

    public abstract boolean p(int i, boolean z);

    public final int q() {
        return (this.j.d() + this.k) - 1;
    }

    @Override // com.amazon.aps.iva.f5.e
    /* renamed from: r */
    public final a j(int i) {
        int i2 = i - this.k;
        if (i2 >= 0) {
            com.amazon.aps.iva.x.c<a> cVar = this.j;
            if (i2 < cVar.d()) {
                if (i2 >= 0) {
                    if (i2 < cVar.d()) {
                        return cVar.a[cVar.d & (cVar.b + i2)];
                    }
                } else {
                    cVar.getClass();
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            return null;
        }
        return null;
    }

    public final boolean s(int i, boolean z) {
        int i2;
        int i3;
        int i4;
        com.amazon.aps.iva.x.c<a> cVar = this.j;
        if (cVar.d() == 0) {
            return false;
        }
        int i5 = this.f;
        if (i5 >= 0) {
            i3 = ((f.b) this.b).d(i5);
            i4 = j(this.f).b;
            i2 = this.f - 1;
        } else {
            int i6 = this.i;
            if (i6 != -1) {
                i2 = i6;
            } else {
                i2 = 0;
            }
            if (i2 <= q()) {
                int i7 = this.k;
                if (i2 >= i7 - 1) {
                    if (i2 < i7) {
                        return false;
                    }
                    i3 = Integer.MAX_VALUE;
                    i4 = 0;
                }
            }
            cVar.c(cVar.d());
            return false;
        }
        int max = Math.max(f.this.f, this.k);
        while (i2 >= max) {
            a j = j(i2);
            int i8 = j.a;
            Object[] objArr = this.a;
            int b = ((f.b) this.b).b(i2, false, objArr, false);
            if (b != j.c) {
                cVar.c((i2 + 1) - this.k);
                this.k = this.f;
                this.l = objArr[0];
                this.m = b;
                return false;
            }
            this.f = i2;
            if (this.g < 0) {
                this.g = i2;
            }
            ((f.b) this.b).a(objArr[0], i2, b, i8, i3 - i4);
            if (!z && c(i)) {
                return true;
            }
            i3 = ((f.b) this.b).d(i2);
            i4 = j.b;
            if (i8 == 0 && z) {
                return true;
            }
            i2--;
        }
        return false;
    }

    public final int t(int i, int i2, int i3) {
        a aVar;
        int i4;
        int i5 = this.f;
        if (i5 >= 0 && (i5 != this.k || i5 != i + 1)) {
            throw new IllegalStateException();
        }
        int i6 = this.k;
        if (i6 >= 0) {
            aVar = j(i6);
        } else {
            aVar = null;
        }
        int d = ((f.b) this.b).d(this.k);
        a aVar2 = new a(i2, 0);
        com.amazon.aps.iva.x.c<a> cVar = this.j;
        int i7 = (cVar.b - 1) & cVar.d;
        cVar.b = i7;
        cVar.a[i7] = aVar2;
        if (i7 == cVar.c) {
            cVar.a();
        }
        Object obj = this.l;
        if (obj != null) {
            aVar2.c = this.m;
            this.l = null;
        } else {
            Object[] objArr = this.a;
            aVar2.c = ((f.b) this.b).b(i, false, objArr, false);
            obj = objArr[0];
        }
        Object obj2 = obj;
        this.f = i;
        this.k = i;
        if (this.g < 0) {
            this.g = i;
        }
        if (!this.c) {
            i4 = i3 - aVar2.c;
        } else {
            i4 = i3 + aVar2.c;
        }
        int i8 = i4;
        if (aVar != null) {
            aVar.b = d - i8;
        }
        ((f.b) this.b).a(obj2, i, aVar2.c, i2, i8);
        return aVar2.c;
    }

    public abstract boolean u(int i, boolean z);
}
