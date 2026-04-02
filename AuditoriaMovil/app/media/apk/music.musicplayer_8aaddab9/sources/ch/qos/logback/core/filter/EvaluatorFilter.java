package ch.qos.logback.core.filter;

import ch.qos.logback.core.boolex.EvaluationException;
import ch.qos.logback.core.boolex.EventEvaluator;
import ch.qos.logback.core.spi.FilterReply;
import e.a.d.a.a;
/* loaded from: classes.dex */
public class EvaluatorFilter<E> extends AbstractMatcherFilter<E> {
    public EventEvaluator<E> evaluator;

    @Override // ch.qos.logback.core.filter.Filter
    public FilterReply decide(E e2) {
        if (isStarted() && this.evaluator.isStarted()) {
            try {
                return this.evaluator.evaluate(e2) ? this.onMatch : this.onMismatch;
            } catch (EvaluationException e3) {
                StringBuilder y = a.y("Evaluator ");
                y.append(this.evaluator.getName());
                y.append(" threw an exception");
                addError(y.toString(), e3);
                return FilterReply.NEUTRAL;
            }
        }
        return FilterReply.NEUTRAL;
    }

    public EventEvaluator<E> getEvaluator() {
        return this.evaluator;
    }

    public void setEvaluator(EventEvaluator<E> eventEvaluator) {
        this.evaluator = eventEvaluator;
    }

    @Override // ch.qos.logback.core.filter.Filter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        if (this.evaluator != null) {
            super.start();
            return;
        }
        StringBuilder y = a.y("No evaluator set for filter ");
        y.append(getName());
        addError(y.toString());
    }
}
