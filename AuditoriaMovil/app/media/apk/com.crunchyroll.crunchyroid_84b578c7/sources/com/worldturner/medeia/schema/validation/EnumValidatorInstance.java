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
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: EnumValidator.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/worldturner/medeia/schema/validation/EnumValidatorInstance;", "Lcom/worldturner/medeia/schema/validation/stream/SchemaValidatorInstance;", "startLevel", "", "enum", "", "Lcom/worldturner/medeia/parser/TreeNode;", "(ILjava/util/Set;)V", "currentProperty", "", "getEnum", "()Ljava/util/Set;", "enumValueStates", "", "Lcom/worldturner/medeia/schema/validation/EnumValueState;", "getStartLevel", "()I", "verificationStack", "Ljava/util/Deque;", "Lcom/worldturner/medeia/schema/validation/ConstVerifier;", "validate", "Lcom/worldturner/medeia/api/ValidationResult;", "token", "Lcom/worldturner/medeia/parser/JsonTokenData;", FirebaseAnalytics.Param.LOCATION, "Lcom/worldturner/medeia/parser/JsonTokenLocation;", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class EnumValidatorInstance implements SchemaValidatorInstance {
    private String currentProperty;

    /* renamed from: enum  reason: not valid java name */
    private final Set<TreeNode> f15enum;
    private final List<EnumValueState> enumValueStates;
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

    /* JADX WARN: Multi-variable type inference failed */
    public EnumValidatorInstance(int i, Set<? extends TreeNode> set) {
        j.g(set, "enum");
        this.startLevel = i;
        this.f15enum = set;
        this.verificationStack = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        for (TreeNode treeNode : set) {
            arrayList.add(new EnumValueState(treeNode));
        }
        this.enumValueStates = arrayList;
    }

    public final Set<TreeNode> getEnum() {
        return this.f15enum;
    }

    public final int getStartLevel() {
        return this.startLevel;
    }

    @Override // com.worldturner.medeia.schema.validation.stream.SchemaValidatorInstance
    public ValidationResult validate(JsonTokenData jsonTokenData, JsonTokenLocation jsonTokenLocation) {
        FailedValidationResult fail;
        TreeNode pop;
        ConstVerifier peek;
        ConstVerifier objectVerifier;
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
                    Iterator<EnumValueState> it = this.enumValueStates.iterator();
                    while (it.hasNext()) {
                        EnumValueState next = it.next();
                        TreeNode currentConst$medeia_validator_core = next.getCurrentConst$medeia_validator_core();
                        if (currentConst$medeia_validator_core instanceof ObjectNode) {
                            next.getConstStack$medeia_validator_core().push(currentConst$medeia_validator_core);
                            Map<String, TreeNode> nodes = ((ObjectNode) currentConst$medeia_validator_core).getNodes();
                            String str2 = this.currentProperty;
                            if (str2 != null) {
                                TreeNode treeNode = nodes.get(str2);
                                if (treeNode != null) {
                                    next.setCurrentConst$medeia_validator_core(treeNode);
                                } else {
                                    it.remove();
                                }
                            } else {
                                j.l();
                                throw null;
                            }
                        } else {
                            it.remove();
                        }
                    }
                } else {
                    j.l();
                    throw null;
                }
            } else if (peek instanceof ArrayVerifier) {
                Iterator<EnumValueState> it2 = this.enumValueStates.iterator();
                while (it2.hasNext()) {
                    EnumValueState next2 = it2.next();
                    TreeNode currentConst$medeia_validator_core2 = next2.getCurrentConst$medeia_validator_core();
                    if (currentConst$medeia_validator_core2 instanceof ArrayNode) {
                        ArrayNode arrayNode = (ArrayNode) currentConst$medeia_validator_core2;
                        ArrayVerifier arrayVerifier = (ArrayVerifier) peek;
                        if (arrayNode.getNodes().size() <= arrayVerifier.getItemCount()) {
                            it2.remove();
                        } else {
                            next2.getConstStack$medeia_validator_core().push(currentConst$medeia_validator_core2);
                            next2.setCurrentConst$medeia_validator_core(arrayNode.getNodes().get(arrayVerifier.getItemCount()));
                        }
                    } else {
                        it2.remove();
                    }
                }
                ArrayVerifier arrayVerifier2 = (ArrayVerifier) peek;
                arrayVerifier2.setItemCount(arrayVerifier2.getItemCount() + 1);
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
                Iterator<EnumValueState> it3 = this.enumValueStates.iterator();
                while (it3.hasNext()) {
                    EnumValueState next3 = it3.next();
                    TreeNode currentConst$medeia_validator_core3 = next3.getCurrentConst$medeia_validator_core();
                    if (currentConst$medeia_validator_core3 != null) {
                        if (!constVerifier.verify(currentConst$medeia_validator_core3, jsonTokenLocation).getValid()) {
                            it3.remove();
                        } else {
                            if (next3.getConstStack$medeia_validator_core().isEmpty()) {
                                pop = null;
                            } else {
                                pop = next3.getConstStack$medeia_validator_core().pop();
                            }
                            next3.setCurrentConst$medeia_validator_core(pop);
                        }
                    } else {
                        j.l();
                        throw null;
                    }
                }
                if (jsonTokenLocation.getLevel() == this.startLevel) {
                    if (!(!this.enumValueStates.isEmpty())) {
                        fail = EnumValidatorKt.fail(jsonTokenLocation, "None of the enum values matched");
                        return fail;
                    }
                    return OkValidationResult.INSTANCE;
                }
            } else {
                j.l();
                throw null;
            }
        }
        return null;
    }
}
