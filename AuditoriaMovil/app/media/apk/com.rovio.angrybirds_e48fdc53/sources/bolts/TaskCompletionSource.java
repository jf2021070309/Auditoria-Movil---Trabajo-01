package bolts;
/* loaded from: classes2.dex */
public class TaskCompletionSource<TResult> {
    private final Task<TResult> a = new Task<>();

    public Task<TResult> getTask() {
        return this.a;
    }

    public boolean trySetCancelled() {
        return this.a.a();
    }

    public boolean trySetResult(TResult tresult) {
        return this.a.a((Task<TResult>) tresult);
    }

    public boolean trySetError(Exception exc) {
        return this.a.a(exc);
    }

    public void setCancelled() {
        if (!trySetCancelled()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    public void setResult(TResult tresult) {
        if (!trySetResult(tresult)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }

    public void setError(Exception exc) {
        if (!trySetError(exc)) {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }
}
