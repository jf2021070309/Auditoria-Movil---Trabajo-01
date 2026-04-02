package com.worldturner.medeia.schema.validation;

import com.amazon.aps.iva.yb0.j;
import com.worldturner.medeia.schema.validation.stream.SchemaValidatorInstance;
import java.net.URI;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: ObjectValidator.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/worldturner/medeia/schema/validation/ObjectDependenciesValidator;", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "", "startLevel", "Lcom/worldturner/medeia/schema/validation/stream/SchemaValidatorInstance;", "createInstance", "", "Ljava/net/URI;", "unknownRefs", "Lcom/amazon/aps/iva/kb0/q;", "recordUnknownRefs", "Lcom/worldturner/medeia/schema/validation/ObjectValidator;", "validator", "Lcom/worldturner/medeia/schema/validation/ObjectValidator;", "getValidator", "()Lcom/worldturner/medeia/schema/validation/ObjectValidator;", "", "", "dependencies", "Ljava/util/Map;", "getDependencies", "()Ljava/util/Map;", "<init>", "(Lcom/worldturner/medeia/schema/validation/ObjectValidator;Ljava/util/Map;)V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class ObjectDependenciesValidator implements SchemaValidator {
    private final Map<String, SchemaValidator> dependencies;
    private final ObjectValidator validator;

    /* JADX WARN: Multi-variable type inference failed */
    public ObjectDependenciesValidator(ObjectValidator objectValidator, Map<String, ? extends SchemaValidator> map) {
        j.g(objectValidator, "validator");
        j.g(map, "dependencies");
        this.validator = objectValidator;
        this.dependencies = map;
    }

    @Override // com.worldturner.medeia.schema.validation.SchemaValidator
    public SchemaValidatorInstance createInstance(int i) {
        return new ObjectDependenciesValidatorInstance(this.validator, this.dependencies, i);
    }

    public final Map<String, SchemaValidator> getDependencies() {
        return this.dependencies;
    }

    public final ObjectValidator getValidator() {
        return this.validator;
    }

    @Override // com.worldturner.medeia.schema.validation.SchemaValidator
    public void recordUnknownRefs(Collection<URI> collection) {
        j.g(collection, "unknownRefs");
        this.validator.recordUnknownRefs(collection);
        for (SchemaValidator schemaValidator : this.dependencies.values()) {
            schemaValidator.recordUnknownRefs(collection);
        }
    }
}
