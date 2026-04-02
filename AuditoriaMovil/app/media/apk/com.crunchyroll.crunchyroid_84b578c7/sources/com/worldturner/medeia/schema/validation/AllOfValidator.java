package com.worldturner.medeia.schema.validation;

import com.amazon.aps.iva.yb0.j;
import com.worldturner.medeia.schema.validation.stream.SchemaValidatorInstance;
import java.net.URI;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ExistentialValidator.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/worldturner/medeia/schema/validation/AllOfValidator;", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "", "startLevel", "Lcom/worldturner/medeia/schema/validation/stream/SchemaValidatorInstance;", "createInstance", "", "Ljava/net/URI;", "unknownRefs", "Lcom/amazon/aps/iva/kb0/q;", "recordUnknownRefs", "", "validations", "Ljava/util/List;", "getValidations", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class AllOfValidator implements SchemaValidator {
    private final List<SchemaValidator> validations;

    /* JADX WARN: Multi-variable type inference failed */
    public AllOfValidator(List<? extends SchemaValidator> list) {
        j.g(list, "validations");
        this.validations = list;
    }

    @Override // com.worldturner.medeia.schema.validation.SchemaValidator
    public SchemaValidatorInstance createInstance(int i) {
        return new AllOfValidatorInstance(i, this.validations);
    }

    public final List<SchemaValidator> getValidations() {
        return this.validations;
    }

    @Override // com.worldturner.medeia.schema.validation.SchemaValidator
    public void recordUnknownRefs(Collection<URI> collection) {
        j.g(collection, "unknownRefs");
        for (SchemaValidator schemaValidator : this.validations) {
            schemaValidator.recordUnknownRefs(collection);
        }
    }
}
