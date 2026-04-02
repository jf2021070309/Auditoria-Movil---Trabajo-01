package l.c.a.x;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import l.c.a.q;
/* loaded from: classes2.dex */
public abstract class f {

    /* loaded from: classes2.dex */
    public static final class a extends f implements Serializable {
        public final q a;

        public a(q qVar) {
            this.a = qVar;
        }

        @Override // l.c.a.x.f
        public q a(l.c.a.d dVar) {
            return this.a;
        }

        @Override // l.c.a.x.f
        public d b(l.c.a.f fVar) {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return this.a.equals(((a) obj).a);
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return bVar.h() && this.a.equals(bVar.a(l.c.a.d.a));
            }
            return false;
        }

        @Override // l.c.a.x.f
        public List<q> f(l.c.a.f fVar) {
            return Collections.singletonList(this.a);
        }

        @Override // l.c.a.x.f
        public boolean h() {
            return true;
        }

        public int hashCode() {
            int i2 = this.a.f9708g;
            return ((i2 + 31) ^ (((i2 + 31) ^ 1) ^ 1)) ^ 1;
        }

        @Override // l.c.a.x.f
        public boolean i(l.c.a.f fVar, q qVar) {
            return this.a.equals(qVar);
        }

        public String toString() {
            StringBuilder y = e.a.d.a.a.y("FixedRules:");
            y.append(this.a);
            return y.toString();
        }
    }

    public abstract q a(l.c.a.d dVar);

    public abstract d b(l.c.a.f fVar);

    public abstract List<q> f(l.c.a.f fVar);

    public abstract boolean h();

    public abstract boolean i(l.c.a.f fVar, q qVar);
}
