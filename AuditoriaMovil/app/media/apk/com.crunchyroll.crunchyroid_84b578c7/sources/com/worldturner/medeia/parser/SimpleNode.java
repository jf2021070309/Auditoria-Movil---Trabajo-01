package com.worldturner.medeia.parser;

import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: SimpleTree.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u0005H\u0016J\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0001H\u0010¢\u0006\u0002\b\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/worldturner/medeia/parser/SimpleNode;", "Lcom/worldturner/medeia/parser/TreeNode;", "token", "Lcom/worldturner/medeia/parser/JsonTokenData;", "line", "", "column", "(Lcom/worldturner/medeia/parser/JsonTokenData;II)V", "getToken", "()Lcom/worldturner/medeia/parser/JsonTokenData;", "hashCode", "isEqualTo", "", "other", "isEqualTo$medeia_validator_core", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class SimpleNode extends TreeNode {
    private final JsonTokenData token;

    public /* synthetic */ SimpleNode(JsonTokenData jsonTokenData, int i, int i2, int i3, e eVar) {
        this(jsonTokenData, (i3 & 2) != 0 ? -1 : i, (i3 & 4) != 0 ? -1 : i2);
    }

    public final JsonTokenData getToken() {
        return this.token;
    }

    public int hashCode() {
        return this.token.hashCode();
    }

    @Override // com.worldturner.medeia.parser.TreeNode
    public boolean isEqualTo$medeia_validator_core(TreeNode treeNode) {
        j.g(treeNode, "other");
        if ((treeNode instanceof SimpleNode) && j.a(this.token, ((SimpleNode) treeNode).token)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleNode(JsonTokenData jsonTokenData, int i, int i2) {
        super(i, i2, null);
        j.g(jsonTokenData, "token");
        this.token = jsonTokenData;
    }
}
