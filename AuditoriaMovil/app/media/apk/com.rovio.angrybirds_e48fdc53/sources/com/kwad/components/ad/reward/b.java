package com.kwad.components.ad.reward;

import android.os.Looper;
import com.kwad.components.core.playable.PlayableSource;
import com.kwad.sdk.utils.bj;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public final class b {
    private final Set<com.kwad.components.ad.reward.e.h> os;

    /* loaded from: classes.dex */
    static class a {
        private static final b ow = new b((byte) 0);
    }

    private b() {
        this.os = new HashSet();
    }

    /* synthetic */ b(byte b) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(PlayableSource playableSource, com.kwad.components.ad.reward.e.l lVar) {
        if (this.os.size() == 0) {
            return;
        }
        for (com.kwad.components.ad.reward.e.h hVar : this.os) {
            hVar.a(playableSource, lVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(PlayableSource playableSource) {
        if (this.os.size() == 0) {
            return;
        }
        for (com.kwad.components.ad.reward.e.h hVar : this.os) {
            hVar.bU();
        }
    }

    public static b fr() {
        return a.ow;
    }

    private void ft() {
        if (this.os.size() == 0) {
            return;
        }
        for (com.kwad.components.ad.reward.e.h hVar : this.os) {
            hVar.bT();
        }
    }

    private static boolean isMainThread() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public final void a(com.kwad.components.ad.reward.e.h hVar) {
        if (hVar != null) {
            this.os.add(hVar);
        }
    }

    public final void a(PlayableSource playableSource) {
        c(playableSource, null);
    }

    public final void b(com.kwad.components.ad.reward.e.h hVar) {
        this.os.remove(hVar);
    }

    public final void b(final PlayableSource playableSource) {
        if (isMainThread()) {
            c(playableSource);
        } else {
            bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.reward.b.3
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.c(playableSource);
                }
            });
        }
    }

    public final void c(final PlayableSource playableSource, final com.kwad.components.ad.reward.e.l lVar) {
        if (isMainThread()) {
            b(playableSource, lVar);
        } else {
            bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.reward.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.b(playableSource, lVar);
                }
            });
        }
    }

    public final void fs() {
        if (isMainThread()) {
            ft();
        } else {
            bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.reward.b.2
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.fs();
                }
            });
        }
    }
}
