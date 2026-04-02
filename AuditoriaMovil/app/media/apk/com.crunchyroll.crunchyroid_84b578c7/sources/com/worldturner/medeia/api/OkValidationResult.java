package com.worldturner.medeia.api;

import kotlin.Metadata;
/* compiled from: ValidationResult.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/worldturner/medeia/api/OkValidationResult;", "Lcom/worldturner/medeia/api/ValidationResult;", "()V", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class OkValidationResult extends ValidationResult {
    public static final OkValidationResult INSTANCE = new OkValidationResult();

    private OkValidationResult() {
        super(true, null);
    }
}
