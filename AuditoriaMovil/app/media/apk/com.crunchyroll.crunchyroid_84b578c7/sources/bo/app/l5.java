package bo.app;
/* loaded from: classes.dex */
public final class l5 extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(String str, Throwable th) {
        super(str, th);
        com.amazon.aps.iva.yb0.j.f(str, "message");
        com.amazon.aps.iva.yb0.j.f(th, "innerException");
    }
}
