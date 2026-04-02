package com.ellation.crunchyroll.cast;

import android.app.UiModeManager;
import android.content.Context;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.cast.CastFeature;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.common.GoogleApiAvailability;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PlayServicesStatusCheckerImpl.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t¨\u0006\f"}, d2 = {"Lcom/ellation/crunchyroll/cast/PlayServicesStatusCheckerImpl;", "Lcom/ellation/crunchyroll/cast/PlayServicesStatusCheckerInternal;", "()V", "arePlayServicesAvailable", "", "status", "", "getPlayServicesAvailabilityStatus", "context", "Landroid/content/Context;", "isCastApiAvailable", "isNotTv", "cast_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlayServicesStatusCheckerImpl implements PlayServicesStatusCheckerInternal {
    public static final PlayServicesStatusCheckerImpl INSTANCE = new PlayServicesStatusCheckerImpl();

    private PlayServicesStatusCheckerImpl() {
    }

    @Override // com.ellation.crunchyroll.cast.PlayServicesStatusCheckerInternal
    public boolean arePlayServicesAvailable(int i) {
        if (i == 0) {
            return true;
        }
        return false;
    }

    @Override // com.ellation.crunchyroll.cast.PlayServicesStatusCheckerInternal
    public int getPlayServicesAvailabilityStatus(Context context) {
        j.f(context, "context");
        return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
    }

    @Override // com.ellation.crunchyroll.cast.PlayServicesStatusCheckerInternal, com.amazon.aps.iva.ye.i
    public boolean isCastApiAvailable() {
        boolean z;
        CastFeature.Companion companion = CastFeature.Companion;
        if (isNotTv(companion.getDependencies$cast_release().getContext()) && arePlayServicesAvailable(getPlayServicesAvailabilityStatus(companion.getDependencies$cast_release().getContext()))) {
            z = true;
        } else {
            z = false;
        }
        try {
            CastContext.getSharedInstance(companion.getDependencies$cast_release().getContext());
            return z;
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean isNotTv(Context context) {
        j.f(context, "context");
        Object systemService = context.getSystemService("uimode");
        j.d(systemService, "null cannot be cast to non-null type android.app.UiModeManager");
        if (((UiModeManager) systemService).getCurrentModeType() != 4) {
            return true;
        }
        return false;
    }
}
