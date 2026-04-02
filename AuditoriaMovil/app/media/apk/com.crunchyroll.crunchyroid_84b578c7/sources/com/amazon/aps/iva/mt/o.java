package com.amazon.aps.iva.mt;

import android.content.Context;
import com.amazon.aps.iva.ee0.f1;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: SeasonAndEpisodeTitleFormatter.kt */
/* loaded from: classes2.dex */
public final class o implements n {
    public final Context b;
    public final l c;

    public o(Context context, l lVar) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(lVar, "seasonAndEpisodeFormatter");
        this.b = context;
        this.c = lVar;
    }

    @Override // com.amazon.aps.iva.mt.n
    public final String a(p pVar) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(pVar, "titleMetadata");
        String str = pVar.c;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = pVar.b;
        if (str3 != null) {
            str2 = str3;
        }
        String a = this.c.a(str, str2);
        if (a != null && a.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        String str4 = pVar.a;
        if (!z) {
            String string = this.b.getString(R.string.season_episode_title_format, a, str4);
            com.amazon.aps.iva.yb0.j.e(string, "{\n            context.ge…e\n            )\n        }");
            return string;
        }
        return str4;
    }

    @Override // com.amazon.aps.iva.mt.n
    public final String b(PlayableAsset playableAsset) {
        com.amazon.aps.iva.yb0.j.f(playableAsset, "asset");
        return a(f1.W(playableAsset));
    }

    @Override // com.amazon.aps.iva.mt.n
    public final String c(Panel panel) {
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        p V = f1.V(panel);
        String str = V.c;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = V.b;
        if (str3 != null) {
            str2 = str3;
        }
        return this.c.a(str, str2);
    }

    @Override // com.amazon.aps.iva.mt.n
    public final String d(Panel panel) {
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        return a(f1.V(panel));
    }
}
