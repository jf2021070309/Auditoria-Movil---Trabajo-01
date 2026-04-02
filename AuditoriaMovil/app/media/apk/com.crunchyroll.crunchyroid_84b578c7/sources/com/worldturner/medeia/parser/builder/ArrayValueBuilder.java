package com.worldturner.medeia.parser.builder;

import com.amazon.aps.iva.yb0.j;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.type.ArrayType;
import com.worldturner.medeia.parser.type.MapperType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ArrayValueBuilder.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\tH\u0016R\u001f\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u001a\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00148V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006 "}, d2 = {"Lcom/worldturner/medeia/parser/builder/ArrayValueBuilder;", "Lcom/worldturner/medeia/parser/builder/ValueBuilder;", "Lcom/worldturner/medeia/parser/type/ArrayType;", "", "value", "Lcom/amazon/aps/iva/kb0/q;", "add", "Lcom/worldturner/medeia/parser/type/MapperType;", "itemType", "Lcom/worldturner/medeia/parser/JsonTokenData;", "token", "", "completed", "lastToken", "createValue", "", "list", "Ljava/util/List;", "getList", "()Ljava/util/List;", "", "<anonymous parameter 0>", "getCurrentProperty", "()Ljava/lang/String;", "setCurrentProperty", "(Ljava/lang/String;)V", "currentProperty", "", "startLevel", "type", "<init>", "(ILcom/worldturner/medeia/parser/type/ArrayType;)V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class ArrayValueBuilder extends ValueBuilder<ArrayType> {
    private final List<Object> list;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArrayValueBuilder(int i, ArrayType arrayType) {
        super(i, arrayType);
        j.g(arrayType, "type");
        this.list = new ArrayList();
    }

    @Override // com.worldturner.medeia.parser.builder.ValueBuilder
    /* renamed from: add */
    public void mo61add(Object obj) {
        this.list.add(obj);
    }

    @Override // com.worldturner.medeia.parser.builder.ValueBuilder
    public boolean completed(JsonTokenData jsonTokenData) {
        j.g(jsonTokenData, "token");
        return getType().isComplete(jsonTokenData);
    }

    @Override // com.worldturner.medeia.parser.builder.ValueBuilder
    public Object createValue(JsonTokenData jsonTokenData) {
        j.g(jsonTokenData, "lastToken");
        return this.list;
    }

    @Override // com.worldturner.medeia.parser.builder.ValueBuilder
    public String getCurrentProperty() {
        throw new UnsupportedOperationException("on " + this);
    }

    public final List<Object> getList() {
        return this.list;
    }

    @Override // com.worldturner.medeia.parser.builder.ValueBuilder
    public MapperType itemType() {
        return getType().itemType();
    }

    @Override // com.worldturner.medeia.parser.builder.ValueBuilder
    public void setCurrentProperty(String str) {
        throw new UnsupportedOperationException("on " + this);
    }
}
