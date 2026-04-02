package bolts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public class Task<TResult> {
    private static volatile UnobservedExceptionHandler b;
    private boolean d;
    private boolean e;
    private TResult f;
    private Exception g;
    private boolean h;
    private c i;
    public static final ExecutorService BACKGROUND_EXECUTOR = b.a();
    private static final Executor a = b.c();
    public static final Executor UI_THREAD_EXECUTOR = a.b();
    private static Task<?> k = new Task<>((Object) null);
    private static Task<Boolean> l = new Task<>(true);
    private static Task<Boolean> m = new Task<>(false);
    private static Task<?> n = new Task<>(true);
    private final Object c = new Object();
    private List<Continuation<TResult, Void>> j = new ArrayList();

    /* loaded from: classes2.dex */
    public interface UnobservedExceptionHandler {
        void unobservedException(Task<?> task, UnobservedTaskException unobservedTaskException);
    }

    public static UnobservedExceptionHandler getUnobservedExceptionHandler() {
        return b;
    }

    public static void setUnobservedExceptionHandler(UnobservedExceptionHandler unobservedExceptionHandler) {
        b = unobservedExceptionHandler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task() {
    }

    private Task(TResult tresult) {
        a((Task<TResult>) tresult);
    }

    private Task(boolean z) {
        if (z) {
            a();
        } else {
            a((Task<TResult>) null);
        }
    }

    public static <TResult> Task<TResult>.TaskCompletionSource create() {
        Task task = new Task();
        task.getClass();
        return new TaskCompletionSource();
    }

    public boolean isCompleted() {
        boolean z;
        synchronized (this.c) {
            z = this.d;
        }
        return z;
    }

    public boolean isCancelled() {
        boolean z;
        synchronized (this.c) {
            z = this.e;
        }
        return z;
    }

    public boolean isFaulted() {
        boolean z;
        synchronized (this.c) {
            z = getError() != null;
        }
        return z;
    }

    public TResult getResult() {
        TResult tresult;
        synchronized (this.c) {
            tresult = this.f;
        }
        return tresult;
    }

    public Exception getError() {
        Exception exc;
        synchronized (this.c) {
            if (this.g != null) {
                this.h = true;
                if (this.i != null) {
                    this.i.a();
                    this.i = null;
                }
            }
            exc = this.g;
        }
        return exc;
    }

    public void waitForCompletion() {
        synchronized (this.c) {
            if (!isCompleted()) {
                this.c.wait();
            }
        }
    }

    public boolean waitForCompletion(long j, TimeUnit timeUnit) {
        boolean isCompleted;
        synchronized (this.c) {
            if (!isCompleted()) {
                this.c.wait(timeUnit.toMillis(j));
            }
            isCompleted = isCompleted();
        }
        return isCompleted;
    }

    public static <TResult> Task<TResult> forResult(TResult tresult) {
        if (tresult == null) {
            return (Task<TResult>) k;
        }
        if (tresult instanceof Boolean) {
            return ((Boolean) tresult).booleanValue() ? (Task<TResult>) l : (Task<TResult>) m;
        }
        bolts.TaskCompletionSource taskCompletionSource = new bolts.TaskCompletionSource();
        taskCompletionSource.setResult(tresult);
        return taskCompletionSource.getTask();
    }

    public static <TResult> Task<TResult> forError(Exception exc) {
        bolts.TaskCompletionSource taskCompletionSource = new bolts.TaskCompletionSource();
        taskCompletionSource.setError(exc);
        return taskCompletionSource.getTask();
    }

    public static <TResult> Task<TResult> cancelled() {
        return (Task<TResult>) n;
    }

    public static Task<Void> delay(long j) {
        return a(j, b.b(), null);
    }

    public static Task<Void> delay(long j, CancellationToken cancellationToken) {
        return a(j, b.b(), cancellationToken);
    }

    static Task<Void> a(long j, ScheduledExecutorService scheduledExecutorService, CancellationToken cancellationToken) {
        if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
            return cancelled();
        }
        if (j <= 0) {
            return forResult(null);
        }
        final bolts.TaskCompletionSource taskCompletionSource = new bolts.TaskCompletionSource();
        final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: bolts.Task.1
            @Override // java.lang.Runnable
            public void run() {
                bolts.TaskCompletionSource.this.trySetResult(null);
            }
        }, j, TimeUnit.MILLISECONDS);
        if (cancellationToken != null) {
            cancellationToken.register(new Runnable() { // from class: bolts.Task.8
                @Override // java.lang.Runnable
                public void run() {
                    schedule.cancel(true);
                    taskCompletionSource.trySetCancelled();
                }
            });
        }
        return taskCompletionSource.getTask();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <TOut> Task<TOut> cast() {
        return this;
    }

    public Task<Void> makeVoid() {
        return continueWithTask((Continuation<TResult, Task<Void>>) new Continuation<TResult, Task<Void>>() { // from class: bolts.Task.9
            @Override // bolts.Continuation
            /* renamed from: a */
            public Task<Void> then(Task<TResult> task) {
                if (task.isCancelled()) {
                    return Task.cancelled();
                }
                if (task.isFaulted()) {
                    return Task.forError(task.getError());
                }
                return Task.forResult(null);
            }
        });
    }

    public static <TResult> Task<TResult> callInBackground(Callable<TResult> callable) {
        return call(callable, BACKGROUND_EXECUTOR, null);
    }

    public static <TResult> Task<TResult> callInBackground(Callable<TResult> callable, CancellationToken cancellationToken) {
        return call(callable, BACKGROUND_EXECUTOR, cancellationToken);
    }

    public static <TResult> Task<TResult> call(Callable<TResult> callable, Executor executor) {
        return call(callable, executor, null);
    }

    public static <TResult> Task<TResult> call(final Callable<TResult> callable, Executor executor, final CancellationToken cancellationToken) {
        final bolts.TaskCompletionSource taskCompletionSource = new bolts.TaskCompletionSource();
        try {
            executor.execute(new Runnable() { // from class: bolts.Task.10
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    if (CancellationToken.this != null && CancellationToken.this.isCancellationRequested()) {
                        taskCompletionSource.setCancelled();
                        return;
                    }
                    try {
                        taskCompletionSource.setResult(callable.call());
                    } catch (CancellationException e) {
                        taskCompletionSource.setCancelled();
                    } catch (Exception e2) {
                        taskCompletionSource.setError(e2);
                    }
                }
            });
        } catch (Exception e) {
            taskCompletionSource.setError(new ExecutorException(e));
        }
        return taskCompletionSource.getTask();
    }

    public static <TResult> Task<TResult> call(Callable<TResult> callable) {
        return call(callable, a, null);
    }

    public static <TResult> Task<TResult> call(Callable<TResult> callable, CancellationToken cancellationToken) {
        return call(callable, a, cancellationToken);
    }

    public static <TResult> Task<Task<TResult>> whenAnyResult(Collection<? extends Task<TResult>> collection) {
        if (collection.size() == 0) {
            return forResult(null);
        }
        final bolts.TaskCompletionSource taskCompletionSource = new bolts.TaskCompletionSource();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (Task<TResult> task : collection) {
            task.continueWith((Continuation<TResult, Void>) new Continuation<TResult, Void>() { // from class: bolts.Task.11
                @Override // bolts.Continuation
                /* renamed from: a */
                public Void then(Task<TResult> task2) {
                    if (atomicBoolean.compareAndSet(false, true)) {
                        taskCompletionSource.setResult(task2);
                        return null;
                    }
                    task2.getError();
                    return null;
                }
            });
        }
        return taskCompletionSource.getTask();
    }

    public static Task<Task<?>> whenAny(Collection<? extends Task<?>> collection) {
        if (collection.size() == 0) {
            return forResult(null);
        }
        final bolts.TaskCompletionSource taskCompletionSource = new bolts.TaskCompletionSource();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (Task<?> task : collection) {
            task.continueWith(new Continuation<Object, Void>() { // from class: bolts.Task.12
                @Override // bolts.Continuation
                /* renamed from: a */
                public Void then(Task<Object> task2) {
                    if (atomicBoolean.compareAndSet(false, true)) {
                        taskCompletionSource.setResult(task2);
                        return null;
                    }
                    task2.getError();
                    return null;
                }
            });
        }
        return taskCompletionSource.getTask();
    }

    public static <TResult> Task<List<TResult>> whenAllResult(final Collection<? extends Task<TResult>> collection) {
        return (Task<List<TResult>>) whenAll(collection).onSuccess((Continuation<Void, List<TResult>>) new Continuation<Void, List<TResult>>() { // from class: bolts.Task.13
            @Override // bolts.Continuation
            /* renamed from: a */
            public List<TResult> then(Task<Void> task) {
                if (collection.size() == 0) {
                    return Collections.emptyList();
                }
                ArrayList arrayList = new ArrayList();
                for (Task task2 : collection) {
                    arrayList.add(task2.getResult());
                }
                return arrayList;
            }
        });
    }

    public static Task<Void> whenAll(Collection<? extends Task<?>> collection) {
        if (collection.size() == 0) {
            return forResult(null);
        }
        final bolts.TaskCompletionSource taskCompletionSource = new bolts.TaskCompletionSource();
        final ArrayList arrayList = new ArrayList();
        final Object obj = new Object();
        final AtomicInteger atomicInteger = new AtomicInteger(collection.size());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (Task<?> task : collection) {
            task.continueWith(new Continuation<Object, Void>() { // from class: bolts.Task.14
                @Override // bolts.Continuation
                /* renamed from: a */
                public Void then(Task<Object> task2) {
                    if (task2.isFaulted()) {
                        synchronized (obj) {
                            arrayList.add(task2.getError());
                        }
                    }
                    if (task2.isCancelled()) {
                        atomicBoolean.set(true);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        if (arrayList.size() != 0) {
                            if (arrayList.size() == 1) {
                                taskCompletionSource.setError((Exception) arrayList.get(0));
                            } else {
                                taskCompletionSource.setError(new AggregateException(String.format("There were %d exceptions.", Integer.valueOf(arrayList.size())), arrayList));
                            }
                        } else if (atomicBoolean.get()) {
                            taskCompletionSource.setCancelled();
                        } else {
                            taskCompletionSource.setResult(null);
                        }
                    }
                    return null;
                }
            });
        }
        return taskCompletionSource.getTask();
    }

    public Task<Void> continueWhile(Callable<Boolean> callable, Continuation<Void, Task<Void>> continuation) {
        return continueWhile(callable, continuation, a, null);
    }

    public Task<Void> continueWhile(Callable<Boolean> callable, Continuation<Void, Task<Void>> continuation, CancellationToken cancellationToken) {
        return continueWhile(callable, continuation, a, cancellationToken);
    }

    public Task<Void> continueWhile(Callable<Boolean> callable, Continuation<Void, Task<Void>> continuation, Executor executor) {
        return continueWhile(callable, continuation, executor, null);
    }

    public Task<Void> continueWhile(final Callable<Boolean> callable, final Continuation<Void, Task<Void>> continuation, final Executor executor, final CancellationToken cancellationToken) {
        final Capture capture = new Capture();
        capture.set(new Continuation<Void, Task<Void>>() { // from class: bolts.Task.15
            @Override // bolts.Continuation
            /* renamed from: a */
            public Task<Void> then(Task<Void> task) {
                if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                    return Task.cancelled();
                }
                if (((Boolean) callable.call()).booleanValue()) {
                    return Task.forResult(null).onSuccessTask(continuation, executor).onSuccessTask((Continuation) capture.get(), executor);
                }
                return Task.forResult(null);
            }
        });
        return makeVoid().continueWithTask((Continuation) capture.get(), executor);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation, Executor executor) {
        return continueWith(continuation, executor, null);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(final Continuation<TResult, TContinuationResult> continuation, final Executor executor, final CancellationToken cancellationToken) {
        boolean isCompleted;
        final bolts.TaskCompletionSource taskCompletionSource = new bolts.TaskCompletionSource();
        synchronized (this.c) {
            isCompleted = isCompleted();
            if (!isCompleted) {
                this.j.add(new Continuation<TResult, Void>() { // from class: bolts.Task.2
                    @Override // bolts.Continuation
                    /* renamed from: a */
                    public Void then(Task<TResult> task) {
                        Task.c(taskCompletionSource, continuation, task, executor, cancellationToken);
                        return null;
                    }
                });
            }
        }
        if (isCompleted) {
            c(taskCompletionSource, continuation, this, executor, cancellationToken);
        }
        return taskCompletionSource.getTask();
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation) {
        return continueWith(continuation, a, null);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation, CancellationToken cancellationToken) {
        return continueWith(continuation, a, cancellationToken);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation, Executor executor) {
        return continueWithTask(continuation, executor, null);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(final Continuation<TResult, Task<TContinuationResult>> continuation, final Executor executor, final CancellationToken cancellationToken) {
        boolean isCompleted;
        final bolts.TaskCompletionSource taskCompletionSource = new bolts.TaskCompletionSource();
        synchronized (this.c) {
            isCompleted = isCompleted();
            if (!isCompleted) {
                this.j.add(new Continuation<TResult, Void>() { // from class: bolts.Task.3
                    @Override // bolts.Continuation
                    /* renamed from: a */
                    public Void then(Task<TResult> task) {
                        Task.d(taskCompletionSource, continuation, task, executor, cancellationToken);
                        return null;
                    }
                });
            }
        }
        if (isCompleted) {
            d(taskCompletionSource, continuation, this, executor, cancellationToken);
        }
        return taskCompletionSource.getTask();
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation) {
        return continueWithTask(continuation, a, null);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation, CancellationToken cancellationToken) {
        return continueWithTask(continuation, a, cancellationToken);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccess(Continuation<TResult, TContinuationResult> continuation, Executor executor) {
        return onSuccess(continuation, executor, null);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccess(final Continuation<TResult, TContinuationResult> continuation, Executor executor, final CancellationToken cancellationToken) {
        return continueWithTask(new Continuation<TResult, Task<TContinuationResult>>() { // from class: bolts.Task.4
            @Override // bolts.Continuation
            /* renamed from: a */
            public Task<TContinuationResult> then(Task<TResult> task) {
                if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                    return Task.cancelled();
                }
                if (task.isFaulted()) {
                    return Task.forError(task.getError());
                }
                if (task.isCancelled()) {
                    return Task.cancelled();
                }
                return task.continueWith(continuation);
            }
        }, executor);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccess(Continuation<TResult, TContinuationResult> continuation) {
        return onSuccess(continuation, a, null);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccess(Continuation<TResult, TContinuationResult> continuation, CancellationToken cancellationToken) {
        return onSuccess(continuation, a, cancellationToken);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(Continuation<TResult, Task<TContinuationResult>> continuation, Executor executor) {
        return onSuccessTask(continuation, executor, null);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(final Continuation<TResult, Task<TContinuationResult>> continuation, Executor executor, final CancellationToken cancellationToken) {
        return continueWithTask(new Continuation<TResult, Task<TContinuationResult>>() { // from class: bolts.Task.5
            @Override // bolts.Continuation
            /* renamed from: a */
            public Task<TContinuationResult> then(Task<TResult> task) {
                if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                    return Task.cancelled();
                }
                if (task.isFaulted()) {
                    return Task.forError(task.getError());
                }
                if (task.isCancelled()) {
                    return Task.cancelled();
                }
                return task.continueWithTask(continuation);
            }
        }, executor);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(Continuation<TResult, Task<TContinuationResult>> continuation) {
        return onSuccessTask(continuation, a);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(Continuation<TResult, Task<TContinuationResult>> continuation, CancellationToken cancellationToken) {
        return onSuccessTask(continuation, a, cancellationToken);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <TContinuationResult, TResult> void c(final bolts.TaskCompletionSource<TContinuationResult> taskCompletionSource, final Continuation<TResult, TContinuationResult> continuation, final Task<TResult> task, Executor executor, final CancellationToken cancellationToken) {
        try {
            executor.execute(new Runnable() { // from class: bolts.Task.6
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    if (CancellationToken.this != null && CancellationToken.this.isCancellationRequested()) {
                        taskCompletionSource.setCancelled();
                        return;
                    }
                    try {
                        taskCompletionSource.setResult(continuation.then(task));
                    } catch (CancellationException e) {
                        taskCompletionSource.setCancelled();
                    } catch (Exception e2) {
                        taskCompletionSource.setError(e2);
                    }
                }
            });
        } catch (Exception e) {
            taskCompletionSource.setError(new ExecutorException(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <TContinuationResult, TResult> void d(final bolts.TaskCompletionSource<TContinuationResult> taskCompletionSource, final Continuation<TResult, Task<TContinuationResult>> continuation, final Task<TResult> task, Executor executor, final CancellationToken cancellationToken) {
        try {
            executor.execute(new Runnable() { // from class: bolts.Task.7
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0026 -> B:18:0x0011). Please submit an issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0036 -> B:18:0x0011). Please submit an issue!!! */
                @Override // java.lang.Runnable
                public void run() {
                    if (CancellationToken.this != null && CancellationToken.this.isCancellationRequested()) {
                        taskCompletionSource.setCancelled();
                        return;
                    }
                    try {
                        Task task2 = (Task) continuation.then(task);
                        if (task2 == null) {
                            taskCompletionSource.setResult(null);
                        } else {
                            task2.continueWith(new Continuation<TContinuationResult, Void>() { // from class: bolts.Task.7.1
                                @Override // bolts.Continuation
                                /* renamed from: a */
                                public Void then(Task<TContinuationResult> task3) {
                                    if (CancellationToken.this != null && CancellationToken.this.isCancellationRequested()) {
                                        taskCompletionSource.setCancelled();
                                    } else if (task3.isCancelled()) {
                                        taskCompletionSource.setCancelled();
                                    } else if (task3.isFaulted()) {
                                        taskCompletionSource.setError(task3.getError());
                                    } else {
                                        taskCompletionSource.setResult(task3.getResult());
                                    }
                                    return null;
                                }
                            });
                        }
                    } catch (CancellationException e) {
                        taskCompletionSource.setCancelled();
                    } catch (Exception e2) {
                        taskCompletionSource.setError(e2);
                    }
                }
            });
        } catch (Exception e) {
            taskCompletionSource.setError(new ExecutorException(e));
        }
    }

    private void b() {
        synchronized (this.c) {
            for (Continuation<TResult, Void> continuation : this.j) {
                try {
                    continuation.then(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.j = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        boolean z = true;
        synchronized (this.c) {
            if (this.d) {
                z = false;
            } else {
                this.d = true;
                this.e = true;
                this.c.notifyAll();
                b();
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(TResult tresult) {
        boolean z = true;
        synchronized (this.c) {
            if (this.d) {
                z = false;
            } else {
                this.d = true;
                this.f = tresult;
                this.c.notifyAll();
                b();
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(Exception exc) {
        synchronized (this.c) {
            if (this.d) {
                return false;
            }
            this.d = true;
            this.g = exc;
            this.h = false;
            this.c.notifyAll();
            b();
            if (!this.h && getUnobservedExceptionHandler() != null) {
                this.i = new c(this);
            }
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public class TaskCompletionSource extends bolts.TaskCompletionSource<TResult> {
        TaskCompletionSource() {
        }
    }
}
