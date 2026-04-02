package com.worldturner.medeia.schema.validation;

import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.worldturner.medeia.parser.SimpleNode;
import com.worldturner.medeia.parser.TreeNode;
import com.worldturner.medeia.schema.validation.stream.SchemaValidatorInstance;
import java.net.URI;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: EnumValidator.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0015\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/worldturner/medeia/schema/validation/EnumValidator;", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "", "startLevel", "Lcom/worldturner/medeia/schema/validation/stream/SchemaValidatorInstance;", "createInstance", "", "Ljava/net/URI;", "unknownRefs", "Lcom/amazon/aps/iva/kb0/q;", "recordUnknownRefs", "", "Lcom/worldturner/medeia/parser/TreeNode;", "enum", "Ljava/util/Set;", "getEnum", "()Ljava/util/Set;", "<init>", "(Ljava/util/Set;)V", "Companion", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class EnumValidator implements SchemaValidator {
    public static final Companion Companion = new Companion(null);

    /* renamed from: enum  reason: not valid java name */
    private final Set<TreeNode> f14enum;

    /* compiled from: EnumValidator.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¨\u0006\b"}, d2 = {"Lcom/worldturner/medeia/schema/validation/EnumValidator$Companion;", "", "()V", "create", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "enum", "", "Lcom/worldturner/medeia/parser/TreeNode;", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SchemaValidator create$default(Companion companion, Set set, int i, Object obj) {
            if ((i & 1) != 0) {
                set = null;
            }
            return companion.create(set);
        }

        public final SchemaValidator create(Set<? extends TreeNode> set) {
            if (set != null) {
                Set<? extends TreeNode> set2 = set;
                boolean z = true;
                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                    Iterator<T> it = set2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (!(((TreeNode) it.next()) instanceof SimpleNode)) {
                            z = false;
                            break;
                        }
                    }
                }
                if (z) {
                    return new TokenOnlyEnumValidator(set);
                }
                return new EnumValidator(set);
            }
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EnumValidator(Set<? extends TreeNode> set) {
        j.g(set, "enum");
        this.f14enum = set;
    }

    @Override // com.worldturner.medeia.schema.validation.SchemaValidator
    public SchemaValidatorInstance createInstance(int i) {
        return new EnumValidatorInstance(i, this.f14enum);
    }

    public final Set<TreeNode> getEnum() {
        return this.f14enum;
    }

    @Override // com.worldturner.medeia.schema.validation.SchemaValidator
    public void recordUnknownRefs(Collection<URI> collection) {
        j.g(collection, "unknownRefs");
    }
}
