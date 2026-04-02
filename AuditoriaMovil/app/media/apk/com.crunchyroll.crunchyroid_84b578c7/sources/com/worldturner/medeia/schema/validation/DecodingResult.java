package com.worldturner.medeia.schema.validation;

import com.amazon.aps.iva.oe0.a;
import com.amazon.aps.iva.yb0.e;
import com.worldturner.medeia.api.FailedValidationResult;
import kotlin.Metadata;
/* compiled from: ContentValidator.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0005H\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/worldturner/medeia/schema/validation/DecodingResult;", "", "array", "", "string", "", "failure", "Lcom/worldturner/medeia/api/FailedValidationResult;", "([BLjava/lang/String;Lcom/worldturner/medeia/api/FailedValidationResult;)V", "getArray", "()[B", "getFailure", "()Lcom/worldturner/medeia/api/FailedValidationResult;", "getString", "()Ljava/lang/String;", "toString", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class DecodingResult {
    private final byte[] array;
    private final FailedValidationResult failure;
    private final String string;

    public DecodingResult() {
        this(null, null, null, 7, null);
    }

    public final byte[] getArray() {
        return this.array;
    }

    public final FailedValidationResult getFailure() {
        return this.failure;
    }

    public final String getString() {
        return this.string;
    }

    public String toString() {
        String str = this.string;
        if (str != null) {
            return str;
        }
        byte[] bArr = this.array;
        if (bArr != null) {
            return new String(bArr, a.b);
        }
        throw new IllegalStateException();
    }

    public DecodingResult(byte[] bArr, String str, FailedValidationResult failedValidationResult) {
        this.array = bArr;
        this.string = str;
        this.failure = failedValidationResult;
    }

    public /* synthetic */ DecodingResult(byte[] bArr, String str, FailedValidationResult failedValidationResult, int i, e eVar) {
        this((i & 1) != 0 ? null : bArr, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : failedValidationResult);
    }
}
