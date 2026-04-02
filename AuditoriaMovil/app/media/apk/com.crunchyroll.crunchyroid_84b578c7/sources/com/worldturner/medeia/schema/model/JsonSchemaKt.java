package com.worldturner.medeia.schema.model;

import com.amazon.aps.iva.yb0.j;
import com.worldturner.medeia.schema.validation.ObjectValidator;
import com.worldturner.medeia.schema.validation.SchemaValidator;
import kotlin.Metadata;
/* compiled from: JsonSchema.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"buildValidator", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "Lcom/worldturner/medeia/schema/model/PropertyNamesOrJsonSchema;", "context", "Lcom/worldturner/medeia/schema/model/ValidationBuilderContext;", "medeia-validator-core"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class JsonSchemaKt {
    public static final SchemaValidator buildValidator(PropertyNamesOrJsonSchema propertyNamesOrJsonSchema, ValidationBuilderContext validationBuilderContext) {
        j.g(propertyNamesOrJsonSchema, "receiver$0");
        j.g(validationBuilderContext, "context");
        if (propertyNamesOrJsonSchema.getA() != null) {
            return new ObjectValidator(null, null, propertyNamesOrJsonSchema.getA(), null, null, null, null, 123, null);
        }
        if (propertyNamesOrJsonSchema.getB() != null) {
            return propertyNamesOrJsonSchema.getB().buildValidator(validationBuilderContext);
        }
        throw new IllegalStateException();
    }
}
