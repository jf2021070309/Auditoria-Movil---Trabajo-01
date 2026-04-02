package com.amazon.aps.iva.rp;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.aq.d;
import com.amazon.aps.iva.eq.a;
import com.amazon.aps.iva.up.f;
import com.amazon.aps.iva.yb0.j;
import okhttp3.internal.ws.WebSocketProtocol;
/* compiled from: CallbackNetworkInfoProvider.kt */
@TargetApi(24)
/* loaded from: classes2.dex */
public final class a extends ConnectivityManager.NetworkCallback implements c {
    public final com.amazon.aps.iva.sp.c<com.amazon.aps.iva.eq.a> b;
    public final d c;
    public com.amazon.aps.iva.eq.a d;

    public a(f fVar) {
        r rVar = new r();
        this.b = fVar;
        this.c = rVar;
        this.d = new com.amazon.aps.iva.eq.a(null, null, null, null, null, null, null, 127);
    }

    @Override // com.amazon.aps.iva.rp.c
    public final void a(Context context) {
        ConnectivityManager connectivityManager;
        Object systemService = context.getSystemService("connectivity");
        if (systemService instanceof ConnectivityManager) {
            connectivityManager = (ConnectivityManager) systemService;
        } else {
            connectivityManager = null;
        }
        if (connectivityManager == null) {
            com.amazon.aps.iva.iq.a.a(com.amazon.aps.iva.dq.c.b, "We couldn't unregister the Network Callback", null, 6);
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(this);
        } catch (SecurityException e) {
            com.amazon.aps.iva.iq.a.a(com.amazon.aps.iva.dq.c.b, "We couldn't unregister the Network Callback", e, 4);
        } catch (RuntimeException e2) {
            com.amazon.aps.iva.iq.a.a(com.amazon.aps.iva.dq.c.b, "We couldn't unregister the Network Callback", e2, 4);
        }
    }

    public final void b(Context context) {
        ConnectivityManager connectivityManager;
        com.amazon.aps.iva.sp.c<com.amazon.aps.iva.eq.a> cVar = this.b;
        Object systemService = context.getSystemService("connectivity");
        if (systemService instanceof ConnectivityManager) {
            connectivityManager = (ConnectivityManager) systemService;
        } else {
            connectivityManager = null;
        }
        if (connectivityManager == null) {
            com.amazon.aps.iva.iq.a.a(com.amazon.aps.iva.dq.c.b, "We couldn't register a Network Callback, the network information reported will be less accurate.", null, 6);
            return;
        }
        try {
            connectivityManager.registerDefaultNetworkCallback(this);
            Network activeNetwork = connectivityManager.getActiveNetwork();
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (activeNetwork != null && networkCapabilities != null) {
                onCapabilitiesChanged(activeNetwork, networkCapabilities);
            }
        } catch (SecurityException e) {
            com.amazon.aps.iva.iq.a.a(com.amazon.aps.iva.dq.c.b, "We couldn't register a Network Callback, the network information reported will be less accurate.", e, 4);
            com.amazon.aps.iva.eq.a aVar = new com.amazon.aps.iva.eq.a(a.b.NETWORK_OTHER, null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
            this.d = aVar;
            cVar.b(aVar);
        } catch (Exception e2) {
            com.amazon.aps.iva.iq.a.a(com.amazon.aps.iva.dq.c.b, "We couldn't register a Network Callback, the network information reported will be less accurate.", e2, 4);
            com.amazon.aps.iva.eq.a aVar2 = new com.amazon.aps.iva.eq.a(a.b.NETWORK_OTHER, null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
            this.d = aVar2;
            cVar.b(aVar2);
        }
    }

    @Override // com.amazon.aps.iva.rp.c
    public final com.amazon.aps.iva.eq.a g() {
        return this.d;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        a.b bVar;
        Long l;
        Long l2;
        Long l3;
        int signalStrength;
        int signalStrength2;
        j.f(network, "network");
        j.f(networkCapabilities, "networkCapabilities");
        super.onCapabilitiesChanged(network, networkCapabilities);
        if (networkCapabilities.hasTransport(1)) {
            bVar = a.b.NETWORK_WIFI;
        } else if (networkCapabilities.hasTransport(3)) {
            bVar = a.b.NETWORK_ETHERNET;
        } else if (networkCapabilities.hasTransport(0)) {
            bVar = a.b.NETWORK_CELLULAR;
        } else if (networkCapabilities.hasTransport(2)) {
            bVar = a.b.NETWORK_BLUETOOTH;
        } else {
            bVar = a.b.NETWORK_OTHER;
        }
        a.b bVar2 = bVar;
        if (networkCapabilities.getLinkUpstreamBandwidthKbps() > 0) {
            l = Long.valueOf(networkCapabilities.getLinkUpstreamBandwidthKbps());
        } else {
            l = null;
        }
        if (networkCapabilities.getLinkDownstreamBandwidthKbps() > 0) {
            l2 = Long.valueOf(networkCapabilities.getLinkDownstreamBandwidthKbps());
        } else {
            l2 = null;
        }
        if (this.c.b() >= 29) {
            signalStrength = networkCapabilities.getSignalStrength();
            if (signalStrength != Integer.MIN_VALUE) {
                signalStrength2 = networkCapabilities.getSignalStrength();
                l3 = Long.valueOf(signalStrength2);
                com.amazon.aps.iva.eq.a aVar = new com.amazon.aps.iva.eq.a(bVar2, null, null, l, l2, l3, null, 70);
                this.d = aVar;
                this.b.b(aVar);
            }
        }
        l3 = null;
        com.amazon.aps.iva.eq.a aVar2 = new com.amazon.aps.iva.eq.a(bVar2, null, null, l, l2, l3, null, 70);
        this.d = aVar2;
        this.b.b(aVar2);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        j.f(network, "network");
        super.onLost(network);
        com.amazon.aps.iva.eq.a aVar = new com.amazon.aps.iva.eq.a(a.b.NETWORK_NOT_CONNECTED, null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
        this.d = aVar;
        this.b.b(aVar);
    }
}
