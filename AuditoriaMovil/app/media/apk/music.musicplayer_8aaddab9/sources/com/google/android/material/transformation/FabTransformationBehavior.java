package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.i.k.d0;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import e.d.b.d.b0.c;
import e.d.b.d.b0.e;
import e.d.b.d.c.g;
import e.d.b.d.c.h;
import e.d.b.d.c.i;
import e.d.b.d.l.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import music.musicplayer.R;
@Deprecated
/* loaded from: classes2.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    public final Rect f4710c;

    /* renamed from: d  reason: collision with root package name */
    public final RectF f4711d;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f4712e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f4713f;

    /* renamed from: g  reason: collision with root package name */
    public float f4714g;

    /* renamed from: h  reason: collision with root package name */
    public float f4715h;

    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f4716b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f4717c;

        public a(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
            this.a = z;
            this.f4716b = view;
            this.f4717c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.a) {
                return;
            }
            this.f4716b.setVisibility(4);
            this.f4717c.setAlpha(1.0f);
            this.f4717c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.a) {
                this.f4716b.setVisibility(0);
                this.f4717c.setAlpha(0.0f);
                this.f4717c.setVisibility(4);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b {
        public g a;

        /* renamed from: b  reason: collision with root package name */
        public i f4718b;
    }

    public FabTransformationBehavior() {
        this.f4710c = new Rect();
        this.f4711d = new RectF();
        this.f4712e = new RectF();
        this.f4713f = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4710c = new Rect();
        this.f4711d = new RectF();
        this.f4712e = new RectF();
        this.f4713f = new int[2];
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public AnimatorSet D(View view, View view2, boolean z, boolean z2) {
        h hVar;
        Animator u;
        ArrayList arrayList;
        d dVar;
        ArrayList arrayList2;
        ObjectAnimator ofInt;
        b O = O(view2.getContext(), z);
        if (z) {
            this.f4714g = view.getTranslationX();
            this.f4715h = view.getTranslationY();
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            L(view, view2, z, z2, O, arrayList3);
        }
        RectF rectF = this.f4711d;
        N(view, view2, z, z2, O, arrayList3, rectF);
        float width = rectF.width();
        float height = rectF.height();
        float F = F(view, view2, O.f4718b);
        float G = G(view, view2, O.f4718b);
        Pair<h, h> E = E(F, G, z, O);
        h hVar2 = (h) E.first;
        h hVar3 = (h) E.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            F = this.f4714g;
        }
        fArr[0] = F;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            G = this.f4715h;
        }
        fArr2[0] = G;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        hVar2.a(ofFloat);
        hVar3.a(ofFloat2);
        arrayList3.add(ofFloat);
        arrayList3.add(ofFloat2);
        boolean z3 = view2 instanceof d;
        if (z3 && (view instanceof ImageView)) {
            d dVar2 = (d) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    ofInt = ObjectAnimator.ofInt(drawable, e.d.b.d.c.d.a, 0);
                } else {
                    ofInt = ObjectAnimator.ofInt(drawable, e.d.b.d.c.d.a, 255);
                }
                ofInt.addUpdateListener(new e.d.b.d.b0.a(this, view2));
                O.a.d("iconFade").a(ofInt);
                arrayList3.add(ofInt);
                arrayList4.add(new e.d.b.d.b0.b(this, dVar2, drawable));
            }
        }
        if (z3) {
            d dVar3 = (d) view2;
            i iVar = O.f4718b;
            RectF rectF2 = this.f4711d;
            RectF rectF3 = this.f4712e;
            I(view, rectF2);
            rectF2.offset(this.f4714g, this.f4715h);
            I(view2, rectF3);
            rectF3.offset(-F(view, view2, iVar), 0.0f);
            float centerX = rectF2.centerX() - rectF3.left;
            i iVar2 = O.f4718b;
            RectF rectF4 = this.f4711d;
            RectF rectF5 = this.f4712e;
            I(view, rectF4);
            rectF4.offset(this.f4714g, this.f4715h);
            I(view2, rectF5);
            rectF5.offset(0.0f, -G(view, view2, iVar2));
            float centerY = rectF4.centerY() - rectF5.top;
            ((FloatingActionButton) view).g(this.f4710c);
            float width2 = this.f4710c.width() / 2.0f;
            h d2 = O.a.d("expansion");
            if (z) {
                if (!z2) {
                    dVar3.setRevealInfo(new d.e(centerX, centerY, width2));
                }
                if (z2) {
                    width2 = dVar3.getRevealInfo().f6402c;
                }
                float w = e.d.b.d.a.w(centerX, centerY, 0.0f, 0.0f);
                float w2 = e.d.b.d.a.w(centerX, centerY, width, 0.0f);
                float w3 = e.d.b.d.a.w(centerX, centerY, width, height);
                float w4 = e.d.b.d.a.w(centerX, centerY, 0.0f, height);
                if (w <= w2 || w <= w3 || w <= w4) {
                    w = (w2 <= w3 || w2 <= w4) ? w3 > w4 ? w3 : w4 : w2;
                }
                Animator u2 = e.d.b.d.a.u(dVar3, centerX, centerY, w);
                u2.addListener(new c(this, dVar3));
                u = u2;
                hVar = d2;
                M(view2, d2.a, (int) centerX, (int) centerY, width2, arrayList3);
                arrayList = arrayList4;
                dVar = dVar3;
            } else {
                hVar = d2;
                float f2 = dVar3.getRevealInfo().f6402c;
                u = e.d.b.d.a.u(dVar3, centerX, centerY, width2);
                int i2 = (int) centerX;
                int i3 = (int) centerY;
                M(view2, hVar.a, i2, i3, f2, arrayList3);
                long j2 = hVar.a;
                long j3 = hVar.f6335b;
                g gVar = O.a;
                int i4 = gVar.a.f1665g;
                long j4 = 0;
                int i5 = 0;
                while (i5 < i4) {
                    int i6 = i4;
                    h l2 = gVar.a.l(i5);
                    j4 = Math.max(j4, l2.a + l2.f6335b);
                    i5++;
                    i4 = i6;
                    arrayList4 = arrayList4;
                    dVar3 = dVar3;
                    gVar = gVar;
                }
                arrayList = arrayList4;
                dVar = dVar3;
                if (Build.VERSION.SDK_INT >= 21) {
                    long j5 = j2 + j3;
                    if (j5 < j4) {
                        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view2, i2, i3, width2, width2);
                        createCircularReveal.setStartDelay(j5);
                        createCircularReveal.setDuration(j4 - j5);
                        arrayList3.add(createCircularReveal);
                    }
                }
            }
            Animator animator = u;
            hVar.a(animator);
            arrayList3.add(animator);
            arrayList2 = arrayList;
            arrayList2.add(new e.d.b.d.l.a(dVar));
        } else {
            arrayList2 = arrayList4;
        }
        K(view, view2, z, z2, O, arrayList3);
        J(view2, z, z2, O, arrayList3);
        AnimatorSet animatorSet = new AnimatorSet();
        e.d.b.d.a.V(animatorSet, arrayList3);
        animatorSet.addListener(new a(this, z, view2, view));
        int size = arrayList2.size();
        for (int i7 = 0; i7 < size; i7++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i7));
        }
        return animatorSet;
    }

    public final Pair<h, h> E(float f2, float f3, boolean z, b bVar) {
        h d2;
        h d3;
        if (f2 == 0.0f || f3 == 0.0f) {
            d2 = bVar.a.d("translationXLinear");
            d3 = bVar.a.d("translationYLinear");
        } else if ((!z || f3 >= 0.0f) && (z || f3 <= 0.0f)) {
            d2 = bVar.a.d("translationXCurveDownwards");
            d3 = bVar.a.d("translationYCurveDownwards");
        } else {
            d2 = bVar.a.d("translationXCurveUpwards");
            d3 = bVar.a.d("translationYCurveUpwards");
        }
        return new Pair<>(d2, d3);
    }

    public final float F(View view, View view2, i iVar) {
        RectF rectF = this.f4711d;
        RectF rectF2 = this.f4712e;
        I(view, rectF);
        rectF.offset(this.f4714g, this.f4715h);
        I(view2, rectF2);
        Objects.requireNonNull(iVar);
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float G(View view, View view2, i iVar) {
        RectF rectF = this.f4711d;
        RectF rectF2 = this.f4712e;
        I(view, rectF);
        rectF.offset(this.f4714g, this.f4715h);
        I(view2, rectF2);
        Objects.requireNonNull(iVar);
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final float H(b bVar, h hVar, float f2, float f3) {
        long j2 = hVar.a;
        long j3 = hVar.f6335b;
        h d2 = bVar.a.d("expansion");
        return e.d.b.d.c.a.a(f2, f3, hVar.b().getInterpolation(((float) (((d2.a + d2.f6335b) + 17) - j2)) / ((float) j3)));
    }

    public final void I(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f4713f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public final void J(View view, boolean z, boolean z2, b bVar, List list) {
        ObjectAnimator ofFloat;
        if (view instanceof ViewGroup) {
            if ((view instanceof d) && e.d.b.d.l.c.a == 0) {
                return;
            }
            View findViewById = view.findViewById(R.id.mtrl_child_content_container);
            ViewGroup P = findViewById != null ? P(findViewById) : ((view instanceof e) || (view instanceof e.d.b.d.b0.d)) ? P(((ViewGroup) view).getChildAt(0)) : P(view);
            if (P == null) {
                return;
            }
            if (z) {
                if (!z2) {
                    e.d.b.d.c.c.a.set(P, Float.valueOf(0.0f));
                }
                ofFloat = ObjectAnimator.ofFloat(P, e.d.b.d.c.c.a, 1.0f);
            } else {
                ofFloat = ObjectAnimator.ofFloat(P, e.d.b.d.c.c.a, 0.0f);
            }
            bVar.a.d("contentFade").a(ofFloat);
            list.add(ofFloat);
        }
    }

    public final void K(View view, View view2, boolean z, boolean z2, b bVar, List list) {
        ObjectAnimator ofInt;
        if (view2 instanceof d) {
            d dVar = (d) view2;
            ColorStateList k2 = d0.k(view);
            int colorForState = k2 != null ? k2.getColorForState(view.getDrawableState(), k2.getDefaultColor()) : 0;
            int i2 = 16777215 & colorForState;
            if (z) {
                if (!z2) {
                    dVar.setCircularRevealScrimColor(colorForState);
                }
                ofInt = ObjectAnimator.ofInt(dVar, d.C0140d.a, i2);
            } else {
                ofInt = ObjectAnimator.ofInt(dVar, d.C0140d.a, colorForState);
            }
            ofInt.setEvaluator(e.d.b.d.c.b.a);
            bVar.a.d("color").a(ofInt);
            list.add(ofInt);
        }
    }

    @TargetApi(CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
    public final void L(View view, View view2, boolean z, boolean z2, b bVar, List list) {
        ObjectAnimator ofFloat;
        float l2 = d0.l(view2) - d0.l(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-l2);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, -l2);
        }
        bVar.a.d("elevation").a(ofFloat);
        list.add(ofFloat);
    }

    public final void M(View view, long j2, int i2, int i3, float f2, List<Animator> list) {
        if (Build.VERSION.SDK_INT < 21 || j2 <= 0) {
            return;
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i2, i3, f2, f2);
        createCircularReveal.setStartDelay(0L);
        createCircularReveal.setDuration(j2);
        list.add(createCircularReveal);
    }

    public final void N(View view, View view2, boolean z, boolean z2, b bVar, List list, RectF rectF) {
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        float F = F(view, view2, bVar.f4718b);
        float G = G(view, view2, bVar.f4718b);
        Pair<h, h> E = E(F, G, z, bVar);
        h hVar = (h) E.first;
        h hVar2 = (h) E.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-F);
                view2.setTranslationY(-G);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, 0.0f);
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, 0.0f);
            float H = H(bVar, hVar, -F, 0.0f);
            float H2 = H(bVar, hVar2, -G, 0.0f);
            Rect rect = this.f4710c;
            view2.getWindowVisibleDisplayFrame(rect);
            RectF rectF2 = this.f4711d;
            rectF2.set(rect);
            RectF rectF3 = this.f4712e;
            I(view2, rectF3);
            rectF3.offset(H, H2);
            rectF3.intersect(rectF2);
            rectF.set(rectF3);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, -F);
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, -G);
        }
        hVar.a(ofFloat);
        hVar2.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    public abstract b O(Context context, boolean z);

    public final ViewGroup P(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            if (view2 instanceof FloatingActionButton) {
                int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
                return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
            }
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void f(CoordinatorLayout.f fVar) {
        if (fVar.f334h == 0) {
            fVar.f334h = 80;
        }
    }
}
