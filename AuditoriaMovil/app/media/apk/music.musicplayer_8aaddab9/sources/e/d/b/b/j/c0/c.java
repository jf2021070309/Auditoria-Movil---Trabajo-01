package e.d.b.b.j.c0;

import e.d.b.b.h;
import e.d.b.b.j.c0.h.y;
import e.d.b.b.j.c0.i.a0;
import e.d.b.b.j.d0.b;
import e.d.b.b.j.n;
import e.d.b.b.j.r;
import e.d.b.b.j.v;
import e.d.b.b.j.y.m;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public class c implements e {
    public static final Logger a = Logger.getLogger(v.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public final y f6146b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f6147c;

    /* renamed from: d  reason: collision with root package name */
    public final e.d.b.b.j.y.e f6148d;

    /* renamed from: e  reason: collision with root package name */
    public final a0 f6149e;

    /* renamed from: f  reason: collision with root package name */
    public final e.d.b.b.j.d0.b f6150f;

    public c(Executor executor, e.d.b.b.j.y.e eVar, y yVar, a0 a0Var, e.d.b.b.j.d0.b bVar) {
        this.f6147c = executor;
        this.f6148d = eVar;
        this.f6146b = yVar;
        this.f6149e = a0Var;
        this.f6150f = bVar;
    }

    @Override // e.d.b.b.j.c0.e
    public void a(final r rVar, final n nVar, final h hVar) {
        this.f6147c.execute(new Runnable() { // from class: e.d.b.b.j.c0.a
            @Override // java.lang.Runnable
            public final void run() {
                final c cVar = c.this;
                final r rVar2 = rVar;
                h hVar2 = hVar;
                n nVar2 = nVar;
                Objects.requireNonNull(cVar);
                try {
                    m mVar = cVar.f6148d.get(rVar2.b());
                    if (mVar == null) {
                        String format = String.format("Transport backend '%s' is not registered", rVar2.b());
                        c.a.warning(format);
                        hVar2.a(new IllegalArgumentException(format));
                    } else {
                        final n b2 = mVar.b(nVar2);
                        cVar.f6150f.f(new b.a() { // from class: e.d.b.b.j.c0.b
                            @Override // e.d.b.b.j.d0.b.a
                            public final Object a() {
                                c cVar2 = c.this;
                                r rVar3 = rVar2;
                                cVar2.f6149e.N(rVar3, b2);
                                cVar2.f6146b.a(rVar3, 1);
                                return null;
                            }
                        });
                        hVar2.a(null);
                    }
                } catch (Exception e2) {
                    Logger logger = c.a;
                    StringBuilder y = e.a.d.a.a.y("Error scheduling event ");
                    y.append(e2.getMessage());
                    logger.warning(y.toString());
                    hVar2.a(e2);
                }
            }
        });
    }
}
