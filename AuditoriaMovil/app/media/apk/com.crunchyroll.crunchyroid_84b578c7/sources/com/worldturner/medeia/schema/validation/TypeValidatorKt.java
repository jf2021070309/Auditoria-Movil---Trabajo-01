package com.worldturner.medeia.schema.validation;

import com.amazon.aps.iva.kb0.h;
import com.amazon.aps.iva.yb0.j;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.JsonTokenType;
import com.worldturner.medeia.schema.model.SimpleType;
import kotlin.Metadata;
/* compiled from: TypeValidator.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"schemaType", "Lcom/worldturner/medeia/schema/model/SimpleType;", "Lcom/worldturner/medeia/parser/JsonTokenData;", "getSchemaType", "(Lcom/worldturner/medeia/parser/JsonTokenData;)Lcom/worldturner/medeia/schema/model/SimpleType;", "medeia-validator-core"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class TypeValidatorKt {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes4.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JsonTokenType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[JsonTokenType.START_ARRAY.ordinal()] = 1;
            iArr[JsonTokenType.END_ARRAY.ordinal()] = 2;
            iArr[JsonTokenType.START_OBJECT.ordinal()] = 3;
            iArr[JsonTokenType.END_OBJECT.ordinal()] = 4;
            iArr[JsonTokenType.VALUE_BOOLEAN_FALSE.ordinal()] = 5;
            iArr[JsonTokenType.VALUE_BOOLEAN_TRUE.ordinal()] = 6;
            iArr[JsonTokenType.VALUE_NULL.ordinal()] = 7;
            iArr[JsonTokenType.VALUE_NUMBER.ordinal()] = 8;
            iArr[JsonTokenType.VALUE_TEXT.ordinal()] = 9;
            iArr[JsonTokenType.FIELD_NAME.ordinal()] = 10;
            iArr[JsonTokenType.END_OF_STREAM.ordinal()] = 11;
            iArr[JsonTokenType.NONE.ordinal()] = 12;
        }
    }

    public static final SimpleType getSchemaType(JsonTokenData jsonTokenData) {
        j.g(jsonTokenData, "receiver$0");
        switch (WhenMappings.$EnumSwitchMapping$0[jsonTokenData.getType().ordinal()]) {
            case 1:
            case 2:
                return SimpleType.ARRAY;
            case 3:
            case 4:
                return SimpleType.OBJECT;
            case 5:
            case 6:
                return SimpleType.BOOLEAN;
            case 7:
                return SimpleType.NULL;
            case 8:
                if (jsonTokenData.isInteger()) {
                    return SimpleType.INTEGER;
                }
                return SimpleType.NUMBER;
            case 9:
                return SimpleType.STRING;
            case 10:
            case 11:
            case 12:
                return null;
            default:
                throw new h();
        }
    }
}
