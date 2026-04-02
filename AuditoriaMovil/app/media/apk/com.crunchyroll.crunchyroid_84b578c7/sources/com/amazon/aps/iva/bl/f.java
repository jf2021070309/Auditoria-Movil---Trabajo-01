package com.amazon.aps.iva.bl;

import android.content.res.Configuration;
import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.player.presentation.controls.timeline.PlayerTimelineLayout;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PlayerTimelinePresenter.kt */
/* loaded from: classes2.dex */
public final class f extends com.amazon.aps.iva.wy.b<g> {
    public final com.amazon.aps.iva.bl.a b;
    public final com.amazon.aps.iva.vk.g c;
    public final com.amazon.aps.iva.vk.a d;
    public boolean e;
    public int f;

    /* compiled from: PlayerTimelinePresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<h, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(h hVar) {
            h hVar2 = hVar;
            f fVar = f.this;
            g q6 = f.q6(fVar);
            List<Long> list = hVar2.e;
            ArrayList arrayList = new ArrayList(r.Y(list));
            for (Number number : list) {
                arrayList.add(Double.valueOf(number.longValue()));
            }
            long j = hVar2.a;
            int i = (int) j;
            q6.le(i, arrayList);
            fVar.getView().setSeekBarVideoDuration(j);
            fVar.getView().setVideoDurationText(fVar.c.a(i));
            fVar.getView().setBufferPosition(hVar2.b);
            if (!fVar.e) {
                fVar.getView().setSeekPosition(hVar2.c * ((float) j));
            }
            if (hVar2.d) {
                fVar.getView().c2();
            } else {
                fVar.getView().S4();
            }
            return q.a;
        }
    }

    /* compiled from: PlayerTimelinePresenter.kt */
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
            return j.a(this.a, ((com.amazon.aps.iva.yb0.f) obj).getFunctionDelegate());
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

    public f(PlayerTimelineLayout playerTimelineLayout, d dVar, com.amazon.aps.iva.rs.a aVar, com.amazon.aps.iva.vk.b bVar) {
        super(playerTimelineLayout, new com.amazon.aps.iva.wy.j[0]);
        this.b = dVar;
        this.c = aVar;
        this.d = bVar;
    }

    public static final /* synthetic */ g q6(f fVar) {
        return fVar.getView();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onConfigurationChanged(Configuration configuration) {
        getView().n();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        this.b.getData().e(getView(), new b(new a()));
    }
}
