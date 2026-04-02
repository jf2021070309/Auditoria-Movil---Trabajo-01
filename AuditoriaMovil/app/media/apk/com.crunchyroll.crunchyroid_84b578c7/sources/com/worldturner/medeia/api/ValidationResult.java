package com.worldturner.medeia.api;

import com.amazon.aps.iva.yb0.e;
import kotlin.Metadata;
/* compiled from: ValidationResult.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/worldturner/medeia/api/ValidationResult;", "", "valid", "", "(Z)V", "getValid", "()Z", "Lcom/worldturner/medeia/api/OkValidationResult;", "Lcom/worldturner/medeia/api/FailedValidationResult;", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public abstract class ValidationResult {
    private final boolean valid;

    private ValidationResult(boolean z) {
        this.valid = z;
    }

    public final boolean getValid() {
        return this.valid;
    }

    public /* synthetic */ ValidationResult(boolean z, e eVar) {
        this(z);
    }
}
