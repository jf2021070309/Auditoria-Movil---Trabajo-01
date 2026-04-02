package com.amazon.aps.iva.s0;

import java.util.Arrays;
/* compiled from: TrieNode.kt */
/* loaded from: classes.dex */
public final class t<K, V> {
    public static final t e = new t(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final com.amazon.aps.iva.u0.b c;
    public Object[] d;

    /* compiled from: TrieNode.kt */
    /* loaded from: classes.dex */
    public static final class a<K, V> {
        public t<K, V> a;
        public final int b;

        public a(t<K, V> tVar, int i) {
            com.amazon.aps.iva.yb0.j.f(tVar, "node");
            this.a = tVar;
            this.b = i;
        }
    }

    public t(int i, int i2, Object[] objArr, com.amazon.aps.iva.u0.b bVar) {
        this.a = i;
        this.b = i2;
        this.c = bVar;
        this.d = objArr;
    }

    public static t j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, com.amazon.aps.iva.u0.b bVar) {
        Object[] objArr;
        if (i3 > 30) {
            return new t(0, 0, new Object[]{obj, obj2, obj3, obj4}, bVar);
        }
        int i4 = (i >> i3) & 31;
        int i5 = (i2 >> i3) & 31;
        if (i4 != i5) {
            if (i4 < i5) {
                objArr = new Object[]{obj, obj2, obj3, obj4};
            } else {
                objArr = new Object[]{obj3, obj4, obj, obj2};
            }
            return new t((1 << i4) | (1 << i5), 0, objArr, bVar);
        }
        return new t(0, 1 << i4, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, bVar)}, bVar);
    }

    public final Object[] a(int i, int i2, int i3, K k, V v, int i4, com.amazon.aps.iva.u0.b bVar) {
        int i5;
        Object obj = this.d[i];
        if (obj != null) {
            i5 = obj.hashCode();
        } else {
            i5 = 0;
        }
        t j = j(i5, obj, x(i), i3, k, v, i4 + 5, bVar);
        int t = t(i2) + 1;
        Object[] objArr = this.d;
        int i6 = t - 2;
        Object[] objArr2 = new Object[(objArr.length - 2) + 1];
        com.amazon.aps.iva.lb0.m.H(objArr, objArr2, 0, 0, i, 6);
        com.amazon.aps.iva.lb0.m.F(objArr, i, objArr2, i + 2, t);
        objArr2[i6] = j;
        com.amazon.aps.iva.lb0.m.F(objArr, i6 + 1, objArr2, t, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int bitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += s(i).b();
        }
        return bitCount;
    }

    public final boolean c(K k) {
        com.amazon.aps.iva.ec0.h O = com.amazon.aps.iva.aq.j.O(com.amazon.aps.iva.aq.j.T(0, this.d.length), 2);
        int i = O.b;
        int i2 = O.c;
        int i3 = O.d;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!com.amazon.aps.iva.yb0.j.a(k, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d(int i, int i2, Object obj) {
        int i3 = 1 << ((i >> i2) & 31);
        if (h(i3)) {
            return com.amazon.aps.iva.yb0.j.a(obj, this.d[f(i3)]);
        } else if (i(i3)) {
            t<K, V> s = s(t(i3));
            if (i2 == 30) {
                return s.c(obj);
            }
            return s.d(i, i2 + 5, obj);
        } else {
            return false;
        }
    }

    public final boolean e(t<K, V> tVar) {
        if (this == tVar) {
            return true;
        }
        if (this.b != tVar.b || this.a != tVar.a) {
            return false;
        }
        int length = this.d.length;
        for (int i = 0; i < length; i++) {
            if (this.d[i] != tVar.d[i]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i) {
        return Integer.bitCount((i - 1) & this.a) * 2;
    }

    public final Object g(int i, int i2, Object obj) {
        int i3 = 1 << ((i >> i2) & 31);
        if (h(i3)) {
            int f = f(i3);
            if (!com.amazon.aps.iva.yb0.j.a(obj, this.d[f])) {
                return null;
            }
            return x(f);
        } else if (!i(i3)) {
            return null;
        } else {
            t<K, V> s = s(t(i3));
            if (i2 == 30) {
                com.amazon.aps.iva.ec0.h O = com.amazon.aps.iva.aq.j.O(com.amazon.aps.iva.aq.j.T(0, s.d.length), 2);
                int i4 = O.b;
                int i5 = O.c;
                int i6 = O.d;
                if ((i6 <= 0 || i4 > i5) && (i6 >= 0 || i5 > i4)) {
                    return null;
                }
                while (!com.amazon.aps.iva.yb0.j.a(obj, s.d[i4])) {
                    if (i4 == i5) {
                        return null;
                    }
                    i4 += i6;
                }
                return s.x(i4);
            }
            return s.g(i, i2 + 5, obj);
        }
    }

    public final boolean h(int i) {
        if ((i & this.a) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i(int i) {
        if ((i & this.b) != 0) {
            return true;
        }
        return false;
    }

    public final t<K, V> k(int i, f<K, V> fVar) {
        fVar.getClass();
        fVar.c(fVar.g - 1);
        fVar.e = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c == fVar.c) {
            this.d = com.amazon.aps.iva.e.w.i(objArr, i);
            return this;
        }
        return new t<>(0, 0, com.amazon.aps.iva.e.w.i(objArr, i), fVar.c);
    }

    public final t<K, V> l(int i, K k, V v, int i2, f<K, V> fVar) {
        t<K, V> l;
        com.amazon.aps.iva.yb0.j.f(fVar, "mutator");
        int i3 = 1 << ((i >> i2) & 31);
        boolean h = h(i3);
        com.amazon.aps.iva.u0.b bVar = this.c;
        if (h) {
            int f = f(i3);
            if (com.amazon.aps.iva.yb0.j.a(k, this.d[f])) {
                fVar.e = x(f);
                if (x(f) == v) {
                    return this;
                }
                if (bVar == fVar.c) {
                    this.d[f + 1] = v;
                    return this;
                }
                fVar.f++;
                Object[] objArr = this.d;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                com.amazon.aps.iva.yb0.j.e(copyOf, "copyOf(this, size)");
                copyOf[f + 1] = v;
                return new t<>(this.a, this.b, copyOf, fVar.c);
            }
            fVar.c(fVar.g + 1);
            com.amazon.aps.iva.u0.b bVar2 = fVar.c;
            if (bVar == bVar2) {
                this.d = a(f, i3, i, k, v, i2, bVar2);
                this.a ^= i3;
                this.b |= i3;
                return this;
            }
            return new t<>(this.a ^ i3, this.b | i3, a(f, i3, i, k, v, i2, bVar2), bVar2);
        } else if (i(i3)) {
            int t = t(i3);
            t<K, V> s = s(t);
            if (i2 == 30) {
                com.amazon.aps.iva.ec0.h O = com.amazon.aps.iva.aq.j.O(com.amazon.aps.iva.aq.j.T(0, s.d.length), 2);
                int i4 = O.b;
                int i5 = O.c;
                int i6 = O.d;
                if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                    while (!com.amazon.aps.iva.yb0.j.a(k, s.d[i4])) {
                        if (i4 != i5) {
                            i4 += i6;
                        }
                    }
                    fVar.e = s.x(i4);
                    if (s.c == fVar.c) {
                        s.d[i4 + 1] = v;
                        l = s;
                    } else {
                        fVar.f++;
                        Object[] objArr2 = s.d;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        com.amazon.aps.iva.yb0.j.e(copyOf2, "copyOf(this, size)");
                        copyOf2[i4 + 1] = v;
                        l = new t<>(0, 0, copyOf2, fVar.c);
                    }
                }
                fVar.c(fVar.g + 1);
                l = new t<>(0, 0, com.amazon.aps.iva.e.w.g(s.d, 0, k, v), fVar.c);
                break;
            }
            l = s.l(i, k, v, i2 + 5, fVar);
            if (s == l) {
                return this;
            }
            return r(t, l, fVar.c);
        } else {
            fVar.c(fVar.g + 1);
            com.amazon.aps.iva.u0.b bVar3 = fVar.c;
            int f2 = f(i3);
            if (bVar == bVar3) {
                this.d = com.amazon.aps.iva.e.w.g(this.d, f2, k, v);
                this.a |= i3;
                return this;
            }
            return new t<>(this.a | i3, this.b, com.amazon.aps.iva.e.w.g(this.d, f2, k, v), bVar3);
        }
    }

    public final t<K, V> m(t<K, V> tVar, int i, com.amazon.aps.iva.u0.a aVar, f<K, V> fVar) {
        boolean z;
        t<K, V> tVar2;
        Object[] objArr;
        int i2;
        int i3;
        int i4;
        t<K, V> j;
        int i5;
        int i6;
        int i7;
        int i8;
        com.amazon.aps.iva.yb0.j.f(fVar, "mutator");
        if (this == tVar) {
            aVar.a += b();
            return this;
        }
        int i9 = 0;
        if (i > 30) {
            com.amazon.aps.iva.u0.b bVar = fVar.c;
            Object[] objArr2 = this.d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + tVar.d.length);
            com.amazon.aps.iva.yb0.j.e(copyOf, "copyOf(this, newSize)");
            int length = this.d.length;
            com.amazon.aps.iva.ec0.h O = com.amazon.aps.iva.aq.j.O(com.amazon.aps.iva.aq.j.T(0, tVar.d.length), 2);
            int i10 = O.b;
            int i11 = O.c;
            int i12 = O.d;
            if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
                while (true) {
                    if (!c((K) tVar.d[i10])) {
                        Object[] objArr3 = tVar.d;
                        copyOf[length] = objArr3[i10];
                        copyOf[length + 1] = objArr3[i10 + 1];
                        length += 2;
                    } else {
                        aVar.a++;
                    }
                    if (i10 == i11) {
                        break;
                    }
                    i10 += i12;
                }
            }
            if (length == this.d.length) {
                return this;
            }
            if (length == tVar.d.length) {
                return tVar;
            }
            if (length == copyOf.length) {
                return new t<>(0, 0, copyOf, bVar);
            }
            Object[] copyOf2 = Arrays.copyOf(copyOf, length);
            com.amazon.aps.iva.yb0.j.e(copyOf2, "copyOf(this, newSize)");
            return new t<>(0, 0, copyOf2, bVar);
        }
        int i13 = this.b | tVar.b;
        int i14 = this.a;
        int i15 = tVar.a;
        int i16 = i14 & i15;
        int i17 = (i14 ^ i15) & (~i13);
        while (i16 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i16);
            if (com.amazon.aps.iva.yb0.j.a(this.d[f(lowestOneBit)], tVar.d[tVar.f(lowestOneBit)])) {
                i17 |= lowestOneBit;
            } else {
                i13 |= lowestOneBit;
            }
            i16 ^= lowestOneBit;
        }
        if ((i13 & i17) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (com.amazon.aps.iva.yb0.j.a(this.c, fVar.c) && this.a == i17 && this.b == i13) {
                tVar2 = this;
            } else {
                tVar2 = new t<>(i17, i13, new Object[Integer.bitCount(i13) + (Integer.bitCount(i17) * 2)], null);
            }
            int i18 = i13;
            int i19 = 0;
            while (i18 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i18);
                Object[] objArr4 = tVar2.d;
                int length2 = (objArr4.length - 1) - i19;
                if (i(lowestOneBit2)) {
                    j = s(t(lowestOneBit2));
                    if (tVar.i(lowestOneBit2)) {
                        j = j.m(tVar.s(tVar.t(lowestOneBit2)), i + 5, aVar, fVar);
                    } else if (tVar.h(lowestOneBit2)) {
                        int f = tVar.f(lowestOneBit2);
                        K k = (K) tVar.d[f];
                        V x = tVar.x(f);
                        int i20 = fVar.g;
                        if (k != null) {
                            i7 = k.hashCode();
                        } else {
                            i7 = i9;
                        }
                        int i21 = i7;
                        objArr = objArr4;
                        i8 = lowestOneBit2;
                        j = j.l(i21, k, x, i + 5, fVar);
                        if (fVar.g == i20) {
                            aVar.a++;
                        }
                        i2 = i8;
                    }
                    objArr = objArr4;
                    i8 = lowestOneBit2;
                    i2 = i8;
                } else {
                    objArr = objArr4;
                    i2 = lowestOneBit2;
                    if (tVar.i(i2)) {
                        j = tVar.s(tVar.t(i2));
                        if (h(i2)) {
                            int f2 = f(i2);
                            K k2 = (K) this.d[f2];
                            if (k2 != null) {
                                i5 = k2.hashCode();
                            } else {
                                i5 = 0;
                            }
                            int i22 = i + 5;
                            if (j.d(i5, i22, k2)) {
                                aVar.a++;
                            } else {
                                V x2 = x(f2);
                                if (k2 != null) {
                                    i6 = k2.hashCode();
                                } else {
                                    i6 = 0;
                                }
                                j = j.l(i6, k2, x2, i22, fVar);
                            }
                        }
                    } else {
                        int f3 = f(i2);
                        Object obj = this.d[f3];
                        V x3 = x(f3);
                        int f4 = tVar.f(i2);
                        Object obj2 = tVar.d[f4];
                        V x4 = tVar.x(f4);
                        if (obj != null) {
                            i3 = obj.hashCode();
                        } else {
                            i3 = 0;
                        }
                        if (obj2 != null) {
                            i4 = obj2.hashCode();
                        } else {
                            i4 = 0;
                        }
                        j = j(i3, obj, x3, i4, obj2, x4, i + 5, fVar.c);
                    }
                }
                objArr[length2] = j;
                i19++;
                i18 ^= i2;
                i9 = 0;
            }
            int i23 = 0;
            while (i17 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i17);
                int i24 = i23 * 2;
                if (!tVar.h(lowestOneBit3)) {
                    int f5 = f(lowestOneBit3);
                    Object[] objArr5 = tVar2.d;
                    objArr5[i24] = this.d[f5];
                    objArr5[i24 + 1] = x(f5);
                } else {
                    int f6 = tVar.f(lowestOneBit3);
                    Object[] objArr6 = tVar2.d;
                    objArr6[i24] = tVar.d[f6];
                    objArr6[i24 + 1] = tVar.x(f6);
                    if (h(lowestOneBit3)) {
                        aVar.a++;
                    }
                }
                i23++;
                i17 ^= lowestOneBit3;
            }
            if (e(tVar2)) {
                return this;
            }
            if (tVar.e(tVar2)) {
                return tVar;
            }
            return tVar2;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final t<K, V> n(int i, K k, int i2, f<K, V> fVar) {
        t<K, V> n;
        t<K, V> tVar;
        com.amazon.aps.iva.yb0.j.f(fVar, "mutator");
        int i3 = 1 << ((i >> i2) & 31);
        if (h(i3)) {
            int f = f(i3);
            if (com.amazon.aps.iva.yb0.j.a(k, this.d[f])) {
                return p(f, i3, fVar);
            }
            return this;
        } else if (i(i3)) {
            int t = t(i3);
            t<K, V> s = s(t);
            if (i2 == 30) {
                com.amazon.aps.iva.ec0.h O = com.amazon.aps.iva.aq.j.O(com.amazon.aps.iva.aq.j.T(0, s.d.length), 2);
                int i4 = O.b;
                int i5 = O.c;
                int i6 = O.d;
                if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                    while (!com.amazon.aps.iva.yb0.j.a(k, s.d[i4])) {
                        if (i4 != i5) {
                            i4 += i6;
                        }
                    }
                    n = s.k(i4, fVar);
                }
                tVar = s;
                return q(s, tVar, t, i3, fVar.c);
            }
            n = s.n(i, k, i2 + 5, fVar);
            tVar = n;
            return q(s, tVar, t, i3, fVar.c);
        } else {
            return this;
        }
    }

    public final t<K, V> o(int i, K k, V v, int i2, f<K, V> fVar) {
        t<K, V> o;
        t<K, V> tVar;
        com.amazon.aps.iva.yb0.j.f(fVar, "mutator");
        int i3 = 1 << ((i >> i2) & 31);
        if (h(i3)) {
            int f = f(i3);
            if (!com.amazon.aps.iva.yb0.j.a(k, this.d[f]) || !com.amazon.aps.iva.yb0.j.a(v, x(f))) {
                return this;
            }
            return p(f, i3, fVar);
        } else if (!i(i3)) {
            return this;
        } else {
            int t = t(i3);
            t<K, V> s = s(t);
            if (i2 == 30) {
                com.amazon.aps.iva.ec0.h O = com.amazon.aps.iva.aq.j.O(com.amazon.aps.iva.aq.j.T(0, s.d.length), 2);
                int i4 = O.b;
                int i5 = O.c;
                int i6 = O.d;
                if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                    while (true) {
                        if (com.amazon.aps.iva.yb0.j.a(k, s.d[i4]) && com.amazon.aps.iva.yb0.j.a(v, s.x(i4))) {
                            o = s.k(i4, fVar);
                            break;
                        } else if (i4 == i5) {
                            break;
                        } else {
                            i4 += i6;
                        }
                    }
                }
                tVar = s;
                return q(s, tVar, t, i3, fVar.c);
            }
            o = s.o(i, k, v, i2 + 5, fVar);
            tVar = o;
            return q(s, tVar, t, i3, fVar.c);
        }
    }

    public final t<K, V> p(int i, int i2, f<K, V> fVar) {
        fVar.getClass();
        fVar.c(fVar.g - 1);
        fVar.e = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c == fVar.c) {
            this.d = com.amazon.aps.iva.e.w.i(objArr, i);
            this.a ^= i2;
            return this;
        }
        return new t<>(i2 ^ this.a, this.b, com.amazon.aps.iva.e.w.i(objArr, i), fVar.c);
    }

    public final t<K, V> q(t<K, V> tVar, t<K, V> tVar2, int i, int i2, com.amazon.aps.iva.u0.b bVar) {
        com.amazon.aps.iva.u0.b bVar2 = this.c;
        if (tVar2 == null) {
            Object[] objArr = this.d;
            if (objArr.length == 1) {
                return null;
            }
            if (bVar2 == bVar) {
                this.d = com.amazon.aps.iva.e.w.j(objArr, i);
                this.b ^= i2;
            } else {
                return new t<>(this.a, i2 ^ this.b, com.amazon.aps.iva.e.w.j(objArr, i), bVar);
            }
        } else if (bVar2 == bVar || tVar != tVar2) {
            return r(i, tVar2, bVar);
        }
        return this;
    }

    public final t<K, V> r(int i, t<K, V> tVar, com.amazon.aps.iva.u0.b bVar) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && tVar.d.length == 2 && tVar.b == 0) {
            tVar.a = this.b;
            return tVar;
        } else if (this.c == bVar) {
            objArr[i] = tVar;
            return this;
        } else {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            com.amazon.aps.iva.yb0.j.e(copyOf, "copyOf(this, size)");
            copyOf[i] = tVar;
            return new t<>(this.a, this.b, copyOf, bVar);
        }
    }

    public final t<K, V> s(int i) {
        Object obj = this.d[i];
        com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (t) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount((i - 1) & this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.s0.t.a u(java.lang.Object r12, int r13, int r14, com.amazon.aps.iva.t0.a r15) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.s0.t.u(java.lang.Object, int, int, com.amazon.aps.iva.t0.a):com.amazon.aps.iva.s0.t$a");
    }

    public final t v(int i, int i2, Object obj) {
        t<K, V> v;
        int i3 = 1 << ((i >> i2) & 31);
        if (h(i3)) {
            int f = f(i3);
            if (com.amazon.aps.iva.yb0.j.a(obj, this.d[f])) {
                Object[] objArr = this.d;
                if (objArr.length == 2) {
                    return null;
                }
                return new t(this.a ^ i3, this.b, com.amazon.aps.iva.e.w.i(objArr, f), null);
            }
            return this;
        } else if (i(i3)) {
            int t = t(i3);
            t<K, V> s = s(t);
            if (i2 == 30) {
                com.amazon.aps.iva.ec0.h O = com.amazon.aps.iva.aq.j.O(com.amazon.aps.iva.aq.j.T(0, s.d.length), 2);
                int i4 = O.b;
                int i5 = O.c;
                int i6 = O.d;
                if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                    while (!com.amazon.aps.iva.yb0.j.a(obj, s.d[i4])) {
                        if (i4 != i5) {
                            i4 += i6;
                        }
                    }
                    Object[] objArr2 = s.d;
                    if (objArr2.length == 2) {
                        v = null;
                    } else {
                        v = new t<>(0, 0, com.amazon.aps.iva.e.w.i(objArr2, i4), null);
                    }
                }
                v = s;
                break;
            }
            v = s.v(i, i2 + 5, obj);
            if (v == null) {
                Object[] objArr3 = this.d;
                if (objArr3.length == 1) {
                    return null;
                }
                return new t(this.a, i3 ^ this.b, com.amazon.aps.iva.e.w.j(objArr3, t), null);
            } else if (s != v) {
                return w(t, i3, v);
            } else {
                return this;
            }
        } else {
            return this;
        }
    }

    public final t<K, V> w(int i, int i2, t<K, V> tVar) {
        Object[] objArr = tVar.d;
        if (objArr.length == 2 && tVar.b == 0) {
            if (this.d.length == 1) {
                tVar.a = this.b;
                return tVar;
            }
            int f = f(i2);
            Object[] objArr2 = this.d;
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + 1);
            com.amazon.aps.iva.yb0.j.e(copyOf, "copyOf(this, newSize)");
            com.amazon.aps.iva.lb0.m.F(copyOf, i + 2, copyOf, i + 1, objArr2.length);
            com.amazon.aps.iva.lb0.m.F(copyOf, f + 2, copyOf, f, i);
            copyOf[f] = obj;
            copyOf[f + 1] = obj2;
            return new t<>(this.a ^ i2, i2 ^ this.b, copyOf, null);
        }
        Object[] objArr3 = this.d;
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length);
        com.amazon.aps.iva.yb0.j.e(copyOf2, "copyOf(this, newSize)");
        copyOf2[i] = tVar;
        return new t<>(this.a, this.b, copyOf2, null);
    }

    public final V x(int i) {
        return (V) this.d[i + 1];
    }
}
