package androidx.media3.ui;

import android.text.Html;
import com.amazon.aps.iva.s6.q;
import com.amazon.aps.iva.u1.y;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Pattern;
/* compiled from: SpannedToHtmlConverter.java */
/* loaded from: classes.dex */
public final class e {
    public static final Pattern a = Pattern.compile("(&#13;)?&#10;");

    /* compiled from: SpannedToHtmlConverter.java */
    /* loaded from: classes.dex */
    public static class a {
        public final String a;
        public final Map<String, String> b;

        public a(String str, Map map) {
            this.a = str;
            this.b = map;
        }
    }

    /* compiled from: SpannedToHtmlConverter.java */
    /* loaded from: classes.dex */
    public static final class b {
        public static final q e = new q(1);
        public static final y f = new y(4);
        public final int a;
        public final int b;
        public final String c;
        public final String d;

        public b(int i, int i2, String str, String str2) {
            this.a = i;
            this.b = i2;
            this.c = str;
            this.d = str2;
        }
    }

    /* compiled from: SpannedToHtmlConverter.java */
    /* loaded from: classes.dex */
    public static final class c {
        public final ArrayList a = new ArrayList();
        public final ArrayList b = new ArrayList();
    }

    public static String a(CharSequence charSequence) {
        return a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
