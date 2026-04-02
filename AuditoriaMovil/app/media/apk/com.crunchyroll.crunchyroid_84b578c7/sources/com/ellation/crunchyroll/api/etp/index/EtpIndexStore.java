package com.ellation.crunchyroll.api.etp.index;

import com.ellation.crunchyroll.api.etp.index.model.EtpIndex;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
/* compiled from: EtpIndexStore.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0007\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/index/EtpIndexStore;", "", "Lcom/ellation/crunchyroll/api/etp/index/model/EtpIndex;", FirebaseAnalytics.Param.INDEX, "Lcom/amazon/aps/iva/kb0/q;", "save", "get", "invalidate", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface EtpIndexStore {
    EtpIndex get();

    void invalidate();

    void save(EtpIndex etpIndex);
}
