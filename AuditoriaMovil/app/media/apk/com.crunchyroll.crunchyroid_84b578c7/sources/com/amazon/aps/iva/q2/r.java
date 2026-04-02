package com.amazon.aps.iva.q2;

import android.graphics.Outline;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
/* compiled from: AndroidDialog.android.kt */
/* loaded from: classes.dex */
public final class r extends com.amazon.aps.iva.e.j {
    public com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> b;
    public q c;
    public final View d;
    public final p e;
    public final int f;

    /* compiled from: AndroidDialog.android.kt */
    /* loaded from: classes.dex */
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            com.amazon.aps.iva.yb0.j.f(view, "view");
            com.amazon.aps.iva.yb0.j.f(outline, "result");
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    /* compiled from: AndroidDialog.android.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e.m, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.e.m mVar) {
            com.amazon.aps.iva.yb0.j.f(mVar, "$this$addCallback");
            r rVar = r.this;
            if (rVar.c.a) {
                rVar.b.invoke();
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AndroidDialog.android.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.amazon.aps.iva.o2.l.values().length];
            try {
                iArr[com.amazon.aps.iva.o2.l.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.amazon.aps.iva.o2.l.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> r7, com.amazon.aps.iva.q2.q r8, android.view.View r9, com.amazon.aps.iva.o2.l r10, com.amazon.aps.iva.o2.c r11, java.util.UUID r12) {
        /*
            r6 = this;
            java.lang.String r0 = "onDismissRequest"
            com.amazon.aps.iva.yb0.j.f(r7, r0)
            java.lang.String r0 = "properties"
            com.amazon.aps.iva.yb0.j.f(r8, r0)
            java.lang.String r0 = "composeView"
            com.amazon.aps.iva.yb0.j.f(r9, r0)
            java.lang.String r0 = "layoutDirection"
            com.amazon.aps.iva.yb0.j.f(r10, r0)
            java.lang.String r0 = "density"
            com.amazon.aps.iva.yb0.j.f(r11, r0)
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r9.getContext()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r2 >= r3) goto L2e
            boolean r2 = r8.e
            if (r2 == 0) goto L2a
            goto L2e
        L2a:
            r2 = 2132083268(0x7f150244, float:1.9806674E38)
            goto L31
        L2e:
            r2 = 2132083227(0x7f15021b, float:1.980659E38)
        L31:
            r0.<init>(r1, r2)
            r1 = 0
            r2 = 2
            r3 = 0
            r6.<init>(r0, r1, r2, r3)
            r6.b = r7
            r6.c = r8
            r6.d = r9
            r7 = 8
            float r7 = (float) r7
            android.view.Window r8 = r6.getWindow()
            if (r8 == 0) goto Le0
            android.view.WindowManager$LayoutParams r0 = r8.getAttributes()
            int r0 = r0.softInputMode
            r0 = r0 & 240(0xf0, float:3.36E-43)
            r6.f = r0
            r0 = 1
            r8.requestFeature(r0)
            r2 = 17170445(0x106000d, float:2.461195E-38)
            r8.setBackgroundDrawableResource(r2)
            com.amazon.aps.iva.q2.q r2 = r6.c
            boolean r2 = r2.e
            com.amazon.aps.iva.p3.u0.a(r8, r2)
            com.amazon.aps.iva.q2.p r2 = new com.amazon.aps.iva.q2.p
            android.content.Context r4 = r6.getContext()
            java.lang.String r5 = "context"
            com.amazon.aps.iva.yb0.j.e(r4, r5)
            r2.<init>(r4, r8)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Dialog:"
            r4.<init>(r5)
            r4.append(r12)
            java.lang.String r12 = r4.toString()
            r4 = 2131427934(0x7f0b025e, float:1.8477498E38)
            r2.setTag(r4, r12)
            r2.setClipChildren(r1)
            float r7 = r11.P0(r7)
            r2.setElevation(r7)
            com.amazon.aps.iva.q2.r$a r7 = new com.amazon.aps.iva.q2.r$a
            r7.<init>()
            r2.setOutlineProvider(r7)
            r6.e = r2
            android.view.View r7 = r8.getDecorView()
            boolean r8 = r7 instanceof android.view.ViewGroup
            if (r8 == 0) goto La5
            r3 = r7
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
        La5:
            if (r3 == 0) goto Laa
            b1(r3)
        Laa:
            r6.setContentView(r2)
            com.amazon.aps.iva.i5.o r7 = com.amazon.aps.iva.i5.i0.a(r9)
            com.amazon.aps.iva.i5.i0.b(r2, r7)
            com.amazon.aps.iva.i5.h0 r7 = com.amazon.aps.iva.i5.j0.a(r9)
            com.amazon.aps.iva.i5.j0.b(r2, r7)
            com.amazon.aps.iva.s8.c r7 = com.amazon.aps.iva.s8.d.a(r9)
            com.amazon.aps.iva.s8.d.b(r2, r7)
            com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> r7 = r6.b
            com.amazon.aps.iva.q2.q r8 = r6.c
            r6.U2(r7, r8, r10)
            androidx.activity.OnBackPressedDispatcher r7 = r6.getOnBackPressedDispatcher()
            com.amazon.aps.iva.q2.r$b r8 = new com.amazon.aps.iva.q2.r$b
            r8.<init>()
            java.lang.String r9 = "<this>"
            com.amazon.aps.iva.yb0.j.f(r7, r9)
            com.amazon.aps.iva.e.u r9 = new com.amazon.aps.iva.e.u
            r9.<init>(r8, r0)
            r7.a(r6, r9)
            return
        Le0:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Dialog has no window"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.q2.r.<init>(com.amazon.aps.iva.xb0.a, com.amazon.aps.iva.q2.q, android.view.View, com.amazon.aps.iva.o2.l, com.amazon.aps.iva.o2.c, java.util.UUID):void");
    }

    public static final void b1(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof p) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) childAt;
            } else {
                viewGroup2 = null;
            }
            if (viewGroup2 != null) {
                b1(viewGroup2);
            }
        }
    }

    public final void U2(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, q qVar, com.amazon.aps.iva.o2.l lVar) {
        int i;
        Window window;
        com.amazon.aps.iva.yb0.j.f(aVar, "onDismissRequest");
        com.amazon.aps.iva.yb0.j.f(qVar, "properties");
        com.amazon.aps.iva.yb0.j.f(lVar, "layoutDirection");
        this.b = aVar;
        this.c = qVar;
        boolean a2 = b0.a(qVar.c, g.b(this.d));
        Window window2 = getWindow();
        com.amazon.aps.iva.yb0.j.c(window2);
        if (a2) {
            i = 8192;
        } else {
            i = -8193;
        }
        window2.setFlags(i, 8192);
        int i2 = c.a[lVar.ordinal()];
        int i3 = 1;
        if (i2 != 1) {
            if (i2 != 2) {
                throw new com.amazon.aps.iva.kb0.h();
            }
        } else {
            i3 = 0;
        }
        p pVar = this.e;
        pVar.setLayoutDirection(i3);
        boolean z = qVar.d;
        if (z && !pVar.l && (window = getWindow()) != null) {
            window.setLayout(-2, -2);
        }
        pVar.l = z;
        if (Build.VERSION.SDK_INT < 31) {
            if (qVar.e) {
                Window window3 = getWindow();
                if (window3 != null) {
                    window3.setSoftInputMode(this.f);
                    return;
                }
                return;
            }
            Window window4 = getWindow();
            if (window4 != null) {
                window4.setSoftInputMode(16);
            }
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        com.amazon.aps.iva.yb0.j.f(motionEvent, "event");
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent && this.c.b) {
            this.b.invoke();
        }
        return onTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
