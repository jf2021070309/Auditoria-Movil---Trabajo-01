package com.kwad.sdk.core.f.a;

import android.content.Context;
import com.kwad.sdk.utils.s;
/* loaded from: classes.dex */
public final class i {
    private Context mContext;

    public i(Context context) {
        this.mContext = context;
    }

    public final String getOAID() {
        try {
            String str = (String) s.f(s.g("com.android.id.impl.IdProviderImpl", new Object[0]), "getOAID", this.mContext);
            try {
                new StringBuilder("getOAID oaid:").append(str);
                return str;
            } catch (Exception e) {
                return str;
            }
        } catch (Exception e2) {
            return "";
        }
    }
}
