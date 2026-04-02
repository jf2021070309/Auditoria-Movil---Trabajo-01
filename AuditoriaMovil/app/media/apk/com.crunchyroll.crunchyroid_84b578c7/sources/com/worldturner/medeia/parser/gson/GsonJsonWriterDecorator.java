package com.worldturner.medeia.parser.gson;

import com.amazon.aps.iva.lb0.b0;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.stream.JsonWriter;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.JsonTokenDataAndLocationConsumer;
import com.worldturner.medeia.parser.JsonTokenDataKt;
import com.worldturner.medeia.parser.JsonTokenLocation;
import com.worldturner.medeia.parser.JsonTokenType;
import com.worldturner.medeia.pointer.JsonPointer;
import com.worldturner.medeia.pointer.JsonPointerBuilder;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
/* compiled from: GsonJsonWriterDecorator.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\u0010\t\n\u0002\u0010\u0004\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001,B!\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010$\u001a\u00020#\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\t\u001a\u00020\u0001H\u0016J\u0010\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\nH\u0016J\u0010\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\fH\u0016J\u0010\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\rH\u0016J\u0010\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0001H\u0016J\b\u0010\u0010\u001a\u00020\u0001H\u0016J\b\u0010\u0011\u001a\u00020\u0001H\u0016J\b\u0010\u0012\u001a\u00020\u0001H\u0016R$\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u00060\u001cR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006-"}, d2 = {"Lcom/worldturner/medeia/parser/gson/GsonJsonWriterDecorator;", "Lcom/google/gson/stream/JsonWriter;", "Lcom/worldturner/medeia/parser/JsonTokenData;", "token", "Lcom/amazon/aps/iva/kb0/q;", "consume", "", "value", "jsonValue", "nullValue", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "", "", "beginArray", "beginObject", "endArray", "endObject", "", "<set-?>", FirebaseAnalytics.Param.LEVEL, "I", "getLevel", "()I", "Lcom/worldturner/medeia/pointer/JsonPointerBuilder;", "jsonPointerBuilder", "Lcom/worldturner/medeia/pointer/JsonPointerBuilder;", "Lcom/worldturner/medeia/parser/gson/GsonJsonWriterDecorator$DynamicJsonTokenLocation;", "dynamicTokenLocation", "Lcom/worldturner/medeia/parser/gson/GsonJsonWriterDecorator$DynamicJsonTokenLocation;", "Ljava/util/ArrayDeque;", "", "propertyNamesStack", "Ljava/util/ArrayDeque;", "Lcom/worldturner/medeia/parser/JsonTokenDataAndLocationConsumer;", "consumer", "Lcom/worldturner/medeia/parser/JsonTokenDataAndLocationConsumer;", "inputSourceName", "Ljava/lang/String;", "Ljava/io/Writer;", "output", "<init>", "(Ljava/io/Writer;Lcom/worldturner/medeia/parser/JsonTokenDataAndLocationConsumer;Ljava/lang/String;)V", "DynamicJsonTokenLocation", "medeia-validator-gson"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class GsonJsonWriterDecorator extends JsonWriter {
    private final JsonTokenDataAndLocationConsumer consumer;
    private final DynamicJsonTokenLocation dynamicTokenLocation;
    private final String inputSourceName;
    private final JsonPointerBuilder jsonPointerBuilder;
    private int level;
    private final ArrayDeque<Set<String>> propertyNamesStack;

    /* compiled from: GsonJsonWriterDecorator.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/worldturner/medeia/parser/gson/GsonJsonWriterDecorator$DynamicJsonTokenLocation;", "Lcom/worldturner/medeia/parser/JsonTokenLocation;", "(Lcom/worldturner/medeia/parser/gson/GsonJsonWriterDecorator;)V", "inputSourceName", "", "getInputSourceName", "()Ljava/lang/String;", FirebaseAnalytics.Param.LEVEL, "", "getLevel", "()I", "pointer", "Lcom/worldturner/medeia/pointer/JsonPointer;", "getPointer", "()Lcom/worldturner/medeia/pointer/JsonPointer;", "propertyNames", "", "getPropertyNames", "()Ljava/util/Set;", "toString", "medeia-validator-gson"}, k = 1, mv = {1, 1, 13})
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
            return GsonJsonWriterDecorator.this.inputSourceName;
        }

        @Override // com.worldturner.medeia.parser.JsonTokenLocation
        public int getLevel() {
            return GsonJsonWriterDecorator.this.getLevel();
        }

        @Override // com.worldturner.medeia.parser.JsonTokenLocation
        public int getLine() {
            return JsonTokenLocation.DefaultImpls.getLine(this);
        }

        @Override // com.worldturner.medeia.parser.JsonTokenLocation
        public JsonPointer getPointer() {
            return GsonJsonWriterDecorator.this.jsonPointerBuilder.toJsonPointer();
        }

        @Override // com.worldturner.medeia.parser.JsonTokenLocation
        public Set<String> getPropertyNames() {
            Set<String> set = (Set) GsonJsonWriterDecorator.this.propertyNamesStack.peek();
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GsonJsonWriterDecorator(Writer writer, JsonTokenDataAndLocationConsumer jsonTokenDataAndLocationConsumer, String str) {
        super(writer);
        j.g(writer, "output");
        j.g(jsonTokenDataAndLocationConsumer, "consumer");
        this.consumer = jsonTokenDataAndLocationConsumer;
        this.inputSourceName = str;
        this.jsonPointerBuilder = new JsonPointerBuilder();
        this.dynamicTokenLocation = new DynamicJsonTokenLocation();
        this.propertyNamesStack = new ArrayDeque<>();
    }

    private final void consume(JsonTokenData jsonTokenData) {
        this.jsonPointerBuilder.consume(jsonTokenData);
        this.consumer.consume(jsonTokenData, this.dynamicTokenLocation);
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter beginArray() {
        consume(JsonTokenDataKt.getTOKEN_START_ARRAY());
        this.level++;
        super.beginArray();
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter beginObject() {
        consume(JsonTokenDataKt.getTOKEN_START_OBJECT());
        this.propertyNamesStack.addFirst(new HashSet());
        this.level++;
        super.beginObject();
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter endArray() {
        this.level--;
        consume(JsonTokenDataKt.getTOKEN_END_ARRAY());
        JsonWriter endArray = super.endArray();
        j.b(endArray, "super.endArray()");
        return endArray;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter endObject() {
        this.level--;
        consume(JsonTokenDataKt.getTOKEN_END_OBJECT());
        this.propertyNamesStack.removeFirst();
        JsonWriter endObject = super.endObject();
        j.b(endObject, "super.endObject()");
        return endObject;
    }

    public final int getLevel() {
        return this.level;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter jsonValue(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter name(String str) {
        j.g(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        consume(new JsonTokenData(JsonTokenType.FIELD_NAME, str, 0L, null, null, 28, null));
        this.propertyNamesStack.peek().add(str);
        JsonWriter name = super.name(str);
        j.b(name, "super.name(name)");
        return name;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter nullValue() {
        consume(JsonTokenDataKt.getTOKEN_NULL());
        JsonWriter nullValue = super.nullValue();
        j.b(nullValue, "super.nullValue()");
        return nullValue;
    }

    @Override // com.google.gson.stream.JsonWriter
    public /* bridge */ /* synthetic */ JsonWriter value(Boolean bool) {
        return value(bool.booleanValue());
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(boolean z) {
        consume(z ? JsonTokenDataKt.getTOKEN_TRUE() : JsonTokenDataKt.getTOKEN_FALSE());
        JsonWriter value = super.value(z);
        j.b(value, "super.value(value)");
        return value;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(String str) {
        j.g(str, "value");
        consume(JsonTokenData.Companion.createText(str));
        JsonWriter value = super.value(str);
        j.b(value, "super.value(value)");
        return value;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(double d) {
        consume(new JsonTokenData(JsonTokenType.VALUE_NUMBER, null, 0L, null, BigDecimal.valueOf(d), 14, null));
        JsonWriter value = super.value(d);
        j.b(value, "super.value(value)");
        return value;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(long j) {
        consume(JsonTokenData.Companion.createNumber(j));
        JsonWriter value = super.value(j);
        j.b(value, "super.value(value)");
        return value;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(Number number) {
        JsonTokenData createNumber;
        j.g(number, "value");
        if (number instanceof BigInteger) {
            createNumber = new JsonTokenData(JsonTokenType.VALUE_NUMBER, null, 0L, (BigInteger) number, null, 22, null);
        } else if (number instanceof BigDecimal) {
            createNumber = new JsonTokenData(JsonTokenType.VALUE_NUMBER, null, 0L, null, (BigDecimal) number, 14, null);
        } else if ((number instanceof Integer) || (number instanceof AtomicInteger) || (number instanceof Short) || (number instanceof Byte)) {
            createNumber = JsonTokenData.Companion.createNumber(number.longValue());
        } else if ((number instanceof Long) || (number instanceof AtomicLong)) {
            createNumber = JsonTokenData.Companion.createNumber(number.longValue());
        } else {
            createNumber = new JsonTokenData(JsonTokenType.VALUE_NUMBER, null, 0L, null, BigDecimal.valueOf(number.doubleValue()), 14, null);
        }
        consume(createNumber);
        JsonWriter value = super.value(number);
        j.b(value, "super.value(value)");
        return value;
    }
}
