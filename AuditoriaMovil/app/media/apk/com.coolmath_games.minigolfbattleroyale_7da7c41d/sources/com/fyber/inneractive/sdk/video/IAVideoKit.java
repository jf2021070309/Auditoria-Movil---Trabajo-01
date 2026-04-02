package com.fyber.inneractive.sdk.video;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.c.b;
import com.fyber.inneractive.sdk.c.c;
import com.fyber.inneractive.sdk.c.d;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.d.q;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.i.e;
import com.fyber.inneractive.sdk.i.h;
import com.fyber.inneractive.sdk.j.a;
import com.fyber.inneractive.sdk.j.b;
import com.fyber.inneractive.sdk.j.d;
import com.fyber.inneractive.sdk.player.a.f;
import com.fyber.inneractive.sdk.player.a.n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.k;
import com.fyber.inneractive.sdk.util.r;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.ServerSocket;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class IAVideoKit extends BroadcastReceiver {
    private static final r.a sProvider = new r.a() { // from class: com.fyber.inneractive.sdk.video.IAVideoKit.1
        @Override // com.fyber.inneractive.sdk.util.r.a
        public final boolean a(String str) {
            if (TextUtils.equals(str, "vid_cache")) {
                return n.a().b();
            }
            return false;
        }

        @Override // com.fyber.inneractive.sdk.util.r.a
        public final r.b a() {
            return r.b.Video;
        }
    };

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IAConfigManager.a(sProvider);
        n a = n.a();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            IAlog.d("context is null, would not start the video cache.", new Object[0]);
        } else if (!a.b()) {
            a.a = applicationContext;
            final f a2 = f.a();
            if (a2.a.compareAndSet(false, true)) {
                try {
                    if (a2.d == null) {
                        a2.b = new ServerSocket(0, 24, InetAddress.getByName("127.0.0.1"));
                    }
                    a2.c = a2.b.getLocalPort();
                    final ProxySelector proxySelector = ProxySelector.getDefault();
                    final List singletonList = Collections.singletonList(Proxy.NO_PROXY);
                    ProxySelector.setDefault(new ProxySelector() { // from class: com.fyber.inneractive.sdk.player.a.f.3
                        @Override // java.net.ProxySelector
                        public final List<Proxy> select(URI uri) {
                            if (uri != null && uri.getHost() != null && ((uri.getHost().equalsIgnoreCase("127.0.0.1") || uri.getHost().equalsIgnoreCase("localhost")) && uri.getPort() == a2.c)) {
                                return singletonList;
                            }
                            return proxySelector.select(uri);
                        }

                        @Override // java.net.ProxySelector
                        public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
                            proxySelector.connectFailed(uri, socketAddress, iOException);
                        }
                    });
                    a2.e = true;
                } catch (Throwable unused) {
                    IAlog.a(String.format("MediaCacheStreamer failed to open a socket on port %d", 0), new Object[0]);
                }
                if (a2.e) {
                    a2.d = new Thread(a2.i, "FYB-MediaCacheStreamer");
                    a2.d.start();
                }
            }
            a.b = new Thread(a.c, "VideoCache");
            a.b.start();
        }
        IAlog.b("IAVideoKit: onReceive in package: %s", k.a(context.getApplicationContext()));
        c.a.a.a(a.RETURNED_ADTYPE_VAST, new c.b() { // from class: com.fyber.inneractive.sdk.video.IAVideoKit.2
            @Override // com.fyber.inneractive.sdk.c.c.b
            public final b a() {
                return new d();
            }

            @Override // com.fyber.inneractive.sdk.c.c.b
            public final /* synthetic */ com.fyber.inneractive.sdk.e.a b() {
                return new com.fyber.inneractive.sdk.d.f(IronSourceConstants.INTERSTITIAL_AD_UNIT);
            }
        });
        d.b.a.a(new d.a() { // from class: com.fyber.inneractive.sdk.video.IAVideoKit.3
            @Override // com.fyber.inneractive.sdk.c.d.a
            public final boolean a(InneractiveAdSpot inneractiveAdSpot) {
                return inneractiveAdSpot.getAdContent() != null && (inneractiveAdSpot.getAdContent() instanceof q);
            }

            @Override // com.fyber.inneractive.sdk.c.d.a
            public final com.fyber.inneractive.sdk.e.c b(InneractiveAdSpot inneractiveAdSpot) {
                InneractiveAdRequest g = inneractiveAdSpot.getAdContent().g();
                boolean z = g == null || g.getAllowFullscreen();
                if (inneractiveAdSpot.getAdContent().a_() && z) {
                    return new h();
                }
                return new com.fyber.inneractive.sdk.i.f();
            }
        });
        b.C0039b.a.a(new b.a() { // from class: com.fyber.inneractive.sdk.video.IAVideoKit.4
            @Override // com.fyber.inneractive.sdk.c.b.a
            public final boolean a(InneractiveAdSpot inneractiveAdSpot) {
                return inneractiveAdSpot.getAdContent() != null && (inneractiveAdSpot.getAdContent() instanceof q);
            }

            @Override // com.fyber.inneractive.sdk.c.b.a
            public final com.fyber.inneractive.sdk.e.b a() {
                return new e();
            }
        });
    }
}
