package bolts;

import java.util.Locale;
/* loaded from: classes2.dex */
public class CancellationToken {
    private final CancellationTokenSource a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CancellationToken(CancellationTokenSource cancellationTokenSource) {
        this.a = cancellationTokenSource;
    }

    public boolean isCancellationRequested() {
        return this.a.isCancellationRequested();
    }

    public CancellationTokenRegistration register(Runnable runnable) {
        return this.a.a(runnable);
    }

    public void throwIfCancellationRequested() {
        this.a.a();
    }

    public String toString() {
        return String.format(Locale.US, "%s@%s[cancellationRequested=%s]", getClass().getName(), Integer.toHexString(hashCode()), Boolean.toString(this.a.isCancellationRequested()));
    }
}
