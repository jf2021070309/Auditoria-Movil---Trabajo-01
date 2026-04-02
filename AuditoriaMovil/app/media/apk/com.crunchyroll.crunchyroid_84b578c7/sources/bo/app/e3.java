package bo.app;

import com.braze.support.DateTimeUtils;
/* loaded from: classes.dex */
public final class e3 extends c5 {
    public /* synthetic */ e3(e5 e5Var, double d, Double d2, boolean z, int i, com.amazon.aps.iva.yb0.e eVar) {
        this((i & 1) != 0 ? e5.d.a() : e5Var, (i & 2) != 0 ? DateTimeUtils.nowInSecondsPrecise() : d, (i & 4) != 0 ? null : d2, (i & 8) != 0 ? false : z);
    }

    public final void A() {
        a(true);
        a(Double.valueOf(DateTimeUtils.nowInSecondsPrecise()));
    }

    @Override // bo.app.c5
    public void a(Double d) {
        super.a(d);
    }

    @Override // bo.app.c5
    public String toString() {
        return "\nMutableSession(sessionId=" + s() + ", startTime=" + x() + ", endTime=" + w() + ", isSealed=" + y() + ", duration=" + v() + ')';
    }

    @Override // bo.app.c5
    public Double w() {
        return super.w();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(e5 e5Var, double d, Double d2, boolean z) {
        super(e5Var, d, d2, z);
        com.amazon.aps.iva.yb0.j.f(e5Var, "sessionId");
    }
}
