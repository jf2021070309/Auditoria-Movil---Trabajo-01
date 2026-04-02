package com.worldturner.medeia.parser;

import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
/* compiled from: JsonTokenDataConsumer.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/worldturner/medeia/parser/MultipleConsumer;", "Lcom/worldturner/medeia/parser/JsonTokenDataAndLocationConsumer;", "Lcom/worldturner/medeia/parser/JsonTokenData;", "token", "Lcom/worldturner/medeia/parser/JsonTokenLocation;", FirebaseAnalytics.Param.LOCATION, "Lcom/amazon/aps/iva/kb0/q;", "consume", "", "consumers", "Ljava/util/List;", "getConsumers", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class MultipleConsumer implements JsonTokenDataAndLocationConsumer {
    private final List<JsonTokenDataAndLocationConsumer> consumers;

    /* JADX WARN: Multi-variable type inference failed */
    public MultipleConsumer(List<? extends JsonTokenDataAndLocationConsumer> list) {
        j.g(list, "consumers");
        this.consumers = list;
    }

    @Override // com.worldturner.medeia.parser.JsonTokenDataAndLocationConsumer
    public void consume(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        for (JsonTokenDataAndLocationConsumer jsonTokenDataAndLocationConsumer : this.consumers) {
            jsonTokenDataAndLocationConsumer.consume(jsonTokenData, jsonTokenLocation);
        }
    }

    public final List<JsonTokenDataAndLocationConsumer> getConsumers() {
        return this.consumers;
    }
}
