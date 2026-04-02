package com.kwad.components.core.webview.b.a;

import com.kwad.sdk.utils.bj;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public abstract class v implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.sdk.core.webview.c.c WP;
    private CopyOnWriteArrayList<com.kwad.sdk.core.b> WQ = new CopyOnWriteArrayList<>();

    @Override // com.kwad.sdk.core.webview.c.a
    public void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        this.WP = cVar;
        if (this.WQ.size() > 0) {
            Iterator<com.kwad.sdk.core.b> it = this.WQ.iterator();
            while (it.hasNext()) {
                com.kwad.sdk.core.b next = it.next();
                b(next);
                this.WQ.remove(next);
            }
        }
    }

    public final void b(final com.kwad.sdk.core.b bVar) {
        if (this.WP != null) {
            bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.core.webview.b.a.v.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (v.this.WP != null) {
                        v.this.WP.a(bVar);
                    }
                }
            });
        } else {
            this.WQ.add(bVar);
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public void onDestroy() {
        this.WP = null;
    }
}
