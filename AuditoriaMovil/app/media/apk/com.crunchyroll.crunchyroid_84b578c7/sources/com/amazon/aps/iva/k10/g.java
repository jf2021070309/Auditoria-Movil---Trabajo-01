package com.amazon.aps.iva.k10;

import android.os.Bundle;
import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.js.d0;
import com.amazon.aps.iva.kb0.q;
import com.ellation.crunchyroll.presentation.forgotpassword.ForgotPasswordActivity;
/* compiled from: ForgotPasswordPresenter.kt */
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.wy.b<j> implements c {
    public final k b;
    public final h c;
    public final com.amazon.aps.iva.y30.a d;
    public final com.amazon.aps.iva.en.b e;
    public boolean f;

    /* compiled from: ForgotPasswordPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ez.g<? extends q>>, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ez.g<? extends q>> dVar) {
            com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ez.g<? extends q>> dVar2 = dVar;
            g gVar = g.this;
            ((com.amazon.aps.iva.ez.g) dVar2.b).c(new d(gVar));
            ((com.amazon.aps.iva.ez.g) dVar2.b).e(new e(gVar));
            com.amazon.aps.iva.ez.g<? extends q> a = dVar2.a();
            if (a != null) {
                a.b(new f(gVar));
            }
            return q.a;
        }
    }

    /* compiled from: ForgotPasswordPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public b(a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof w) || !(obj instanceof com.amazon.aps.iva.yb0.f)) {
                return false;
            }
            return com.amazon.aps.iva.yb0.j.a(this.a, ((com.amazon.aps.iva.yb0.f) obj).getFunctionDelegate());
        }

        @Override // com.amazon.aps.iva.yb0.f
        public final com.amazon.aps.iva.kb0.a<?> getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // com.amazon.aps.iva.i5.w
        public final /* synthetic */ void onChanged(Object obj) {
            this.a.invoke(obj);
        }
    }

    public g(ForgotPasswordActivity forgotPasswordActivity, l lVar, i iVar, com.amazon.aps.iva.y30.b bVar, com.amazon.aps.iva.en.b bVar2) {
        super(forgotPasswordActivity, new com.amazon.aps.iva.wy.j[0]);
        this.b = lVar;
        this.c = iVar;
        this.d = bVar;
        this.e = bVar2;
    }

    @Override // com.amazon.aps.iva.k10.c
    public final void U4(String str, boolean z) {
        if (z) {
            this.e.a(d0.c.a);
        } else {
            this.d.a();
        }
        if (str != null) {
            getView().E1(str);
            getView().H1();
        }
        this.f = z;
        if (z) {
            getView().ce();
        } else {
            getView().Y6();
        }
    }

    @Override // com.amazon.aps.iva.k10.c
    public final void a() {
        getView().d();
    }

    @Override // com.amazon.aps.iva.k10.c
    public final void c1(com.amazon.aps.iva.fs.b bVar) {
        this.b.T1(getView().t1(), bVar);
    }

    @Override // com.amazon.aps.iva.k10.c
    public final void onCreate(Bundle bundle) {
        if (bundle != null) {
            this.f = bundle.getBoolean("password_reset_required", false);
            String string = bundle.getString("email_edit_text", "");
            com.amazon.aps.iva.yb0.j.e(string, "bundle.getString(EMAIL_EDIT_TEXT, \"\")");
            getView().E1(string);
            if (bundle.getBoolean("focus_on_email_edit_text")) {
                getView().H1();
            }
            if (this.f) {
                getView().ce();
            } else {
                getView().Y6();
            }
        }
        this.b.j5().e(getView(), new b(new a()));
    }

    @Override // com.amazon.aps.iva.k10.c
    public final void onSaveInstanceState(Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(bundle, "outState");
        bundle.putString("email_edit_text", getView().t1());
        bundle.putBoolean("focus_on_email_edit_text", getView().If());
        bundle.putBoolean("password_reset_required", this.f);
    }
}
