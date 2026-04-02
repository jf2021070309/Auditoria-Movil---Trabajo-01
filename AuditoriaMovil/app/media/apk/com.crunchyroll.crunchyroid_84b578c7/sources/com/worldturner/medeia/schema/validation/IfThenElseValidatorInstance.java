package com.worldturner.medeia.schema.validation;

import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.api.OkValidationResult;
import com.worldturner.medeia.api.ValidationResult;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.JsonTokenLocation;
import com.worldturner.medeia.schema.validation.stream.SchemaValidatorInstance;
import kotlin.Metadata;
/* compiled from: IfThenElseValidator.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0007J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000b\"\u0004\b\u0018\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/worldturner/medeia/schema/validation/IfThenElseValidatorInstance;", "Lcom/worldturner/medeia/schema/validation/stream/SchemaValidatorInstance;", "startLevel", "", "ifValidator", "thenValidator", "elseValidator", "(ILcom/worldturner/medeia/schema/validation/stream/SchemaValidatorInstance;Lcom/worldturner/medeia/schema/validation/stream/SchemaValidatorInstance;Lcom/worldturner/medeia/schema/validation/stream/SchemaValidatorInstance;)V", "elseResult", "Lcom/worldturner/medeia/api/ValidationResult;", "getElseResult", "()Lcom/worldturner/medeia/api/ValidationResult;", "setElseResult", "(Lcom/worldturner/medeia/api/ValidationResult;)V", "getElseValidator", "()Lcom/worldturner/medeia/schema/validation/stream/SchemaValidatorInstance;", "ifResult", "getIfResult", "setIfResult", "getIfValidator", "getStartLevel", "()I", "thenResult", "getThenResult", "setThenResult", "getThenValidator", "validate", "token", "Lcom/worldturner/medeia/parser/JsonTokenData;", FirebaseAnalytics.Param.LOCATION, "Lcom/worldturner/medeia/parser/JsonTokenLocation;", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class IfThenElseValidatorInstance implements SchemaValidatorInstance {
    private ValidationResult elseResult;
    private final SchemaValidatorInstance elseValidator;
    private ValidationResult ifResult;
    private final SchemaValidatorInstance ifValidator;
    private final int startLevel;
    private ValidationResult thenResult;
    private final SchemaValidatorInstance thenValidator;

    public IfThenElseValidatorInstance(int i, SchemaValidatorInstance schemaValidatorInstance, SchemaValidatorInstance schemaValidatorInstance2, SchemaValidatorInstance schemaValidatorInstance3) {
        j.g(schemaValidatorInstance, "ifValidator");
        this.startLevel = i;
        this.ifValidator = schemaValidatorInstance;
        this.thenValidator = schemaValidatorInstance2;
        this.elseValidator = schemaValidatorInstance3;
    }

    public final ValidationResult getElseResult() {
        return this.elseResult;
    }

    public final SchemaValidatorInstance getElseValidator() {
        return this.elseValidator;
    }

    public final ValidationResult getIfResult() {
        return this.ifResult;
    }

    public final SchemaValidatorInstance getIfValidator() {
        return this.ifValidator;
    }

    public final int getStartLevel() {
        return this.startLevel;
    }

    public final ValidationResult getThenResult() {
        return this.thenResult;
    }

    public final SchemaValidatorInstance getThenValidator() {
        return this.thenValidator;
    }

    public final void setElseResult(ValidationResult validationResult) {
        this.elseResult = validationResult;
    }

    public final void setIfResult(ValidationResult validationResult) {
        this.ifResult = validationResult;
    }

    public final void setThenResult(ValidationResult validationResult) {
        this.thenResult = validationResult;
    }

    @Override // com.worldturner.medeia.schema.validation.stream.SchemaValidatorInstance
    public ValidationResult validate(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        ValidationResult validationResult;
        SchemaValidatorInstance schemaValidatorInstance;
        SchemaValidatorInstance schemaValidatorInstance2;
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        if (this.ifResult == null) {
            this.ifResult = this.ifValidator.validate(jsonTokenData, jsonTokenLocation);
        }
        if (this.thenResult == null && (schemaValidatorInstance2 = this.thenValidator) != null) {
            this.thenResult = schemaValidatorInstance2.validate(jsonTokenData, jsonTokenLocation);
        }
        if (this.elseResult == null && (schemaValidatorInstance = this.elseValidator) != null) {
            this.elseResult = schemaValidatorInstance.validate(jsonTokenData, jsonTokenLocation);
        }
        if (jsonTokenLocation.getLevel() == this.startLevel && jsonTokenData.getType().getLastToken() && (validationResult = this.ifResult) != null) {
            if (validationResult.getValid()) {
                ValidationResult validationResult2 = this.thenResult;
                if (validationResult2 == null) {
                    return OkValidationResult.INSTANCE;
                }
                return validationResult2;
            }
            ValidationResult validationResult3 = this.elseResult;
            if (validationResult3 == null) {
                return OkValidationResult.INSTANCE;
            }
            return validationResult3;
        }
        return null;
    }
}
