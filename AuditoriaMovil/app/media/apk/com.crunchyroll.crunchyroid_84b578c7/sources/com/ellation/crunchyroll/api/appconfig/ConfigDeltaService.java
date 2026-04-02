package com.ellation.crunchyroll.api.appconfig;

import com.amazon.aps.iva.lf0.f;
import com.amazon.aps.iva.lf0.s;
import com.amazon.aps.iva.lf0.t;
import com.amazon.aps.iva.ob0.d;
import com.google.gson.JsonObject;
import kotlin.Metadata;
/* compiled from: ConfigDeltaService.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J'\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/ellation/crunchyroll/api/appconfig/ConfigDeltaService;", "", "", "appId", "appVersion", "Lcom/google/gson/JsonObject;", "getConfigDelta", "(Ljava/lang/String;Ljava/lang/String;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface ConfigDeltaService {
    @f("/config-delta/v2/apps/{app_id}/config_delta")
    Object getConfigDelta(@s("app_id") String str, @t("app_version") String str2, d<? super JsonObject> dVar);
}
