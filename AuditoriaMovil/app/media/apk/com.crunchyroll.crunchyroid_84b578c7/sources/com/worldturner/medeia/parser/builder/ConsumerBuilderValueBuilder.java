package com.worldturner.medeia.parser.builder;

import com.amazon.aps.iva.yb0.j;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.JsonTokenDataAndLocationBuilder;
import com.worldturner.medeia.parser.type.MapperType;
import com.worldturner.medeia.parser.type.SimpleTreeType;
import kotlin.Metadata;
/* compiled from: ConsumerBuilderValueBuilder.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001a\u001a\u00020\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR(\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/worldturner/medeia/parser/builder/ConsumerBuilderValueBuilder;", "Lcom/worldturner/medeia/parser/builder/ValueBuilder;", "Lcom/worldturner/medeia/parser/type/SimpleTreeType;", "startLevel", "", "consumerBuilder", "Lcom/worldturner/medeia/parser/JsonTokenDataAndLocationBuilder;", "(ILcom/worldturner/medeia/parser/JsonTokenDataAndLocationBuilder;)V", "getConsumerBuilder", "()Lcom/worldturner/medeia/parser/JsonTokenDataAndLocationBuilder;", "<anonymous parameter 0>", "", "currentProperty", "getCurrentProperty", "()Ljava/lang/String;", "setCurrentProperty", "(Ljava/lang/String;)V", "add", "", "value", "", "completed", "", "token", "Lcom/worldturner/medeia/parser/JsonTokenData;", "createValue", "lastToken", "itemType", "Lcom/worldturner/medeia/parser/type/MapperType;", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class ConsumerBuilderValueBuilder extends ValueBuilder<SimpleTreeType> {
    private final JsonTokenDataAndLocationBuilder consumerBuilder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsumerBuilderValueBuilder(int i, JsonTokenDataAndLocationBuilder jsonTokenDataAndLocationBuilder) {
        super(i, SimpleTreeType.INSTANCE);
        j.g(jsonTokenDataAndLocationBuilder, "consumerBuilder");
        this.consumerBuilder = jsonTokenDataAndLocationBuilder;
    }

    @Override // com.worldturner.medeia.parser.builder.ValueBuilder
    public boolean completed(JsonTokenData jsonTokenData) {
        j.g(jsonTokenData, "token");
        return true;
    }

    @Override // com.worldturner.medeia.parser.builder.ValueBuilder
    public Object createValue(JsonTokenData jsonTokenData) {
        j.g(jsonTokenData, "lastToken");
        return getConsumerBuilder().takeResult();
    }

    @Override // com.worldturner.medeia.parser.builder.ValueBuilder
    public JsonTokenDataAndLocationBuilder getConsumerBuilder() {
        return this.consumerBuilder;
    }

    @Override // com.worldturner.medeia.parser.builder.ValueBuilder
    public String getCurrentProperty() {
        throw new UnsupportedOperationException("on " + this);
    }

    @Override // com.worldturner.medeia.parser.builder.ValueBuilder
    public MapperType itemType() {
        throw new UnsupportedOperationException();
    }

    @Override // com.worldturner.medeia.parser.builder.ValueBuilder
    public void setCurrentProperty(String str) {
        throw new UnsupportedOperationException("on " + this);
    }

    @Override // com.worldturner.medeia.parser.builder.ValueBuilder
    /* renamed from: add */
    public Void mo61add(Object obj) {
        throw new UnsupportedOperationException();
    }
}
