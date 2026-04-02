package bo.app;

import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.NoMatchingTriggerEvent;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public final class x0 implements z1 {
    public static final a h = new a(null);
    private final v4 a;
    private final ConcurrentMap b;
    private final ConcurrentMap c;
    private final ConcurrentMap d;
    private final ReentrantLock e;
    private final ReentrantLock f;
    private final ReentrantLock g;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: bo.app.x0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0086a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ Class b;
            final /* synthetic */ Set c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0086a(Class cls, Set set) {
                super(0);
                this.b = cls;
                this.c = set;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                StringBuilder sb = new StringBuilder("Triggering ");
                com.amazon.aps.iva.b8.i.d(this.b, sb, " on ");
                sb.append(this.c.size());
                sb.append(" subscribers.");
                return sb.toString();
            }
        }

        public /* synthetic */ a(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Set a(Class cls, Set set) {
            com.amazon.aps.iva.yb0.j.d(set, "null cannot be cast to non-null type kotlin.collections.Set<com.braze.events.IEventSubscriber<T of com.braze.events.EventMessenger.Companion.getCastSubscriberSet>>");
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new C0086a(cls, set), 3, (Object) null);
            return set;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Set a(ConcurrentMap concurrentMap, Class cls, ReentrantLock reentrantLock) {
            reentrantLock.lock();
            try {
                CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) concurrentMap.get(cls);
                if (copyOnWriteArraySet == null) {
                    return new HashSet();
                }
                HashSet hashSet = new HashSet(copyOnWriteArraySet);
                ArrayList arrayList = new ArrayList();
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                copyOnWriteArraySet.removeAll(com.amazon.aps.iva.lb0.x.c1(arrayList));
                concurrentMap.put(cls, copyOnWriteArraySet);
                return hashSet;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ Class b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Class cls) {
            super(0);
            this.b = cls;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Publishing cached event for class: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ Class b;
        final /* synthetic */ Object c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Class cls, Object obj) {
            super(0);
            this.b = cls;
            this.c = obj;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            StringBuilder sb = new StringBuilder("SDK is disabled. Not publishing event class: ");
            com.amazon.aps.iva.b8.i.d(this.b, sb, " and message: ");
            sb.append(this.c);
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ Class b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Class cls) {
            super(0);
            this.b = cls;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Not publishing null message to event class ".concat(this.b.getName());
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ Class b;
        final /* synthetic */ Object c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Class cls, Object obj) {
            super(0);
            this.b = cls;
            this.c = obj;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            com.amazon.aps.iva.b8.i.d(this.b, sb, " fired:\n");
            sb.append(this.c);
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p {
        int b;
        final /* synthetic */ IEventSubscriber c;
        final /* synthetic */ Object d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(IEventSubscriber iEventSubscriber, Object obj, com.amazon.aps.iva.ob0.d dVar) {
            super(2, dVar);
            this.c = iEventSubscriber;
            this.d = obj;
        }

        @Override // com.amazon.aps.iva.xb0.p
        /* renamed from: a */
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d dVar) {
            return ((f) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d create(Object obj, com.amazon.aps.iva.ob0.d dVar) {
            return new f(this.c, this.d, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            if (this.b == 0) {
                com.amazon.aps.iva.ab.x.i0(obj);
                this.c.trigger(this.d);
                return com.amazon.aps.iva.kb0.q.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ Class b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Class cls) {
            super(0);
            this.b = cls;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Event was published, but no subscribers were found. But not saving event for publishing later. Event class: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ Class b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Class cls) {
            super(0);
            this.b = cls;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Event was published, but no subscribers were found. Saving event for later publishing to a matching subscriber. Event class: " + this.b;
        }
    }

    public x0(v4 v4Var) {
        com.amazon.aps.iva.yb0.j.f(v4Var, "sdkEnablementProvider");
        this.a = v4Var;
        this.b = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
        this.e = new ReentrantLock();
        this.f = new ReentrantLock();
        this.g = new ReentrantLock();
    }

    @Override // bo.app.z1
    public void a(Class cls, IEventSubscriber iEventSubscriber) {
        com.amazon.aps.iva.yb0.j.f(cls, "eventClass");
        com.amazon.aps.iva.yb0.j.f(iEventSubscriber, "subscriber");
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            a(iEventSubscriber, cls, this.b);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // bo.app.z1
    public boolean b(Class cls, IEventSubscriber iEventSubscriber) {
        com.amazon.aps.iva.yb0.j.f(cls, "eventClass");
        com.amazon.aps.iva.yb0.j.f(iEventSubscriber, "subscriber");
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            return a(iEventSubscriber, cls, this.c);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // bo.app.z1
    public boolean c(Class cls, IEventSubscriber iEventSubscriber) {
        com.amazon.aps.iva.yb0.j.f(cls, "eventClass");
        com.amazon.aps.iva.yb0.j.f(iEventSubscriber, "subscriber");
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.b.get(cls);
            if (copyOnWriteArraySet != null) {
                return copyOnWriteArraySet.remove(iEventSubscriber);
            }
            reentrantLock.unlock();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void b() {
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            this.d.remove(ContentCardsUpdatedEvent.class);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // bo.app.z1
    public void a(Object obj, Class cls) {
        com.amazon.aps.iva.yb0.j.f(cls, "eventClass");
        if (this.a.a()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new c(cls, obj), 3, (Object) null);
        } else if (obj == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new d(cls), 3, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new e(cls, obj), 3, (Object) null);
            a aVar = h;
            Set a2 = aVar.a(this.b, cls, this.e);
            for (IEventSubscriber iEventSubscriber : aVar.a(cls, a2)) {
                com.amazon.aps.iva.se0.i.d(BrazeCoroutineScope.INSTANCE, null, null, new f(iEventSubscriber, obj, null), 3);
            }
            a aVar2 = h;
            Set a3 = aVar2.a(this.c, cls, this.f);
            for (IEventSubscriber iEventSubscriber2 : aVar2.a(cls, a3)) {
                iEventSubscriber2.trigger(obj);
            }
            if (a3.isEmpty() && a2.isEmpty()) {
                if (com.amazon.aps.iva.yb0.j.a(cls, NoMatchingTriggerEvent.class)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new g(cls), 2, (Object) null);
                    return;
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new h(cls), 2, (Object) null);
                ReentrantLock reentrantLock = this.g;
                reentrantLock.lock();
                try {
                    this.d.put(cls, obj);
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
    }

    @Override // bo.app.z1
    public void a() {
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            this.b.clear();
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            reentrantLock.unlock();
            ReentrantLock reentrantLock2 = this.f;
            reentrantLock2.lock();
            try {
                this.c.clear();
            } finally {
                reentrantLock2.unlock();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    private final boolean a(IEventSubscriber iEventSubscriber, Class cls, ConcurrentMap concurrentMap) {
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) concurrentMap.get(cls);
        if (copyOnWriteArraySet == null) {
            copyOnWriteArraySet = new CopyOnWriteArraySet();
            CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) concurrentMap.putIfAbsent(cls, copyOnWriteArraySet);
            if (copyOnWriteArraySet2 != null) {
                copyOnWriteArraySet = copyOnWriteArraySet2;
            }
        }
        boolean add = copyOnWriteArraySet.add(iEventSubscriber);
        a(cls);
        return add;
    }

    private final void a(Class cls) {
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            if (this.d.containsKey(cls)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new b(cls), 2, (Object) null);
                Object remove = this.d.remove(cls);
                if (remove != null) {
                    a(remove, cls);
                }
            }
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
