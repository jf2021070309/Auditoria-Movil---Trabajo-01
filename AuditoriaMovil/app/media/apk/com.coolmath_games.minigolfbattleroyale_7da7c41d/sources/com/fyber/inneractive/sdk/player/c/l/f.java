package com.fyber.inneractive.sdk.player.c.l;

import android.os.Handler;
import android.view.Surface;
/* loaded from: classes.dex */
public interface f {
    void a(int i, int i2);

    /* loaded from: classes.dex */
    public static final class a {
        final Handler a;
        final f b;

        public a(Handler handler, f fVar) {
            this.a = fVar != null ? (Handler) com.fyber.inneractive.sdk.player.c.k.a.a(handler) : null;
            this.b = fVar;
        }

        public final void a(final int i, final int i2, final int i3, final float f) {
            if (this.b != null) {
                this.a.post(new Runnable() { // from class: com.fyber.inneractive.sdk.player.c.l.f.a.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.b.a(i, i2);
                    }
                });
            }
        }

        public final void a(final Surface surface) {
            if (this.b != null) {
                this.a.post(new Runnable() { // from class: com.fyber.inneractive.sdk.player.c.l.f.a.6
                    @Override // java.lang.Runnable
                    public final void run() {
                    }
                });
            }
        }

        public final void a(final com.fyber.inneractive.sdk.player.c.b.c cVar) {
            if (this.b != null) {
                this.a.post(new Runnable() { // from class: com.fyber.inneractive.sdk.player.c.l.f.a.7
                    @Override // java.lang.Runnable
                    public final void run() {
                        cVar.a();
                    }
                });
            }
        }
    }
}
