package com.facebook.ads.internal.view.e.c;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.q.a.v;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public class o extends RelativeLayout implements com.facebook.ads.internal.view.e.a.b {
    private static final int a = (int) (6.0f * v.b);
    private ObjectAnimator b;
    private AtomicInteger c;
    private ProgressBar d;
    private com.facebook.ads.internal.view.e.b e;
    private com.facebook.ads.internal.j.f f;
    private com.facebook.ads.internal.j.f g;
    private com.facebook.ads.internal.j.f h;
    private com.facebook.ads.internal.j.f i;

    public o(Context context) {
        this(context, a, -12549889);
    }

    public o(Context context, int i, int i2) {
        super(context);
        this.f = new com.facebook.ads.internal.view.e.b.o() { // from class: com.facebook.ads.internal.view.e.c.o.1
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.n nVar) {
                if (o.this.e != null) {
                    o.this.a(o.this.e.getDuration(), o.this.e.getCurrentPosition());
                }
            }
        };
        this.g = new com.facebook.ads.internal.view.e.b.i() { // from class: com.facebook.ads.internal.view.e.c.o.2
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.h hVar) {
                o.this.b();
            }
        };
        this.h = new com.facebook.ads.internal.view.e.b.k() { // from class: com.facebook.ads.internal.view.e.c.o.3
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.j jVar) {
                if (o.this.e != null) {
                    o.this.a(o.this.e.getDuration(), o.this.e.getCurrentPosition());
                }
            }
        };
        this.i = new com.facebook.ads.internal.view.e.b.c() { // from class: com.facebook.ads.internal.view.e.c.o.4
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.b bVar) {
                if (o.this.e != null) {
                    o.this.c();
                }
            }
        };
        this.c = new AtomicInteger(-1);
        this.d = new ProgressBar(context, null, 16842872);
        this.d.setLayoutParams(new RelativeLayout.LayoutParams(-1, i));
        setProgressBarColor(i2);
        this.d.setMax(10000);
        addView(this.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2) {
        b();
        if (this.c.get() >= i2 || i <= i2) {
            return;
        }
        this.b = ObjectAnimator.ofInt(this.d, "progress", (i2 * 10000) / i, (Math.min(i2 + 250, i) * 10000) / i);
        this.b.setDuration(Math.min(250, i - i2));
        this.b.setInterpolator(new LinearInterpolator());
        this.b.start();
        this.c.set(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.b != null) {
            this.b.cancel();
            this.b.setTarget(null);
            this.b = null;
            this.d.clearAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        b();
        this.b = ObjectAnimator.ofInt(this.d, "progress", 0, 0);
        this.b.setDuration(0L);
        this.b.setInterpolator(new LinearInterpolator());
        this.b.start();
        this.c.set(0);
    }

    public void a() {
        b();
        this.d = null;
        this.e = null;
    }

    @Override // com.facebook.ads.internal.view.e.a.b
    public void a(com.facebook.ads.internal.view.e.b bVar) {
        this.e = bVar;
        bVar.getEventBus().a(this.g, this.h, this.f, this.i);
    }

    @Override // com.facebook.ads.internal.view.e.a.b
    public void b(com.facebook.ads.internal.view.e.b bVar) {
        bVar.getEventBus().b(this.f, this.h, this.g, this.i);
        this.e = null;
    }

    public void setProgressBarColor(int i) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new ColorDrawable(0), new ColorDrawable(0), new ScaleDrawable(new ColorDrawable(i), 8388611, 1.0f, -1.0f)});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908303);
        layerDrawable.setId(2, 16908301);
        this.d.setProgressDrawable(layerDrawable);
    }
}
