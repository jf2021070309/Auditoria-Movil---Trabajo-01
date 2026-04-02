package com.amazon.aps.iva.yh;

import android.content.Context;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
/* compiled from: MultipleArtistsConnectorMapperImpl.kt */
/* loaded from: classes.dex */
public final class b implements a {
    public final Context a;

    public b(Context context) {
        j.f(context, "context");
        this.a = context;
    }

    @Override // com.amazon.aps.iva.yh.a
    public final String a(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            Context context = this.a;
            if (hashCode != -420498893) {
                if (hashCode != 3649734) {
                    if (hashCode == 97304892 && str.equals("feat.")) {
                        String string = context.getString(R.string.multiple_artists_connector_feat);
                        j.e(string, "context.getString(R.stri…e_artists_connector_feat)");
                        return string;
                    }
                } else if (str.equals("with")) {
                    String string2 = context.getString(R.string.multiple_artists_connector_with);
                    j.e(string2, "context.getString(R.stri…e_artists_connector_with)");
                    return string2;
                }
            } else if (str.equals("featuring")) {
                String string3 = context.getString(R.string.multiple_artists_connector_featuring);
                j.e(string3, "context.getString(R.stri…ists_connector_featuring)");
                return string3;
            }
        }
        if (str == null) {
            return "";
        }
        return str;
    }
}
