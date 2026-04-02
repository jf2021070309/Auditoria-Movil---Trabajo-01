package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
/* loaded from: classes.dex */
public final class j3 {
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
            return "Stored user ID is longer than 997 bytes. Truncating. Original user ID: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final c b = new c();

        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "userId is empty in updateLastUserId. Rejecting.";
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Offline user storage provider was given user ID longer than 997. Rejecting. User ID: " + this.b;
        }
    }

    public j3(Context context) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.offline.storagemap", 0);
        com.amazon.aps.iva.yb0.j.e(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.a = sharedPreferences;
    }

    public final String a() {
        String string = this.a.getString("last_user", "");
        String str = string != null ? string : "";
        if (StringUtils.getByteSize(str) > 997) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new b(str), 2, (Object) null);
            String truncateToByteLength = StringUtils.truncateToByteLength(str, 997);
            a(truncateToByteLength);
            return truncateToByteLength;
        }
        return str;
    }

    public final void a(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "userId");
        if (str.length() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, c.b, 2, (Object) null);
        } else if (StringUtils.getByteSize(str) > 997) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new d(str), 2, (Object) null);
        } else {
            SharedPreferences.Editor edit = this.a.edit();
            edit.putString("last_user", str);
            edit.apply();
        }
    }
}
