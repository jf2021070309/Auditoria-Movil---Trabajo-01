package com.amazon.aps.iva.q20;

import android.content.res.Resources;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.kb0.j;
import com.amazon.aps.iva.lb0.i0;
import com.crunchyroll.crunchyroid.R;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: CrPlusBenefitsDescriptionsProvider.kt */
/* loaded from: classes2.dex */
public final class b implements a {
    public final Resources a;
    public final com.amazon.aps.iva.xb0.a<Boolean> b;
    public final LinkedHashMap<String, Integer> c;

    public b(Resources resources, com.amazon.aps.iva.xb0.a<Boolean> aVar) {
        this.a = resources;
        this.b = aVar;
        j[] jVarArr = {new j("no_ads", Integer.valueOf((int) R.string.cr_plus_tier_benefit_no_ads)), new j("catalog", Integer.valueOf((int) R.string.cr_plus_tier_benefit_catalog)), new j("simulcast", Integer.valueOf((int) R.string.cr_plus_tier_benefit_simulcast_same_day)), new j("cr_bento", Integer.valueOf((int) R.string.cr_plus_tier_benefit_bento)), new j("music", Integer.valueOf((int) R.string.cr_plus_tier_benefit_music)), new j("concurrent_streams.1", Integer.valueOf((int) R.string.cr_plus_tier_benefit_streams_1_device)), new j("concurrent_streams.4", Integer.valueOf((int) R.string.cr_plus_tier_benefit_streams_4_devices)), new j("concurrent_streams.6", Integer.valueOf((int) R.string.cr_plus_tier_benefit_streams_6_devices)), new j("offline_viewing", Integer.valueOf((int) R.string.cr_plus_tier_benefit_offline_viewing_benefit)), new j("cr_store.member_offers_and_percent_off.10", Integer.valueOf((int) R.string.cr_plus_tier_benefit_store_10_percent_off)), new j("cr_store.member_offers_and_percent_off.20", Integer.valueOf((int) R.string.cr_plus_tier_benefit_store_15_percent_off)), new j("annual_swag_bag", Integer.valueOf((int) R.string.cr_plus_tier_benefit_annual_swag_bag)), new j("hime_figure_discount", Integer.valueOf((int) R.string.cr_plus_tier_benefit_hime_figure_discount)), new j("annual_discount.percent_16", Integer.valueOf((int) R.string.cr_plus_tier_benefit_annual_discount_16_percents))};
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(k.w(14));
        i0.Y(linkedHashMap, jVarArr);
        if (!aVar.invoke().booleanValue()) {
            linkedHashMap.remove("cr_bento");
        }
        this.c = linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.q20.a
    public final LinkedHashMap<String, String> a(boolean z) {
        LinkedHashMap<String, Integer> linkedHashMap = this.c;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            boolean z2 = true;
            if (z && com.amazon.aps.iva.yb0.j.a(entry.getKey(), "annual_discount.percent_16")) {
                z2 = false;
            }
            if (z2) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap<String, String> linkedHashMap3 = new LinkedHashMap<>();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            linkedHashMap3.put(entry2.getKey(), this.a.getString(((Number) entry2.getValue()).intValue()));
        }
        return linkedHashMap3;
    }
}
