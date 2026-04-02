package com.amazon.aps.iva.v1;

import android.view.ActionMode;
import android.view.View;
import com.amazon.aps.iva.l0.c0;
/* compiled from: AndroidTextToolbar.android.kt */
/* loaded from: classes.dex */
public final class r0 implements k2 {
    public final View a;
    public ActionMode b;
    public final com.amazon.aps.iva.x1.c c;
    public m2 d;

    /* compiled from: AndroidTextToolbar.android.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            r0.this.b = null;
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public r0(View view) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        this.a = view;
        this.c = new com.amazon.aps.iva.x1.c(new a());
        this.d = m2.Hidden;
    }

    @Override // com.amazon.aps.iva.v1.k2
    public final void a(com.amazon.aps.iva.e1.e eVar, c0.c cVar, c0.e eVar2, c0.d dVar, c0.f fVar) {
        com.amazon.aps.iva.x1.c cVar2 = this.c;
        cVar2.getClass();
        cVar2.b = eVar;
        cVar2.c = cVar;
        cVar2.e = dVar;
        cVar2.d = eVar2;
        cVar2.f = fVar;
        ActionMode actionMode = this.b;
        if (actionMode == null) {
            this.d = m2.Shown;
            this.b = l2.a.b(this.a, new com.amazon.aps.iva.x1.a(cVar2), 1);
            return;
        }
        actionMode.invalidate();
    }

    @Override // com.amazon.aps.iva.v1.k2
    public final m2 getStatus() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.v1.k2
    public final void hide() {
        this.d = m2.Hidden;
        ActionMode actionMode = this.b;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.b = null;
    }
}
