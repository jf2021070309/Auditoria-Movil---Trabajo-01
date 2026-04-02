package com.fyber.inneractive.sdk.player.c.a;

import android.os.Handler;
/* loaded from: classes.dex */
public interface d {

    /* loaded from: classes.dex */
    public static final class a {
        final Handler a = null;
        final d b = null;

        public final void a(final com.fyber.inneractive.sdk.player.c.b.c cVar) {
            if (this.b != null) {
                this.a.post(new Runnable() { // from class: com.fyber.inneractive.sdk.player.c.a.d.a.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        cVar.a();
                    }
                });
            }
        }
    }
}
