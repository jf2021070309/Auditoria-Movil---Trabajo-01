package com.amazon.aps.iva.rb0;

import com.amazon.aps.iva.j0.j0;
import com.amazon.aps.iva.lb0.c;
import com.amazon.aps.iva.lb0.o;
import com.amazon.aps.iva.yb0.j;
import java.io.Serializable;
import java.lang.Enum;
/* compiled from: EnumEntries.kt */
/* loaded from: classes4.dex */
public final class b<T extends Enum<T>> extends c<T> implements a<T>, Serializable {
    public final T[] b;

    public b(T[] tArr) {
        j.f(tArr, "entries");
        this.b = tArr;
    }

    @Override // com.amazon.aps.iva.lb0.a
    public final int b() {
        return this.b.length;
    }

    @Override // com.amazon.aps.iva.lb0.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r4 = (Enum) obj;
        j.f(r4, "element");
        if (((Enum) o.S(this.b, r4.ordinal())) != r4) {
            return false;
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        T[] tArr = this.b;
        int length = tArr.length;
        if (i >= 0 && i < length) {
            return tArr[i];
        }
        throw new IndexOutOfBoundsException(j0.e("index: ", i, ", size: ", length));
    }

    @Override // com.amazon.aps.iva.lb0.c, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        j.f(r4, "element");
        int ordinal = r4.ordinal();
        if (((Enum) o.S(this.b, ordinal)) != r4) {
            return -1;
        }
        return ordinal;
    }

    @Override // com.amazon.aps.iva.lb0.c, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r2 = (Enum) obj;
        j.f(r2, "element");
        return indexOf(r2);
    }
}
