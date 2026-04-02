package e.h.d;

import e.h.g.b1;
import e.h.g.s1;
/* loaded from: classes2.dex */
public class z0 {
    public static final c a = new c(null);

    /* loaded from: classes2.dex */
    public static class b {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public e.h.b.s f8229b;

        public b() {
        }

        public b(a aVar) {
        }
    }

    /* loaded from: classes2.dex */
    public static class c extends b1<b> {
        public c(a aVar) {
        }

        @Override // e.h.g.b1
        public void a(b bVar) {
            b bVar2 = bVar;
            try {
                e.h.b.r.d(e.h.g.x0.f8405d, bVar2.f8229b, bVar2.a);
            } catch (Exception e2) {
                s1.l(e2, true);
            }
        }
    }
}
