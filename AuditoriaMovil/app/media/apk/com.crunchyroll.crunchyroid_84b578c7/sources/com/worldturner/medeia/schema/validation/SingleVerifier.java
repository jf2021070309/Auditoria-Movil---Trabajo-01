package com.worldturner.medeia.schema.validation;

import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.api.FailedValidationResult;
import com.worldturner.medeia.api.OkValidationResult;
import com.worldturner.medeia.api.ValidationResult;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.JsonTokenLocation;
import com.worldturner.medeia.parser.SimpleNode;
import com.worldturner.medeia.parser.TreeNode;
import kotlin.Metadata;
/* compiled from: ConstValidator.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/worldturner/medeia/schema/validation/SingleVerifier;", "Lcom/worldturner/medeia/schema/validation/ConstVerifier;", "token", "Lcom/worldturner/medeia/parser/JsonTokenData;", "(Lcom/worldturner/medeia/parser/JsonTokenData;)V", "getToken", "()Lcom/worldturner/medeia/parser/JsonTokenData;", "verify", "Lcom/worldturner/medeia/api/ValidationResult;", "node", "Lcom/worldturner/medeia/parser/TreeNode;", FirebaseAnalytics.Param.LOCATION, "Lcom/worldturner/medeia/parser/JsonTokenLocation;", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class SingleVerifier implements ConstVerifier {
    private final JsonTokenData token;

    public SingleVerifier(JsonTokenData jsonTokenData) {
        j.g(jsonTokenData, "token");
        this.token = jsonTokenData;
    }

    public final JsonTokenData getToken() {
        return this.token;
    }

    @Override // com.worldturner.medeia.schema.validation.ConstVerifier
    public ValidationResult verify(TreeNode treeNode, JsonTokenLocation jsonTokenLocation) {
        FailedValidationResult fail;
        FailedValidationResult fail2;
        j.g(treeNode, "node");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        if (!(treeNode instanceof SimpleNode)) {
            fail2 = ConstValidatorKt.fail(jsonTokenLocation, "Type mismatch");
            return fail2;
        }
        SimpleNode simpleNode = (SimpleNode) treeNode;
        if (!j.a(simpleNode.getToken(), this.token)) {
            fail = ConstValidatorKt.fail(jsonTokenLocation, "Item " + this.token + " not equal to const item " + simpleNode.getToken());
            return fail;
        }
        return OkValidationResult.INSTANCE;
    }
}
