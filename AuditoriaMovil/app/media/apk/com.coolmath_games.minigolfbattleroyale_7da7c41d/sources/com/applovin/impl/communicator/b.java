package com.applovin.impl.communicator;

import android.content.Context;
import android.content.Intent;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.r;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public class b implements AppLovinBroadcastManager.Receiver {
    private final String b;
    private final WeakReference<AppLovinCommunicatorSubscriber> c;
    private boolean a = true;
    private final Set<CommunicatorMessageImpl> d = new LinkedHashSet();
    private final Object e = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        this.b = str;
        this.c = new WeakReference<>(appLovinCommunicatorSubscriber);
    }

    public String a() {
        return this.b;
    }

    public void a(boolean z) {
        this.a = z;
    }

    public AppLovinCommunicatorSubscriber b() {
        return this.c.get();
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
                if (this.c.get() != null) {
                    if (this.c.get().equals(bVar.c.get())) {
                        return true;
                    }
                } else if (this.c.get() == bVar.c.get()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + (this.c.get() != null ? this.c.get().hashCode() : 0);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        if (b() == null) {
            r.i("AppLovinCommunicator", "Message received for GC'd subscriber");
            return;
        }
        CommunicatorMessageImpl communicatorMessageImpl = (CommunicatorMessageImpl) intent;
        boolean z = false;
        synchronized (this.e) {
            if (!this.d.contains(communicatorMessageImpl)) {
                this.d.add(communicatorMessageImpl);
                z = true;
            }
        }
        if (z) {
            b().onMessageReceived((AppLovinCommunicatorMessage) communicatorMessageImpl);
        }
    }
}
