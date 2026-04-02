package com.google.android.material.appbar;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import c.i.k.d0;
import c.i.k.k0.b;
import c.i.k.o;
import e.d.b.d.d.d;
import e.d.b.d.d.e;
import e.d.b.d.d.f;
import e.d.b.d.w.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public int f4510b;

    /* renamed from: c  reason: collision with root package name */
    public int f4511c;

    /* renamed from: d  reason: collision with root package name */
    public int f4512d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4513e;

    /* renamed from: f  reason: collision with root package name */
    public int f4514f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4515g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4516h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4517i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4518j;

    /* renamed from: k  reason: collision with root package name */
    public int f4519k;

    /* renamed from: l  reason: collision with root package name */
    public WeakReference<View> f4520l;

    /* renamed from: m  reason: collision with root package name */
    public ValueAnimator f4521m;

    /* renamed from: n  reason: collision with root package name */
    public int[] f4522n;
    public Drawable o;

    /* loaded from: classes2.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends e<T> {

        /* renamed from: j  reason: collision with root package name */
        public int f4523j;

        /* renamed from: k  reason: collision with root package name */
        public int f4524k;

        /* renamed from: l  reason: collision with root package name */
        public ValueAnimator f4525l;

        /* renamed from: m  reason: collision with root package name */
        public SavedState f4526m;

        /* renamed from: n  reason: collision with root package name */
        public WeakReference<View> f4527n;

        /* loaded from: classes2.dex */
        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();

            /* renamed from: c  reason: collision with root package name */
            public boolean f4528c;

            /* renamed from: d  reason: collision with root package name */
            public int f4529d;

            /* renamed from: e  reason: collision with root package name */
            public float f4530e;

            /* renamed from: f  reason: collision with root package name */
            public boolean f4531f;

            /* loaded from: classes2.dex */
            public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
                @Override // android.os.Parcelable.Creator
                public Object createFromParcel(Parcel parcel) {
                    return new SavedState(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                public Object[] newArray(int i2) {
                    return new SavedState[i2];
                }
            }

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f4528c = parcel.readByte() != 0;
                this.f4529d = parcel.readInt();
                this.f4530e = parcel.readFloat();
                this.f4531f = parcel.readByte() != 0;
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i2) {
                parcel.writeParcelable(this.f369b, i2);
                parcel.writeByte(this.f4528c ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f4529d);
                parcel.writeFloat(this.f4530e);
                parcel.writeByte(this.f4531f ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static boolean J(int i2, int i3) {
            return (i2 & i3) == i3;
        }

        @Override // e.d.b.d.d.e
        public int E() {
            return B() + this.f4523j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // e.d.b.d.d.e
        public int H(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
            int i5;
            ArrayList<View> orDefault;
            int i6;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int E = E();
            int i7 = 0;
            if (i3 == 0 || E < i3 || E > i4) {
                this.f4523j = 0;
            } else {
                int k2 = c.i.a.k(i2, i3, i4);
                if (E != k2) {
                    if (appBarLayout.f4513e) {
                        int abs = Math.abs(k2);
                        int childCount = appBarLayout.getChildCount();
                        int i8 = 0;
                        while (true) {
                            if (i8 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i8);
                            c cVar = (c) childAt.getLayoutParams();
                            Interpolator interpolator = cVar.f4534c;
                            if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                                i8++;
                            } else if (interpolator != null) {
                                int i9 = cVar.a;
                                if ((i9 & 1) != 0) {
                                    i6 = childAt.getHeight() + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + 0;
                                    if ((i9 & 2) != 0) {
                                        AtomicInteger atomicInteger = d0.a;
                                        i6 -= d0.c.d(childAt);
                                    }
                                } else {
                                    i6 = 0;
                                }
                                AtomicInteger atomicInteger2 = d0.a;
                                if (d0.c.b(childAt)) {
                                    i6 -= appBarLayout.getTopInset();
                                }
                                if (i6 > 0) {
                                    float f2 = i6;
                                    i5 = (childAt.getTop() + Math.round(interpolator.getInterpolation((abs - childAt.getTop()) / f2) * f2)) * Integer.signum(k2);
                                }
                            }
                        }
                    }
                    i5 = k2;
                    boolean D = D(i5);
                    int i10 = E - k2;
                    this.f4523j = k2 - i5;
                    if (D) {
                        for (int i11 = 0; i11 < appBarLayout.getChildCount(); i11++) {
                            c cVar2 = (c) appBarLayout.getChildAt(i11).getLayoutParams();
                            a aVar = cVar2.f4533b;
                            if (aVar != null && (cVar2.a & 1) != 0) {
                                View childAt2 = appBarLayout.getChildAt(i11);
                                b bVar = (b) aVar;
                                Rect rect = bVar.a;
                                childAt2.getDrawingRect(rect);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                rect.offset(0, -appBarLayout.getTopInset());
                                float abs2 = bVar.a.top - Math.abs(B());
                                if (abs2 <= 0.0f) {
                                    float abs3 = Math.abs(abs2 / bVar.a.height());
                                    float f3 = 1.0f - (abs3 >= 0.0f ? abs3 > 1.0f ? 1.0f : abs3 : 0.0f);
                                    float height = (-abs2) - ((bVar.a.height() * 0.3f) * (1.0f - (f3 * f3)));
                                    childAt2.setTranslationY(height);
                                    childAt2.getDrawingRect(bVar.f4532b);
                                    bVar.f4532b.offset(0, (int) (-height));
                                    Rect rect2 = bVar.f4532b;
                                    AtomicInteger atomicInteger3 = d0.a;
                                    d0.e.c(childAt2, rect2);
                                } else {
                                    AtomicInteger atomicInteger4 = d0.a;
                                    d0.e.c(childAt2, null);
                                    childAt2.setTranslationY(0.0f);
                                }
                            }
                        }
                    }
                    if (!D && appBarLayout.f4513e && (orDefault = coordinatorLayout.f319g.f1923b.getOrDefault(appBarLayout, null)) != null && !orDefault.isEmpty()) {
                        while (i7 < orDefault.size()) {
                            View view2 = orDefault.get(i7);
                            CoordinatorLayout.c cVar3 = ((CoordinatorLayout.f) view2.getLayoutParams()).a;
                            if (cVar3 != null) {
                                cVar3.g(coordinatorLayout, view2, appBarLayout);
                            }
                            i7++;
                        }
                    }
                    appBarLayout.a = B();
                    if (!appBarLayout.willNotDraw()) {
                        AtomicInteger atomicInteger5 = d0.a;
                        d0.c.k(appBarLayout);
                    }
                    Q(coordinatorLayout, appBarLayout, k2, k2 < E ? -1 : 1, false);
                    i7 = i10;
                }
            }
            P(coordinatorLayout, appBarLayout);
            return i7;
        }

        public final void I(CoordinatorLayout coordinatorLayout, T t, int i2, float f2) {
            int abs = Math.abs(E() - i2);
            float abs2 = Math.abs(f2);
            int round = abs2 > 0.0f ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / t.getHeight()) + 1.0f) * 150.0f);
            int E = E();
            if (E == i2) {
                ValueAnimator valueAnimator = this.f4525l;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f4525l.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f4525l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f4525l = valueAnimator3;
                valueAnimator3.setInterpolator(e.d.b.d.c.a.f6330e);
                this.f4525l.addUpdateListener(new e.d.b.d.d.b(this, coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f4525l.setDuration(Math.min(round, 600));
            this.f4525l.setIntValues(E, i2);
            this.f4525l.start();
        }

        public final View K(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if ((childAt instanceof o) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public void L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2, int[] iArr) {
            int i3;
            int i4;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i5 = -appBarLayout.getTotalScrollRange();
                    i3 = i5;
                    i4 = appBarLayout.getDownNestedPreScrollRange() + i5;
                } else {
                    i3 = -appBarLayout.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                if (i3 != i4) {
                    iArr[1] = F(coordinatorLayout, appBarLayout, i2, i3, i4);
                }
            }
            if (appBarLayout.f4518j) {
                appBarLayout.c(appBarLayout.d(view));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void M(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i2, int[] iArr) {
            if (i2 < 0) {
                iArr[1] = F(coordinatorLayout, appBarLayout, i2, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i2 == 0) {
                P(coordinatorLayout, appBarLayout);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
            if (((r4.getTotalScrollRange() != 0) && r3.getHeight() - r5.getHeight() <= r4.getHeight()) != false) goto L15;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean N(androidx.coordinatorlayout.widget.CoordinatorLayout r3, com.google.android.material.appbar.AppBarLayout r4, android.view.View r5, int r6, int r7) {
            /*
                r2 = this;
                r6 = r6 & 2
                r0 = 1
                r1 = 0
                if (r6 == 0) goto L2a
                boolean r6 = r4.f4518j
                if (r6 != 0) goto L2b
                int r6 = r4.getTotalScrollRange()
                if (r6 == 0) goto L12
                r6 = 1
                goto L13
            L12:
                r6 = 0
            L13:
                if (r6 == 0) goto L26
                int r3 = r3.getHeight()
                int r5 = r5.getHeight()
                int r3 = r3 - r5
                int r4 = r4.getHeight()
                if (r3 > r4) goto L26
                r3 = 1
                goto L27
            L26:
                r3 = 0
            L27:
                if (r3 == 0) goto L2a
                goto L2b
            L2a:
                r0 = 0
            L2b:
                if (r0 == 0) goto L34
                android.animation.ValueAnimator r3 = r2.f4525l
                if (r3 == 0) goto L34
                r3.cancel()
            L34:
                r3 = 0
                r2.f4527n = r3
                r2.f4524k = r7
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.N(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, int, int):boolean");
        }

        public final void O(CoordinatorLayout coordinatorLayout, T t) {
            int E = E();
            int childCount = t.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    i2 = -1;
                    break;
                }
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                c cVar = (c) childAt.getLayoutParams();
                if (J(cVar.a, 32)) {
                    top -= ((LinearLayout.LayoutParams) cVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) cVar).bottomMargin;
                }
                int i3 = -E;
                if (top <= i3 && bottom >= i3) {
                    break;
                }
                i2++;
            }
            if (i2 >= 0) {
                View childAt2 = t.getChildAt(i2);
                c cVar2 = (c) childAt2.getLayoutParams();
                int i4 = cVar2.a;
                if ((i4 & 17) == 17) {
                    int i5 = -childAt2.getTop();
                    int i6 = -childAt2.getBottom();
                    if (i2 == t.getChildCount() - 1) {
                        i6 += t.getPaddingTop() + t.getTopInset();
                    }
                    if (J(i4, 2)) {
                        AtomicInteger atomicInteger = d0.a;
                        i6 += d0.c.d(childAt2);
                    } else if (J(i4, 5)) {
                        AtomicInteger atomicInteger2 = d0.a;
                        int d2 = d0.c.d(childAt2) + i6;
                        if (E < d2) {
                            i5 = d2;
                        } else {
                            i6 = d2;
                        }
                    }
                    if (J(i4, 32)) {
                        i5 += ((LinearLayout.LayoutParams) cVar2).topMargin;
                        i6 -= ((LinearLayout.LayoutParams) cVar2).bottomMargin;
                    }
                    if (E < (i6 + i5) / 2) {
                        i5 = i6;
                    }
                    I(coordinatorLayout, t, c.i.a.k(i5, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        public final void P(CoordinatorLayout coordinatorLayout, T t) {
            b.a aVar = b.a.f2196b;
            d0.v(coordinatorLayout, aVar.a());
            b.a aVar2 = b.a.f2197c;
            d0.v(coordinatorLayout, aVar2.a());
            View K = K(coordinatorLayout);
            if (K == null || t.getTotalScrollRange() == 0 || !(((CoordinatorLayout.f) K.getLayoutParams()).a instanceof ScrollingViewBehavior)) {
                return;
            }
            if (E() != (-t.getTotalScrollRange()) && K.canScrollVertically(1)) {
                d0.x(coordinatorLayout, aVar, null, new d(this, t, false));
            }
            if (E() != 0) {
                if (!K.canScrollVertically(-1)) {
                    d0.x(coordinatorLayout, aVar2, null, new d(this, t, true));
                    return;
                }
                int i2 = -t.getDownNestedPreScrollRange();
                if (i2 != 0) {
                    d0.x(coordinatorLayout, aVar2, null, new e.d.b.d.d.c(this, coordinatorLayout, t, K, i2));
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void Q(androidx.coordinatorlayout.widget.CoordinatorLayout r7, T r8, int r9, int r10, boolean r11) {
            /*
                r6 = this;
                int r0 = java.lang.Math.abs(r9)
                int r1 = r8.getChildCount()
                r2 = 0
                r3 = 0
            La:
                if (r3 >= r1) goto L20
                android.view.View r4 = r8.getChildAt(r3)
                int r5 = r4.getTop()
                if (r0 < r5) goto L1d
                int r5 = r4.getBottom()
                if (r0 > r5) goto L1d
                goto L21
            L1d:
                int r3 = r3 + 1
                goto La
            L20:
                r4 = 0
            L21:
                r0 = 1
                if (r4 == 0) goto L5d
                android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$c r1 = (com.google.android.material.appbar.AppBarLayout.c) r1
                int r1 = r1.a
                r3 = r1 & 1
                if (r3 == 0) goto L5d
                java.util.concurrent.atomic.AtomicInteger r3 = c.i.k.d0.a
                int r3 = c.i.k.d0.c.d(r4)
                if (r10 <= 0) goto L4a
                r10 = r1 & 12
                if (r10 == 0) goto L4a
                int r9 = -r9
                int r10 = r4.getBottom()
                int r10 = r10 - r3
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L5d
                goto L5b
            L4a:
                r10 = r1 & 2
                if (r10 == 0) goto L5d
                int r9 = -r9
                int r10 = r4.getBottom()
                int r10 = r10 - r3
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L5d
            L5b:
                r9 = 1
                goto L5e
            L5d:
                r9 = 0
            L5e:
                boolean r10 = r8.f4518j
                if (r10 == 0) goto L6a
                android.view.View r9 = r6.K(r7)
                boolean r9 = r8.d(r9)
            L6a:
                boolean r9 = r8.c(r9)
                if (r11 != 0) goto L9c
                if (r9 == 0) goto L9f
                java.util.List r7 = r7.f(r8)
                int r9 = r7.size()
                r10 = 0
            L7b:
                if (r10 >= r9) goto L9a
                java.lang.Object r11 = r7.get(r10)
                android.view.View r11 = (android.view.View) r11
                android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r11 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r11
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r11 = r11.a
                boolean r1 = r11 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r1 == 0) goto L97
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r11 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r11
                int r7 = r11.f6359f
                if (r7 == 0) goto L9a
                r2 = 1
                goto L9a
            L97:
                int r10 = r10 + 1
                goto L7b
            L9a:
                if (r2 == 0) goto L9f
            L9c:
                r8.jumpDrawablesToCurrentState()
            L9f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.Q(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // e.d.b.d.d.g, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean k(CoordinatorLayout coordinatorLayout, View view, int i2) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.k(coordinatorLayout, appBarLayout, i2);
            int pendingAction = appBarLayout.getPendingAction();
            SavedState savedState = this.f4526m;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i3 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z) {
                            I(coordinatorLayout, appBarLayout, i3, 0.0f);
                        } else {
                            G(coordinatorLayout, appBarLayout, i3);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            I(coordinatorLayout, appBarLayout, 0, 0.0f);
                        } else {
                            G(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (savedState.f4528c) {
                G(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else {
                View childAt = appBarLayout.getChildAt(savedState.f4529d);
                int i4 = -childAt.getBottom();
                G(coordinatorLayout, appBarLayout, this.f4526m.f4531f ? appBarLayout.getTopInset() + d0.c.d(childAt) + i4 : Math.round(childAt.getHeight() * this.f4526m.f4530e) + i4);
            }
            appBarLayout.f4514f = 0;
            this.f4526m = null;
            D(c.i.a.k(B(), -appBarLayout.getTotalScrollRange(), 0));
            Q(coordinatorLayout, appBarLayout, B(), 0, true);
            appBarLayout.a = B();
            if (!appBarLayout.willNotDraw()) {
                AtomicInteger atomicInteger = d0.a;
                d0.c.k(appBarLayout);
            }
            P(coordinatorLayout, appBarLayout);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean l(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int i5) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) appBarLayout.getLayoutParams())).height == -2) {
                coordinatorLayout.s(appBarLayout, i2, i3, View.MeasureSpec.makeMeasureSpec(0, 0), i5);
                return true;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int[] iArr, int i4) {
            L(coordinatorLayout, (AppBarLayout) view, view2, i3, iArr);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void r(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
            M(coordinatorLayout, (AppBarLayout) view, i5, iArr);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void u(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof SavedState) {
                this.f4526m = (SavedState) parcelable;
            } else {
                this.f4526m = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public Parcelable v(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            android.view.AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            int B = B();
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                int bottom = childAt.getBottom() + B;
                if (childAt.getTop() + B <= 0 && bottom >= 0) {
                    SavedState savedState = new SavedState(absSavedState);
                    savedState.f4528c = (-B()) >= appBarLayout.getTotalScrollRange();
                    savedState.f4529d = i2;
                    AtomicInteger atomicInteger = d0.a;
                    savedState.f4531f = bottom == appBarLayout.getTopInset() + d0.c.d(childAt);
                    savedState.f4530e = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return absSavedState;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean x(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i2, int i3) {
            return N(coordinatorLayout, (AppBarLayout) view, view2, i2, i3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void z(CoordinatorLayout coordinatorLayout, View view, View view2, int i2) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f4524k == 0 || i2 == 1) {
                O(coordinatorLayout, appBarLayout);
                if (appBarLayout.f4518j) {
                    appBarLayout.c(appBarLayout.d(view2));
                }
            }
            this.f4527n = new WeakReference<>(view2);
        }
    }

    /* loaded from: classes2.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes2.dex */
    public static class ScrollingViewBehavior extends f {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.d.b.d.b.w);
            this.f6359f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        public AppBarLayout F(List<View> list) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = list.get(i2);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean g(CoordinatorLayout coordinatorLayout, View view, View view2) {
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) view2.getLayoutParams()).a;
            if (cVar instanceof BaseBehavior) {
                d0.s(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) cVar).f4523j) + this.f6358e) - E(view2));
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.f4518j) {
                    appBarLayout.c(appBarLayout.d(view));
                    return false;
                }
                return false;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                d0.v(coordinatorLayout, b.a.f2196b.a());
                d0.v(coordinatorLayout, b.a.f2197c.a());
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean t(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout F = F(coordinatorLayout.d(view));
            if (F != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f6356c;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    F.b(false, !z);
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class a {
    }

    /* loaded from: classes2.dex */
    public static class b extends a {
        public final Rect a = new Rect();

        /* renamed from: b  reason: collision with root package name */
        public final Rect f4532b = new Rect();
    }

    /* loaded from: classes2.dex */
    public static class c extends LinearLayout.LayoutParams {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public a f4533b;

        /* renamed from: c  reason: collision with root package name */
        public Interpolator f4534c;

        public c(int i2, int i3) {
            super(i2, i3);
            this.a = 1;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.d.b.d.b.a);
            this.a = obtainStyledAttributes.getInt(1, 0);
            this.f4533b = obtainStyledAttributes.getInt(0, 0) != 1 ? null : new b();
            if (obtainStyledAttributes.hasValue(2)) {
                this.f4534c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 1;
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.a = 1;
        }

        public c(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 1;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: a */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new c((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public void b(boolean z, boolean z2) {
        this.f4514f = (z ? 1 : 2) | (z2 ? 4 : 0) | 8;
        requestLayout();
    }

    public boolean c(boolean z) {
        if (!(!this.f4515g) || this.f4517i == z) {
            return false;
        }
        this.f4517i = z;
        refreshDrawableState();
        if (this.f4518j && (getBackground() instanceof g)) {
            g gVar = (g) getBackground();
            float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
            float f2 = z ? 0.0f : dimension;
            if (!z) {
                dimension = 0.0f;
            }
            ValueAnimator valueAnimator = this.f4521m;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, dimension);
            this.f4521m = ofFloat;
            ofFloat.setDuration(getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.f4521m.setInterpolator(e.d.b.d.c.a.a);
            this.f4521m.addUpdateListener(new e.d.b.d.d.a(this, gVar));
            this.f4521m.start();
            return true;
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public boolean d(View view) {
        int i2;
        if (this.f4520l == null && (i2 = this.f4519k) != -1) {
            View findViewById = view != null ? view.findViewById(i2) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.f4519k);
            }
            if (findViewById != null) {
                this.f4520l = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.f4520l;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.o != null && getTopInset() > 0) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.a);
            this.o.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.o;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final boolean e() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8) {
                AtomicInteger atomicInteger = d0.a;
                return !d0.c.b(childAt);
            }
            return false;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new c(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    public int getDownNestedPreScrollRange() {
        int i2;
        int i3 = this.f4511c;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = cVar.a;
            if ((i5 & 5) == 5) {
                int i6 = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
                if ((i5 & 8) != 0) {
                    AtomicInteger atomicInteger = d0.a;
                    i2 = i6 + d0.c.d(childAt);
                } else if ((i5 & 2) != 0) {
                    AtomicInteger atomicInteger2 = d0.a;
                    i2 = i6 + (measuredHeight - d0.c.d(childAt));
                } else {
                    i2 = i6 + measuredHeight;
                }
                if (childCount == 0) {
                    AtomicInteger atomicInteger3 = d0.a;
                    if (d0.c.b(childAt)) {
                        i2 = Math.min(i2, measuredHeight - getTopInset());
                    }
                }
                i4 += i2;
            } else if (i4 > 0) {
                break;
            }
        }
        int max = Math.max(0, i4);
        this.f4511c = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i2 = this.f4512d;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + childAt.getMeasuredHeight();
            int i5 = cVar.a;
            if ((i5 & 1) == 0) {
                break;
            }
            i4 += measuredHeight;
            if ((i5 & 2) != 0) {
                AtomicInteger atomicInteger = d0.a;
                i4 -= d0.c.d(childAt);
                break;
            }
            i3++;
        }
        int max = Math.max(0, i4);
        this.f4512d = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f4519k;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        AtomicInteger atomicInteger = d0.a;
        int d2 = d0.c.d(this);
        if (d2 == 0) {
            int childCount = getChildCount();
            d2 = childCount >= 1 ? d0.c.d(getChildAt(childCount - 1)) : 0;
            if (d2 == 0) {
                return getHeight() / 3;
            }
        }
        return (d2 * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f4514f;
    }

    public Drawable getStatusBarForeground() {
        return this.o;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        return 0;
    }

    public final int getTotalScrollRange() {
        int i2 = this.f4510b;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = cVar.a;
            if ((i5 & 1) == 0) {
                break;
            }
            int i6 = measuredHeight + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + i4;
            if (i3 == 0) {
                AtomicInteger atomicInteger = d0.a;
                if (d0.c.b(childAt)) {
                    i6 -= getTopInset();
                }
            }
            i4 = i6;
            if ((i5 & 2) != 0) {
                AtomicInteger atomicInteger2 = d0.a;
                i4 -= d0.c.d(childAt);
                break;
            }
            i3++;
        }
        int max = Math.max(0, i4);
        this.f4510b = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g) {
            e.d.b.d.a.d0(this, (g) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i2) {
        if (this.f4522n == null) {
            this.f4522n = new int[4];
        }
        int[] iArr = this.f4522n;
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + iArr.length);
        boolean z = this.f4516h;
        iArr[0] = z ? R.attr.state_liftable : -2130969568;
        iArr[1] = (z && this.f4517i) ? R.attr.state_lifted : -2130969569;
        iArr[2] = z ? R.attr.state_collapsible : -2130969566;
        iArr[3] = (z && this.f4517i) ? R.attr.state_collapsed : -2130969565;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.f4520l;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f4520l = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean z2;
        super.onLayout(z, i2, i3, i4, i5);
        AtomicInteger atomicInteger = d0.a;
        boolean z3 = true;
        if (d0.c.b(this) && e()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                d0.s(getChildAt(childCount), topInset);
            }
        }
        this.f4510b = -1;
        this.f4511c = -1;
        this.f4512d = -1;
        this.f4513e = false;
        int childCount2 = getChildCount();
        int i6 = 0;
        while (true) {
            if (i6 >= childCount2) {
                break;
            } else if (((c) getChildAt(i6).getLayoutParams()).f4534c != null) {
                this.f4513e = true;
                break;
            } else {
                i6++;
            }
        }
        Drawable drawable = this.o;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f4515g) {
            return;
        }
        if (!this.f4518j) {
            int childCount3 = getChildCount();
            int i7 = 0;
            while (true) {
                if (i7 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i8 = ((c) getChildAt(i7).getLayoutParams()).a;
                if ((i8 & 1) == 1 && (i8 & 10) != 0) {
                    z2 = true;
                    break;
                }
                i7++;
            }
            if (!z2) {
                z3 = false;
            }
        }
        if (this.f4516h != z3) {
            this.f4516h = z3;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i3);
        if (mode != 1073741824) {
            AtomicInteger atomicInteger = d0.a;
            if (d0.c.b(this) && e()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = c.i.a.k(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i3));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        this.f4510b = -1;
        this.f4511c = -1;
        this.f4512d = -1;
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        e.d.b.d.a.c0(this, f2);
    }

    public void setExpanded(boolean z) {
        AtomicInteger atomicInteger = d0.a;
        b(z, d0.f.c(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.f4518j = z;
    }

    public void setLiftOnScrollTargetViewId(int i2) {
        this.f4519k = i2;
        WeakReference<View> weakReference = this.f4520l;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f4520l = null;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.f4515g = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i2) {
        if (i2 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i2);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.o;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.o = mutate;
            boolean z = false;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.o.setState(getDrawableState());
                }
                Drawable drawable3 = this.o;
                AtomicInteger atomicInteger = d0.a;
                c.i.a.d0(drawable3, d0.d.d(this));
                this.o.setVisible(getVisibility() == 0, false);
                this.o.setCallback(this);
            }
            if (this.o != null && getTopInset() > 0) {
                z = true;
            }
            setWillNotDraw(!z);
            AtomicInteger atomicInteger2 = d0.a;
            d0.c.k(this);
        }
    }

    public void setStatusBarForegroundColor(int i2) {
        setStatusBarForeground(new ColorDrawable(i2));
    }

    public void setStatusBarForegroundResource(int i2) {
        setStatusBarForeground(c.b.d.a.a.b(getContext(), i2));
    }

    @Deprecated
    public void setTargetElevation(float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            int integer = getResources().getInteger(R.integer.app_bar_elevation_anim_duration);
            StateListAnimator stateListAnimator = new StateListAnimator();
            long j2 = integer;
            stateListAnimator.addState(new int[]{16842910, R.attr.state_liftable, -2130969569}, ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(j2));
            stateListAnimator.addState(new int[]{16842910}, ObjectAnimator.ofFloat(this, "elevation", f2).setDuration(j2));
            stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(0L));
            setStateListAnimator(stateListAnimator);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.o;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.o;
    }
}
