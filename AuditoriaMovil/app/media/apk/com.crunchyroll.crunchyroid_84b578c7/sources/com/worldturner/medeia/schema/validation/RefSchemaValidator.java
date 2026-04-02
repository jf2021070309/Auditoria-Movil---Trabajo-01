package com.worldturner.medeia.schema.validation;

import com.amazon.aps.iva.yb0.j;
import com.worldturner.medeia.schema.validation.stream.SchemaValidatorInstance;
import java.net.URI;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: SchemaValidator.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R$\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/worldturner/medeia/schema/validation/RefSchemaValidator;", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "", "startLevel", "Lcom/worldturner/medeia/schema/validation/stream/SchemaValidatorInstance;", "createInstance", "", "Ljava/net/URI;", "unknownRefs", "Lcom/amazon/aps/iva/kb0/q;", "recordUnknownRefs", "resolved", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "getResolved", "()Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "setResolved", "(Lcom/worldturner/medeia/schema/validation/SchemaValidator;)V", "ref", "Ljava/net/URI;", "getRef", "()Ljava/net/URI;", "", "ids", "Ljava/util/Map;", "getIds", "()Ljava/util/Map;", "<init>", "(Ljava/net/URI;Ljava/util/Map;)V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class RefSchemaValidator implements SchemaValidator {
    private final Map<URI, SchemaValidator> ids;
    private final URI ref;
    private SchemaValidator resolved;

    /* JADX WARN: Multi-variable type inference failed */
    public RefSchemaValidator(URI uri, Map<URI, ? extends SchemaValidator> map) {
        j.g(uri, "ref");
        j.g(map, "ids");
        this.ref = uri;
        this.ids = map;
    }

    @Override // com.worldturner.medeia.schema.validation.SchemaValidator
    public SchemaValidatorInstance createInstance(int i) {
        SchemaValidatorInstance createInstance;
        SchemaValidator schemaValidator = this.resolved;
        if (schemaValidator != null) {
            return schemaValidator.createInstance(i);
        }
        SchemaValidator schemaValidator2 = this.ids.get(this.ref);
        this.resolved = schemaValidator2;
        if (schemaValidator2 == null || (createInstance = schemaValidator2.createInstance(i)) == null) {
            return new PredeterminedSchemaValidatorInstance("$ref", "Cannot find $ref " + this.ref);
        }
        return createInstance;
    }

    public final Map<URI, SchemaValidator> getIds() {
        return this.ids;
    }

    public final URI getRef() {
        return this.ref;
    }

    public final SchemaValidator getResolved() {
        return this.resolved;
    }

    @Override // com.worldturner.medeia.schema.validation.SchemaValidator
    public void recordUnknownRefs(Collection<URI> collection) {
        j.g(collection, "unknownRefs");
        if (!this.ids.containsKey(this.ref)) {
            collection.add(this.ref);
        }
    }

    public final void setResolved(SchemaValidator schemaValidator) {
        this.resolved = schemaValidator;
    }
}
