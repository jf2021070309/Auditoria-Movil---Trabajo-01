package com.worldturner.medeia.schema.validation;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.api.FailedValidationResult;
import com.worldturner.medeia.api.OkValidationResult;
import com.worldturner.medeia.api.ValidationResult;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.JsonTokenLocation;
import com.worldturner.medeia.parser.JsonTokenType;
import com.worldturner.medeia.schema.validation.stream.SchemaValidatorInstance;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: ArrayValidator.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/worldturner/medeia/schema/validation/ArrayValidatorInstance;", "Lcom/worldturner/medeia/schema/validation/stream/SchemaValidatorInstance;", "validator", "Lcom/worldturner/medeia/schema/validation/ArrayValidator;", "startLevel", "", "(Lcom/worldturner/medeia/schema/validation/ArrayValidator;I)V", "allItemsInstance", "containsInstance", "containsMatched", "", "currentItemInstance", "first", "itemCount", "getStartLevel", "()I", "getValidator", "()Lcom/worldturner/medeia/schema/validation/ArrayValidator;", "completeValidation", "Lcom/worldturner/medeia/api/ValidationResult;", FirebaseAnalytics.Param.LOCATION, "Lcom/worldturner/medeia/parser/JsonTokenLocation;", "validate", "token", "Lcom/worldturner/medeia/parser/JsonTokenData;", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class ArrayValidatorInstance implements SchemaValidatorInstance {
    private SchemaValidatorInstance allItemsInstance;
    private SchemaValidatorInstance containsInstance;
    private boolean containsMatched;
    private SchemaValidatorInstance currentItemInstance;
    private boolean first;
    private int itemCount;
    private final int startLevel;
    private final ArrayValidator validator;

    public ArrayValidatorInstance(ArrayValidator arrayValidator, int i) {
        j.g(arrayValidator, "validator");
        this.validator = arrayValidator;
        this.startLevel = i;
        this.first = true;
    }

    private final ValidationResult completeValidation(JsonTokenLocation jsonTokenLocation) {
        int intValue;
        int intValue2;
        if (this.validator.getContains() != null && !this.containsMatched) {
            return new FailedValidationResult("contains", (String) null, "Items don't contain an item that matches the 'contains' schemaValue", jsonTokenLocation, (Collection) null, 18, (e) null);
        }
        Integer maxItems = this.validator.getMaxItems();
        if (maxItems != null && this.itemCount > (intValue2 = maxItems.intValue())) {
            return new FailedValidationResult("maxItems", (String) null, "Value " + this.itemCount + " is greater than maxItems " + intValue2, jsonTokenLocation, (Collection) null, 18, (e) null);
        }
        Integer minItems = this.validator.getMinItems();
        if (minItems != null && this.itemCount < (intValue = minItems.intValue())) {
            return new FailedValidationResult("minItems", (String) null, "Value " + this.itemCount + " is smaller than minItems " + intValue, jsonTokenLocation, (Collection) null, 18, (e) null);
        }
        return OkValidationResult.INSTANCE;
    }

    public final int getStartLevel() {
        return this.startLevel;
    }

    public final ArrayValidator getValidator() {
        return this.validator;
    }

    @Override // com.worldturner.medeia.schema.validation.stream.SchemaValidatorInstance
    public ValidationResult validate(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        ValidationResult validate;
        ValidationResult validate2;
        ValidationResult validate3;
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        if (this.first && jsonTokenData.getType() != JsonTokenType.START_ARRAY) {
            return OkValidationResult.INSTANCE;
        }
        this.first = false;
        if (jsonTokenLocation.getLevel() == this.startLevel + 1 && jsonTokenData.getType().getFirstToken()) {
            SchemaValidator contains = this.validator.getContains();
            if (contains != null) {
                this.containsInstance = contains.createInstance(jsonTokenLocation.getLevel());
            }
            if (this.validator.getAllItems() != null) {
                this.allItemsInstance = this.validator.getAllItems().createInstance(jsonTokenLocation.getLevel());
            } else if (this.validator.getItems() != null) {
                if (this.itemCount < this.validator.getItems().size()) {
                    this.currentItemInstance = this.validator.getItems().get(this.itemCount).createInstance(jsonTokenLocation.getLevel());
                } else if (this.validator.getAdditionalItems() != null) {
                    this.currentItemInstance = this.validator.getAdditionalItems().createInstance(jsonTokenLocation.getLevel());
                }
            }
        }
        SchemaValidatorInstance schemaValidatorInstance = this.allItemsInstance;
        if (schemaValidatorInstance != null && (validate3 = schemaValidatorInstance.validate(jsonTokenData, jsonTokenLocation)) != null) {
            if (validate3 instanceof FailedValidationResult) {
                return new FailedValidationResult(FirebaseAnalytics.Param.ITEMS, (String) null, "Schema for all items failed to validate", jsonTokenLocation, l1.H(validate3), 2, (e) null);
            }
            this.allItemsInstance = null;
        }
        SchemaValidatorInstance schemaValidatorInstance2 = this.containsInstance;
        if (schemaValidatorInstance2 != null && (validate2 = schemaValidatorInstance2.validate(jsonTokenData, jsonTokenLocation)) != null) {
            if (validate2.getValid()) {
                this.containsMatched = true;
            }
            this.containsInstance = null;
        }
        SchemaValidatorInstance schemaValidatorInstance3 = this.currentItemInstance;
        if (schemaValidatorInstance3 != null && (validate = schemaValidatorInstance3.validate(jsonTokenData, jsonTokenLocation)) != null) {
            if (validate instanceof FailedValidationResult) {
                return new FailedValidationResult("items/additionalItems", (String) null, "Schema for items failed to validate", jsonTokenLocation, l1.H(validate), 2, (e) null);
            }
            this.currentItemInstance = null;
        }
        if (jsonTokenData.getType().getLastToken() && jsonTokenLocation.getLevel() == this.startLevel + 1) {
            this.itemCount++;
        }
        if (jsonTokenData.getType() != JsonTokenType.END_ARRAY || jsonTokenLocation.getLevel() != this.startLevel) {
            return null;
        }
        return completeValidation(jsonTokenLocation);
    }
}
