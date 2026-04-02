package f.a.h.d;
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: f.a.h.d.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0200a extends Throwable {
        public C0200a() {
            super("No further exceptions");
        }

        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
            return this;
        }
    }

    static {
        new C0200a();
    }

    public static RuntimeException a(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        return th instanceof RuntimeException ? (RuntimeException) th : new RuntimeException(th);
    }
}
