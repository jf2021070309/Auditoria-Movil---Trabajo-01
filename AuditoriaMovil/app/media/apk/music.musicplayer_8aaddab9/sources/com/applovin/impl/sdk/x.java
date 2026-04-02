package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.LinkedList;
import java.util.Queue;
/* loaded from: classes.dex */
public class x {
    private final Queue<AppLovinAdImpl> a = new LinkedList();

    /* renamed from: b  reason: collision with root package name */
    private final Object f4391b = new Object();

    public int a() {
        int size;
        synchronized (this.f4391b) {
            size = this.a.size();
        }
        return size;
    }

    public void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f4391b) {
            if (a() <= 25) {
                this.a.offer(appLovinAdImpl);
            } else {
                v.i("AppLovinSdk", "Maximum queue capacity reached - discarding ad...");
            }
        }
    }

    public boolean b() {
        boolean z;
        synchronized (this.f4391b) {
            z = a() == 0;
        }
        return z;
    }

    public AppLovinAdImpl c() {
        AppLovinAdImpl poll;
        synchronized (this.f4391b) {
            poll = !b() ? this.a.poll() : null;
        }
        return poll;
    }

    public AppLovinAdImpl d() {
        AppLovinAdImpl peek;
        synchronized (this.f4391b) {
            peek = this.a.peek();
        }
        return peek;
    }
}
