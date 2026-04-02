package com.worldturner.medeia.parser.type;

import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.fc0.d;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.e0;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.JsonTokenDataConsumer;
import com.worldturner.medeia.parser.JsonTokenDataKt;
import com.worldturner.medeia.parser.JsonTokenLocation;
import com.worldturner.medeia.parser.builder.AlternativesBuilder;
import com.worldturner.medeia.parser.builder.ValueBuilder;
import com.worldturner.medeia.reflection.ConstructKotlinInstanceKt;
import com.worldturner.medeia.types.Alternatives;
import kotlin.Metadata;
/* compiled from: AlternativesType.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\u0018\b\u0002\u0010\u001c\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001b0\u001a¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u001a\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R'\u0010\u001c\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001b0\u001a8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/worldturner/medeia/parser/type/AlternativesType;", "Lcom/worldturner/medeia/parser/type/StructuredType;", "Lcom/worldturner/medeia/parser/JsonTokenData;", "token", "Lcom/worldturner/medeia/parser/type/AcceptKind;", "accepts", "", "isComplete", "Lcom/worldturner/medeia/parser/JsonTokenLocation;", FirebaseAnalytics.Param.LOCATION, "Lcom/worldturner/medeia/parser/builder/AlternativesBuilder;", "createBuilder", "", "createObject", "value", "Lcom/worldturner/medeia/parser/JsonTokenDataConsumer;", "consumer", "Lcom/amazon/aps/iva/kb0/q;", "write", "Lcom/worldturner/medeia/parser/type/MapperType;", "aType", "Lcom/worldturner/medeia/parser/type/MapperType;", "getAType", "()Lcom/worldturner/medeia/parser/type/MapperType;", "bType", "getBType", "Lcom/amazon/aps/iva/fc0/d;", "Lcom/worldturner/medeia/types/Alternatives;", "kotlinClass", "Lcom/amazon/aps/iva/fc0/d;", "getKotlinClass", "()Lcom/amazon/aps/iva/fc0/d;", "<init>", "(Lcom/worldturner/medeia/parser/type/MapperType;Lcom/worldturner/medeia/parser/type/MapperType;Lcom/amazon/aps/iva/fc0/d;)V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class AlternativesType extends StructuredType {
    private final MapperType aType;
    private final MapperType bType;
    private final d<? extends Alternatives<?, ?>> kotlinClass;

    public /* synthetic */ AlternativesType(MapperType mapperType, MapperType mapperType2, d dVar, int i, e eVar) {
        this(mapperType, mapperType2, (i & 4) != 0 ? e0.a(Alternatives.class) : dVar);
    }

    @Override // com.worldturner.medeia.parser.type.MapperType
    public AcceptKind accepts(JsonTokenData jsonTokenData) {
        j.g(jsonTokenData, "token");
        AcceptKind accepts = this.aType.accepts(jsonTokenData);
        if (accepts == AcceptKind.NOT_ACCEPTED) {
            return this.bType.accepts(jsonTokenData);
        }
        return accepts;
    }

    @Override // com.worldturner.medeia.parser.type.StructuredType, com.worldturner.medeia.parser.type.MapperType
    public Object createObject(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        com.amazon.aps.iva.kb0.j jVar;
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        if (this.aType.accepts(jsonTokenData) == AcceptKind.NOT_ACCEPTED) {
            jVar = new com.amazon.aps.iva.kb0.j(this.bType.createObject(jsonTokenData, jsonTokenLocation), "b");
        } else {
            jVar = new com.amazon.aps.iva.kb0.j(this.aType.createObject(jsonTokenData, jsonTokenLocation), "a");
        }
        return ConstructKotlinInstanceKt.constructKotlinInstance(this.kotlinClass, k.x(new com.amazon.aps.iva.kb0.j((String) jVar.c, jVar.b)), jsonTokenData);
    }

    public final MapperType getAType() {
        return this.aType;
    }

    public final MapperType getBType() {
        return this.bType;
    }

    public final d<? extends Alternatives<?, ?>> getKotlinClass() {
        return this.kotlinClass;
    }

    @Override // com.worldturner.medeia.parser.type.MapperType
    public boolean isComplete(JsonTokenData jsonTokenData) {
        j.g(jsonTokenData, "token");
        return jsonTokenData.getType().getLastStructureToken();
    }

    @Override // com.worldturner.medeia.parser.type.MapperType
    public void write(Object obj, JsonTokenDataConsumer jsonTokenDataConsumer) {
        j.g(jsonTokenDataConsumer, "consumer");
        if (obj == null) {
            jsonTokenDataConsumer.consume(JsonTokenDataKt.getTOKEN_NULL());
        } else if (obj instanceof Alternatives) {
            Alternatives alternatives = (Alternatives) obj;
            Object a = alternatives.getA();
            Object b = alternatives.getB();
            if (a != null) {
                this.aType.write(a, jsonTokenDataConsumer);
            }
            if (b != null) {
                this.bType.write(b, jsonTokenDataConsumer);
            }
        }
    }

    public AlternativesType(MapperType mapperType, MapperType mapperType2, d<? extends Alternatives<?, ?>> dVar) {
        j.g(mapperType, "aType");
        j.g(mapperType2, "bType");
        j.g(dVar, "kotlinClass");
        this.aType = mapperType;
        this.bType = mapperType2;
        this.kotlinClass = dVar;
    }

    @Override // com.worldturner.medeia.parser.type.MapperType
    public AlternativesBuilder createBuilder(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        com.amazon.aps.iva.kb0.j jVar;
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        if (this.aType.accepts(jsonTokenData) != AcceptKind.NOT_ACCEPTED) {
            jVar = new com.amazon.aps.iva.kb0.j(this.aType.createBuilder(jsonTokenData, jsonTokenLocation), "a");
        } else {
            jVar = new com.amazon.aps.iva.kb0.j(this.bType.createBuilder(jsonTokenData, jsonTokenLocation), "b");
        }
        String str = (String) jVar.c;
        return new AlternativesBuilder(jsonTokenLocation.getLevel(), str, (ValueBuilder) jVar.b, this);
    }
}
