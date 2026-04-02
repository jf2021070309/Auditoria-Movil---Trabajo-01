package com.amazon.aps.iva.fp;

import com.amazon.aps.iva.ab.t;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.i5.f0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.ve0.k0;
import com.amazon.aps.iva.ve0.l0;
import com.amazon.aps.iva.ve0.u0;
import com.amazon.aps.iva.ve0.v0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.google.zxing.aztec.encoder.Encoder;
import java.io.IOException;
/* compiled from: WatchScreenMatureFlowViewModel.kt */
/* loaded from: classes2.dex */
public final class e extends f0 implements d {
    public final f b;
    public final v0 c;
    public final l0 d;

    /* compiled from: WatchScreenMatureFlowViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.watchscreen.screen.mature.WatchScreenMatureFlowViewModelImpl$onEnableMatureContent$1", f = "WatchScreenMatureFlowViewModel.kt", l = {Encoder.DEFAULT_EC_PERCENT, 34, 37}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public final /* synthetic */ PlayableAsset j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PlayableAsset playableAsset, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.j = playableAsset;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            e eVar = e.this;
            try {
            } catch (IOException e) {
                l0 l0Var = eVar.d;
                g.a aVar2 = new g.a(null, e);
                this.h = 3;
                if (l0Var.a(aVar2, this) == aVar) {
                    return aVar;
                }
            }
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            x.i0(obj);
                            eVar.c.setValue(Boolean.FALSE);
                            return q.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    x.i0(obj);
                    eVar.c.setValue(Boolean.FALSE);
                    return q.a;
                }
                x.i0(obj);
            } else {
                x.i0(obj);
                f fVar = eVar.b;
                PlayableAsset playableAsset = this.j;
                this.h = 1;
                obj = fVar.enableMatureContent(playableAsset, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            l0 l0Var2 = eVar.d;
            g.c cVar = new g.c((PlayableAsset) obj, null);
            this.h = 2;
            if (l0Var2.a(cVar, this) == aVar) {
                return aVar;
            }
            eVar.c.setValue(Boolean.FALSE);
            return q.a;
        }
    }

    public e(f fVar) {
        j.f(fVar, "maturePreferenceInteractor");
        this.b = fVar;
        this.c = x.e(Boolean.FALSE);
        this.d = t.g(0, 0, null, 7);
    }

    @Override // com.amazon.aps.iva.fp.d
    public final u0 getMatureFlowProcessing() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.fp.d
    public final k0 getMatureFlowStatus() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.fp.d
    public final void onEnableMatureContent(PlayableAsset playableAsset) {
        this.c.setValue(Boolean.TRUE);
        com.amazon.aps.iva.se0.i.d(w.D(this), null, null, new a(playableAsset, null), 3);
    }
}
