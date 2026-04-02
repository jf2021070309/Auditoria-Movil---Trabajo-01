package com.worldturner.medeia.parser.type;

import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.JsonTokenLocation;
import com.worldturner.medeia.parser.builder.ValueBuilder;
import kotlin.Metadata;
/* compiled from: SingleTypes.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"Lcom/worldturner/medeia/parser/type/SingleType;", "Lcom/worldturner/medeia/parser/type/MapperType;", "()V", "createBuilder", "Lcom/worldturner/medeia/parser/builder/ValueBuilder;", "Lcom/worldturner/medeia/parser/type/StructuredType;", "token", "Lcom/worldturner/medeia/parser/JsonTokenData;", FirebaseAnalytics.Param.LOCATION, "Lcom/worldturner/medeia/parser/JsonTokenLocation;", "isComplete", "", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public abstract class SingleType extends MapperType {
    @Override // com.worldturner.medeia.parser.type.MapperType
    public ValueBuilder<? extends StructuredType> createBuilder(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        throw new UnsupportedOperationException();
    }

    @Override // com.worldturner.medeia.parser.type.MapperType
    public boolean isComplete(JsonTokenData jsonTokenData) {
        j.g(jsonTokenData, "token");
        return true;
    }
}
