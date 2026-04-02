package com.crunchyroll.connectivity;

import com.amazon.aps.iva.i5.g;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.x50.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.eventdispatcher.EventDispatcher;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NetworkChangeRegister.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/crunchyroll/connectivity/NetworkChangeRegisterImpl;", "Lcom/crunchyroll/connectivity/d;", "Lcom/amazon/aps/iva/i5/g;", "Lcom/ellation/crunchyroll/eventdispatcher/EventDispatcher;", "Lcom/amazon/aps/iva/mf/a;", "network_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NetworkChangeRegisterImpl implements com.crunchyroll.connectivity.d, g, EventDispatcher<com.amazon.aps.iva.mf.a> {
    public final NetworkChangeMonitor b;
    public final q c;
    public final /* synthetic */ EventDispatcher.EventDispatcherImpl<com.amazon.aps.iva.mf.a> d;
    public boolean e;

    /* compiled from: NetworkChangeRegister.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.mf.a, com.amazon.aps.iva.kb0.q> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.mf.a aVar) {
            com.amazon.aps.iva.mf.a aVar2 = aVar;
            j.f(aVar2, "$this$notify");
            aVar2.onConnectionLost();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: NetworkChangeRegister.kt */
    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.mf.a, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ boolean h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z) {
            super(1);
            this.h = z;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.mf.a aVar) {
            com.amazon.aps.iva.mf.a aVar2 = aVar;
            j.f(aVar2, "$this$notify");
            aVar2.onConnectionUpdated(this.h);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: NetworkChangeRegister.kt */
    /* loaded from: classes.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.mf.a, com.amazon.aps.iva.kb0.q> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.mf.a aVar) {
            com.amazon.aps.iva.mf.a aVar2 = aVar;
            j.f(aVar2, "$this$notify");
            aVar2.onConnectionRestored();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: NetworkChangeRegister.kt */
    /* loaded from: classes.dex */
    public static final class d extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.mf.a, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ boolean h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z) {
            super(1);
            this.h = z;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.mf.a aVar) {
            com.amazon.aps.iva.mf.a aVar2 = aVar;
            j.f(aVar2, "$this$notify");
            aVar2.onConnectionUpdated(this.h);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: NetworkChangeRegister.kt */
    /* loaded from: classes.dex */
    public static final class e extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.mf.a, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ boolean h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z) {
            super(1);
            this.h = z;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.mf.a aVar) {
            com.amazon.aps.iva.mf.a aVar2 = aVar;
            j.f(aVar2, "$this$notify");
            aVar2.onConnectionRefresh(this.h);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public NetworkChangeRegisterImpl(NetworkChangeMonitor networkChangeMonitor, q qVar, androidx.lifecycle.g gVar) {
        j.f(gVar, "lifecycle");
        this.b = networkChangeMonitor;
        this.c = qVar;
        this.d = new EventDispatcher.EventDispatcherImpl<>();
        networkChangeMonitor.addEventListener(this);
        gVar.addObserver(this);
    }

    @Override // com.crunchyroll.connectivity.d
    public final void a(com.amazon.aps.iva.mf.a aVar) {
        j.f(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        boolean c2 = this.c.c();
        if (c2) {
            this.e = true;
        } else {
            aVar.onConnectionLost();
        }
        aVar.onConnectionUpdated(c2);
        this.d.addEventListener(aVar);
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void addEventListener(com.amazon.aps.iva.mf.a aVar) {
        com.amazon.aps.iva.mf.a aVar2 = aVar;
        j.f(aVar2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.d.addEventListener(aVar2);
    }

    @Override // com.crunchyroll.connectivity.d
    public final void b(com.amazon.aps.iva.mf.a aVar) {
        j.f(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.d.removeEventListener(aVar);
    }

    @Override // com.amazon.aps.iva.mf.e
    public final void c(boolean z) {
        if (!z) {
            notify(a.h);
            this.e = false;
            notify(new b(z));
        } else if (!this.e) {
            notify(c.h);
            this.e = true;
            notify(new d(z));
        }
        notify(new e(z));
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void clear() {
        this.d.clear();
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final int getListenerCount() {
        return this.d.getListenerCount();
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void notify(com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.mf.a, com.amazon.aps.iva.kb0.q> lVar) {
        j.f(lVar, "action");
        this.d.notify(lVar);
    }

    @Override // com.amazon.aps.iva.i5.g
    public final void onDestroy(o oVar) {
        j.f(oVar, "owner");
        this.b.removeEventListener(this);
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void removeEventListener(com.amazon.aps.iva.mf.a aVar) {
        com.amazon.aps.iva.mf.a aVar2 = aVar;
        j.f(aVar2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.d.removeEventListener(aVar2);
    }
}
