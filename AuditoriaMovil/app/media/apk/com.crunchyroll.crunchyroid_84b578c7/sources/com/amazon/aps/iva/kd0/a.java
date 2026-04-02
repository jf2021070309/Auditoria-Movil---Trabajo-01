package com.amazon.aps.iva.kd0;

import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.lb0.c;
import com.amazon.aps.iva.lb0.l;
import com.amazon.aps.iva.lb0.o;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.yb0.j;
import java.util.ArrayList;
import java.util.List;
/* compiled from: BinaryVersion.kt */
/* loaded from: classes4.dex */
public abstract class a {
    public final int[] a;
    public final int b;
    public final int c;
    public final int d;
    public final List<Integer> e;

    public a(int... iArr) {
        int i;
        int i2;
        List<Integer> list;
        j.f(iArr, "numbers");
        this.a = iArr;
        Integer R = o.R(0, iArr);
        if (R != null) {
            i = R.intValue();
        } else {
            i = -1;
        }
        this.b = i;
        Integer R2 = o.R(1, iArr);
        if (R2 != null) {
            i2 = R2.intValue();
        } else {
            i2 = -1;
        }
        this.c = i2;
        Integer R3 = o.R(2, iArr);
        this.d = R3 != null ? R3.intValue() : -1;
        if (iArr.length > 3) {
            if (iArr.length <= 1024) {
                list = x.X0(new c.d(new l(iArr), 3, iArr.length));
            } else {
                throw new IllegalArgumentException(b2.b(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), iArr.length, '.'));
            }
        } else {
            list = z.b;
        }
        this.e = list;
    }

    public final boolean a(int i, int i2, int i3) {
        int i4 = this.b;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.c;
        if (i5 > i2) {
            return true;
        }
        if (i5 >= i2 && this.d >= i3) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj != null && j.a(getClass(), obj.getClass())) {
            a aVar = (a) obj;
            if (this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && j.a(this.e, aVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        int i2 = (i * 31) + this.c + i;
        int i3 = (i2 * 31) + this.d + i2;
        return this.e.hashCode() + (i3 * 31) + i3;
    }

    public final String toString() {
        int[] iArr;
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (int i : this.a) {
            if (i != -1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                break;
            }
            arrayList.add(Integer.valueOf(i));
        }
        if (arrayList.isEmpty()) {
            return "unknown";
        }
        return x.B0(arrayList, ".", null, null, null, 62);
    }
}
