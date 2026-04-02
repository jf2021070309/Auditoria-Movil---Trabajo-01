package com.worldturner.medeia.schema.model;

import com.amazon.aps.iva.kb0.o;
import com.amazon.aps.iva.yb0.j;
import java.util.Locale;
import kotlin.Metadata;
/* compiled from: JsonSchema.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/worldturner/medeia/schema/model/SimpleType;", "", "(Ljava/lang/String;I)V", "toString", "", "ARRAY", "BOOLEAN", "INTEGER", "NULL", "NUMBER", "OBJECT", "STRING", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public enum SimpleType {
    ARRAY,
    BOOLEAN,
    INTEGER,
    NULL,
    NUMBER,
    OBJECT,
    STRING;

    @Override // java.lang.Enum
    public String toString() {
        String str = super.toString();
        Locale locale = Locale.US;
        j.b(locale, "Locale.US");
        if (str != null) {
            String lowerCase = str.toLowerCase(locale);
            j.b(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            return lowerCase;
        }
        throw new o("null cannot be cast to non-null type java.lang.String");
    }
}
