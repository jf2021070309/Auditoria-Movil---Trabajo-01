package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.StringUtils;
import java.util.EnumSet;
/* loaded from: classes.dex */
public final class w4 {
    public static final a b = new a(null);
    private final SharedPreferences a;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        private a() {
        }
    }

    public w4(Context context, String str, String str2) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(str, "userId");
        com.amazon.aps.iva.yb0.j.f(str2, "apiKey");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.braze.storage.sdk_metadata_cache" + StringUtils.getCacheFileSuffix(context, str, str2), 0);
        com.amazon.aps.iva.yb0.j.e(sharedPreferences, "context.getSharedPrefere…y), Context.MODE_PRIVATE)");
        this.a = sharedPreferences;
    }

    public final void a(EnumSet enumSet) {
        com.amazon.aps.iva.yb0.j.f(enumSet, "sdkMetadata");
        this.a.edit().putStringSet("tags", com.braze.support.c.a(enumSet)).apply();
    }

    public final EnumSet b(EnumSet enumSet) {
        com.amazon.aps.iva.yb0.j.f(enumSet, "newSdkMetadata");
        if (com.amazon.aps.iva.yb0.j.a(com.braze.support.c.a(enumSet), this.a.getStringSet("tags", com.amazon.aps.iva.lb0.b0.b))) {
            return null;
        }
        return enumSet;
    }
}
