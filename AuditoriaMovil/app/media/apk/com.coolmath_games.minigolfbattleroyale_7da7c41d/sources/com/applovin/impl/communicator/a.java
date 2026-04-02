package com.applovin.impl.communicator;

import android.content.Context;
import android.content.IntentFilter;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.r;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class a {
    private final Context a;
    private final Set<b> b = new HashSet(32);
    private final Object c = new Object();

    public a(Context context) {
        this.a = context;
    }

    private b a(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        for (b bVar : this.b) {
            if (str.equals(bVar.a()) && appLovinCommunicatorSubscriber.equals(bVar.b())) {
                return bVar;
            }
        }
        return null;
    }

    public boolean a(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        if (appLovinCommunicatorSubscriber == null || !StringUtils.isValidString(str)) {
            r.i("AppLovinCommunicator", "Unable to subscribe - invalid subscriber (" + appLovinCommunicatorSubscriber + ") or topic (" + str + ")");
            return false;
        }
        synchronized (this.c) {
            b a = a(str, appLovinCommunicatorSubscriber);
            if (a == null) {
                b bVar = new b(str, appLovinCommunicatorSubscriber);
                this.b.add(bVar);
                AppLovinBroadcastManager.getInstance(this.a).registerReceiver(bVar, new IntentFilter(str));
                return true;
            }
            r.i("AppLovinCommunicator", "Attempting to re-subscribe subscriber (" + appLovinCommunicatorSubscriber + ") to topic (" + str + ")");
            if (!a.c()) {
                a.a(true);
                AppLovinBroadcastManager.getInstance(this.a).registerReceiver(a, new IntentFilter(str));
            }
            return true;
        }
    }

    public void b(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        b a;
        if (StringUtils.isValidString(str)) {
            synchronized (this.c) {
                a = a(str, appLovinCommunicatorSubscriber);
            }
            if (a != null) {
                a.a(false);
                AppLovinBroadcastManager.getInstance(this.a).unregisterReceiver(a);
            }
        }
    }
}
