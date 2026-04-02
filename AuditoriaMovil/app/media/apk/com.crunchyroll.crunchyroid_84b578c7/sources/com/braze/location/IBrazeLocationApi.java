package com.braze.location;

import android.content.Context;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.LocationProviderName;
import com.braze.models.IBrazeLocation;
import java.util.EnumSet;
import kotlin.Metadata;
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H&J\u001c\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lcom/braze/location/IBrazeLocationApi;", "", "Landroid/content/Context;", "context", "Ljava/util/EnumSet;", "Lcom/braze/enums/LocationProviderName;", "allowedProviders", "Lcom/braze/configuration/BrazeConfigurationProvider;", "appConfigurationProvider", "Lcom/amazon/aps/iva/kb0/q;", "initWithContext", "Lkotlin/Function1;", "Lcom/braze/models/IBrazeLocation;", "manualLocationUpdateCallback", "", "requestSingleLocationUpdate", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface IBrazeLocationApi {
    void initWithContext(Context context, EnumSet<LocationProviderName> enumSet, BrazeConfigurationProvider brazeConfigurationProvider);

    boolean requestSingleLocationUpdate(l<? super IBrazeLocation, q> lVar);
}
