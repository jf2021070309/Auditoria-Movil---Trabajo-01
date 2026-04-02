package com.applovin.impl.sdk;

import java.util.LinkedList;
import java.util.Queue;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class t {
    private final Queue<AppLovinAdBase> a = new LinkedList();
    private final Object b = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        int size;
        synchronized (this.b) {
            size = this.a.size();
        }
        return size;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AppLovinAdBase appLovinAdBase) {
        synchronized (this.b) {
            if (a() <= 25) {
                this.a.offer(appLovinAdBase);
            } else {
                r.i("AppLovinSdk", "Maximum queue capacity reached - discarding ad...");
            }
        }
    }

    boolean b() {
        boolean z;
        synchronized (this.b) {
            z = a() == 0;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppLovinAdBase c() {
        AppLovinAdBase poll;
        synchronized (this.b) {
            poll = !b() ? this.a.poll() : null;
        }
        return poll;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppLovinAdBase d() {
        AppLovinAdBase peek;
        synchronized (this.b) {
            peek = this.a.peek();
        }
        return peek;
    }
}
