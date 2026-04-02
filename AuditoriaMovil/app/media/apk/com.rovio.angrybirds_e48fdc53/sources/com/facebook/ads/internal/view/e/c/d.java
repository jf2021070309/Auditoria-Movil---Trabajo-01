package com.facebook.ads.internal.view.e.c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.view.View;
import com.facebook.ads.internal.view.e.b.t;
import com.facebook.ads.internal.view.e.b.u;
/* loaded from: classes2.dex */
public class d implements com.facebook.ads.internal.view.e.a.b {
    private final com.facebook.ads.internal.view.e.b.i a;
    private final com.facebook.ads.internal.view.e.b.k b;
    private final com.facebook.ads.internal.view.e.b.c c;
    private final u d;
    private final Handler e;
    private final boolean f;
    private View g;
    private a h;
    private com.facebook.ads.internal.view.e.b i;
    private boolean j;

    /* renamed from: com.facebook.ads.internal.view.e.c.d$4  reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass4 extends u {
        AnonymousClass4() {
        }

        @Override // com.facebook.ads.internal.j.f
        public void a(t tVar) {
            if (d.this.i != null && tVar.b().getAction() == 0) {
                d.this.e.removeCallbacksAndMessages(null);
                d.this.a(new AnimatorListenerAdapter() { // from class: com.facebook.ads.internal.view.e.c.d.4.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        d.this.e.postDelayed(new Runnable() { // from class: com.facebook.ads.internal.view.e.c.d.4.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (d.this.j) {
                                    d.this.c();
                                }
                            }
                        }, 2000L);
                    }
                });
            }
        }
    }

    /* loaded from: classes2.dex */
    public enum a {
        VISIBLE,
        INVSIBLE,
        FADE_OUT_ON_PLAY
    }

    public d(View view, a aVar) {
        this(view, aVar, false);
    }

    public d(View view, a aVar, boolean z) {
        this.a = new com.facebook.ads.internal.view.e.b.i() { // from class: com.facebook.ads.internal.view.e.c.d.1
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.h hVar) {
                d.this.a(1, 0);
            }
        };
        this.b = new com.facebook.ads.internal.view.e.b.k() { // from class: com.facebook.ads.internal.view.e.c.d.2
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.j jVar) {
                if (d.this.j) {
                    if (d.this.h != a.FADE_OUT_ON_PLAY && !d.this.f) {
                        d.this.a(0, 8);
                        return;
                    }
                    d.this.h = null;
                    d.this.c();
                }
            }
        };
        this.c = new com.facebook.ads.internal.view.e.b.c() { // from class: com.facebook.ads.internal.view.e.c.d.3
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.b bVar) {
                if (d.this.h != a.INVSIBLE) {
                    d.this.g.setAlpha(1.0f);
                    d.this.g.setVisibility(0);
                }
            }
        };
        this.d = new AnonymousClass4();
        this.j = true;
        this.e = new Handler();
        this.f = z;
        a(view, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2) {
        this.e.removeCallbacksAndMessages(null);
        this.g.clearAnimation();
        this.g.setAlpha(i);
        this.g.setVisibility(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AnimatorListenerAdapter animatorListenerAdapter) {
        this.g.setVisibility(0);
        this.g.animate().alpha(1.0f).setDuration(500L).setListener(animatorListenerAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.g.animate().alpha(0.0f).setDuration(500L).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.internal.view.e.c.d.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                d.this.g.setVisibility(8);
            }
        });
    }

    public void a(View view, a aVar) {
        this.h = aVar;
        this.g = view;
        this.g.clearAnimation();
        if (aVar == a.INVSIBLE) {
            this.g.setAlpha(0.0f);
            this.g.setVisibility(8);
            return;
        }
        this.g.setAlpha(1.0f);
        this.g.setVisibility(0);
    }

    @Override // com.facebook.ads.internal.view.e.a.b
    public void a(com.facebook.ads.internal.view.e.b bVar) {
        this.i = bVar;
        bVar.getEventBus().a(this.a, this.b, this.d, this.c);
    }

    public boolean a() {
        return this.j;
    }

    public void b() {
        this.j = false;
        a((AnimatorListenerAdapter) null);
    }

    @Override // com.facebook.ads.internal.view.e.a.b
    public void b(com.facebook.ads.internal.view.e.b bVar) {
        a(1, 0);
        bVar.getEventBus().b(this.c, this.d, this.b, this.a);
        this.i = null;
    }
}
