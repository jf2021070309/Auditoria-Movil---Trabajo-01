package com.flurry.sdk;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public final class jy extends kn<kw> {
    private static jy a = null;

    protected jy() {
        super(jy.class.getName(), TimeUnit.MILLISECONDS, new PriorityBlockingQueue(11, new kl()));
    }

    public static synchronized jy a() {
        jy jyVar;
        synchronized (jy.class) {
            if (a == null) {
                a = new jy();
            }
            jyVar = a;
        }
        return jyVar;
    }
}
