package com.worldturner.medeia.schema.validation;

import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.api.FailedValidationResult;
import com.worldturner.medeia.api.OkValidationResult;
import com.worldturner.medeia.api.ValidationResult;
import com.worldturner.medeia.parser.ArrayNode;
import com.worldturner.medeia.parser.JsonTokenLocation;
import com.worldturner.medeia.parser.TreeNode;
import kotlin.Metadata;
/* compiled from: ConstValidator.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/worldturner/medeia/schema/validation/ArrayVerifier;", "Lcom/worldturner/medeia/schema/validation/ConstVerifier;", "()V", "itemCount", "", "getItemCount", "()I", "setItemCount", "(I)V", "verify", "Lcom/worldturner/medeia/api/ValidationResult;", "node", "Lcom/worldturner/medeia/parser/TreeNode;", FirebaseAnalytics.Param.LOCATION, "Lcom/worldturner/medeia/parser/JsonTokenLocation;", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class ArrayVerifier implements ConstVerifier {
    private int itemCount;

    public final int getItemCount() {
        return this.itemCount;
    }

    public final void setItemCount(int i) {
        this.itemCount = i;
    }

    @Override // com.worldturner.medeia.schema.validation.ConstVerifier
    public ValidationResult verify(TreeNode treeNode, JsonTokenLocation jsonTokenLocation) {
        FailedValidationResult fail;
        FailedValidationResult fail2;
        j.g(treeNode, "node");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        if (!(treeNode instanceof ArrayNode)) {
            fail2 = ConstValidatorKt.fail(jsonTokenLocation, "Type mismatch");
            return fail2;
        }
        ArrayNode arrayNode = (ArrayNode) treeNode;
        if (arrayNode.getNodes().size() != this.itemCount) {
            fail = ConstValidatorKt.fail(jsonTokenLocation, "Array length " + this.itemCount + " not equal to const array length " + arrayNode.getNodes().size());
            return fail;
        }
        return OkValidationResult.INSTANCE;
    }
}
