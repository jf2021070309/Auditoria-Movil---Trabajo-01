package i.a;

import ch.qos.logback.core.CoreConstants;
/* loaded from: classes2.dex */
public final class a2<U, T extends U> extends i.a.i2.o<T> implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final long f8968d;

    public a2(long j2, h.m.d<? super U> dVar) {
        super(dVar.getContext(), dVar);
        this.f8968d = j2;
    }

    @Override // i.a.c, i.a.l1
    public String J() {
        return super.J() + "(timeMillis=" + this.f8968d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j2 = this.f8968d;
        e(new z1("Timed out waiting for " + j2 + " ms", this));
    }
}
