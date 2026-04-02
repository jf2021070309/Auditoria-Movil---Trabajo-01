package de.greenrobot.event;

import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes4.dex */
public class EventBus {
    private static volatile EventBus b;
    private boolean l;
    static ExecutorService a = Executors.newCachedThreadPool();
    public static String TAG = "Event";
    private static final Map<Class<?>, List<Class<?>>> c = new HashMap();
    private final ThreadLocal<a> g = new ThreadLocal<a>() { // from class: de.greenrobot.event.EventBus.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public a initialValue() {
            return new a();
        }
    };
    private final Map<Class<?>, CopyOnWriteArrayList<h>> d = new HashMap();
    private final Map<Object, List<Class<?>>> e = new HashMap();
    private final Map<Class<?>, Object> f = new ConcurrentHashMap();
    private final c h = new c(this, Looper.getMainLooper(), 10);
    private final b i = new b(this);
    private final de.greenrobot.event.a j = new de.greenrobot.event.a(this);
    private final g k = new g();
    private boolean m = true;

    public static EventBus getDefault() {
        if (b == null) {
            synchronized (EventBus.class) {
                if (b == null) {
                    b = new EventBus();
                }
            }
        }
        return b;
    }

    public static void clearCaches() {
        g.a();
        c.clear();
    }

    public static void skipMethodVerificationFor(Class<?> cls) {
        g.a(cls);
    }

    public static void clearSkipMethodNameVerifications() {
        g.b();
    }

    public void configureLogSubscriberExceptions(boolean z) {
        if (this.l) {
            throw new EventBusException("This method must be called before any registration");
        }
        this.m = z;
    }

    public void register(Object obj) {
        a(obj, "onEvent", false, 0);
    }

    public void register(Object obj, int i) {
        a(obj, "onEvent", false, i);
    }

    @Deprecated
    public void register(Object obj, String str) {
        a(obj, str, false, 0);
    }

    public void registerSticky(Object obj) {
        a(obj, "onEvent", true, 0);
    }

    public void registerSticky(Object obj, int i) {
        a(obj, "onEvent", true, i);
    }

    @Deprecated
    public void registerSticky(Object obj, String str) {
        a(obj, str, true, 0);
    }

    private synchronized void a(Object obj, String str, boolean z, int i) {
        for (f fVar : this.k.a(obj.getClass(), str)) {
            a(obj, fVar, z, i);
        }
    }

    @Deprecated
    public void register(Object obj, Class<?> cls, Class<?>... clsArr) {
        a(obj, "onEvent", false, cls, clsArr);
    }

    @Deprecated
    public void register(Object obj, String str, Class<?> cls, Class<?>... clsArr) {
        a(obj, str, false, cls, clsArr);
    }

    @Deprecated
    public void registerSticky(Object obj, Class<?> cls, Class<?>... clsArr) {
        a(obj, "onEvent", true, cls, clsArr);
    }

    @Deprecated
    public void registerSticky(Object obj, String str, Class<?> cls, Class<?>... clsArr) {
        a(obj, str, true, cls, clsArr);
    }

    private synchronized void a(Object obj, String str, boolean z, Class<?> cls, Class<?>... clsArr) {
        for (f fVar : this.k.a(obj.getClass(), str)) {
            if (cls == fVar.c) {
                a(obj, fVar, z, 0);
            } else if (clsArr != null) {
                int length = clsArr.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (clsArr[i] != fVar.c) {
                            i++;
                        } else {
                            a(obj, fVar, z, 0);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
    }

    private void a(Object obj, f fVar, boolean z, int i) {
        CopyOnWriteArrayList<h> copyOnWriteArrayList;
        Object obj2;
        this.l = true;
        Class<?> cls = fVar.c;
        CopyOnWriteArrayList<h> copyOnWriteArrayList2 = this.d.get(cls);
        h hVar = new h(obj, fVar, i);
        if (copyOnWriteArrayList2 == null) {
            CopyOnWriteArrayList<h> copyOnWriteArrayList3 = new CopyOnWriteArrayList<>();
            this.d.put(cls, copyOnWriteArrayList3);
            copyOnWriteArrayList = copyOnWriteArrayList3;
        } else {
            Iterator<h> it = copyOnWriteArrayList2.iterator();
            while (it.hasNext()) {
                if (it.next().equals(hVar)) {
                    throw new EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
                }
            }
            copyOnWriteArrayList = copyOnWriteArrayList2;
        }
        int size = copyOnWriteArrayList.size();
        for (int i2 = 0; i2 <= size; i2++) {
            if (i2 == size || hVar.c > copyOnWriteArrayList.get(i2).c) {
                copyOnWriteArrayList.add(i2, hVar);
                break;
            }
        }
        List<Class<?>> list = this.e.get(obj);
        if (list == null) {
            list = new ArrayList<>();
            this.e.put(obj, list);
        }
        list.add(cls);
        if (z) {
            synchronized (this.f) {
                obj2 = this.f.get(cls);
            }
            if (obj2 != null) {
                a(hVar, obj2, Looper.getMainLooper() == Looper.myLooper());
            }
        }
    }

    public synchronized boolean isRegistered(Object obj) {
        return this.e.containsKey(obj);
    }

    @Deprecated
    public synchronized void unregister(Object obj, Class<?>... clsArr) {
        if (clsArr.length == 0) {
            throw new IllegalArgumentException("Provide at least one event class");
        }
        List<Class<?>> list = this.e.get(obj);
        if (list != null) {
            for (Class<?> cls : clsArr) {
                a(obj, cls);
                list.remove(cls);
            }
            if (list.isEmpty()) {
                this.e.remove(obj);
            }
        } else {
            Log.w(TAG, "Subscriber to unregister was not registered before: " + obj.getClass());
        }
    }

    private void a(Object obj, Class<?> cls) {
        int i;
        int i2;
        CopyOnWriteArrayList<h> copyOnWriteArrayList = this.d.get(cls);
        if (copyOnWriteArrayList != null) {
            int size = copyOnWriteArrayList.size();
            int i3 = 0;
            while (i3 < size) {
                h hVar = copyOnWriteArrayList.get(i3);
                if (hVar.a == obj) {
                    hVar.d = false;
                    copyOnWriteArrayList.remove(i3);
                    i = i3 - 1;
                    i2 = size - 1;
                } else {
                    i = i3;
                    i2 = size;
                }
                size = i2;
                i3 = i + 1;
            }
        }
    }

    public synchronized void unregister(Object obj) {
        List<Class<?>> list = this.e.get(obj);
        if (list != null) {
            for (Class<?> cls : list) {
                a(obj, cls);
            }
            this.e.remove(obj);
        } else {
            Log.w(TAG, "Subscriber to unregister was not registered before: " + obj.getClass());
        }
    }

    public void post(Object obj) {
        a aVar = this.g.get();
        List<Object> list = aVar.a;
        list.add(obj);
        if (!aVar.b) {
            aVar.c = Looper.getMainLooper() == Looper.myLooper();
            aVar.b = true;
            if (aVar.f) {
                throw new EventBusException("Internal error. Abort state was not reset");
            }
            while (!list.isEmpty()) {
                try {
                    a(list.remove(0), aVar);
                } finally {
                    aVar.b = false;
                    aVar.c = false;
                }
            }
        }
    }

    public void cancelEventDelivery(Object obj) {
        a aVar = this.g.get();
        if (!aVar.b) {
            throw new EventBusException("This method may only be called from inside event handling methods on the posting thread");
        }
        if (obj == null) {
            throw new EventBusException("Event may not be null");
        }
        if (aVar.e != obj) {
            throw new EventBusException("Only the currently handled event may be aborted");
        }
        if (aVar.d.b.b != ThreadMode.PostThread) {
            throw new EventBusException(" event handlers may only abort the incoming event");
        }
        aVar.f = true;
    }

    public void postSticky(Object obj) {
        synchronized (this.f) {
            this.f.put(obj.getClass(), obj);
        }
        post(obj);
    }

    public <T> T getStickyEvent(Class<T> cls) {
        T cast;
        synchronized (this.f) {
            cast = cls.cast(this.f.get(cls));
        }
        return cast;
    }

    public <T> T removeStickyEvent(Class<T> cls) {
        T cast;
        synchronized (this.f) {
            cast = cls.cast(this.f.remove(cls));
        }
        return cast;
    }

    public boolean removeStickyEvent(Object obj) {
        boolean z;
        synchronized (this.f) {
            Class<?> cls = obj.getClass();
            if (obj.equals(this.f.get(cls))) {
                this.f.remove(cls);
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public void removeAllStickyEvents() {
        synchronized (this.f) {
            this.f.clear();
        }
    }

    private void a(Object obj, a aVar) {
        CopyOnWriteArrayList<h> copyOnWriteArrayList;
        boolean z;
        Class<?> cls = obj.getClass();
        List<Class<?>> a2 = a(cls);
        int size = a2.size();
        int i = 0;
        boolean z2 = false;
        while (i < size) {
            Class<?> cls2 = a2.get(i);
            synchronized (this) {
                copyOnWriteArrayList = this.d.get(cls2);
            }
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
                z = z2;
            } else {
                Iterator<h> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    h next = it.next();
                    aVar.e = obj;
                    aVar.d = next;
                    try {
                        a(next, obj, aVar.c);
                        if (aVar.f) {
                            break;
                        }
                    } finally {
                        aVar.e = null;
                        aVar.d = null;
                        aVar.f = false;
                    }
                }
                z = true;
            }
            i++;
            z2 = z;
        }
        if (!z2) {
            Log.d(TAG, "No subscribers registered for event " + cls);
            if (cls != NoSubscriberEvent.class && cls != SubscriberExceptionEvent.class) {
                post(new NoSubscriberEvent(this, obj));
            }
        }
    }

    private void a(h hVar, Object obj, boolean z) {
        switch (hVar.b.b) {
            case PostThread:
                a(hVar, obj);
                return;
            case MainThread:
                if (z) {
                    a(hVar, obj);
                    return;
                } else {
                    this.h.a(hVar, obj);
                    return;
                }
            case BackgroundThread:
                if (z) {
                    this.i.a(hVar, obj);
                    return;
                } else {
                    a(hVar, obj);
                    return;
                }
            case Async:
                this.j.a(hVar, obj);
                return;
            default:
                throw new IllegalStateException("Unknown thread mode: " + hVar.b.b);
        }
    }

    private List<Class<?>> a(Class<?> cls) {
        List<Class<?>> list;
        synchronized (c) {
            list = c.get(cls);
            if (list == null) {
                list = new ArrayList<>();
                for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                    list.add(cls2);
                    a(list, cls2.getInterfaces());
                }
                c.put(cls, list);
            }
        }
        return list;
    }

    static void a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                a(list, cls.getInterfaces());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(d dVar) {
        Object obj = dVar.a;
        h hVar = dVar.b;
        d.a(dVar);
        if (hVar.d) {
            a(hVar, obj);
        }
    }

    void a(h hVar, Object obj) {
        try {
            hVar.b.a.invoke(hVar.a, obj);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Unexpected exception", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (obj instanceof SubscriberExceptionEvent) {
                Log.e(TAG, "SubscriberExceptionEvent subscriber " + hVar.a.getClass() + " threw an exception", cause);
                SubscriberExceptionEvent subscriberExceptionEvent = (SubscriberExceptionEvent) obj;
                Log.e(TAG, "Initial event " + subscriberExceptionEvent.causingEvent + " caused exception in " + subscriberExceptionEvent.causingSubscriber, subscriberExceptionEvent.throwable);
                return;
            }
            if (this.m) {
                Log.e(TAG, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + hVar.a.getClass(), cause);
            }
            post(new SubscriberExceptionEvent(this, cause, obj, hVar.a));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a {
        List<Object> a = new ArrayList();
        boolean b;
        boolean c;
        h d;
        Object e;
        boolean f;

        a() {
        }
    }
}
