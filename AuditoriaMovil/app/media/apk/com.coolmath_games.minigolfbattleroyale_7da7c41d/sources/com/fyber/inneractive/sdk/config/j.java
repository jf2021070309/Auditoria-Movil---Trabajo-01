package com.fyber.inneractive.sdk.config;

import android.content.Context;
import com.fyber.inneractive.sdk.h.ac;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class j {
    public i a = new i();
    List<a> b = new CopyOnWriteArrayList();
    boolean c = false;
    final com.fyber.inneractive.sdk.a.b d = new com.fyber.inneractive.sdk.a.b();
    private final Context e;

    /* loaded from: classes.dex */
    public interface a {
        void onGlobalConfigChanged(j jVar, i iVar);
    }

    public j(Context context) {
        this.e = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        IAConfigManager.h().a(new ac(new com.fyber.inneractive.sdk.h.r<i>() { // from class: com.fyber.inneractive.sdk.config.j.1
            @Override // com.fyber.inneractive.sdk.h.r
            public final /* synthetic */ void a(i iVar, Exception exc, boolean z) {
                i iVar2 = iVar;
                if (iVar2 != null) {
                    j jVar = j.this;
                    if (iVar2 == null || iVar2.equals(jVar.a)) {
                        return;
                    }
                    jVar.c = true;
                    jVar.a = iVar2;
                    for (a aVar : jVar.b) {
                        aVar.onGlobalConfigChanged(jVar, jVar.a);
                    }
                }
            }
        }, this.e, this.d));
    }

    public final void a(a aVar) {
        this.b.add(aVar);
    }

    public final void b(a aVar) {
        this.b.remove(aVar);
    }
}
