package com.ellation.crunchyroll.cast;

import com.amazon.aps.iva.kb0.e;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastStateListener;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CastContextProxy.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u001b\u0010\f\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/ellation/crunchyroll/cast/CastContextProxyImpl;", "Lcom/ellation/crunchyroll/cast/CastContextProxy;", "Lcom/google/android/gms/cast/framework/CastStateListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/amazon/aps/iva/kb0/q;", "addCastStateListener", "removeCastStateListener", "Lcom/google/android/gms/cast/framework/CastContext;", "castContext$delegate", "Lcom/amazon/aps/iva/kb0/e;", "getCastContext", "()Lcom/google/android/gms/cast/framework/CastContext;", "castContext", "<init>", "()V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CastContextProxyImpl implements CastContextProxy {
    public static final CastContextProxyImpl INSTANCE = new CastContextProxyImpl();
    private static final e castContext$delegate = f.b(CastContextProxyImpl$castContext$2.INSTANCE);

    private CastContextProxyImpl() {
    }

    @Override // com.ellation.crunchyroll.cast.CastContextProxy
    public void addCastStateListener(CastStateListener castStateListener) {
        j.f(castStateListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        getCastContext().addCastStateListener(castStateListener);
    }

    public final CastContext getCastContext() {
        return (CastContext) castContext$delegate.getValue();
    }

    @Override // com.ellation.crunchyroll.cast.CastContextProxy
    public void removeCastStateListener(CastStateListener castStateListener) {
        if (castStateListener != null) {
            INSTANCE.getCastContext().removeCastStateListener(castStateListener);
        }
    }
}
