package com.worldturner.medeia.schema.validation;

import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.api.UniqueItemsValidationMethod;
import com.worldturner.medeia.schema.validation.stream.SchemaValidatorInstance;
import java.net.URI;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: ArrayUniqueItemsValidator.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¨\u0006\u000e"}, d2 = {"Lcom/worldturner/medeia/schema/validation/ArrayUniqueItemsValidator;", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "", "startLevel", "Lcom/worldturner/medeia/schema/validation/stream/SchemaValidatorInstance;", "createInstance", "", "Ljava/net/URI;", "unknownRefs", "Lcom/amazon/aps/iva/kb0/q;", "recordUnknownRefs", "<init>", "()V", "Companion", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class ArrayUniqueItemsValidator implements SchemaValidator {
    public static final Companion Companion = new Companion(null);

    /* compiled from: ArrayUniqueItemsValidator.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/worldturner/medeia/schema/validation/ArrayUniqueItemsValidator$Companion;", "", "()V", "create", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "uniqueItems", "", FirebaseAnalytics.Param.METHOD, "Lcom/worldturner/medeia/api/UniqueItemsValidationMethod;", "(Ljava/lang/Boolean;Lcom/worldturner/medeia/api/UniqueItemsValidationMethod;)Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final SchemaValidator create(Boolean bool, UniqueItemsValidationMethod uniqueItemsValidationMethod) {
            j.g(uniqueItemsValidationMethod, FirebaseAnalytics.Param.METHOD);
            if (j.a(bool, Boolean.TRUE)) {
                if (uniqueItemsValidationMethod.getDigest()) {
                    return new ArrayUniqueItemsDigestValidator(uniqueItemsValidationMethod.getAlgorithm());
                }
                return new ArrayUniqueItemsValidator();
            }
            return null;
        }
    }

    @Override // com.worldturner.medeia.schema.validation.SchemaValidator
    public SchemaValidatorInstance createInstance(int i) {
        return new ArrayUniqueItemsValidatorInstance(i);
    }

    @Override // com.worldturner.medeia.schema.validation.SchemaValidator
    public void recordUnknownRefs(Collection<URI> collection) {
        j.g(collection, "unknownRefs");
    }
}
