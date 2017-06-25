package Visitor;

/**
 * Created by Halil Teker on 6/25/2017.
 */
public interface IVisitable {
    public void accept(IVisitor visitor);
}
