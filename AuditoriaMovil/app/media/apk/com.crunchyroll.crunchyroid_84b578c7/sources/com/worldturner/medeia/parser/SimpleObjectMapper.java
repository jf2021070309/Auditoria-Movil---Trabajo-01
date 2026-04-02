package com.worldturner.medeia.parser;

import com.amazon.aps.iva.fc0.f;
import com.amazon.aps.iva.yb0.e0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.m;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.api.TokenLocationException;
import com.worldturner.medeia.parser.builder.ValueBuilder;
import com.worldturner.medeia.parser.type.AcceptKind;
import com.worldturner.medeia.parser.type.MapperType;
import com.worldturner.medeia.parser.type.StructuredType;
import java.util.ArrayDeque;
import kotlin.Metadata;
/* compiled from: SimpleObjectMapper.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\bH\u0016R\u0018\u0010\r\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/worldturner/medeia/parser/SimpleObjectMapper;", "Lcom/worldturner/medeia/parser/JsonTokenDataAndLocationBuilder;", "Lcom/worldturner/medeia/parser/JsonTokenData;", "token", "Lcom/worldturner/medeia/parser/JsonTokenLocation;", FirebaseAnalytics.Param.LOCATION, "Lcom/amazon/aps/iva/kb0/q;", "consumeProtected", "", "value", "completeValue", "consume", "takeResult", "result", "Ljava/lang/Object;", "Ljava/util/ArrayDeque;", "Lcom/worldturner/medeia/parser/builder/ValueBuilder;", "Lcom/worldturner/medeia/parser/type/MapperType;", "valueBuilderStack", "Ljava/util/ArrayDeque;", "rootType", "Lcom/worldturner/medeia/parser/type/MapperType;", "getRootType", "()Lcom/worldturner/medeia/parser/type/MapperType;", "", "startLevel", "I", "getStartLevel", "()I", "<init>", "(Lcom/worldturner/medeia/parser/type/MapperType;I)V", "RootBuilder", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class SimpleObjectMapper implements JsonTokenDataAndLocationBuilder {
    private Object result;
    private final MapperType rootType;
    private final int startLevel;
    private final ArrayDeque<ValueBuilder<? extends MapperType>> valueBuilderStack;

    /* compiled from: SimpleObjectMapper.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016R(\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/worldturner/medeia/parser/SimpleObjectMapper$RootBuilder;", "Lcom/worldturner/medeia/parser/builder/ValueBuilder;", "Lcom/worldturner/medeia/parser/type/MapperType;", "", "value", "Lcom/amazon/aps/iva/kb0/q;", "add", "Lcom/worldturner/medeia/parser/JsonTokenData;", "lastToken", "createValue", "itemType", "token", "", "completed", "", "<anonymous parameter 0>", "getCurrentProperty", "()Ljava/lang/String;", "setCurrentProperty", "(Ljava/lang/String;)V", "currentProperty", "<init>", "(Lcom/worldturner/medeia/parser/SimpleObjectMapper;)V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes4.dex */
    public final class RootBuilder extends ValueBuilder<MapperType> {
        public RootBuilder() {
            super(SimpleObjectMapper.this.getStartLevel(), SimpleObjectMapper.this.getRootType());
        }

        @Override // com.worldturner.medeia.parser.builder.ValueBuilder
        /* renamed from: add */
        public void mo61add(Object obj) {
            SimpleObjectMapper.this.result = obj;
        }

        @Override // com.worldturner.medeia.parser.builder.ValueBuilder
        public boolean completed(JsonTokenData jsonTokenData) {
            j.g(jsonTokenData, "token");
            return false;
        }

        @Override // com.worldturner.medeia.parser.builder.ValueBuilder
        public Object createValue(JsonTokenData jsonTokenData) {
            j.g(jsonTokenData, "lastToken");
            return SimpleObjectMapper.this.result;
        }

        @Override // com.worldturner.medeia.parser.builder.ValueBuilder
        public String getCurrentProperty() {
            throw new UnsupportedOperationException("on " + this);
        }

        @Override // com.worldturner.medeia.parser.builder.ValueBuilder
        public MapperType itemType() {
            return SimpleObjectMapper.this.getRootType();
        }

        @Override // com.worldturner.medeia.parser.builder.ValueBuilder
        public void setCurrentProperty(String str) {
            throw new UnsupportedOperationException("on " + this);
        }
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes4.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AcceptKind.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[AcceptKind.SINGLE.ordinal()] = 1;
            iArr[AcceptKind.STRUCTURE.ordinal()] = 2;
        }
    }

    public SimpleObjectMapper(MapperType mapperType, int i) {
        j.g(mapperType, "rootType");
        this.rootType = mapperType;
        this.startLevel = i;
        ArrayDeque<ValueBuilder<? extends MapperType>> arrayDeque = new ArrayDeque<>();
        arrayDeque.push(new RootBuilder());
        this.valueBuilderStack = arrayDeque;
    }

    private final void completeValue(Object obj) {
        if (this.valueBuilderStack.isEmpty()) {
            this.result = obj;
            return;
        }
        ValueBuilder<? extends MapperType> peek = this.valueBuilderStack.peek();
        if (peek != null) {
            peek.mo61add(obj);
        } else {
            j.l();
            throw null;
        }
    }

    private final void consumeProtected(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        ValueBuilder<? extends MapperType> peek = this.valueBuilderStack.peek();
        JsonTokenDataAndLocationBuilder consumerBuilder = peek.getConsumerBuilder();
        if (consumerBuilder == null && jsonTokenData.getType() == JsonTokenType.FIELD_NAME) {
            String text = jsonTokenData.getText();
            if (text != null) {
                peek.setCurrentProperty(text);
            } else {
                j.l();
                throw null;
            }
        } else if (peek.getStartLevel() == jsonTokenLocation.getLevel() && peek.completed(jsonTokenData)) {
            this.valueBuilderStack.pop();
            if (consumerBuilder != null) {
                consumerBuilder.consume(jsonTokenData, jsonTokenLocation);
            }
            completeValue(peek.createValue(jsonTokenData));
        } else if (consumerBuilder != null) {
            consumerBuilder.consume(jsonTokenData, jsonTokenLocation);
        } else {
            MapperType itemType = peek.itemType();
            int i = WhenMappings.$EnumSwitchMapping$0[itemType.accepts(jsonTokenData).ordinal()];
            if (i != 1) {
                if (i == 2) {
                    ValueBuilder<? extends StructuredType> createBuilder = itemType.createBuilder(jsonTokenData, jsonTokenLocation);
                    this.valueBuilderStack.push(createBuilder);
                    JsonTokenDataAndLocationBuilder consumerBuilder2 = createBuilder.getConsumerBuilder();
                    if (consumerBuilder2 != null) {
                        consumerBuilder2.consume(jsonTokenData, jsonTokenLocation);
                        return;
                    }
                    return;
                }
                throw new TypeMismatchException(jsonTokenData + " not accepted by " + itemType, jsonTokenLocation.toString());
            }
            completeValue(itemType.createObject(jsonTokenData, jsonTokenLocation));
        }
    }

    @Override // com.worldturner.medeia.parser.JsonTokenDataAndLocationConsumer
    public void consume(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        try {
            consumeProtected(jsonTokenData, jsonTokenLocation);
        } catch (TokenLocationException e) {
            throw e;
        } catch (Exception e2) {
            throw new TokenLocationException(e2.getMessage(), jsonTokenLocation.toString(), e2);
        }
    }

    public final MapperType getRootType() {
        return this.rootType;
    }

    public final int getStartLevel() {
        return this.startLevel;
    }

    @Override // com.worldturner.medeia.parser.JsonTokenDataAndLocationBuilder
    public Object takeResult() {
        m mVar = new m(this) { // from class: com.worldturner.medeia.parser.SimpleObjectMapper$takeResult$1
            {
                super(this);
            }

            @Override // com.amazon.aps.iva.fc0.m
            public Object get() {
                return ((SimpleObjectMapper) this.receiver).result;
            }

            @Override // com.amazon.aps.iva.yb0.b, com.amazon.aps.iva.fc0.c
            public String getName() {
                return "result";
            }

            @Override // com.amazon.aps.iva.yb0.b
            public f getOwner() {
                return e0.a(SimpleObjectMapper.class);
            }

            @Override // com.amazon.aps.iva.yb0.b
            public String getSignature() {
                return "getResult()Ljava/lang/Object;";
            }

            @Override // com.amazon.aps.iva.fc0.i
            public void set(Object obj) {
                ((SimpleObjectMapper) this.receiver).result = obj;
            }
        };
        V v = mVar.get();
        mVar.set(null);
        return v;
    }
}
