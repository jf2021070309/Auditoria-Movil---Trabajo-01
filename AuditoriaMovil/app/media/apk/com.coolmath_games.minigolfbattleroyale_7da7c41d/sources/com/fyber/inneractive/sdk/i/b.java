package com.fyber.inneractive.sdk.i;

import android.graphics.Rect;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.util.j;
import com.fyber.inneractive.sdk.util.m;
/* loaded from: classes.dex */
public final class b {
    final com.fyber.inneractive.sdk.j.e b;
    private final FrameLayout i;
    private final a j;
    float c = 0.0f;
    int d = 1;
    float e = 0.0f;
    long f = 0;
    boolean g = false;
    boolean h = false;
    private final Runnable k = new Runnable() { // from class: com.fyber.inneractive.sdk.i.b.1
        @Override // java.lang.Runnable
        public final void run() {
            b.this.d();
        }
    };
    j<Rect> a = new j<>(4, new j.a<Rect>() { // from class: com.fyber.inneractive.sdk.i.b.2
        @Override // com.fyber.inneractive.sdk.util.j.a
        public final /* synthetic */ Rect a() {
            return new Rect();
        }
    });

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    public b(com.fyber.inneractive.sdk.j.e eVar, FrameLayout frameLayout, a aVar) {
        this.b = eVar;
        this.i = frameLayout;
        this.j = aVar;
    }

    public final void a() {
        this.g = false;
        m.a().removeCallbacks(this.k);
    }

    public final void b() {
        if (this.g) {
            a();
        }
    }

    public final void c() {
        if (this.h || this.g || this.f == 0) {
            return;
        }
        this.f = 0L;
        this.g = true;
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r10 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "IAVisibilityTracker: onCheckVisibility"
            com.fyber.inneractive.sdk.util.IAlog.b(r2, r1)
            int r1 = r10.d
            float r1 = (float) r1
            r2 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r2
            com.fyber.inneractive.sdk.util.j<android.graphics.Rect> r2 = r10.a
            java.lang.Object r2 = r2.a()
            android.graphics.Rect r2 = (android.graphics.Rect) r2
            android.widget.FrameLayout r3 = r10.i
            android.view.ViewParent r4 = r3.getParent()
            if (r4 == 0) goto L46
            boolean r4 = r3.isShown()
            if (r4 == 0) goto L46
            boolean r4 = r3.hasWindowFocus()
            if (r4 == 0) goto L46
            boolean r4 = r3.getGlobalVisibleRect(r2)
            if (r4 == 0) goto L46
            int r4 = r2.height()
            int r5 = r2.width()
            int r4 = r4 * r5
            float r4 = (float) r4
            int r5 = r3.getHeight()
            int r3 = r3.getWidth()
            int r5 = r5 * r3
            float r3 = (float) r5
            float r4 = r4 / r3
            goto L47
        L46:
            r4 = 0
        L47:
            com.fyber.inneractive.sdk.util.j<android.graphics.Rect> r3 = r10.a
            r3.a(r2)
            r10.c = r4
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            r3 = 0
            r5 = 1
            if (r2 < 0) goto L6c
            float r2 = r10.e
            r6 = 1148846080(0x447a0000, float:1000.0)
            float r2 = r2 * r6
            long r6 = java.lang.System.currentTimeMillis()
            long r8 = r10.f
            long r6 = r6 - r8
            float r6 = (float) r6
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 >= 0) goto L6c
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 == 0) goto L6c
            r2 = r5
            goto L6d
        L6c:
            r2 = r0
        L6d:
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            r6[r0] = r7
            java.lang.Float r7 = java.lang.Float.valueOf(r1)
            r6[r5] = r7
            java.lang.String r7 = "BannerVisibilityTracker | visible = %s, minVis = %f"
            com.fyber.inneractive.sdk.util.IAlog.b(r7, r6)
            if (r2 == 0) goto L9e
            boolean r2 = r10.g
            if (r2 == 0) goto L9e
            com.fyber.inneractive.sdk.i.b$a r1 = r10.j
            if (r1 == 0) goto Lcf
            boolean r1 = r10.h
            if (r1 != 0) goto Lcf
            r10.h = r5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "BannerVisibilityTracker | firing viewable"
            com.fyber.inneractive.sdk.util.IAlog.b(r1, r0)
            com.fyber.inneractive.sdk.i.b$a r0 = r10.j
            r0.a()
            return
        L9e:
            boolean r0 = r10.g
            if (r0 == 0) goto Lcf
            float r0 = r10.c
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 >= 0) goto Lab
            r10.f = r3
            goto Lbb
        Lab:
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto Lbb
            long r0 = r10.f
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto Lbb
            long r0 = java.lang.System.currentTimeMillis()
            r10.f = r0
        Lbb:
            android.os.Handler r0 = com.fyber.inneractive.sdk.util.m.a()
            java.lang.Runnable r1 = r10.k
            r0.removeCallbacks(r1)
            android.os.Handler r0 = com.fyber.inneractive.sdk.util.m.a()
            java.lang.Runnable r1 = r10.k
            r2 = 50
            r0.postDelayed(r1, r2)
        Lcf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.i.b.d():void");
    }
}
