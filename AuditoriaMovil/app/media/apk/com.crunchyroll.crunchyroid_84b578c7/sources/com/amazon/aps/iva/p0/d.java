package com.amazon.aps.iva.p0;

import com.amazon.aps.iva.lb0.m;
import com.amazon.aps.iva.yb0.j;
import java.util.Arrays;
/* compiled from: IdentityScopeMap.kt */
/* loaded from: classes.dex */
public final class d<T> {
    public int[] a;
    public Object[] b;
    public c<T>[] c;
    public int d;

    public d() {
        int[] iArr = new int[50];
        for (int i = 0; i < 50; i++) {
            iArr[i] = i;
        }
        this.a = iArr;
        this.b = new Object[50];
        this.c = new c[50];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Object obj, Object obj2) {
        int i;
        c<T> cVar;
        j.f(obj, "value");
        j.f(obj2, "scope");
        int i2 = this.d;
        int[] iArr = this.a;
        Object[] objArr = this.b;
        c<T>[] cVarArr = this.c;
        if (i2 > 0) {
            i = d(obj);
            if (i >= 0) {
                cVar = g(i);
                cVar.add(obj2);
            }
        } else {
            i = -1;
        }
        int i3 = -(i + 1);
        if (i2 < iArr.length) {
            int i4 = iArr[i2];
            objArr[i4] = obj;
            cVar = cVarArr[i4];
            if (cVar == null) {
                cVar = new c<>();
                cVarArr[i4] = cVar;
            }
            if (i3 < i2) {
                m.C(i3 + 1, i3, iArr, iArr, i2);
            }
            iArr[i3] = i4;
            this.d++;
        } else {
            int length = iArr.length * 2;
            Object[] copyOf = Arrays.copyOf(cVarArr, length);
            j.e(copyOf, "copyOf(this, newSize)");
            c<T>[] cVarArr2 = (c[]) copyOf;
            c<T> cVar2 = new c<>();
            cVarArr2[i2] = cVar2;
            Object[] copyOf2 = Arrays.copyOf(objArr, length);
            j.e(copyOf2, "copyOf(this, newSize)");
            copyOf2[i2] = obj;
            int[] iArr2 = new int[length];
            for (int i5 = i2 + 1; i5 < length; i5++) {
                iArr2[i5] = i5;
            }
            if (i3 < i2) {
                m.C(i3 + 1, i3, iArr, iArr2, i2);
            }
            iArr2[i3] = i2;
            if (i3 > 0) {
                m.G(iArr, iArr2, i3, 6);
            }
            this.c = cVarArr2;
            this.b = copyOf2;
            this.a = iArr2;
            this.d++;
            cVar = cVar2;
        }
        cVar.add(obj2);
    }

    public final void b() {
        c<T>[] cVarArr = this.c;
        int[] iArr = this.a;
        Object[] objArr = this.b;
        int length = cVarArr.length;
        for (int i = 0; i < length; i++) {
            c<T> cVar = cVarArr[i];
            if (cVar != null) {
                cVar.clear();
            }
            iArr[i] = i;
            objArr[i] = null;
        }
        this.d = 0;
    }

    public final boolean c(Object obj) {
        j.f(obj, "element");
        if (d(obj) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
        return -(r5 + 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = java.lang.System.identityHashCode(r9)
            int r1 = r8.d
            int r1 = r1 + (-1)
            java.lang.Object[] r2 = r8.b
            int[] r3 = r8.a
            r4 = 0
        Ld:
            if (r4 > r1) goto L60
            int r5 = r4 + r1
            int r5 = r5 >>> 1
            r6 = r3[r5]
            r6 = r2[r6]
            int r7 = java.lang.System.identityHashCode(r6)
            if (r7 >= r0) goto L20
            int r4 = r5 + 1
            goto Ld
        L20:
            if (r7 <= r0) goto L25
            int r1 = r5 + (-1)
            goto Ld
        L25:
            if (r9 != r6) goto L28
            return r5
        L28:
            java.lang.Object[] r1 = r8.b
            int[] r2 = r8.a
            int r3 = r5 + (-1)
        L2e:
            r4 = -1
            if (r4 >= r3) goto L42
            r4 = r2[r3]
            r4 = r1[r4]
            if (r4 != r9) goto L38
            goto L5f
        L38:
            int r4 = java.lang.System.identityHashCode(r4)
            if (r4 == r0) goto L3f
            goto L42
        L3f:
            int r3 = r3 + (-1)
            goto L2e
        L42:
            int r5 = r5 + 1
            int r3 = r8.d
        L46:
            if (r5 >= r3) goto L5a
            r4 = r2[r5]
            r4 = r1[r4]
            if (r4 != r9) goto L50
            r3 = r5
            goto L5f
        L50:
            int r4 = java.lang.System.identityHashCode(r4)
            if (r4 == r0) goto L57
            goto L5c
        L57:
            int r5 = r5 + 1
            goto L46
        L5a:
            int r5 = r8.d
        L5c:
            int r5 = r5 + 1
            int r3 = -r5
        L5f:
            return r3
        L60:
            int r4 = r4 + 1
            int r9 = -r4
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.p0.d.d(java.lang.Object):int");
    }

    public final boolean e(Object obj, T t) {
        int i;
        c<T> cVar;
        j.f(obj, "value");
        int d = d(obj);
        int[] iArr = this.a;
        c<T>[] cVarArr = this.c;
        Object[] objArr = this.b;
        int i2 = this.d;
        if (d < 0 || (cVar = cVarArr[(i = iArr[d])]) == null) {
            return false;
        }
        boolean remove = cVar.remove(t);
        if (cVar.b == 0) {
            int i3 = d + 1;
            if (i3 < i2) {
                m.C(d, i3, iArr, iArr, i2);
            }
            int i4 = i2 - 1;
            iArr[i4] = i;
            objArr[i] = null;
            this.d = i4;
        }
        return remove;
    }

    public final void f(T t) {
        j.f(t, "scope");
        int[] iArr = this.a;
        c<T>[] cVarArr = this.c;
        Object[] objArr = this.b;
        int i = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = iArr[i3];
            c<T> cVar = cVarArr[i4];
            j.c(cVar);
            cVar.remove(t);
            if (cVar.b > 0) {
                if (i2 != i3) {
                    int i5 = iArr[i2];
                    iArr[i2] = i4;
                    iArr[i3] = i5;
                }
                i2++;
            }
        }
        int i6 = this.d;
        for (int i7 = i2; i7 < i6; i7++) {
            objArr[iArr[i7]] = null;
        }
        this.d = i2;
    }

    public final c<T> g(int i) {
        c<T> cVar = this.c[this.a[i]];
        j.c(cVar);
        return cVar;
    }
}
