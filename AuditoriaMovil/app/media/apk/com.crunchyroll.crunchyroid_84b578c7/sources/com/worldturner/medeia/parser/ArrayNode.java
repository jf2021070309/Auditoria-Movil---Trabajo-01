package com.worldturner.medeia.parser;

import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: SimpleTree.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u0003H\u0016J\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0001H\u0010¢\u0006\u0002\b\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/worldturner/medeia/parser/ArrayNode;", "Lcom/worldturner/medeia/parser/TreeNode;", "line", "", "column", "nodes", "", "(IILjava/util/List;)V", "getNodes", "()Ljava/util/List;", "hashCode", "isEqualTo", "", "other", "isEqualTo$medeia_validator_core", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class ArrayNode extends TreeNode {
    private final List<TreeNode> nodes;

    public ArrayNode() {
        this(0, 0, null, 7, null);
    }

    public final List<TreeNode> getNodes() {
        return this.nodes;
    }

    public int hashCode() {
        return this.nodes.hashCode();
    }

    @Override // com.worldturner.medeia.parser.TreeNode
    public boolean isEqualTo$medeia_validator_core(TreeNode treeNode) {
        j.g(treeNode, "other");
        if ((treeNode instanceof ArrayNode) && j.a(this.nodes, ((ArrayNode) treeNode).nodes)) {
            return true;
        }
        return false;
    }

    public /* synthetic */ ArrayNode(int i, int i2, List list, int i3, e eVar) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? new ArrayList() : list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArrayNode(int i, int i2, List<TreeNode> list) {
        super(i, i2, null);
        j.g(list, "nodes");
        this.nodes = list;
    }
}
