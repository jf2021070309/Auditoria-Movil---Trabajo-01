package com.amazon.aps.iva.jm;

import com.crunchyroll.profiles.presentation.avatar.AvatarSelectionActivity;
import java.io.File;
import java.net.URL;
import java.util.List;
/* compiled from: AvatarSelectionPresenter.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.wy.b<o> implements h {
    public final p b;

    /* compiled from: AvatarSelectionPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<String, com.amazon.aps.iva.kb0.q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(String str) {
            boolean z;
            String str2 = str;
            if (str2 != null && str2.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            i iVar = i.this;
            if (z) {
                i.q6(iVar).I9();
            } else {
                i.q6(iVar).Rc(str2);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AvatarSelectionPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<String, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(String str) {
            i.q6(i.this).S(str);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AvatarSelectionPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<String, com.amazon.aps.iva.kb0.q> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(String str) {
            String str2 = str;
            i iVar = i.this;
            i.q6(iVar).S(str2);
            if (!com.amazon.aps.iva.yb0.j.a(str2, iVar.b.v().d())) {
                iVar.getView().U6();
            } else {
                iVar.getView().uf();
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AvatarSelectionPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.jm.d>>, com.amazon.aps.iva.kb0.q> {
        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.jm.d>> gVar) {
            com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.jm.d>> gVar2 = gVar;
            i iVar = i.this;
            gVar2.c(new j(iVar));
            gVar2.e(new k(iVar));
            gVar2.b(new l(iVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AvatarSelectionPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.kb0.q>, com.amazon.aps.iva.kb0.q> {
        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.kb0.q> gVar) {
            com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.kb0.q> gVar2 = gVar;
            i iVar = i.this;
            gVar2.c(new m(iVar));
            gVar2.e(new n(iVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AvatarSelectionPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.kb0.q, com.amazon.aps.iva.kb0.q> {
        public f() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.kb0.q qVar) {
            com.amazon.aps.iva.yb0.j.f(qVar, "$this$observeEvent");
            i iVar = i.this;
            i.q6(iVar).b();
            i.q6(iVar).showSnackbar(com.amazon.aps.iva.bt.c.b);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AvatarSelectionPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class g implements com.amazon.aps.iva.i5.w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public g(com.amazon.aps.iva.xb0.l lVar) {
            this.a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof com.amazon.aps.iva.i5.w) || !(obj instanceof com.amazon.aps.iva.yb0.f)) {
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

    public i(AvatarSelectionActivity avatarSelectionActivity, q qVar) {
        super(avatarSelectionActivity, new com.amazon.aps.iva.wy.j[0]);
        this.b = qVar;
    }

    public static final /* synthetic */ o q6(i iVar) {
        return iVar.getView();
    }

    @Override // com.amazon.aps.iva.jm.h
    public final void H0() {
        this.b.w3();
    }

    @Override // com.amazon.aps.iva.jm.u
    public final void K(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "selectedAvatarUrl");
        this.b.K(str);
    }

    @Override // com.amazon.aps.iva.jm.h
    public final void S1() {
        p pVar = this.b;
        T d2 = pVar.u1().d();
        com.amazon.aps.iva.yb0.j.c(d2);
        String name = new File(new URL((String) d2).getFile()).getName();
        com.amazon.aps.iva.yb0.j.e(name, "File(URL(avatarSelection…arUrl.value!!).file).name");
        pVar.G0(name);
    }

    @Override // com.amazon.aps.iva.jm.h
    public final void c() {
        getView().closeScreen();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        p pVar = this.b;
        pVar.c0().e(getView(), new g(new a()));
        pVar.v().e(getView(), new g(new b()));
        pVar.u1().e(getView(), new g(new c()));
        pVar.F2().e(getView(), new g(new d()));
        pVar.L7().e(getView(), new g(new e()));
        com.amazon.aps.iva.ez.e.a(pVar.J8(), getView(), new f());
    }
}
