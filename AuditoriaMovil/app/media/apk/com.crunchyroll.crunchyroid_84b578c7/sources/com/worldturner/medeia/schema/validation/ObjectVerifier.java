package com.worldturner.medeia.schema.validation;

import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.api.FailedValidationResult;
import com.worldturner.medeia.api.OkValidationResult;
import com.worldturner.medeia.api.ValidationResult;
import com.worldturner.medeia.parser.JsonTokenLocation;
import com.worldturner.medeia.parser.ObjectNode;
import com.worldturner.medeia.parser.TreeNode;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: ConstValidator.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/worldturner/medeia/schema/validation/ObjectVerifier;", "Lcom/worldturner/medeia/schema/validation/ConstVerifier;", "()V", "propertyNames", "", "", "getPropertyNames", "()Ljava/util/Set;", "verify", "Lcom/worldturner/medeia/api/ValidationResult;", "node", "Lcom/worldturner/medeia/parser/TreeNode;", FirebaseAnalytics.Param.LOCATION, "Lcom/worldturner/medeia/parser/JsonTokenLocation;", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class ObjectVerifier implements ConstVerifier {
    private final Set<String> propertyNames = new LinkedHashSet();

    public final Set<String> getPropertyNames() {
        return this.propertyNames;
    }

    @Override // com.worldturner.medeia.schema.validation.ConstVerifier
    public ValidationResult verify(TreeNode treeNode, JsonTokenLocation jsonTokenLocation) {
        FailedValidationResult fail;
        FailedValidationResult fail2;
        j.g(treeNode, "node");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        if (!(treeNode instanceof ObjectNode)) {
            fail2 = ConstValidatorKt.fail(jsonTokenLocation, "Type mismatch");
            return fail2;
        }
        ObjectNode objectNode = (ObjectNode) treeNode;
        if (!j.a(objectNode.getNodes().keySet(), this.propertyNames)) {
            fail = ConstValidatorKt.fail(jsonTokenLocation, "Property names " + this.propertyNames + " not equal to const property names " + objectNode.getNodes().keySet());
            return fail;
        }
        return OkValidationResult.INSTANCE;
    }
}
