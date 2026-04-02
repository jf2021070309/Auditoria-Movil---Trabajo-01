package com.worldturner.medeia.schema.validation;

import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.worldturner.medeia.parser.SimpleNode;
import com.worldturner.medeia.parser.TreeNode;
import com.worldturner.medeia.schema.validation.stream.SchemaValidatorInstance;
import java.net.URI;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: ConstValidator.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/worldturner/medeia/schema/validation/ConstValidator;", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "", "startLevel", "Lcom/worldturner/medeia/schema/validation/stream/SchemaValidatorInstance;", "createInstance", "", "Ljava/net/URI;", "unknownRefs", "Lcom/amazon/aps/iva/kb0/q;", "recordUnknownRefs", "Lcom/worldturner/medeia/parser/TreeNode;", "const", "Lcom/worldturner/medeia/parser/TreeNode;", "getConst", "()Lcom/worldturner/medeia/parser/TreeNode;", "<init>", "(Lcom/worldturner/medeia/parser/TreeNode;)V", "Companion", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class ConstValidator implements SchemaValidator {
    public static final Companion Companion = new Companion(null);

    /* renamed from: const  reason: not valid java name */
    private final TreeNode f12const;

    /* compiled from: ConstValidator.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/worldturner/medeia/schema/validation/ConstValidator$Companion;", "", "()V", "create", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "const", "Lcom/worldturner/medeia/parser/TreeNode;", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final SchemaValidator create(TreeNode treeNode) {
            if (treeNode != null) {
                if (treeNode instanceof SimpleNode) {
                    return new TokenOnlyConstValidator((SimpleNode) treeNode);
                }
                return new ConstValidator(treeNode);
            }
            return null;
        }
    }

    public ConstValidator(TreeNode treeNode) {
        j.g(treeNode, "const");
        this.f12const = treeNode;
    }

    @Override // com.worldturner.medeia.schema.validation.SchemaValidator
    public SchemaValidatorInstance createInstance(int i) {
        return new ConstValidatorInstance(i, this.f12const);
    }

    public final TreeNode getConst() {
        return this.f12const;
    }

    @Override // com.worldturner.medeia.schema.validation.SchemaValidator
    public void recordUnknownRefs(Collection<URI> collection) {
        j.g(collection, "unknownRefs");
    }
}
