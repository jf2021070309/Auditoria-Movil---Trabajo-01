package com.kwad.components.ad.f;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.kwad.sdk.utils.bj;
import com.kwad.sdk.utils.bm;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class b {
    private com.kwad.sdk.core.g.d dO;
    private CopyOnWriteArrayList<C0143b> mq = new CopyOnWriteArrayList<>();
    private int mr;

    /* loaded from: classes.dex */
    static final class a {
        private static final b mu = new b();
    }

    /* renamed from: com.kwad.components.ad.f.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0143b {
        private final c mv;
        private final WeakReference<View> mw;

        public C0143b(c cVar, View view) {
            this.mw = new WeakReference<>(view);
            this.mv = cVar;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void f(double d);
    }

    private void a(float f, Context context) {
        this.dO = new com.kwad.sdk.core.g.d(f);
        this.mq = new CopyOnWriteArrayList<>();
        this.dO.a(new com.kwad.sdk.core.g.b() { // from class: com.kwad.components.ad.f.b.1
            @Override // com.kwad.sdk.core.g.b
            public final void a(double d) {
                if (b.this.mq != null) {
                    b.this.e(d);
                    bj.a(new Runnable() { // from class: com.kwad.components.ad.f.b.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.kwad.sdk.core.e.c.d("KSNativeAdShakeManager", "onShakeEvent openGate2");
                            b.this.dO.CF();
                        }
                    }, null, 500L);
                }
            }

            @Override // com.kwad.sdk.core.g.b
            public final void aT() {
            }
        });
        this.dO.e(f);
        this.dO.bi(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(double d) {
        CopyOnWriteArrayList<C0143b> copyOnWriteArrayList = this.mq;
        int zG = (int) (com.kwad.sdk.core.config.d.zG() * 100.0f);
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        int i = Integer.MAX_VALUE;
        Iterator<C0143b> it = copyOnWriteArrayList.iterator();
        C0143b c0143b = null;
        C0143b c0143b2 = null;
        while (it.hasNext()) {
            C0143b next = it.next();
            WeakReference weakReference = next.mw;
            if (weakReference != null) {
                Rect rect = new Rect();
                if (((View) weakReference.get()).getGlobalVisibleRect(rect) && bm.o((View) weakReference.get(), zG)) {
                    int i2 = this.mr / 2;
                    int min = Math.min(Math.abs(rect.top - i2), Math.abs(rect.bottom - i2));
                    if (min < i) {
                        c0143b = next;
                        i = min;
                    } else if (min == i) {
                        c0143b2 = next;
                    }
                }
            }
        }
        if (c0143b != null) {
            if (c0143b2 != null) {
                Rect rect2 = new Rect();
                ((View) c0143b.mw.get()).getGlobalVisibleRect(rect2);
                Rect rect3 = new Rect();
                ((View) c0143b2.mw.get()).getGlobalVisibleRect(rect2);
                if (rect2.top < rect3.top) {
                    c0143b = c0143b2;
                }
            }
            c0143b.mv.f(d);
        }
    }

    public static b eF() {
        return a.mu;
    }

    public final void a(float f, View view, c cVar) {
        if (view == null || view.getContext() == null) {
            return;
        }
        if (this.dO == null) {
            this.mr = com.kwad.sdk.d.a.a.aI(view.getContext());
            a(f, view.getContext());
        }
        this.mq.add(new C0143b(cVar, view));
    }

    public final void a(c cVar) {
        Iterator<C0143b> it = this.mq.iterator();
        while (it.hasNext()) {
            C0143b next = it.next();
            if (next.mv == cVar) {
                this.mq.remove(next);
            }
        }
        com.kwad.sdk.core.e.c.d("KSNativeAdShakeManager", "sShakeItems size " + this.mq.size());
    }
}
