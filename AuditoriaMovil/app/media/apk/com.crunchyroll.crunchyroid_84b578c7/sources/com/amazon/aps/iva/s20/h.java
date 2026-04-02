package com.amazon.aps.iva.s20;

import android.content.Context;
import com.amazon.aps.iva.ee0.f1;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.subscription.model.Product;
import java.util.List;
/* compiled from: UpgradeMessageProviderImpl.kt */
/* loaded from: classes2.dex */
public final class h implements com.amazon.aps.iva.rh.a {
    public final Context a;
    public final com.amazon.aps.iva.wh.d b;

    public h(Context context, com.amazon.aps.iva.wh.d dVar) {
        this.a = context;
        this.b = dVar;
    }

    @Override // com.amazon.aps.iva.rh.a
    public final List<String> a() {
        int titleResId = com.amazon.aps.iva.a30.a.FAN_PACK.getTitleResId();
        Context context = this.a;
        String string = context.getString(titleResId);
        com.amazon.aps.iva.yb0.j.e(string, "context.getString(CrPlus…Info.FAN_PACK.titleResId)");
        String string2 = context.getString(com.amazon.aps.iva.a30.a.SUPER_FAN_PACK.getTitleResId());
        com.amazon.aps.iva.yb0.j.e(string2, "context.getString(CrPlus…UPER_FAN_PACK.titleResId)");
        String string3 = context.getString(com.amazon.aps.iva.a30.a.ANNUAL_FAN_PACK.getTitleResId());
        com.amazon.aps.iva.yb0.j.e(string3, "context.getString(CrPlus…NUAL_FAN_PACK.titleResId)");
        return f1.K(string, string2, string3);
    }

    @Override // com.amazon.aps.iva.rh.a
    public final String b(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "activeSubscriptionSku");
        Product a = com.amazon.aps.iva.z20.c.a(this.b.c());
        com.amazon.aps.iva.a30.a aVar = com.amazon.aps.iva.a30.a.FAN_PACK;
        int titleResId = aVar.getTitleResId();
        Context context = this.a;
        String string = context.getString(titleResId);
        com.amazon.aps.iva.yb0.j.e(string, "context.getString(CrPlus…Info.FAN_PACK.titleResId)");
        if (com.amazon.aps.iva.yb0.j.a(str, com.amazon.aps.iva.a30.a.PREMIUM.getSku()) && a != null) {
            String string2 = context.getString(com.amazon.aps.iva.z20.c.b(a));
            com.amazon.aps.iva.yb0.j.e(string2, "context.getString(thirdTierProduct.getTitle())");
            String string3 = context.getString(R.string.extended_upgrade_membership_screen_subtitle_two_args, string, string2);
            com.amazon.aps.iva.yb0.j.e(string3, "{\n                val th…          )\n            }");
            return string3;
        } else if (com.amazon.aps.iva.yb0.j.a(str, aVar.getSku()) && a != null) {
            String string4 = context.getString(com.amazon.aps.iva.z20.c.b(a));
            com.amazon.aps.iva.yb0.j.e(string4, "context.getString(thirdTierProduct.getTitle())");
            String string5 = context.getString(R.string.extended_upgrade_membership_screen_subtitle, string4);
            com.amazon.aps.iva.yb0.j.e(string5, "{\n                val th…          )\n            }");
            return string5;
        } else {
            String string6 = context.getString(R.string.settings_premium_membership_upgrade_plan);
            com.amazon.aps.iva.yb0.j.e(string6, "{\n                contex…ackMessage)\n            }");
            return string6;
        }
    }

    @Override // com.amazon.aps.iva.rh.a
    public final String c(Integer num, Integer num2) {
        int i;
        int i2;
        Product a = com.amazon.aps.iva.z20.c.a(this.b.c());
        com.amazon.aps.iva.a30.a aVar = com.amazon.aps.iva.a30.a.FAN_PACK;
        int titleResId = aVar.getTitleResId();
        Context context = this.a;
        String string = context.getString(titleResId);
        com.amazon.aps.iva.yb0.j.e(string, "context.getString(CrPlus…Info.FAN_PACK.titleResId)");
        if (a != null) {
            String string2 = context.getString(com.amazon.aps.iva.z20.c.b(a));
            com.amazon.aps.iva.yb0.j.e(string2, "context.getString(thirdTierProduct.getTitle())");
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = R.string.extended_upgrade_feature_access_two_args;
            }
            String string3 = context.getString(i2, string, string2);
            com.amazon.aps.iva.yb0.j.e(string3, "{\n            val thirdP…e\n            )\n        }");
            return string3;
        }
        if (num2 != null) {
            i = num2.intValue();
        } else {
            i = R.string.extended_upgrade_feature_access;
        }
        String string4 = context.getString(i, context.getString(aVar.getTitleResId()));
        com.amazon.aps.iva.yb0.j.e(string4, "{\n            context.ge…)\n            )\n        }");
        return string4;
    }
}
