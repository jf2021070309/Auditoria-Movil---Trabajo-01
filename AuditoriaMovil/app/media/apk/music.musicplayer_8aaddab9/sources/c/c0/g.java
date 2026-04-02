package c.c0;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public enum g implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        h.o.c.j.e(runnable, "command");
        runnable.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}
