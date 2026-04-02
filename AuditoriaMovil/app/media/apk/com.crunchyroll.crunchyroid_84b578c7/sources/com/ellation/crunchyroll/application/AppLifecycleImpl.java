package com.ellation.crunchyroll.application;

import androidx.lifecycle.g;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.eventdispatcher.EventDispatcher;
import com.ellation.crunchyroll.extension.LifecycleExtensionsKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppLifecycle.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/ellation/crunchyroll/application/AppLifecycleImpl;", "Lcom/ellation/crunchyroll/application/d;", "Lcom/ellation/crunchyroll/eventdispatcher/EventDispatcher;", "Lcom/amazon/aps/iva/ys/d;", "<init>", "()V", "mvp_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class AppLifecycleImpl implements d, EventDispatcher<com.amazon.aps.iva.ys.d> {
    public static final AppLifecycleImpl c;
    public final /* synthetic */ EventDispatcher.EventDispatcherImpl<com.amazon.aps.iva.ys.d> b = new EventDispatcher.EventDispatcherImpl<>();

    /* compiled from: AppLifecycle.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/ellation/crunchyroll/application/AppLifecycleImpl$1", "Lcom/amazon/aps/iva/i5/g;", "mvp_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: com.ellation.crunchyroll.application.AppLifecycleImpl$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 implements com.amazon.aps.iva.i5.g {
        public boolean b;

        /* compiled from: AppLifecycle.kt */
        /* renamed from: com.ellation.crunchyroll.application.AppLifecycleImpl$1$a */
        /* loaded from: classes2.dex */
        public static final class a extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ys.d, q> {
            public static final a h = new a();

            public a() {
                super(1);
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final q invoke(com.amazon.aps.iva.ys.d dVar) {
                com.amazon.aps.iva.ys.d dVar2 = dVar;
                j.f(dVar2, "$this$notify");
                dVar2.onAppCreate();
                return q.a;
            }
        }

        /* compiled from: AppLifecycle.kt */
        /* renamed from: com.ellation.crunchyroll.application.AppLifecycleImpl$1$b */
        /* loaded from: classes2.dex */
        public static final class b extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ys.d, q> {
            public b() {
                super(1);
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final q invoke(com.amazon.aps.iva.ys.d dVar) {
                com.amazon.aps.iva.ys.d dVar2 = dVar;
                j.f(dVar2, "$this$notify");
                dVar2.onAppResume(AnonymousClass1.this.b);
                return q.a;
            }
        }

        /* compiled from: AppLifecycle.kt */
        /* renamed from: com.ellation.crunchyroll.application.AppLifecycleImpl$1$c */
        /* loaded from: classes2.dex */
        public static final class c extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ys.d, q> {
            public static final c h = new c();

            public c() {
                super(1);
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final q invoke(com.amazon.aps.iva.ys.d dVar) {
                com.amazon.aps.iva.ys.d dVar2 = dVar;
                j.f(dVar2, "$this$notify");
                dVar2.onAppStop();
                return q.a;
            }
        }

        @Override // com.amazon.aps.iva.i5.g
        public final void onCreate(o oVar) {
            j.f(oVar, "owner");
            AppLifecycleImpl.c.notify(a.h);
        }

        @Override // com.amazon.aps.iva.i5.g
        public final void onResume(o oVar) {
            AppLifecycleImpl.c.notify(new b());
        }

        @Override // com.amazon.aps.iva.i5.g
        public final void onStop(o oVar) {
            j.f(oVar, "owner");
            this.b = true;
            AppLifecycleImpl.c.notify(c.h);
        }
    }

    /* compiled from: AppLifecycle.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ com.amazon.aps.iva.ys.d h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.ys.d dVar) {
            super(0);
            this.h = dVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            AppLifecycleImpl appLifecycleImpl = AppLifecycleImpl.c;
            appLifecycleImpl.getClass();
            com.amazon.aps.iva.ys.d dVar = this.h;
            j.f(dVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            appLifecycleImpl.b.removeEventListener(dVar);
            return q.a;
        }
    }

    static {
        AppLifecycleImpl appLifecycleImpl = new AppLifecycleImpl();
        c = appLifecycleImpl;
        appLifecycleImpl.getLifecycle().addObserver(new AnonymousClass1());
    }

    private AppLifecycleImpl() {
    }

    @Override // com.ellation.crunchyroll.application.d
    public final void Lf(com.amazon.aps.iva.ys.d dVar) {
        j.f(dVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.b.addEventListener(dVar);
    }

    @Override // com.ellation.crunchyroll.application.d
    public final void S7(com.amazon.aps.iva.ys.d dVar, o oVar) {
        j.f(dVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        j.f(oVar, "lifecycleToListenOn");
        this.b.addEventListener(dVar);
        LifecycleExtensionsKt.b(oVar.getLifecycle(), new a(dVar));
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void addEventListener(com.amazon.aps.iva.ys.d dVar) {
        com.amazon.aps.iva.ys.d dVar2 = dVar;
        j.f(dVar2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.b.addEventListener(dVar2);
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void clear() {
        this.b.clear();
    }

    @Override // com.amazon.aps.iva.i5.o
    public final androidx.lifecycle.g getLifecycle() {
        m mVar = m.j;
        return m.j.g;
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final int getListenerCount() {
        return this.b.getListenerCount();
    }

    @Override // com.ellation.crunchyroll.application.d
    public final boolean isResumed() {
        return ((k) getLifecycle()).c.isAtLeast(g.b.RESUMED);
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void notify(com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.ys.d, q> lVar) {
        j.f(lVar, "action");
        this.b.notify(lVar);
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void removeEventListener(com.amazon.aps.iva.ys.d dVar) {
        com.amazon.aps.iva.ys.d dVar2 = dVar;
        j.f(dVar2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.b.removeEventListener(dVar2);
    }
}
