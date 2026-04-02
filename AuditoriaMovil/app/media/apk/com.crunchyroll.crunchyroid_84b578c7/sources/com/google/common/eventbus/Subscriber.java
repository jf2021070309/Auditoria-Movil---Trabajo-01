package com.google.common.eventbus;

import com.amazon.aps.iva.d90.b;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.j2objc.annotations.Weak;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
@ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public class Subscriber {
    @Weak
    private EventBus bus;
    private final Executor executor;
    private final Method method;
    @VisibleForTesting
    final Object target;

    @VisibleForTesting
    /* loaded from: classes3.dex */
    public static final class SynchronizedSubscriber extends Subscriber {
        @Override // com.google.common.eventbus.Subscriber
        public void invokeSubscriberMethod(Object obj) throws InvocationTargetException {
            synchronized (this) {
                super.invokeSubscriberMethod(obj);
            }
        }

        private SynchronizedSubscriber(EventBus eventBus, Object obj, Method method) {
            super(eventBus, obj, method);
        }
    }

    private SubscriberExceptionContext context(Object obj) {
        return new SubscriberExceptionContext(this.bus, obj, this.target, this.method);
    }

    public static Subscriber create(EventBus eventBus, Object obj, Method method) {
        if (isDeclaredThreadSafe(method)) {
            return new Subscriber(eventBus, obj, method);
        }
        return new SynchronizedSubscriber(eventBus, obj, method);
    }

    private static boolean isDeclaredThreadSafe(Method method) {
        if (method.getAnnotation(AllowConcurrentEvents.class) != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dispatchEvent$0(Object obj) {
        try {
            invokeSubscriberMethod(obj);
        } catch (InvocationTargetException e) {
            this.bus.handleSubscriberException(e.getCause(), context(obj));
        }
    }

    public final void dispatchEvent(final Object obj) {
        this.executor.execute(new Runnable() { // from class: com.google.common.eventbus.a
            @Override // java.lang.Runnable
            public final void run() {
                this.lambda$dispatchEvent$0(obj);
            }
        });
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Subscriber)) {
            return false;
        }
        Subscriber subscriber = (Subscriber) obj;
        if (this.target != subscriber.target || !this.method.equals(subscriber.method)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return System.identityHashCode(this.target) + ((this.method.hashCode() + 31) * 31);
    }

    @VisibleForTesting
    public void invokeSubscriberMethod(Object obj) throws InvocationTargetException {
        try {
            this.method.invoke(this.target, Preconditions.checkNotNull(obj));
        } catch (IllegalAccessException e) {
            String valueOf = String.valueOf(obj);
            throw new Error(b.a(valueOf.length() + 28, "Method became inaccessible: ", valueOf), e);
        } catch (IllegalArgumentException e2) {
            String valueOf2 = String.valueOf(obj);
            throw new Error(b.a(valueOf2.length() + 33, "Method rejected target/argument: ", valueOf2), e2);
        } catch (InvocationTargetException e3) {
            if (e3.getCause() instanceof Error) {
                throw ((Error) e3.getCause());
            }
            throw e3;
        }
    }

    private Subscriber(EventBus eventBus, Object obj, Method method) {
        this.bus = eventBus;
        this.target = Preconditions.checkNotNull(obj);
        this.method = method;
        method.setAccessible(true);
        this.executor = eventBus.executor();
    }
}
