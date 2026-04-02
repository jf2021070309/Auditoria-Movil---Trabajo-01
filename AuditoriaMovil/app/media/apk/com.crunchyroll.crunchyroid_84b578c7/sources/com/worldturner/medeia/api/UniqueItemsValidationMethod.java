package com.worldturner.medeia.api;

import kotlin.Metadata;
/* compiled from: ValidationOptions.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/worldturner/medeia/api/UniqueItemsValidationMethod;", "", "digest", "", "algorithm", "", "(Ljava/lang/String;IZLjava/lang/String;)V", "getAlgorithm", "()Ljava/lang/String;", "getDigest", "()Z", "DIGEST_MD5", "DIGEST_SHA1", "DIGEST_SHA256", "DIGEST_SHA512", "IN_MEMORY_TREES", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public enum UniqueItemsValidationMethod {
    DIGEST_MD5(true, "MD5"),
    DIGEST_SHA1(true, "SHA"),
    DIGEST_SHA256(true, "SHA-256"),
    DIGEST_SHA512(true, "SHA-512"),
    IN_MEMORY_TREES(false, "n/a");
    
    private final String algorithm;
    private final boolean digest;

    UniqueItemsValidationMethod(boolean z, String str) {
        this.digest = z;
        this.algorithm = str;
    }

    public final String getAlgorithm() {
        return this.algorithm;
    }

    public final boolean getDigest() {
        return this.digest;
    }
}
