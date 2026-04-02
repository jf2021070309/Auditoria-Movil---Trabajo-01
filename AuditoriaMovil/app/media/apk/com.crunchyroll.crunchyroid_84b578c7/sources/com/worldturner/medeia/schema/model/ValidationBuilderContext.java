package com.worldturner.medeia.schema.model;

import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.va0.f;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.worldturner.medeia.api.ValidationOptions;
import com.worldturner.medeia.schema.validation.SchemaValidator;
import java.net.URI;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: ValidationBuilderContext.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0012\u0012\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u0012\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b4\u00105J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fJ\u0010\u0010\u0003\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0002J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0002HÆ\u0003J\u0015\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0012HÆ\u0003J\u0015\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u0012HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0017HÆ\u0003Jc\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00122\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u00122\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u0017HÆ\u0001J\t\u0010\u001f\u001a\u00020\u001eHÖ\u0001J\t\u0010!\u001a\u00020 HÖ\u0001J\u0013\u0010#\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010)R#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00128\u0006¢\u0006\f\n\u0004\b\u0019\u0010*\u001a\u0004\b+\u0010,R#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u00128\u0006¢\u0006\f\n\u0004\b\u001a\u0010*\u001a\u0004\b-\u0010,R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00158\u0006¢\u0006\f\n\u0004\b\u001b\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u001c\u00101\u001a\u0004\b2\u00103¨\u00066"}, d2 = {"Lcom/worldturner/medeia/schema/model/ValidationBuilderContext;", "", "Ljava/net/URI;", "baseUri", "", "root", "withBaseUri", "Lcom/worldturner/medeia/schema/model/JsonSchema;", "parent", "withParent", "id", "schema", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "validator", "Lcom/amazon/aps/iva/kb0/q;", "put", "component1", "component2", "", "component3", "component4", "", "component5", "Lcom/worldturner/medeia/api/ValidationOptions;", "component6", "ids", "schemaValidatorsById", "parents", "options", "copy", "", "toString", "", "hashCode", "other", "equals", "Z", "getRoot", "()Z", "Ljava/net/URI;", "getBaseUri", "()Ljava/net/URI;", "Ljava/util/Map;", "getIds", "()Ljava/util/Map;", "getSchemaValidatorsById", "Ljava/util/List;", "getParents", "()Ljava/util/List;", "Lcom/worldturner/medeia/api/ValidationOptions;", "getOptions", "()Lcom/worldturner/medeia/api/ValidationOptions;", "<init>", "(ZLjava/net/URI;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Lcom/worldturner/medeia/api/ValidationOptions;)V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class ValidationBuilderContext {
    private final URI baseUri;
    private final Map<URI, JsonSchema> ids;
    private final ValidationOptions options;
    private final List<JsonSchema> parents;
    private final boolean root;
    private final Map<URI, SchemaValidator> schemaValidatorsById;

    public ValidationBuilderContext() {
        this(false, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ ValidationBuilderContext copy$default(ValidationBuilderContext validationBuilderContext, boolean z, URI uri, Map map, Map map2, List list, ValidationOptions validationOptions, int i, Object obj) {
        if ((i & 1) != 0) {
            z = validationBuilderContext.root;
        }
        if ((i & 2) != 0) {
            uri = validationBuilderContext.baseUri;
        }
        URI uri2 = uri;
        Map<URI, JsonSchema> map3 = map;
        if ((i & 4) != 0) {
            map3 = validationBuilderContext.ids;
        }
        Map map4 = map3;
        Map<URI, SchemaValidator> map5 = map2;
        if ((i & 8) != 0) {
            map5 = validationBuilderContext.schemaValidatorsById;
        }
        Map map6 = map5;
        List<JsonSchema> list2 = list;
        if ((i & 16) != 0) {
            list2 = validationBuilderContext.parents;
        }
        List list3 = list2;
        if ((i & 32) != 0) {
            validationOptions = validationBuilderContext.options;
        }
        return validationBuilderContext.copy(z, uri2, map4, map6, list3, validationOptions);
    }

    public static /* synthetic */ ValidationBuilderContext withBaseUri$default(ValidationBuilderContext validationBuilderContext, URI uri, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return validationBuilderContext.withBaseUri(uri, z);
    }

    public final URI baseUri(URI uri) {
        URI e;
        if (uri == null || (e = f.e(this.baseUri, uri)) == null) {
            return this.baseUri;
        }
        return e;
    }

    public final boolean component1() {
        return this.root;
    }

    public final URI component2() {
        return this.baseUri;
    }

    public final Map<URI, JsonSchema> component3() {
        return this.ids;
    }

    public final Map<URI, SchemaValidator> component4() {
        return this.schemaValidatorsById;
    }

    public final List<JsonSchema> component5() {
        return this.parents;
    }

    public final ValidationOptions component6() {
        return this.options;
    }

    public final ValidationBuilderContext copy(boolean z, URI uri, Map<URI, JsonSchema> map, Map<URI, SchemaValidator> map2, List<JsonSchema> list, ValidationOptions validationOptions) {
        j.g(uri, "baseUri");
        j.g(map, "ids");
        j.g(map2, "schemaValidatorsById");
        j.g(list, "parents");
        j.g(validationOptions, "options");
        return new ValidationBuilderContext(z, uri, map, map2, list, validationOptions);
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (obj instanceof ValidationBuilderContext) {
                ValidationBuilderContext validationBuilderContext = (ValidationBuilderContext) obj;
                if (this.root == validationBuilderContext.root) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z || !j.a(this.baseUri, validationBuilderContext.baseUri) || !j.a(this.ids, validationBuilderContext.ids) || !j.a(this.schemaValidatorsById, validationBuilderContext.schemaValidatorsById) || !j.a(this.parents, validationBuilderContext.parents) || !j.a(this.options, validationBuilderContext.options)) {
                }
            }
            return false;
        }
        return true;
    }

    public final URI getBaseUri() {
        return this.baseUri;
    }

    public final Map<URI, JsonSchema> getIds() {
        return this.ids;
    }

    public final ValidationOptions getOptions() {
        return this.options;
    }

    public final List<JsonSchema> getParents() {
        return this.parents;
    }

    public final boolean getRoot() {
        return this.root;
    }

    public final Map<URI, SchemaValidator> getSchemaValidatorsById() {
        return this.schemaValidatorsById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z = this.root;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i5 = r0 * 31;
        URI uri = this.baseUri;
        int i6 = 0;
        if (uri != null) {
            i = uri.hashCode();
        } else {
            i = 0;
        }
        int i7 = (i5 + i) * 31;
        Map<URI, JsonSchema> map = this.ids;
        if (map != null) {
            i2 = map.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 31;
        Map<URI, SchemaValidator> map2 = this.schemaValidatorsById;
        if (map2 != null) {
            i3 = map2.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        List<JsonSchema> list = this.parents;
        if (list != null) {
            i4 = list.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        ValidationOptions validationOptions = this.options;
        if (validationOptions != null) {
            i6 = validationOptions.hashCode();
        }
        return i10 + i6;
    }

    public final void put(URI uri, JsonSchema jsonSchema, SchemaValidator schemaValidator) {
        boolean z;
        j.g(uri, "id");
        j.g(jsonSchema, "schema");
        j.g(schemaValidator, "validator");
        if (this.ids.containsKey(uri)) {
            String uri2 = uri.toString();
            j.b(uri2, "id.toString()");
            if (uri2.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                throw new IllegalStateException("Duplicate schema id registration: '" + uri + '\'');
            }
            return;
        }
        this.ids.put(uri, jsonSchema);
        this.schemaValidatorsById.put(uri, schemaValidator);
    }

    public String toString() {
        return "ValidationBuilderContext(root=" + this.root + ", baseUri=" + this.baseUri + ", ids=" + this.ids + ", schemaValidatorsById=" + this.schemaValidatorsById + ", parents=" + this.parents + ", options=" + this.options + ")";
    }

    public final ValidationBuilderContext withBaseUri(URI uri, boolean z) {
        j.g(uri, "baseUri");
        return copy$default(this, z, uri, null, null, null, null, 60, null);
    }

    public final ValidationBuilderContext withParent(JsonSchema jsonSchema) {
        j.g(jsonSchema, "parent");
        return copy$default(this, false, null, null, null, x.M0(this.parents, jsonSchema), null, 47, null);
    }

    public ValidationBuilderContext(boolean z, URI uri, Map<URI, JsonSchema> map, Map<URI, SchemaValidator> map2, List<JsonSchema> list, ValidationOptions validationOptions) {
        j.g(uri, "baseUri");
        j.g(map, "ids");
        j.g(map2, "schemaValidatorsById");
        j.g(list, "parents");
        j.g(validationOptions, "options");
        this.root = z;
        this.baseUri = uri;
        this.ids = map;
        this.schemaValidatorsById = map2;
        this.parents = list;
        this.options = validationOptions;
    }

    public ValidationBuilderContext(boolean z, URI uri, Map map, Map map2, List list, ValidationOptions validationOptions, int i, e eVar) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? f.a : uri, (i & 4) != 0 ? new LinkedHashMap() : map, (i & 8) != 0 ? new LinkedHashMap() : map2, (i & 16) != 0 ? z.b : list, (i & 32) != 0 ? ValidationOptions.DEFAULT : validationOptions);
    }
}
