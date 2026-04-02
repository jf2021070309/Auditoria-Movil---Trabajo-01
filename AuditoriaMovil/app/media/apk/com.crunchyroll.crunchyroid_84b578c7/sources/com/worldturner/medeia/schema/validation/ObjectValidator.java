package com.worldturner.medeia.schema.validation;

import com.amazon.aps.iva.oe0.f;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.worldturner.medeia.schema.validation.stream.SchemaValidatorInstance;
import java.net.URI;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: ObjectValidator.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 '2\u00020\u0001:\u0001'By\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0001\u0012\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001b\u0012\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001b\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR%\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR%\u0010!\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u0019\u0010#\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010\u001a¨\u0006("}, d2 = {"Lcom/worldturner/medeia/schema/validation/ObjectValidator;", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "", "startLevel", "Lcom/worldturner/medeia/schema/validation/stream/SchemaValidatorInstance;", "createInstance", "", "Ljava/net/URI;", "unknownRefs", "Lcom/amazon/aps/iva/kb0/q;", "recordUnknownRefs", "maxProperties", "Ljava/lang/Integer;", "getMaxProperties", "()Ljava/lang/Integer;", "minProperties", "getMinProperties", "", "", "required", "Ljava/util/Set;", "getRequired", "()Ljava/util/Set;", "additionalProperties", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "getAdditionalProperties", "()Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "", "properties", "Ljava/util/Map;", "getProperties", "()Ljava/util/Map;", "Lcom/amazon/aps/iva/oe0/f;", "patternProperties", "getPatternProperties", "propertyNames", "getPropertyNames", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Set;Lcom/worldturner/medeia/schema/validation/SchemaValidator;Ljava/util/Map;Ljava/util/Map;Lcom/worldturner/medeia/schema/validation/SchemaValidator;)V", "Companion", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class ObjectValidator implements SchemaValidator {
    public static final Companion Companion = new Companion(null);
    private final SchemaValidator additionalProperties;
    private final Integer maxProperties;
    private final Integer minProperties;
    private final Map<f, SchemaValidator> patternProperties;
    private final Map<String, SchemaValidator> properties;
    private final SchemaValidator propertyNames;
    private final Set<String> required;

    /* compiled from: ObjectValidator.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0089\u0001\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/worldturner/medeia/schema/validation/ObjectValidator$Companion;", "", "", "maxProperties", "minProperties", "", "", "required", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "additionalProperties", "", "properties", "Lcom/amazon/aps/iva/oe0/f;", "patternProperties", "propertyNames", "dependencies", "create", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Set;Lcom/worldturner/medeia/schema/validation/SchemaValidator;Ljava/util/Map;Ljava/util/Map;Lcom/worldturner/medeia/schema/validation/SchemaValidator;Ljava/util/Map;)Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "<init>", "()V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final SchemaValidator create(Integer num, Integer num2, Set<String> set, SchemaValidator schemaValidator, Map<String, ? extends SchemaValidator> map, Map<f, ? extends SchemaValidator> map2, SchemaValidator schemaValidator2, Map<String, ? extends SchemaValidator> map3) {
            if (map3 != null) {
                return new ObjectDependenciesValidator(new ObjectValidator(num, num2, set, schemaValidator, map, map2, schemaValidator2), map3);
            }
            if (SchemaValidatorKt.isAnyNotNull(num, num2, set, schemaValidator, map, map2, schemaValidator2)) {
                return new ObjectValidator(num, num2, set, schemaValidator, map, map2, schemaValidator2);
            }
            return null;
        }
    }

    public ObjectValidator() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    @Override // com.worldturner.medeia.schema.validation.SchemaValidator
    public SchemaValidatorInstance createInstance(int i) {
        return new ObjectValidatorInstance(this, i);
    }

    public final SchemaValidator getAdditionalProperties() {
        return this.additionalProperties;
    }

    public final Integer getMaxProperties() {
        return this.maxProperties;
    }

    public final Integer getMinProperties() {
        return this.minProperties;
    }

    public final Map<f, SchemaValidator> getPatternProperties() {
        return this.patternProperties;
    }

    public final Map<String, SchemaValidator> getProperties() {
        return this.properties;
    }

    public final SchemaValidator getPropertyNames() {
        return this.propertyNames;
    }

    public final Set<String> getRequired() {
        return this.required;
    }

    @Override // com.worldturner.medeia.schema.validation.SchemaValidator
    public void recordUnknownRefs(Collection<URI> collection) {
        Collection<SchemaValidator> values;
        Collection<SchemaValidator> values2;
        j.g(collection, "unknownRefs");
        SchemaValidator schemaValidator = this.additionalProperties;
        if (schemaValidator != null) {
            schemaValidator.recordUnknownRefs(collection);
        }
        Map<String, SchemaValidator> map = this.properties;
        if (map != null && (values2 = map.values()) != null) {
            for (SchemaValidator schemaValidator2 : values2) {
                schemaValidator2.recordUnknownRefs(collection);
            }
        }
        Map<f, SchemaValidator> map2 = this.patternProperties;
        if (map2 != null && (values = map2.values()) != null) {
            for (SchemaValidator schemaValidator3 : values) {
                schemaValidator3.recordUnknownRefs(collection);
            }
        }
        SchemaValidator schemaValidator4 = this.propertyNames;
        if (schemaValidator4 != null) {
            schemaValidator4.recordUnknownRefs(collection);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ObjectValidator(Integer num, Integer num2, Set<String> set, SchemaValidator schemaValidator, Map<String, ? extends SchemaValidator> map, Map<f, ? extends SchemaValidator> map2, SchemaValidator schemaValidator2) {
        this.maxProperties = num;
        this.minProperties = num2;
        this.required = set;
        this.additionalProperties = schemaValidator;
        this.properties = map;
        this.patternProperties = map2;
        this.propertyNames = schemaValidator2;
    }

    public /* synthetic */ ObjectValidator(Integer num, Integer num2, Set set, SchemaValidator schemaValidator, Map map, Map map2, SchemaValidator schemaValidator2, int i, e eVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : set, (i & 8) != 0 ? null : schemaValidator, (i & 16) != 0 ? null : map, (i & 32) != 0 ? null : map2, (i & 64) != 0 ? null : schemaValidator2);
    }
}
