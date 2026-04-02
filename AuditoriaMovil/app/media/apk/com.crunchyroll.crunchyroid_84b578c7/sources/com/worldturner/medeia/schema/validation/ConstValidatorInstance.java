package com.worldturner.medeia.schema.validation;

import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.api.FailedValidationResult;
import com.worldturner.medeia.api.OkValidationResult;
import com.worldturner.medeia.api.ValidationResult;
import com.worldturner.medeia.parser.ArrayNode;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.JsonTokenLocation;
import com.worldturner.medeia.parser.JsonTokenType;
import com.worldturner.medeia.parser.ObjectNode;
import com.worldturner.medeia.parser.TreeNode;
import com.worldturner.medeia.schema.validation.stream.SchemaValidatorInstance;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: ConstValidator.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/worldturner/medeia/schema/validation/ConstValidatorInstance;", "Lcom/worldturner/medeia/schema/validation/stream/SchemaValidatorInstance;", "startLevel", "", "const", "Lcom/worldturner/medeia/parser/TreeNode;", "(ILcom/worldturner/medeia/parser/TreeNode;)V", "getConst", "()Lcom/worldturner/medeia/parser/TreeNode;", "constStack", "Ljava/util/Deque;", "currentConst", "currentProperty", "", "getStartLevel", "()I", "verificationStack", "Lcom/worldturner/medeia/schema/validation/ConstVerifier;", "validate", "Lcom/worldturner/medeia/api/ValidationResult;", "token", "Lcom/worldturner/medeia/parser/JsonTokenData;", FirebaseAnalytics.Param.LOCATION, "Lcom/worldturner/medeia/parser/JsonTokenLocation;", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class ConstValidatorInstance implements SchemaValidatorInstance {

    /* renamed from: const  reason: not valid java name */
    private final TreeNode f13const;
    private final Deque<TreeNode> constStack;
    private TreeNode currentConst;
    private String currentProperty;
    private final int startLevel;
    private final Deque<ConstVerifier> verificationStack;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes4.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JsonTokenType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[JsonTokenType.START_OBJECT.ordinal()] = 1;
            iArr[JsonTokenType.START_ARRAY.ordinal()] = 2;
        }
    }

    public ConstValidatorInstance(int i, TreeNode treeNode) {
        j.g(treeNode, "const");
        this.startLevel = i;
        this.f13const = treeNode;
        this.verificationStack = new ArrayDeque();
        this.constStack = new ArrayDeque();
        this.currentConst = treeNode;
    }

    public final TreeNode getConst() {
        return this.f13const;
    }

    public final int getStartLevel() {
        return this.startLevel;
    }

    @Override // com.worldturner.medeia.schema.validation.stream.SchemaValidatorInstance
    public ValidationResult validate(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        TreeNode pop;
        ConstVerifier peek;
        FailedValidationResult fail;
        FailedValidationResult fail2;
        ConstVerifier objectVerifier;
        FailedValidationResult fail3;
        FailedValidationResult fail4;
        j.g(jsonTokenData, "token");
        j.g(jsonTokenLocation, FirebaseAnalytics.Param.LOCATION);
        if (jsonTokenData.getType() == JsonTokenType.FIELD_NAME) {
            String text = jsonTokenData.getText();
            if (text != null) {
                this.currentProperty = text;
                return null;
            }
            j.l();
            throw null;
        }
        TreeNode treeNode = this.currentConst;
        if (jsonTokenData.getType().getFirstToken()) {
            if (this.verificationStack.isEmpty()) {
                peek = null;
            } else {
                peek = this.verificationStack.peek();
            }
            if (peek instanceof ObjectVerifier) {
                Set<String> propertyNames = ((ObjectVerifier) peek).getPropertyNames();
                String str = this.currentProperty;
                if (str != null) {
                    propertyNames.add(str);
                    if (treeNode instanceof ObjectNode) {
                        this.constStack.push(treeNode);
                        Map<String, TreeNode> nodes = ((ObjectNode) treeNode).getNodes();
                        String str2 = this.currentProperty;
                        if (str2 != null) {
                            TreeNode treeNode2 = nodes.get(str2);
                            if (treeNode2 != null) {
                                this.currentConst = treeNode2;
                            } else {
                                fail4 = ConstValidatorKt.fail(jsonTokenLocation, "Const validation failed at level " + this.verificationStack.size() + ", property " + this.currentProperty + " doesn't exist in const value");
                                return fail4;
                            }
                        } else {
                            j.l();
                            throw null;
                        }
                    } else {
                        fail3 = ConstValidatorKt.fail(jsonTokenLocation, "Const validation failed at level " + this.verificationStack.size() + ", const value is not an object at this point");
                        return fail3;
                    }
                } else {
                    j.l();
                    throw null;
                }
            } else if (peek instanceof ArrayVerifier) {
                if (treeNode instanceof ArrayNode) {
                    ArrayNode arrayNode = (ArrayNode) treeNode;
                    ArrayVerifier arrayVerifier = (ArrayVerifier) peek;
                    if (arrayNode.getNodes().size() <= arrayVerifier.getItemCount()) {
                        fail2 = ConstValidatorKt.fail(jsonTokenLocation, "Const validation failed at level " + this.verificationStack.size() + ", index " + arrayVerifier.getItemCount() + " doesn't exist in array in const value");
                        return fail2;
                    }
                    this.constStack.push(treeNode);
                    this.currentConst = arrayNode.getNodes().get(arrayVerifier.getItemCount());
                    arrayVerifier.setItemCount(arrayVerifier.getItemCount() + 1);
                } else {
                    fail = ConstValidatorKt.fail(jsonTokenLocation, "Const validation failed at level " + this.verificationStack.size() + ", const value is not an array at this point");
                    return fail;
                }
            }
            int i = WhenMappings.$EnumSwitchMapping$0[jsonTokenData.getType().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    objectVerifier = new SingleVerifier(jsonTokenData);
                } else {
                    objectVerifier = new ArrayVerifier();
                }
            } else {
                objectVerifier = new ObjectVerifier();
            }
            this.verificationStack.push(objectVerifier);
        }
        if (jsonTokenData.getType().getLastToken()) {
            ConstVerifier pop2 = this.verificationStack.pop();
            if (pop2 != null) {
                ConstVerifier constVerifier = pop2;
                TreeNode treeNode3 = this.currentConst;
                if (treeNode3 != null) {
                    ValidationResult verify = constVerifier.verify(treeNode3, jsonTokenLocation);
                    if (!verify.getValid()) {
                        return verify;
                    }
                    if (this.constStack.isEmpty()) {
                        pop = null;
                    } else {
                        pop = this.constStack.pop();
                    }
                    this.currentConst = pop;
                    if (jsonTokenLocation.getLevel() == this.startLevel) {
                        return OkValidationResult.INSTANCE;
                    }
                } else {
                    j.l();
                    throw null;
                }
            } else {
                j.l();
                throw null;
            }
        }
        return null;
    }
}
