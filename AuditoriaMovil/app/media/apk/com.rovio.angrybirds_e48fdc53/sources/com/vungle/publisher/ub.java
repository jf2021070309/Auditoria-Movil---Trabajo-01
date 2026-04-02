package com.vungle.publisher;

import com.vungle.publisher.bw;
import com.vungle.publisher.log.Logger;
import com.vungle.publisher.tr;
import java.util.EnumMap;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class ub {
    @Inject
    ue a;
    private tr b;
    private tx c;
    private un d;
    private bw.b e;

    public tr a() {
        return this.b;
    }

    public un b() {
        return this.d;
    }

    public bw.b c() {
        return this.e;
    }

    public void d() {
        this.d.d();
        this.c.a(this, this.a.a(this.b));
    }

    public String toString() {
        return "{" + this.b + ", " + this.d + "}";
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a {
        private static final EnumMap<tr.c, bw.b> b = new EnumMap<>(tr.c.class);
        @Inject
        Provider<ub> a;

        static {
            b.put((EnumMap<tr.c, bw.b>) tr.c.download, (tr.c) bw.b.downloadLocalAd);
            b.put((EnumMap<tr.c, bw.b>) tr.c.reportAd, (tr.c) bw.b.reportAd);
            b.put((EnumMap<tr.c, bw.b>) tr.c.requestConfig, (tr.c) bw.b.requestConfig);
            b.put((EnumMap<tr.c, bw.b>) tr.c.requestLocalAd, (tr.c) bw.b.requestLocalAd);
            b.put((EnumMap<tr.c, bw.b>) tr.c.requestWillPlayAd, (tr.c) bw.b.requestWillPlayAd);
            b.put((EnumMap<tr.c, bw.b>) tr.c.trackEvent, (tr.c) bw.b.externalNetworkRequest);
            b.put((EnumMap<tr.c, bw.b>) tr.c.trackInstall, (tr.c) bw.b.reportInstall);
            b.put((EnumMap<tr.c, bw.b>) tr.c.unfilledAd, (tr.c) bw.b.unfilledAd);
            b.put((EnumMap<tr.c, bw.b>) tr.c.appFingerprint, (tr.c) bw.b.appFingerprint);
            b.put((EnumMap<tr.c, bw.b>) tr.c.reportExceptions, (tr.c) bw.b.reportExceptions);
        }

        public ub a(tr trVar, tx txVar) {
            return a(trVar, txVar, new un());
        }

        public ub a(tr trVar, tx txVar, un unVar) {
            ub ubVar = this.a.get();
            ubVar.b = trVar;
            ubVar.c = txVar;
            bw.b bVar = b.get(trVar.b());
            if (bVar == null) {
                Logger.w(Logger.NETWORK_TAG, "missing mapping for HttpTransaction requestType = " + trVar.b().toString());
                bVar = bw.b.otherTask;
            }
            ubVar.e = bVar;
            ubVar.d = unVar;
            return ubVar;
        }
    }
}
