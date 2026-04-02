package com.amazon.aps.iva.v4;

import com.amazon.aps.iva.v4.z;
import java.io.IOException;
/* compiled from: UnknownFieldSchema.java */
/* loaded from: classes.dex */
public abstract class k1<T, B> {
    public abstract void a(B b, int i, int i2);

    public abstract void b(B b, int i, long j);

    public abstract void c(B b, int i, T t);

    public abstract void d(B b, int i, h hVar);

    public abstract void e(B b, int i, long j);

    public abstract l1 f(Object obj);

    public abstract l1 g(Object obj);

    public abstract int h(T t);

    public abstract int i(T t);

    public abstract void j(Object obj);

    public abstract l1 k(Object obj, Object obj2);

    public final boolean l(B b, d1 d1Var) throws IOException {
        int tag = d1Var.getTag();
        int i = tag >>> 3;
        int i2 = tag & 7;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                a(b, i, d1Var.readFixed32());
                                return true;
                            }
                            int i3 = z.c;
                            throw new z.a();
                        }
                        return false;
                    }
                    l1 m = m();
                    int i4 = (i << 3) | 4;
                    while (d1Var.getFieldNumber() != Integer.MAX_VALUE && l(m, d1Var)) {
                    }
                    if (i4 == d1Var.getTag()) {
                        c(b, i, q(m));
                        return true;
                    }
                    throw new z("Protocol message end-group tag did not match expected tag.");
                }
                d(b, i, d1Var.readBytes());
                return true;
            }
            b(b, i, d1Var.readFixed64());
            return true;
        }
        e(b, i, d1Var.readInt64());
        return true;
    }

    public abstract l1 m();

    public abstract void n(Object obj, B b);

    public abstract void o(Object obj, T t);

    public abstract void p();

    public abstract l1 q(Object obj);

    public abstract void r(Object obj, l lVar) throws IOException;

    public abstract void s(Object obj, l lVar) throws IOException;
}
