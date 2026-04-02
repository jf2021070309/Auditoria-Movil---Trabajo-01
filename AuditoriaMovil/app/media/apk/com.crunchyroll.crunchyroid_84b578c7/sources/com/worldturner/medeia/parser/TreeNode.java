package com.worldturner.medeia.parser;

import com.amazon.aps.iva.kb0.o;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.worldturner.medeia.parser.type.SimpleTreeType;
import kotlin.Metadata;
/* compiled from: SimpleTree.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u001b\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0015\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0000H ¢\u0006\u0002\b\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u0082\u0001\u0003\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/worldturner/medeia/parser/TreeNode;", "", "line", "", "column", "(II)V", "getColumn", "()I", "getLine", "equals", "", "other", "isEqualTo", "isEqualTo$medeia_validator_core", "textProperty", "", "fieldName", "toString", "Lcom/worldturner/medeia/parser/SimpleNode;", "Lcom/worldturner/medeia/parser/ArrayNode;", "Lcom/worldturner/medeia/parser/ObjectNode;", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public abstract class TreeNode {
    private final int column;
    private final int line;

    private TreeNode(int i, int i2) {
        this.line = i;
        this.column = i2;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (true ^ j.a(cls2, cls)) {
            return false;
        }
        if (obj != null) {
            return isEqualTo$medeia_validator_core((TreeNode) obj);
        }
        throw new o("null cannot be cast to non-null type com.worldturner.medeia.parser.TreeNode");
    }

    public final int getColumn() {
        return this.column;
    }

    public final int getLine() {
        return this.line;
    }

    public abstract boolean isEqualTo$medeia_validator_core(TreeNode treeNode);

    public String textProperty(String str) {
        j.g(str, "fieldName");
        return null;
    }

    public String toString() {
        TextOutputBuilder textOutputBuilder = new TextOutputBuilder();
        SimpleTreeType.INSTANCE.write(this, textOutputBuilder);
        return textOutputBuilder.toString();
    }

    public /* synthetic */ TreeNode(int i, int i2, e eVar) {
        this(i, i2);
    }

    public /* synthetic */ TreeNode(int i, int i2, int i3, e eVar) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2);
    }
}
