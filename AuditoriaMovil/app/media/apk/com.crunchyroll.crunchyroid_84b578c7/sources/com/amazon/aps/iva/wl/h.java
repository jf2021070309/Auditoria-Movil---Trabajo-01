package com.amazon.aps.iva.wl;

import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.i5.f0;
import com.amazon.aps.iva.se0.g0;
import java.util.List;
/* compiled from: PlayerSubtitlesSettingsViewModel.kt */
/* loaded from: classes2.dex */
public final class h extends f0 implements f {
    public final com.amazon.aps.iva.ql.a b;
    public final com.amazon.aps.iva.xe0.d c = z.j();
    public final androidx.lifecycle.c d;
    public final androidx.lifecycle.c e;

    /* compiled from: PlayerSubtitlesSettingsViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.settings.subtitles.PlayerSubtitlesSettingsViewModelImpl$updatePreferredSubtitlesLanguage$1", f = "PlayerSubtitlesSettingsViewModel.kt", l = {49}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.j = str;
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
                com.amazon.aps.iva.ql.a aVar2 = h.this.b;
                this.h = 1;
                if (aVar2.e(this.j, this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public h(d dVar, com.amazon.aps.iva.ql.b bVar) {
        this.b = bVar;
        this.d = com.amazon.aps.iva.i5.j.b(dVar.b, w.D(this).getCoroutineContext());
        this.e = com.amazon.aps.iva.i5.j.b(dVar.c, w.D(this).getCoroutineContext());
    }

    @Override // com.amazon.aps.iva.wl.o
    public final void C3(String str, boolean z) {
        com.amazon.aps.iva.yb0.j.f(str, "language");
        com.amazon.aps.iva.se0.i.d(this.c, null, null, new g(this, z, null), 3);
    }

    @Override // com.amazon.aps.iva.wl.o
    public final void O(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "newLanguage");
        com.amazon.aps.iva.se0.i.d(w.D(this), null, null, new a(str, null), 3);
    }

    @Override // com.amazon.aps.iva.wl.o
    public final LiveData<List<com.amazon.aps.iva.jh.f>> S2() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.wl.o
    public final LiveData<com.amazon.aps.iva.jh.f> w() {
        return this.d;
    }
}
