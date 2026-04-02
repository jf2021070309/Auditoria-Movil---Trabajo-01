package com.ellation.crunchyroll.api.etp.account.model;

import com.amazon.aps.iva.yb0.e;
import kotlin.Metadata;
/* compiled from: MaturePreference.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/account/model/MaturePreference;", "", "(Ljava/lang/String;I)V", "MATURE_CONTENT_ENABLED", "MATURE_CONTENT_DISABLED", "Companion", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum MaturePreference {
    MATURE_CONTENT_ENABLED,
    MATURE_CONTENT_DISABLED;
    
    public static final Companion Companion = new Companion(null);

    /* compiled from: MaturePreference.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/account/model/MaturePreference$Companion;", "", "()V", "fromBoolean", "Lcom/ellation/crunchyroll/api/etp/account/model/MaturePreference;", "isMatureContentEnabled", "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final MaturePreference fromBoolean(boolean z) {
            if (z) {
                return MaturePreference.MATURE_CONTENT_ENABLED;
            }
            return MaturePreference.MATURE_CONTENT_DISABLED;
        }
    }
}
