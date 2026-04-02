package com.amazon.aps.iva.a9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.amazon.aps.iva.a9.n;
import com.crunchyroll.crunchyroid.R;
import java.util.HashMap;
/* compiled from: Visibility.java */
/* loaded from: classes.dex */
public abstract class l0 extends n {
    public static final int MODE_IN = 1;
    public static final int MODE_OUT = 2;
    private static final String PROPNAME_SCREEN_LOCATION = "android:visibility:screenLocation";
    private int mMode;
    static final String PROPNAME_VISIBILITY = "android:visibility:visibility";
    private static final String PROPNAME_PARENT = "android:visibility:parent";
    private static final String[] sTransitionProperties = {PROPNAME_VISIBILITY, PROPNAME_PARENT};

    /* compiled from: Visibility.java */
    /* loaded from: classes.dex */
    public class a extends o {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ View b;
        public final /* synthetic */ View c;

        public a(ViewGroup viewGroup, View view, View view2) {
            this.a = viewGroup;
            this.b = view;
            this.c = view2;
        }

        @Override // com.amazon.aps.iva.a9.n.g
        public final void onTransitionEnd(n nVar) {
            this.c.setTag(R.id.save_overlay_view, null);
            this.a.getOverlay().remove(this.b);
            nVar.removeListener(this);
        }

        @Override // com.amazon.aps.iva.a9.o, com.amazon.aps.iva.a9.n.g
        public final void onTransitionPause(n nVar) {
            this.a.getOverlay().remove(this.b);
        }

        @Override // com.amazon.aps.iva.a9.o, com.amazon.aps.iva.a9.n.g
        public final void onTransitionResume(n nVar) {
            View view = this.b;
            if (view.getParent() == null) {
                this.a.getOverlay().add(view);
            } else {
                l0.this.cancel();
            }
        }
    }

    /* compiled from: Visibility.java */
    /* loaded from: classes.dex */
    public static class c {
        public boolean a;
        public boolean b;
        public int c;
        public int d;
        public ViewGroup e;
        public ViewGroup f;
    }

    public l0() {
        this.mMode = 3;
    }

