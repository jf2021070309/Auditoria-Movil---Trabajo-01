package com.applovin.communicator;

import android.content.Context;
import com.applovin.impl.communicator.MessagingServiceImpl;
import com.applovin.impl.communicator.a;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.r;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class AppLovinCommunicator {
    private static AppLovinCommunicator a;
    private static final Object b = new Object();
    private k c;
    private r d;
    private final a e;
    private final MessagingServiceImpl f;

    private AppLovinCommunicator(Context context) {
        this.e = new a(context);
        this.f = new MessagingServiceImpl(context);
    }

    private void a(String str) {
        r rVar = this.d;
        if (rVar != null) {
            rVar.b("AppLovinCommunicator", str);
        }
    }

    public static AppLovinCommunicator getInstance(Context context) {
        synchronized (b) {
            if (a == null) {
                a = new AppLovinCommunicator(context.getApplicationContext());
            }
        }
        return a;
    }

    public void a(k kVar) {
        this.c = kVar;
        this.d = kVar.z();
        a("Attached SDK instance: " + kVar + "...");
    }

    public AppLovinCommunicatorMessagingService getMessagingService() {
        return this.f;
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        subscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            if (this.e.a(appLovinCommunicatorSubscriber, str)) {
                this.f.maybeFlushStickyMessages(str);
            } else {
                a("Unable to subscribe " + appLovinCommunicatorSubscriber + " to topic: " + str);
            }
        }
    }

    public String toString() {
        return "AppLovinCommunicator{sdk=" + this.c + '}';
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        unsubscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            a("Unsubscribing " + appLovinCommunicatorSubscriber + " from topic: " + str);
            this.e.b(appLovinCommunicatorSubscriber, str);
        }
    }
}
