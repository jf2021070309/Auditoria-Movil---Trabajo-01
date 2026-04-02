package com.kwad.components.core.o;

import android.os.Bundle;
import com.kwad.sdk.utils.bj;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public class h {
    private static volatile h Po;
    private final List<i> mListeners = new CopyOnWriteArrayList();

    private void c(final com.kwad.sdk.g.a<i> aVar) {
        bj.postOnUiThread(new Runnable() { // from class: com.kwad.components.core.o.h.5
            @Override // java.lang.Runnable
            public final void run() {
                for (i iVar : h.this.mListeners) {
                    if (iVar != null) {
                        try {
                            aVar.accept(iVar);
                        } catch (Throwable th) {
                            com.kwad.sdk.core.e.c.printStackTraceOnly(th);
                        }
                    }
                }
            }
        });
    }

    public static h pA() {
        if (Po == null) {
            synchronized (h.class) {
                if (Po == null) {
                    Po = new h();
                }
            }
        }
        return Po;
    }

    public final void a(final c cVar, final Bundle bundle) {
        c(new com.kwad.sdk.g.a<i>() { // from class: com.kwad.components.core.o.h.1
            @Override // com.kwad.sdk.g.a
            public final /* bridge */ /* synthetic */ void accept(i iVar) {
            }
        });
    }

    public final void a(i iVar) {
        this.mListeners.add(iVar);
    }

    public final void e(final c cVar) {
        c(new com.kwad.sdk.g.a<i>() { // from class: com.kwad.components.core.o.h.2
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.g.a
            /* renamed from: b */
            public void accept(i iVar) {
                iVar.c(cVar);
            }
        });
    }

    public final void f(final c cVar) {
        c(new com.kwad.sdk.g.a<i>() { // from class: com.kwad.components.core.o.h.3
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.g.a
            /* renamed from: b */
            public void accept(i iVar) {
                iVar.b(cVar);
            }
        });
    }

    public final void g(final c cVar) {
        c(new com.kwad.sdk.g.a<i>() { // from class: com.kwad.components.core.o.h.4
            @Override // com.kwad.sdk.g.a
            public final /* bridge */ /* synthetic */ void accept(i iVar) {
            }
        });
    }
}
