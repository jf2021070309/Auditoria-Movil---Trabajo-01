package com.kwad.components.ad.reward;

import com.kwad.sdk.utils.bj;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public final class d {
    private final Set<com.kwad.components.ad.reward.e.k> oA;

    /* loaded from: classes.dex */
    static class a {
        private static final d oD = new d((byte) 0);
    }

    private d() {
        this.oA = new HashSet();
    }

    /* synthetic */ d(byte b) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.kwad.components.core.webview.b.b.q qVar) {
        if (this.oA.size() == 0) {
            return;
        }
        for (com.kwad.components.ad.reward.e.k kVar : this.oA) {
            kVar.a(qVar);
        }
    }

    public static d fy() {
        return a.oD;
    }

    public final void a(com.kwad.components.ad.reward.e.k kVar) {
        if (kVar != null) {
            this.oA.add(kVar);
        }
    }

    public final void b(com.kwad.components.ad.reward.e.k kVar) {
        this.oA.remove(kVar);
    }

    public final void c(final com.kwad.components.core.webview.b.b.q qVar) {
        bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.reward.d.1
            @Override // java.lang.Runnable
            public final void run() {
                d.this.b(qVar);
            }
        });
    }
}
