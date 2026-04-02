package com.worldturner.medeia.schema.model;

import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.cast.MediaTrack;
import com.worldturner.medeia.schema.validation.SchemaValidator;
import java.net.URI;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: JsonSchemaSet.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0001HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004HÆ\u0003J#\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/worldturner/medeia/schema/model/JsonSchemaSet;", "Lcom/worldturner/medeia/schema/model/Schema;", MediaTrack.ROLE_MAIN, "additional", "", "(Lcom/worldturner/medeia/schema/model/Schema;Ljava/util/Set;)V", "getAdditional", "()Ljava/util/Set;", "getMain", "()Lcom/worldturner/medeia/schema/model/Schema;", "resolvedId", "Ljava/net/URI;", "getResolvedId", "()Ljava/net/URI;", "setResolvedId", "(Ljava/net/URI;)V", "buildValidator", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "context", "Lcom/worldturner/medeia/schema/model/ValidationBuilderContext;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class JsonSchemaSet implements Schema {
    private final Set<Schema> additional;
    private final Schema main;
    private URI resolvedId;

    /* JADX WARN: Multi-variable type inference failed */
    public JsonSchemaSet(Schema schema, Set<? extends Schema> set) {
        j.g(schema, MediaTrack.ROLE_MAIN);
        j.g(set, "additional");
        this.main = schema;
        this.additional = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JsonSchemaSet copy$default(JsonSchemaSet jsonSchemaSet, Schema schema, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            schema = jsonSchemaSet.main;
        }
        if ((i & 2) != 0) {
            set = jsonSchemaSet.additional;
        }
        return jsonSchemaSet.copy(schema, set);
    }

    @Override // com.worldturner.medeia.schema.model.Schema
    public SchemaValidator buildValidator(ValidationBuilderContext validationBuilderContext) {
        j.g(validationBuilderContext, "context");
        SchemaValidator buildValidator = this.main.buildValidator(validationBuilderContext);
        Set<Schema> set = this.additional;
        ArrayList arrayList = new ArrayList(r.Y(set));
        for (Schema schema : set) {
            arrayList.add(schema.buildValidator(validationBuilderContext));
        }
        return buildValidator;
    }

    public final Schema component1() {
        return this.main;
    }

    public final Set<Schema> component2() {
        return this.additional;
    }

    public final JsonSchemaSet copy(Schema schema, Set<? extends Schema> set) {
        j.g(schema, MediaTrack.ROLE_MAIN);
        j.g(set, "additional");
        return new JsonSchemaSet(schema, set);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof JsonSchemaSet) {
                JsonSchemaSet jsonSchemaSet = (JsonSchemaSet) obj;
                if (!j.a(this.main, jsonSchemaSet.main) || !j.a(this.additional, jsonSchemaSet.additional)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final Set<Schema> getAdditional() {
        return this.additional;
    }

    public final Schema getMain() {
        return this.main;
    }

    @Override // com.worldturner.medeia.schema.model.Schema
    public URI getResolvedId() {
        return this.resolvedId;
    }

    public int hashCode() {
        int i;
        Schema schema = this.main;
        int i2 = 0;
        if (schema != null) {
            i = schema.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Set<Schema> set = this.additional;
        if (set != null) {
            i2 = set.hashCode();
        }
        return i3 + i2;
    }

    @Override // com.worldturner.medeia.schema.model.Schema
    public void setResolvedId(URI uri) {
        this.resolvedId = uri;
    }

    public String toString() {
        return "JsonSchemaSet(main=" + this.main + ", additional=" + this.additional + ")";
    }
}
