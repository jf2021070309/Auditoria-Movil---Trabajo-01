package e.d.d.m.j.q;
/* loaded from: classes2.dex */
public class e {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7538b;

    /* renamed from: c  reason: collision with root package name */
    public final StackTraceElement[] f7539c;

    /* renamed from: d  reason: collision with root package name */
    public final e f7540d;

    public e(Throwable th, d dVar) {
        this.a = th.getLocalizedMessage();
        this.f7538b = th.getClass().getName();
        this.f7539c = dVar.a(th.getStackTrace());
        Throwable cause = th.getCause();
        this.f7540d = cause != null ? new e(cause, dVar) : null;
    }
}
