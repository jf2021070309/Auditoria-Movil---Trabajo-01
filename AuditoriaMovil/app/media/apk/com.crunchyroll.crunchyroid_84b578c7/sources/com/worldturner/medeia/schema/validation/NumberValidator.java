package com.worldturner.medeia.schema.validation;

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
import java.math.BigDecimal;
import java.net.URI;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: NumberValidator.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B9\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b \u0010!J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u0016\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016¨\u0006#"}, d2 = {"Lcom/worldturner/medeia/schema/validation/NumberValidator;", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "Lcom/worldturner/medeia/schema/validation/stream/SchemaValidatorInstance;", "Lcom/worldturner/medeia/parser/JsonTokenData;", "token", "Lcom/worldturner/medeia/parser/JsonTokenLocation;", FirebaseAnalytics.Param.LOCATION, "Lcom/worldturner/medeia/api/ValidationResult;", "validateNumber", "", "startLevel", "createInstance", "", "Ljava/net/URI;", "unknownRefs", "Lcom/amazon/aps/iva/kb0/q;", "recordUnknownRefs", "validate", "Lcom/worldturner/medeia/schema/validation/MultiNumber;", "multipleOf", "Lcom/worldturner/medeia/schema/validation/MultiNumber;", "getMultipleOf", "()Lcom/worldturner/medeia/schema/validation/MultiNumber;", "maximum", "getMaximum", "exclusiveMaximum", "getExclusiveMaximum", "minimum", "getMinimum", "exclusiveMinimum", "getExclusiveMinimum", "Ljava/math/BigDecimal;", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "Companion", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class NumberValidator implements SchemaValidator, SchemaValidatorInstance {
    public static final Companion Companion = new Companion(null);
    private final MultiNumber exclusiveMaximum;
    private final MultiNumber exclusiveMinimum;
    private final MultiNumber maximum;
    private final MultiNumber minimum;
    private final MultiNumber multipleOf;

    /* compiled from: NumberValidator.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006¨\u0006\u000b"}, d2 = {"Lcom/worldturner/medeia/schema/validation/NumberValidator$Companion;", "", "()V", "create", "Lcom/worldturner/medeia/schema/validation/NumberValidator;", "multipleOf", "Ljava/math/BigDecimal;", "maximum", "exclusiveMaximum", "minimum", "exclusiveMinimum", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final NumberValidator create(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5) {
            if (SchemaValidatorKt.isAnyNotNull(bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal5)) {
                return new NumberValidator(bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal5);
            }
            return null;
        }
    }

    public NumberValidator(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5) {
        MultiNumber multiNumber;
        MultiNumber multiNumber2;
        MultiNumber multiNumber3;
        MultiNumber multiNumber4;
        if (bigDecimal != null) {
            multiNumber = new MultiNumber(bigDecimal);
        } else {
            multiNumber = null;
        }
        this.multipleOf = multiNumber;
        if (bigDecimal2 != null) {
            multiNumber2 = new MultiNumber(bigDecimal2);
        } else {
            multiNumber2 = null;
        }
        this.maximum = multiNumber2;
        if (bigDecimal3 != null) {
            multiNumber3 = new MultiNumber(bigDecimal3);
        } else {
            multiNumber3 = null;
        }
        this.exclusiveMaximum = multiNumber3;
        if (bigDecimal4 != null) {
            multiNumber4 = new MultiNumber(bigDecimal4);
        } else {
            multiNumber4 = null;
        }
        this.minimum = multiNumber4;
        this.exclusiveMinimum = bigDecimal5 != null ? new MultiNumber(bigDecimal5) : null;
    }

    private final ValidationResult validateNumber(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        MultiNumber multiNumber = this.multipleOf;
        if (multiNumber != null && !multiNumber.isMultiple(jsonTokenData)) {
            return new FailedValidationResult("multipleOf", (String) null, "Value " + jsonTokenData + " is not a multiple of " + this.multipleOf, jsonTokenLocation, (Collection) null, 18, (e) null);
        }
        MultiNumber multiNumber2 = this.maximum;
        if (multiNumber2 != null && multiNumber2.compareTo(jsonTokenData) < 0) {
            return new FailedValidationResult("maximum", (String) null, "Value " + jsonTokenData + " is greater than maximum " + this.maximum, jsonTokenLocation, (Collection) null, 18, (e) null);
        }
        MultiNumber multiNumber3 = this.exclusiveMaximum;
        if (multiNumber3 != null && multiNumber3.compareTo(jsonTokenData) <= 0) {
            return new FailedValidationResult("exclusiveMaximum", (String) null, "Value " + jsonTokenData + " is greater than or equal to exclusive maximum " + this.exclusiveMaximum, jsonTokenLocation, (Collection) null, 18, (e) null);
        }
        MultiNumber multiNumber4 = this.minimum;
        if (multiNumber4 != null && multiNumber4.compareTo(jsonTokenData) > 0) {
            return new FailedValidationResult("minimum", (String) null, "Value " + jsonTokenData + " is smaller than minimum " + this.minimum, jsonTokenLocation, (Collection) null, 18, (e) null);
        }
        MultiNumber multiNumber5 = this.exclusiveMinimum;
        if (multiNumber5 != null && multiNumber5.compareTo(jsonTokenData) >= 0) {
            return new FailedValidationResult("exclusiveMinimum", (String) null, "Value " + jsonTokenData + " is smaller than or equal to exclusive minimum " + this.exclusiveMinimum, jsonTokenLocation, (Collection) null, 18, (e) null);
        }
        return OkValidationResult.INSTANCE;
    }

    public final MultiNumber getExclusiveMaximum() {
        return this.exclusiveMaximum;
    }

    public final MultiNumber getExclusiveMinimum() {
        return this.exclusiveMinimum;
    }

    public final MultiNumber getMaximum() {
        return this.maximum;
    }

    public final MultiNumber getMinimum() {
        return this.minimum;
    }

    public final MultiNumber getMultipleOf() {
        return this.multipleOf;
    }

    @Override // com.worldturner.medeia.schema.validation.SchemaValidator
    public void recordUnknownRefs(Collection<URI> collection) {
        j.g(collection, "unknownRefs");
    }

    @Override // com.worldturner.medeia.schema.validation.stream.SchemaValidatorInstance
    public ValidationResult validate(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        if (jsonTokenData.getType() != JsonTokenType.VALUE_NUMBER) {
            return OkValidationResult.INSTANCE;
        }
        return validateNumber(jsonTokenData, jsonTokenLocation);
    }

    @Override // com.worldturner.medeia.schema.validation.SchemaValidator
    public SchemaValidatorInstance createInstance(int i) {
        return this;
    }
}
