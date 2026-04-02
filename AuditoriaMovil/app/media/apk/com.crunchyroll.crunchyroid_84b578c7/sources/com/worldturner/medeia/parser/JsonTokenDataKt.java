package com.worldturner.medeia.parser;

import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.ads.RequestConfiguration;
import java.math.BigDecimal;
import kotlin.Metadata;
/* compiled from: JsonTokenData.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0000\u001a/\u0010\u0016\u001a\u00020\u0017\"\u000e\b\u0000\u0010\u0018*\b\u0012\u0004\u0012\u0002H\u00180\u00192\b\u0010\u001a\u001a\u0004\u0018\u0001H\u00182\b\u0010\u001b\u001a\u0004\u0018\u0001H\u0018¢\u0006\u0002\u0010\u001c\u001a\f\u0010\u001d\u001a\u00020\u001e*\u00020\u001fH\u0000\u001a\n\u0010 \u001a\u00020\u0017*\u00020!\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003\"\u0011\u0010\b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0003\"\u0011\u0010\n\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0003\"\u0011\u0010\f\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0003\"\u0011\u0010\u000e\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0003\"\u0011\u0010\u0010\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0003\"\u0011\u0010\u0012\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0003\"\u0011\u0010\u0014\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0003¨\u0006\""}, d2 = {"TOKEN_EMPTY_STRING", "Lcom/worldturner/medeia/parser/JsonTokenData;", "getTOKEN_EMPTY_STRING", "()Lcom/worldturner/medeia/parser/JsonTokenData;", "TOKEN_END_ARRAY", "getTOKEN_END_ARRAY", "TOKEN_END_OBJECT", "getTOKEN_END_OBJECT", "TOKEN_END_OF_STREAM", "getTOKEN_END_OF_STREAM", "TOKEN_FALSE", "getTOKEN_FALSE", "TOKEN_NONE", "getTOKEN_NONE", "TOKEN_NULL", "getTOKEN_NULL", "TOKEN_START_ARRAY", "getTOKEN_START_ARRAY", "TOKEN_START_OBJECT", "getTOKEN_START_OBJECT", "TOKEN_TRUE", "getTOKEN_TRUE", "compare", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "a", "b", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)I", "isIntegerForStrippedTrailingZeroes", "", "Ljava/math/BigDecimal;", "standardizedHashCode", "", "medeia-validator-core"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class JsonTokenDataKt {
    private static final JsonTokenData TOKEN_TRUE = new JsonTokenData(JsonTokenType.VALUE_BOOLEAN_TRUE, null, 0, null, null, 30, null);
    private static final JsonTokenData TOKEN_FALSE = new JsonTokenData(JsonTokenType.VALUE_BOOLEAN_FALSE, null, 0, null, null, 30, null);
    private static final JsonTokenData TOKEN_NULL = new JsonTokenData(JsonTokenType.VALUE_NULL, null, 0, null, null, 30, null);
    private static final JsonTokenData TOKEN_START_ARRAY = new JsonTokenData(JsonTokenType.START_ARRAY, null, 0, null, null, 30, null);
    private static final JsonTokenData TOKEN_END_ARRAY = new JsonTokenData(JsonTokenType.END_ARRAY, null, 0, null, null, 30, null);
    private static final JsonTokenData TOKEN_START_OBJECT = new JsonTokenData(JsonTokenType.START_OBJECT, null, 0, null, null, 30, null);
    private static final JsonTokenData TOKEN_END_OBJECT = new JsonTokenData(JsonTokenType.END_OBJECT, null, 0, null, null, 30, null);
    private static final JsonTokenData TOKEN_NONE = new JsonTokenData(JsonTokenType.NONE, null, 0, null, null, 30, null);
    private static final JsonTokenData TOKEN_END_OF_STREAM = new JsonTokenData(JsonTokenType.END_OF_STREAM, null, 0, null, null, 30, null);
    private static final JsonTokenData TOKEN_EMPTY_STRING = new JsonTokenData(JsonTokenType.VALUE_TEXT, "", 0, null, null, 28, null);

    public static final <T extends Comparable<? super T>> int compare(T t, T t2) {
        if (t == null) {
            if (t2 == null) {
                return 0;
            }
            return -1;
        } else if (t2 == null) {
            return 1;
        } else {
            return t.compareTo(t2);
        }
    }

    public static final JsonTokenData getTOKEN_EMPTY_STRING() {
        return TOKEN_EMPTY_STRING;
    }

    public static final JsonTokenData getTOKEN_END_ARRAY() {
        return TOKEN_END_ARRAY;
    }

    public static final JsonTokenData getTOKEN_END_OBJECT() {
        return TOKEN_END_OBJECT;
    }

    public static final JsonTokenData getTOKEN_END_OF_STREAM() {
        return TOKEN_END_OF_STREAM;
    }

    public static final JsonTokenData getTOKEN_FALSE() {
        return TOKEN_FALSE;
    }

    public static final JsonTokenData getTOKEN_NONE() {
        return TOKEN_NONE;
    }

    public static final JsonTokenData getTOKEN_NULL() {
        return TOKEN_NULL;
    }

    public static final JsonTokenData getTOKEN_START_ARRAY() {
        return TOKEN_START_ARRAY;
    }

    public static final JsonTokenData getTOKEN_START_OBJECT() {
        return TOKEN_START_OBJECT;
    }

    public static final JsonTokenData getTOKEN_TRUE() {
        return TOKEN_TRUE;
    }

    public static final boolean isIntegerForStrippedTrailingZeroes(BigDecimal bigDecimal) {
        j.g(bigDecimal, "receiver$0");
        if (bigDecimal.scale() <= 0) {
            return true;
        }
        return false;
    }

    public static final int standardizedHashCode(Number number) {
        j.g(number, "receiver$0");
        return Double.valueOf(number.doubleValue()).hashCode();
    }
}
