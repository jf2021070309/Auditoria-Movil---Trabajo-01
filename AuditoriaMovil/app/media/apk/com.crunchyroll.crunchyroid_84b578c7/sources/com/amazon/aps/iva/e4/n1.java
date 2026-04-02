package com.amazon.aps.iva.e4;

import com.amazon.aps.iva.e4.a0;
import java.io.IOException;
/* compiled from: UnknownFieldSchema.java */
/* loaded from: classes.dex */
public abstract class n1<T, B> {
    public abstract void a(B b, int i, int i2);

    public abstract void b(B b, int i, long j);

    public abstract void c(B b, int i, T t);

    public abstract void d(B b, int i, i iVar);

    public abstract void e(B b, int i, long j);

    public abstract o1 f(Object obj);

    public abstract o1 g(Object obj);

    public abstract int h(T t);

    public abstract int i(T t);

    public abstract void j(Object obj);

    public abstract o1 k(Object obj, Object obj2);

    public final boolean l(B b, f1 f1Var) throws IOException {
        int tag = f1Var.getTag();
        int i = tag >>> 3;
        int i2 = tag & 7;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                a(b, i, f1Var.readFixed32());
                                return true;
                            }
                            int i3 = a0.b;
                            throw new a0.a();
                        }
                        return false;
                    }
                    o1 m = m();
                    int i4 = (i << 3) | 4;
                    while (f1Var.getFieldNumber() != Integer.MAX_VALUE && l(m, f1Var)) {
                    }
                    if (i4 == f1Var.getTag()) {
                        c(b, i, q(m));
                        return true;
                    }
                    throw new a0("Protocol message end-group tag did not match expected tag.");
                }
                d(b, i, f1Var.readBytes());
                return true;
            }
            b(b, i, f1Var.readFixed64());
            return true;
        }
        e(b, i, f1Var.readInt64());
        return true;
    }

    public abstract o1 m();

    public abstract void n(Object obj, B b);

    public abstract void o(Object obj, T t);

    public abstract void p();

    public abstract o1 q(Object obj);

    public abstract void r(Object obj, m mVar) throws IOException;

    public abstract void s(Object obj, m mVar) throws IOException;
}
