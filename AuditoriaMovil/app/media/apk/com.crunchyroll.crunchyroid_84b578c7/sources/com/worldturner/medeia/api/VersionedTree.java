package com.worldturner.medeia.api;

import com.amazon.aps.iva.yb0.j;
import com.worldturner.medeia.parser.TreeNode;
import kotlin.Metadata;
/* compiled from: MedeiaApiBase.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/worldturner/medeia/api/VersionedTree;", "", "tree", "Lcom/worldturner/medeia/parser/TreeNode;", "version", "Lcom/worldturner/medeia/api/JsonSchemaVersion;", "inputSourceName", "", "(Lcom/worldturner/medeia/parser/TreeNode;Lcom/worldturner/medeia/api/JsonSchemaVersion;Ljava/lang/String;)V", "getInputSourceName", "()Ljava/lang/String;", "getTree", "()Lcom/worldturner/medeia/parser/TreeNode;", "getVersion", "()Lcom/worldturner/medeia/api/JsonSchemaVersion;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class VersionedTree {
    private final String inputSourceName;
    private final TreeNode tree;
    private final JsonSchemaVersion version;

    public VersionedTree(TreeNode treeNode, JsonSchemaVersion jsonSchemaVersion, String str) {
        j.g(treeNode, "tree");
        j.g(jsonSchemaVersion, "version");
        this.tree = treeNode;
        this.version = jsonSchemaVersion;
        this.inputSourceName = str;
    }

    public static /* synthetic */ VersionedTree copy$default(VersionedTree versionedTree, TreeNode treeNode, JsonSchemaVersion jsonSchemaVersion, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            treeNode = versionedTree.tree;
        }
        if ((i & 2) != 0) {
            jsonSchemaVersion = versionedTree.version;
        }
        if ((i & 4) != 0) {
            str = versionedTree.inputSourceName;
        }
        return versionedTree.copy(treeNode, jsonSchemaVersion, str);
    }

    public final TreeNode component1() {
        return this.tree;
    }

    public final JsonSchemaVersion component2() {
        return this.version;
    }

    public final String component3() {
        return this.inputSourceName;
    }

    public final VersionedTree copy(TreeNode treeNode, JsonSchemaVersion jsonSchemaVersion, String str) {
        j.g(treeNode, "tree");
        j.g(jsonSchemaVersion, "version");
        return new VersionedTree(treeNode, jsonSchemaVersion, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VersionedTree) {
                VersionedTree versionedTree = (VersionedTree) obj;
                if (!j.a(this.tree, versionedTree.tree) || !j.a(this.version, versionedTree.version) || !j.a(this.inputSourceName, versionedTree.inputSourceName)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final String getInputSourceName() {
        return this.inputSourceName;
    }

    public final TreeNode getTree() {
        return this.tree;
    }

    public final JsonSchemaVersion getVersion() {
        return this.version;
    }

    public int hashCode() {
        int i;
        int i2;
        TreeNode treeNode = this.tree;
        int i3 = 0;
        if (treeNode != null) {
            i = treeNode.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        JsonSchemaVersion jsonSchemaVersion = this.version;
        if (jsonSchemaVersion != null) {
            i2 = jsonSchemaVersion.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str = this.inputSourceName;
        if (str != null) {
            i3 = str.hashCode();
        }
        return i5 + i3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VersionedTree(tree=");
        sb.append(this.tree);
        sb.append(", version=");
        sb.append(this.version);
        sb.append(", inputSourceName=");
        return b.c(sb, this.inputSourceName, ")");
    }
}
