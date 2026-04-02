package h.o.c;

import h.r.e;
import java.util.Objects;
/* loaded from: classes2.dex */
public abstract class m extends o implements h.r.e {
    public m(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i2);
    }

    @Override // h.r.e
    public e.a h() {
        h.r.a b2 = b();
        if (b2 != this) {
            return ((h.r.e) ((h.r.f) b2)).h();
        }
        throw new h.o.a();
    }

    @Override // h.o.b.l
    public Object invoke(Object obj) {
        return ((n) this).h().a(obj);
    }

    @Override // h.o.c.b
    public h.r.a t() {
        Objects.requireNonNull(r.a);
        return this;
    }
}
