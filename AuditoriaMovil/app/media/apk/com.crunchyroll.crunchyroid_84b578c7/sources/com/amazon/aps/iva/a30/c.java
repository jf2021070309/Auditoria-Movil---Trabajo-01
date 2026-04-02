package com.amazon.aps.iva.a30;

import android.content.res.Resources;
import com.amazon.aps.iva.kb0.j;
import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.xb0.l;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.subscription.model.Product;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
/* compiled from: CrPlusSkusProductsModelMapper.kt */
/* loaded from: classes2.dex */
public final class c implements l<List<? extends Product>, List<? extends b>> {
    public final Resources b;
    public final Map<String, Integer> c = i0.U(new j("premium_us", Integer.valueOf((int) R.string.cr_plus_premium_us_description)), new j("fan_pack_us", Integer.valueOf((int) R.string.cr_plus_fanpack_us_description)), new j("super_fan_pack_us", Integer.valueOf((int) R.string.cr_plus_superfanpack_us_description)), new j("premium_english_intl", Integer.valueOf((int) R.string.cr_plus_premium_english_intl_description)), new j("fan_pack_english_intl", Integer.valueOf((int) R.string.cr_plus_fanpack_english_intl_description)), new j("fan_pack_english_intl_annual", Integer.valueOf((int) R.string.cr_plus_fanpack_english_intl_annual_description)), new j("premium_non_english_intl", Integer.valueOf((int) R.string.cr_plus_premium_non_english_intl_description)), new j("fan_pack_non_english_intl", Integer.valueOf((int) R.string.cr_plus_fanpack_non_english_intl_description)), new j("fan_pack_non_english_intl_annual", Integer.valueOf((int) R.string.cr_plus_fanpack_non_english_intl_annual_description)));

    public c(Resources resources) {
        this.b = resources;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final List<? extends b> invoke(List<? extends Product> list) {
        String str;
        String str2;
        boolean z;
        List<? extends Product> list2 = list;
        com.amazon.aps.iva.yb0.j.f(list2, "products");
        a[] values = a.values();
        ArrayList arrayList = new ArrayList();
        for (a aVar : values) {
            List<? extends Product> list3 = list2;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                for (Product product : list3) {
                    if (com.amazon.aps.iva.yb0.j.a(product.getSku(), aVar.getSku())) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                arrayList.add(aVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(r.Y(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar2 = (a) it.next();
            for (Product product2 : list2) {
                if (com.amazon.aps.iva.yb0.j.a(product2.getSku(), aVar2.getSku())) {
                    String sku = aVar2.getSku();
                    int titleResId = aVar2.getTitleResId();
                    Resources resources = this.b;
                    String string = resources.getString(titleResId);
                    com.amazon.aps.iva.yb0.j.e(string, "resources.getString(skuInfo.titleResId)");
                    Integer num = this.c.get(product2.getBenefitPackage().getName());
                    if (num != null) {
                        str = resources.getString(num.intValue());
                    } else {
                        str = null;
                    }
                    List<String> benefitsKeys = product2.getBenefitPackage().getBenefitsKeys();
                    Integer dealTypeResId = aVar2.getDealTypeResId();
                    if (dealTypeResId != null) {
                        str2 = resources.getString(dealTypeResId.intValue());
                    } else {
                        str2 = null;
                    }
                    arrayList2.add(new b(sku, string, str, benefitsKeys, str2));
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        return arrayList2;
    }
}
