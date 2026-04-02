package com.worldturner.medeia.schema.validation;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.kb0.o;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.u;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.oe0.f;
import com.amazon.aps.iva.va0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.api.FailedValidationResult;
import com.worldturner.medeia.api.OkValidationResult;
import com.worldturner.medeia.api.ValidationResult;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.JsonTokenLocation;
import com.worldturner.medeia.parser.JsonTokenType;
import com.worldturner.medeia.schema.validation.stream.SchemaValidatorInstance;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: ObjectValidator.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/worldturner/medeia/schema/validation/ObjectValidatorInstance;", "Lcom/worldturner/medeia/schema/validation/stream/SchemaValidatorInstance;", "Lcom/worldturner/medeia/parser/JsonTokenLocation;", FirebaseAnalytics.Param.LOCATION, "Lcom/worldturner/medeia/api/ValidationResult;", "finalStep", "Lcom/worldturner/medeia/parser/JsonTokenData;", "token", "Lcom/amazon/aps/iva/kb0/q;", "processDependencies", "validate", "dependenciesFinalStep", "", "first", "Z", "currentPropertyValidator", "Lcom/worldturner/medeia/schema/validation/stream/SchemaValidatorInstance;", "currentPropertyResult", "Lcom/worldturner/medeia/api/ValidationResult;", "currentAdditionalPropertiesValidator", "currentAdditionalPropertiesResult", "", "currentPatternPropertyValidators", "Ljava/util/List;", "", "currentPatternPropertyResults", "Ljava/util/Map;", "", "currentPropertyName", "Ljava/lang/String;", "Lcom/worldturner/medeia/schema/validation/ObjectValidator;", "validator", "Lcom/worldturner/medeia/schema/validation/ObjectValidator;", "getValidator", "()Lcom/worldturner/medeia/schema/validation/ObjectValidator;", "", "startLevel", "I", "getStartLevel", "()I", "<init>", "(Lcom/worldturner/medeia/schema/validation/ObjectValidator;I)V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public class ObjectValidatorInstance implements SchemaValidatorInstance {
    private ValidationResult currentAdditionalPropertiesResult;
    private SchemaValidatorInstance currentAdditionalPropertiesValidator;
    private Map<SchemaValidatorInstance, ValidationResult> currentPatternPropertyResults;
    private List<? extends SchemaValidatorInstance> currentPatternPropertyValidators;
    private String currentPropertyName;
    private ValidationResult currentPropertyResult;
    private SchemaValidatorInstance currentPropertyValidator;
    private boolean first;
    private final int startLevel;
    private final ObjectValidator validator;

    public ObjectValidatorInstance(ObjectValidator objectValidator, int i) {
        Map<SchemaValidatorInstance, ValidationResult> map;
        j.g(objectValidator, "validator");
        this.validator = objectValidator;
        this.startLevel = i;
        this.first = true;
        if (objectValidator.getPatternProperties() != null) {
            map = new IdentityHashMap<>();
        } else {
            map = e.c;
            if (map == null) {
                throw new o("null cannot be cast to non-null type com.worldturner.util.UnmodifiableEmptyMutableMap<K, V>");
            }
        }
        this.currentPatternPropertyResults = map;
    }

    private final ValidationResult finalStep(JsonTokenLocation jsonTokenLocation) {
        int intValue;
        int intValue2;
        Set<String> propertyNames = jsonTokenLocation.getPropertyNames();
        Integer maxProperties = this.validator.getMaxProperties();
        if (maxProperties != null && propertyNames.size() > (intValue2 = maxProperties.intValue())) {
            return new FailedValidationResult("maxProperties", (String) null, "Value " + propertyNames.size() + " is greater than maxProperties " + intValue2, jsonTokenLocation, (Collection) null, 18, (com.amazon.aps.iva.yb0.e) null);
        }
        Integer minProperties = this.validator.getMinProperties();
        if (minProperties != null && propertyNames.size() < (intValue = minProperties.intValue())) {
            return new FailedValidationResult("minProperties", (String) null, "Value " + propertyNames.size() + " is smaller than minProperties " + intValue, jsonTokenLocation, (Collection) null, 18, (com.amazon.aps.iva.yb0.e) null);
        }
        SchemaValidator propertyNames2 = this.validator.getPropertyNames();
        if (propertyNames2 != null) {
            SchemaValidatorInstance createInstance = propertyNames2.createInstance(jsonTokenLocation.getLevel());
            for (String str : propertyNames) {
                ValidationResult validate = createInstance.validate(JsonTokenData.Companion.createText(str), jsonTokenLocation);
                if (validate != null) {
                    if (validate instanceof FailedValidationResult) {
                        return new FailedValidationResult("propertyNames", str, "Property name validation failed", jsonTokenLocation, l1.H(validate));
                    }
                } else {
                    throw new NullPointerException("Invalid state");
                }
            }
        }
        Set<String> required = this.validator.getRequired();
        if (required != null) {
            for (String str2 : required) {
                if (!propertyNames.contains(str2)) {
                    return new FailedValidationResult("required", str2, e.e("Required property ", str2, " is missing from object"), jsonTokenLocation, (Collection) null, 16, (com.amazon.aps.iva.yb0.e) null);
                }
            }
        }
        return dependenciesFinalStep(jsonTokenLocation);
    }

    public ValidationResult dependenciesFinalStep(JsonTokenLocation jsonTokenLocation) {
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        return OkValidationResult.INSTANCE;
    }

    public final int getStartLevel() {
        return this.startLevel;
    }

    public final ObjectValidator getValidator() {
        return this.validator;
    }

    public void processDependencies(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
    }

    @Override // com.worldturner.medeia.schema.validation.stream.SchemaValidatorInstance
    public ValidationResult validate(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        ValidationResult validate;
        ArrayList arrayList;
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        if (this.first && jsonTokenData.getType() != JsonTokenType.START_OBJECT) {
            return OkValidationResult.INSTANCE;
        }
        this.first = false;
        processDependencies(jsonTokenData, jsonTokenLocation);
        if (jsonTokenLocation.getLevel() == this.startLevel + 1 && jsonTokenData.getType() == JsonTokenType.FIELD_NAME) {
            String text = jsonTokenData.getText();
            if (text != null) {
                if (jsonTokenLocation.getPropertyNames().contains(text)) {
                    return new FailedValidationResult("duplicate", text, "Duplicate property name in json object", jsonTokenLocation, (Collection) null, 16, (com.amazon.aps.iva.yb0.e) null);
                }
                if (this.validator.getProperties() != null && this.validator.getProperties().containsKey(text)) {
                    SchemaValidator schemaValidator = this.validator.getProperties().get(text);
                    if (schemaValidator != null) {
                        this.currentPropertyValidator = schemaValidator.createInstance(jsonTokenLocation.getLevel());
                    } else {
                        j.l();
                        throw null;
                    }
                }
                Map<f, SchemaValidator> patternProperties = this.validator.getPatternProperties();
                if (patternProperties != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<f, SchemaValidator> entry : patternProperties.entrySet()) {
                        f key = entry.getKey();
                        key.getClass();
                        if (key.b.matcher(text).find()) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    Collection values = linkedHashMap.values();
                    if (values != null) {
                        Collection<SchemaValidator> collection = values;
                        arrayList = new ArrayList(r.Y(collection));
                        for (SchemaValidator schemaValidator2 : collection) {
                            arrayList.add(schemaValidator2.createInstance(jsonTokenLocation.getLevel()));
                        }
                        this.currentPatternPropertyValidators = arrayList;
                        if (this.currentPropertyValidator == null && ((arrayList == null || arrayList.isEmpty()) && this.validator.getAdditionalProperties() != null)) {
                            this.currentAdditionalPropertiesValidator = this.validator.getAdditionalProperties().createInstance(jsonTokenLocation.getLevel());
                        }
                        this.currentPropertyName = text;
                    }
                }
                arrayList = null;
                this.currentPatternPropertyValidators = arrayList;
                if (this.currentPropertyValidator == null) {
                    this.currentAdditionalPropertiesValidator = this.validator.getAdditionalProperties().createInstance(jsonTokenLocation.getLevel());
                }
                this.currentPropertyName = text;
            } else {
                j.l();
                throw null;
            }
        }
        if ((jsonTokenLocation.getLevel() == this.startLevel + 1 && jsonTokenData.getType() != JsonTokenType.FIELD_NAME) || jsonTokenLocation.getLevel() > this.startLevel + 1) {
            SchemaValidatorInstance schemaValidatorInstance = this.currentPropertyValidator;
            if (schemaValidatorInstance != null && this.currentPropertyResult == null) {
                this.currentPropertyResult = schemaValidatorInstance.validate(jsonTokenData, jsonTokenLocation);
            }
            List<? extends SchemaValidatorInstance> list = this.currentPatternPropertyValidators;
            if (list != null) {
                for (SchemaValidatorInstance schemaValidatorInstance2 : list) {
                    if (!this.currentPatternPropertyResults.containsKey(schemaValidatorInstance2) && (validate = schemaValidatorInstance2.validate(jsonTokenData, jsonTokenLocation)) != null) {
                        this.currentPatternPropertyResults.put(schemaValidatorInstance2, validate);
                    }
                }
            }
            SchemaValidatorInstance schemaValidatorInstance3 = this.currentAdditionalPropertiesValidator;
            if (schemaValidatorInstance3 != null && this.currentAdditionalPropertiesResult == null) {
                this.currentAdditionalPropertiesResult = schemaValidatorInstance3.validate(jsonTokenData, jsonTokenLocation);
            }
        }
        if (jsonTokenLocation.getLevel() == this.startLevel + 1 && jsonTokenData.getType().getLastToken()) {
            ValidationResult validationResult = this.currentPropertyResult;
            if (validationResult != null && (validationResult instanceof FailedValidationResult)) {
                String str = this.currentPropertyName;
                if (str != null) {
                    return new FailedValidationResult("properties", str, "Property validation failed", jsonTokenLocation, l1.H(validationResult));
                }
                j.l();
                throw null;
            }
            ArrayList j0 = u.j0(this.currentPatternPropertyResults.values(), FailedValidationResult.class);
            if (!j0.isEmpty()) {
                String str2 = this.currentPropertyName;
                if (str2 != null) {
                    return new FailedValidationResult("patternProperties", str2, "Pattern property validation failed", jsonTokenLocation, x.c1(j0));
                }
                j.l();
                throw null;
            }
            ValidationResult validationResult2 = this.currentAdditionalPropertiesResult;
            if (validationResult2 != null && (validationResult2 instanceof FailedValidationResult)) {
                String str3 = this.currentPropertyName;
                if (str3 != null) {
                    return new FailedValidationResult("additionalProperties", str3, "Additional properties validation failed", jsonTokenLocation, l1.H(validationResult2));
                }
                j.l();
                throw null;
            }
            this.currentPropertyValidator = null;
            this.currentPropertyResult = null;
            this.currentPatternPropertyValidators = null;
            this.currentPatternPropertyResults.clear();
            this.currentAdditionalPropertiesValidator = null;
            this.currentAdditionalPropertiesResult = null;
            this.currentPropertyName = null;
        }
        if (jsonTokenLocation.getLevel() != this.startLevel || jsonTokenData.getType() != JsonTokenType.END_OBJECT) {
            return null;
        }
        return finalStep(jsonTokenLocation);
    }
}
