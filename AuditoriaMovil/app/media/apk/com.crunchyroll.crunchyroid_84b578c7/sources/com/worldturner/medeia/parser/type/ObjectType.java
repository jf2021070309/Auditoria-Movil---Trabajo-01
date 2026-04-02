package com.worldturner.medeia.parser.type;

import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.fc0.d;
import com.amazon.aps.iva.fc0.g;
import com.amazon.aps.iva.fc0.n;
import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.lb0.h0;
import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.ne0.e;
import com.amazon.aps.iva.ne0.f;
import com.amazon.aps.iva.ne0.q;
import com.amazon.aps.iva.ne0.s;
import com.amazon.aps.iva.ne0.u;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.JsonTokenDataConsumer;
import com.worldturner.medeia.parser.JsonTokenDataKt;
import com.worldturner.medeia.parser.JsonTokenLocation;
import com.worldturner.medeia.parser.JsonTokenType;
import com.worldturner.medeia.parser.builder.ObjectValueBuilder;
import com.worldturner.medeia.pointer.JsonPointer;
import com.worldturner.medeia.reflection.ConstructKotlinInstanceKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: ObjectType.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001Bg\u0012\n\u0010%\u001a\u0006\u0012\u0002\b\u00030$\u0012\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001f0=\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u00101\u001a\u00020\u0014\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u00109\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001108\u0018\u000107¢\u0006\u0004\b?\u0010@J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016J \u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J4\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00112\u001c\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u0011\u0012\u0002\b\u00030\u001c0\u001b2\u0006\u0010\u0018\u001a\u00020\u0017R#\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001f0\u001b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010%\u001a\u0006\u0012\u0002\b\u00030$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010)\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010-\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u00101\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0019\u00105\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b5\u0010.\u001a\u0004\b6\u00100R%\u00109\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001108\u0018\u0001078\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006A"}, d2 = {"Lcom/worldturner/medeia/parser/type/ObjectType;", "Lcom/worldturner/medeia/parser/type/StructuredType;", "", "propertyName", "Lcom/worldturner/medeia/parser/type/MapperType;", "itemType", "Lcom/worldturner/medeia/parser/JsonTokenData;", "token", "Lcom/worldturner/medeia/parser/type/AcceptKind;", "accepts", "Lcom/worldturner/medeia/parser/JsonTokenLocation;", FirebaseAnalytics.Param.LOCATION, "Lcom/worldturner/medeia/parser/builder/ObjectValueBuilder;", "createBuilder", "lastToken", "Lcom/worldturner/medeia/pointer/JsonPointer;", "pointer", "", "input", "createValue", "", "isComplete", "value", "Lcom/worldturner/medeia/parser/JsonTokenDataConsumer;", "consumer", "Lcom/amazon/aps/iva/kb0/q;", "write", "", "Lcom/amazon/aps/iva/fc0/n;", "kotlinProperties", "writeObject", "Lcom/worldturner/medeia/parser/type/PropertyType;", "propertyTypeMap", "Ljava/util/Map;", "getPropertyTypeMap", "()Ljava/util/Map;", "Lcom/amazon/aps/iva/fc0/d;", "kotlinClass", "Lcom/amazon/aps/iva/fc0/d;", "getKotlinClass", "()Lcom/amazon/aps/iva/fc0/d;", "additionalPropertiesType", "Lcom/worldturner/medeia/parser/type/MapperType;", "getAdditionalPropertiesType", "()Lcom/worldturner/medeia/parser/type/MapperType;", "kotlinAdditionalPropertiesProperty", "Ljava/lang/String;", "getKotlinAdditionalPropertiesProperty", "()Ljava/lang/String;", "ignoreAdditionalProperties", "Z", "getIgnoreAdditionalProperties", "()Z", "kotlinJsonPointerProperty", "getKotlinJsonPointerProperty", "", "Lcom/amazon/aps/iva/fc0/g;", "kotlinConstructors", "Ljava/util/Collection;", "getKotlinConstructors", "()Ljava/util/Collection;", "", "propertyTypes", "<init>", "(Lcom/amazon/aps/iva/fc0/d;Ljava/util/List;Lcom/worldturner/medeia/parser/type/MapperType;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Collection;)V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public class ObjectType extends StructuredType {
    private final MapperType additionalPropertiesType;
    private final boolean ignoreAdditionalProperties;
    private final String kotlinAdditionalPropertiesProperty;
    private final d<?> kotlinClass;
    private final Collection<g<Object>> kotlinConstructors;
    private final String kotlinJsonPointerProperty;
    private final Map<String, PropertyType> propertyTypeMap;

    public /* synthetic */ ObjectType(d dVar, List list, MapperType mapperType, String str, boolean z, String str2, Collection collection, int i, e eVar) {
        this(dVar, list, (i & 4) != 0 ? null : mapperType, (i & 8) != 0 ? null : str, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : collection);
    }

    @Override // com.worldturner.medeia.parser.type.MapperType
    public AcceptKind accepts(JsonTokenData jsonTokenData) {
        j.g(jsonTokenData, "token");
        if (jsonTokenData.getType() == JsonTokenType.START_OBJECT) {
            return AcceptKind.STRUCTURE;
        }
        return AcceptKind.NOT_ACCEPTED;
    }

    public final Object createValue(JsonTokenData jsonTokenData, JsonPointer jsonPointer, Object obj) {
        com.amazon.aps.iva.kb0.j jVar;
        Object constructKotlinInstance;
        j.g(jsonTokenData, "lastToken");
        j.g(obj, "input");
        Map map = (Map) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (true ^ this.propertyTypeMap.containsKey((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.propertyTypeMap.containsKey((String) entry2.getKey())) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        u b0 = s.b0(h0.c0(linkedHashMap2), new ObjectType$createValue$kotlinArguments$2(this));
        String str = this.kotlinAdditionalPropertiesProperty;
        com.amazon.aps.iva.kb0.j jVar2 = null;
        if (str != null) {
            jVar = new com.amazon.aps.iva.kb0.j(str, linkedHashMap);
        } else {
            jVar = null;
        }
        f e0 = s.e0(b0, jVar);
        String str2 = this.kotlinJsonPointerProperty;
        if (str2 != null) {
            jVar2 = new com.amazon.aps.iva.kb0.j(str2, jsonPointer);
        }
        com.amazon.aps.iva.ne0.e W = s.W(s.e0(e0, jVar2), q.h);
        Map linkedHashMap3 = new LinkedHashMap();
        e.a aVar = new e.a(W);
        while (aVar.hasNext()) {
            com.amazon.aps.iva.kb0.j jVar3 = (com.amazon.aps.iva.kb0.j) aVar.next();
            linkedHashMap3.put(jVar3.b, jVar3.c);
        }
        int size = linkedHashMap3.size();
        if (size != 0) {
            if (size == 1) {
                linkedHashMap3 = k.N(linkedHashMap3);
            }
        } else {
            linkedHashMap3 = a0.b;
        }
        Collection<g<Object>> collection = this.kotlinConstructors;
        if (collection == null || (constructKotlinInstance = ConstructKotlinInstanceKt.constructKotlinInstance(this.kotlinClass, collection, linkedHashMap3, jsonTokenData)) == null) {
            return ConstructKotlinInstanceKt.constructKotlinInstance(this.kotlinClass, linkedHashMap3, jsonTokenData);
        }
        return constructKotlinInstance;
    }

    public final MapperType getAdditionalPropertiesType() {
        return this.additionalPropertiesType;
    }

    public final boolean getIgnoreAdditionalProperties() {
        return this.ignoreAdditionalProperties;
    }

    public final String getKotlinAdditionalPropertiesProperty() {
        return this.kotlinAdditionalPropertiesProperty;
    }

    public final d<?> getKotlinClass() {
        return this.kotlinClass;
    }

    public final Collection<g<Object>> getKotlinConstructors() {
        return this.kotlinConstructors;
    }

    public final String getKotlinJsonPointerProperty() {
        return this.kotlinJsonPointerProperty;
    }

    public final Map<String, PropertyType> getPropertyTypeMap() {
        return this.propertyTypeMap;
    }

    @Override // com.worldturner.medeia.parser.type.MapperType
    public boolean isComplete(JsonTokenData jsonTokenData) {
        j.g(jsonTokenData, "token");
        if (jsonTokenData.getType() == JsonTokenType.END_OBJECT) {
            return true;
        }
        return false;
    }

    public final MapperType itemType(String str) {
        MapperType type;
        j.g(str, "propertyName");
        PropertyType propertyType = this.propertyTypeMap.get(str);
        if (propertyType == null || (type = propertyType.getType()) == null) {
            MapperType mapperType = this.additionalPropertiesType;
            if (mapperType == null) {
                if (this.ignoreAdditionalProperties) {
                    return UnknownType.INSTANCE;
                }
                throw new IllegalArgumentException("Unknown property ".concat(str));
            }
            return mapperType;
        }
        return type;
    }

    @Override // com.worldturner.medeia.parser.type.MapperType
    public void write(Object obj, JsonTokenDataConsumer jsonTokenDataConsumer) {
        j.g(jsonTokenDataConsumer, "consumer");
        if (obj == null) {
            jsonTokenDataConsumer.consume(JsonTokenDataKt.getTOKEN_NULL());
        } else {
            writeObject(obj, ObjectTypeKt.prepareProperties(obj), jsonTokenDataConsumer);
        }
    }

    public final void writeObject(Object obj, Map<String, ? extends n<Object, ?>> map, JsonTokenDataConsumer jsonTokenDataConsumer) {
        Object reflectProperty;
        Object obj2 = obj;
        j.g(obj2, "value");
        j.g(map, "kotlinProperties");
        j.g(jsonTokenDataConsumer, "consumer");
        jsonTokenDataConsumer.consume(JsonTokenDataKt.getTOKEN_START_OBJECT());
        for (PropertyType propertyType : this.propertyTypeMap.values()) {
            if (!propertyType.getReadOnly() && (reflectProperty = ObjectTypeKt.reflectProperty(obj2, map, propertyType.getKotlinPropertyName())) != null) {
                jsonTokenDataConsumer.consume(new JsonTokenData(JsonTokenType.FIELD_NAME, propertyType.getPropertyName(), 0L, null, null, 28, null));
                propertyType.getType().write(reflectProperty, jsonTokenDataConsumer);
            }
            obj2 = obj;
        }
        jsonTokenDataConsumer.consume(JsonTokenDataKt.getTOKEN_END_OBJECT());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ObjectType(d<?> dVar, List<PropertyType> list, MapperType mapperType, String str, boolean z, String str2, Collection<? extends g<? extends Object>> collection) {
        j.g(dVar, "kotlinClass");
        j.g(list, "propertyTypes");
        this.kotlinClass = dVar;
        this.additionalPropertiesType = mapperType;
        this.kotlinAdditionalPropertiesProperty = str;
        this.ignoreAdditionalProperties = z;
        this.kotlinJsonPointerProperty = str2;
        this.kotlinConstructors = collection;
        List<PropertyType> list2 = list;
        ArrayList arrayList = new ArrayList(r.Y(list2));
        for (PropertyType propertyType : list2) {
            arrayList.add(new com.amazon.aps.iva.kb0.j(propertyType.getPropertyName(), propertyType));
        }
        this.propertyTypeMap = i0.Z(arrayList);
    }

    @Override // com.worldturner.medeia.parser.type.MapperType
    public ObjectValueBuilder createBuilder(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        return new ObjectValueBuilder(jsonTokenLocation.getLevel(), this.kotlinJsonPointerProperty != null ? jsonTokenLocation.getPointer() : null, this);
    }
}
