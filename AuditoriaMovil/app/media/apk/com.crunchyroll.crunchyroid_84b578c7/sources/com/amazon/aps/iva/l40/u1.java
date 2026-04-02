package com.amazon.aps.iva.l40;

import com.ellation.crunchyroll.api.cms.model.Season;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ShowPageViewModel.kt */
/* loaded from: classes2.dex */
public final class u1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<f, Season> {
    public final /* synthetic */ List<String> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(ArrayList arrayList) {
        super(1);
        this.h = arrayList;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Season invoke(f fVar) {
        Object obj;
        f fVar2 = fVar;
        com.amazon.aps.iva.yb0.j.f(fVar2, "seasons");
        List<Season> list = fVar2.b;
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (this.h.contains(((Season) obj).getId())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Season season = (Season) obj;
        if (season == null) {
            return (Season) com.amazon.aps.iva.lb0.x.v0(list);
        }
        return season;
    }
}
