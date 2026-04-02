package com.applovin.impl.communicator;

import android.content.Context;
import android.content.IntentFilter;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.v;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class a {
    private final Context a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<b> f3276b = new HashSet(32);

    /* renamed from: c  reason: collision with root package name */
    private final Object f3277c = new Object();

    public a(Context context) {
        this.a = context;
    }

    private b a(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        for (b bVar : this.f3276b) {
            if (str.equals(bVar.a()) && appLovinCommunicatorSubscriber.equals(bVar.b())) {
                return bVar;
            }
        }
        return null;
    }

    public boolean a(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        if (appLovinCommunicatorSubscriber == null || !StringUtils.isValidString(str)) {
            v.i("AppLovinCommunicator", "Unable to subscribe - invalid subscriber (" + appLovinCommunicatorSubscriber + ") or topic (" + str + ")");
            return false;
        }
        synchronized (this.f3277c) {
            b a = a(str, appLovinCommunicatorSubscriber);
            if (a == null) {
                b bVar = new b(str, appLovinCommunicatorSubscriber);
                this.f3276b.add(bVar);
                AppLovinBroadcastManager.getInstance(this.a).registerReceiver(bVar, new IntentFilter(str));
                return true;
            }
            v.i("AppLovinCommunicator", "Attempting to re-subscribe subscriber (" + appLovinCommunicatorSubscriber + ") to topic (" + str + ")");
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
            synchronized (this.f3277c) {
                a = a(str, appLovinCommunicatorSubscriber);
            }
            if (a != null) {
                a.a(false);
                AppLovinBroadcastManager.getInstance(this.a).unregisterReceiver(a);
            }
        }
    }
}
