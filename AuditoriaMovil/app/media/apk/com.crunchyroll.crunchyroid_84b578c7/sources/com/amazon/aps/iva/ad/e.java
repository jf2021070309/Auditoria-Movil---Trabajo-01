package com.amazon.aps.iva.ad;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import com.amazon.aps.iva.uc.s;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: FirstFrameWaiter.java */
/* loaded from: classes.dex */
public final class e implements f {
    public final Set<Activity> b = Collections.newSetFromMap(new WeakHashMap());
    public volatile boolean c;

    /* compiled from: FirstFrameWaiter.java */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnDrawListener {
        public final /* synthetic */ View b;

        /* compiled from: FirstFrameWaiter.java */
        /* renamed from: com.amazon.aps.iva.ad.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0113a implements Runnable {
            public final /* synthetic */ ViewTreeObserver.OnDrawListener b;

            public RunnableC0113a(ViewTreeObserver.OnDrawListener onDrawListener) {
                this.b = onDrawListener;
            }

            @Override // java.lang.Runnable
            public final void run() {
                s a = s.a();
                a.getClass();
                com.amazon.aps.iva.hd.l.a();
                a.d.set(true);
                e.this.c = true;
                View view = a.this.b;
                view.getViewTreeObserver().removeOnDrawListener(this.b);
                e.this.b.clear();
            }
        }

        public a(View view) {
            this.b = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            com.amazon.aps.iva.hd.l.e().post(new RunnableC0113a(this));
        }
    }

    @Override // com.amazon.aps.iva.ad.f
    public final void a(Activity activity) {
        if (this.c || !this.b.add(activity)) {
            return;
        }
        View decorView = activity.getWindow().getDecorView();
        decorView.getViewTreeObserver().addOnDrawListener(new a(decorView));
    }
}
