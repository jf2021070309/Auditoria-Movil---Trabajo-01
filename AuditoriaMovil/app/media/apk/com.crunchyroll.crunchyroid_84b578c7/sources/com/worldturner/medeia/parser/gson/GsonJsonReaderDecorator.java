package com.worldturner.medeia.parser.gson;

import com.amazon.aps.iva.lb0.b0;
import com.amazon.aps.iva.oe0.q;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.worldturner.medeia.parser.JsonParserAdapter;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.JsonTokenDataAndLocationConsumer;
import com.worldturner.medeia.parser.JsonTokenDataKt;
import com.worldturner.medeia.parser.JsonTokenLocation;
import com.worldturner.medeia.parser.JsonTokenType;
import com.worldturner.medeia.pointer.JsonPointer;
import com.worldturner.medeia.pointer.JsonPointerBuilder;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: GsonJsonReaderDecorator.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001/B!\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010'\u001a\u00020&\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b-\u0010.J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0007H\u0016J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\b\u0010\u0016\u001a\u00020\u0007H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0007H\u0016J\b\u0010\u0019\u001a\u00020\u0007H\u0016R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u00060\u001dR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R \u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u00060"}, d2 = {"Lcom/worldturner/medeia/parser/gson/GsonJsonReaderDecorator;", "Lcom/google/gson/stream/JsonReader;", "Lcom/worldturner/medeia/parser/JsonParserAdapter;", "", "nextNumber", "Lcom/worldturner/medeia/parser/JsonTokenData;", "token", "Lcom/amazon/aps/iva/kb0/q;", "consume", "", "nextBoolean", "", "nextInt", "", "nextLong", "", "nextDouble", "", "nextName", "nextString", "nextNull", "beginArray", "endArray", "beginObject", "endObject", "parseAll", "Lcom/worldturner/medeia/pointer/JsonPointerBuilder;", "jsonPointerBuilder", "Lcom/worldturner/medeia/pointer/JsonPointerBuilder;", "Lcom/worldturner/medeia/parser/gson/GsonJsonReaderDecorator$DynamicJsonTokenLocation;", "dynamicTokenLocation", "Lcom/worldturner/medeia/parser/gson/GsonJsonReaderDecorator$DynamicJsonTokenLocation;", FirebaseAnalytics.Param.LEVEL, "I", "Ljava/util/ArrayDeque;", "", "propertyNamesStack", "Ljava/util/ArrayDeque;", "Lcom/worldturner/medeia/parser/JsonTokenDataAndLocationConsumer;", "consumer", "Lcom/worldturner/medeia/parser/JsonTokenDataAndLocationConsumer;", "inputSourceName", "Ljava/lang/String;", "Ljava/io/Reader;", "input", "<init>", "(Ljava/io/Reader;Lcom/worldturner/medeia/parser/JsonTokenDataAndLocationConsumer;Ljava/lang/String;)V", "DynamicJsonTokenLocation", "medeia-validator-gson"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class GsonJsonReaderDecorator extends JsonReader implements JsonParserAdapter {
    private final JsonTokenDataAndLocationConsumer consumer;
    private final DynamicJsonTokenLocation dynamicTokenLocation;
    private final String inputSourceName;
    private final JsonPointerBuilder jsonPointerBuilder;
    private int level;
    private final ArrayDeque<Set<String>> propertyNamesStack;

    /* compiled from: GsonJsonReaderDecorator.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/worldturner/medeia/parser/gson/GsonJsonReaderDecorator$DynamicJsonTokenLocation;", "Lcom/worldturner/medeia/parser/JsonTokenLocation;", "(Lcom/worldturner/medeia/parser/gson/GsonJsonReaderDecorator;)V", "inputSourceName", "", "getInputSourceName", "()Ljava/lang/String;", FirebaseAnalytics.Param.LEVEL, "", "getLevel", "()I", "pointer", "Lcom/worldturner/medeia/pointer/JsonPointer;", "getPointer", "()Lcom/worldturner/medeia/pointer/JsonPointer;", "propertyNames", "", "getPropertyNames", "()Ljava/util/Set;", "toString", "medeia-validator-gson"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes4.dex */
    public final class DynamicJsonTokenLocation implements JsonTokenLocation {
        public DynamicJsonTokenLocation() {
        }

        @Override // com.worldturner.medeia.parser.JsonTokenLocation
        public int getColumn() {
            return JsonTokenLocation.DefaultImpls.getColumn(this);
        }

        @Override // com.worldturner.medeia.parser.JsonTokenLocation
        public String getInputSourceName() {
            return GsonJsonReaderDecorator.this.inputSourceName;
        }

        @Override // com.worldturner.medeia.parser.JsonTokenLocation
        public int getLevel() {
            return GsonJsonReaderDecorator.this.level;
        }

        @Override // com.worldturner.medeia.parser.JsonTokenLocation
        public int getLine() {
            return JsonTokenLocation.DefaultImpls.getLine(this);
        }

        @Override // com.worldturner.medeia.parser.JsonTokenLocation
        public JsonPointer getPointer() {
            return GsonJsonReaderDecorator.this.jsonPointerBuilder.toJsonPointer();
        }

        @Override // com.worldturner.medeia.parser.JsonTokenLocation
        public Set<String> getPropertyNames() {
            Set<String> set = (Set) GsonJsonReaderDecorator.this.propertyNamesStack.peek();
            if (set == null) {
                return b0.b;
            }
            return set;
        }

        public String toString() {
            if (getInputSourceName() != null) {
                String str = "at " + getPointer() + " in " + getInputSourceName();
                if (str != null) {
                    return str;
                }
            }
            return "at " + getPointer();
        }
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes4.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[JsonTokenType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[JsonTokenType.START_OBJECT.ordinal()] = 1;
            iArr[JsonTokenType.END_OBJECT.ordinal()] = 2;
            iArr[JsonTokenType.FIELD_NAME.ordinal()] = 3;
            int[] iArr2 = new int[JsonToken.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[JsonToken.NUMBER.ordinal()] = 1;
            iArr2[JsonToken.STRING.ordinal()] = 2;
            iArr2[JsonToken.NAME.ordinal()] = 3;
            iArr2[JsonToken.BOOLEAN.ordinal()] = 4;
            iArr2[JsonToken.NULL.ordinal()] = 5;
            iArr2[JsonToken.BEGIN_ARRAY.ordinal()] = 6;
            iArr2[JsonToken.END_ARRAY.ordinal()] = 7;
            iArr2[JsonToken.BEGIN_OBJECT.ordinal()] = 8;
            iArr2[JsonToken.END_OBJECT.ordinal()] = 9;
            iArr2[JsonToken.END_DOCUMENT.ordinal()] = 10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GsonJsonReaderDecorator(Reader reader, JsonTokenDataAndLocationConsumer jsonTokenDataAndLocationConsumer, String str) {
        super(reader);
        j.g(reader, "input");
        j.g(jsonTokenDataAndLocationConsumer, "consumer");
        this.consumer = jsonTokenDataAndLocationConsumer;
        this.inputSourceName = str;
        this.jsonPointerBuilder = new JsonPointerBuilder();
        this.dynamicTokenLocation = new DynamicJsonTokenLocation();
        this.propertyNamesStack = new ArrayDeque<>();
    }

    private final Number nextNumber() {
        if (peek() == JsonToken.NUMBER) {
            String nextString = super.nextString();
            j.b(nextString, "numberAsString");
            if (q.j0(nextString, '.')) {
                BigDecimal bigDecimal = new BigDecimal(nextString);
                consume(new JsonTokenData(JsonTokenType.VALUE_NUMBER, null, 0L, null, bigDecimal, 14, null));
                return bigDecimal;
            }
            BigInteger bigInteger = new BigInteger(nextString);
            consume(new JsonTokenData(JsonTokenType.VALUE_NUMBER, null, 0L, bigInteger, null, 22, null));
            return bigInteger;
        }
        return Double.valueOf(nextDouble());
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginArray() {
        super.beginArray();
        consume(JsonTokenDataKt.getTOKEN_START_ARRAY());
        this.level++;
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginObject() {
        super.beginObject();
        consume(JsonTokenDataKt.getTOKEN_START_OBJECT());
        this.level++;
    }

    public final void consume(JsonTokenData jsonTokenData) {
        j.g(jsonTokenData, "token");
        this.jsonPointerBuilder.consume(jsonTokenData, this.dynamicTokenLocation);
        this.consumer.consume(jsonTokenData, this.dynamicTokenLocation);
        int i = WhenMappings.$EnumSwitchMapping$0[jsonTokenData.getType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    Set<String> peek = this.propertyNamesStack.peek();
                    String text = jsonTokenData.getText();
                    if (text != null) {
                        peek.add(text);
                        return;
                    } else {
                        j.l();
                        throw null;
                    }
                }
                return;
            }
            this.propertyNamesStack.removeFirst();
            return;
        }
        this.propertyNamesStack.addFirst(new HashSet());
    }

    @Override // com.google.gson.stream.JsonReader
    public void endArray() {
        super.endArray();
        this.level--;
        consume(JsonTokenDataKt.getTOKEN_END_ARRAY());
    }

    @Override // com.google.gson.stream.JsonReader
    public void endObject() {
        super.endObject();
        this.level--;
        consume(JsonTokenDataKt.getTOKEN_END_OBJECT());
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean nextBoolean() {
        JsonTokenData token_false;
        boolean nextBoolean = super.nextBoolean();
        if (nextBoolean) {
            token_false = JsonTokenDataKt.getTOKEN_TRUE();
        } else {
            token_false = JsonTokenDataKt.getTOKEN_FALSE();
        }
        consume(token_false);
        return nextBoolean;
    }

    @Override // com.google.gson.stream.JsonReader
    public double nextDouble() {
        if (peek() == JsonToken.NUMBER) {
            String nextString = super.nextString();
            j.b(nextString, "numberAsString");
            if (q.j0(nextString, '.')) {
                BigDecimal bigDecimal = new BigDecimal(nextString);
                consume(new JsonTokenData(JsonTokenType.VALUE_NUMBER, null, 0L, null, bigDecimal, 14, null));
                return bigDecimal.doubleValue();
            }
            BigInteger bigInteger = new BigInteger(nextString);
            consume(new JsonTokenData(JsonTokenType.VALUE_NUMBER, null, 0L, bigInteger, null, 22, null));
            return bigInteger.doubleValue();
        }
        return nextDouble();
    }

    @Override // com.google.gson.stream.JsonReader
    public int nextInt() {
        int exactIntValue;
        if (peek() == JsonToken.NUMBER) {
            String nextString = super.nextString();
            j.b(nextString, "numberAsString");
            if (q.j0(nextString, '.')) {
                BigDecimal bigDecimal = new BigDecimal(nextString);
                consume(new JsonTokenData(JsonTokenType.VALUE_NUMBER, null, 0L, null, bigDecimal, 14, null));
                return bigDecimal.intValueExact();
            }
            BigInteger bigInteger = new BigInteger(nextString);
            consume(new JsonTokenData(JsonTokenType.VALUE_NUMBER, null, 0L, bigInteger, null, 22, null));
            exactIntValue = GsonJsonReaderDecoratorKt.exactIntValue(bigInteger);
            return exactIntValue;
        }
        return nextInt();
    }

    @Override // com.google.gson.stream.JsonReader
    public long nextLong() {
        long exactLongValue;
        if (peek() == JsonToken.NUMBER) {
            String nextString = super.nextString();
            j.b(nextString, "numberAsString");
            if (q.j0(nextString, '.')) {
                BigDecimal bigDecimal = new BigDecimal(nextString);
                consume(new JsonTokenData(JsonTokenType.VALUE_NUMBER, null, 0L, null, bigDecimal, 14, null));
                return bigDecimal.longValueExact();
            }
            BigInteger bigInteger = new BigInteger(nextString);
            consume(new JsonTokenData(JsonTokenType.VALUE_NUMBER, null, 0L, bigInteger, null, 22, null));
            exactLongValue = GsonJsonReaderDecoratorKt.exactLongValue(bigInteger);
            return exactLongValue;
        }
        return nextLong();
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextName() {
        String nextName = super.nextName();
        consume(new JsonTokenData(JsonTokenType.FIELD_NAME, nextName, 0L, null, null, 28, null));
        j.b(nextName, "super.nextName().also {\n…ME, text = it))\n        }");
        return nextName;
    }

    @Override // com.google.gson.stream.JsonReader
    public void nextNull() {
        super.nextNull();
        com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        consume(JsonTokenDataKt.getTOKEN_NULL());
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextString() {
        JsonTokenData createText;
        JsonToken peek = peek();
        String nextString = super.nextString();
        if (peek == JsonToken.NUMBER) {
            j.b(nextString, "it");
            if (q.j0(nextString, '.')) {
                createText = new JsonTokenData(JsonTokenType.VALUE_NUMBER, null, 0L, null, new BigDecimal(nextString), 14, null);
            } else {
                createText = new JsonTokenData(JsonTokenType.VALUE_NUMBER, null, 0L, new BigInteger(nextString), null, 22, null);
            }
        } else {
            JsonTokenData.Companion companion = JsonTokenData.Companion;
            j.b(nextString, "it");
            createText = companion.createText(nextString);
        }
        consume(createText);
        j.b(nextString, "super.nextString().also …{ consume(it) }\n        }");
        return nextString;
    }

    @Override // com.worldturner.medeia.parser.JsonParserAdapter
    public void parseAll() {
        while (true) {
            JsonToken peek = peek();
            if (peek != null) {
                switch (WhenMappings.$EnumSwitchMapping$1[peek.ordinal()]) {
                    case 1:
                        nextNumber();
                        break;
                    case 2:
                        nextString();
                        break;
                    case 3:
                        nextName();
                        break;
                    case 4:
                        nextBoolean();
                        break;
                    case 5:
                        nextNull();
                        break;
                    case 6:
                        beginArray();
                        break;
                    case 7:
                        endArray();
                        break;
                    case 8:
                        beginObject();
                        break;
                    case 9:
                        endObject();
                        break;
                    case 10:
                        return;
                }
            } else {
                j.l();
                throw null;
            }
        }
    }
}
