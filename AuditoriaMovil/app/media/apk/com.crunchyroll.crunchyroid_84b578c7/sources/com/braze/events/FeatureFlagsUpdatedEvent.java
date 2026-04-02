package com.braze.events;

import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.braze.models.FeatureFlag;
import java.util.List;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/braze/events/FeatureFlagsUpdatedEvent;", "", "", "toString", "", "Lcom/braze/models/FeatureFlag;", "featureFlags", "Ljava/util/List;", "getFeatureFlags", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "Companion", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FeatureFlagsUpdatedEvent {
    public static final Companion Companion = new Companion(null);
    private final List<FeatureFlag> featureFlags;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/braze/events/FeatureFlagsUpdatedEvent$Companion;", "", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public FeatureFlagsUpdatedEvent(List<FeatureFlag> list) {
        j.f(list, "featureFlags");
        this.featureFlags = list;
    }

    public String toString() {
        return "FeatureFlagsUpdatedEvent{flag count=" + this.featureFlags.size() + '}';
    }
}
