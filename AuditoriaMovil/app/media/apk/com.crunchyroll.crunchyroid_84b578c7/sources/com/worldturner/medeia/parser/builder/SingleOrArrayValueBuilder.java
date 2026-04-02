package com.worldturner.medeia.parser.builder;

import com.amazon.aps.iva.kb0.o;
import com.amazon.aps.iva.yb0.j;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.type.MapperType;
import com.worldturner.medeia.parser.type.SingleOrArrayType;
import com.worldturner.medeia.parser.type.StructuredType;
import com.worldturner.medeia.types.SingleOrList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: SingleOrArrayValueBuilder.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001¢\u0006\u0004\b!\u0010\"J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\tH\u0016R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R(\u0010\u001c\u001a\u0004\u0018\u00010\u00172\b\u0010\u0004\u001a\u0004\u0018\u00010\u00178V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006#"}, d2 = {"Lcom/worldturner/medeia/parser/builder/SingleOrArrayValueBuilder;", "Lcom/worldturner/medeia/parser/builder/ValueBuilder;", "Lcom/worldturner/medeia/parser/type/StructuredType;", "", "value", "Lcom/amazon/aps/iva/kb0/q;", "add", "Lcom/worldturner/medeia/parser/type/MapperType;", "itemType", "Lcom/worldturner/medeia/parser/JsonTokenData;", "token", "", "completed", "lastToken", "createValue", "single", "Z", "getSingle", "()Z", "builder", "Lcom/worldturner/medeia/parser/builder/ValueBuilder;", "getBuilder", "()Lcom/worldturner/medeia/parser/builder/ValueBuilder;", "", "getCurrentProperty", "()Ljava/lang/String;", "setCurrentProperty", "(Ljava/lang/String;)V", "currentProperty", "", "startLevel", "Lcom/worldturner/medeia/parser/type/SingleOrArrayType;", "type", "<init>", "(ILcom/worldturner/medeia/parser/type/SingleOrArrayType;ZLcom/worldturner/medeia/parser/builder/ValueBuilder;)V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class SingleOrArrayValueBuilder extends ValueBuilder<StructuredType> {
    private final ValueBuilder<? extends StructuredType> builder;
    private final boolean single;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleOrArrayValueBuilder(int i, SingleOrArrayType singleOrArrayType, boolean z, ValueBuilder<? extends StructuredType> valueBuilder) {
        super(i, singleOrArrayType);
        j.g(singleOrArrayType, "type");
        j.g(valueBuilder, "builder");
        this.single = z;
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
        if (this.single) {
            return new SingleOrList(this.builder.createValue(jsonTokenData), null, 2, null);
        }
        Object createValue = this.builder.createValue(jsonTokenData);
        if (createValue != null) {
            return new SingleOrList(null, (List) createValue, 1, null);
        }
        throw new o("null cannot be cast to non-null type kotlin.collections.List<*>");
    }

    public final ValueBuilder<? extends StructuredType> getBuilder() {
        return this.builder;
    }

    @Override // com.worldturner.medeia.parser.builder.ValueBuilder
    public String getCurrentProperty() {
        return this.builder.getCurrentProperty();
    }

    public final boolean getSingle() {
        return this.single;
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
