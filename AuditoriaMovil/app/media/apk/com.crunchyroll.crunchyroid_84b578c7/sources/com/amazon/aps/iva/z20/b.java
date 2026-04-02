package com.amazon.aps.iva.z20;

import android.content.Context;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.subscription.model.Product;
import java.util.List;
/* compiled from: OfflineAccessGateFormatter.kt */
/* loaded from: classes2.dex */
public final class b implements com.amazon.aps.iva.z20.a {
    public final Context b;

    /* compiled from: OfflineAccessGateFormatter.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.amazon.aps.iva.vh.a.values().length];
            try {
                iArr[com.amazon.aps.iva.vh.a.SYNC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.amazon.aps.iva.vh.a.PLAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public b(Context context) {
        this.b = context;
    }

    @Override // com.amazon.aps.iva.z20.a
    public final String a(com.amazon.aps.iva.vh.a aVar, List<Product> list) {
        j.f(aVar, "accessReason");
        j.f(list, "products");
        Product a2 = c.a(list);
        Context context = this.b;
        if (a2 != null) {
            int i = a.a[aVar.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    String string = context.getString(R.string.offline_access_upsell_subtitle_for_play_format_two_args, context.getString(com.amazon.aps.iva.a30.a.FAN_PACK.getTitleResId()), context.getString(c.b(a2)));
                    j.e(string, "context.getString(\n     …itle())\n                )");
                    return string;
                }
                throw new com.amazon.aps.iva.kb0.h();
            }
            String string2 = context.getString(R.string.offline_access_upsell_subtitle_for_sync_format_two_args, context.getString(com.amazon.aps.iva.a30.a.FAN_PACK.getTitleResId()), context.getString(c.b(a2)));
            j.e(string2, "context.getString(\n     …itle())\n                )");
            return string2;
        }
        int i2 = a.a[aVar.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                String string3 = context.getString(R.string.offline_access_upsell_subtitle_for_play_format, context.getString(com.amazon.aps.iva.a30.a.FAN_PACK.getTitleResId()));
                j.e(string3, "context.getString(\n     …eResId)\n                )");
                return string3;
            }
            throw new com.amazon.aps.iva.kb0.h();
        }
        String string4 = context.getString(R.string.offline_access_upsell_subtitle_for_sync_format, context.getString(com.amazon.aps.iva.a30.a.FAN_PACK.getTitleResId()));
        j.e(string4, "context.getString(\n     …eResId)\n                )");
        return string4;
    }

    @Override // com.amazon.aps.iva.z20.a
    public final String b(List<Product> list) {
        j.f(list, "products");
        Product a2 = c.a(list);
        Context context = this.b;
        if (a2 != null) {
            String string = context.getString(R.string.offline_access_upsell_title_format_two_args, context.getString(com.amazon.aps.iva.a30.a.FAN_PACK.getTitleResId()), context.getString(c.b(a2)));
            j.e(string, "{\n            context.ge…)\n            )\n        }");
            return string;
        }
        String string2 = context.getString(R.string.offline_access_upsell_title_format, context.getString(com.amazon.aps.iva.a30.a.FAN_PACK.getTitleResId()));
        j.e(string2, "{\n            context.ge…)\n            )\n        }");
        return string2;
    }
}
