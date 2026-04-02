package rx.internal.util;

import java.util.Queue;
import rx.Observer;
import rx.Subscription;
import rx.exceptions.MissingBackpressureException;
import rx.internal.operators.NotificationLite;
import rx.internal.util.unsafe.SpmcArrayQueue;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;
/* loaded from: classes4.dex */
public class RxRingBuffer implements Subscription {
    public static final int SIZE;
    public static final ObjectPool<Queue<Object>> SPMC_POOL;
    public static final ObjectPool<Queue<Object>> SPSC_POOL;
    private static final NotificationLite<Object> a = NotificationLite.instance();
    private Queue<Object> b;
    private final int c;
    private final ObjectPool<Queue<Object>> d;
    public volatile Object terminalState;

    static {
        int i = 128;
        if (PlatformDependent.isAndroid()) {
            i = 16;
        }
        String property = System.getProperty("rx.ring-buffer.size");
        if (property != null) {
            try {
                i = Integer.parseInt(property);
            } catch (NumberFormatException e) {
                System.err.println("Failed to set 'rx.buffer.size' with value " + property + " => " + e.getMessage());
            }
        }
        SIZE = i;
        SPSC_POOL = new ObjectPool<Queue<Object>>() { // from class: rx.internal.util.RxRingBuffer.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // rx.internal.util.ObjectPool
            /* renamed from: a */
            public SpscArrayQueue<Object> createObject() {
                return new SpscArrayQueue<>(RxRingBuffer.SIZE);
            }
        };
        SPMC_POOL = new ObjectPool<Queue<Object>>() { // from class: rx.internal.util.RxRingBuffer.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // rx.internal.util.ObjectPool
            /* renamed from: a */
            public SpmcArrayQueue<Object> createObject() {
                return new SpmcArrayQueue<>(RxRingBuffer.SIZE);
            }
        };
    }

    public static RxRingBuffer getSpscInstance() {
        return UnsafeAccess.isUnsafeAvailable() ? new RxRingBuffer(SPSC_POOL, SIZE) : new RxRingBuffer();
    }

    public static RxRingBuffer getSpmcInstance() {
        return UnsafeAccess.isUnsafeAvailable() ? new RxRingBuffer(SPMC_POOL, SIZE) : new RxRingBuffer();
    }

    private RxRingBuffer(Queue<Object> queue, int i) {
        this.b = queue;
        this.d = null;
        this.c = i;
    }

    private RxRingBuffer(ObjectPool<Queue<Object>> objectPool, int i) {
        this.d = objectPool;
        this.b = objectPool.borrowObject();
        this.c = i;
    }

    public synchronized void release() {
        Queue<Object> queue = this.b;
        ObjectPool<Queue<Object>> objectPool = this.d;
        if (objectPool != null && queue != null) {
            queue.clear();
            this.b = null;
            objectPool.returnObject(queue);
        }
    }

    @Override // rx.Subscription
    public void unsubscribe() {
        release();
    }

    RxRingBuffer() {
        this(new SynchronizedQueue(SIZE), SIZE);
    }

    public void onNext(Object obj) {
        boolean z = true;
        boolean z2 = false;
        synchronized (this) {
            Queue<Object> queue = this.b;
            if (queue == null) {
                z2 = true;
                z = false;
            } else if (queue.offer(a.next(obj))) {
                z = false;
            }
        }
        if (z2) {
            throw new IllegalStateException("This instance has been unsubscribed and the queue is no longer usable.");
        }
        if (z) {
            throw new MissingBackpressureException();
        }
    }

    public void onCompleted() {
        if (this.terminalState == null) {
            this.terminalState = a.completed();
        }
    }

    public void onError(Throwable th) {
        if (this.terminalState == null) {
            this.terminalState = a.error(th);
        }
    }

    public int available() {
        return this.c - count();
    }

    public int capacity() {
        return this.c;
    }

    public int count() {
        Queue<Object> queue = this.b;
        if (queue == null) {
            return 0;
        }
        return queue.size();
    }

    public boolean isEmpty() {
        Queue<Object> queue = this.b;
        return queue == null || queue.isEmpty();
    }

    public Object poll() {
        Object obj = null;
        synchronized (this) {
            Queue<Object> queue = this.b;
            if (queue != null) {
                Object poll = queue.poll();
                obj = this.terminalState;
                if (poll == null && obj != null && queue.peek() == null) {
                    this.terminalState = null;
                } else {
                    obj = poll;
                }
            }
        }
        return obj;
    }

    public Object peek() {
        Object obj;
        synchronized (this) {
            Queue<Object> queue = this.b;
            if (queue == null) {
                obj = null;
            } else {
                Object peek = queue.peek();
                obj = this.terminalState;
                if (peek != null || obj == null || queue.peek() != null) {
                    obj = peek;
                }
            }
        }
        return obj;
    }

    public boolean isCompleted(Object obj) {
        return a.isCompleted(obj);
    }

    public boolean isError(Object obj) {
        return a.isError(obj);
    }

    public Object getValue(Object obj) {
        return a.getValue(obj);
    }

    public boolean accept(Object obj, Observer observer) {
        return a.accept(observer, obj);
    }

    public Throwable asError(Object obj) {
        return a.getError(obj);
    }

    @Override // rx.Subscription
    public boolean isUnsubscribed() {
        return this.b == null;
    }
}
