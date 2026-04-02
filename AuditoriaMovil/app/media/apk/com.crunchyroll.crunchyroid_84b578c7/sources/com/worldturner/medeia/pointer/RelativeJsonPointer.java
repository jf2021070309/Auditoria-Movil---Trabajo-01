package com.worldturner.medeia.pointer;

import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.oe0.q;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: JsonPointer.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/worldturner/medeia/pointer/RelativeJsonPointer;", "", "text", "", "(Ljava/lang/String;)V", "jsonPointer", "Lcom/worldturner/medeia/pointer/JsonPointer;", "getJsonPointer", "()Lcom/worldturner/medeia/pointer/JsonPointer;", "levelsUp", "", "getLevelsUp", "()I", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class RelativeJsonPointer {
    private final JsonPointer jsonPointer;
    private final int levelsUp;

    public RelativeJsonPointer(String str) {
        char[] cArr;
        j.g(str, "text");
        cArr = JsonPointerKt.RJP_SEPARATORS;
        int s0 = q.s0(0, str, false, cArr);
        s0 = s0 == -1 ? str.length() : s0;
        String substring = str.substring(0, s0);
        j.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        if (j.a(substring, "0")) {
            this.levelsUp = 0;
        } else if (!m.h0(substring, "0", false)) {
            try {
                this.levelsUp = Integer.parseInt(substring);
            } catch (NumberFormatException unused) {
                throw new NumberFormatException("Invalid number for '" + substring + "' in '" + str + '\'');
            }
        } else {
            throw new NumberFormatException("Invalid leading zero for '" + substring + "' in '" + str + '\'');
        }
        if (s0 != str.length() && str.charAt(s0) != '/') {
            this.jsonPointer = null;
            return;
        }
        String substring2 = str.substring(s0);
        j.b(substring2, "(this as java.lang.String).substring(startIndex)");
        this.jsonPointer = new JsonPointer(substring2, false, 2, null);
    }

    public final JsonPointer getJsonPointer() {
        return this.jsonPointer;
    }

    public final int getLevelsUp() {
        return this.levelsUp;
    }
}
