package com.amazon.aps.iva.m00;

import com.amazon.aps.iva.lb0.z;
import com.ellation.crunchyroll.model.FormattableSeason;
import com.ellation.crunchyroll.presentation.content.seasons.SelectedSeasonFragment;
import java.util.List;
/* compiled from: SelectedSeasonPresenter.kt */
/* loaded from: classes2.dex */
public final class l<T extends FormattableSeason> extends com.amazon.aps.iva.wy.b<m<T>> implements k<T> {
    public final c<T> b;
    public int c;
    public List<? extends T> d;

    public l(c cVar, SelectedSeasonFragment selectedSeasonFragment) {
        super(selectedSeasonFragment, new com.amazon.aps.iva.wy.j[0]);
        this.b = cVar;
        this.c = -1;
        this.d = z.b;
    }

    @Override // com.amazon.aps.iva.m00.k
    public final void A() {
        if (!this.d.isEmpty()) {
            getView().ac(this.c, this.d);
        }
    }

    @Override // com.amazon.aps.iva.m00.k
    public final void B2(List<? extends T> list, T t) {
        int indexOf;
        com.amazon.aps.iva.yb0.j.f(list, "seasons");
        this.d = list;
        if (!list.isEmpty()) {
            getView().c8();
        } else {
            getView().gc();
        }
        if (t != null && (indexOf = this.d.indexOf(t)) != this.c) {
            this.c = indexOf;
            getView().k9(this.b.f(t));
        }
    }

    @Override // com.amazon.aps.iva.m00.k
    public final void U1(T t) {
        com.amazon.aps.iva.yb0.j.f(t, "season");
        int indexOf = this.d.indexOf(t);
        if (indexOf != this.c) {
            this.c = indexOf;
            getView().k9(this.b.f(t));
        }
    }
}
