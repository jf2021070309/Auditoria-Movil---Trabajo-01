package com.worldturner.medeia.parser.type;

import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.JsonTokenDataConsumer;
import com.worldturner.medeia.parser.JsonTokenLocation;
import com.worldturner.medeia.parser.JsonTokenType;
import com.worldturner.medeia.reflection.ConvertTypeKt;
import kotlin.Metadata;
/* compiled from: SingleTypes.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¨\u0006\u0013"}, d2 = {"Lcom/worldturner/medeia/parser/type/BooleanType;", "Lcom/worldturner/medeia/parser/type/SingleType;", "Lcom/worldturner/medeia/parser/JsonTokenData;", "token", "Lcom/worldturner/medeia/parser/type/AcceptKind;", "accepts", "Lcom/worldturner/medeia/parser/JsonTokenLocation;", FirebaseAnalytics.Param.LOCATION, "", "createObject", "(Lcom/worldturner/medeia/parser/JsonTokenData;Lcom/worldturner/medeia/parser/JsonTokenLocation;)Ljava/lang/Boolean;", "", "value", "Lcom/worldturner/medeia/parser/JsonTokenDataConsumer;", "consumer", "Lcom/amazon/aps/iva/kb0/q;", "write", "<init>", "()V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class BooleanType extends SingleType {
    public static final BooleanType INSTANCE = new BooleanType();

    private BooleanType() {
    }

    @Override // com.worldturner.medeia.parser.type.MapperType
    public AcceptKind accepts(JsonTokenData jsonTokenData) {
        j.g(jsonTokenData, "token");
        if (jsonTokenData.getType().getBooleanToken()) {
            return AcceptKind.SINGLE;
        }
        return AcceptKind.NOT_ACCEPTED;
    }

    @Override // com.worldturner.medeia.parser.type.MapperType
    public void write(Object obj, JsonTokenDataConsumer jsonTokenDataConsumer) {
        j.g(jsonTokenDataConsumer, "consumer");
        jsonTokenDataConsumer.consume(ConvertTypeKt.convertType(obj, JsonTokenType.VALUE_BOOLEAN_TRUE));
    }

    @Override // com.worldturner.medeia.parser.type.MapperType
    public Boolean createObject(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        return Boolean.valueOf(jsonTokenData.toBoolean());
    }
}
