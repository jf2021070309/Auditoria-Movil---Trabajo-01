package bo.app;

import com.braze.support.BrazeLogger;
/* loaded from: classes.dex */
public final class g1 implements t1 {

    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Cannot create card control event for Feed card. Returning null. Card id: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Cannot create card dismissed event for Feed card. Returning null. Card id: " + this.b;
        }
    }

    @Override // bo.app.t1
    public p1 a(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "cardId");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new b(str), 2, (Object) null);
        return null;
    }

    @Override // bo.app.t1
    public p1 b(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "cardId");
        return j.h.e(str);
    }

    @Override // bo.app.t1
    public p1 c(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "cardId");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new a(str), 2, (Object) null);
        return null;
    }

    @Override // bo.app.t1
    public p1 d(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "cardId");
        return j.h.f(str);
    }
}
