package com.worldturner.medeia.parser.type;

import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.JsonTokenDataConsumer;
import com.worldturner.medeia.parser.JsonTokenLocation;
import com.worldturner.medeia.parser.builder.ValueBuilder;
import kotlin.Metadata;
/* compiled from: ReferenceType.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001a\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/worldturner/medeia/parser/type/ReferenceType;", "Lcom/worldturner/medeia/parser/type/MapperType;", "Lcom/worldturner/medeia/parser/JsonTokenData;", "token", "Lcom/worldturner/medeia/parser/type/AcceptKind;", "accepts", "Lcom/worldturner/medeia/parser/JsonTokenLocation;", FirebaseAnalytics.Param.LOCATION, "Lcom/worldturner/medeia/parser/builder/ValueBuilder;", "Lcom/worldturner/medeia/parser/type/StructuredType;", "createBuilder", "", "createObject", "", "isComplete", "value", "Lcom/worldturner/medeia/parser/JsonTokenDataConsumer;", "consumer", "Lcom/amazon/aps/iva/kb0/q;", "write", "delegateField", "Lcom/worldturner/medeia/parser/type/MapperType;", "Lkotlin/Function0;", "typeReference", "Lcom/amazon/aps/iva/xb0/a;", "getTypeReference", "()Lcom/amazon/aps/iva/xb0/a;", "getDelegate", "()Lcom/worldturner/medeia/parser/type/MapperType;", "delegate", "<init>", "(Lcom/amazon/aps/iva/xb0/a;)V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public class ReferenceType extends MapperType {
    private MapperType delegateField;
    private final a<MapperType> typeReference;

    /* JADX WARN: Multi-variable type inference failed */
    public ReferenceType(a<? extends MapperType> aVar) {
        j.g(aVar, "typeReference");
        this.typeReference = aVar;
    }

    @Override // com.worldturner.medeia.parser.type.MapperType
    public AcceptKind accepts(JsonTokenData jsonTokenData) {
        j.g(jsonTokenData, "token");
        return getDelegate().accepts(jsonTokenData);
    }

    @Override // com.worldturner.medeia.parser.type.MapperType
    public ValueBuilder<? extends StructuredType> createBuilder(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        return getDelegate().createBuilder(jsonTokenData, jsonTokenLocation);
    }

    @Override // com.worldturner.medeia.parser.type.MapperType
    public Object createObject(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        return getDelegate().createObject(jsonTokenData, jsonTokenLocation);
    }

    public final MapperType getDelegate() {
        if (this.delegateField == null) {
            this.delegateField = this.typeReference.invoke();
        }
        MapperType mapperType = this.delegateField;
        if (mapperType != null) {
            return mapperType;
        }
        j.l();
        throw null;
    }

    public final a<MapperType> getTypeReference() {
        return this.typeReference;
    }

    @Override // com.worldturner.medeia.parser.type.MapperType
    public boolean isComplete(JsonTokenData jsonTokenData) {
        j.g(jsonTokenData, "token");
        return getDelegate().isComplete(jsonTokenData);
    }

    @Override // com.worldturner.medeia.parser.type.MapperType
    public void write(Object obj, JsonTokenDataConsumer jsonTokenDataConsumer) {
        j.g(jsonTokenDataConsumer, "consumer");
        getDelegate().write(obj, jsonTokenDataConsumer);
    }
}
