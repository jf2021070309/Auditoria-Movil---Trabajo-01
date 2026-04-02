package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
/* loaded from: classes.dex */
public final class u4 {
    public static final a e = new a(null);
    private final Context a;
    private final String b;
    private final String c;
    private final SharedPreferences d;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Setting signature to: " + this.b;
        }
    }

    public u4(Context context, String str, String str2) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = context.getSharedPreferences("com.braze.storage.sdk_auth_cache" + StringUtils.getCacheFileSuffix(context, str, str2), 0);
    }

    public final String a() {
        return this.d.getString("auth_signature", null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4)) {
            return false;
        }
        u4 u4Var = (u4) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, u4Var.a) && com.amazon.aps.iva.yb0.j.a(this.b, u4Var.b) && com.amazon.aps.iva.yb0.j.a(this.c, u4Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.b;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SdkAuthenticationCache(context=");
        sb.append(this.a);
        sb.append(", userId=");
        sb.append(this.b);
        sb.append(", apiKey=");
        return com.amazon.aps.iva.o0.t1.b(sb, this.c, ')');
    }

    public final void a(String str) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new b(str), 2, (Object) null);
        this.d.edit().putString("auth_signature", str).apply();
    }
}
