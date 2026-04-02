package com.amazon.aps.iva.f0;

import android.view.Choreographer;
import android.view.View;
import com.amazon.aps.iva.f0.c0;
import com.amazon.aps.iva.o0.v2;
import com.amazon.aps.iva.s1.e1;
/* compiled from: LazyLayoutPrefetcher.android.kt */
/* loaded from: classes.dex */
public final class d0 implements v2, c0.b, Runnable, Choreographer.FrameCallback {
    public static long l;
    public final c0 b;
    public final e1 c;
    public final m d;
    public final View e;
    public final com.amazon.aps.iva.p0.f<a> f;
    public long g;
    public long h;
    public boolean i;
    public final Choreographer j;
    public boolean k;

    /* compiled from: LazyLayoutPrefetcher.android.kt */
    /* loaded from: classes.dex */
    public static final class a implements c0.a {
        public final int a;
        public final long b;
        public e1.a c;
        public boolean d;

        public a(int i, long j) {
            this.a = i;
            this.b = j;
        }

        @Override // com.amazon.aps.iva.f0.c0.a
        public final void cancel() {
            if (!this.d) {
                this.d = true;
                e1.a aVar = this.c;
                if (aVar != null) {
                    aVar.dispose();
                }
                this.c = null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004c, code lost:
        if (r3 >= 30.0f) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d0(com.amazon.aps.iva.f0.c0 r3, com.amazon.aps.iva.s1.e1 r4, com.amazon.aps.iva.f0.m r5, android.view.View r6) {
        /*
            r2 = this;
            java.lang.String r0 = "prefetchState"
            com.amazon.aps.iva.yb0.j.f(r3, r0)
            java.lang.String r0 = "subcomposeLayoutState"
            com.amazon.aps.iva.yb0.j.f(r4, r0)
            java.lang.String r0 = "itemContentFactory"
            com.amazon.aps.iva.yb0.j.f(r5, r0)
            java.lang.String r0 = "view"
            com.amazon.aps.iva.yb0.j.f(r6, r0)
            r2.<init>()
            r2.b = r3
            r2.c = r4
            r2.d = r5
            r2.e = r6
            com.amazon.aps.iva.p0.f r3 = new com.amazon.aps.iva.p0.f
            r4 = 16
            com.amazon.aps.iva.f0.d0$a[] r4 = new com.amazon.aps.iva.f0.d0.a[r4]
            r3.<init>(r4)
            r2.f = r3
            android.view.Choreographer r3 = android.view.Choreographer.getInstance()
            r2.j = r3
            long r3 = com.amazon.aps.iva.f0.d0.l
            r0 = 0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto L59
            android.view.Display r3 = r6.getDisplay()
            boolean r4 = r6.isInEditMode()
            if (r4 != 0) goto L4f
            if (r3 == 0) goto L4f
            float r3 = r3.getRefreshRate()
            r4 = 1106247680(0x41f00000, float:30.0)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 < 0) goto L4f
            goto L51
        L4f:
            r3 = 1114636288(0x42700000, float:60.0)
        L51:
            r4 = 1000000000(0x3b9aca00, float:0.0047237873)
            float r4 = (float) r4
            float r4 = r4 / r3
            long r3 = (long) r4
            com.amazon.aps.iva.f0.d0.l = r3
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.f0.d0.<init>(com.amazon.aps.iva.f0.c0, com.amazon.aps.iva.s1.e1, com.amazon.aps.iva.f0.m, android.view.View):void");
    }

    @Override // com.amazon.aps.iva.f0.c0.b
    public final a a(int i, long j) {
        a aVar = new a(i, j);
        this.f.b(aVar);
        if (!this.i) {
            this.i = true;
            this.e.post(this);
        }
        return aVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.k) {
            this.e.post(this);
        }
    }

    @Override // com.amazon.aps.iva.o0.v2
    public final void onForgotten() {
        this.k = false;
        this.b.a = null;
        this.e.removeCallbacks(this);
        this.j.removeFrameCallback(this);
    }

    @Override // com.amazon.aps.iva.o0.v2
    public final void onRemembered() {
        this.b.a = this;
        this.k = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007a A[Catch: all -> 0x00af, TryCatch #1 {all -> 0x00af, blocks: (B:27:0x0064, B:29:0x006e, B:35:0x007a, B:39:0x00a3, B:41:0x00a7, B:38:0x009b), top: B:79:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ce A[Catch: all -> 0x0111, TryCatch #0 {all -> 0x0111, blocks: (B:47:0x00b9, B:49:0x00c3, B:55:0x00ce, B:57:0x00da, B:58:0x00e7, B:62:0x00fd, B:61:0x00f5, B:63:0x0104), top: B:77:0x00b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0104 A[Catch: all -> 0x0111, TRY_LEAVE, TryCatch #0 {all -> 0x0111, blocks: (B:47:0x00b9, B:49:0x00c3, B:55:0x00ce, B:57:0x00da, B:58:0x00e7, B:62:0x00fd, B:61:0x00f5, B:63:0x0104), top: B:77:0x00b9 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.f0.d0.run():void");
    }

    @Override // com.amazon.aps.iva.o0.v2
    public final void onAbandoned() {
    }
}
