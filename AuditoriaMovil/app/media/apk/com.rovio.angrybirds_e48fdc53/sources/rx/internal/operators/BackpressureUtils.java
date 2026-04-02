package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import rx.Subscriber;
import rx.functions.Func1;
import rx.internal.util.UtilityFunctions;
/* loaded from: classes4.dex */
public final class BackpressureUtils {
    private BackpressureUtils() {
        throw new IllegalStateException("No instances!");
    }

    public static long getAndAddRequest(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j2, addCap(j2, j)));
        return j2;
    }

    public static long multiplyCap(long j, long j2) {
        long j3 = j * j2;
        if (((j | j2) >>> 31) != 0 && j2 != 0 && j3 / j2 != j) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    public static long addCap(long j, long j2) {
        long j3 = j + j2;
        if (j3 < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    public static <T> void postCompleteDone(AtomicLong atomicLong, Queue<T> queue, Subscriber<? super T> subscriber) {
        postCompleteDone(atomicLong, queue, subscriber, UtilityFunctions.identity());
    }

    public static <T> boolean postCompleteRequest(AtomicLong atomicLong, long j, Queue<T> queue, Subscriber<? super T> subscriber) {
        return postCompleteRequest(atomicLong, j, queue, subscriber, UtilityFunctions.identity());
    }

    public static <T, R> void postCompleteDone(AtomicLong atomicLong, Queue<T> queue, Subscriber<? super R> subscriber, Func1<? super T, ? extends R> func1) {
        long j;
        do {
            j = atomicLong.get();
            if ((j & Long.MIN_VALUE) != 0) {
                return;
            }
        } while (!atomicLong.compareAndSet(j, j | Long.MIN_VALUE));
        if (j != 0) {
            a(atomicLong, queue, subscriber, func1);
        }
    }

    public static <T, R> boolean postCompleteRequest(AtomicLong atomicLong, long j, Queue<T> queue, Subscriber<? super R> subscriber, Func1<? super T, ? extends R> func1) {
        long j2;
        long j3;
        if (j < 0) {
            throw new IllegalArgumentException("n >= 0 required but it was " + j);
        }
        if (j == 0) {
            return (atomicLong.get() & Long.MIN_VALUE) == 0;
        }
        do {
            j2 = atomicLong.get();
            j3 = Long.MIN_VALUE & j2;
        } while (!atomicLong.compareAndSet(j2, addCap(Long.MAX_VALUE & j2, j) | j3));
        if (j2 != Long.MIN_VALUE) {
            return j3 == 0;
        }
        a(atomicLong, queue, subscriber, func1);
        return false;
    }

    static <T, R> void a(AtomicLong atomicLong, Queue<T> queue, Subscriber<? super R> subscriber, Func1<? super T, ? extends R> func1) {
        long j = atomicLong.get();
        if (j == Long.MAX_VALUE) {
            while (!subscriber.isUnsubscribed()) {
                Object poll = queue.poll();
                if (poll == null) {
                    subscriber.onCompleted();
                    return;
                }
                subscriber.onNext((R) func1.call(poll));
            }
            return;
        }
        long j2 = j;
        long j3 = Long.MIN_VALUE;
        while (true) {
            if (j3 != j2) {
                if (!subscriber.isUnsubscribed()) {
                    Object poll2 = queue.poll();
                    if (poll2 == null) {
                        subscriber.onCompleted();
                        return;
                    } else {
                        subscriber.onNext((R) func1.call(poll2));
                        j3++;
                    }
                } else {
                    return;
                }
            } else {
                if (j3 == j2) {
                    if (!subscriber.isUnsubscribed()) {
                        if (queue.isEmpty()) {
                            subscriber.onCompleted();
                            return;
                        }
                    } else {
                        return;
                    }
                }
                j2 = atomicLong.get();
                if (j2 == j3) {
                    long addAndGet = atomicLong.addAndGet(-(j3 & Long.MAX_VALUE));
                    if (addAndGet == Long.MIN_VALUE) {
                        return;
                    }
                    j2 = addAndGet;
                    j3 = Long.MIN_VALUE;
                } else {
                    continue;
                }
            }
        }
    }

    public static long produced(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j3 = j2 - j;
            if (j3 < 0) {
                throw new IllegalStateException("More produced than requested: " + j3);
            }
        } while (!atomicLong.compareAndSet(j2, j3));
        return j3;
    }

    public static boolean validate(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("n >= 0 required but it was " + j);
        }
        return j != 0;
    }
}
