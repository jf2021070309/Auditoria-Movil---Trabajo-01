package com.worldturner.medeia.schema.validation;

import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.worldturner.medeia.schema.validation.stream.SchemaValidatorInstance;
import java.net.URI;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ExistentialValidator.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/worldturner/medeia/schema/validation/ExistentialValidator;", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "", "startLevel", "Lcom/worldturner/medeia/schema/validation/stream/SchemaValidatorInstance;", "createInstance", "", "Ljava/net/URI;", "unknownRefs", "Lcom/amazon/aps/iva/kb0/q;", "recordUnknownRefs", "Lcom/worldturner/medeia/schema/validation/ExistentialOperation;", "operation", "Lcom/worldturner/medeia/schema/validation/ExistentialOperation;", "getOperation", "()Lcom/worldturner/medeia/schema/validation/ExistentialOperation;", "", "validations", "Ljava/util/List;", "getValidations", "()Ljava/util/List;", "<init>", "(Lcom/worldturner/medeia/schema/validation/ExistentialOperation;Ljava/util/List;)V", "Companion", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class ExistentialValidator implements SchemaValidator {
    public static final Companion Companion = new Companion(null);
    private final ExistentialOperation operation;
    private final List<SchemaValidator> validations;

    /* compiled from: ExistentialValidator.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/worldturner/medeia/schema/validation/ExistentialValidator$Companion;", "", "()V", "create", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "operation", "Lcom/worldturner/medeia/schema/validation/ExistentialOperation;", "validations", "", "optimize", "", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final SchemaValidator create(ExistentialOperation existentialOperation, List<? extends SchemaValidator> list, boolean z) {
            ExistentialValidator existentialValidator;
            j.g(existentialOperation, "operation");
            if (list != null) {
                if (z) {
                    if (existentialOperation == ExistentialOperation.ALL_OF) {
                        return new AllOfValidator(list);
                    }
                    if (existentialOperation == ExistentialOperation.ANY_OF) {
                        return new AnyOfValidator(list);
                    }
                    existentialValidator = new ExistentialValidator(existentialOperation, list);
                } else {
                    existentialValidator = new ExistentialValidator(existentialOperation, list);
                }
                return existentialValidator;
            }
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExistentialValidator(ExistentialOperation existentialOperation, List<? extends SchemaValidator> list) {
        j.g(existentialOperation, "operation");
        j.g(list, "validations");
        this.operation = existentialOperation;
        this.validations = list;
    }

    @Override // com.worldturner.medeia.schema.validation.SchemaValidator
    public SchemaValidatorInstance createInstance(int i) {
        return new ExistentialValidatorInstance(this.operation, i, this.validations);
    }

    public final ExistentialOperation getOperation() {
        return this.operation;
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
