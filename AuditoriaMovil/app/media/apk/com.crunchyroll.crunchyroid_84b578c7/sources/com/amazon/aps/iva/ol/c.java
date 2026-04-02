package com.amazon.aps.iva.ol;

import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.i5.d0;
import com.amazon.aps.iva.i5.u;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.nl.q;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import java.util.List;
/* compiled from: ChromecastAudioSettingsViewModel.kt */
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.ez.b implements q {
    public final com.amazon.aps.iva.ye.h b;
    public final com.amazon.aps.iva.ql.d c;
    public final g0 d;
    public final LiveData<List<com.amazon.aps.iva.nl.a>> e;
    public final u f;

    /* compiled from: ChromecastAudioSettingsViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.settings.audio.chromecast.ChromecastAudioSettingsViewModelImpl$selectOption$1", f = "ChromecastAudioSettingsViewModel.kt", l = {65}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ com.amazon.aps.iva.nl.a j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.nl.a aVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.j = aVar;
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
                com.amazon.aps.iva.ql.d dVar = c.this.c;
                String str = this.j.b;
                this.h = 1;
                if (dVar.b(str, this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.amazon.aps.iva.ol.a aVar, com.amazon.aps.iva.ye.h hVar, com.amazon.aps.iva.ql.e eVar, com.amazon.aps.iva.xe0.d dVar) {
        super(new com.amazon.aps.iva.wy.j[0]);
        com.amazon.aps.iva.yb0.j.f(hVar, "chromecastMessage");
        this.b = hVar;
        this.c = eVar;
        this.d = dVar;
        aVar.a(w.D(this));
        v<List<com.amazon.aps.iva.nl.a>> vVar = aVar.f;
        this.e = vVar;
        this.f = d0.b(vVar, d.h);
    }

    @Override // com.amazon.aps.iva.nl.q
    public final LiveData<List<com.amazon.aps.iva.nl.a>> A7() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.nl.q
    public final LiveData<com.amazon.aps.iva.nl.a> O5() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.nl.q
    public final void m2(com.amazon.aps.iva.nl.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "option");
        this.b.sendMessage(new com.amazon.aps.iva.ze.d(aVar.a));
        com.amazon.aps.iva.se0.i.d(this.d, null, null, new a(aVar, null), 3);
    }
}
