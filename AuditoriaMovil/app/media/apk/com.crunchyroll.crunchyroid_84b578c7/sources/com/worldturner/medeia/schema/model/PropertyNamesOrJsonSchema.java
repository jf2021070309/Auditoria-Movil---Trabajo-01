package com.worldturner.medeia.schema.model;

import com.amazon.aps.iva.yb0.e;
import com.worldturner.medeia.types.Alternatives;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: JsonSchema.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B#\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/worldturner/medeia/schema/model/PropertyNamesOrJsonSchema;", "Lcom/worldturner/medeia/types/Alternatives;", "", "", "Lcom/worldturner/medeia/schema/model/JsonSchema;", "a", "b", "(Ljava/util/Set;Lcom/worldturner/medeia/schema/model/JsonSchema;)V", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class PropertyNamesOrJsonSchema extends Alternatives<Set<? extends String>, JsonSchema> {
    public PropertyNamesOrJsonSchema() {
        this(null, null, 3, null);
    }

    public /* synthetic */ PropertyNamesOrJsonSchema(Set set, JsonSchema jsonSchema, int i, e eVar) {
        this((i & 1) != 0 ? null : set, (i & 2) != 0 ? null : jsonSchema);
    }

    public PropertyNamesOrJsonSchema(Set<String> set, JsonSchema jsonSchema) {
        super(set, jsonSchema);
    }
}
