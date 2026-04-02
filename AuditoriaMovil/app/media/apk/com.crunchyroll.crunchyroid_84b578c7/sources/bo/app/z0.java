package bo.app;

import com.braze.support.BrazeLogger;
import java.util.Iterator;
import java.util.Set;
/* loaded from: classes.dex */
public final class z0 {
    private final q1 a;
    private boolean b;

    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ p1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p1 p1Var) {
            super(0);
            this.b = p1Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Storage manager is closed. Not adding event: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ Set b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Set set) {
            super(0);
            this.b = set;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Storage manager is closed. Not deleting events: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final c b = new c();

        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Storage manager is closed. Not starting offline recovery.";
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final d b = new d();

        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Started offline event recovery task.";
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ p1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(p1 p1Var) {
            super(0);
            this.b = p1Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Adding event to dispatch from storage: " + this.b;
        }
    }

    public z0(q1 q1Var) {
        com.amazon.aps.iva.yb0.j.f(q1Var, "brazeEventStorageProvider");
        this.a = q1Var;
    }

    public final void a(p1 p1Var) {
        com.amazon.aps.iva.yb0.j.f(p1Var, "event");
        if (this.b) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new a(p1Var), 2, (Object) null);
        } else {
            this.a.a(p1Var);
        }
    }

    public final void a(Set set) {
        com.amazon.aps.iva.yb0.j.f(set, "events");
        if (this.b) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new b(set), 2, (Object) null);
        } else {
            this.a.a(set);
        }
    }

    public final void a(x1 x1Var) {
        com.amazon.aps.iva.yb0.j.f(x1Var, "dispatchManager");
        if (this.b) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, c.b, 2, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, d.b, 3, (Object) null);
        Iterator it = com.amazon.aps.iva.lb0.x.r0(this.a.a()).iterator();
        while (it.hasNext()) {
            p1 p1Var = (p1) it.next();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new e(p1Var), 2, (Object) null);
            x1Var.a(p1Var);
        }
    }
}
