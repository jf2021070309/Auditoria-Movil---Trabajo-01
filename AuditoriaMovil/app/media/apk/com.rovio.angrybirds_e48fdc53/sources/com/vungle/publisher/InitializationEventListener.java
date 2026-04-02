package com.vungle.publisher;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.vungle.publisher.env.r;
import com.vungle.publisher.log.Logger;
import javax.inject.Inject;
import javax.inject.Singleton;
@Singleton
/* loaded from: classes4.dex */
public class InitializationEventListener extends pi {
    @Inject
    bw a;
    @Inject
    vc b;
    @Inject
    a c;
    @Inject
    r d;
    private final zs e = new zs();

    public void onEvent(pf pfVar) {
        Logger.d(Logger.DEVICE_TAG, "device ID available");
        a(1);
    }

    public void onEvent(cm cmVar) {
        Logger.d(Logger.DATABASE_TAG, "on database ready");
        a(0);
    }

    public void onEvent(pg pgVar) {
        Logger.d(Logger.DEVICE_TAG, "webview user agent updated");
        a(2);
    }

    private void a(int i) {
        if (this.e.a(i, 1) == 7) {
            if (this.d.b.compareAndSet(false, true)) {
                unregister();
                this.a.a(com.vungle.publisher.a.a(this), 2000L);
                return;
            }
            Logger.d(Logger.EVENT_TAG, "Already processing initialize, going to drop this request");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ void a() {
        this.c.register();
        this.d.g();
        qw.a();
        this.b.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends pi {
        @Inject
        c a;
        @Inject
        yk b;
        @Inject
        r c;
        @Inject
        com.vungle.publisher.log.g d;
        @Inject
        vc e;
        @Inject
        bw f;

        public void onEvent(td tdVar) {
            this.c.b.set(false);
            if (tdVar.a()) {
                if (this.c.a.compareAndSet(false, true)) {
                    unregister();
                    this.eventBus.a(new qk());
                    this.b.a();
                    this.a.a();
                    this.c.d();
                    this.f.b(b.a(this), TTAdConstant.AD_MAX_EVENT_TIME);
                    return;
                }
                return;
            }
            this.eventBus.a(new qj(new Throwable(tdVar.b())));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public /* synthetic */ void a() {
            this.d.a(this.e);
        }
    }
}
