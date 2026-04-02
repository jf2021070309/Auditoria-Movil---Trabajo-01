package com.amazon.aps.iva.a30;

import com.amazon.aps.iva.rs.h;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
/* compiled from: CrPlusSkuInfo.kt */
/* loaded from: classes2.dex */
public enum a {
    PREMIUM("crunchyroll.google.premium.monthly", R.string.cr_plus_premium_monthly_title, R.drawable.hime_premium, null, 8, null),
    FAN_PACK("crunchyroll.google.fanpack.monthly", R.string.cr_plus_fanpack_monthly_title, R.drawable.hime_fan_pack, Integer.valueOf((int) R.string.cr_plus_best_deal_type)),
    SUPER_FAN_PACK("crunchyroll.google.superfanpack.monthly", R.string.cr_plus_superfanpack_monthly_title, R.drawable.hime_super_fan_pack, null, 8, null),
    ANNUAL_FAN_PACK("crunchyroll.google.fanpack.annually", R.string.cr_plus_fanpack_annual_title, R.drawable.hime_fan_pack, null, 8, null);
    
    public static final C0100a Companion = new C0100a();
    private final Integer dealTypeResId;
    private final int imageResId;
    private final String sku;
    private final int titleResId;

    /* compiled from: CrPlusSkuInfo.kt */
    /* renamed from: com.amazon.aps.iva.a30.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0100a {
        public static a a(String str) {
            a aVar;
            j.f(str, "sku");
            a[] values = a.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    aVar = values[i];
                    if (j.a(aVar.getSku(), str)) {
                        break;
                    }
                    i++;
                } else {
                    aVar = null;
                    break;
                }
            }
            if (aVar != null) {
                return aVar;
            }
            throw new h(str.concat(" not supported"));
        }
    }

    a(String str, int i, int i2, Integer num) {
        this.sku = str;
        this.titleResId = i;
        this.imageResId = i2;
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

    public final int getTitleResId() {
        return this.titleResId;
    }

    /* synthetic */ a(String str, int i, int i2, Integer num, int i3, e eVar) {
        this(str, i, i2, (i3 & 8) != 0 ? null : num);
    }
}
