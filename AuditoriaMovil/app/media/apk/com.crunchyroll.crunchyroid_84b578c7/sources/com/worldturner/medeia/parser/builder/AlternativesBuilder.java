package com.worldturner.medeia.parser.builder;

import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.yb0.j;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.type.AlternativesType;
import com.worldturner.medeia.parser.type.MapperType;
import com.worldturner.medeia.parser.type.StructuredType;
import com.worldturner.medeia.reflection.ConstructKotlinInstanceKt;
import kotlin.Metadata;
/* compiled from: AlternativesBuilder.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0001\u0012\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\tH\u0016R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u00018\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R(\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u001b¨\u0006\""}, d2 = {"Lcom/worldturner/medeia/parser/builder/AlternativesBuilder;", "Lcom/worldturner/medeia/parser/builder/ValueBuilder;", "Lcom/worldturner/medeia/parser/type/AlternativesType;", "", "value", "Lcom/amazon/aps/iva/kb0/q;", "add", "Lcom/worldturner/medeia/parser/type/MapperType;", "itemType", "Lcom/worldturner/medeia/parser/JsonTokenData;", "token", "", "completed", "lastToken", "createValue", "", "kotlinProperty", "Ljava/lang/String;", "getKotlinProperty", "()Ljava/lang/String;", "Lcom/worldturner/medeia/parser/type/StructuredType;", "builder", "Lcom/worldturner/medeia/parser/builder/ValueBuilder;", "getBuilder", "()Lcom/worldturner/medeia/parser/builder/ValueBuilder;", "getCurrentProperty", "setCurrentProperty", "(Ljava/lang/String;)V", "currentProperty", "", "startLevel", "type", "<init>", "(ILjava/lang/String;Lcom/worldturner/medeia/parser/builder/ValueBuilder;Lcom/worldturner/medeia/parser/type/AlternativesType;)V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class AlternativesBuilder extends ValueBuilder<AlternativesType> {
    private final ValueBuilder<? extends StructuredType> builder;
    private final String kotlinProperty;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlternativesBuilder(int i, String str, ValueBuilder<? extends StructuredType> valueBuilder, AlternativesType alternativesType) {
        super(i, alternativesType);
        j.g(str, "kotlinProperty");
        j.g(valueBuilder, "builder");
        j.g(alternativesType, "type");
        this.kotlinProperty = str;
        this.builder = valueBuilder;
    }

    @Override // com.worldturner.medeia.parser.builder.ValueBuilder
    /* renamed from: add */
    public void mo61add(Object obj) {
        this.builder.mo61add(obj);
    }

    @Override // com.worldturner.medeia.parser.builder.ValueBuilder
    public boolean completed(JsonTokenData jsonTokenData) {
        j.g(jsonTokenData, "token");
        return this.builder.completed(jsonTokenData);
    }

    @Override // com.worldturner.medeia.parser.builder.ValueBuilder
    public Object createValue(JsonTokenData jsonTokenData) {
        j.g(jsonTokenData, "lastToken");
        return ConstructKotlinInstanceKt.constructKotlinInstance(getType().getKotlinClass(), k.x(new com.amazon.aps.iva.kb0.j(this.kotlinProperty, this.builder.createValue(jsonTokenData))), jsonTokenData);
    }

    public final ValueBuilder<? extends StructuredType> getBuilder() {
        return this.builder;
    }

    @Override // com.worldturner.medeia.parser.builder.ValueBuilder
    public String getCurrentProperty() {
        return this.builder.getCurrentProperty();
    }

    public final String getKotlinProperty() {
        return this.kotlinProperty;
    }

    @Override // com.worldturner.medeia.parser.builder.ValueBuilder
    public MapperType itemType() {
        return this.builder.itemType();
    }

    @Override // com.worldturner.medeia.parser.builder.ValueBuilder
    public void setCurrentProperty(String str) {
        this.builder.setCurrentProperty(str);
    }
}
