package com.worldturner.medeia.schema.validation;

import com.amazon.aps.iva.kb0.o;
import com.amazon.aps.iva.yb0.j;
import java.util.Arrays;
import kotlin.Metadata;
/* compiled from: ArrayUniqueItemsDigestValidatorInstance.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/worldturner/medeia/schema/validation/DigestHashResult;", "Lcom/worldturner/medeia/schema/validation/HashResult;", "digestBytes", "", "([B)V", "getDigestBytes", "()[B", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class DigestHashResult implements HashResult {
    private final byte[] digestBytes;

    public DigestHashResult(byte[] bArr) {
        j.g(bArr, "digestBytes");
        this.digestBytes = bArr;
    }

    public static /* synthetic */ DigestHashResult copy$default(DigestHashResult digestHashResult, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr = digestHashResult.digestBytes;
        }
        return digestHashResult.copy(bArr);
    }

    public final byte[] component1() {
        return this.digestBytes;
    }

    public final DigestHashResult copy(byte[] bArr) {
        j.g(bArr, "digestBytes");
        return new DigestHashResult(bArr);
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!j.a(DigestHashResult.class, cls)) {
            return false;
        }
        if (obj != null) {
            if (Arrays.equals(this.digestBytes, ((DigestHashResult) obj).digestBytes)) {
                return true;
            }
            return false;
        }
        throw new o("null cannot be cast to non-null type com.worldturner.medeia.schema.validation.DigestHashResult");
    }

    public final byte[] getDigestBytes() {
        return this.digestBytes;
    }

    public int hashCode() {
        return Arrays.hashCode(this.digestBytes);
    }

    public String toString() {
        return "DigestHashResult(digestBytes=" + Arrays.toString(this.digestBytes) + ")";
    }
}
