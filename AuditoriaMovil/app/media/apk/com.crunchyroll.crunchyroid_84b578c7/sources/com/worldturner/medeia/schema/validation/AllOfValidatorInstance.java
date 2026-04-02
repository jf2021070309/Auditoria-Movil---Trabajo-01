package com.worldturner.medeia.schema.validation;

import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.api.OkValidationResult;
import com.worldturner.medeia.api.ValidationResult;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.JsonTokenLocation;
import com.worldturner.medeia.schema.validation.stream.SchemaValidatorInstance;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ExistentialValidator.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00010\tj\b\u0012\u0004\u0012\u00020\u0001`\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/worldturner/medeia/schema/validation/AllOfValidatorInstance;", "Lcom/worldturner/medeia/schema/validation/stream/SchemaValidatorInstance;", "startLevel", "", "validations", "", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "(ILjava/util/List;)V", "instances", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getStartLevel", "()I", "processValidators", "Lcom/worldturner/medeia/api/ValidationResult;", "token", "Lcom/worldturner/medeia/parser/JsonTokenData;", FirebaseAnalytics.Param.LOCATION, "Lcom/worldturner/medeia/parser/JsonTokenLocation;", "validate", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class AllOfValidatorInstance implements SchemaValidatorInstance {
    private final ArrayList<SchemaValidatorInstance> instances;
    private final int startLevel;

    public AllOfValidatorInstance(int i, List<? extends SchemaValidator> list) {
        j.g(list, "validations");
        this.startLevel = i;
        ArrayList<SchemaValidatorInstance> arrayList = new ArrayList<>(list.size());
        for (SchemaValidator schemaValidator : list) {
            arrayList.add(schemaValidator.createInstance(this.startLevel));
        }
        this.instances = arrayList;
    }

    private final ValidationResult processValidators(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        int size = this.instances.size();
        int i = 0;
        while (i < size) {
            SchemaValidatorInstance schemaValidatorInstance = this.instances.get(i);
            j.b(schemaValidatorInstance, "instances[i]");
            ValidationResult validate = schemaValidatorInstance.validate(jsonTokenData, jsonTokenLocation);
            if (validate != null) {
                if (!validate.getValid()) {
                    return validate;
                }
                this.instances.remove(i);
                size--;
            } else {
                i++;
            }
        }
        return null;
    }

    public final int getStartLevel() {
        return this.startLevel;
    }

    @Override // com.worldturner.medeia.schema.validation.stream.SchemaValidatorInstance
    public ValidationResult validate(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        ValidationResult processValidators = processValidators(jsonTokenData, jsonTokenLocation);
        if (processValidators != null) {
            return processValidators;
        }
        if (jsonTokenLocation.getLevel() == this.startLevel && jsonTokenData.getType().getLastToken()) {
            return OkValidationResult.INSTANCE;
        }
        return null;
    }
}
