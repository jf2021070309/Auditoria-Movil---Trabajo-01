package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.graph.AbstractBaseGraph;
import com.google.common.math.IntMath;
import com.google.common.primitives.Ints;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;
@ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public abstract class AbstractBaseGraph<N> implements BaseGraph<N> {

    /* renamed from: com.google.common.graph.AbstractBaseGraph$2 */
    /* loaded from: classes3.dex */
    public class AnonymousClass2 extends IncidentEdgeSet<N> {
        public AnonymousClass2(AbstractBaseGraph abstractBaseGraph, BaseGraph baseGraph, Object obj) {
            super(baseGraph, obj);
        }

        public /* synthetic */ EndpointPair lambda$iterator$0(Object obj) {
            return EndpointPair.ordered(obj, this.node);
        }

        public /* synthetic */ EndpointPair lambda$iterator$1(Object obj) {
            return EndpointPair.ordered(this.node, obj);
        }

        public /* synthetic */ EndpointPair lambda$iterator$2(Object obj) {
            return EndpointPair.unordered(this.node, obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<EndpointPair<N>> iterator() {
            if (this.graph.isDirected()) {
                return Iterators.unmodifiableIterator(Iterators.concat(Iterators.transform(this.graph.predecessors((BaseGraph<N>) this.node).iterator(), new Function() { // from class: com.google.common.graph.a
                    @Override // com.google.common.base.Function
                    public final Object apply(Object obj) {
                        EndpointPair lambda$iterator$0;
                        lambda$iterator$0 = AbstractBaseGraph.AnonymousClass2.this.lambda$iterator$0(obj);
                        return lambda$iterator$0;
                    }
                }), Iterators.transform(Sets.difference(this.graph.successors((BaseGraph<N>) this.node), ImmutableSet.of(this.node)).iterator(), new b(this, 0))));
            }
            return Iterators.unmodifiableIterator(Iterators.transform(this.graph.adjacentNodes(this.node).iterator(), new Function() { // from class: com.google.common.graph.c
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    EndpointPair lambda$iterator$2;
                    lambda$iterator$2 = AbstractBaseGraph.AnonymousClass2.this.lambda$iterator$2(obj);
                    return lambda$iterator$2;
                }
            }));
        }
    }

    @Override // com.google.common.graph.BaseGraph
    public int degree(N n) {
        int i;
        if (isDirected()) {
            return IntMath.saturatedAdd(predecessors((AbstractBaseGraph<N>) n).size(), successors((AbstractBaseGraph<N>) n).size());
        }
        Set<N> adjacentNodes = adjacentNodes(n);
        if (allowsSelfLoops() && adjacentNodes.contains(n)) {
            i = 1;
        } else {
            i = 0;
        }
        return IntMath.saturatedAdd(adjacentNodes.size(), i);
    }

    public long edgeCount() {
        Iterator<N> it;
        boolean z;
        long j = 0;
        while (nodes().iterator().hasNext()) {
            j += degree(it.next());
        }
        if ((1 & j) == 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        return j >>> 1;
    }

    @Override // com.google.common.graph.BaseGraph
    public Set<EndpointPair<N>> edges() {
        return new AbstractSet<EndpointPair<N>>() { // from class: com.google.common.graph.AbstractBaseGraph.1
            {
                AbstractBaseGraph.this = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (!(obj instanceof EndpointPair)) {
                    return false;
                }
                EndpointPair<?> endpointPair = (EndpointPair) obj;
                if (!AbstractBaseGraph.this.isOrderingCompatible(endpointPair) || !AbstractBaseGraph.this.nodes().contains(endpointPair.nodeU()) || !AbstractBaseGraph.this.successors((AbstractBaseGraph) endpointPair.nodeU()).contains(endpointPair.nodeV())) {
                    return false;
                }
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return Ints.saturatedCast(AbstractBaseGraph.this.edgeCount());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<EndpointPair<N>> iterator() {
                return EndpointPairIterator.of(AbstractBaseGraph.this);
            }
        };
    }

    @Override // com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(N n, N n2) {
        Preconditions.checkNotNull(n);
        Preconditions.checkNotNull(n2);
        return nodes().contains(n) && successors((AbstractBaseGraph<N>) n).contains(n2);
    }

    @Override // com.google.common.graph.BaseGraph
    public int inDegree(N n) {
        if (isDirected()) {
            return predecessors((AbstractBaseGraph<N>) n).size();
        }
        return degree(n);
    }

    @Override // com.google.common.graph.BaseGraph
    public ElementOrder<N> incidentEdgeOrder() {
        return ElementOrder.unordered();
    }

    @Override // com.google.common.graph.BaseGraph
    public Set<EndpointPair<N>> incidentEdges(N n) {
        Preconditions.checkNotNull(n);
        Preconditions.checkArgument(nodes().contains(n), "Node %s is not an element of this graph.", n);
        return new AnonymousClass2(this, this, n);
    }

    public final boolean isOrderingCompatible(EndpointPair<?> endpointPair) {
        if (!endpointPair.isOrdered() && isDirected()) {
            return false;
        }
        return true;
    }

    @Override // com.google.common.graph.BaseGraph
    public int outDegree(N n) {
        if (isDirected()) {
            return successors((AbstractBaseGraph<N>) n).size();
        }
        return degree(n);
    }

    public final void validateEndpoints(EndpointPair<?> endpointPair) {
        Preconditions.checkNotNull(endpointPair);
        Preconditions.checkArgument(isOrderingCompatible(endpointPair), "Mismatch: unordered endpoints cannot be used with directed graphs");
    }

    @Override // com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
        Preconditions.checkNotNull(endpointPair);
        if (isOrderingCompatible(endpointPair)) {
            N nodeU = endpointPair.nodeU();
            return nodes().contains(nodeU) && successors((AbstractBaseGraph<N>) nodeU).contains(endpointPair.nodeV());
        }
        return false;
    }
}
