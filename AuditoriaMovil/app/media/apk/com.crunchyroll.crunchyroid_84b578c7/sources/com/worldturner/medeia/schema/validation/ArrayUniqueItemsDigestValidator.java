package com.worldturner.medeia.schema.validation;

import com.amazon.aps.iva.yb0.j;
import com.worldturner.medeia.schema.validation.stream.SchemaValidatorInstance;
import java.net.URI;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: ArrayUniqueItemsDigestValidatorInstance.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/worldturner/medeia/schema/validation/ArrayUniqueItemsDigestValidator;", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "", "startLevel", "Lcom/worldturner/medeia/schema/validation/stream/SchemaValidatorInstance;", "createInstance", "", "Ljava/net/URI;", "unknownRefs", "Lcom/amazon/aps/iva/kb0/q;", "recordUnknownRefs", "", "digestAlgorithm", "Ljava/lang/String;", "getDigestAlgorithm", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class ArrayUniqueItemsDigestValidator implements SchemaValidator {
    private final String digestAlgorithm;

    public ArrayUniqueItemsDigestValidator(String str) {
        j.g(str, "digestAlgorithm");
        this.digestAlgorithm = str;
    }

    @Override // com.worldturner.medeia.schema.validation.SchemaValidator
    public SchemaValidatorInstance createInstance(int i) {
        return new ArrayUniqueItemsDigestValidatorInstance(i, new ArrayUniqueItemsDigestValidator$createInstance$1(this));
    }

    public final String getDigestAlgorithm() {
        return this.digestAlgorithm;
    }

    @Override // com.worldturner.medeia.schema.validation.SchemaValidator
    public void recordUnknownRefs(Collection<URI> collection) {
        j.g(collection, "unknownRefs");
    }
}
