package rx.exceptions;

import java.util.HashSet;
import rx.plugins.RxJavaHooks;
/* loaded from: classes4.dex */
public final class AssemblyStackTraceException extends RuntimeException {
    private static final long serialVersionUID = 2038859767182585852L;

    public AssemblyStackTraceException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this;
    }

    public void attachTo(Throwable th) {
        HashSet hashSet = new HashSet();
        while (th.getCause() != null) {
            th = th.getCause();
            if (!hashSet.add(th)) {
                RxJavaHooks.onError(this);
                return;
            }
        }
        th.initCause(this);
    }

    public static AssemblyStackTraceException find(Throwable th) {
        HashSet hashSet = new HashSet();
        Throwable th2 = th;
        while (!(th2 instanceof AssemblyStackTraceException)) {
            if (th2 == null || th2.getCause() == null) {
                return null;
            }
            th2 = th2.getCause();
            if (!hashSet.add(th2)) {
                return null;
            }
        }
        return (AssemblyStackTraceException) th2;
    }
}
