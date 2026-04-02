package androidx.fragment.app;

import android.media.AudioTrack;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.view.View;
import androidx.fragment.app.u;
import com.amazon.aps.iva.g6.x;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.types.AdMediaState;
import com.crunchyroll.player.interactiveads.InteractiveAdsManagerImpl;
import com.google.ads.interactivemedia.v3.api.Ad;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Callables;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                u uVar = (u) this.c;
                u.a aVar = (u.a) this.d;
                com.amazon.aps.iva.yb0.j.f(uVar, "this$0");
                com.amazon.aps.iva.yb0.j.f(aVar, "$operation");
                if (uVar.b.contains(aVar)) {
                    u.b.EnumC0029b enumC0029b = aVar.a;
                    View view = aVar.c.mView;
                    com.amazon.aps.iva.yb0.j.e(view, "operation.fragment.mView");
                    enumC0029b.applyState(view);
                    return;
                }
                return;
            case 1:
                AudioTrack audioTrack = (AudioTrack) this.c;
                com.amazon.aps.iva.t5.f fVar = (com.amazon.aps.iva.t5.f) this.d;
                Object obj = com.amazon.aps.iva.c6.s.g0;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    fVar.c();
                    synchronized (com.amazon.aps.iva.c6.s.g0) {
                        int i = com.amazon.aps.iva.c6.s.i0 - 1;
                        com.amazon.aps.iva.c6.s.i0 = i;
                        if (i == 0) {
                            com.amazon.aps.iva.c6.s.h0.shutdown();
                            com.amazon.aps.iva.c6.s.h0 = null;
                        }
                    }
                    return;
                } catch (Throwable th) {
                    fVar.c();
                    synchronized (com.amazon.aps.iva.c6.s.g0) {
                        int i2 = com.amazon.aps.iva.c6.s.i0 - 1;
                        com.amazon.aps.iva.c6.s.i0 = i2;
                        if (i2 == 0) {
                            com.amazon.aps.iva.c6.s.h0.shutdown();
                            com.amazon.aps.iva.c6.s.h0 = null;
                        }
                        throw th;
                    }
                }
            case 2:
                x xVar = (x) this.c;
                SettableFuture settableFuture = (SettableFuture) this.d;
                v vVar = x.f;
                xVar.getClass();
                try {
                    xVar.b.release();
                    settableFuture.set(null);
                    return;
                } catch (Throwable th2) {
                    settableFuture.setException(th2);
                    return;
                }
            case 3:
                ListenableFuture listenableFuture = (ListenableFuture) this.c;
                com.amazon.aps.iva.b6.x.d(this.d);
                int i3 = com.amazon.aps.iva.b8.m.b;
                try {
                    MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) listenableFuture.get();
                    throw null;
                } catch (InterruptedException | CancellationException | ExecutionException e) {
                    com.amazon.aps.iva.t5.p.h("Library operation failed", e);
                    throw null;
                }
            case 4:
            default:
                Callables.b((Supplier) this.c, (Runnable) this.d);
                return;
            case 5:
                int i4 = com.amazon.aps.iva.b8.t.u;
                ((SettableFuture) this.d).set(Boolean.valueOf(((com.amazon.aps.iva.b8.t) this.c).i()));
                return;
            case 6:
                int i5 = com.amazon.aps.iva.qk.c.b;
                com.amazon.aps.iva.yb0.j.f((InteractiveAdsManagerImpl) this.c, "this$0");
                com.amazon.aps.iva.yb0.j.f((Ad) this.d, "$ad");
                AdMediaState.builder();
                throw null;
        }
    }
}
