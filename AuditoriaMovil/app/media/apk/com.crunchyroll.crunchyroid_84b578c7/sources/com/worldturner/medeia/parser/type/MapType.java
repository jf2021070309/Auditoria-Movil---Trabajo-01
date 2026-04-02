package com.worldturner.medeia.parser.type;

import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.JsonTokenDataConsumer;
import com.worldturner.medeia.parser.JsonTokenDataKt;
import com.worldturner.medeia.parser.JsonTokenLocation;
import com.worldturner.medeia.parser.JsonTokenType;
import com.worldturner.medeia.parser.builder.MapValueBuilder;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: MapType.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J$\u0010\u0013\u001a\u00020\u00102\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00122\u0006\u0010\u000f\u001a\u00020\u000eR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/worldturner/medeia/parser/type/MapType;", "Lcom/worldturner/medeia/parser/type/StructuredType;", "Lcom/worldturner/medeia/parser/JsonTokenData;", "token", "Lcom/worldturner/medeia/parser/type/AcceptKind;", "accepts", "Lcom/worldturner/medeia/parser/JsonTokenLocation;", FirebaseAnalytics.Param.LOCATION, "Lcom/worldturner/medeia/parser/builder/MapValueBuilder;", "createBuilder", "", "isComplete", "", "value", "Lcom/worldturner/medeia/parser/JsonTokenDataConsumer;", "consumer", "Lcom/amazon/aps/iva/kb0/q;", "write", "", "writeObject", "Lcom/worldturner/medeia/parser/type/MapperType;", "propertyType", "Lcom/worldturner/medeia/parser/type/MapperType;", "getPropertyType", "()Lcom/worldturner/medeia/parser/type/MapperType;", "<init>", "(Lcom/worldturner/medeia/parser/type/MapperType;)V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class MapType extends StructuredType {
    private final MapperType propertyType;

    public MapType(MapperType mapperType) {
        j.g(mapperType, "propertyType");
        this.propertyType = mapperType;
    }

    @Override // com.worldturner.medeia.parser.type.MapperType
    public AcceptKind accepts(JsonTokenData jsonTokenData) {
        j.g(jsonTokenData, "token");
        if (jsonTokenData.getType() == JsonTokenType.START_OBJECT) {
            return AcceptKind.STRUCTURE;
        }
        return AcceptKind.NOT_ACCEPTED;
    }

    public final MapperType getPropertyType() {
        return this.propertyType;
    }

    @Override // com.worldturner.medeia.parser.type.MapperType
    public boolean isComplete(JsonTokenData jsonTokenData) {
        j.g(jsonTokenData, "token");
        if (jsonTokenData.getType() == JsonTokenType.END_OBJECT) {
            return true;
        }
        return false;
    }

    @Override // com.worldturner.medeia.parser.type.MapperType
    public void write(Object obj, JsonTokenDataConsumer jsonTokenDataConsumer) {
        j.g(jsonTokenDataConsumer, "consumer");
        if (obj == null) {
            jsonTokenDataConsumer.consume(JsonTokenDataKt.getTOKEN_NULL());
        } else if (obj instanceof Map) {
            writeObject((Map) obj, jsonTokenDataConsumer);
        }
    }

    public final void writeObject(Map<Object, ? extends Object> map, JsonTokenDataConsumer jsonTokenDataConsumer) {
        j.g(map, "value");
        j.g(jsonTokenDataConsumer, "consumer");
        jsonTokenDataConsumer.consume(JsonTokenDataKt.getTOKEN_START_OBJECT());
        for (Map.Entry<Object, ? extends Object> entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                jsonTokenDataConsumer.consume(JsonTokenDataKt.getTOKEN_NULL());
            } else {
                jsonTokenDataConsumer.consume(new JsonTokenData(JsonTokenType.FIELD_NAME, key.toString(), 0L, null, null, 28, null));
                this.propertyType.write(value, jsonTokenDataConsumer);
            }
        }
        jsonTokenDataConsumer.consume(JsonTokenDataKt.getTOKEN_END_OBJECT());
    }

    @Override // com.worldturner.medeia.parser.type.MapperType
    public MapValueBuilder createBuilder(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        return new MapValueBuilder(jsonTokenLocation.getLevel(), this);
    }
}
