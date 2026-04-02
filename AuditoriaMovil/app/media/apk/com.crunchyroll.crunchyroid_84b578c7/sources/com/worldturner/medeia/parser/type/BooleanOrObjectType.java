package com.worldturner.medeia.parser.type;

import com.amazon.aps.iva.fc0.n;
import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.lb0.o;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.JsonTokenDataConsumer;
import com.worldturner.medeia.parser.JsonTokenDataKt;
import com.worldturner.medeia.parser.JsonTokenLocation;
import com.worldturner.medeia.parser.JsonTokenType;
import com.worldturner.medeia.parser.builder.ValueBuilder;
import com.worldturner.medeia.reflection.ConstructKotlinInstanceKt;
import com.worldturner.medeia.reflection.ConvertTypeKt;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: BooleanOrObjectType.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/worldturner/medeia/parser/type/BooleanOrObjectType;", "Lcom/worldturner/medeia/parser/type/StructuredType;", "Lcom/worldturner/medeia/parser/JsonTokenData;", "token", "Lcom/worldturner/medeia/parser/type/AcceptKind;", "accepts", "Lcom/worldturner/medeia/parser/JsonTokenLocation;", FirebaseAnalytics.Param.LOCATION, "Lcom/worldturner/medeia/parser/builder/ValueBuilder;", "createBuilder", "", "isComplete", "", "createObject", "value", "Lcom/worldturner/medeia/parser/JsonTokenDataConsumer;", "consumer", "Lcom/amazon/aps/iva/kb0/q;", "write", "Lcom/worldturner/medeia/parser/type/ObjectType;", "objectType", "Lcom/worldturner/medeia/parser/type/ObjectType;", "getObjectType", "()Lcom/worldturner/medeia/parser/type/ObjectType;", "", "kotlinBooleanProperty", "Ljava/lang/String;", "getKotlinBooleanProperty", "()Ljava/lang/String;", "<init>", "(Lcom/worldturner/medeia/parser/type/ObjectType;Ljava/lang/String;)V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public class BooleanOrObjectType extends StructuredType {
    private final String kotlinBooleanProperty;
    private final ObjectType objectType;

    public BooleanOrObjectType(ObjectType objectType, String str) {
        j.g(objectType, "objectType");
        j.g(str, "kotlinBooleanProperty");
        this.objectType = objectType;
        this.kotlinBooleanProperty = str;
    }

    @Override // com.worldturner.medeia.parser.type.MapperType
    public AcceptKind accepts(JsonTokenData jsonTokenData) {
        j.g(jsonTokenData, "token");
        if (jsonTokenData.getType() == JsonTokenType.START_OBJECT) {
            return AcceptKind.STRUCTURE;
        }
        if (jsonTokenData.getType().getBooleanToken()) {
            return AcceptKind.SINGLE;
        }
        return AcceptKind.NOT_ACCEPTED;
    }

    @Override // com.worldturner.medeia.parser.type.MapperType
    public ValueBuilder<? extends StructuredType> createBuilder(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        return this.objectType.createBuilder(jsonTokenData, jsonTokenLocation);
    }

    @Override // com.worldturner.medeia.parser.type.StructuredType, com.worldturner.medeia.parser.type.MapperType
    public Object createObject(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        com.amazon.aps.iva.kb0.j jVar;
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        com.amazon.aps.iva.kb0.j[] jVarArr = new com.amazon.aps.iva.kb0.j[2];
        jVarArr[0] = new com.amazon.aps.iva.kb0.j(this.kotlinBooleanProperty, Boolean.valueOf(jsonTokenData.toBoolean()));
        String kotlinJsonPointerProperty = this.objectType.getKotlinJsonPointerProperty();
        if (kotlinJsonPointerProperty != null) {
            jVar = new com.amazon.aps.iva.kb0.j(kotlinJsonPointerProperty, jsonTokenLocation.getPointer());
        } else {
            jVar = null;
        }
        jVarArr[1] = jVar;
        return ConstructKotlinInstanceKt.constructKotlinInstance(this.objectType.getKotlinClass(), i0.Z(o.O(jVarArr)), jsonTokenData);
    }

    public final String getKotlinBooleanProperty() {
        return this.kotlinBooleanProperty;
    }

    public final ObjectType getObjectType() {
        return this.objectType;
    }

    @Override // com.worldturner.medeia.parser.type.MapperType
    public boolean isComplete(JsonTokenData jsonTokenData) {
        j.g(jsonTokenData, "token");
        return this.objectType.isComplete(jsonTokenData);
    }

    @Override // com.worldturner.medeia.parser.type.MapperType
    public void write(Object obj, JsonTokenDataConsumer jsonTokenDataConsumer) {
        j.g(jsonTokenDataConsumer, "consumer");
        if (obj == null) {
            jsonTokenDataConsumer.consume(JsonTokenDataKt.getTOKEN_NULL());
            return;
        }
        Map<String, ? extends n<Object, ?>> prepareProperties = ObjectTypeKt.prepareProperties(obj);
        Object reflectProperty = ObjectTypeKt.reflectProperty(obj, prepareProperties, this.kotlinBooleanProperty);
        if (reflectProperty == null) {
            this.objectType.writeObject(obj, prepareProperties, jsonTokenDataConsumer);
        } else {
            jsonTokenDataConsumer.consume(ConvertTypeKt.convertType(reflectProperty, JsonTokenType.VALUE_BOOLEAN_TRUE));
        }
    }
}
