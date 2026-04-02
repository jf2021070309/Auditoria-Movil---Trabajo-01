package l.c.a.t;

import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class q extends l.c.a.v.a implements Serializable {
    public static final q a;

    /* renamed from: b  reason: collision with root package name */
    public static final q f9745b;

    /* renamed from: c  reason: collision with root package name */
    public static final q f9746c;

    /* renamed from: d  reason: collision with root package name */
    public static final q f9747d;

    /* renamed from: e  reason: collision with root package name */
    public static final q f9748e;

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicReference<q[]> f9749f;

    /* renamed from: g  reason: collision with root package name */
    public final int f9750g;

    /* renamed from: h  reason: collision with root package name */
    public final transient l.c.a.e f9751h;

    /* renamed from: i  reason: collision with root package name */
    public final transient String f9752i;

    static {
        q qVar = new q(-1, l.c.a.e.j0(1868, 9, 8), "Meiji");
        a = qVar;
        q qVar2 = new q(0, l.c.a.e.j0(1912, 7, 30), "Taisho");
        f9745b = qVar2;
        q qVar3 = new q(1, l.c.a.e.j0(1926, 12, 25), "Showa");
        f9746c = qVar3;
        q qVar4 = new q(2, l.c.a.e.j0(1989, 1, 8), "Heisei");
        f9747d = qVar4;
        q qVar5 = new q(3, l.c.a.e.j0(2019, 5, 1), "Reiwa");
        f9748e = qVar5;
        f9749f = new AtomicReference<>(new q[]{qVar, qVar2, qVar3, qVar4, qVar5});
    }

    public q(int i2, l.c.a.e eVar, String str) {
        this.f9750g = i2;
        this.f9751h = eVar;
        this.f9752i = str;
    }

    private Object readResolve() throws ObjectStreamException {
        try {
            return v(this.f9750g);
        } catch (l.c.a.a e2) {
            InvalidObjectException invalidObjectException = new InvalidObjectException("Invalid era");
            invalidObjectException.initCause(e2);
            throw invalidObjectException;
        }
    }

    public static q u(l.c.a.e eVar) {
        if (eVar.d0(a.f9751h)) {
            throw new l.c.a.a("Date too early: " + eVar);
        }
        q[] qVarArr = f9749f.get();
        for (int length = qVarArr.length - 1; length >= 0; length--) {
            q qVar = qVarArr[length];
            if (eVar.compareTo(qVar.f9751h) >= 0) {
                return qVar;
            }
        }
        return null;
    }

    public static q v(int i2) {
        q[] qVarArr = f9749f.get();
        if (i2 < a.f9750g || i2 > qVarArr[qVarArr.length - 1].f9750g) {
            throw new l.c.a.a("japaneseEra is invalid");
        }
        return qVarArr[i2 + 1];
    }

    private Object writeReplace() {
        return new u((byte) 2, this);
    }

    public static q[] y() {
        q[] qVarArr = f9749f.get();
        return (q[]) Arrays.copyOf(qVarArr, qVarArr.length);
    }

    @Override // l.c.a.v.c, l.c.a.w.e
    public l.c.a.w.n range(l.c.a.w.i iVar) {
        l.c.a.w.a aVar = l.c.a.w.a.ERA;
        return iVar == aVar ? o.f9738d.K(aVar) : super.range(iVar);
    }

    public l.c.a.e t() {
        int i2 = this.f9750g + 1;
        q[] y = y();
        return i2 >= y.length + (-1) ? l.c.a.e.f9676b : y[i2 + 1].f9751h.h0(1L);
    }

    public String toString() {
        return this.f9752i;
    }
}
