package bo.app;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class q0 implements f2 {
    private final z1 a;
    private boolean b;
    private final List c;

    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final a b = new a();

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Short circuiting execution of network request and immediately marking it as succeeded.";
        }
    }

    public q0(z1 z1Var, boolean z) {
        com.amazon.aps.iva.yb0.j.f(z1Var, "internalEventPublisher");
        this.a = z1Var;
        this.b = z;
        this.c = new ArrayList();
    }

    private final void c(e2 e2Var) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, a.b, 3, (Object) null);
        z1 z1Var = this.a;
        e2Var.a(z1Var, z1Var, (d) null);
        e2Var.b(this.a);
        if (e2Var instanceof s1) {
            this.a.a(new p0((s1) e2Var), p0.class);
        }
    }

    @Override // bo.app.f2
    public void a(e2 e2Var) {
        com.amazon.aps.iva.yb0.j.f(e2Var, "request");
        c(e2Var);
    }

    @Override // bo.app.f2
    public void b(e2 e2Var) {
        com.amazon.aps.iva.yb0.j.f(e2Var, "request");
        c(e2Var);
    }
}
