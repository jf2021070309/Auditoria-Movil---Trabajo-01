package com.worldturner.medeia.schema.validation;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.api.FailedValidationResult;
import com.worldturner.medeia.api.OkValidationResult;
import com.worldturner.medeia.api.ValidationResult;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.JsonTokenLocation;
import com.worldturner.medeia.schema.validation.stream.SchemaValidatorInstance;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: ObjectValidator.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/worldturner/medeia/schema/validation/ObjectDependenciesValidatorInstance;", "Lcom/worldturner/medeia/schema/validation/ObjectValidatorInstance;", "Lcom/worldturner/medeia/parser/JsonTokenData;", "token", "Lcom/worldturner/medeia/parser/JsonTokenLocation;", FirebaseAnalytics.Param.LOCATION, "Lcom/amazon/aps/iva/kb0/q;", "processDependencies", "Lcom/worldturner/medeia/api/ValidationResult;", "dependenciesFinalStep", "", "first", "Z", "", "", "Lcom/worldturner/medeia/schema/validation/stream/SchemaValidatorInstance;", "dependencies", "Ljava/util/Map;", "dependenciesResults", "Lcom/worldturner/medeia/schema/validation/ObjectValidator;", "validator", "", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "", "startLevel", "<init>", "(Lcom/worldturner/medeia/schema/validation/ObjectValidator;Ljava/util/Map;I)V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class ObjectDependenciesValidatorInstance extends ObjectValidatorInstance {
    private final Map<String, SchemaValidatorInstance> dependencies;
    private final Map<String, ValidationResult> dependenciesResults;
    private boolean first;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObjectDependenciesValidatorInstance(ObjectValidator objectValidator, Map<String, ? extends SchemaValidator> map, int i) {
        super(objectValidator, i);
        j.g(objectValidator, "validator");
        j.g(map, "dependencies");
        this.first = true;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends SchemaValidator> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue().createInstance(i));
        }
        this.dependencies = linkedHashMap;
        this.dependenciesResults = new LinkedHashMap();
    }

    @Override // com.worldturner.medeia.schema.validation.ObjectValidatorInstance
    public ValidationResult dependenciesFinalStep(JsonTokenLocation jsonTokenLocation) {
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        Set<String> propertyNames = jsonTokenLocation.getPropertyNames();
        for (Map.Entry<String, ValidationResult> entry : this.dependenciesResults.entrySet()) {
            String key = entry.getKey();
            ValidationResult value = entry.getValue();
            if (propertyNames.contains(key) && (value instanceof FailedValidationResult)) {
                return new FailedValidationResult("dependencies", key, e.e("Dependency for ", key, " failed"), jsonTokenLocation, l1.H(value));
            }
        }
        return OkValidationResult.INSTANCE;
    }

    @Override // com.worldturner.medeia.schema.validation.ObjectValidatorInstance
    public void processDependencies(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        ValidationResult validate;
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        for (Map.Entry<String, SchemaValidatorInstance> entry : this.dependencies.entrySet()) {
            String key = entry.getKey();
            SchemaValidatorInstance value = entry.getValue();
            if (!this.dependenciesResults.containsKey(key) && (validate = value.validate(jsonTokenData, jsonTokenLocation)) != null) {
                this.dependenciesResults.put(key, validate);
            }
        }
    }
}
