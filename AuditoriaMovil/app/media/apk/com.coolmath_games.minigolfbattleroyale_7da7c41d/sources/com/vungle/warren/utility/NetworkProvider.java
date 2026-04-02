package com.vungle.warren.utility;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.core.content.PermissionChecker;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public class NetworkProvider {
    private static NetworkProvider INSTANCE = null;
    static final long NETWORK_CHECK_DELAY = 30000;
    private static final String TAG = NetworkProvider.class.getSimpleName();
    public static final int TYPE_NONE = -1;
    private final ConnectivityManager cm;
    private final Context ctx;
    private boolean enabled;
    private ConnectivityManager.NetworkCallback networkCallback;
    private final AtomicInteger currentNetwork = new AtomicInteger();
    private final Set<NetworkListener> listeners = new CopyOnWriteArraySet();
    private final Handler handler = new Handler(Looper.getMainLooper());
    private Runnable typeRunnable = new Runnable() { // from class: com.vungle.warren.utility.NetworkProvider.3
        @Override // java.lang.Runnable
        public void run() {
            if (NetworkProvider.this.listeners.isEmpty()) {
                return;
            }
            NetworkProvider.this.onNetworkChanged();
            NetworkProvider.this.handler.postDelayed(NetworkProvider.this.typeRunnable, 30000L);
        }
    };

    /* loaded from: classes2.dex */
    public interface NetworkListener {
        void onChanged(int i);
    }

    private NetworkProvider(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.ctx = applicationContext;
        this.cm = (ConnectivityManager) applicationContext.getSystemService("connectivity");
        this.currentNetwork.set(getCurrentNetworkType());
    }

    public static synchronized NetworkProvider getInstance(Context context) {
        NetworkProvider networkProvider;
        synchronized (NetworkProvider.class) {
            if (INSTANCE == null) {
                INSTANCE = new NetworkProvider(context);
            }
            networkProvider = INSTANCE;
        }
        return networkProvider;
    }

    private synchronized void setEnableNetworkListener(boolean z) {
        if (this.enabled == z) {
            return;
        }
        this.enabled = z;
        if (this.cm != null) {
            try {
                if (z) {
                    NetworkRequest.Builder builder = new NetworkRequest.Builder();
                    builder.addCapability(12);
                    this.cm.registerNetworkCallback(builder.build(), getNetworkCallback());
                } else {
                    this.cm.unregisterNetworkCallback(getNetworkCallback());
                }
            } catch (Exception e) {
                Log.e(TAG, e.getMessage());
            }
        }
    }

    private ConnectivityManager.NetworkCallback getNetworkCallback() {
        ConnectivityManager.NetworkCallback networkCallback = this.networkCallback;
        if (networkCallback != null) {
            return networkCallback;
        }
        ConnectivityManager.NetworkCallback networkCallback2 = new ConnectivityManager.NetworkCallback() { // from class: com.vungle.warren.utility.NetworkProvider.1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                super.onAvailable(network);
                NetworkProvider.this.onNetworkChanged();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                super.onLost(network);
                NetworkProvider.this.onNetworkChanged();
            }
        };
        this.networkCallback = networkCallback2;
        return networkCallback2;
    }

    private void postToListeners(final int i) {
        this.handler.post(new Runnable() { // from class: com.vungle.warren.utility.NetworkProvider.2
            @Override // java.lang.Runnable
            public void run() {
                for (NetworkListener networkListener : NetworkProvider.this.listeners) {
                    networkListener.onChanged(i);
                }
            }
        });
    }

    public void onNetworkChanged() {
        getCurrentNetworkType();
    }

    public int getCurrentNetworkType() {
        int i = -1;
        if (this.cm == null || PermissionChecker.checkCallingOrSelfPermission(this.ctx, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            this.currentNetwork.set(-1);
            return -1;
        }
        NetworkInfo activeNetworkInfo = this.cm.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
            i = activeNetworkInfo.getType();
        }
        int andSet = this.currentNetwork.getAndSet(i);
        if (i != andSet) {
            String str = TAG;
            Log.d(str, "on network changed: " + andSet + "->" + i);
            postToListeners(i);
        }
        setEnableNetworkListener(!this.listeners.isEmpty());
        return i;
    }

    public void addListener(NetworkListener networkListener) {
        this.listeners.add(networkListener);
        setEnableNetworkListener(true);
    }

    public void removeListener(NetworkListener networkListener) {
        this.listeners.remove(networkListener);
        setEnableNetworkListener(!this.listeners.isEmpty());
    }
}
