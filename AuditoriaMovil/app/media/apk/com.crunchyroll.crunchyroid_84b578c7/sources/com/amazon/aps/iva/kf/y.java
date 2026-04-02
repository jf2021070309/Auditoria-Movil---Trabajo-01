package com.amazon.aps.iva.kf;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.kf.c0;
import com.amazon.aps.iva.se0.g0;
import com.ellation.crunchyroll.api.etp.thirtpartyoauth.ConnectedPlatforms;
import com.ellation.crunchyroll.api.etp.thirtpartyoauth.ThirdPartyApp;
import com.ellation.crunchyroll.api.etp.thirtpartyoauth.ThirdPartyAppAuthUrls;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.codec.binary.BaseNCodec;
/* compiled from: ConnectedAppsViewModel.kt */
/* loaded from: classes.dex */
public final class y extends com.amazon.aps.iva.ez.b implements x {
    public final h b;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<List<c0>>> c;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<ThirdPartyAppAuthUrls>>> d;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<c0>>> e;

    /* compiled from: ConnectedAppsViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.connectedapps.ConnectedAppsViewModelImpl$disconnectThirdPartyApp$1", f = "ConnectedAppsViewModel.kt", l = {BaseNCodec.MIME_CHUNK_SIZE}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public com.amazon.aps.iva.i5.v h;
        public com.amazon.aps.iva.i5.v i;
        public int j;
        public final /* synthetic */ c0 l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c0 c0Var, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.l = c0Var;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.l, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<c0>>> vVar;
            IOException e;
            com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<c0>>> vVar2;
            com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<c0>> dVar;
            g.c<List<c0>> a;
            List<c0> list;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.j;
            y yVar = y.this;
            c0 c0Var = this.l;
            if (i != 0) {
                if (i == 1) {
                    vVar2 = this.i;
                    vVar = this.h;
                    try {
                        com.amazon.aps.iva.ab.x.i0(obj);
                    } catch (IOException e2) {
                        e = e2;
                        dVar = new com.amazon.aps.iva.ez.d<>(new g.a(null, e));
                        vVar2 = vVar;
                        vVar2.k(dVar);
                        return com.amazon.aps.iva.kb0.q.a;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<c0>>> vVar3 = yVar.e;
                try {
                    h hVar = yVar.b;
                    ThirdPartyApp thirdPartyApp = c0Var.k;
                    this.h = vVar3;
                    this.i = vVar3;
                    this.j = 1;
                    if (hVar.N1(thirdPartyApp, this) == aVar) {
                        return aVar;
                    }
                    vVar2 = vVar3;
                } catch (IOException e3) {
                    vVar = vVar3;
                    e = e3;
                    dVar = new com.amazon.aps.iva.ez.d<>(new g.a(null, e));
                    vVar2 = vVar;
                    vVar2.k(dVar);
                    return com.amazon.aps.iva.kb0.q.a;
                }
            }
            c0Var.getClass();
            if (c0Var instanceof c0.a) {
                c0.a aVar2 = (c0.a) c0Var;
                c0.a aVar3 = new c0.a(false);
                com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<List<c0>>> vVar4 = yVar.c;
                com.amazon.aps.iva.ez.g<List<c0>> d = vVar4.d();
                if (d != null && (a = d.a()) != null && (list = a.a) != null) {
                    ArrayList Z0 = com.amazon.aps.iva.lb0.x.Z0(list);
                    Z0.set(Z0.indexOf(c0Var), aVar3);
                    vVar4.k(new g.c(Z0, null));
                }
                dVar = new com.amazon.aps.iva.ez.d<>(new g.c(c0Var, null));
                vVar2.k(dVar);
                return com.amazon.aps.iva.kb0.q.a;
            }
            throw new com.amazon.aps.iva.kb0.h();
        }
    }

