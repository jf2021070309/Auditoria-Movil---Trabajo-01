package com.worldturner.medeia.parser.builder;

import com.amazon.aps.iva.yb0.j;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.type.MapperType;
import com.worldturner.medeia.parser.type.ObjectType;
import com.worldturner.medeia.pointer.JsonPointer;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: ObjectValueBuilder.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010#\u001a\u00020\"\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010$\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\tH\u0016R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R0\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006'"}, d2 = {"Lcom/worldturner/medeia/parser/builder/ObjectValueBuilder;", "Lcom/worldturner/medeia/parser/builder/ValueBuilder;", "Lcom/worldturner/medeia/parser/type/ObjectType;", "", "value", "Lcom/amazon/aps/iva/kb0/q;", "add", "Lcom/worldturner/medeia/parser/type/MapperType;", "itemType", "Lcom/worldturner/medeia/parser/JsonTokenData;", "token", "", "completed", "lastToken", "createValue", "", "currentProperty", "Ljava/lang/String;", "getCurrentProperty", "()Ljava/lang/String;", "setCurrentProperty", "(Ljava/lang/String;)V", "", "map", "Ljava/util/Map;", "getMap", "()Ljava/util/Map;", "setMap", "(Ljava/util/Map;)V", "Lcom/worldturner/medeia/pointer/JsonPointer;", "pointer", "Lcom/worldturner/medeia/pointer/JsonPointer;", "getPointer", "()Lcom/worldturner/medeia/pointer/JsonPointer;", "", "startLevel", "type", "<init>", "(ILcom/worldturner/medeia/pointer/JsonPointer;Lcom/worldturner/medeia/parser/type/ObjectType;)V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class ObjectValueBuilder extends ValueBuilder<ObjectType> {
    private String currentProperty;
    private Map<String, Object> map;
    private final JsonPointer pointer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObjectValueBuilder(int i, JsonPointer jsonPointer, ObjectType objectType) {
        super(i, objectType);
        j.g(objectType, "type");
        this.pointer = jsonPointer;
        this.map = new LinkedHashMap();
    }

    @Override // com.worldturner.medeia.parser.builder.ValueBuilder
    /* renamed from: add */
    public void mo61add(Object obj) {
        Map<String, Object> map = this.map;
        String currentProperty = getCurrentProperty();
        if (currentProperty != null) {
            map.put(currentProperty, obj);
            setCurrentProperty(null);
            return;
        }
        j.l();
        throw null;
    }

    @Override // com.worldturner.medeia.parser.builder.ValueBuilder
    public boolean completed(JsonTokenData jsonTokenData) {
        j.g(jsonTokenData, "token");
        return getType().isComplete(jsonTokenData);
    }

    @Override // com.worldturner.medeia.parser.builder.ValueBuilder
    public Object createValue(JsonTokenData jsonTokenData) {
        j.g(jsonTokenData, "lastToken");
        return getType().createValue(jsonTokenData, this.pointer, this.map);
    }

    @Override // com.worldturner.medeia.parser.builder.ValueBuilder
    public String getCurrentProperty() {
        return this.currentProperty;
    }

    public final Map<String, Object> getMap() {
        return this.map;
    }

    public final JsonPointer getPointer() {
        return this.pointer;
    }

    @Override // com.worldturner.medeia.parser.builder.ValueBuilder
    public MapperType itemType() {
        ObjectType type = getType();
        String currentProperty = getCurrentProperty();
        if (currentProperty != null) {
            return type.itemType(currentProperty);
        }
        j.l();
        throw null;
    }

    @Override // com.worldturner.medeia.parser.builder.ValueBuilder
    public void setCurrentProperty(String str) {
        this.currentProperty = str;
    }

    public final void setMap(Map<String, Object> map) {
        j.g(map, "<set-?>");
        this.map = map;
    }
}
