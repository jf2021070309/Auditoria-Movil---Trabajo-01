package com.worldturner.medeia.schema.validation;

import com.worldturner.medeia.schema.validation.stream.SchemaValidatorInstance;
import java.net.URI;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: SchemaValidator.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¨\u0006\u000b"}, d2 = {"Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "", "", "startLevel", "Lcom/worldturner/medeia/schema/validation/stream/SchemaValidatorInstance;", "createInstance", "", "Ljava/net/URI;", "unknownRefs", "Lcom/amazon/aps/iva/kb0/q;", "recordUnknownRefs", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public interface SchemaValidator {

    /* compiled from: SchemaValidator.kt */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ SchemaValidatorInstance createInstance$default(SchemaValidator schemaValidator, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    i = 0;
                }
                return schemaValidator.createInstance(i);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createInstance");
        }
    }

    SchemaValidatorInstance createInstance(int i);

    void recordUnknownRefs(Collection<URI> collection);
}
