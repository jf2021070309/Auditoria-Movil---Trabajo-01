package com.ellation.crunchyroll.api.etp.subscription.model;

import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
/* compiled from: SubscriptionProduct.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/subscription/model/SubscriptionProductSource;", "", "sourceName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getSourceName", "()Ljava/lang/String;", "GOOGLE_PLAY", "UNDEFINED", "Companion", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum SubscriptionProductSource {
    GOOGLE_PLAY("google-play"),
    UNDEFINED(AdError.UNDEFINED_DOMAIN);
    
    public static final Companion Companion = new Companion(null);
    private final String sourceName;

    /* compiled from: SubscriptionProduct.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/subscription/model/SubscriptionProductSource$Companion;", "", "()V", "from", "Lcom/ellation/crunchyroll/api/etp/subscription/model/SubscriptionProductSource;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final SubscriptionProductSource from(String str) {
            SubscriptionProductSource subscriptionProductSource;
            SubscriptionProductSource[] values = SubscriptionProductSource.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    subscriptionProductSource = values[i];
                    if (j.a(subscriptionProductSource.getSourceName(), str)) {
                        break;
                    }
                    i++;
                } else {
                    subscriptionProductSource = null;
                    break;
                }
            }
            if (subscriptionProductSource == null) {
                return SubscriptionProductSource.UNDEFINED;
            }
            return subscriptionProductSource;
        }
    }

    SubscriptionProductSource(String str) {
        this.sourceName = str;
    }

    public final String getSourceName() {
        return this.sourceName;
    }
}
