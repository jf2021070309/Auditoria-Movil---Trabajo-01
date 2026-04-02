package com.amazon.aps.iva.a30;

import com.amazon.aps.iva.rs.h;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
/* compiled from: TierSkuInfo.kt */
/* loaded from: classes2.dex */
public enum d {
    PREMIUM("crunchyroll.google.premium.monthly", R.drawable.hime_fan, null, 4, null),
    FAN_PACK("crunchyroll.google.fanpack.monthly", R.drawable.hime_mega_fan, Integer.valueOf((int) R.string.upsell_best_deal_type)),
    SUPER_FAN_PACK("crunchyroll.google.superfanpack.monthly", R.drawable.hime_ultimate_fan, null, 4, null),
    ANNUAL_FAN_PACK("crunchyroll.google.fanpack.annually", R.drawable.hime_mega_fan, Integer.valueOf((int) R.string.upsell_best_annual_type));
    
    public static final a Companion = new a();
    private final Integer dealTypeResId;
    private final int imageResId;
    private final String sku;

    /* compiled from: TierSkuInfo.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static d a(String str) {
            d dVar;
            j.f(str, "sku");
            d[] values = d.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    dVar = values[i];
                    if (j.a(dVar.getSku(), str)) {
                        break;
                    }
                    i++;
                } else {
                    dVar = null;
                    break;
                }
            }
            if (dVar != null) {
                return dVar;
            }
            throw new h(str.concat(" not supported"));
        }
    }

    d(String str, int i, Integer num) {
        this.sku = str;
        this.imageResId = i;
        this.dealTypeResId = num;
    }

    public final Integer getDealTypeResId() {
        return this.dealTypeResId;
    }

    public final int getImageResId() {
        return this.imageResId;
    }

    public final String getSku() {
        return this.sku;
    }

    /* synthetic */ d(String str, int i, Integer num, int i2, e eVar) {
        this(str, i, (i2 & 4) != 0 ? null : num);
    }
}
