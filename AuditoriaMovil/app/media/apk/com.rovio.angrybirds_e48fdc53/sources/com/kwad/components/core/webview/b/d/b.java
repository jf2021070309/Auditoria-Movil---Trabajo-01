package com.kwad.components.core.webview.b.d;

import com.kwad.components.core.webview.b.e.e;
import com.kwad.sdk.utils.bj;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* loaded from: classes.dex */
public final class b {
    private final Set<e> XL;

    /* loaded from: classes.dex */
    static class a {
        private static final b XP = new b((byte) 0);
    }

    private b() {
        this.XL = new CopyOnWriteArraySet();
    }

    /* synthetic */ b(byte b) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aS(String str) {
        if (this.XL.size() == 0) {
            return;
        }
        for (e eVar : new HashSet(this.XL)) {
            eVar.q(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, long j, long j2, long j3) {
        if (this.XL.size() == 0) {
            return;
        }
        for (e eVar : new HashSet(this.XL)) {
            eVar.a(str, j, j2, j3);
        }
    }

    public static b si() {
        return a.XP;
    }

    public final void a(e eVar) {
        if (eVar != null) {
            this.XL.add(eVar);
        }
    }

    public final void aT(final String str) {
        bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.core.webview.b.d.b.1
            @Override // java.lang.Runnable
            public final void run() {
                b.this.aS(str);
            }
        });
    }

    public final void b(e eVar) {
        this.XL.remove(eVar);
    }

    public final void c(final String str, final long j, final long j2, final long j3) {
        bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.core.webview.b.d.b.2
            @Override // java.lang.Runnable
            public final void run() {
                b.this.b(str, j, j2, j3);
            }
        });
    }

    public final void sj() {
        this.XL.clear();
    }
}
