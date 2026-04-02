package com.amazon.aps.iva.e40;

import android.content.res.Resources;
import com.amazon.aps.iva.a30.a;
import com.crunchyroll.crunchyroid.R;
import java.text.DateFormat;
import java.util.Map;
/* compiled from: PremiumMembershipInfoUIModelMapper.kt */
/* loaded from: classes2.dex */
public final class d implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.g40.a, f> {
    public final Resources b;
    public final DateFormat c;

    public d(Resources resources, DateFormat dateFormat) {
        this.b = resources;
        this.c = dateFormat;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final f invoke(com.amazon.aps.iva.g40.a aVar) {
        String string;
        com.amazon.aps.iva.g40.a aVar2 = aVar;
        com.amazon.aps.iva.yb0.j.f(aVar2, "info");
        Map<String, o> map = e.a;
        String str = aVar2.a;
        o oVar = map.get(str);
        if (oVar != null) {
            com.amazon.aps.iva.a30.a.Companion.getClass();
            int imageResId = a.C0100a.a(str).getImageResId();
            Resources resources = this.b;
            String string2 = resources.getString(oVar.a);
            com.amazon.aps.iva.yb0.j.e(string2, "resources.getString(skuR…bscriptionNameResourceId)");
            String string3 = resources.getString(oVar.b);
            com.amazon.aps.iva.yb0.j.e(string3, "resources.getString(skuR…iptionDurationResourceId)");
            String str2 = aVar2.b;
            if (aVar2.d) {
                string = resources.getString(R.string.premium_membership_billing_date);
            } else {
                string = resources.getString(R.string.premium_membership_cancellation_date);
            }
            String str3 = string;
            com.amazon.aps.iva.yb0.j.e(str3, "if (info.isAutoRenewable…ation_date)\n            }");
            String format = this.c.format(aVar2.c);
            com.amazon.aps.iva.yb0.j.e(format, "dateFormat.format(info.billingDate)");
            return new f(imageResId, string2, string3, str2, str3, format);
        }
        throw new com.amazon.aps.iva.rs.h(com.amazon.aps.iva.c80.a.f(str, " not supported"));
    }
}
