package com.crunchyroll.connectivity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Handler;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.connectivity.NetworkChangeMonitorImpl;
import com.ellation.crunchyroll.eventdispatcher.EventDispatcher;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NetworkChangeRegister.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/crunchyroll/connectivity/NetworkChangeMonitorImpl;", "Lcom/crunchyroll/connectivity/NetworkChangeMonitor;", "Lcom/ellation/crunchyroll/eventdispatcher/EventDispatcher;", "Lcom/amazon/aps/iva/mf/e;", "network_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NetworkChangeMonitorImpl implements NetworkChangeMonitor, EventDispatcher<com.amazon.aps.iva.mf.e> {
    public final /* synthetic */ EventDispatcher.EventDispatcherImpl<com.amazon.aps.iva.mf.e> b = new EventDispatcher.EventDispatcherImpl<>();
    public final ConnectivityManager c;

    /* compiled from: NetworkChangeRegister.kt */
    /* loaded from: classes.dex */
    public static final class a extends ConnectivityManager.NetworkCallback {
        public final /* synthetic */ Handler a;
        public final /* synthetic */ NetworkChangeMonitorImpl b;

        /* compiled from: NetworkChangeRegister.kt */
        /* renamed from: com.crunchyroll.connectivity.NetworkChangeMonitorImpl$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0954a extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.mf.e, q> {
            public static final C0954a h = new C0954a();

            public C0954a() {
                super(1);
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final q invoke(com.amazon.aps.iva.mf.e eVar) {
                com.amazon.aps.iva.mf.e eVar2 = eVar;
                j.f(eVar2, "$this$notify");
                eVar2.c(true);
                return q.a;
            }
        }

        /* compiled from: NetworkChangeRegister.kt */
        /* loaded from: classes.dex */
        public static final class b extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.mf.e, q> {
            public final /* synthetic */ NetworkCapabilities h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(NetworkCapabilities networkCapabilities) {
                super(1);
                this.h = networkCapabilities;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final q invoke(com.amazon.aps.iva.mf.e eVar) {
                com.amazon.aps.iva.mf.e eVar2 = eVar;
                j.f(eVar2, "$this$notify");
                eVar2.c(this.h.hasCapability(12));
                return q.a;
            }
        }

        /* compiled from: NetworkChangeRegister.kt */
        /* loaded from: classes.dex */
        public static final class c extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.mf.e, q> {
            public static final c h = new c();

            public c() {
                super(1);
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final q invoke(com.amazon.aps.iva.mf.e eVar) {
                com.amazon.aps.iva.mf.e eVar2 = eVar;
                j.f(eVar2, "$this$notify");
                eVar2.c(false);
                return q.a;
            }
        }

        public a(Handler handler, NetworkChangeMonitorImpl networkChangeMonitorImpl) {
            this.a = handler;
            this.b = networkChangeMonitorImpl;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            j.f(network, "network");
            final NetworkChangeMonitorImpl networkChangeMonitorImpl = this.b;
            this.a.post(new Runnable() { // from class: com.crunchyroll.connectivity.b
                @Override // java.lang.Runnable
                public final void run() {
                    NetworkChangeMonitorImpl networkChangeMonitorImpl2 = NetworkChangeMonitorImpl.this;
                    j.f(networkChangeMonitorImpl2, "this$0");
                    networkChangeMonitorImpl2.notify(NetworkChangeMonitorImpl.a.C0954a.h);
                }
            });
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, final NetworkCapabilities networkCapabilities) {
            j.f(network, "network");
            j.f(networkCapabilities, "networkCapabilities");
            final NetworkChangeMonitorImpl networkChangeMonitorImpl = this.b;
            this.a.post(new Runnable() { // from class: com.crunchyroll.connectivity.a
                @Override // java.lang.Runnable
                public final void run() {
                    NetworkChangeMonitorImpl networkChangeMonitorImpl2 = NetworkChangeMonitorImpl.this;
                    j.f(networkChangeMonitorImpl2, "this$0");
                    NetworkCapabilities networkCapabilities2 = networkCapabilities;
                    j.f(networkCapabilities2, "$networkCapabilities");
                    networkChangeMonitorImpl2.notify(new NetworkChangeMonitorImpl.a.b(networkCapabilities2));
                }
            });
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            j.f(network, "network");
            final NetworkChangeMonitorImpl networkChangeMonitorImpl = this.b;
            this.a.postDelayed(new Runnable() { // from class: com.crunchyroll.connectivity.c
                @Override // java.lang.Runnable
                public final void run() {
                    NetworkChangeMonitorImpl networkChangeMonitorImpl2 = NetworkChangeMonitorImpl.this;
                    j.f(networkChangeMonitorImpl2, "this$0");
                    if (networkChangeMonitorImpl2.c.getActiveNetwork() == null) {
                        networkChangeMonitorImpl2.notify(NetworkChangeMonitorImpl.a.c.h);
                    }
                }
            }, 10L);
        }
    }

    public NetworkChangeMonitorImpl(Context context, Handler handler) {
        Object systemService = context.getSystemService("connectivity");
        j.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        this.c = connectivityManager;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), new a(handler, this));
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void addEventListener(com.amazon.aps.iva.mf.e eVar) {
        com.amazon.aps.iva.mf.e eVar2 = eVar;
        j.f(eVar2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.b.addEventListener(eVar2);
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void clear() {
        this.b.clear();
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final int getListenerCount() {
        return this.b.getListenerCount();
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void notify(com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.mf.e, q> lVar) {
        j.f(lVar, "action");
        this.b.notify(lVar);
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void removeEventListener(com.amazon.aps.iva.mf.e eVar) {
        com.amazon.aps.iva.mf.e eVar2 = eVar;
        j.f(eVar2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.b.removeEventListener(eVar2);
    }
}
