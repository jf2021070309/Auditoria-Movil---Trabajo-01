package com.worldturner.medeia.parser.type;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.JsonTokenDataConsumer;
import com.worldturner.medeia.parser.JsonTokenDataKt;
import com.worldturner.medeia.parser.JsonTokenLocation;
import com.worldturner.medeia.parser.JsonTokenType;
import com.worldturner.medeia.parser.builder.ArrayValueBuilder;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: ArrayType.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\u001a\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/worldturner/medeia/parser/type/ArrayType;", "Lcom/worldturner/medeia/parser/type/StructuredType;", "Lcom/worldturner/medeia/parser/type/MapperType;", "itemType", "Lcom/worldturner/medeia/parser/JsonTokenData;", "token", "Lcom/worldturner/medeia/parser/type/AcceptKind;", "accepts", "Lcom/worldturner/medeia/parser/JsonTokenLocation;", FirebaseAnalytics.Param.LOCATION, "Lcom/worldturner/medeia/parser/builder/ArrayValueBuilder;", "createBuilder", "", "createObject", "", "isComplete", "value", "Lcom/worldturner/medeia/parser/JsonTokenDataConsumer;", "consumer", "Lcom/amazon/aps/iva/kb0/q;", "write", "Lcom/worldturner/medeia/parser/type/MapperType;", "getItemType", "()Lcom/worldturner/medeia/parser/type/MapperType;", "allowSingleValue", "Z", "getAllowSingleValue", "()Z", "<init>", "(Lcom/worldturner/medeia/parser/type/MapperType;Z)V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class ArrayType extends StructuredType {
    private final boolean allowSingleValue;
    private final MapperType itemType;

    public /* synthetic */ ArrayType(MapperType mapperType, boolean z, int i, e eVar) {
        this(mapperType, (i & 2) != 0 ? false : z);
    }

    @Override // com.worldturner.medeia.parser.type.MapperType
    public AcceptKind accepts(JsonTokenData jsonTokenData) {
        j.g(jsonTokenData, "token");
        if (jsonTokenData.getType() == JsonTokenType.START_ARRAY) {
            return AcceptKind.STRUCTURE;
        }
        if (this.allowSingleValue) {
            return this.itemType.accepts(jsonTokenData);
        }
        return AcceptKind.NOT_ACCEPTED;
    }

    @Override // com.worldturner.medeia.parser.type.StructuredType, com.worldturner.medeia.parser.type.MapperType
    public Object createObject(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        return f1.J(this.itemType.createObject(jsonTokenData, jsonTokenLocation));
    }

    public final boolean getAllowSingleValue() {
        return this.allowSingleValue;
    }

    public final MapperType getItemType() {
        return this.itemType;
    }

    @Override // com.worldturner.medeia.parser.type.MapperType
    public boolean isComplete(JsonTokenData jsonTokenData) {
        j.g(jsonTokenData, "token");
        if (jsonTokenData.getType() == JsonTokenType.END_ARRAY) {
            return true;
        }
        return false;
    }

    public final MapperType itemType() {
        return this.itemType;
    }

    @Override // com.worldturner.medeia.parser.type.MapperType
    public void write(Object obj, JsonTokenDataConsumer jsonTokenDataConsumer) {
        j.g(jsonTokenDataConsumer, "consumer");
        if (obj == null) {
            jsonTokenDataConsumer.consume(JsonTokenDataKt.getTOKEN_NULL());
        } else if (obj instanceof Collection) {
            if (this.allowSingleValue && ((Collection) obj).size() == 1) {
                this.itemType.write(x.s0((Iterable) obj), jsonTokenDataConsumer);
                return;
            }
            jsonTokenDataConsumer.consume(JsonTokenDataKt.getTOKEN_START_ARRAY());
            for (Object obj2 : (Iterable) obj) {
                this.itemType.write(obj2, jsonTokenDataConsumer);
            }
            jsonTokenDataConsumer.consume(JsonTokenDataKt.getTOKEN_END_ARRAY());
        }
    }

    public ArrayType(MapperType mapperType, boolean z) {
        j.g(mapperType, "itemType");
        this.itemType = mapperType;
        this.allowSingleValue = z;
    }

    @Override // com.worldturner.medeia.parser.type.MapperType
    public ArrayValueBuilder createBuilder(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        return new ArrayValueBuilder(jsonTokenLocation.getLevel(), this);
    }
}
