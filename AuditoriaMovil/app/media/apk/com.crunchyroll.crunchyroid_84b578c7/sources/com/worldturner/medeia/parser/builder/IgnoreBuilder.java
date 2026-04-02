package com.worldturner.medeia.parser.builder;

import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.JsonTokenDataAndLocationBuilder;
import com.worldturner.medeia.parser.JsonTokenLocation;
import kotlin.Metadata;
/* compiled from: IgnoreBuilder.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\f"}, d2 = {"Lcom/worldturner/medeia/parser/builder/IgnoreBuilder;", "Lcom/worldturner/medeia/parser/JsonTokenDataAndLocationBuilder;", "Lcom/worldturner/medeia/parser/JsonTokenData;", "token", "Lcom/worldturner/medeia/parser/JsonTokenLocation;", FirebaseAnalytics.Param.LOCATION, "Lcom/amazon/aps/iva/kb0/q;", "consume", "", "takeResult", "<init>", "()V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class IgnoreBuilder implements JsonTokenDataAndLocationBuilder {
    @Override // com.worldturner.medeia.parser.JsonTokenDataAndLocationConsumer
    public void consume(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
    }

    @Override // com.worldturner.medeia.parser.JsonTokenDataAndLocationBuilder
    public Object takeResult() {
        return null;
    }
}