    private void captureValues(u uVar) {
        Integer valueOf = Integer.valueOf(uVar.b.getVisibility());
        HashMap hashMap = uVar.a;
        hashMap.put(PROPNAME_VISIBILITY, valueOf);
        hashMap.put(PROPNAME_PARENT, uVar.b.getParent());
        int[] iArr = new int[2];
        uVar.b.getLocationOnScreen(iArr);
        hashMap.put(PROPNAME_SCREEN_LOCATION, iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.amazon.aps.iva.a9.l0.c getVisibilityChangeInfo(com.amazon.aps.iva.a9.u r9, com.amazon.aps.iva.a9.u r10) {
        /*
            r8 = this;
            com.amazon.aps.iva.a9.l0$c r0 = new com.amazon.aps.iva.a9.l0$c
            r0.<init>()
            r1 = 0
            r0.a = r1
            r0.b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r9 == 0) goto L2f
            java.util.HashMap r6 = r9.a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.c = r7
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.e = r6
            goto L33
        L2f:
            r0.c = r4
            r0.e = r3
        L33:
            if (r10 == 0) goto L52
            java.util.HashMap r6 = r10.a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r3 = r6.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.d = r3
            java.lang.Object r2 = r6.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f = r2
            goto L56
        L52:
            r0.d = r4
            r0.f = r3
        L56:
            r2 = 1
            if (r9 == 0) goto L8a
            if (r10 == 0) goto L8a
            int r9 = r0.c
            int r10 = r0.d
            if (r9 != r10) goto L68
            android.view.ViewGroup r3 = r0.e
            android.view.ViewGroup r4 = r0.f
            if (r3 != r4) goto L68
            return r0
        L68:
            if (r9 == r10) goto L78
            if (r9 != 0) goto L71
            r0.b = r1
            r0.a = r2
            goto L9f
        L71:
            if (r10 != 0) goto L9f
            r0.b = r2
            r0.a = r2
            goto L9f
        L78:
            android.view.ViewGroup r9 = r0.f
            if (r9 != 0) goto L81
            r0.b = r1
            r0.a = r2
            goto L9f
        L81:
            android.view.ViewGroup r9 = r0.e
            if (r9 != 0) goto L9f
            r0.b = r2
            r0.a = r2
            goto L9f
        L8a:
            if (r9 != 0) goto L95
            int r9 = r0.d
            if (r9 != 0) goto L95
            r0.b = r2
            r0.a = r2
            goto L9f
        L95:
            if (r10 != 0) goto L9f
            int r9 = r0.c
            if (r9 != 0) goto L9f
            r0.b = r1
            r0.a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.a9.l0.getVisibilityChangeInfo(com.amazon.aps.iva.a9.u, com.amazon.aps.iva.a9.u):com.amazon.aps.iva.a9.l0$c");
    }

    @Override // com.amazon.aps.iva.a9.n
    public void captureEndValues(u uVar) {
        captureValues(uVar);
    }

    @Override // com.amazon.aps.iva.a9.n
    public void captureStartValues(u uVar) {
        captureValues(uVar);
    }

    @Override // com.amazon.aps.iva.a9.n
    public Animator createAnimator(ViewGroup viewGroup, u uVar, u uVar2) {
        c visibilityChangeInfo = getVisibilityChangeInfo(uVar, uVar2);
        if (visibilityChangeInfo.a) {
            if (visibilityChangeInfo.e != null || visibilityChangeInfo.f != null) {
                if (visibilityChangeInfo.b) {
                    return onAppear(viewGroup, uVar, visibilityChangeInfo.c, uVar2, visibilityChangeInfo.d);
                }
                return onDisappear(viewGroup, uVar, visibilityChangeInfo.c, uVar2, visibilityChangeInfo.d);
            }
            return null;
        }
        return null;
    }

    public int getMode() {
        return this.mMode;
    }

    @Override // com.amazon.aps.iva.a9.n
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    @Override // com.amazon.aps.iva.a9.n
    public boolean isTransitionRequired(u uVar, u uVar2) {
        if (uVar == null && uVar2 == null) {
            return false;
        }
        if (uVar != null && uVar2 != null && uVar2.a.containsKey(PROPNAME_VISIBILITY) != uVar.a.containsKey(PROPNAME_VISIBILITY)) {
            return false;
        }
        c visibilityChangeInfo = getVisibilityChangeInfo(uVar, uVar2);
        if (!visibilityChangeInfo.a) {
            return false;
        }
        if (visibilityChangeInfo.c != 0 && visibilityChangeInfo.d != 0) {
            return false;
        }
        return true;
    }

    public boolean isVisible(u uVar) {
        if (uVar == null) {
            return false;
        }
        HashMap hashMap = uVar.a;
        int intValue = ((Integer) hashMap.get(PROPNAME_VISIBILITY)).intValue();
        View view = (View) hashMap.get(PROPNAME_PARENT);
        if (intValue != 0 || view == null) {
            return false;
        }
        return true;
    }

    public Animator onAppear(ViewGroup viewGroup, View view, u uVar, u uVar2) {
        return null;
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, u uVar, u uVar2) {
        return null;
    }

    public void setMode(int i) {
        if ((i & (-4)) == 0) {
            this.mMode = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    public Animator onAppear(ViewGroup viewGroup, u uVar, int i, u uVar2, int i2) {
        if ((this.mMode & 1) != 1 || uVar2 == null) {
            return null;
        }
        if (uVar == null) {
            View view = (View) uVar2.b.getParent();
            if (getVisibilityChangeInfo(getMatchedTransitionValues(view, false), getTransitionValues(view, false)).a) {
                return null;
            }
        }
        return onAppear(viewGroup, uVar2.b, uVar, uVar2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x01b0, code lost:
        if (r0.mCanRemoveViews != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator onDisappear(android.view.ViewGroup r20, com.amazon.aps.iva.a9.u r21, int r22, com.amazon.aps.iva.a9.u r23, int r24) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.a9.l0.onDisappear(android.view.ViewGroup, com.amazon.aps.iva.a9.u, int, com.amazon.aps.iva.a9.u, int):android.animation.Animator");
    }

    @SuppressLint({"RestrictedApi"})
    public l0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMode = 3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.b);
        int e = com.amazon.aps.iva.f3.j.e(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (e != 0) {
            setMode(e);
        }
    }

    /* compiled from: Visibility.java */
    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter implements n.g {
        public final View a;
        public final int b;
        public final ViewGroup c;
        public boolean e;
        public boolean f = false;
        public final boolean d = true;

        public b(View view, int i) {
            this.a = view;
            this.b = i;
            this.c = (ViewGroup) view.getParent();
            a(true);
        }

        public final void a(boolean z) {
            ViewGroup viewGroup;
            if (this.d && this.e != z && (viewGroup = this.c) != null) {
                this.e = z;
                y.a(viewGroup, z);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (!this.f) {
                z.a.l(this.b, this.a);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            a(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            if (!this.f) {
                z.a.l(this.b, this.a);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            if (!this.f) {
                z.a.l(0, this.a);
            }
        }

        @Override // com.amazon.aps.iva.a9.n.g
        public final void onTransitionEnd(n nVar) {
            if (!this.f) {
                z.a.l(this.b, this.a);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            a(false);
            nVar.removeListener(this);
        }

        @Override // com.amazon.aps.iva.a9.n.g
        public final void onTransitionPause(n nVar) {
            a(false);
        }

        @Override // com.amazon.aps.iva.a9.n.g
        public final void onTransitionResume(n nVar) {
            a(true);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }

        @Override // com.amazon.aps.iva.a9.n.g
        public final void onTransitionCancel(n nVar) {
        }

        @Override // com.amazon.aps.iva.a9.n.g
        public final void onTransitionStart(n nVar) {
        }
    }
}
