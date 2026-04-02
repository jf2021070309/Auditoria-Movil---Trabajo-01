package com.worldturner.medeia.schema.validation;

import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.api.FailedValidationResult;
import com.worldturner.medeia.api.OkValidationResult;
import com.worldturner.medeia.api.ValidationResult;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.JsonTokenLocation;
import com.worldturner.medeia.schema.validation.stream.SchemaValidatorInstance;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: NotValidator.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0011\u0010\u0007\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/worldturner/medeia/schema/validation/NotSchemaValidatorInstance;", "Lcom/worldturner/medeia/schema/validation/stream/SchemaValidatorInstance;", "startLevel", "", "validation", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "(ILcom/worldturner/medeia/schema/validation/SchemaValidator;)V", "instance", "getInstance", "()Lcom/worldturner/medeia/schema/validation/stream/SchemaValidatorInstance;", "result", "Lcom/worldturner/medeia/api/ValidationResult;", "getResult", "()Lcom/worldturner/medeia/api/ValidationResult;", "setResult", "(Lcom/worldturner/medeia/api/ValidationResult;)V", "getStartLevel", "()I", "validate", "token", "Lcom/worldturner/medeia/parser/JsonTokenData;", FirebaseAnalytics.Param.LOCATION, "Lcom/worldturner/medeia/parser/JsonTokenLocation;", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class NotSchemaValidatorInstance implements SchemaValidatorInstance {
    private final SchemaValidatorInstance instance;
    private ValidationResult result;
    private final int startLevel;

    public NotSchemaValidatorInstance(int i, SchemaValidator schemaValidator) {
        j.g(schemaValidator, "validation");
        this.startLevel = i;
        this.instance = schemaValidator.createInstance(i);
    }

    public final SchemaValidatorInstance getInstance() {
        return this.instance;
    }

    public final ValidationResult getResult() {
        return this.result;
    }

    public final int getStartLevel() {
        return this.startLevel;
    }

    public final void setResult(ValidationResult validationResult) {
        this.result = validationResult;
    }

    @Override // com.worldturner.medeia.schema.validation.stream.SchemaValidatorInstance
    public ValidationResult validate(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        ValidationResult validationResult;
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        if (this.result == null) {
            this.result = this.instance.validate(jsonTokenData, jsonTokenLocation);
        }
        if (jsonTokenLocation.getLevel() == this.startLevel && jsonTokenData.getType().getLastToken()) {
            ValidationResult validationResult2 = this.result;
            if (validationResult2 != null) {
                if (validationResult2.getValid()) {
                    validationResult = new FailedValidationResult("not", (String) null, "Subschema was successful", jsonTokenLocation, (Collection) null, 18, (e) null);
                } else {
                    validationResult = OkValidationResult.INSTANCE;
                }
                if (validationResult != null) {
                    return validationResult;
                }
            }
            throw new NullPointerException("Illegal state");
        }
        return null;
    }
}
