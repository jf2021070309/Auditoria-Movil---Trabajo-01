package com.worldturner.medeia.schema.validation;

import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.worldturner.medeia.schema.validation.stream.SchemaValidatorInstance;
import java.net.URI;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: IfThenElseValidator.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B#\u0012\u0006\u0010\u000b\u001a\u00020\u0001\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u0017\u0010\u000b\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/worldturner/medeia/schema/validation/IfThenElseValidator;", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "", "startLevel", "Lcom/worldturner/medeia/schema/validation/stream/SchemaValidatorInstance;", "createInstance", "", "Ljava/net/URI;", "unknownRefs", "Lcom/amazon/aps/iva/kb0/q;", "recordUnknownRefs", "ifValidator", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "getIfValidator", "()Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "thenValidator", "getThenValidator", "elseValidator", "getElseValidator", "<init>", "(Lcom/worldturner/medeia/schema/validation/SchemaValidator;Lcom/worldturner/medeia/schema/validation/SchemaValidator;Lcom/worldturner/medeia/schema/validation/SchemaValidator;)V", "Companion", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class IfThenElseValidator implements SchemaValidator {
    public static final Companion Companion = new Companion(null);
    private final SchemaValidator elseValidator;
    private final SchemaValidator ifValidator;
    private final SchemaValidator thenValidator;

    /* compiled from: IfThenElseValidator.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006¨\u0006\t"}, d2 = {"Lcom/worldturner/medeia/schema/validation/IfThenElseValidator$Companion;", "", "()V", "create", "Lcom/worldturner/medeia/schema/validation/IfThenElseValidator;", "ifValidator", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "thenValidator", "elseValidator", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final IfThenElseValidator create(SchemaValidator schemaValidator, SchemaValidator schemaValidator2, SchemaValidator schemaValidator3) {
            if (schemaValidator != null) {
                return new IfThenElseValidator(schemaValidator, schemaValidator2, schemaValidator3);
            }
            return null;
        }
    }

    public IfThenElseValidator(SchemaValidator schemaValidator, SchemaValidator schemaValidator2, SchemaValidator schemaValidator3) {
        j.g(schemaValidator, "ifValidator");
        this.ifValidator = schemaValidator;
        this.thenValidator = schemaValidator2;
        this.elseValidator = schemaValidator3;
    }

    @Override // com.worldturner.medeia.schema.validation.SchemaValidator
    public SchemaValidatorInstance createInstance(int i) {
        SchemaValidatorInstance schemaValidatorInstance;
        SchemaValidatorInstance createInstance = this.ifValidator.createInstance(i);
        SchemaValidator schemaValidator = this.thenValidator;
        SchemaValidatorInstance schemaValidatorInstance2 = null;
        if (schemaValidator != null) {
            schemaValidatorInstance = schemaValidator.createInstance(i);
        } else {
            schemaValidatorInstance = null;
        }
        SchemaValidator schemaValidator2 = this.elseValidator;
        if (schemaValidator2 != null) {
            schemaValidatorInstance2 = schemaValidator2.createInstance(i);
        }
        return new IfThenElseValidatorInstance(i, createInstance, schemaValidatorInstance, schemaValidatorInstance2);
    }

    public final SchemaValidator getElseValidator() {
        return this.elseValidator;
    }

    public final SchemaValidator getIfValidator() {
        return this.ifValidator;
    }

    public final SchemaValidator getThenValidator() {
        return this.thenValidator;
    }

    @Override // com.worldturner.medeia.schema.validation.SchemaValidator
    public void recordUnknownRefs(Collection<URI> collection) {
        j.g(collection, "unknownRefs");
        this.ifValidator.recordUnknownRefs(collection);
        SchemaValidator schemaValidator = this.thenValidator;
        if (schemaValidator != null) {
            schemaValidator.recordUnknownRefs(collection);
        }
        SchemaValidator schemaValidator2 = this.elseValidator;
        if (schemaValidator2 != null) {
            schemaValidator2.recordUnknownRefs(collection);
        }
    }
}
