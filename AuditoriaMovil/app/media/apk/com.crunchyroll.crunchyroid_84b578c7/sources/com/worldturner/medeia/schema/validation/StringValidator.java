package com.worldturner.medeia.schema.validation;

import com.amazon.aps.iva.j0.j0;
import com.amazon.aps.iva.oe0.f;
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
import java.net.URI;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: StringValidator.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B'\b\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u0016\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/worldturner/medeia/schema/validation/StringValidator;", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "Lcom/worldturner/medeia/schema/validation/stream/SchemaValidatorInstance;", "", "string", "Lcom/worldturner/medeia/parser/JsonTokenLocation;", FirebaseAnalytics.Param.LOCATION, "Lcom/worldturner/medeia/api/ValidationResult;", "validateText", "", "startLevel", "createInstance", "", "Ljava/net/URI;", "unknownRefs", "Lcom/amazon/aps/iva/kb0/q;", "recordUnknownRefs", "Lcom/worldturner/medeia/parser/JsonTokenData;", "token", "validate", "maxLength", "Ljava/lang/Integer;", "getMaxLength", "()Ljava/lang/Integer;", "minLength", "getMinLength", "Lcom/amazon/aps/iva/oe0/f;", "pattern", "Lcom/amazon/aps/iva/oe0/f;", "getPattern", "()Lcom/amazon/aps/iva/oe0/f;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/amazon/aps/iva/oe0/f;)V", "Companion", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class StringValidator implements SchemaValidator, SchemaValidatorInstance {
    public static final Companion Companion = new Companion(null);
    private final Integer maxLength;
    private final Integer minLength;
    private final f pattern;

    /* compiled from: StringValidator.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/worldturner/medeia/schema/validation/StringValidator$Companion;", "", "", "maxLength", "minLength", "Lcom/amazon/aps/iva/oe0/f;", "pattern", "Lcom/worldturner/medeia/schema/validation/StringValidator;", "create", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/amazon/aps/iva/oe0/f;)Lcom/worldturner/medeia/schema/validation/StringValidator;", "<init>", "()V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final StringValidator create(Integer num, Integer num2, f fVar) {
            if (!SchemaValidatorKt.isAnyNotNull(num, num2, fVar)) {
                return null;
            }
            return new StringValidator(num, num2, fVar, null);
        }
    }

    private StringValidator(Integer num, Integer num2, f fVar) {
        this.maxLength = num;
        this.minLength = num2;
        this.pattern = fVar;
    }

    private final ValidationResult validateText(String str, JsonTokenLocation jsonTokenLocation) {
        int intValue;
        int intValue2;
        int codePointCount = str.codePointCount(0, str.length());
        Integer num = this.maxLength;
        if (num != null && codePointCount > (intValue2 = num.intValue())) {
            return new FailedValidationResult("maxLength", (String) null, j0.e("String length ", codePointCount, " is greater than maxLength ", intValue2), jsonTokenLocation, (Collection) null, 18, (e) null);
        }
        Integer num2 = this.minLength;
        if (num2 != null && codePointCount < (intValue = num2.intValue())) {
            return new FailedValidationResult("minLength", (String) null, j0.e("String length ", codePointCount, " is smaller than maxLength ", intValue), jsonTokenLocation, (Collection) null, 18, (e) null);
        }
        f fVar = this.pattern;
        if (fVar != null && !fVar.b.matcher(str).find()) {
            return new FailedValidationResult("pattern", (String) null, "Pattern " + fVar + " is not contained in text", jsonTokenLocation, (Collection) null, 18, (e) null);
        }
        return OkValidationResult.INSTANCE;
    }

    public final Integer getMaxLength() {
        return this.maxLength;
    }

    public final Integer getMinLength() {
        return this.minLength;
    }

    public final f getPattern() {
        return this.pattern;
    }

    @Override // com.worldturner.medeia.schema.validation.SchemaValidator
    public void recordUnknownRefs(Collection<URI> collection) {
        j.g(collection, "unknownRefs");
    }

    @Override // com.worldturner.medeia.schema.validation.stream.SchemaValidatorInstance
    public ValidationResult validate(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        if (jsonTokenData.getType() != JsonTokenType.VALUE_TEXT) {
            return OkValidationResult.INSTANCE;
        }
        String text = jsonTokenData.getText();
        if (text != null) {
            return validateText(text, jsonTokenLocation);
        }
        j.l();
        throw null;
    }

    public /* synthetic */ StringValidator(Integer num, Integer num2, f fVar, e eVar) {
        this(num, num2, fVar);
    }

    @Override // com.worldturner.medeia.schema.validation.SchemaValidator
    public SchemaValidatorInstance createInstance(int i) {
        return this;
    }
}
