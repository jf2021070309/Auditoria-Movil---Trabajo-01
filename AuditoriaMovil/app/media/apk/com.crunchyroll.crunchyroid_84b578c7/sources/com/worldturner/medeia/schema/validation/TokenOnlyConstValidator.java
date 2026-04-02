package com.worldturner.medeia.schema.validation;

import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.api.FailedValidationResult;
import com.worldturner.medeia.api.OkValidationResult;
import com.worldturner.medeia.api.ValidationResult;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.JsonTokenLocation;
import com.worldturner.medeia.parser.SimpleNode;
import com.worldturner.medeia.schema.validation.stream.SchemaValidatorInstance;
import java.net.URI;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: ConstValidator.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0016\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/worldturner/medeia/schema/validation/TokenOnlyConstValidator;", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "Lcom/worldturner/medeia/schema/validation/stream/SchemaValidatorInstance;", "", "startLevel", "createInstance", "", "Ljava/net/URI;", "unknownRefs", "Lcom/amazon/aps/iva/kb0/q;", "recordUnknownRefs", "Lcom/worldturner/medeia/parser/JsonTokenData;", "token", "Lcom/worldturner/medeia/parser/JsonTokenLocation;", FirebaseAnalytics.Param.LOCATION, "Lcom/worldturner/medeia/api/ValidationResult;", "validate", "Lcom/worldturner/medeia/parser/SimpleNode;", "const", "Lcom/worldturner/medeia/parser/SimpleNode;", "getConst", "()Lcom/worldturner/medeia/parser/SimpleNode;", "<init>", "(Lcom/worldturner/medeia/parser/SimpleNode;)V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class TokenOnlyConstValidator implements SchemaValidator, SchemaValidatorInstance {

    /* renamed from: const  reason: not valid java name */
    private final SimpleNode f16const;

    public TokenOnlyConstValidator(SimpleNode simpleNode) {
        j.g(simpleNode, "const");
        this.f16const = simpleNode;
    }

    public final SimpleNode getConst() {
        return this.f16const;
    }

    @Override // com.worldturner.medeia.schema.validation.SchemaValidator
    public void recordUnknownRefs(Collection<URI> collection) {
        j.g(collection, "unknownRefs");
    }

    @Override // com.worldturner.medeia.schema.validation.stream.SchemaValidatorInstance
    public ValidationResult validate(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        FailedValidationResult fail;
        FailedValidationResult fail2;
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        if (!jsonTokenData.getType().getNonStructureToken()) {
            fail2 = ConstValidatorKt.fail(jsonTokenLocation, "Single-value const doesn't match");
            return fail2;
        } else if (!j.a(this.f16const.getToken(), jsonTokenData)) {
            fail = ConstValidatorKt.fail(jsonTokenLocation, "Const doesn't match");
            return fail;
        } else {
            return OkValidationResult.INSTANCE;
        }
    }

    @Override // com.worldturner.medeia.schema.validation.SchemaValidator
    public SchemaValidatorInstance createInstance(int i) {
        return this;
    }
}
