package com.amazon.aps.iva.ll;

import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.i5.d0;
import com.amazon.aps.iva.i5.u;
import com.amazon.aps.iva.se0.g0;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
/* compiled from: PlayerSettingsViewModel.kt */
/* loaded from: classes2.dex */
public final class q extends com.amazon.aps.iva.ez.b implements o {
    public final com.amazon.aps.iva.ql.a b;
    public final com.amazon.aps.iva.pl.b c;
    public final com.amazon.aps.iva.xe0.d d;
    public final u e;
    public final androidx.lifecycle.c f;
    public final androidx.lifecycle.c g;
    public final androidx.lifecycle.c h;
    public final LiveData<com.amazon.aps.iva.jh.f> i;

    /* compiled from: PlayerSettingsViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.settings.PlayerSettingsViewModelImpl$updateAutoPlay$1", f = "PlayerSettingsViewModel.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ boolean j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.j = z;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                com.amazon.aps.iva.ql.a aVar2 = q.this.b;
                this.h = 1;
                if (aVar2.c(this.j, this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: PlayerSettingsViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.settings.PlayerSettingsViewModelImpl$updatePreferredQuality$1", f = "PlayerSettingsViewModel.kt", l = {97}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ com.amazon.aps.iva.sl.g j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.sl.g gVar, com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
            this.j = gVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                com.amazon.aps.iva.ql.a aVar2 = q.this.b;
                this.h = 1;
                if (aVar2.a(this.j, this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public q(com.amazon.aps.iva.ql.g gVar, com.amazon.aps.iva.sl.a aVar, com.amazon.aps.iva.wl.o oVar, com.amazon.aps.iva.nl.q qVar, com.amazon.aps.iva.ql.b bVar, com.amazon.aps.iva.pl.c cVar) {
        super(new com.amazon.aps.iva.wy.j[0]);
        this.b = bVar;
        this.c = cVar;
        this.d = z.j();
        this.e = d0.b(qVar.O5(), p.h);
        this.f = com.amazon.aps.iva.i5.j.b(gVar.d, w.D(this).getCoroutineContext());
        com.amazon.aps.iva.i5.j.b(gVar.e, w.D(this).getCoroutineContext());
        com.amazon.aps.iva.i5.j.b(gVar.f, w.D(this).getCoroutineContext());
        this.g = com.amazon.aps.iva.i5.j.b(aVar.p(), w.D(this).getCoroutineContext());
        this.h = com.amazon.aps.iva.i5.j.b(aVar.s0(), w.D(this).getCoroutineContext());
        this.i = oVar.w();
    }

    @Override // com.amazon.aps.iva.ll.o
    public final androidx.lifecycle.c D2() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.ll.o
    public final void Q(boolean z) {
        com.amazon.aps.iva.se0.i.d(this.d, null, null, new a(z, null), 3);
        this.c.Q(z);
    }

    @Override // com.amazon.aps.iva.ll.o
    public final u h3() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.ll.o
    public final void l4(com.amazon.aps.iva.sl.g gVar) {
        com.amazon.aps.iva.yb0.j.f(gVar, "newQuality");
        com.amazon.aps.iva.se0.i.d(this.d, null, null, new b(gVar, null), 3);
    }

    @Override // com.amazon.aps.iva.ll.o
    public final androidx.lifecycle.c p() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.ll.o
    public final androidx.lifecycle.c s0() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.ll.o
    public final LiveData<com.amazon.aps.iva.jh.f> w() {
        return this.i;
    }
}
