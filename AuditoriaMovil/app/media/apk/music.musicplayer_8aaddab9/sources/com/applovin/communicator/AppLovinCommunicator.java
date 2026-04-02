package com.applovin.communicator;

import android.content.Context;
import com.applovin.impl.communicator.MessagingServiceImpl;
import com.applovin.impl.communicator.a;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.v;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class AppLovinCommunicator {
    private static AppLovinCommunicator a;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f3038b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private m f3039c;

    /* renamed from: d  reason: collision with root package name */
    private v f3040d;

    /* renamed from: e  reason: collision with root package name */
    private final a f3041e;

    /* renamed from: f  reason: collision with root package name */
    private final MessagingServiceImpl f3042f;

    private AppLovinCommunicator(Context context) {
        this.f3041e = new a(context);
        this.f3042f = new MessagingServiceImpl(context);
    }

    private void a(String str) {
        v vVar = this.f3040d;
        if (vVar != null) {
            vVar.b("AppLovinCommunicator", str);
        }
    }

    public static AppLovinCommunicator getInstance(Context context) {
        synchronized (f3038b) {
            if (a == null) {
                a = new AppLovinCommunicator(context.getApplicationContext());
            }
        }
        return a;
    }

    public void a(m mVar) {
        this.f3039c = mVar;
        this.f3040d = mVar.B();
        a("Attached SDK instance: " + mVar + "...");
    }

    public AppLovinCommunicatorMessagingService getMessagingService() {
        return this.f3042f;
    }

    public boolean respondsToTopic(String str) {
        return this.f3039c.ag().a(str);
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        subscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            if (this.f3041e.a(appLovinCommunicatorSubscriber, str)) {
                this.f3042f.maybeFlushStickyMessages(str);
            } else {
                a("Unable to subscribe " + appLovinCommunicatorSubscriber + " to topic: " + str);
            }
        }
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("AppLovinCommunicator{sdk=");
        y.append(this.f3039c);
        y.append('}');
        return y.toString();
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        unsubscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            a("Unsubscribing " + appLovinCommunicatorSubscriber + " from topic: " + str);
            this.f3041e.b(appLovinCommunicatorSubscriber, str);
        }
    }
}
