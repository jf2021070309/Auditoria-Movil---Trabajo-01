package com.worldturner.medeia.parser.type;

import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.JsonTokenDataConsumer;
import com.worldturner.medeia.parser.JsonTokenLocation;
import com.worldturner.medeia.parser.JsonTokenType;
import com.worldturner.medeia.parser.builder.ArrayValueBuilder;
import com.worldturner.medeia.parser.builder.SingleOrArrayValueBuilder;
import com.worldturner.medeia.types.SingleOrList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: SingleOrArrayType.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u001a\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/worldturner/medeia/parser/type/SingleOrArrayType;", "Lcom/worldturner/medeia/parser/type/StructuredType;", "Lcom/worldturner/medeia/parser/JsonTokenData;", "token", "Lcom/worldturner/medeia/parser/type/AcceptKind;", "accepts", "", "isComplete", "Lcom/worldturner/medeia/parser/JsonTokenLocation;", FirebaseAnalytics.Param.LOCATION, "Lcom/worldturner/medeia/parser/builder/SingleOrArrayValueBuilder;", "createBuilder", "", "createObject", "value", "Lcom/worldturner/medeia/parser/JsonTokenDataConsumer;", "consumer", "Lcom/amazon/aps/iva/kb0/q;", "write", "Lcom/worldturner/medeia/parser/type/ArrayType;", "arrayType", "Lcom/worldturner/medeia/parser/type/ArrayType;", "getArrayType", "()Lcom/worldturner/medeia/parser/type/ArrayType;", "Lcom/worldturner/medeia/parser/type/MapperType;", "type", "Lcom/worldturner/medeia/parser/type/MapperType;", "getType", "()Lcom/worldturner/medeia/parser/type/MapperType;", "<init>", "(Lcom/worldturner/medeia/parser/type/MapperType;)V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class SingleOrArrayType extends StructuredType {
    private final ArrayType arrayType;
    private final MapperType type;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes4.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JsonTokenType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[JsonTokenType.START_ARRAY.ordinal()] = 1;
        }
    }

    public SingleOrArrayType(MapperType mapperType) {
        j.g(mapperType, "type");
        this.type = mapperType;
        this.arrayType = new ArrayType(mapperType, false, 2, null);
    }

    @Override // com.worldturner.medeia.parser.type.MapperType
    public AcceptKind accepts(JsonTokenData jsonTokenData) {
        j.g(jsonTokenData, "token");
        if (jsonTokenData.getType() == JsonTokenType.START_ARRAY) {
            return AcceptKind.STRUCTURE;
        }
        return this.type.accepts(jsonTokenData);
    }

    @Override // com.worldturner.medeia.parser.type.StructuredType, com.worldturner.medeia.parser.type.MapperType
    public Object createObject(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        return new SingleOrList(this.type.createObject(jsonTokenData, jsonTokenLocation), null, 2, null);
    }

    public final ArrayType getArrayType() {
        return this.arrayType;
    }

    public final MapperType getType() {
        return this.type;
    }

    @Override // com.worldturner.medeia.parser.type.MapperType
    public boolean isComplete(JsonTokenData jsonTokenData) {
        j.g(jsonTokenData, "token");
        if (jsonTokenData.getType() != JsonTokenType.END_ARRAY && !this.type.isComplete(jsonTokenData)) {
            return false;
        }
        return true;
    }

    @Override // com.worldturner.medeia.parser.type.MapperType
    public void write(Object obj, JsonTokenDataConsumer jsonTokenDataConsumer) {
        j.g(jsonTokenDataConsumer, "consumer");
        if (obj instanceof SingleOrList) {
            SingleOrList singleOrList = (SingleOrList) obj;
            List list = singleOrList.getList();
            if (list != null) {
                this.arrayType.write(list, jsonTokenDataConsumer);
            }
            Object single = singleOrList.getSingle();
            if (single != null) {
                this.type.write(single, jsonTokenDataConsumer);
            }
        }
    }

    @Override // com.worldturner.medeia.parser.type.MapperType
    public SingleOrArrayValueBuilder createBuilder(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        if (WhenMappings.$EnumSwitchMapping$0[jsonTokenData.getType().ordinal()] != 1) {
            return new SingleOrArrayValueBuilder(jsonTokenLocation.getLevel(), this, true, this.type.createBuilder(jsonTokenData, jsonTokenLocation));
        }
        return new SingleOrArrayValueBuilder(jsonTokenLocation.getLevel(), this, false, new ArrayValueBuilder(jsonTokenLocation.getLevel(), this.arrayType));
    }
}
