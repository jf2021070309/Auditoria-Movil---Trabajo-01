package com.worldturner.medeia.schema.validation;

import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: SchemaValidator.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a#\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\"\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"isAnyNotNull", "", "args", "", "", "([Ljava/lang/Object;)Z", "medeia-validator-core"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class SchemaValidatorKt {
    public static final boolean isAnyNotNull(Object... objArr) {
        boolean z;
        j.g(objArr, "args");
        for (Object obj : objArr) {
            if (obj != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
