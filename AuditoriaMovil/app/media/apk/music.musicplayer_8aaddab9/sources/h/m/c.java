package h.m;

import ch.qos.logback.core.joran.action.Action;
import e.j.d.w;
import h.m.f;
import h.o.b.p;
import h.o.c.j;
import h.o.c.k;
import java.io.Serializable;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class c implements f, Serializable {
    public final f a;

    /* renamed from: b  reason: collision with root package name */
    public final f.a f8930b;

    /* loaded from: classes2.dex */
    public static final class a extends k implements p<String, f.a, String> {
        public static final a a = new a();

        public a() {
            super(2);
        }

        @Override // h.o.b.p
        public String i(String str, f.a aVar) {
            String str2 = str;
            f.a aVar2 = aVar;
            j.e(str2, "acc");
            j.e(aVar2, "element");
            if (str2.length() == 0) {
                return aVar2.toString();
            }
            return str2 + ", " + aVar2;
        }
    }

    public c(f fVar, f.a aVar) {
        j.e(fVar, "left");
        j.e(aVar, "element");
        this.a = fVar;
        this.f8930b = aVar;
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (cVar.size() != size()) {
                return false;
            }
            Objects.requireNonNull(cVar);
            c cVar2 = this;
            while (true) {
                f.a aVar = cVar2.f8930b;
                if (!j.a(cVar.get(aVar.getKey()), aVar)) {
                    z = false;
                    break;
                }
                f fVar = cVar2.a;
                if (!(fVar instanceof c)) {
                    f.a aVar2 = (f.a) fVar;
                    z = j.a(cVar.get(aVar2.getKey()), aVar2);
                    break;
                }
                cVar2 = (c) fVar;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    @Override // h.m.f
    public <R> R fold(R r, p<? super R, ? super f.a, ? extends R> pVar) {
        j.e(pVar, "operation");
        return pVar.i((Object) this.a.fold(r, pVar), this.f8930b);
    }

    @Override // h.m.f
    public <E extends f.a> E get(f.b<E> bVar) {
        j.e(bVar, Action.KEY_ATTRIBUTE);
        c cVar = this;
        while (true) {
            E e2 = (E) cVar.f8930b.get(bVar);
            if (e2 != null) {
                return e2;
            }
            f fVar = cVar.a;
            if (!(fVar instanceof c)) {
                return (E) fVar.get(bVar);
            }
            cVar = (c) fVar;
        }
    }

    public int hashCode() {
        return this.f8930b.hashCode() + this.a.hashCode();
    }

    @Override // h.m.f
    public f minusKey(f.b<?> bVar) {
        j.e(bVar, Action.KEY_ATTRIBUTE);
        if (this.f8930b.get(bVar) == null) {
            f minusKey = this.a.minusKey(bVar);
            return minusKey == this.a ? this : minusKey == g.a ? this.f8930b : new c(minusKey, this.f8930b);
        }
        return this.a;
    }

    @Override // h.m.f
    public f plus(f fVar) {
        return w.h0(this, fVar);
    }

    public final int size() {
        int i2 = 2;
        c cVar = this;
        while (true) {
            f fVar = cVar.a;
            cVar = fVar instanceof c ? (c) fVar : null;
            if (cVar == null) {
                return i2;
            }
            i2++;
        }
    }

    public String toString() {
        return '[' + ((String) fold("", a.a)) + ']';
    }
}
