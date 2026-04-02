package i.a.h2.w;

import java.util.concurrent.CancellationException;
/* loaded from: classes2.dex */
public final class a extends CancellationException {
    public final i.a.h2.c<?> a;

    public a(i.a.h2.c<?> cVar) {
        super("Flow was aborted, no more elements needed");
        this.a = cVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
