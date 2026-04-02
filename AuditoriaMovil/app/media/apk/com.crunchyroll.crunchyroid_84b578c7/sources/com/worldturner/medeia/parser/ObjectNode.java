package com.worldturner.medeia.parser;

import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: SimpleTree.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\u0003H\u0016J\u0015\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0001H\u0010¢\u0006\u0002\b\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0016R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/worldturner/medeia/parser/ObjectNode;", "Lcom/worldturner/medeia/parser/TreeNode;", "line", "", "column", "nodes", "", "", "(IILjava/util/Map;)V", "getNodes", "()Ljava/util/Map;", "hashCode", "isEqualTo", "", "other", "isEqualTo$medeia_validator_core", "textProperty", "fieldName", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class ObjectNode extends TreeNode {
    private final Map<String, TreeNode> nodes;

    public ObjectNode() {
        this(0, 0, null, 7, null);
    }

    public final Map<String, TreeNode> getNodes() {
        return this.nodes;
    }

    public int hashCode() {
        return this.nodes.hashCode();
    }

    @Override // com.worldturner.medeia.parser.TreeNode
    public boolean isEqualTo$medeia_validator_core(TreeNode treeNode) {
        j.g(treeNode, "other");
        if ((treeNode instanceof ObjectNode) && j.a(this.nodes, ((ObjectNode) treeNode).nodes)) {
            return true;
        }
        return false;
    }

    @Override // com.worldturner.medeia.parser.TreeNode
    public String textProperty(String str) {
        j.g(str, "fieldName");
        TreeNode treeNode = this.nodes.get(str);
        if (!(treeNode instanceof SimpleNode)) {
            return null;
        }
        SimpleNode simpleNode = (SimpleNode) treeNode;
        if (simpleNode.getToken().getType() != JsonTokenType.VALUE_TEXT) {
            return null;
        }
        String text = simpleNode.getToken().getText();
        if (text != null) {
            return text;
        }
        j.l();
        throw null;
    }

    public /* synthetic */ ObjectNode(int i, int i2, Map map, int i3, e eVar) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? new LinkedHashMap() : map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObjectNode(int i, int i2, Map<String, TreeNode> map) {
        super(i, i2, null);
        j.g(map, "nodes");
        this.nodes = map;
    }
}
