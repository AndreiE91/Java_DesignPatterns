package behavioral.interpreter;

class CompositeExpression implements ZombieExpression {
    private ZombieExpression[] expressions;

    public CompositeExpression(ZombieExpression... expressions) {
        this.expressions = expressions;
    }

    @Override
    public void interpret(ZombieContext context) {
        for (ZombieExpression expression : expressions) {
            expression.interpret(context);
        }
    }
}