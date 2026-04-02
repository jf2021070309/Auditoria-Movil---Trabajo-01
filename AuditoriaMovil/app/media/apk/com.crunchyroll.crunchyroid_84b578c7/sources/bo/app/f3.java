package bo.app;
/* loaded from: classes.dex */
public final class f3 extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(String str, Throwable th) {
        super(str, th);
        com.amazon.aps.iva.yb0.j.f(str, "message");
        com.amazon.aps.iva.yb0.j.f(th, "innerException");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(String str) {
        super(str);
        com.amazon.aps.iva.yb0.j.f(str, "message");
    }
}
