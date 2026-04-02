package com.fyber.inneractive.sdk.c;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class c {
    public final HashMap<com.fyber.inneractive.sdk.j.a, b> a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {
        public static c a = new c((byte) 0);
    }

    /* loaded from: classes.dex */
    public interface b {
        com.fyber.inneractive.sdk.j.b a();

        com.fyber.inneractive.sdk.e.a b();
    }

    /* synthetic */ c(byte b2) {
        this();
    }

    private c() {
        this.a = new HashMap<>();
    }

    public final com.fyber.inneractive.sdk.j.b a(com.fyber.inneractive.sdk.j.a aVar) {
        b bVar = this.a.get(aVar);
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    public final com.fyber.inneractive.sdk.e.a b(com.fyber.inneractive.sdk.j.a aVar) {
        b bVar = this.a.get(aVar);
        if (bVar != null) {
            return bVar.b();
        }
        return null;
    }

    public final void a(com.fyber.inneractive.sdk.j.a aVar, b bVar) {
        if (this.a.containsKey(aVar)) {
            IAlog.d("Handler already exists for ad type %s! : %s", aVar, this.a.get(aVar));
        } else {
            this.a.put(aVar, bVar);
        }
    }

    public final boolean c(com.fyber.inneractive.sdk.j.a aVar) {
        return this.a.containsKey(aVar);
    }
}
