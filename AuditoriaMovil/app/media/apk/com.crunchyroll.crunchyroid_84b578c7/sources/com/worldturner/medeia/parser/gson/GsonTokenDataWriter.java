package com.worldturner.medeia.parser.gson;

import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.stream.JsonWriter;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.JsonTokenDataConsumer;
import com.worldturner.medeia.parser.JsonTokenLocation;
import com.worldturner.medeia.parser.JsonTokenType;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.Metadata;
/* compiled from: GsonTokenDataWriter.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/worldturner/medeia/parser/gson/GsonTokenDataWriter;", "Lcom/worldturner/medeia/parser/JsonTokenDataConsumer;", "Lcom/worldturner/medeia/parser/JsonTokenData;", "token", "Lcom/amazon/aps/iva/kb0/q;", "consume", "Lcom/google/gson/stream/JsonWriter;", "writer", "Lcom/google/gson/stream/JsonWriter;", "getWriter", "()Lcom/google/gson/stream/JsonWriter;", "<init>", "(Lcom/google/gson/stream/JsonWriter;)V", "medeia-validator-gson"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class GsonTokenDataWriter implements JsonTokenDataConsumer {
    private final JsonWriter writer;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes4.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JsonTokenType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[JsonTokenType.VALUE_NULL.ordinal()] = 1;
            iArr[JsonTokenType.VALUE_TEXT.ordinal()] = 2;
            iArr[JsonTokenType.VALUE_BOOLEAN_FALSE.ordinal()] = 3;
            iArr[JsonTokenType.VALUE_BOOLEAN_TRUE.ordinal()] = 4;
            iArr[JsonTokenType.VALUE_NUMBER.ordinal()] = 5;
            iArr[JsonTokenType.START_OBJECT.ordinal()] = 6;
            iArr[JsonTokenType.END_OBJECT.ordinal()] = 7;
            iArr[JsonTokenType.START_ARRAY.ordinal()] = 8;
            iArr[JsonTokenType.END_ARRAY.ordinal()] = 9;
            iArr[JsonTokenType.FIELD_NAME.ordinal()] = 10;
        }
    }

    public GsonTokenDataWriter(JsonWriter jsonWriter) {
        j.g(jsonWriter, "writer");
        this.writer = jsonWriter;
    }

    @Override // com.worldturner.medeia.parser.JsonTokenDataConsumer, com.worldturner.medeia.parser.JsonTokenDataAndLocationConsumer
    public void consume(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        JsonTokenDataConsumer.DefaultImpls.consume(this, jsonTokenData, jsonTokenLocation);
    }

    public final JsonWriter getWriter() {
        return this.writer;
    }

    @Override // com.worldturner.medeia.parser.JsonTokenDataConsumer
    public void consume(JsonTokenData jsonTokenData) {
        BigDecimal decimal;
        j.g(jsonTokenData, "token");
        switch (WhenMappings.$EnumSwitchMapping$0[jsonTokenData.getType().ordinal()]) {
            case 1:
                this.writer.nullValue();
                return;
            case 2:
                this.writer.value(jsonTokenData.getText());
                return;
            case 3:
                this.writer.value(false);
                return;
            case 4:
                this.writer.value(true);
                return;
            case 5:
                if (jsonTokenData.hasLongValue()) {
                    this.writer.value(jsonTokenData.getLongValue());
                    return;
                }
                BigInteger integer = jsonTokenData.getInteger();
                if ((integer == null || this.writer.value(integer) == null) && (decimal = jsonTokenData.getDecimal()) != null) {
                    this.writer.value(decimal);
                    return;
                }
                return;
            case 6:
                this.writer.beginObject();
                return;
            case 7:
                this.writer.endObject();
                return;
            case 8:
                this.writer.beginArray();
                return;
            case 9:
                this.writer.endArray();
                return;
            case 10:
                this.writer.name(jsonTokenData.getText());
                return;
            default:
                return;
        }
    }
}
