package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.j2objc.annotations.ReflectionSupport;
import com.segment.analytics.internal.Utils;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;
/* JADX INFO: Access modifiers changed from: package-private */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = Utils.DEFAULT_COLLECT_DEVICE_ID)
@ReflectionSupport(ReflectionSupport.Level.FULL)
/* loaded from: classes3.dex */
public abstract class InterruptibleTask<T> extends AtomicReference<Runnable> implements Runnable {
    private static final int MAX_BUSY_WAIT_SPINS = 1000;
    private static final Runnable DONE = new DoNothingRunnable();
    private static final Runnable PARKED = new DoNothingRunnable();

    @VisibleForTesting
    /* loaded from: classes3.dex */
    public static final class Blocker extends AbstractOwnableSynchronizer implements Runnable {
        private final InterruptibleTask<?> task;

        /* JADX INFO: Access modifiers changed from: private */
        public void setOwner(Thread thread) {
            setExclusiveOwnerThread(thread);
        }

        public String toString() {
            return this.task.toString();
        }

        private Blocker(InterruptibleTask<?> interruptibleTask) {
            this.task = interruptibleTask;
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    private void waitForInterrupt(Thread thread) {
        Runnable runnable = get();
        Blocker blocker = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof Blocker;
            if (!z2 && runnable != PARKED) {
                break;
            }
            if (z2) {
                blocker = (Blocker) runnable;
            }
            i++;
            if (i > MAX_BUSY_WAIT_SPINS) {
                Runnable runnable2 = PARKED;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    if (!Thread.interrupted() && !z) {
                        z = false;
                    } else {
                        z = true;
                    }
                    LockSupport.park(blocker);
                }
            } else {
                Thread.yield();
            }
            runnable = get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    public abstract void afterRanInterruptiblyFailure(Throwable th);

    public abstract void afterRanInterruptiblySuccess(@ParametricNullness T t);

    public final void interruptTask() {
        Runnable runnable = get();
        if (runnable instanceof Thread) {
            Blocker blocker = new Blocker();
            blocker.setOwner(Thread.currentThread());
            if (compareAndSet(runnable, blocker)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (getAndSet(DONE) == PARKED) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    public abstract boolean isDone();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (!compareAndSet(null, currentThread)) {
            return;
        }
        boolean z = !isDone();
        if (z) {
            try {
                obj = runInterruptibly();
            } catch (Throwable th) {
                if (!compareAndSet(currentThread, DONE)) {
                    waitForInterrupt(currentThread);
                }
                if (z) {
                    afterRanInterruptiblyFailure(th);
                    return;
                }
                return;
            }
        }
        if (!compareAndSet(currentThread, DONE)) {
            waitForInterrupt(currentThread);
        }
        if (z) {
            afterRanInterruptiblySuccess(NullnessCasts.uncheckedCastNullableTToT(obj));
        }
    }

    @ParametricNullness
    public abstract T runInterruptibly() throws Exception;

    public abstract String toPendingString();

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = get();
        if (runnable == DONE) {
            str = "running=[DONE]";
        } else if (runnable instanceof Blocker) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            str = com.amazon.aps.iva.d90.a.b(defpackage.e.a(name, 21), "running=[RUNNING ON ", name, "]");
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String pendingString = toPendingString();
        return com.amazon.aps.iva.d90.a.b(defpackage.e.a(pendingString, defpackage.e.a(str, 2)), str, ", ", pendingString);
    }

    /* loaded from: classes3.dex */
    public static final class DoNothingRunnable implements Runnable {
        private DoNothingRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }
}
