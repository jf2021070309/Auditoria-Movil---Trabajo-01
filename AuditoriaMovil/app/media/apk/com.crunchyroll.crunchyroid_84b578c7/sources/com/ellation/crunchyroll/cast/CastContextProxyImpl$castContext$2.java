package com.ellation.crunchyroll.cast;

import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.google.android.gms.cast.framework.CastContext;
import kotlin.Metadata;
/* compiled from: CastContextProxy.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/google/android/gms/cast/framework/CastContext;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CastContextProxyImpl$castContext$2 extends l implements com.amazon.aps.iva.xb0.a<CastContext> {
    public static final CastContextProxyImpl$castContext$2 INSTANCE = new CastContextProxyImpl$castContext$2();

    public CastContextProxyImpl$castContext$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.aps.iva.xb0.a
    public final CastContext invoke() {
        CastContext sharedInstance = CastContext.getSharedInstance(CastFeature.Companion.getDependencies$cast_release().getContext());
        j.e(sharedInstance, "getSharedInstance(dependencies.context)");
        return sharedInstance;
    }
}
