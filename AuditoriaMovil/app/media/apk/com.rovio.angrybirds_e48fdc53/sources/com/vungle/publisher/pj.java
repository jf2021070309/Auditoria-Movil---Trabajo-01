package com.vungle.publisher;

import com.vungle.publisher.bw;
import com.vungle.publisher.env.r;
import com.vungle.publisher.log.Logger;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class pj extends pi {
    VungleAdEventListener a;
    @Inject
    bw b;
    @Inject
    c c;
    @Inject
    r d;
    private int e;
    private boolean f;

    public void onEvent(z zVar) {
        String a2 = zVar.a();
        boolean a3 = this.c.a(a2);
        Logger.d(Logger.EVENT_TAG, "Ad availability notification for placement " + a2 + " with isAdAvailable = " + a3);
        a(pk.a(this, a2, a3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ void c(String str, boolean z) {
        this.a.onAdAvailabilityUpdate(str, z);
    }

    public void onEvent(bn bnVar) {
        String str = bnVar.a;
        Logger.d(Logger.EVENT_TAG, "Not initialized: Unable to load ad for placement " + str);
        a(pm.a(this, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ void b(String str) {
        this.a.onAdAvailabilityUpdate(str, false);
    }

    public void onEvent(bl blVar) {
        String str = blVar.a;
        Logger.d(Logger.EVENT_TAG, "Unable to load ad for placement - " + str);
        a(pn.a(this, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ void a(String str) {
        this.a.onAdAvailabilityUpdate(str, false);
    }

    public void onEvent(av<cn> avVar) {
        Logger.d(Logger.EVENT_TAG, "onAdStart() callback");
        this.e = 0;
        this.f = false;
        a(po.a(this, avVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ void a(av avVar) {
        this.a.onAdStart(avVar.c());
    }

    public void onEvent(bv<cn> bvVar) {
        a(bvVar.c(), bvVar.a());
    }

    public void onEvent(ax axVar) {
        this.f = true;
    }

    public void onEvent(bi biVar) {
        if (biVar instanceof bs) {
            Logger.d(Logger.EVENT_TAG, "onAdEnd() - activity destroyed");
        } else {
            Logger.d(Logger.EVENT_TAG, "onAdEnd() - error during playback");
        }
        a(biVar.c(), false);
    }

    void a(String str, boolean z) {
        Logger.d(Logger.EVENT_TAG, "onAdEnd(" + z + ") callback");
        a(pp.a(this, str, z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ void b(String str, boolean z) {
        this.a.onAdEnd(str, this.f, z);
    }

    public void onEvent(bm bmVar) {
        Logger.d(Logger.EVENT_TAG, "onUnableToPlayAd(error) callback");
        a(pq.a(this, bmVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ void a(bm bmVar) {
        this.a.onUnableToPlayAd(bmVar.c(), "Error launching ad");
    }

    public void onEvent(bj bjVar) {
        Logger.d(Logger.EVENT_TAG, "onUnableToPlayAd(already playing) callback");
        a(pr.a(this, bjVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ void a(bj bjVar) {
        this.a.onUnableToPlayAd(bjVar.a(), "Ad already playing");
    }

    public void onEvent(bo boVar) {
        Logger.d(Logger.EVENT_TAG, "onUnableToPlayAd(not initialized) callback");
        a(ps.a(this, boVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ void a(bo boVar) {
        this.a.onUnableToPlayAd(boVar.c(), "Vungle Publisher SDK was not successfully initialized - please check the logs");
    }

    public void onEvent(bp bpVar) {
        Logger.d(Logger.EVENT_TAG, "onUnableToPlayAd(throttled) callback");
        a(pt.a(this, bpVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ void a(bp bpVar) {
        this.a.onUnableToPlayAd(bpVar.c(), "Only " + bpVar.a() + " of minimum " + bpVar.d() + " seconds elapsed between ads");
    }

    public void onEvent(bq bqVar) {
        Logger.d(Logger.EVENT_TAG, "onUnableToPlayAd(unavailable) callback");
        a(pl.a(this, bqVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ void a(bq bqVar) {
        this.a.onUnableToPlayAd(bqVar.c(), "No cached or streaming ad available");
    }

    public void onEvent(ai aiVar) {
        int a2 = aiVar.a();
        if (a2 > this.e) {
            Logger.d(Logger.EVENT_TAG, "new watched millis " + a2);
            this.e = a2;
            return;
        }
        Logger.d(Logger.EVENT_TAG, "shorter watched millis " + a2);
    }

    private void a(Runnable runnable) {
        this.b.a(runnable, bw.b.clientEvent);
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a {
        @Inject
        Provider<pj> a;

        public pj a(VungleAdEventListener vungleAdEventListener) {
            pj pjVar = this.a.get();
            pjVar.a = vungleAdEventListener;
            return pjVar;
        }
    }
}
