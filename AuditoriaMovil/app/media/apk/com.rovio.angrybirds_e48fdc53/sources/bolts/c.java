package bolts;

import bolts.Task;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class c {
    private Task<?> a;

    public c(Task<?> task) {
        this.a = task;
    }

    protected void finalize() {
        Task.UnobservedExceptionHandler unobservedExceptionHandler;
        try {
            Task<?> task = this.a;
            if (task != null && (unobservedExceptionHandler = Task.getUnobservedExceptionHandler()) != null) {
                unobservedExceptionHandler.unobservedException(task, new UnobservedTaskException(task.getError()));
            }
        } finally {
            super.finalize();
        }
    }

    public void a() {
        this.a = null;
    }
}
