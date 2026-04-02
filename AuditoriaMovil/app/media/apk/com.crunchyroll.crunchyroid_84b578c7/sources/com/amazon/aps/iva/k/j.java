package com.amazon.aps.iva.k;

import com.amazon.aps.iva.a9.k0;
/* compiled from: AppCompatDelegateImpl.java */
/* loaded from: classes.dex */
public final class j implements Runnable {
    public final /* synthetic */ g b;

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class a extends k0 {
        public a() {
        }

        @Override // com.amazon.aps.iva.a9.k0, com.amazon.aps.iva.p3.s0
        public final void c() {
            j.this.b.w.setVisibility(0);
        }

        @Override // com.amazon.aps.iva.p3.s0
        public final void onAnimationEnd() {
            j jVar = j.this;
            jVar.b.w.setAlpha(1.0f);
            g gVar = jVar.b;
            gVar.z.d(null);
            gVar.z = null;
        }
    }

    public j(g gVar) {
        this.b = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r5 = this;
            com.amazon.aps.iva.k.g r0 = r5.b
            android.widget.PopupWindow r1 = r0.x
            androidx.appcompat.widget.ActionBarContextView r2 = r0.w
            r3 = 55
            r4 = 0
            r1.showAtLocation(r2, r3, r4, r4)
            com.amazon.aps.iva.p3.r0 r1 = r0.z
            if (r1 == 0) goto L13
            r1.b()
        L13:
            boolean r1 = r0.B
            if (r1 == 0) goto L25
            android.view.ViewGroup r1 = r0.C
            if (r1 == 0) goto L25
            java.util.WeakHashMap<android.view.View, com.amazon.aps.iva.p3.r0> r2 = com.amazon.aps.iva.p3.g0.a
            boolean r1 = com.amazon.aps.iva.p3.g0.g.c(r1)
            if (r1 == 0) goto L25
            r1 = 1
            goto L26
        L25:
            r1 = r4
        L26:
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L44
            androidx.appcompat.widget.ActionBarContextView r1 = r0.w
            r3 = 0
            r1.setAlpha(r3)
            androidx.appcompat.widget.ActionBarContextView r1 = r0.w
            com.amazon.aps.iva.p3.r0 r1 = com.amazon.aps.iva.p3.g0.a(r1)
            r1.a(r2)
            r0.z = r1
            com.amazon.aps.iva.k.j$a r0 = new com.amazon.aps.iva.k.j$a
            r0.<init>()
            r1.d(r0)
            goto L4e
        L44:
            androidx.appcompat.widget.ActionBarContextView r1 = r0.w
            r1.setAlpha(r2)
            androidx.appcompat.widget.ActionBarContextView r0 = r0.w
            r0.setVisibility(r4)
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.k.j.run():void");
    }
}
