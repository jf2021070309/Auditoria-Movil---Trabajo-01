package com.amazon.aps.iva.r0;

import com.amazon.aps.iva.gr.n;
import com.amazon.aps.iva.lb0.m;
import com.amazon.aps.iva.o0.o3;
import com.amazon.aps.iva.r0.b;
import java.util.Arrays;
import java.util.ListIterator;
/* compiled from: PersistentVector.kt */
/* loaded from: classes.dex */
public final class d<E> extends b<E> {
    public final Object[] b;
    public final Object[] c;
    public final int d;
    public final int e;

    public d(Object[] objArr, int i, int i2, Object[] objArr2) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(objArr, "root");
        com.amazon.aps.iva.yb0.j.f(objArr2, "tail");
        this.b = objArr;
        this.c = objArr2;
        this.d = i;
        this.e = i2;
        if (b() > 32) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + b()).toString());
    }

    public static Object[] q(int i, int i2, Object obj, Object[] objArr) {
        int i3 = (i2 >> i) & 31;
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        com.amazon.aps.iva.yb0.j.e(copyOf, "copyOf(this, newSize)");
        if (i == 0) {
            copyOf[i3] = obj;
        } else {
            Object obj2 = copyOf[i3];
            com.amazon.aps.iva.yb0.j.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf[i3] = q(i - 5, i2, obj, (Object[]) obj2);
        }
        return copyOf;
    }

    @Override // java.util.List, com.amazon.aps.iva.q0.c
    public final com.amazon.aps.iva.q0.c<E> add(int i, E e) {
        n.o(i, b());
        if (i == b()) {
            return add((d<E>) e);
        }
        int p = p();
        if (i >= p) {
            return g(e, this.b, i - p);
        }
        o3 o3Var = new o3((Object) null);
        return g(o3Var.a, e(this.b, this.e, i, e, o3Var), 0);
    }

    @Override // com.amazon.aps.iva.lb0.a
    public final int b() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.q0.c
    /* renamed from: d */
    public final e<E> a() {
        return new e<>(this, this.b, this.c, this.e);
    }

    public final Object[] e(Object[] objArr, int i, int i2, Object obj, o3 o3Var) {
        Object[] objArr2;
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            if (i3 == 0) {
                objArr2 = new Object[32];
            } else {
                Object[] copyOf = Arrays.copyOf(objArr, 32);
                com.amazon.aps.iva.yb0.j.e(copyOf, "copyOf(this, newSize)");
                objArr2 = copyOf;
            }
            m.F(objArr, i3 + 1, objArr2, i3, 31);
            o3Var.a = objArr[31];
            objArr2[i3] = obj;
            return objArr2;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        com.amazon.aps.iva.yb0.j.e(copyOf2, "copyOf(this, newSize)");
        int i4 = i - 5;
        Object obj2 = objArr[i3];
        com.amazon.aps.iva.yb0.j.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[i3] = e((Object[]) obj2, i4, i2, obj, o3Var);
        while (true) {
            i3++;
            if (i3 >= 32 || copyOf2[i3] == null) {
                break;
            }
            Object obj3 = objArr[i3];
            com.amazon.aps.iva.yb0.j.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf2[i3] = e((Object[]) obj3, i4, 0, o3Var.a, o3Var);
        }
        return copyOf2;
    }

    public final d g(Object obj, Object[] objArr, int i) {
        int p = p();
        int i2 = this.d;
        int i3 = i2 - p;
        Object[] objArr2 = this.c;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        com.amazon.aps.iva.yb0.j.e(copyOf, "copyOf(this, newSize)");
        if (i3 < 32) {
            m.F(objArr2, i + 1, copyOf, i, i3);
            copyOf[i] = obj;
            return new d(objArr, i2 + 1, this.e, copyOf);
        }
        Object obj2 = objArr2[31];
        m.F(objArr2, i + 1, copyOf, i, i3 - 1);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return k(objArr, copyOf, objArr3);
    }

    @Override // java.util.List
    public final E get(int i) {
        Object[] objArr;
        n.n(i, b());
        if (p() <= i) {
            objArr = this.c;
        } else {
            objArr = this.b;
            for (int i2 = this.e; i2 > 0; i2 -= 5) {
                Object obj = objArr[(i >> i2) & 31];
                com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return (E) objArr[i & 31];
    }

    @Override // com.amazon.aps.iva.q0.c
    public final com.amazon.aps.iva.q0.c i(b.a aVar) {
        e<E> a = a();
        a.O(aVar);
        return a.e();
    }

    public final Object[] j(Object[] objArr, int i, int i2, o3 o3Var) {
        Object[] j;
        int i3 = (i2 >> i) & 31;
        if (i == 5) {
            o3Var.a = objArr[i3];
            j = null;
        } else {
            Object obj = objArr[i3];
            com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            j = j((Object[]) obj, i - 5, i2, o3Var);
        }
        if (j == null && i3 == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        com.amazon.aps.iva.yb0.j.e(copyOf, "copyOf(this, newSize)");
        copyOf[i3] = j;
        return copyOf;
    }

    public final d<E> k(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.d;
        int i2 = i >> 5;
        int i3 = this.e;
        if (i2 > (1 << i3)) {
            Object[] objArr4 = new Object[32];
            objArr4[0] = objArr;
            int i4 = i3 + 5;
            return new d<>(l(objArr4, objArr2, i4), i + 1, i4, objArr3);
        }
        return new d<>(l(objArr, objArr2, i3), i + 1, i3, objArr3);
    }

    public final Object[] l(Object[] objArr, Object[] objArr2, int i) {
        Object[] objArr3;
        int b = ((b() - 1) >> i) & 31;
        if (objArr != null) {
            objArr3 = Arrays.copyOf(objArr, 32);
            com.amazon.aps.iva.yb0.j.e(objArr3, "copyOf(this, newSize)");
        } else {
            objArr3 = new Object[32];
        }
        if (i == 5) {
            objArr3[b] = objArr2;
        } else {
            objArr3[b] = l((Object[]) objArr3[b], objArr2, i - 5);
        }
        return objArr3;
    }

    @Override // com.amazon.aps.iva.lb0.c, java.util.List
    public final ListIterator<E> listIterator(int i) {
        n.o(i, b());
        return new f(this.b, i, this.c, b(), (this.e / 5) + 1);
    }

    @Override // com.amazon.aps.iva.q0.c
    public final com.amazon.aps.iva.q0.c<E> m(int i) {
        n.n(i, this.d);
        int p = p();
        Object[] objArr = this.b;
        int i2 = this.e;
        if (i >= p) {
            return o(objArr, p, i2, i - p);
        }
        return o(n(objArr, i2, i, new o3(this.c[0])), p, i2, 0);
    }

    public final Object[] n(Object[] objArr, int i, int i2, o3 o3Var) {
        Object[] copyOf;
        int i3 = 31;
        int i4 = (i2 >> i) & 31;
        if (i == 0) {
            if (i4 == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                com.amazon.aps.iva.yb0.j.e(copyOf, "copyOf(this, newSize)");
            }
            m.F(objArr, i4, copyOf, i4 + 1, 32);
            copyOf[31] = o3Var.a;
            o3Var.a = objArr[i4];
            return copyOf;
        }
        if (objArr[31] == null) {
            i3 = 31 & ((p() - 1) >> i);
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        com.amazon.aps.iva.yb0.j.e(copyOf2, "copyOf(this, newSize)");
        int i5 = i - 5;
        int i6 = i4 + 1;
        if (i6 <= i3) {
            while (true) {
                Object obj = copyOf2[i3];
                com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copyOf2[i3] = n((Object[]) obj, i5, 0, o3Var);
                if (i3 == i6) {
                    break;
                }
                i3--;
            }
        }
        Object obj2 = copyOf2[i4];
        com.amazon.aps.iva.yb0.j.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[i4] = n((Object[]) obj2, i5, i2, o3Var);
        return copyOf2;
    }

    public final b o(Object[] objArr, int i, int i2, int i3) {
        d dVar;
        int i4 = this.d - i;
        if (i4 == 1) {
            if (i2 == 0) {
                if (objArr.length == 33) {
                    objArr = Arrays.copyOf(objArr, 32);
                    com.amazon.aps.iva.yb0.j.e(objArr, "copyOf(this, newSize)");
                }
                return new i(objArr);
            }
            o3 o3Var = new o3((Object) null);
            Object[] j = j(objArr, i2, i - 1, o3Var);
            com.amazon.aps.iva.yb0.j.c(j);
            Object obj = o3Var.a;
            com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            Object[] objArr2 = (Object[]) obj;
            if (j[1] == null) {
                Object obj2 = j[0];
                com.amazon.aps.iva.yb0.j.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                dVar = new d((Object[]) obj2, i, i2 - 5, objArr2);
            } else {
                dVar = new d(j, i, i2, objArr2);
            }
            return dVar;
        }
        Object[] objArr3 = this.c;
        Object[] copyOf = Arrays.copyOf(objArr3, 32);
        com.amazon.aps.iva.yb0.j.e(copyOf, "copyOf(this, newSize)");
        int i5 = i4 - 1;
        if (i3 < i5) {
            m.F(objArr3, i3, copyOf, i3 + 1, i4);
        }
        copyOf[i5] = null;
        return new d(objArr, (i + i4) - 1, i2, copyOf);
    }

    public final int p() {
        return (b() - 1) & (-32);
    }

    @Override // com.amazon.aps.iva.lb0.c, java.util.List
    public final com.amazon.aps.iva.q0.c<E> set(int i, E e) {
        int i2 = this.d;
        n.n(i, i2);
        int p = p();
        Object[] objArr = this.c;
        Object[] objArr2 = this.b;
        int i3 = this.e;
        if (p <= i) {
            Object[] copyOf = Arrays.copyOf(objArr, 32);
            com.amazon.aps.iva.yb0.j.e(copyOf, "copyOf(this, newSize)");
            copyOf[i & 31] = e;
            return new d(objArr2, i2, i3, copyOf);
        }
        return new d(q(i3, i, e, objArr2), i2, i3, objArr);
    }

    @Override // java.util.Collection, java.util.List, com.amazon.aps.iva.q0.c
    public final com.amazon.aps.iva.q0.c<E> add(E e) {
        int p = p();
        int i = this.d;
        int i2 = i - p;
        Object[] objArr = this.c;
        Object[] objArr2 = this.b;
        if (i2 < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, 32);
            com.amazon.aps.iva.yb0.j.e(copyOf, "copyOf(this, newSize)");
            copyOf[i2] = e;
            return new d(objArr2, i + 1, this.e, copyOf);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = e;
        return k(objArr2, objArr, objArr3);
    }
}
