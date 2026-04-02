package rx.internal.util.atomic;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes4.dex */
abstract class b<E> extends AbstractQueue<E> {
    private final AtomicReference<LinkedQueueNode<E>> a = new AtomicReference<>();
    private final AtomicReference<LinkedQueueNode<E>> b = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: protected */
    public final LinkedQueueNode<E> lvProducerNode() {
        return this.a.get();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final LinkedQueueNode<E> lpProducerNode() {
        return this.a.get();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void spProducerNode(LinkedQueueNode<E> linkedQueueNode) {
        this.a.lazySet(linkedQueueNode);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final LinkedQueueNode<E> xchgProducerNode(LinkedQueueNode<E> linkedQueueNode) {
        return this.a.getAndSet(linkedQueueNode);
    }

    protected final LinkedQueueNode<E> lvConsumerNode() {
        return this.b.get();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final LinkedQueueNode<E> lpConsumerNode() {
        return this.b.get();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void spConsumerNode(LinkedQueueNode<E> linkedQueueNode) {
        this.b.lazySet(linkedQueueNode);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        LinkedQueueNode<E> lvNext;
        LinkedQueueNode<E> lvConsumerNode = lvConsumerNode();
        LinkedQueueNode<E> lvProducerNode = lvProducerNode();
        int i = 0;
        while (lvConsumerNode != lvProducerNode && i < Integer.MAX_VALUE) {
            do {
                lvNext = lvConsumerNode.lvNext();
            } while (lvNext == null);
            i++;
            lvConsumerNode = lvNext;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return lvConsumerNode() == lvProducerNode();
    }
}
