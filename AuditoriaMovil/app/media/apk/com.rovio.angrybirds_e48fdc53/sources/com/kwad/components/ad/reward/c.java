package com.kwad.components.ad.reward;

import android.os.Looper;
import com.kwad.sdk.utils.bj;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public final class c {
    private final Set<com.kwad.components.ad.reward.e.j> ox;

    /* loaded from: classes.dex */
    static class a {
        private static final c oz = new c((byte) 0);
    }

    private c() {
        this.ox = new HashSet();
    }

    /* synthetic */ c(byte b) {
        this();
    }

    public static c fv() {
        return a.oz;
    }

    private void fw() {
        if (this.ox.size() == 0) {
            return;
        }
        for (com.kwad.components.ad.reward.e.j jVar : this.ox) {
            jVar.onRewardVerify();
        }
    }

    private static boolean isMainThread() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public final void a(com.kwad.components.ad.reward.e.j jVar) {
        if (jVar != null) {
            this.ox.add(jVar);
        }
    }

    public final void b(com.kwad.components.ad.reward.e.j jVar) {
        this.ox.remove(jVar);
    }

    public final void notifyRewardVerify() {
        if (isMainThread()) {
            fw();
        } else {
            bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.reward.c.1
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.notifyRewardVerify();
                }
            });
        }
    }
}
