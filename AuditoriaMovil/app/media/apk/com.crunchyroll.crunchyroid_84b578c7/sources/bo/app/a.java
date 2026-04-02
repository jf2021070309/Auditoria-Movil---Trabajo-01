package bo.app;

import com.braze.support.BrazeLogger;
/* loaded from: classes.dex */
public abstract class a {
    private final com.amazon.aps.iva.ze0.f a;

    /* renamed from: bo.app.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0065a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ Object b;
        final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0065a(Object obj, boolean z) {
            super(0);
            this.b = obj;
            this.c = z;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            StringBuilder sb = new StringBuilder("Tried to confirm outboundObject [");
            sb.append(this.b);
            sb.append("] with success [");
            return com.amazon.aps.iva.e4.e.c(sb, this.c, "], but the cache wasn't locked, so not doing anything.");
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Notifying confirmAndUnlock listeners for cache: " + a.this;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Cache locked successfully for export: " + a.this;
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
            return "Received call to export dirty object, but the cache was already locked.";
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p {
        Object b;
        int c;

        public e(com.amazon.aps.iva.ob0.d dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        /* renamed from: a */
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d dVar) {
            return ((e) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d create(Object obj, com.amazon.aps.iva.ob0.d dVar) {
            return new e(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.ze0.f fVar;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i != 0) {
                if (i == 1) {
                    fVar = (com.amazon.aps.iva.ze0.f) this.b;
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                com.amazon.aps.iva.ze0.f fVar2 = a.this.a;
                this.b = fVar2;
                this.c = 1;
                if (fVar2.c(this) == aVar) {
                    return aVar;
                }
                fVar = fVar2;
            }
            try {
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                fVar.release();
                return com.amazon.aps.iva.kb0.q.a;
            } catch (Throwable th) {
                fVar.release();
                throw th;
            }
        }
    }

    public a() {
        int i = com.amazon.aps.iva.ze0.i.a;
        this.a = new com.amazon.aps.iva.ze0.h(0);
    }

    public abstract void b(Object obj, boolean z);

    public final boolean b() {
        return this.a.a() == 0;
    }

    public final void c() {
        com.amazon.aps.iva.se0.i.e(com.amazon.aps.iva.ob0.h.b, new e(null));
    }

    public abstract Object d();

    public final synchronized Object a() {
        Object obj;
        if (this.a.b()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new c(), 3, (Object) null);
            obj = d();
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, d.b, 3, (Object) null);
            obj = null;
        }
        return obj;
    }

    public final synchronized boolean a(Object obj, boolean z) {
        if (this.a.a() != 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new C0065a(obj, z), 2, (Object) null);
            return false;
        }
        b(obj, z);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new b(), 2, (Object) null);
        this.a.release();
        return true;
    }
}
