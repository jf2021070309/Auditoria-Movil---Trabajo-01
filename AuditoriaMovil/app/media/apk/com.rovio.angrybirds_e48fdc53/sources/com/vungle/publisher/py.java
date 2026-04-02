package com.vungle.publisher;

import com.vungle.publisher.bw;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class py extends pi {
    VungleInitListener a;
    @Inject
    bw b;

    public void onEvent(qk qkVar) {
        a(pz.a(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ void a() {
        if (this.a != null) {
            this.a.onSuccess();
            this.a = null;
            unregister();
        }
    }

    public void onEvent(qj qjVar) {
        a(qa.a(this, qjVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ void a(qj qjVar) {
        if (this.a != null) {
            this.a.onFailure(qjVar.a);
            this.a = null;
            unregister();
        }
    }

    private void a(Runnable runnable) {
        this.b.a(runnable, bw.b.clientEvent);
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a {
        @Inject
        Provider<py> a;

        public py a(VungleInitListener vungleInitListener) {
            py pyVar = this.a.get();
            pyVar.a = vungleInitListener;
            return pyVar;
        }
    }
}
