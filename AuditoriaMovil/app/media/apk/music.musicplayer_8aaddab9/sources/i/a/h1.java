package i.a;

import java.util.concurrent.CancellationException;
/* loaded from: classes2.dex */
public final class h1 extends CancellationException {
    public final g1 a;

    public h1(String str, Throwable th, g1 g1Var) {
        super(str);
        this.a = g1Var;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof h1) {
                h1 h1Var = (h1) obj;
                if (!h.o.c.j.a(h1Var.getMessage(), getMessage()) || !h.o.c.j.a(h1Var.a, this.a) || !h.o.c.j.a(h1Var.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        h.o.c.j.c(message);
        int hashCode = (this.a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause == null ? 0 : cause.hashCode());
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.a;
    }
}
