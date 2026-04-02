package com.worldturner.medeia.parser;

import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.parser.JsonTokenDataConsumer;
import kotlin.Metadata;
/* compiled from: JsonTokenDataConsumer.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H&¨\u0006\u0005"}, d2 = {"Lcom/worldturner/medeia/parser/JsonTokenDataBuilder;", "Lcom/worldturner/medeia/parser/JsonTokenDataAndLocationBuilder;", "Lcom/worldturner/medeia/parser/JsonTokenDataConsumer;", "takeResult", "", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public interface JsonTokenDataBuilder extends JsonTokenDataAndLocationBuilder, JsonTokenDataConsumer {

    /* compiled from: JsonTokenDataConsumer.kt */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static void consume(JsonTokenDataBuilder jsonTokenDataBuilder, JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
            j.g(jsonTokenData, "token");
            j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
            JsonTokenDataConsumer.DefaultImpls.consume(jsonTokenDataBuilder, jsonTokenData, jsonTokenLocation);
        }
    }

    @Override // com.worldturner.medeia.parser.JsonTokenDataAndLocationBuilder
    Object takeResult();
}
