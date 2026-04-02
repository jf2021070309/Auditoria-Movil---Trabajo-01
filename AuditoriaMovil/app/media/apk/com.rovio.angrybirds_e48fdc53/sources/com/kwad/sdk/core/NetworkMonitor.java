package com.kwad.sdk.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v4.content.ContextCompat;
import com.kuaishou.weapon.p0.g;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class NetworkMonitor {
    private static volatile boolean akj = false;
    private final List<a> akk;
    private boolean akl;
    private final BroadcastReceiver akm;

    /* loaded from: classes.dex */
    enum Holder {
        INSTANCE;
        
        private final NetworkMonitor mInstance = new NetworkMonitor((byte) 0);

        Holder() {
        }

        final NetworkMonitor getInstance() {
            return this.mInstance;
        }
    }

    /* loaded from: classes.dex */
    public enum NetworkState {
        NETWORK_NONE,
        NETWORK_MOBILE,
        NETWORK_WIFI
    }

    /* loaded from: classes.dex */
    public interface a {
        void a(NetworkState networkState);
    }

    private NetworkMonitor() {
        this.akk = new CopyOnWriteArrayList();
        this.akl = false;
        this.akm = new BroadcastReceiver() { // from class: com.kwad.sdk.core.NetworkMonitor.1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                ConnectivityManager connectivityManager;
                NetworkMonitor networkMonitor;
                NetworkState networkState;
                try {
                    if ((ContextCompat.checkSelfPermission(context, g.b) == 0) && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            NetworkMonitor.this.b(NetworkState.NETWORK_NONE);
                            return;
                        }
                        if (1 == activeNetworkInfo.getType()) {
                            networkMonitor = NetworkMonitor.this;
                            networkState = NetworkState.NETWORK_WIFI;
                        } else if (activeNetworkInfo.getType() == 0) {
                            networkMonitor = NetworkMonitor.this;
                            networkState = NetworkState.NETWORK_MOBILE;
                        } else {
                            networkMonitor = NetworkMonitor.this;
                            networkState = NetworkState.NETWORK_NONE;
                        }
                        networkMonitor.b(networkState);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        };
    }

    /* synthetic */ NetworkMonitor(byte b) {
        this();
    }

    private synchronized void aP(Context context) {
        if (akj || context == null) {
            return;
        }
        context.getApplicationContext().registerReceiver(this.akm, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        akj = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(NetworkState networkState) {
        for (a aVar : this.akk) {
            aVar.a(networkState);
        }
    }

    public static NetworkMonitor getInstance() {
        return Holder.INSTANCE.getInstance();
    }

    public final void a(Context context, a aVar) {
        aP(context);
        this.akk.add(aVar);
    }

    public final void a(a aVar) {
        this.akk.remove(aVar);
    }
}
