package com.worldturner.medeia.schema.validation.stream;

import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.api.FailedValidationResult;
import com.worldturner.medeia.api.ValidationFailedException;
import com.worldturner.medeia.api.ValidationResult;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.JsonTokenDataAndLocationBuilder;
import com.worldturner.medeia.parser.JsonTokenLocation;
import com.worldturner.medeia.schema.validation.SchemaValidator;
import kotlin.Metadata;
/* compiled from: SchemaValidatingJsonConsumer.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/worldturner/medeia/schema/validation/stream/SchemaValidatingConsumer;", "Lcom/worldturner/medeia/parser/JsonTokenDataAndLocationBuilder;", "Lcom/worldturner/medeia/parser/JsonTokenData;", "token", "Lcom/worldturner/medeia/parser/JsonTokenLocation;", FirebaseAnalytics.Param.LOCATION, "Lcom/amazon/aps/iva/kb0/q;", "consume", "", "takeResult", "Lcom/worldturner/medeia/api/ValidationResult;", "result", "Lcom/worldturner/medeia/api/ValidationResult;", "Lcom/worldturner/medeia/schema/validation/stream/SchemaValidatorInstance;", "instance", "Lcom/worldturner/medeia/schema/validation/stream/SchemaValidatorInstance;", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "validator", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "getValidator", "()Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "", "startLevel", "I", "getStartLevel", "()I", "<init>", "(Lcom/worldturner/medeia/schema/validation/SchemaValidator;I)V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class SchemaValidatingConsumer implements JsonTokenDataAndLocationBuilder {
    private SchemaValidatorInstance instance;
    private ValidationResult result;
    private final int startLevel;
    private final SchemaValidator validator;

    public SchemaValidatingConsumer(SchemaValidator schemaValidator, int i) {
        j.g(schemaValidator, "validator");
        this.validator = schemaValidator;
        this.startLevel = i;
    }

    @Override // com.worldturner.medeia.parser.JsonTokenDataAndLocationConsumer
    public void consume(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        if (jsonTokenLocation.getLevel() == this.startLevel && jsonTokenData.getType().getFirstToken()) {
            this.result = null;
            this.instance = this.validator.createInstance(this.startLevel);
        }
        if (this.result == null) {
            SchemaValidatorInstance schemaValidatorInstance = this.instance;
            if (schemaValidatorInstance != null) {
                ValidationResult validate = schemaValidatorInstance.validate(jsonTokenData, jsonTokenLocation);
                this.result = validate;
                if (validate != null && (validate instanceof FailedValidationResult)) {
                    throw new ValidationFailedException((FailedValidationResult) validate);
                }
                return;
            }
            j.l();
            throw null;
        }
    }

    public final int getStartLevel() {
        return this.startLevel;
    }

    public final SchemaValidator getValidator() {
        return this.validator;
    }

    @Override // com.worldturner.medeia.parser.JsonTokenDataAndLocationBuilder
    public Object takeResult() {
        return this.result;
    }

    public /* synthetic */ SchemaValidatingConsumer(SchemaValidator schemaValidator, int i, int i2, e eVar) {
        this(schemaValidator, (i2 & 2) != 0 ? 0 : i);
    }
}
