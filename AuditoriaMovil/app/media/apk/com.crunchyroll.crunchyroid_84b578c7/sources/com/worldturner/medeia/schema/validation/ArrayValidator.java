package com.worldturner.medeia.schema.validation;

import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.schema.validation.stream.SchemaValidatorInstance;
import java.net.URI;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ArrayValidator.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0012\u0018\u0000  2\u00020\u0001:\u0001 BI\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0015\u0010\u000eR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u001c\u0010\f\u001a\u0004\b\u001d\u0010\u000e¨\u0006!"}, d2 = {"Lcom/worldturner/medeia/schema/validation/ArrayValidator;", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "", "startLevel", "Lcom/worldturner/medeia/schema/validation/stream/SchemaValidatorInstance;", "createInstance", "", "Ljava/net/URI;", "unknownRefs", "Lcom/amazon/aps/iva/kb0/q;", "recordUnknownRefs", "additionalItems", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "getAdditionalItems", "()Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "", FirebaseAnalytics.Param.ITEMS, "Ljava/util/List;", "getItems", "()Ljava/util/List;", "allItems", "getAllItems", "maxItems", "Ljava/lang/Integer;", "getMaxItems", "()Ljava/lang/Integer;", "minItems", "getMinItems", "contains", "getContains", "<init>", "(Lcom/worldturner/medeia/schema/validation/SchemaValidator;Ljava/util/List;Lcom/worldturner/medeia/schema/validation/SchemaValidator;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/worldturner/medeia/schema/validation/SchemaValidator;)V", "Companion", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class ArrayValidator implements SchemaValidator {
    public static final Companion Companion = new Companion(null);
    private final SchemaValidator additionalItems;
    private final SchemaValidator allItems;
    private final SchemaValidator contains;
    private final List<SchemaValidator> items;
    private final Integer maxItems;
    private final Integer minItems;

    /* compiled from: ArrayValidator.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JO\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/worldturner/medeia/schema/validation/ArrayValidator$Companion;", "", "()V", "create", "Lcom/worldturner/medeia/schema/validation/ArrayValidator;", "additionalItems", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", FirebaseAnalytics.Param.ITEMS, "", "allItems", "maxItems", "", "minItems", "contains", "(Lcom/worldturner/medeia/schema/validation/SchemaValidator;Ljava/util/List;Lcom/worldturner/medeia/schema/validation/SchemaValidator;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/worldturner/medeia/schema/validation/SchemaValidator;)Lcom/worldturner/medeia/schema/validation/ArrayValidator;", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final ArrayValidator create(SchemaValidator schemaValidator, List<? extends SchemaValidator> list, SchemaValidator schemaValidator2, Integer num, Integer num2, SchemaValidator schemaValidator3) {
            if (SchemaValidatorKt.isAnyNotNull(schemaValidator, list, schemaValidator2, num, num2, schemaValidator3)) {
                return new ArrayValidator(schemaValidator, list, schemaValidator2, num, num2, schemaValidator3);
            }
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArrayValidator(SchemaValidator schemaValidator, List<? extends SchemaValidator> list, SchemaValidator schemaValidator2, Integer num, Integer num2, SchemaValidator schemaValidator3) {
        this.additionalItems = schemaValidator;
        this.items = list;
        this.allItems = schemaValidator2;
        this.maxItems = num;
        this.minItems = num2;
        this.contains = schemaValidator3;
    }

    @Override // com.worldturner.medeia.schema.validation.SchemaValidator
    public SchemaValidatorInstance createInstance(int i) {
        return new ArrayValidatorInstance(this, i);
    }

    public final SchemaValidator getAdditionalItems() {
        return this.additionalItems;
    }

    public final SchemaValidator getAllItems() {
        return this.allItems;
    }

    public final SchemaValidator getContains() {
        return this.contains;
    }

    public final List<SchemaValidator> getItems() {
        return this.items;
    }

    public final Integer getMaxItems() {
        return this.maxItems;
    }

    public final Integer getMinItems() {
        return this.minItems;
    }

    @Override // com.worldturner.medeia.schema.validation.SchemaValidator
    public void recordUnknownRefs(Collection<URI> collection) {
        j.g(collection, "unknownRefs");
        SchemaValidator schemaValidator = this.additionalItems;
        if (schemaValidator != null) {
            schemaValidator.recordUnknownRefs(collection);
        }
        SchemaValidator schemaValidator2 = this.allItems;
        if (schemaValidator2 != null) {
            schemaValidator2.recordUnknownRefs(collection);
        }
        List<SchemaValidator> list = this.items;
        if (list != null) {
            for (SchemaValidator schemaValidator3 : list) {
                schemaValidator3.recordUnknownRefs(collection);
            }
        }
        SchemaValidator schemaValidator4 = this.contains;
        if (schemaValidator4 != null) {
            schemaValidator4.recordUnknownRefs(collection);
        }
    }
}
