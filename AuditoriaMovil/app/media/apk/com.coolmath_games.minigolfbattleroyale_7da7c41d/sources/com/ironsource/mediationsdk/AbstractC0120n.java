package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashSet;
import java.util.Iterator;
/* renamed from: com.ironsource.mediationsdk.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0120n {
    private HashSet<ImpressionDataListener> a;

    public AbstractC0120n(HashSet<ImpressionDataListener> hashSet) {
        this.a = new HashSet<>();
        this.a = hashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String c() {
        return "fallback_" + System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(com.ironsource.mediationsdk.a.c cVar, String str) {
        if (cVar == null) {
            IronLog.INTERNAL.verbose("no auctionResponseItem or listener");
            return;
        }
        ImpressionData a = cVar.a(str);
        if (a != null) {
            Iterator<ImpressionDataListener> it = this.a.iterator();
            while (it.hasNext()) {
                ImpressionDataListener next = it.next();
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onImpressionSuccess " + next.getClass().getSimpleName() + ": " + a);
                next.onImpressionSuccess(a);
            }
        }
    }

    public final void a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.a.add(impressionDataListener);
        }
    }

    public final void b() {
        synchronized (this) {
            this.a.clear();
        }
    }

    public final void b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.a.remove(impressionDataListener);
        }
    }
}
