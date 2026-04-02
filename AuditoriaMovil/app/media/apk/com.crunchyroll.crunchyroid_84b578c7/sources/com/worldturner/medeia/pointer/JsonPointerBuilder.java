package com.worldturner.medeia.pointer;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.JsonTokenDataConsumer;
import com.worldturner.medeia.parser.JsonTokenLocation;
import com.worldturner.medeia.parser.JsonTokenType;
import java.util.ArrayList;
import kotlin.Metadata;
/* compiled from: JsonPointerBuilder.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0006\u0010\u000b\u001a\u00020\nR'\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/worldturner/medeia/pointer/JsonPointerBuilder;", "Lcom/worldturner/medeia/parser/JsonTokenDataConsumer;", "Lcom/amazon/aps/iva/kb0/q;", "incrementOnNextRun", "()Lcom/amazon/aps/iva/kb0/q;", "", "jsonPointerLength", "Lcom/worldturner/medeia/parser/JsonTokenData;", "token", "consume", "Lcom/worldturner/medeia/pointer/JsonPointer;", "toJsonPointer", "Ljava/util/ArrayList;", "Lcom/worldturner/medeia/pointer/JsonPointerEntry;", "Lkotlin/collections/ArrayList;", "stack", "Ljava/util/ArrayList;", "getStack", "()Ljava/util/ArrayList;", "<init>", "()V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class JsonPointerBuilder implements JsonTokenDataConsumer {
    private final ArrayList<JsonPointerEntry> stack = new ArrayList<>();

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes4.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JsonTokenType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[JsonTokenType.START_OBJECT.ordinal()] = 1;
            iArr[JsonTokenType.END_OBJECT.ordinal()] = 2;
            iArr[JsonTokenType.START_ARRAY.ordinal()] = 3;
            iArr[JsonTokenType.END_ARRAY.ordinal()] = 4;
            iArr[JsonTokenType.FIELD_NAME.ordinal()] = 5;
        }
    }

    private final q incrementOnNextRun() {
        JsonPointerEntry jsonPointerEntry = (JsonPointerEntry) x.E0(this.stack);
        if (jsonPointerEntry != null) {
            jsonPointerEntry.incrementOnNextRun();
            return q.a;
        }
        return null;
    }

    private final int jsonPointerLength() {
        int size = this.stack.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.stack.get(i2).stringLength();
        }
        return i;
    }

    @Override // com.worldturner.medeia.parser.JsonTokenDataConsumer, com.worldturner.medeia.parser.JsonTokenDataAndLocationConsumer
    public void consume(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        JsonTokenDataConsumer.DefaultImpls.consume(this, jsonTokenData, jsonTokenLocation);
    }

    public final ArrayList<JsonPointerEntry> getStack() {
        return this.stack;
    }

    public final JsonPointer toJsonPointer() {
        StringBuilder sb = new StringBuilder(jsonPointerLength());
        int size = this.stack.size();
        for (int i = 0; i < size; i++) {
            this.stack.get(i).toString(sb);
        }
        String sb2 = sb.toString();
        j.b(sb2, "b.toString()");
        return new JsonPointer(sb2, true);
    }

    @Override // com.worldturner.medeia.parser.JsonTokenDataConsumer
    public void consume(JsonTokenData jsonTokenData) {
        j.g(jsonTokenData, "token");
        JsonPointerEntry jsonPointerEntry = (JsonPointerEntry) x.E0(this.stack);
        if (jsonPointerEntry != null) {
            jsonPointerEntry.incrementIfNecessary();
        }
        int i = WhenMappings.$EnumSwitchMapping$0[jsonTokenData.getType().ordinal()];
        if (i == 1) {
            this.stack.add(new JsonPointerObject());
        } else if (i == 2) {
            ArrayList<JsonPointerEntry> arrayList = this.stack;
            j.b(arrayList.remove(f1.B(arrayList)), "stack.removeAt(stack.lastIndex)");
        } else if (i == 3) {
            this.stack.add(new JsonPointerArray());
        } else if (i == 4) {
            ArrayList<JsonPointerEntry> arrayList2 = this.stack;
            j.b(arrayList2.remove(f1.B(arrayList2)), "stack.removeAt(stack.lastIndex)");
        } else if (i == 5) {
            JsonPointerEntry jsonPointerEntry2 = (JsonPointerEntry) x.D0(this.stack);
            String text = jsonTokenData.getText();
            if (text == null) {
                j.l();
                throw null;
            }
            jsonPointerEntry2.mo63nextProperty(text);
        }
        if (jsonTokenData.getType() != JsonTokenType.FIELD_NAME) {
            incrementOnNextRun();
        }
    }
}
