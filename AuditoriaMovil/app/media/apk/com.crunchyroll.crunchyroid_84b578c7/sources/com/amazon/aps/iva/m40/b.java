package com.amazon.aps.iva.m40;

import android.content.Context;
import com.amazon.aps.iva.mt.l;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.presentation.showpage.ShowPageActivity;
/* compiled from: ShowPageCtaTextFormatter.kt */
/* loaded from: classes2.dex */
public final class b implements a {
    public final Context a;
    public final l b;

    public b(ShowPageActivity showPageActivity, l lVar) {
        j.f(showPageActivity, "context");
        this.a = showPageActivity;
        this.b = lVar;
    }

    @Override // com.amazon.aps.iva.m40.a
    public final String a(String str, String str2) {
        String a = this.b.a(str, str2);
        boolean b0 = m.b0(a);
        Context context = this.a;
        if (b0) {
            String string = context.getString(R.string.show_page_cta_watch_again);
            j.e(string, "{\n            context.ge…ing(simpleText)\n        }");
            return string;
        }
        String string2 = context.getString(R.string.show_page_cta_watch_again_format, a);
        j.e(string2, "{\n            context.ge… seasonEpisode)\n        }");
        return string2;
    }

    @Override // com.amazon.aps.iva.m40.a
    public final String b(String str, String str2) {
        String a = this.b.a(str, str2);
        boolean b0 = m.b0(a);
        Context context = this.a;
        if (b0) {
            String string = context.getString(R.string.show_page_cta_start_watching);
            j.e(string, "{\n            context.ge…ing(simpleText)\n        }");
            return string;
        }
        String string2 = context.getString(R.string.show_page_cta_start_watching_format, a);
        j.e(string2, "{\n            context.ge… seasonEpisode)\n        }");
        return string2;
    }

    @Override // com.amazon.aps.iva.m40.a
    public final String c(String str, String str2) {
        String a = this.b.a(str, str2);
        boolean b0 = m.b0(a);
        Context context = this.a;
        if (b0) {
            String string = context.getString(R.string.show_page_cta_continue_watching_simple);
            j.e(string, "{\n            context.ge…ing(simpleText)\n        }");
            return string;
        }
        String string2 = context.getString(R.string.show_page_cta_continue_watching_format, a);
        j.e(string2, "{\n            context.ge… seasonEpisode)\n        }");
        return string2;
    }
}
