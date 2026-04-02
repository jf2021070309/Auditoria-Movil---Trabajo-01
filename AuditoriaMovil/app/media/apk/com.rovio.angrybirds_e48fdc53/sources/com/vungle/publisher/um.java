package com.vungle.publisher;

import com.vungle.publisher.log.Logger;
/* loaded from: classes4.dex */
public class um implements Runnable {
    private final ub a;

    public um(ub ubVar) {
        this.a = ubVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Logger.d(Logger.NETWORK_TAG, "executing " + this.a);
            this.a.d();
        } catch (Exception e) {
            Logger.e(Logger.NETWORK_TAG, "error processing transaction: " + this.a, e);
        }
    }
}
