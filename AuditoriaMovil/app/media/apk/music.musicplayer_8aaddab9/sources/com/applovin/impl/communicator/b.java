package com.applovin.impl.communicator;

import android.content.Context;
import android.content.Intent;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.v;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public class b implements AppLovinBroadcastManager.Receiver {

    /* renamed from: b  reason: collision with root package name */
    private final String f3278b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<AppLovinCommunicatorSubscriber> f3279c;
    private boolean a = true;

    /* renamed from: d  reason: collision with root package name */
    private final Set<CommunicatorMessageImpl> f3280d = new LinkedHashSet();

    /* renamed from: e  reason: collision with root package name */
    private final Object f3281e = new Object();

    public b(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        this.f3278b = str;
        this.f3279c = new WeakReference<>(appLovinCommunicatorSubscriber);
    }

    public String a() {
        return this.f3278b;
    }

    public void a(boolean z) {
        this.a = z;
    }

    public AppLovinCommunicatorSubscriber b() {
        return this.f3279c.get();
    }

    public boolean c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (a().equals(bVar.a())) {
                if (this.f3279c.get() != null) {
                    if (this.f3279c.get().equals(bVar.f3279c.get())) {
                        return true;
                    }
                } else if (this.f3279c.get() == bVar.f3279c.get()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (this.f3278b.hashCode() * 31) + (this.f3279c.get() != null ? this.f3279c.get().hashCode() : 0);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        if (b() == null) {
            v.i("AppLovinCommunicator", "Message received for GC'd subscriber");
            return;
        }
        CommunicatorMessageImpl communicatorMessageImpl = (CommunicatorMessageImpl) intent;
        boolean z = false;
        synchronized (this.f3281e) {
            if (!this.f3280d.contains(communicatorMessageImpl)) {
                this.f3280d.add(communicatorMessageImpl);
                z = true;
            }
        }
        if (z) {
            b().onMessageReceived((AppLovinCommunicatorMessage) communicatorMessageImpl);
        }
    }
}
