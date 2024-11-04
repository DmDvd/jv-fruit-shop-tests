package core.basesyntax.operation;

import core.basesyntax.storage.FruitStorage;
import core.basesyntax.transaction.FruitTransaction;

public class ReturnHandler implements OperationHandler {
    private FruitStorage fruitStorage;

    public ReturnHandler(FruitStorage fruitStorage) {
        this.fruitStorage = fruitStorage;
    }

    @Override
    public void apply(FruitTransaction transaction) {
        String fruit = transaction.getFruit();
        int quantity = transaction.getQuantity();
        fruitStorage.addFruits(fruit, quantity);
    }
}