package com.worldturner.medeia.api;

import com.amazon.aps.iva.lb0.o;
import com.amazon.aps.iva.yb0.j;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ValidationFailedException.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\b\u0016\u0012\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\u0010\bR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/worldturner/medeia/api/ValidationFailedException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "failures", "", "Lcom/worldturner/medeia/api/FailedValidationResult;", "([Lcom/worldturner/medeia/api/FailedValidationResult;)V", "", "(Ljava/util/List;)V", "getFailures", "()Ljava/util/List;", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class ValidationFailedException extends RuntimeException {
    private final List<FailedValidationResult> failures;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidationFailedException(List<FailedValidationResult> list) {
        super(list.toString());
        j.g(list, "failures");
        this.failures = list;
    }

    public final List<FailedValidationResult> getFailures() {
        return this.failures;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ValidationFailedException(FailedValidationResult... failedValidationResultArr) {
        this(o.b0(failedValidationResultArr));
        j.g(failedValidationResultArr, "failures");
    }
}
