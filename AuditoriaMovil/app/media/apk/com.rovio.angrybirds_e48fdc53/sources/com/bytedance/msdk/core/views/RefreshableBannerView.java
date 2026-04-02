package com.bytedance.msdk.core.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.msdk.adapter.util.Logger;
/* loaded from: classes.dex */
public class RefreshableBannerView extends FrameLayout {
    private boolean a;
    private boolean b;
    private boolean c;
    private final Rect d;
    private final ViewTreeObserver.OnScrollChangedListener e;
    private c f;

    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnScrollChangedListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            RefreshableBannerView refreshableBannerView = RefreshableBannerView.this;
            refreshableBannerView.b = refreshableBannerView.getGlobalVisibleRect(refreshableBannerView.d);
            RefreshableBannerView refreshableBannerView2 = RefreshableBannerView.this;
            refreshableBannerView2.a(refreshableBannerView2.b);
        }
    }

    /* loaded from: classes.dex */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (RefreshableBannerView.this.getChildCount() > 1) {
                RefreshableBannerView.this.removeViewAt(0);
                Logger.d("TMe", "--==-- after remove, view count: " + RefreshableBannerView.this.getChildCount());
            }
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(boolean z);
    }

    public RefreshableBannerView(Context context) {
        super(context);
        this.a = true;
        this.b = true;
        this.c = true;
        this.d = new Rect();
        this.e = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        boolean z2 = this.a && this.b;
        if (z) {
            if (!z2 || this.c) {
                return;
            }
            this.c = true;
            c cVar = this.f;
            if (cVar != null) {
                cVar.a(true);
            }
        } else if (z2 || !this.c) {
        } else {
            this.c = false;
            c cVar2 = this.f;
            if (cVar2 != null) {
                cVar2.a(false);
            }
        }
    }

    public void a(View view) {
        view.setTranslationX(getWidth());
        addView(view);
        ObjectAnimator.ofFloat(view, "translationX", 0.0f).setDuration(250L).start();
        if (getChildCount() > 1) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(getChildAt(0), "translationX", -getWidth()).setDuration(250L);
            duration.addListener(new b());
            duration.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.e);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.e);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        boolean z = i == 0;
        this.a = z;
        a(z);
    }

    public void setVisibilityChangeListener(c cVar) {
        this.f = cVar;
    }
}
