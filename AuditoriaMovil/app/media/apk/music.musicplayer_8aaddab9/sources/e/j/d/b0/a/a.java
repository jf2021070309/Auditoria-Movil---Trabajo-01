package e.j.d.b0.a;

import e.j.d.c0.f0;
import e.j.d.w;
/* loaded from: classes2.dex */
public final class a {
    public final e.j.d.b0.c.g a;

    /* renamed from: b  reason: collision with root package name */
    public final e.j.d.y.b f8541b;

    /* renamed from: c  reason: collision with root package name */
    public final e.j.d.i f8542c;

    /* renamed from: d  reason: collision with root package name */
    public final h.d f8543d;

    /* renamed from: e.j.d.b0.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0186a {
        NONE,
        DEFAULT,
        IN_APP_REVIEW,
        VALIDATE_INTENT,
        IN_APP_REVIEW_WITH_AD,
        VALIDATE_INTENT_WITH_AD
    }

    /* loaded from: classes2.dex */
    public static final class b extends h.o.c.k implements h.o.b.a<f0> {
        public b() {
            super(0);
        }

        @Override // h.o.b.a
        public f0 invoke() {
            return new f0(((Number) a.this.f8541b.f(e.j.d.y.b.v)).longValue() * 1000, 0L, true);
        }
    }

    public a(e.j.d.b0.c.g gVar, e.j.d.y.b bVar, e.j.d.i iVar) {
        h.o.c.j.e(gVar, "rateHelper");
        h.o.c.j.e(bVar, "configuration");
        h.o.c.j.e(iVar, "preferences");
        this.a = gVar;
        this.f8541b = bVar;
        this.f8542c = iVar;
        this.f8543d = w.Z(new b());
    }

    public final f0 a() {
        return (f0) this.f8543d.getValue();
    }
}
