package com.ellation.crunchyroll.api.model;

import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.simulcast.SimulcastSeason;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: SeasonListContainer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"toSimulcastSeasons", "", "Lcom/ellation/crunchyroll/model/simulcast/SimulcastSeason;", "Lcom/ellation/crunchyroll/api/model/RawSimulcastSeason;", "api_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SeasonListContainerKt {
    public static final List<SimulcastSeason> toSimulcastSeasons(List<RawSimulcastSeason> list) {
        String str;
        j.f(list, "<this>");
        List<RawSimulcastSeason> list2 = list;
        ArrayList arrayList = new ArrayList(r.Y(list2));
        for (RawSimulcastSeason rawSimulcastSeason : list2) {
            String id = rawSimulcastSeason.getId();
            RawSimulcastSeasonLocalization localization = rawSimulcastSeason.getLocalization();
            if (localization == null || (str = localization.getTitle()) == null) {
                str = "";
            }
            arrayList.add(new SimulcastSeason(id, str));
        }
        return arrayList;
    }
}
