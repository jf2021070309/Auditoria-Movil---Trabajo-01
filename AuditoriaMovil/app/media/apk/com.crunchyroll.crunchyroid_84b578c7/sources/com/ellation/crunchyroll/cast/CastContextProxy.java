package com.ellation.crunchyroll.cast;

import com.google.android.gms.cast.framework.CastStateListener;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
/* compiled from: CastContextProxy.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¨\u0006\b"}, d2 = {"Lcom/ellation/crunchyroll/cast/CastContextProxy;", "", "Lcom/google/android/gms/cast/framework/CastStateListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/amazon/aps/iva/kb0/q;", "addCastStateListener", "removeCastStateListener", "Companion", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface CastContextProxy {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: CastContextProxy.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ellation/crunchyroll/cast/CastContextProxy$Companion;", "", "()V", "get", "Lcom/ellation/crunchyroll/cast/CastContextProxy;", "cast_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final CastContextProxy get() {
            return CastContextProxyImpl.INSTANCE;
        }
    }

    void addCastStateListener(CastStateListener castStateListener);

    void removeCastStateListener(CastStateListener castStateListener);
}
