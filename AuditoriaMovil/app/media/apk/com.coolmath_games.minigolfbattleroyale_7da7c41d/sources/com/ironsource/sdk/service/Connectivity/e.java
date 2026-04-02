package com.ironsource.sdk.service.Connectivity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.util.Log;
import com.facebook.appevents.integrity.IntegrityManager;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class e implements c {
    private String a = e.class.getSimpleName();
    private int b = 23;
    private final d c;
    private ConnectivityManager.NetworkCallback d;

    public e(d dVar) {
        this.c = dVar;
    }

    @Override // com.ironsource.sdk.service.Connectivity.c
    public final void a() {
        this.d = null;
    }

    @Override // com.ironsource.sdk.service.Connectivity.c
    public final void a(final Context context) {
        if (Build.VERSION.SDK_INT >= this.b) {
            b(context);
            if (com.ironsource.c.a.a(context).equals(IntegrityManager.INTEGRITY_TYPE_NONE)) {
                this.c.a();
            }
            if (this.d == null) {
                this.d = new ConnectivityManager.NetworkCallback() { // from class: com.ironsource.sdk.service.Connectivity.e.1
                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public final void onAvailable(Network network) {
                        if (network != null) {
                            d dVar = e.this.c;
                            String a = com.ironsource.c.a.a(network, context);
                            com.ironsource.c.a.a(context, network);
                            dVar.a(a);
                            return;
                        }
                        d dVar2 = e.this.c;
                        String a2 = com.ironsource.c.a.a(context);
                        Context context2 = context;
                        com.ironsource.c.a.a(context2, com.ironsource.c.a.b(context2));
                        dVar2.a(a2);
                    }

                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                        if (network != null) {
                            e.this.c.a(com.ironsource.c.a.a(network, context), com.ironsource.c.a.a(context, network));
                        }
                    }

                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
                        if (network != null) {
                            e.this.c.a(com.ironsource.c.a.a(network, context), com.ironsource.c.a.a(context, network));
                        }
                    }

                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public final void onLost(Network network) {
                        if (com.ironsource.c.a.a(context).equals(IntegrityManager.INTEGRITY_TYPE_NONE)) {
                            e.this.c.a();
                        }
                    }
                };
            }
            NetworkRequest build = new NetworkRequest.Builder().addCapability(12).build();
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    connectivityManager.registerNetworkCallback(build, this.d);
                }
            } catch (Exception unused) {
                Log.e(this.a, "NetworkCallback was not able to register");
            }
        }
    }

    @Override // com.ironsource.sdk.service.Connectivity.c
    public final void b(Context context) {
        ConnectivityManager connectivityManager;
        if (Build.VERSION.SDK_INT < this.b || this.d == null || context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(this.d);
        } catch (Exception unused) {
            Log.e(this.a, "NetworkCallback for was not registered or already unregistered");
        }
    }

    @Override // com.ironsource.sdk.service.Connectivity.c
    public final JSONObject c(Context context) {
        return com.ironsource.c.a.a(context, com.ironsource.c.a.b(context));
    }
}
