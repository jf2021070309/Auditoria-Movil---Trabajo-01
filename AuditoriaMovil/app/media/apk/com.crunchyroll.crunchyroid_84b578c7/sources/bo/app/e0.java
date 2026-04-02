package bo.app;

import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;
/* loaded from: classes.dex */
public final class e0 extends BrazeConfigurationProvider {
    public static final a a = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(Context context) {
        super(context);
        com.amazon.aps.iva.yb0.j.f(context, "context");
    }

    public final long a() {
        return getIntValue(BrazeConfigurationProvider.b.DATA_SYNC_BAD_NETWORK_INTERVAL_KEY.b(), 60) * 1000;
    }

    public final long b() {
        return getIntValue(BrazeConfigurationProvider.b.DATA_SYNC_GOOD_NETWORK_INTERVAL_KEY.b(), 30) * 1000;
    }

    public final long c() {
        return getIntValue(BrazeConfigurationProvider.b.DATA_SYNC_GREAT_NETWORK_INTERVAL_KEY.b(), 10) * 1000;
    }
}
