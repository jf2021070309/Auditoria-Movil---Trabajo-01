package com.amazon.aps.iva.t5;
/* compiled from: ConditionVariable.java */
/* loaded from: classes.dex */
public final class f {
    public boolean a;

    public f() {
    }

    public final synchronized void a() throws InterruptedException {
        while (!this.a) {
            wait();
        }
    }

    public final synchronized void b() {
        boolean z = false;
        while (!this.a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean c() {
        if (this.a) {
            return false;
        }
        this.a = true;
        notifyAll();
        return true;
    }

    public f(int i) {
    }
}
