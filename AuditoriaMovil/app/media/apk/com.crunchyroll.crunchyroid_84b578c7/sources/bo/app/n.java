package bo.app;

import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.location.IBrazeLocationApi;
import java.util.EnumSet;
/* loaded from: classes.dex */
public final class n {
    private IBrazeLocationApi a;

    public n(Context context, EnumSet enumSet, BrazeConfigurationProvider brazeConfigurationProvider) {
        IBrazeLocationApi iBrazeLocationApi;
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(enumSet, "allowedProviders");
        com.amazon.aps.iva.yb0.j.f(brazeConfigurationProvider, "appConfigurationProvider");
        try {
            Object newInstance = Class.forName("com.braze.location.BrazeInternalLocationApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            com.amazon.aps.iva.yb0.j.d(newInstance, "null cannot be cast to non-null type com.braze.location.IBrazeLocationApi");
            iBrazeLocationApi = (IBrazeLocationApi) newInstance;
        } catch (Exception unused) {
            iBrazeLocationApi = null;
        }
        this.a = iBrazeLocationApi;
        if (iBrazeLocationApi != null) {
            iBrazeLocationApi.initWithContext(context, enumSet, brazeConfigurationProvider);
        }
    }

    public final boolean a() {
        return this.a != null;
    }

    public final boolean a(com.amazon.aps.iva.xb0.l lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "manualLocationUpdateCallback");
        IBrazeLocationApi iBrazeLocationApi = this.a;
        if (iBrazeLocationApi != null) {
            return iBrazeLocationApi.requestSingleLocationUpdate(lVar);
        }
        return false;
    }
}
