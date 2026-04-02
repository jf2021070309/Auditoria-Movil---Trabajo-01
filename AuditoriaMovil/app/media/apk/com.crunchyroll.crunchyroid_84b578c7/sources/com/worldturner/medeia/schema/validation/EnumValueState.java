package com.worldturner.medeia.schema.validation;

import com.amazon.aps.iva.yb0.j;
import com.worldturner.medeia.parser.TreeNode;
import java.util.ArrayDeque;
import java.util.Deque;
import kotlin.Metadata;
/* compiled from: EnumValidator.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0004¨\u0006\r"}, d2 = {"Lcom/worldturner/medeia/schema/validation/EnumValueState;", "", "enumValue", "Lcom/worldturner/medeia/parser/TreeNode;", "(Lcom/worldturner/medeia/parser/TreeNode;)V", "constStack", "Ljava/util/Deque;", "getConstStack$medeia_validator_core", "()Ljava/util/Deque;", "currentConst", "getCurrentConst$medeia_validator_core", "()Lcom/worldturner/medeia/parser/TreeNode;", "setCurrentConst$medeia_validator_core", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class EnumValueState {
    private final Deque<TreeNode> constStack;
    private TreeNode currentConst;

    public EnumValueState(TreeNode treeNode) {
        j.g(treeNode, "enumValue");
        this.constStack = new ArrayDeque();
        this.currentConst = treeNode;
    }

    public final Deque<TreeNode> getConstStack$medeia_validator_core() {
        return this.constStack;
    }

    public final TreeNode getCurrentConst$medeia_validator_core() {
        return this.currentConst;
    }

    public final void setCurrentConst$medeia_validator_core(TreeNode treeNode) {
        this.currentConst = treeNode;
    }
}
