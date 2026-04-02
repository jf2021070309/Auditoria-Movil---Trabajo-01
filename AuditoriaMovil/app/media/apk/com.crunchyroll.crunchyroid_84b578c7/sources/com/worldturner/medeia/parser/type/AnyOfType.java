package com.worldturner.medeia.parser.type;

import com.amazon.aps.iva.fc0.d;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.JsonTokenDataConsumer;
import com.worldturner.medeia.parser.JsonTokenDataKt;
import com.worldturner.medeia.parser.JsonTokenLocation;
import com.worldturner.medeia.parser.builder.ValueBuilder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: AnyOfType.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0016\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R'\u0010\u0016\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0014\u0012\u0004\u0012\u00020\u00150\u00138\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/worldturner/medeia/parser/type/AnyOfType;", "Lcom/worldturner/medeia/parser/type/StructuredType;", "Lcom/worldturner/medeia/parser/JsonTokenData;", "token", "Lcom/worldturner/medeia/parser/type/AcceptKind;", "accepts", "", "isComplete", "Lcom/worldturner/medeia/parser/JsonTokenLocation;", FirebaseAnalytics.Param.LOCATION, "", "createBuilder", "createObject", "", "value", "Lcom/worldturner/medeia/parser/JsonTokenDataConsumer;", "consumer", "Lcom/amazon/aps/iva/kb0/q;", "write", "", "Lcom/amazon/aps/iva/fc0/d;", "Lcom/worldturner/medeia/parser/type/MapperType;", "classMap", "Ljava/util/Map;", "getClassMap", "()Ljava/util/Map;", "<init>", "(Ljava/util/Map;)V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public class AnyOfType extends StructuredType {
    private final Map<d<?>, MapperType> classMap;

    /* JADX WARN: Multi-variable type inference failed */
    public AnyOfType(Map<d<?>, ? extends MapperType> map) {
        j.g(map, "classMap");
        this.classMap = map;
    }

    @Override // com.worldturner.medeia.parser.type.MapperType
    public AcceptKind accepts(JsonTokenData jsonTokenData) {
        j.g(jsonTokenData, "token");
        return AcceptKind.NOT_ACCEPTED;
    }

    @Override // com.worldturner.medeia.parser.type.MapperType
    public /* bridge */ /* synthetic */ ValueBuilder createBuilder(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        return (ValueBuilder) m62createBuilder(jsonTokenData, jsonTokenLocation);
    }

    public final Map<d<?>, MapperType> getClassMap() {
        return this.classMap;
    }

    @Override // com.worldturner.medeia.parser.type.MapperType
    public boolean isComplete(JsonTokenData jsonTokenData) {
        j.g(jsonTokenData, "token");
        return false;
    }

    @Override // com.worldturner.medeia.parser.type.MapperType
    public void write(Object obj, JsonTokenDataConsumer jsonTokenDataConsumer) {
        j.g(jsonTokenDataConsumer, "consumer");
        if (obj == null) {
            jsonTokenDataConsumer.consume(JsonTokenDataKt.getTOKEN_NULL());
            return;
        }
        MapperType mapperType = this.classMap.get(obj);
        if (mapperType == null) {
            Map<d<?>, MapperType> map = this.classMap;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<d<?>, MapperType> entry : map.entrySet()) {
                if (entry.getKey().f(obj)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            mapperType = (MapperType) x.s0(linkedHashMap.values());
        }
        mapperType.write(obj, jsonTokenDataConsumer);
    }

    /* renamed from: createBuilder  reason: collision with other method in class */
    public Void m62createBuilder(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        throw new UnsupportedOperationException();
    }

    @Override // com.worldturner.medeia.parser.type.StructuredType, com.worldturner.medeia.parser.type.MapperType
    public Void createObject(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        throw new UnsupportedOperationException();
    }
}