    /* compiled from: ConnectedAppsViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.connectedapps.ConnectedAppsViewModelImpl$loadAuthUrls$1", f = "ConnectedAppsViewModel.kt", l = {64}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public com.amazon.aps.iva.i5.v h;
        public com.amazon.aps.iva.i5.v i;
        public int j;
        public final /* synthetic */ ThirdPartyApp l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ThirdPartyApp thirdPartyApp, com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
            this.l = thirdPartyApp;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(this.l, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v6 */
        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<ThirdPartyAppAuthUrls>> dVar;
            com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<ThirdPartyAppAuthUrls>>> vVar;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            ?? r1 = this.j;
            try {
                if (r1 != 0) {
                    if (r1 == 1) {
                        vVar = this.i;
                        com.amazon.aps.iva.i5.v vVar2 = this.h;
                        com.amazon.aps.iva.ab.x.i0(obj);
                        r1 = vVar2;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    y yVar = y.this;
                    com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<ThirdPartyAppAuthUrls>>> vVar3 = yVar.d;
                    h hVar = yVar.b;
                    ThirdPartyApp thirdPartyApp = this.l;
                    this.h = vVar3;
                    this.i = vVar3;
                    this.j = 1;
                    obj = hVar.N0(thirdPartyApp, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    vVar = vVar3;
                    r1 = vVar3;
                }
                dVar = new com.amazon.aps.iva.ez.d<>(new g.c((ThirdPartyAppAuthUrls) obj, null));
            } catch (IOException e) {
                dVar = new com.amazon.aps.iva.ez.d<>(new g.a(null, e));
                vVar = r1;
            }
            vVar.k(dVar);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ConnectedAppsViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.connectedapps.ConnectedAppsViewModelImpl$loadThirdPartyApps$1", f = "ConnectedAppsViewModel.kt", l = {46}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public com.amazon.aps.iva.i5.v h;
        public com.amazon.aps.iva.i5.v i;
        public int j;

        public c(com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new c(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((c) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7 */
        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.ez.g<List<c0>> aVar;
            com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<List<c0>>> vVar;
            boolean z;
            com.amazon.aps.iva.pb0.a aVar2 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            ?? r1 = this.j;
            boolean z2 = true;
            try {
                if (r1 != 0) {
                    if (r1 == 1) {
                        vVar = this.i;
                        com.amazon.aps.iva.i5.v vVar2 = this.h;
                        com.amazon.aps.iva.ab.x.i0(obj);
                        r1 = vVar2;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    y yVar = y.this;
                    com.amazon.aps.iva.ez.h.c(yVar.c, null);
                    com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<List<c0>>> vVar3 = yVar.c;
                    h hVar = yVar.b;
                    this.h = vVar3;
                    this.i = vVar3;
                    this.j = 1;
                    obj = hVar.getConnectedPlatforms(this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    vVar = vVar3;
                    r1 = vVar3;
                }
                List<ThirdPartyApp> platforms = ((ConnectedPlatforms) obj).getPlatforms();
                if (!(platforms instanceof Collection) || !platforms.isEmpty()) {
                    for (ThirdPartyApp thirdPartyApp : platforms) {
                        if (com.amazon.aps.iva.yb0.j.a(thirdPartyApp.getPlatform(), ThirdPartyApp.DISCORD)) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (!z) {
                    z2 = false;
                }
                aVar = new g.c<>(f1.J(new c0.a(z2)), null);
            } catch (IOException e) {
                aVar = new g.a<>(null, e);
                vVar = r1;
            }
            vVar.k(aVar);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public y(i iVar) {
        super(iVar);
        this.b = iVar;
        this.c = new com.amazon.aps.iva.i5.v<>();
        this.d = new com.amazon.aps.iva.i5.v<>();
        this.e = new com.amazon.aps.iva.i5.v<>();
        d7();
    }

    @Override // com.amazon.aps.iva.kf.x
    public final com.amazon.aps.iva.i5.v F4() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.kf.x
    public final void d7() {
        com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new c(null), 3);
    }

    @Override // com.amazon.aps.iva.kf.x
    public final void j1(c0 c0Var) {
        com.amazon.aps.iva.ez.h.d(this.e);
        com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new a(c0Var, null), 3);
    }

    @Override // com.amazon.aps.iva.kf.x
    public final void s5(ThirdPartyApp thirdPartyApp) {
        com.amazon.aps.iva.yb0.j.f(thirdPartyApp, "thirdPartyApp");
        com.amazon.aps.iva.ez.h.d(this.d);
        com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new b(thirdPartyApp, null), 3);
    }

    @Override // com.amazon.aps.iva.kf.x
    public final com.amazon.aps.iva.i5.v w8() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.kf.x
    public final com.amazon.aps.iva.i5.v y3() {
        return this.c;
    }
}
