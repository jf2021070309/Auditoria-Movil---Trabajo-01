package com.worldturner.medeia.parser;

import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
/* compiled from: JsonTokenDataConsumer.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/worldturner/medeia/parser/JsonTokenDataConsumer;", "Lcom/worldturner/medeia/parser/JsonTokenDataAndLocationConsumer;", "Lcom/worldturner/medeia/parser/JsonTokenData;", "token", "Lcom/amazon/aps/iva/kb0/q;", "consume", "Lcom/worldturner/medeia/parser/JsonTokenLocation;", FirebaseAnalytics.Param.LOCATION, "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public interface JsonTokenDataConsumer extends JsonTokenDataAndLocationConsumer {

    /* compiled from: JsonTokenDataConsumer.kt */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static void consume(JsonTokenDataConsumer jsonTokenDataConsumer, JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
            j.g(jsonTokenData, "token");
            j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
            jsonTokenDataConsumer.consume(jsonTokenData);
        }
    }

    void consume(JsonTokenData jsonTokenData);

    @Override // com.worldturner.medeia.parser.JsonTokenDataAndLocationConsumer
    void consume(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation);
}
