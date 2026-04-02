package com.worldturner.medeia.parser.gson;

import com.amazon.aps.iva.yb0.j;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import kotlin.Metadata;
/* compiled from: gsonUtils.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0004"}, d2 = {"Lcom/google/gson/stream/JsonReader;", "reader", "Lcom/amazon/aps/iva/kb0/q;", "gsonParseAll", "medeia-validator-gson"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class GsonUtilsKt {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes4.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[JsonToken.NUMBER.ordinal()] = 1;
            iArr[JsonToken.STRING.ordinal()] = 2;
            iArr[JsonToken.NAME.ordinal()] = 3;
            iArr[JsonToken.BOOLEAN.ordinal()] = 4;
            iArr[JsonToken.NULL.ordinal()] = 5;
            iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 6;
            iArr[JsonToken.END_ARRAY.ordinal()] = 7;
            iArr[JsonToken.BEGIN_OBJECT.ordinal()] = 8;
            iArr[JsonToken.END_OBJECT.ordinal()] = 9;
            iArr[JsonToken.END_DOCUMENT.ordinal()] = 10;
        }
    }

    public static final void gsonParseAll(JsonReader jsonReader) {
        j.g(jsonReader, "reader");
        while (true) {
            JsonToken peek = jsonReader.peek();
            if (peek != null) {
                switch (WhenMappings.$EnumSwitchMapping$0[peek.ordinal()]) {
                    case 1:
                        jsonReader.nextString();
                        break;
                    case 2:
                        jsonReader.nextString();
                        break;
                    case 3:
                        jsonReader.nextName();
                        break;
                    case 4:
                        jsonReader.nextBoolean();
                        break;
                    case 5:
                        jsonReader.nextNull();
                        break;
                    case 6:
                        jsonReader.beginArray();
                        break;
                    case 7:
                        jsonReader.endArray();
                        break;
                    case 8:
                        jsonReader.beginObject();
                        break;
                    case 9:
                        jsonReader.endObject();
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
