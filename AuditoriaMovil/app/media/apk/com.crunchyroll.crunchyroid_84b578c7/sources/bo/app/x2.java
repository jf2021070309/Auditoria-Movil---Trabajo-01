package bo.app;

import com.braze.support.BrazeLogger;
/* loaded from: classes.dex */
public final class x2 implements com.amazon.aps.iva.bc0.b {
    private Object a;

    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ Object b;
        final /* synthetic */ com.amazon.aps.iva.fc0.l c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, com.amazon.aps.iva.fc0.l lVar) {
            super(0);
            this.b = obj;
            this.c = lVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Cannot assign " + this.b + " to only-set-once property " + this.c.getName();
        }
    }

    @Override // com.amazon.aps.iva.bc0.b
    public Object getValue(Object obj, com.amazon.aps.iva.fc0.l lVar) {
        com.amazon.aps.iva.yb0.j.f(obj, "thisRef");
        com.amazon.aps.iva.yb0.j.f(lVar, "property");
        return this.a;
    }

    public void setValue(Object obj, com.amazon.aps.iva.fc0.l lVar, Object obj2) {
        com.amazon.aps.iva.yb0.j.f(obj, "thisRef");
        com.amazon.aps.iva.yb0.j.f(lVar, "property");
        Object obj3 = this.a;
        if (obj3 == null) {
            this.a = obj2;
        } else if (!com.amazon.aps.iva.yb0.j.a(obj3, obj2)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a(obj2, lVar), 3, (Object) null);
        }
    }
}
