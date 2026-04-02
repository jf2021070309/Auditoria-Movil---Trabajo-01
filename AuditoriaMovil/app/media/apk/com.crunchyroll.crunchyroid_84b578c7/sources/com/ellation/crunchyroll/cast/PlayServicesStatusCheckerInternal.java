package com.ellation.crunchyroll.cast;

import android.content.Context;
import com.amazon.aps.iva.ye.i;
import kotlin.Metadata;
/* compiled from: PlayServicesStatusCheckerImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/ellation/crunchyroll/cast/PlayServicesStatusCheckerInternal;", "Lcom/amazon/aps/iva/ye/i;", "Holder", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface PlayServicesStatusCheckerInternal extends i {

    /* compiled from: PlayServicesStatusCheckerImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/ellation/crunchyroll/cast/PlayServicesStatusCheckerInternal$Holder;", "", "Lcom/amazon/aps/iva/ye/i;", "get", "<init>", "()V", "cast_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Holder {
        public static final int $stable = 0;
        public static final Holder INSTANCE = new Holder();

        private Holder() {
        }

        public static final i get() {
            return PlayServicesStatusCheckerImpl.INSTANCE;
        }
    }

    /* synthetic */ boolean arePlayServicesAvailable(int i);

    /* synthetic */ int getPlayServicesAvailabilityStatus(Context context);

    @Override // com.amazon.aps.iva.ye.i
    /* synthetic */ boolean isCastApiAvailable();
}
