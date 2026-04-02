package com.worldturner.medeia.parser;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.parser.JsonTokenDataBuilder;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Deque;
import kotlin.Metadata;
/* compiled from: TextOutputBuilder.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\u0004J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\u00060\u0015j\u0002`\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/worldturner/medeia/parser/TextOutputBuilder;", "Lcom/worldturner/medeia/parser/JsonTokenDataBuilder;", "Lcom/worldturner/medeia/parser/JsonTokenData;", "token", "Lcom/amazon/aps/iva/kb0/q;", "consume", "", "n", "outputNumber", "", "", "b", "outputBoolean", "outputNull", "", "takeResult", "toString", "Ljava/util/Deque;", "Lcom/worldturner/medeia/parser/TextOutputBuilder$StructureType;", "stack", "Ljava/util/Deque;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "result", "Ljava/lang/StringBuilder;", "outputComma", "Z", "<init>", "()V", "StructureType", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class TextOutputBuilder implements JsonTokenDataBuilder {
    private boolean outputComma;
    private final Deque<StructureType> stack = new ArrayDeque();
    private StringBuilder result = new StringBuilder();

    /* compiled from: TextOutputBuilder.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/worldturner/medeia/parser/TextOutputBuilder$StructureType;", "", "(Ljava/lang/String;I)V", "ARRAY", "OBJECT", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes4.dex */
    public enum StructureType {
        ARRAY,
        OBJECT
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes4.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JsonTokenType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[JsonTokenType.FIELD_NAME.ordinal()] = 1;
            iArr[JsonTokenType.VALUE_TEXT.ordinal()] = 2;
            iArr[JsonTokenType.VALUE_NULL.ordinal()] = 3;
            iArr[JsonTokenType.VALUE_BOOLEAN_FALSE.ordinal()] = 4;
            iArr[JsonTokenType.VALUE_BOOLEAN_TRUE.ordinal()] = 5;
            iArr[JsonTokenType.VALUE_NUMBER.ordinal()] = 6;
            iArr[JsonTokenType.START_ARRAY.ordinal()] = 7;
            iArr[JsonTokenType.END_ARRAY.ordinal()] = 8;
            iArr[JsonTokenType.START_OBJECT.ordinal()] = 9;
            iArr[JsonTokenType.END_OBJECT.ordinal()] = 10;
        }
    }

    @Override // com.worldturner.medeia.parser.JsonTokenDataAndLocationConsumer
    public void consume(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        JsonTokenDataBuilder.DefaultImpls.consume(this, jsonTokenData, jsonTokenLocation);
    }

    public final void outputBoolean(boolean z) {
        this.result.append(z);
    }

    public final void outputNull() {
        this.result.append("null");
    }

    public final void outputNumber(long j) {
        this.result.append(j);
    }

    public String toString() {
        return takeResult();
    }

    @Override // com.worldturner.medeia.parser.JsonTokenDataConsumer
    public void consume(JsonTokenData jsonTokenData) {
        j.g(jsonTokenData, "token");
        if (this.outputComma && !jsonTokenData.getType().getLastStructureToken()) {
            this.result.append(',');
        }
        switch (WhenMappings.$EnumSwitchMapping$0[jsonTokenData.getType().ordinal()]) {
            case 1:
                StringBuilder sb = this.result;
                String text = jsonTokenData.getText();
                if (text != null) {
                    l1.t(sb, text);
                    this.result.append(':');
                    break;
                } else {
                    j.l();
                    throw null;
                }
            case 2:
                StringBuilder sb2 = this.result;
                String text2 = jsonTokenData.getText();
                if (text2 == null) {
                    j.l();
                    throw null;
                } else {
                    l1.t(sb2, text2);
                    break;
                }
            case 3:
                outputNull();
                break;
            case 4:
            case 5:
                outputBoolean(jsonTokenData.toBoolean());
                break;
            case 6:
                if (!jsonTokenData.hasLongValue()) {
                    BigInteger integer = jsonTokenData.getInteger();
                    if (integer == null) {
                        BigDecimal decimal = jsonTokenData.getDecimal();
                        if (decimal != null) {
                            outputNumber(decimal);
                            break;
                        }
                    } else {
                        outputNumber(integer);
                        break;
                    }
                } else {
                    outputNumber(jsonTokenData.getLongValue());
                    break;
                }
                break;
            case 7:
                this.result.append('[');
                this.stack.push(StructureType.ARRAY);
                break;
            case 8:
                this.result.append(']');
                this.stack.pop();
                break;
            case 9:
                this.result.append('{');
                this.stack.push(StructureType.OBJECT);
                break;
            case 10:
                this.result.append('}');
                this.stack.pop();
                break;
        }
        this.outputComma = (jsonTokenData.getType().getFirstStructureToken() || jsonTokenData.getType() == JsonTokenType.FIELD_NAME) ? false : true;
    }

    public final void outputNumber(Number number) {
        j.g(number, "n");
        this.result.append(number);
    }

    @Override // com.worldturner.medeia.parser.JsonTokenDataBuilder, com.worldturner.medeia.parser.JsonTokenDataAndLocationBuilder
    public String takeResult() {
        String sb = this.result.toString();
        StringBuilder sb2 = this.result;
        j.f(sb2, "<this>");
        sb2.setLength(0);
        j.b(sb, "result.toString().also { result.clear() }");
        return sb;
    }
}
