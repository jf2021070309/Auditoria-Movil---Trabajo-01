package com.amazon.aps.iva.xo;

import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.i5.j;
import com.amazon.aps.iva.i5.u;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.i;
import com.amazon.aps.iva.xo.d;
import com.amazon.aps.iva.xy.m;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.downloading.presentation.download.button.DownloadButtonState;
/* compiled from: WatchScreenDownloadingViewModel.kt */
/* loaded from: classes2.dex */
public final class c extends u<DownloadButtonState> {

    /* compiled from: WatchScreenDownloadingViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.no.b, q> {
        public final /* synthetic */ d h;
        public final /* synthetic */ c i;
        public final /* synthetic */ com.amazon.aps.iva.fg.c j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, c cVar, com.amazon.aps.iva.fg.c cVar2) {
            super(1);
            this.h = dVar;
            this.i = cVar;
            this.j = cVar2;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.no.b bVar) {
            i.d(w.D(this.h), null, null, new b(this.i, this.j, bVar, null), 3);
            return q.a;
        }
    }

    public c(d dVar, com.amazon.aps.iva.fg.c cVar) {
        l(j.b(m.a(dVar.b.P1()), w.D(dVar).getCoroutineContext()), new d.a(new a(dVar, this, cVar)));
    }
}
