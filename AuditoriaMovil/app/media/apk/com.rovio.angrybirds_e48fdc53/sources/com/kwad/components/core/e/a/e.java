package com.kwad.components.core.e.a;

import android.app.Activity;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.bj;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class e {
    private final List<b> Jc;
    private final Stack<AdTemplate> Jd;
    private final AtomicBoolean Je;
    private final Set<String> Jf;
    private final String TAG;
    private final AtomicBoolean op;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        private static final e Jj = new e((byte) 0);
    }

    private e() {
        this.TAG = "InstalledActivateManager";
        this.Jc = new CopyOnWriteArrayList();
        this.Jd = new Stack<>();
        this.op = new AtomicBoolean();
        this.Je = new AtomicBoolean();
        this.Jf = new HashSet();
    }

    /* synthetic */ e(byte b) {
        this();
    }

    private void P(final AdTemplate adTemplate) {
        if (!this.Je.get() && !this.op.get()) {
            com.kwad.sdk.core.e.c.d("InstalledActivateManager", "showInstalledActivate");
            this.Je.set(true);
            bj.runOnUiThreadDelay(new Runnable() { // from class: com.kwad.components.core.e.a.e.1
                /* JADX INFO: Access modifiers changed from: private */
                public void mT() {
                    com.kwad.sdk.core.c.b.AT();
                    if (!com.kwad.sdk.core.c.b.isEnable()) {
                        e.this.Je.set(false);
                        return;
                    }
                    com.kwad.sdk.core.c.b.AT();
                    if (com.kwad.sdk.core.c.b.getCurrentActivity() != null) {
                        com.kwad.sdk.core.c.b.AT();
                        if (com.kwad.sdk.core.c.b.isAppOnForeground()) {
                            mU();
                            return;
                        }
                    }
                    com.kwad.sdk.core.c.b.AT();
                    com.kwad.sdk.core.c.b.a(new com.kwad.sdk.core.c.d() { // from class: com.kwad.components.core.e.a.e.1.2
                        @Override // com.kwad.sdk.core.c.d, com.kwad.sdk.core.c.c
                        /* renamed from: onActivityResumed */
                        public final void c(Activity activity) {
                            super.c(activity);
                            com.kwad.sdk.core.c.b.AT();
                            com.kwad.sdk.core.c.b.b((com.kwad.sdk.core.c.c) this);
                            com.kwad.sdk.core.e.c.d("InstalledActivateManager", "startShow onBackToForeground");
                            mU();
                        }
                    });
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void mU() {
                    com.kwad.sdk.core.e.c.d("InstalledActivateManager", "startShow");
                    e.this.Q(adTemplate);
                    e.this.Je.set(false);
                    e.this.Jf.remove(com.kwad.sdk.core.response.b.a.aq(com.kwad.sdk.core.response.b.d.ck(adTemplate)));
                }

                @Override // java.lang.Runnable
                public final void run() {
                    final com.kwad.components.ad.b.a.a aVar = (com.kwad.components.ad.b.a.a) com.kwad.sdk.components.c.f(com.kwad.components.ad.b.a.a.class);
                    if (aVar == null || !aVar.S()) {
                        mT();
                    } else {
                        aVar.a(new com.kwad.components.ad.b.a.c() { // from class: com.kwad.components.core.e.a.e.1.1
                            @Override // com.kwad.components.ad.b.a.c, com.kwad.components.ad.b.a.b
                            public final void U() {
                                aVar.b(this);
                                mT();
                                com.kwad.sdk.core.e.c.d("InstalledActivateManager", "startShow onPushAdClose");
                            }
                        });
                    }
                }
            }, com.kwad.sdk.core.response.b.b.bV(adTemplate));
            return;
        }
        com.kwad.sdk.core.e.c.d("InstalledActivateManager", "mLoadDisable: " + this.op.get() + ", mLoadDisable: " + this.Je.get());
        this.Jd.add(adTemplate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(AdTemplate adTemplate) {
        if (a(adTemplate, new b() { // from class: com.kwad.components.core.e.a.e.2
            @Override // com.kwad.components.core.e.a.b
            public final void fj() {
                com.kwad.sdk.core.e.c.d("InstalledActivateManager", "onViewClose");
                e.this.ep();
                e.this.mS();
            }

            @Override // com.kwad.components.core.e.a.b
            public final void mP() {
                com.kwad.sdk.core.e.c.d("InstalledActivateManager", "onViewShow");
                e.this.eu();
            }
        })) {
            return;
        }
        mS();
    }

    private static boolean a(AdTemplate adTemplate, b bVar) {
        com.kwad.sdk.core.e.c.d("InstalledActivateManager", "showToActivityWindow");
        return new h().b(adTemplate, bVar);
    }

    public static e mR() {
        return a.Jj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void mS() {
        if (this.Jd.isEmpty()) {
            return;
        }
        P(this.Jd.pop());
    }

    public final synchronized void O(AdTemplate adTemplate) {
        String aq = com.kwad.sdk.core.response.b.a.aq(com.kwad.sdk.core.response.b.d.ck(adTemplate));
        if (com.kwad.sdk.core.response.b.b.bU(adTemplate) && !this.Jf.contains(aq)) {
            this.Jf.add(aq);
            P(adTemplate);
        }
    }

    public final void a(b bVar) {
        this.Jc.add(bVar);
    }

    public final void b(b bVar) {
        this.Jc.remove(bVar);
    }

    public final void ep() {
        this.op.set(false);
        for (b bVar : this.Jc) {
            bVar.fj();
        }
    }

    public final void eu() {
        this.op.set(true);
        for (b bVar : this.Jc) {
            bVar.mP();
        }
    }

    public final boolean isShowing() {
        return this.op.get();
    }
}
