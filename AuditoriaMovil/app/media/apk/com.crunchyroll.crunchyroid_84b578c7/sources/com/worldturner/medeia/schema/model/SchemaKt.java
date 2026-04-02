package com.worldturner.medeia.schema.model;

import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.yb0.j;
import com.worldturner.medeia.schema.validation.SchemaValidator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: Schema.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005\u001a0\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00020\u0006\"\u0004\b\u0000\u0010\u0007*\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00030\u00062\u0006\u0010\u0004\u001a\u00020\u0005\u001a0\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00020\u0006\"\u0004\b\u0000\u0010\u0007*\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\n"}, d2 = {"buildValidators", "", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "Lcom/worldturner/medeia/schema/model/Schema;", "context", "Lcom/worldturner/medeia/schema/model/ValidationBuilderContext;", "", "X", "buildValidators2", "Lcom/worldturner/medeia/schema/model/PropertyNamesOrJsonSchema;", "medeia-validator-core"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class SchemaKt {
    public static final List<SchemaValidator> buildValidators(List<? extends Schema> list, ValidationBuilderContext validationBuilderContext) {
        j.g(list, "receiver$0");
        j.g(validationBuilderContext, "context");
        List<? extends Schema> list2 = list;
        ArrayList arrayList = new ArrayList(r.Y(list2));
        for (Schema schema : list2) {
            arrayList.add(schema.buildValidator(validationBuilderContext));
        }
        return arrayList;
    }

    public static final <X> Map<X, SchemaValidator> buildValidators2(Map<X, PropertyNamesOrJsonSchema> map, ValidationBuilderContext validationBuilderContext) {
        j.g(map, "receiver$0");
        j.g(validationBuilderContext, "context");
        LinkedHashMap linkedHashMap = new LinkedHashMap(k.w(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), JsonSchemaKt.buildValidator((PropertyNamesOrJsonSchema) entry.getValue(), validationBuilderContext));
        }
        return linkedHashMap;
    }

    public static final <X> Map<X, SchemaValidator> buildValidators(Map<X, ? extends Schema> map, ValidationBuilderContext validationBuilderContext) {
        j.g(map, "receiver$0");
        j.g(validationBuilderContext, "context");
        LinkedHashMap linkedHashMap = new LinkedHashMap(k.w(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((Schema) entry.getValue()).buildValidator(validationBuilderContext));
        }
        return linkedHashMap;
    }
}
