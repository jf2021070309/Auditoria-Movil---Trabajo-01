package e.c.a.m.t;

import e.c.a.m.r.d;
import e.c.a.m.t.n;
/* loaded from: classes.dex */
public class v<Model> implements n<Model, Model> {
    public static final v<?> a = new v<>();

    /* loaded from: classes.dex */
    public static class a<Model> implements o<Model, Model> {
        public static final a<?> a = new a<>();

        @Override // e.c.a.m.t.o
        public n<Model, Model> b(r rVar) {
            return v.a;
        }
    }

    /* loaded from: classes.dex */
    public static class b<Model> implements e.c.a.m.r.d<Model> {
        public final Model a;

        public b(Model model) {
            this.a = model;
        }

        @Override // e.c.a.m.r.d
        public Class<Model> a() {
            return (Class<Model>) this.a.getClass();
        }

        @Override // e.c.a.m.r.d
        public void b() {
        }

        @Override // e.c.a.m.r.d
        public void cancel() {
        }

        @Override // e.c.a.m.r.d
        public e.c.a.m.a d() {
            return e.c.a.m.a.LOCAL;
        }

        @Override // e.c.a.m.r.d
        public void e(e.c.a.f fVar, d.a<? super Model> aVar) {
            aVar.f((Model) this.a);
        }
    }

    @Override // e.c.a.m.t.n
    public boolean a(Model model) {
        return true;
    }

    @Override // e.c.a.m.t.n
    public n.a<Model> b(Model model, int i2, int i3, e.c.a.m.m mVar) {
        return new n.a<>(new e.c.a.r.b(model), new b(model));
    }
}
