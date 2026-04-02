package com.amazon.aps.iva.p0;

import com.amazon.aps.iva.lb0.m;
import com.amazon.aps.iva.yb0.j;
/* compiled from: IdentityArrayMap.kt */
/* loaded from: classes.dex */
public final class b<Key, Value> {
    public Object[] a = new Object[16];
    public Object[] b = new Object[16];
    public int c;

    public final int a(Object obj) {
        Object obj2;
        int identityHashCode = System.identityHashCode(obj);
        int i = this.c - 1;
        Object[] objArr = this.a;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj3 = objArr[i3];
            int identityHashCode2 = System.identityHashCode(obj3);
            if (identityHashCode2 < identityHashCode) {
                i2 = i3 + 1;
            } else if (identityHashCode2 <= identityHashCode) {
                if (obj == obj3) {
                    return i3;
                } else {
                    Object[] objArr2 = this.a;
                    int i4 = this.c;
                    for (int i5 = i3 - 1; -1 < i5; i5--) {
                        Object obj4 = objArr2[i5];
                        if (obj4 != obj) {
                            if (System.identityHashCode(obj4) != identityHashCode) {
                                break;
                            }
                        } else {
                            return i5;
                        }
                    }
                    do {
                        i3++;
                        if (i3 < i4) {
                            obj2 = objArr2[i3];
                            if (obj2 == obj) {
                                return i3;
                            }
                        } else {
                            return -(i4 + 1);
                        }
                    } while (System.identityHashCode(obj2) == identityHashCode);
                    return -(i3 + 1);
                }
            } else {
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public final Value b(Key key) {
        j.f(key, "key");
        int a = a(key);
        if (a >= 0) {
            return (Value) this.b[a];
        }
        return null;
    }

    public final void c(Key key, Value value) {
        boolean z;
        Object[] objArr;
        Object[] objArr2;
        j.f(key, "key");
        Object[] objArr3 = this.a;
        Object[] objArr4 = this.b;
        int i = this.c;
        int a = a(key);
        if (a >= 0) {
            objArr4[a] = value;
            return;
        }
        int i2 = -(a + 1);
        if (i == objArr3.length) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            objArr = new Object[i * 2];
        } else {
            objArr = objArr3;
        }
        int i3 = i2 + 1;
        m.F(objArr3, i3, objArr, i2, i);
        if (z) {
            m.H(objArr3, objArr, 0, 0, i2, 6);
        }
        objArr[i2] = key;
        this.a = objArr;
        if (z) {
            objArr2 = new Object[i * 2];
        } else {
            objArr2 = objArr4;
        }
        m.F(objArr4, i3, objArr2, i2, i);
        if (z) {
            m.H(objArr4, objArr2, 0, 0, i2, 6);
        }
        objArr2[i2] = value;
        this.b = objArr2;
        this.c++;
    }
}
